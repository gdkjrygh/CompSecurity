// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.IOUtils;

// Referenced classes of package com.walmart.android.util:
//            VersionUtil

private static class mCallback extends AsyncTask
{

    AssetManager mAssetManager;
    nResult mCallback;

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
        WLog.w(VersionUtil.access$000(), "Failed to load version properties");
        IOUtils.closeQuietly(avoid);
        return null;
        avoid;
        IOUtils.closeQuietly(((java.io.InputStream) (obj)));
        throw avoid;
        WLog.w(VersionUtil.access$000(), "Could not get AssetManager from application resources.");
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
            mCallback.nResult(s);
        }
    }

    public (Context context,  )
    {
        context = context.getResources();
        if (context != null)
        {
            mAssetManager = context.getAssets();
        }
        mCallback = ;
    }
}
