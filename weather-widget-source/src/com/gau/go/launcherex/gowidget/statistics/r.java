// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.a.e;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            q

class r extends AsyncTask
{

    final q a;
    private a b;

    public r(q q1, a a1)
    {
        a = q1;
        super();
        b = a1;
    }

    protected transient String a(Void avoid[])
    {
        Object obj = null;
        avoid = obj;
        if (b != null)
        {
            avoid = obj;
            if (!TextUtils.isEmpty(b.c()))
            {
                avoid = com.gau.go.launcherex.gowidget.statistics.q.a(a, com.gau.go.launcherex.gowidget.statistics.q.a(a), b);
            }
        }
        return avoid;
    }

    protected void a(String s)
    {
        super.onPostExecute(s);
        if (!TextUtils.isEmpty(s))
        {
            e.a(com.gau.go.launcherex.gowidget.statistics.q.a(a)).a(c.a());
            e.a(com.gau.go.launcherex.gowidget.statistics.q.a(a)).a(s);
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
