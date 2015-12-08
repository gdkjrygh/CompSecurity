// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.utils.Base64;
import com.walmartlabs.utils.WLog;
import java.io.File;
import org.apache.commons.io.FileUtils;

// Referenced classes of package com.walmart.android.service.saver:
//            EReceiptImageContentProvider

private static class <init> extends AsyncTask
{

    private final AsyncCallback mCallback;
    private final Context mContext;
    private final File mFile;

    protected transient Boolean doInBackground(String as[])
    {
        boolean flag;
        EReceiptImageContentProvider.access$200(mContext, mFile);
        flag = mFile.exists();
        if (flag || TextUtils.isEmpty(as[0]))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        as = Base64.decode(as[0], 0);
        FileUtils.writeByteArrayToFile(mFile, as);
        return Boolean.valueOf(true);
        as;
        WLog.e(EReceiptImageContentProvider.access$300(), "Could not create image file", as);
        return Boolean.valueOf(flag);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (!boolean1.booleanValue())
        {
            mCallback.onFailure(Integer.valueOf(0x15f91), null);
            return;
        } else
        {
            mCallback.onSuccess(FileProvider.getUriForFile(mContext, "com.walmart.ereceipt", mFile));
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    private (Context context, String s, String s1, AsyncCallback asynccallback)
    {
        mContext = context;
        mFile = EReceiptImageContentProvider.access$100(context, s, s1);
        mCallback = asynccallback;
    }

    mCallback(Context context, String s, String s1, AsyncCallback asynccallback, mCallback mcallback)
    {
        this(context, s, s1, asynccallback);
    }
}
