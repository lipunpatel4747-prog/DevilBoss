package com.ksa.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class VoiceService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Voice service ka background code yahan aayega
        return START_STICKY;
    }
}
