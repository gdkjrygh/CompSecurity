// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.squareup.otto.Bus;
import com.walmart.android.events.AppIndexEvent;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.utils.WLog;

public class AppIndexManager
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    private static final String TAG = com/walmart/android/app/main/AppIndexManager.getSimpleName();
    private GoogleApiClient mClient;
    private boolean mConnected;
    private Object mCurrentSource;
    private Action mEventAction;
    private AppIndexEvent mPendingEvent;

    public AppIndexManager()
    {
    }

    private void startAction(AppIndexEvent appindexevent)
    {
        mEventAction = Action.newAction(appindexevent.actionType, appindexevent.title, appindexevent.webUrl, appindexevent.appUrl);
        WLog.d(TAG, (new StringBuilder()).append("Indexing ").append(appindexevent.title).append(" at ").append(appindexevent.appUrl).append(", action:").append(mEventAction).toString());
        AppIndex.AppIndexApi.start(mClient, mEventAction);
        mPendingEvent = null;
    }

    private void stopAction()
    {
        if (mEventAction != null)
        {
            WLog.d(TAG, (new StringBuilder()).append("Ending app index for action: ").append(mEventAction).toString());
            AppIndex.AppIndexApi.end(mClient, mEventAction);
        }
        mEventAction = null;
    }

    private void updateAction(AppIndexEvent appindexevent)
    {
        stopAction();
        if (mConnected && appindexevent.source == mCurrentSource)
        {
            startAction(appindexevent);
            return;
        } else
        {
            mPendingEvent = appindexevent;
            return;
        }
    }

    public void create(Context context)
    {
        mClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addApi(AppIndex.API).build();
    }

    public void destroy()
    {
        mCurrentSource = null;
        mClient = null;
    }

    public void onAppIndexEvent(AppIndexEvent appindexevent)
    {
        updateAction(appindexevent);
    }

    public void onConnected(Bundle bundle)
    {
        mConnected = true;
        if (mPendingEvent != null)
        {
            updateAction(mPendingEvent);
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        mConnected = false;
    }

    public void onConnectionSuspended(int i)
    {
        mConnected = false;
    }

    public void setCurrentSource(Object obj)
    {
        if (mCurrentSource != obj)
        {
            stopAction();
        }
        mCurrentSource = obj;
        if (mPendingEvent != null && mPendingEvent.source != obj)
        {
            mPendingEvent = null;
        } else
        if (mPendingEvent != null)
        {
            updateAction(mPendingEvent);
            return;
        }
    }

    public void start()
    {
        mClient.registerConnectionCallbacks(this);
        mClient.registerConnectionFailedListener(this);
        mClient.connect();
        MessageBus.getBus().register(this);
    }

    public void stop()
    {
        stopAction();
        mPendingEvent = null;
        mClient.disconnect();
        mClient.unregisterConnectionCallbacks(this);
        mClient.unregisterConnectionFailedListener(this);
        MessageBus.getBus().unregister(this);
    }

}
