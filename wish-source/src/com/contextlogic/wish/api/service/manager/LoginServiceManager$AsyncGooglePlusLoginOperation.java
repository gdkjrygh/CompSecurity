// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import android.os.AsyncTask;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

private class allowStoredSession extends AsyncTask
{

    private boolean allowStoredSession;
    private String googlePlusId;
    final LoginServiceManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        LoginServiceManager.access$1000(LoginServiceManager.this, googlePlusId, allowStoredSession);
        return null;
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

    public a(String s, boolean flag)
    {
        this$0 = LoginServiceManager.this;
        super();
        googlePlusId = s;
        allowStoredSession = flag;
    }
}
