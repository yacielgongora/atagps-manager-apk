package org.atagps.manager;

import android.app.Service;
import android.os.Handler;
import android.os.Looper;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super .onMessageReceived(remoteMessage);
        handleMessage(remoteMessage);
    }

    private void handleMessage (RemoteMessage remoteMessage) {
        //1
        Handler handler = new  Handler(Looper.getMainLooper());
        handler.post(new Runnable(){

                         @Override
                         public void run() {
                         }
                     }
        );
    }
}
