// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import android.os.AsyncTask;
import com.walmart.android.service.JsonMapper;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

private static class mCallback extends AsyncTask
{

    private final  mCallback;
    private final Context mContext;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((doInBackground[])aobj);
    }

    protected transient Void doInBackground(doInBackground adoinbackground[])
    {
        adoinbackground = adoinbackground[0];
        try
        {
            File file = new File(mContext.getCacheDir(), "last_store_result.json");
            WalmartLocationService.access$900().writeValue(file, adoinbackground);
        }
        // Misplaced declaration of an exception variable
        catch (doInBackground adoinbackground[])
        {
            adoinbackground.printStackTrace();
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        mCallback.onStoresSaved();
    }

    public (Context context,  )
    {
        mContext = context;
        mCallback = ;
    }
}
