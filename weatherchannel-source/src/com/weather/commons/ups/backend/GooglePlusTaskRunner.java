// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.weather.util.TwcPreconditions;

// Referenced classes of package com.weather.commons.ups.backend:
//            GooglePlusConnectionManager

public class GooglePlusTaskRunner
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    private final Supplier activitySupplier;
    private final GooglePlusConnectionManager connectionManager;
    private final Runnable task;

    public GooglePlusTaskRunner(Runnable runnable, GooglePlusConnectionManager googleplusconnectionmanager, Supplier supplier)
    {
        TwcPreconditions.checkOnMainThread();
        task = (Runnable)Preconditions.checkNotNull(runnable);
        connectionManager = (GooglePlusConnectionManager)Preconditions.checkNotNull(googleplusconnectionmanager);
        activitySupplier = (Supplier)Preconditions.checkNotNull(supplier);
    }

    public void execute()
    {
        TwcPreconditions.checkOnMainThread();
        if (connectionManager.isConnecting())
        {
            (new Handler()).postDelayed(new Runnable() {

                final GooglePlusTaskRunner this$0;

                public void run()
                {
                    execute();
                }

            
            {
                this$0 = GooglePlusTaskRunner.this;
                super();
            }
            }, 100L);
        } else
        {
            if (connectionManager.isConnected())
            {
                task.run();
                return;
            }
            Activity activity = (Activity)activitySupplier.get();
            if (activity != null)
            {
                connectionManager.initializePlusClient(activity, this, this);
                connectionManager.connect();
                return;
            }
        }
    }

    public void onConnected(Bundle bundle)
    {
        task.run();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Activity activity;
        activity = (Activity)activitySupplier.get();
        if (activity == null || !connectionresult.hasResolution())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        connectionresult.startResolutionForResult(activity, 1);
        return;
        connectionresult;
        connectionManager.connect();
        return;
    }

    public void onConnectionSuspended(int i)
    {
        if (activitySupplier.get() != null)
        {
            connectionManager.connect();
        }
    }
}
