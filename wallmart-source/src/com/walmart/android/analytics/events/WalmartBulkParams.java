// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.walmart.android.app.WalmartApplication;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WalmartBulkParams
{
    public static interface AsyncParamsListener
    {

        public abstract void onReceive(HashMap hashmap);
    }

    private static class GetAdIdAndSendEventTask extends AsyncTask
    {

        private static final String TAG = com/walmart/android/analytics/events/WalmartBulkParams$GetAdIdAndSendEventTask.getSimpleName();

        protected transient com.google.android.gms.ads.identifier.AdvertisingIdClient.Info doInBackground(Context acontext[])
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


        private GetAdIdAndSendEventTask()
        {
        }

    }


    public WalmartBulkParams()
    {
    }

    private static long getInstallDate(Context context)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
    }

    private static int getNoOfColdLaunches(WalmartApplication walmartapplication)
    {
        return walmartapplication.getNoOfLaunches();
    }

    public static Map getParams(WalmartApplication walmartapplication, AsyncParamsListener asyncparamslistener)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("lang", Locale.getDefault().toString());
        hashmap.put("ua", getUserAgentString(walmartapplication));
        hashmap.put("osVer", android.os.Build.VERSION.RELEASE);
        hashmap.put("type", Build.MODEL);
        hashmap.put("counter", Integer.valueOf(getNoOfColdLaunches(walmartapplication)));
        try
        {
            hashmap.put("instDate", Long.valueOf(getInstallDate(walmartapplication)));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        (new GetAdIdAndSendEventTask(hashmap, asyncparamslistener) {

            final AsyncParamsListener val$asyncParamsListener;
            final HashMap val$map;

            protected void onPostExecute(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
            {
                if (info != null)
                {
                    map.put("advertisingId", info.getId());
                    HashMap hashmap1 = map;
                    boolean flag;
                    if (!info.isLimitAdTrackingEnabled())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    hashmap1.put("aie", Boolean.valueOf(flag));
                    asyncParamsListener.onReceive(map);
                }
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info)obj);
            }

            
            {
                map = hashmap;
                asyncParamsListener = asyncparamslistener;
                super();
            }
        }).execute(new Context[] {
            walmartapplication
        });
        return hashmap;
    }

    private static String getUserAgentString(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }
}
