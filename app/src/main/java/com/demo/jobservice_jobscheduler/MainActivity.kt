package com.demo.jobservice_jobscheduler

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MyJobService"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startJob()
    }

    private fun startJob(){
        val jobScheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler
        val jobInfo = JobInfo.Builder(101,ComponentName(this, MyJobService::class.java)).apply {
            setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
            setPeriodic(15*6*1000)
            /*setRequiresCharging(false)*/
        }.build()
        val isJobStarted = jobScheduler.schedule(jobInfo)
        Log.e(TAG,"is Job started: $isJobStarted")
    }
}