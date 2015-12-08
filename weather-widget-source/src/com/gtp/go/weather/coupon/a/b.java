// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.a;

import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.coupon.a:
//            a

class b extends AsyncTask
{

    ArrayList a;
    final a b;

    public b(a a1, ArrayList arraylist)
    {
        b = a1;
        super();
        a = arraylist;
    }

    protected transient Object doInBackground(Object aobj[])
    {
        Long long1;
        for (aobj = a.iterator(); ((Iterator) (aobj)).hasNext(); com.gtp.go.weather.coupon.a.a.a(b).getContentResolver().delete(WeatherContentProvider.D, "coupon_id=?", new String[] {
    String.valueOf(long1)
}))
        {
            long1 = (Long)((Iterator) (aobj)).next();
        }

        return null;
    }
}
