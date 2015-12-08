// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import android.os.AsyncTask;
import com.sessionm.a.a;

// Referenced classes of package com.sessionm.core:
//            Session

private class <init> extends AsyncTask
{

    final Session dU;

    protected transient String a(Context acontext[])
    {
        com.sessionm.a.a.r(dU.getApplicationContext());
        if (dU.getSessionState() == com.sessionm.api.tate.STARTED_ONLINE || dU.getSessionState() == com.sessionm.api.tate.STARTED_OFFLINE)
        {
            dU.an();
        }
        return "";
    }

    protected transient void a(Integer ainteger[])
    {
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Context[])aobj);
    }

    protected void o(String s)
    {
        Session.cI = false;
    }

    protected void onPostExecute(Object obj)
    {
        o((String)obj);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((Integer[])aobj);
    }

    private ate(Session session)
    {
        dU = session;
        super();
    }

    dU(Session session, dU du)
    {
        this(session);
    }
}
