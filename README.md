### Job Service
This is a demo app on how to implement IntentService.

### JobService key points.

* JobService is a class in the Android SDK that allows you to schedule background tasks that can be executed even when your app is not currently running. Here's an overview of JobService in Android
* JobService is designed to execute tasks in the background, such as downloading data, syncing content, or performing periodic updates. JobService can run even if the app is not currently in the foreground, background or killed and it can continue to run even if the device is in a low-power state.
* Once you've created your JobService subclass, you can schedule jobs using the JobScheduler class. JobScheduler allows you to schedule jobs based on a variety of conditions, such as when the device is idle, when it's connected to a power source, or when a certain amount of time has passed since the last job.

### StopJob()

* The boolean value returned by onStopJob() indicates whether the system should reschedule the job or not. If you return true, the system will reschedule the job according to the backoff criteria that you've specified. If you return false, the system will assume that the job has finished and will not attempt to reschedule it.

### StartJob()

* If you return "true" from onStartJob(), it means that there is more work to be done and the system should keep the job running in the background. On the other hand, if you return "false", it means that there is no more work to be done and the system can consider the job complete.

### JobScheduler 

* With JobScheduler, you can specify conditions that must be met before your job is executed, such as when the device is idle or when it is connected to a power source. You can also specify how often the job should be executed and how much time it can run before it is considered to have timed out.
* To use JobScheduler, you first create a JobInfo object that specifies the details of the job you want to schedule. You then pass this object to the JobScheduler service to schedule the job.
* Once a job is scheduled, the system will execute it when the conditions you specified are met. When the job is finished, the system will notify your app, and you can perform any necessary cleanup or processing.







