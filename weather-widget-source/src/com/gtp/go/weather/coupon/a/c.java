// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.a;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.go.weather.coupon.b.b;

// Referenced classes of package com.gtp.go.weather.coupon.a:
//            a

class c extends AsyncTask
{

    final a a;
    private b b;

    public c(a a1, b b1)
    {
        a = a1;
        super();
        b = b1;
    }

    protected transient Object doInBackground(Object aobj[])
    {
        aobj = new ContentValues();
        ((ContentValues) (aobj)).put("coupon_id", Long.valueOf(b.b()));
        ((ContentValues) (aobj)).put("source_coupon_id", Long.valueOf(b.c()));
        ((ContentValues) (aobj)).put("title", b.d());
        ((ContentValues) (aobj)).put("desc", b.e());
        ((ContentValues) (aobj)).put("shop_name", b.m());
        ((ContentValues) (aobj)).put("coupon_type", Integer.valueOf(b.f()));
        ((ContentValues) (aobj)).put("exp_time", b.g());
        ((ContentValues) (aobj)).put("code", b.h());
        ((ContentValues) (aobj)).put("logo_url", b.i());
        ((ContentValues) (aobj)).put("logo_path", b.j());
        com.gtp.go.weather.coupon.a.a.a(a).getContentResolver().insert(WeatherContentProvider.D, ((ContentValues) (aobj)));
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        super.onPostExecute(obj);
    }
}
