package com.abc.app;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class VoiceService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
