// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.os.AsyncTask;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            m, p, n

class o extends AsyncTask
{

    final m a;

    private o(m m1)
    {
        a = m1;
        super();
    }

    o(m m1, n n)
    {
        this(m1);
    }

    protected transient Boolean a(Void avoid[])
    {
        avoid = new ArrayList();
        m.a(a, avoid);
        return Boolean.valueOf(m.b(a, avoid));
    }

    protected void a(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            m.b(a);
            (new p(a, null)).execute(new Void[0]);
            return;
        } else
        {
            m.a(a, null);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        m.a(a).clear();
    }
}
