package com.akexorcist.myapplication;

import android.os.AsyncTask;
import android.widget.ProgressBar;

/**
 * Created by Akexorcist on 1/5/2016 AD.
 */
public class FakeLoadingTask extends AsyncTask<Void, Integer, Void> {
    ProgressBar pbLoading;
    int count;
    int position;

    public FakeLoadingTask(ProgressBar pbLoading, int position) {
        this.pbLoading = pbLoading;
        this.count = 0;
        this.position = position;
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            for(int i = 0 ; i <= 100 ; i++) {
                Thread.sleep(50);
                publishProgress(i);
            }
        } catch (InterruptedException e) {
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        pbLoading.setProgress(values[0]);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
