// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;

// Referenced classes of package com.whatsapp:
//            mk, Conversation, og, ax, 
//            App

class rb extends AsyncTask
{

    private Handler a;
    private Runnable b;
    private String c;
    final Conversation d;
    private long e;
    private boolean f;

    public rb(Conversation conversation, String s, boolean flag)
    {
        d = conversation;
        super();
        c = s;
        f = flag;
        e = SystemClock.uptimeMillis();
    }

    static String a(rb rb1)
    {
        return rb1.c;
    }

    protected String a(Void avoid[])
    {
        return mk.b(c);
    }

    protected void a()
    {
        super.cancel(false);
        if (a != null)
        {
            a.removeCallbacks(b);
        }
        a = null;
        b = null;
    }

    protected void a(String s)
    {
label0:
        {
            if (!c.equals(d.aD.a))
            {
                break label0;
            }
            Conversation.c(d, s);
            a = new Handler();
            b = new ax(this);
            if (f)
            {
                a.postAtTime(b, e + 3000L);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b.run();
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }
}
