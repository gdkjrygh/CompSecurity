// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import android.os.AsyncTask;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

private class password extends AsyncTask
{

    private String password;
    final LoginServiceManager this$0;
    private String username;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        LoginServiceManager.access$1200(LoginServiceManager.this, username, password);
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

    public (String s, String s1)
    {
        this$0 = LoginServiceManager.this;
        super();
        username = s;
        password = s1;
    }
}
