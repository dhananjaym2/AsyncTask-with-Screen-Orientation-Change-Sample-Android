package asynctask.with.screen.orientation.change.sample.android

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Starting SampleAsyncTask", Snackbar.LENGTH_LONG)
                    .setAction(android.R.string.ok, null).show()

            startAsyncTask()
        }
    }

    private fun startAsyncTask() {

        SampleAsyncTask().execute()
    }
}