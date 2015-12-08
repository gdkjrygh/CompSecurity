// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.Context;
import android.os.AsyncTask;
import com.gtp.go.weather.sharephoto.b.a.b;
import com.gtp.go.weather.sharephoto.b.d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            k

class q extends AsyncTask
{

    private WeakReference a;
    private Context b;

    q(k k1)
    {
        b = com.gtp.go.weather.sharephoto.award.k.d(k1);
        a = new WeakReference(k1);
    }

    protected transient List a(List alist[])
    {
        alist = alist[0];
        Iterator iterator = alist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            d d1 = (d)iterator.next();
            if (d1.j() == 1 || d1.j() == 2)
            {
                long l = d1.h();
                long l1 = d1.a();
                List list = com.gtp.go.weather.sharephoto.b.a.b.a(b, null, "award_id=? and user_award_id=?", new String[] {
                    String.valueOf(l), String.valueOf(l1)
                });
                if (list.size() > 0)
                {
                    d1.a((com.gtp.go.weather.sharephoto.b.b)list.get(0));
                }
            }
        } while (true);
        return alist;
    }

    protected void a(List list)
    {
        k k1 = (k)a.get();
        if (k1 == null)
        {
            return;
        } else
        {
            k.c(k1, list);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((List[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }
}
