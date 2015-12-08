// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.os.AsyncTask;
import android.view.View;
import com.gtp.go.weather.sharephoto.b.a.d;
import com.gtp.go.weather.sharephoto.b.e;
import com.gtp.go.weather.sharephoto.c.l;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            i, j

class k extends AsyncTask
{

    final i a;

    private k(i j)
    {
        a = j;
        super();
    }

    k(i j, j j1)
    {
        this(j);
    }

    protected transient List a(Void avoid[])
    {
        return d.a(i.a(a));
    }

    protected void a(List list)
    {
        list = list.iterator();
_L4:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        e e1 = (e)list.next();
        if (e1.k() || l.a(Long.valueOf(e1.f()))) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (flag)
        {
            i.b(a).setVisibility(0);
        } else
        {
            i.b(a).setVisibility(4);
        }
        i.a(a, null);
        return;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }
}
