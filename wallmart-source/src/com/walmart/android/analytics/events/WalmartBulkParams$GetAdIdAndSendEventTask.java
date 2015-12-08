// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.walmartlabs.utils.WLog;
import java.io.IOException;

// Referenced classes of package com.walmart.android.analytics.events:
//            WalmartBulkParams

private static class <init> extends AsyncTask
{

    private static final String TAG = com/walmart/android/analytics/events/WalmartBulkParams$GetAdIdAndSendEventTask.getSimpleName();

    protected transient com.google.android.gms.ads.identifier.init> doInBackground(Context acontext[])
    {
        acontext = AdvertisingIdClient.getAdvertisingIdInfo(acontext[0]);
        return acontext;
        acontext;
        WLog.w(TAG, (new StringBuilder()).append("Failed connecting to Google Play services").append(acontext.getMessage()).toString());
_L2:
        return null;
        acontext;
_L3:
        WLog.w(TAG, (new StringBuilder()).append("Google Play services not available: ").append(acontext.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
        acontext;
          goto _L3
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Context[])aobj);
    }


    private ()
    {
    }

    ( )
    {
        this();
    }
}
