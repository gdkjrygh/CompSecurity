// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.content.FileProvider;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.ereceipt.service.EReceiptService;
import com.walmartlabs.utils.WLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

// Referenced classes of package com.walmart.android.service.saver:
//            EReceiptImageContentProvider

private static class mCallback extends AsyncTask
{

    private final AsyncCallback mCallback;
    private final Context mContext;
    private final File mFile;
    private volatile boolean mFileExists;
    private final String mRuid;

    protected transient FileOutputStream doInBackground(Void avoid[])
    {
        EReceiptImageContentProvider.access$200(mContext, mFile);
        mFileExists = mFile.exists();
        if (mFileExists)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        avoid = FileUtils.openOutputStream(mFile);
        return avoid;
        avoid;
        WLog.e(EReceiptImageContentProvider.access$300(), "Could not create image file", avoid);
        return null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(final FileOutputStream fout)
    {
        if (!mFileExists && fout != null)
        {
            Services.get().getEReceiptService().writeImageStream(mRuid, fout, new AsyncCallback() {

                final EReceiptImageContentProvider.DownloadTask this$0;
                final FileOutputStream val$fout;

                public int getID()
                {
                    return 0;
                }

                public void onCancelled()
                {
                    IOUtils.closeQuietly(fout);
                    mCallback.onCancelled();
                }

                public void onFailure(Integer integer, Void void1)
                {
                    IOUtils.closeQuietly(fout);
                    mCallback.onFailure(integer, null);
                }

                public volatile void onFailure(Object obj, Object obj1)
                {
                    onFailure((Integer)obj, (Void)obj1);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Void)obj);
                }

                public void onSuccess(Void void1)
                {
                    IOUtils.closeQuietly(fout);
                    mCallback.onSuccess(FileProvider.getUriForFile(mContext, "com.walmart.ereceipt", mFile));
                }

                public void setID(int i)
                {
                }

            
            {
                this$0 = EReceiptImageContentProvider.DownloadTask.this;
                fout = fileoutputstream;
                super();
            }
            });
            return;
        }
        if (!mFileExists)
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
        onPostExecute((FileOutputStream)obj);
    }




    _cls1.val.fout(Context context, String s, String s1, AsyncCallback asynccallback)
    {
        mContext = context;
        mRuid = s;
        mFile = EReceiptImageContentProvider.access$100(context, s, s1);
        mCallback = asynccallback;
    }
}
