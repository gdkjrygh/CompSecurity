// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.a;

import android.os.AsyncTask;
import com.gtp.go.weather.coupon.b.b;
import com.gtp.go.weather.coupon.c.a;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.coupon.a:
//            e, a, h, f

class k extends AsyncTask
{

    final e a;

    private k(e e1)
    {
        a = e1;
        super();
    }

    k(e e1, f f)
    {
        this(e1);
    }

    protected transient ArrayList a(Object aobj[])
    {
        aobj = com.gtp.go.weather.coupon.a.e.a(com.gtp.go.weather.coupon.a.e.a(a), new String[] {
            "coupon_id", "source_coupon_id", "title", "desc", "coupon_type", "exp_time", "code", "logo_url", "logo_path", "shop_name"
        }, null, null);
        ArrayList arraylist = com.gtp.go.weather.coupon.a.a.a(com.gtp.go.weather.coupon.a.e.a(a), new String[] {
            "coupon_id"
        }, null, null);
        ArrayList arraylist1 = new ArrayList();
        Iterator iterator1 = ((ArrayList) (aobj)).iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            b b1 = (b)iterator1.next();
            Iterator iterator2 = arraylist.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    break;
                }
                b b2 = (b)iterator2.next();
                if (b1.b() != b2.b())
                {
                    continue;
                }
                b1.c(true);
                break;
            } while (true);
            if (com.gtp.go.weather.coupon.c.a.c(b1.g()))
            {
                arraylist1.add(b1);
            }
        } while (true);
        for (Iterator iterator = arraylist1.iterator(); iterator.hasNext(); ((ArrayList) (aobj)).remove((b)iterator.next())) { }
        return ((ArrayList) (aobj));
    }

    protected void a(ArrayList arraylist)
    {
        super.onPostExecute(arraylist);
        if (com.gtp.go.weather.coupon.a.e.b(a) != null)
        {
            com.gtp.go.weather.coupon.a.e.b(a).a(arraylist);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }
}
