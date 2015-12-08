// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import java.util.ArrayDeque;
import java.util.Queue;

public abstract class MainThreadIntentService extends Service
{
    private class IntentRunner
        implements Runnable
    {

        private final Intent mIntent;
        final MainThreadIntentService this$0;

        public void run()
        {
            if (onHandleIntent(mIntent))
            {
                intentHandled(mIntent);
            }
        }

        public IntentRunner(Intent intent)
        {
            this$0 = MainThreadIntentService.this;
            super();
            mIntent = intent;
        }
    }


    private Handler mHandler;
    private boolean mIntentInProgress;
    private Queue mIntentQueue;

    public MainThreadIntentService()
    {
    }

    private void postNextIntent()
    {
label0:
        {
            if (!mIntentInProgress)
            {
                Runnable runnable = (Runnable)mIntentQueue.poll();
                if (runnable == null)
                {
                    break label0;
                }
                mIntentInProgress = true;
                mHandler.post(runnable);
            }
            return;
        }
        stopSelf();
    }

    protected void intentHandled(Intent intent)
    {
        mIntentInProgress = false;
        postNextIntent();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        mHandler = new Handler();
        mIntentQueue = new ArrayDeque();
    }

    protected abstract boolean onHandleIntent(Intent intent);

    public void onStart(Intent intent, int i)
    {
        mIntentQueue.add(new IntentRunner(intent));
        postNextIntent();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        onStart(intent, j);
        return 2;
    }
}
