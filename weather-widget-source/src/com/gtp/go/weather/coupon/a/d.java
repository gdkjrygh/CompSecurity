// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.a;

import android.os.AsyncTask;
import com.gtp.go.weather.coupon.a;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.coupon.a:
//            a

class d extends AsyncTask
{

    final com.gtp.go.weather.coupon.a.a a;
    private a b;

    public d(com.gtp.go.weather.coupon.a.a a1, a a2)
    {
        a = a1;
        super();
        b = a2;
    }

    protected transient ArrayList a(Object aobj[])
    {
        return com.gtp.go.weather.coupon.a.a.a(com.gtp.go.weather.coupon.a.a.a(a), new String[] {
            "coupon_id", "source_coupon_id", "title", "desc", "shop_name", "coupon_type", "exp_time", "code", "logo_url", "logo_path"
        }, null, null);
    }

    protected void a(ArrayList arraylist)
    {
        super.onPostExecute(arraylist);
        if (b != null)
        {
            b.a(com.gtp.go.weather.coupon.a.a.a(a, arraylist));
            b = null;
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
