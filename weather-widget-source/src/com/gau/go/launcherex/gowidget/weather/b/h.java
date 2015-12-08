// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.gcm.b;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.setting.i;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            f

class h extends AsyncTask
{

    final com.gau.go.launcherex.gowidget.weather.b.f a;
    private CityBean b;
    private String c;

    h(com.gau.go.launcherex.gowidget.weather.b.f f1)
    {
        a = f1;
        super();
    }

    private int a(CityBean citybean, WeatherBean weatherbean)
    {
        ArrayList arraylist;
        int j;
        boolean flag;
        int k;
        j = 1;
        k = 1;
        flag = true;
        arraylist = new ArrayList();
        if (weatherbean == null) goto _L2; else goto _L1
_L1:
        k = weatherbean.e();
        if (weatherbean.c().equals(citybean.a())) goto _L4; else goto _L3
_L3:
        if (k != 2) goto _L6; else goto _L5
_L5:
        if (f.a(com.gau.go.launcherex.gowidget.weather.b.f.b(a)).a(citybean.a()) != null)
        {
            arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.a).withSelection((new StringBuilder()).append("cityId='").append(weatherbean.c()).append("'").toString(), null).build());
            arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.b).withSelection((new StringBuilder()).append("cityId='").append(weatherbean.c()).append("'").toString(), null).build());
            arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.e).withSelection((new StringBuilder()).append("cityId='").append(weatherbean.c()).append("'").toString(), null).build());
            arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.f).withSelection((new StringBuilder()).append("cityId='").append(weatherbean.c()).append("'").toString(), null).build());
            weatherbean = new ContentValues();
            weatherbean.put("city_my_location", Integer.valueOf(3));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(weatherbean).withSelection("cityId=?", new String[] {
                citybean.a()
            }).build());
            j = ((flag) ? 1 : 0);
        } else
        {
            ContentValues contentvalues = f.a(a, citybean, 2, false);
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(contentvalues).withSelection("cityId=?", new String[] {
                weatherbean.c()
            }).build());
            arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.b).withSelection((new StringBuilder()).append("cityId='").append(weatherbean.c()).append("'").toString(), null).build());
            arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.e).withSelection((new StringBuilder()).append("cityId='").append(weatherbean.c()).append("'").toString(), null).build());
            arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.f).withSelection((new StringBuilder()).append("cityId='").append(weatherbean.c()).append("'").toString(), null).build());
            j = ((flag) ? 1 : 0);
        }
_L11:
        f.a(a, arraylist, citybean.a());
_L4:
        com.gau.go.launcherex.gowidget.weather.b.f.b(a).getContentResolver().applyBatch("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
        return j;
_L6:
        j = ((flag) ? 1 : 0);
        if (k == 3)
        {
            ContentValues contentvalues1 = new ContentValues();
            contentvalues1.put("city_my_location", Integer.valueOf(1));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(contentvalues1).withSelection("cityId=?", new String[] {
                weatherbean.c()
            }).build());
            contentvalues1.clear();
            if (f.a(com.gau.go.launcherex.gowidget.weather.b.f.b(a)).a(citybean.a()) != null)
            {
                contentvalues1.put("city_my_location", Integer.valueOf(3));
                arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(contentvalues1).withSelection("cityId=?", new String[] {
                    citybean.a()
                }).build());
                j = 2;
            } else
            {
                weatherbean = f.a(a, citybean, 2, true);
                arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.a).withValues(weatherbean).build());
                j = ((flag) ? 1 : 0);
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        weatherbean = f.a(com.gau.go.launcherex.gowidget.weather.b.f.b(a)).a(citybean.a());
        if (weatherbean != null)
        {
            break; /* Loop/switch isn't completed */
        }
        weatherbean = f.a(a, citybean, 2, true);
        arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.a).withValues(weatherbean).build());
        j = k;
_L8:
        f.a(a, arraylist, citybean.a());
        if (true) goto _L4; else goto _L7
_L7:
        j = k;
        if (weatherbean.e() == 1)
        {
            weatherbean = new ContentValues();
            weatherbean.put("city_my_location", Integer.valueOf(3));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(weatherbean).withSelection("cityId=?", new String[] {
                citybean.a()
            }).build());
            j = 2;
        }
          goto _L8
        if (true) goto _L4; else goto _L9
_L9:
        citybean;
        citybean.printStackTrace();
        return 0;
        citybean;
        citybean.printStackTrace();
        return 0;
        citybean;
        citybean.printStackTrace();
        return 0;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected transient Integer a(Object aobj[])
    {
        b = (CityBean)aobj[0];
        aobj = (WeatherBean)aobj[1];
        if (aobj != null)
        {
            c = ((WeatherBean) (aobj)).c();
        }
        return Integer.valueOf(a(b, ((WeatherBean) (aobj))));
    }

    protected void a(Integer integer)
    {
        f f1;
        f1 = f.a(com.gau.go.launcherex.gowidget.weather.b.f.b(a));
        f1.a(b);
        if (integer.intValue() != 1) goto _L2; else goto _L1
_L1:
        f.a(a, 4, b, 2, c);
_L4:
        integer = com.gau.go.launcherex.gowidget.gcm.b.a(com.gau.go.launcherex.gowidget.weather.b.f.b(a));
        if (!TextUtils.isEmpty(c))
        {
            integer.a(c);
        }
        String s = b.a();
        integer.b(s);
        f.d(a).a(b);
        f1.a(s, b.b(), 0L);
        f.a(a, false);
        return;
_L2:
        if (integer.intValue() == 2)
        {
            f.a(a, 4, b, 3, c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }
}
