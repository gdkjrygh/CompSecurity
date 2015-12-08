// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.location.Location;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import java.util.HashMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            q, m, n

class p extends AsyncTask
{

    final m a;

    private p(m m1)
    {
        a = m1;
        super();
    }

    p(m m1, n n)
    {
        this(m1);
    }

    protected transient q a(Location alocation[])
    {
        Object obj = alocation[0];
        alocation = new q();
        q.a(alocation, ((Location) (obj)));
        q.a(alocation, m.b(a, ((Location) (obj))));
        String s1 = m.a(a, m.c(a), ((Location) (obj)), "en");
        if (!TextUtils.isEmpty(s1))
        {
            q.b(alocation).put("en", s1);
        }
        String s = w.k(m.c(a));
        if (!TextUtils.isEmpty(s1))
        {
            obj = m.a(a, m.c(a), ((Location) (obj)), s);
            q.b(alocation).put(s, obj);
        }
        return alocation;
    }

    protected void a(q q1)
    {
        m.a(a, SystemClock.elapsedRealtime());
        m.a(a, q1);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Location[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((q)obj);
    }
}
