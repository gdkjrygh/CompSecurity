// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import android.os.AsyncTask;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.google.android.gms.auth.GoogleAuthUtil;

// Referenced classes of package com.contextlogic.wish.api.service:
//            AssociateGooglePlusAccountService

private class failureCallback extends AsyncTask
{

    private onProgressUpdate failureCallback;
    private String googlePlusId;
    private onProgressUpdate successCallback;
    final AssociateGooglePlusAccountService this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        avoid = null;
        String s = GoogleAuthUtil.getToken(WishApplication.getAppInstance(), GooglePlusManager.getInstance().getAccountName(), GooglePlusManager.getInstance().getScopeString());
        avoid = s;
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.n, com.contextlogic.wish.analytics.n, com.contextlogic.wish.analytics.n);
        avoid = s;
_L6:
        if (isCancelled())
        {
            return null;
        }
        if (avoid == null) goto _L2; else goto _L1
_L1:
        requestService(googlePlusId, avoid, GooglePlusManager.getInstance().getAccountName(), successCallback, failureCallback);
_L4:
        AssociateGooglePlusAccountService.access$102(AssociateGooglePlusAccountService.this, null);
        return null;
_L2:
        if (failureCallback != null)
        {
            failureCallback.ailed(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        throwable;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
    }

    protected void onPreExecute()
    {
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Void[])aobj);
    }

    protected transient void onProgressUpdate(Void avoid[])
    {
    }

    public (String s,  ,  1)
    {
        this$0 = AssociateGooglePlusAccountService.this;
        super();
        googlePlusId = s;
        successCallback = ;
        failureCallback = 1;
    }
}
