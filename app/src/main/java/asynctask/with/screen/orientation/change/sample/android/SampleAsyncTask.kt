package asynctask.with.screen.orientation.change.sample.android

import android.os.AsyncTask
import android.util.Log

class SampleAsyncTask/*(mContext: Context)*/ : AsyncTask<Void, Void, String>() {

    val logTag = SampleAsyncTask::class.java.simpleName
    /*context: Context = mCo
    init {
        context
    }*/
    override fun onPreExecute() {
        super.onPreExecute()
        Log.v(logTag, "onPreExecute()")
    }

    override fun doInBackground(vararg params: Void?): String {
        Thread.sleep(10_000)
        return "doInBackground() returns"
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        Log.v(logTag, "onPostExecute() result:$result")
    }
}