// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.AsyncTask;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverProvider, StatusResponse

private class mNotificationShown extends AsyncTask
{

    private final AsyncCallbackOnThread mCallback;
    private final StatusResponse mData;
    private final Integer mError;
    private final boolean mNotificationShown;
    private final boolean mSubmitConfirmed;
    private final String mTcNbr;
    private final String mVisitDate;
    final SaverManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((s[])aobj);
    }

    protected transient Void doInBackground(s as[])
    {
        SaverManager.access$600(SaverManager.this).decorateEReceipt(mTcNbr, mVisitDate, false, mSubmitConfirmed, mNotificationShown, as[0]);
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
label0:
        {
            if (mCallback != null)
            {
                if (mError == null)
                {
                    break label0;
                }
                mCallback.onFailure(mError, mData);
            }
            return;
        }
        mCallback.onSuccess(mData);
    }

    public s(AsyncCallbackOnThread asynccallbackonthread, Integer integer, StatusResponse statusresponse, String s, String s1, boolean flag, 
            boolean flag1)
    {
        this$0 = SaverManager.this;
        super();
        mCallback = asynccallbackonthread;
        mError = integer;
        mData = statusresponse;
        mTcNbr = s;
        mVisitDate = s1;
        mSubmitConfirmed = flag;
        mNotificationShown = flag1;
    }
}
