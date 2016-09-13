package com.vpooc.download;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by ChenYao on 2016/9/4.
 */
public class DownloadService extends Service {

    private FileInfo fileInfo;
    public static final String ACTION_START = "ACTION_START";
    public static final String ACTION_STOP = "ACTION_STOP";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        fileInfo = (FileInfo) intent.getSerializableExtra("fileInfo");
        if (ACTION_START.equals(intent.getAction())) {

        }else if (ACTION_STOP.equals(intent.getAction())) {

        }
        Log.d("--fileInfo", fileInfo.toString());



        return super.onStartCommand(intent, flags, startId);
    }


    class DownloadThrena extends Thread {



    }
}
