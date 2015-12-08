// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import com.walmart.android.data.AppConfig;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.IOUtils;

public class VersionUtil
{
    private static class CommitIdAsyncTask extends AsyncTask
    {

        AssetManager mAssetManager;
        CommitIdCallback mCallback;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient String doInBackground(Void avoid[])
        {
            Object obj;
            if (mAssetManager == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            obj = null;
            avoid = null;
            java.io.InputStream inputstream = mAssetManager.open("version.properties");
            avoid = inputstream;
            obj = inputstream;
            Object obj1 = new Properties();
            avoid = inputstream;
            obj = inputstream;
            ((Properties) (obj1)).load(inputstream);
            avoid = inputstream;
            obj = inputstream;
            obj1 = ((Properties) (obj1)).getProperty("commitId");
            IOUtils.closeQuietly(inputstream);
            return ((String) (obj1));
            obj;
            obj = avoid;
            WLog.w(VersionUtil.TAG, "Failed to load version properties");
            IOUtils.closeQuietly(avoid);
            return null;
            avoid;
            IOUtils.closeQuietly(((java.io.InputStream) (obj)));
            throw avoid;
            WLog.w(VersionUtil.TAG, "Could not get AssetManager from application resources.");
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            if (mCallback != null)
            {
                mCallback.onResult(s);
            }
        }

        public CommitIdAsyncTask(Context context, CommitIdCallback commitidcallback)
        {
            context = context.getResources();
            if (context != null)
            {
                mAssetManager = context.getAssets();
            }
            mCallback = commitidcallback;
        }
    }

    public static interface CommitIdCallback
    {

        public abstract void onResult(String s);
    }


    public static final int MUST_UPGRADE_VERSION = 2;
    public static final int NEWER_VERSION_AVAILABLE = 3;
    public static final int NEWEST_VERSION = 4;
    public static final int NOT_UPGRADEABLE_VERSION = 1;
    private static final String TAG = com/walmart/android/util/VersionUtil.getSimpleName();
    public static final int UNSUPPORTED_VERSION = 0;

    public VersionUtil()
    {
    }

    public static void getCommitId(Context context, CommitIdCallback commitidcallback)
    {
        (new CommitIdAsyncTask(context, commitidcallback)).execute(new Void[0]);
    }

    public static int getVersionInfo(Context context, AppConfig appconfig)
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        byte byte0;
        int i;
        int j;
        int k;
        int l;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            i = 0;
        }
        try
        {
            j = Integer.valueOf(appconfig.merchData.version).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            j = 0;
        }
        try
        {
            k = Integer.valueOf(appconfig.minVersion).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            k = 0;
        }
        try
        {
            l = Integer.valueOf(appconfig.minSdkVersion).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            l = 0;
        }
        if (i1 >= l)
        {
            if (i < k)
            {
                byte0 = 2;
            } else
            if (i < j)
            {
                byte0 = 3;
            } else
            {
                byte0 = 4;
            }
        } else
        if (i >= k)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        WLog.d(TAG, (new StringBuilder()).append("This app version: ").append(i).toString());
        WLog.d(TAG, (new StringBuilder()).append("Newest app version: ").append(j).toString());
        WLog.d(TAG, (new StringBuilder()).append("Oldest supported version: ").append(k).toString());
        WLog.d(TAG, (new StringBuilder()).append("Device SDK level: ").append(i1).toString());
        WLog.d(TAG, (new StringBuilder()).append("Oldest supported SDK level: ").append(l).toString());
        WLog.d(TAG, (new StringBuilder()).append("Version information: ").append(byte0).toString());
        return byte0;
    }

    public static boolean isUpdateAvailable(Context context, AppConfig appconfig)
    {
        if (appconfig == null || appconfig.merchData == null || appconfig.merchData.version == null)
        {
            return false;
        }
        switch (getVersionInfo(context, appconfig))
        {
        default:
            return false;

        case 2: // '\002'
        case 3: // '\003'
            return true;
        }
    }


}
