package com.demo.jobservice_jobscheduler

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log
import com.demo.jobservice_jobscheduler.MainActivity.Companion.TAG
import java.util.*

class MyJobService : JobService() {
    private var randomNumber:Int? =null
    override fun onStartJob(params: JobParameters?): Boolean {
        Log.e(TAG,"onStartJob() called")
        for (i in 1..100){
            Thread.sleep(500)
            randomNumber = Random().nextInt(10000)
            Log.e(TAG, "RandomNumber: $randomNumber")
        }
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        Log.e(TAG,"onStopJob() called")
        return true
    }
}