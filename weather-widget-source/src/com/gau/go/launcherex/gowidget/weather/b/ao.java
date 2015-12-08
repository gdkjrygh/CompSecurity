// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.jiubang.goweather.a.a;
import com.jiubang.goweather.a.b;
import com.jiubang.goweather.a.c;
import com.jiubang.goweather.a.d;
import com.jiubang.goweather.a.e;
import com.jiubang.goweather.a.f;
import com.jiubang.goweather.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            an, ak, am

class ao extends AsyncTask
{

    final ak a;

    ao(ak ak1)
    {
        a = ak1;
        super();
    }

    private an a(an an1, ContentResolver contentresolver)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = com.gau.go.launcherex.gowidget.weather.b.an.a(an1);
        int j = arraylist1.size();
        int i = 0;
        while (i < j) 
        {
            a a1 = (a)arraylist1.get(i);
            if (a1.a != 1)
            {
                continue;
            }
            Iterator iterator = com.gau.go.launcherex.gowidget.weather.b.an.e(an1).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                RequestBean requestbean = (RequestBean)iterator.next();
                if (requestbean == null || requestbean.a == null || !requestbean.a.equals(a1.c))
                {
                    continue;
                }
                a(a1, requestbean.a, arraylist);
                a(requestbean.a, arraylist);
                b(a1, arraylist);
                a(a1, arraylist);
                b(a1, arraylist, contentresolver);
                a(a1, arraylist, contentresolver);
                break;
            } while (true);
            if (arraylist.size() > 0)
            {
                try
                {
                    contentresolver.applyBatch("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
                }
                catch (RemoteException remoteexception)
                {
                    remoteexception.printStackTrace();
                }
                catch (OperationApplicationException operationapplicationexception)
                {
                    operationapplicationexception.printStackTrace();
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    illegalargumentexception.printStackTrace();
                }
                arraylist.clear();
            }
            i++;
        }
        return an1;
    }

    private void a(a a1, String s, ArrayList arraylist)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("cityName", a1.d());
        Object obj = a1.b();
        if (obj != null && ((String) (obj)).length() > 0)
        {
            contentvalues.put("state", ((String) (obj)));
        }
        obj = a1.c();
        if (obj != null && ((String) (obj)).length() > 0)
        {
            contentvalues.put("country", ((String) (obj)));
        }
        contentvalues.put("cityId", a1.e());
        contentvalues.put("updateTime", Long.valueOf(a1.n()));
        contentvalues.put("tz_offset", Integer.valueOf(a1.u()));
        contentvalues.put("latitude", Float.valueOf(a1.f()));
        contentvalues.put("longitude", Float.valueOf(a1.g()));
        contentvalues.put("hasRadar", Integer.valueOf(a1.h()));
        contentvalues.put("hasSatellite", Integer.valueOf(a1.i()));
        contentvalues.put("northeast", a1.k());
        contentvalues.put("southwest", a1.m());
        contentvalues.put("cityJsonString", a1.w());
        contentvalues.put("timestamp", Long.valueOf(a1.o()));
        obj = a1.q();
        contentvalues.put("nowDesp", ((e) (obj)).t());
        contentvalues.put("type", Integer.valueOf(((e) (obj)).u()));
        contentvalues.put("nowTempValue", Float.valueOf(r.a(((e) (obj)).v())));
        contentvalues.put("lowTempValue", Float.valueOf(r.a(((e) (obj)).s())));
        contentvalues.put("highTempValue", Float.valueOf(r.a(((e) (obj)).r())));
        contentvalues.put("humidityValue", Integer.valueOf(((e) (obj)).w()));
        contentvalues.put("windDirection", ((e) (obj)).q());
        contentvalues.put("windStrength", ((e) (obj)).h());
        contentvalues.put("windStrengthValue", Float.valueOf(((e) (obj)).f()));
        contentvalues.put("windType", Integer.valueOf(((e) (obj)).g()));
        contentvalues.put("barometerValue", Float.valueOf(((e) (obj)).k()));
        contentvalues.put("visibilityValue", Float.valueOf(((e) (obj)).j()));
        contentvalues.put("dewpointValue", Float.valueOf(((e) (obj)).l()));
        contentvalues.put("uvIndexValue", Float.valueOf(((e) (obj)).m()));
        contentvalues.put("sunrise", ((e) (obj)).n());
        contentvalues.put("sunset", ((e) (obj)).o());
        contentvalues.put("pop", Integer.valueOf(((e) (obj)).p()));
        contentvalues.put("rainFall", Float.valueOf(((e) (obj)).x()));
        contentvalues.put("feelslikeValue", Float.valueOf(((e) (obj)).i()));
        contentvalues.put("aqi", Integer.valueOf(((e) (obj)).y()));
        contentvalues.put("qualityType", Integer.valueOf(((e) (obj)).a()));
        contentvalues.put("pm25", Integer.valueOf(((e) (obj)).b()));
        contentvalues.put("pm10", Integer.valueOf(((e) (obj)).c()));
        contentvalues.put("so2", Integer.valueOf(((e) (obj)).d()));
        contentvalues.put("no2", Integer.valueOf(((e) (obj)).e()));
        contentvalues.put("golife", a1.a());
        contentvalues.put("radar_map_url", a1.m);
        arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(contentvalues).withSelection((new StringBuilder()).append("cityId='").append(s).append("'").toString(), null).build());
    }

    private void a(a a1, ArrayList arraylist)
    {
        int j = a1.s();
        for (int i = 0; i < j; i++)
        {
            d d1 = a1.d(i);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("cityId", a1.e());
            contentvalues.put("date_long", d1.c());
            contentvalues.put("hour", Integer.valueOf(d1.f()));
            contentvalues.put("status", d1.g());
            contentvalues.put("type", Integer.valueOf(d1.j()));
            contentvalues.put("windDirection", d1.d());
            contentvalues.put("windStrength", d1.e());
            contentvalues.put("windStrengthValue", Float.valueOf(d1.b()));
            contentvalues.put("windType", Integer.valueOf(d1.a()));
            contentvalues.put("tempValue", Float.valueOf(r.a(d1.h())));
            contentvalues.put("humidityValue", Integer.valueOf(d1.i()));
            contentvalues.put("pop", Integer.valueOf(d1.k()));
            arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.e).withValues(contentvalues).build());
        }

    }

    private void a(a a1, ArrayList arraylist, ContentResolver contentresolver)
    {
        int k = a1.v();
        for (int i = 0; i < k; i++)
        {
            contentresolver = a1.g(i);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("cityId", a1.e());
            contentvalues.put("date_time", Long.valueOf(((f) (contentresolver)).a));
            contentvalues.put("pollen_index", Float.valueOf(((f) (contentresolver)).b));
            arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.H).withValues(contentvalues).build());
            int l = contentresolver.a();
            for (int j = 0; j < l; j++)
            {
                g g1 = contentresolver.a(j);
                ContentValues contentvalues1 = new ContentValues();
                contentvalues1.put("cityId", a1.e());
                contentvalues1.put("date_time", Long.valueOf(((f) (contentresolver)).a));
                contentvalues1.put("name", g1.a);
                contentvalues1.put("type", Integer.valueOf(g1.b));
                contentvalues1.put("url", g1.c);
                arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.I).withValues(contentvalues1).build());
            }

        }

    }

    private void a(String s, ArrayList arraylist)
    {
        arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.b).withSelection((new StringBuilder()).append("cityId='").append(s).append("'").toString(), null).build());
        arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.e).withSelection((new StringBuilder()).append("cityId='").append(s).append("'").toString(), null).build());
        arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.f).withSelection((new StringBuilder()).append("cityId='").append(s).append("'").toString(), null).build());
        arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.H).withSelection((new StringBuilder()).append("cityId='").append(s).append("'").toString(), null).build());
        arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.I).withSelection((new StringBuilder()).append("cityId='").append(s).append("'").toString(), null).build());
    }

    private void b(a a1, ArrayList arraylist)
    {
        int j = a1.r();
        for (int i = 0; i < j; i++)
        {
            c c1 = a1.c(i);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("lowTempValue", Float.valueOf(r.a(c1.i())));
            contentvalues.put("highTempValue", Float.valueOf(r.a(c1.h())));
            contentvalues.put("weekDate", c1.e());
            contentvalues.put("windDir", c1.c());
            contentvalues.put("windType", Integer.valueOf(c1.b()));
            contentvalues.put("windStrengthValue", Float.valueOf(c1.a()));
            contentvalues.put("windStrength", c1.d());
            contentvalues.put("type", Integer.valueOf(c1.g()));
            contentvalues.put("cityId", a1.e());
            contentvalues.put("status", c1.f());
            contentvalues.put("pop", Integer.valueOf(c1.j()));
            contentvalues.put("date_long", c1.m());
            contentvalues.put("status_day", c1.k());
            contentvalues.put("status_night", c1.l());
            arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.b).withValues(contentvalues).build());
        }

    }

    private void b(a a1, ArrayList arraylist, ContentResolver contentresolver)
    {
        int j;
        int k;
        k = a1.t();
        j = 0;
_L2:
        b b1;
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = a1.e(j);
        obj = WeatherContentProvider.k;
        String s = (new StringBuilder()).append("alert_id='").append(b1.i()).append("' and ").append("cityId").append("='").append(a1.e()).append("'").toString();
        obj = contentresolver.query(((android.net.Uri) (obj)), new String[] {
            "cityId"
        }, s, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_429;
        }
        int i;
        ((Cursor) (obj)).moveToFirst();
        i = ((Cursor) (obj)).getCount();
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Cursor) (obj)).close();
_L3:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("cityId", a1.e());
        ((ContentValues) (obj)).put("description", b1.d());
        ((ContentValues) (obj)).put("exp_time", b1.b());
        ((ContentValues) (obj)).put("alert_id", Integer.valueOf(b1.i()));
        ((ContentValues) (obj)).put("level", Integer.valueOf(b1.f()));
        ((ContentValues) (obj)).put("message", b1.g());
        ((ContentValues) (obj)).put("phenomena", b1.e());
        ((ContentValues) (obj)).put("publish_time", b1.a());
        ((ContentValues) (obj)).put("type", b1.c());
        ((ContentValues) (obj)).put("tz_offset", Integer.valueOf(b1.j()));
        ((ContentValues) (obj)).put("has_read", Integer.valueOf(0));
        if (!flag)
        {
            arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.k).withValues(((ContentValues) (obj))).build());
        } else
        {
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.k).withValues(((ContentValues) (obj))).withSelection((new StringBuilder()).append("alert_id='").append(b1.i()).append("' and ").append("cityId").append("='").append(a1.e()).append("'").toString(), null).build());
        }
        j++;
        if (true) goto _L2; else goto _L1
        a1;
        ((Cursor) (obj)).close();
        throw a1;
_L1:
        return;
        flag = false;
          goto _L3
    }

    protected transient an a(Object aobj[])
    {
        an an1 = (an)aobj[0];
        a(an1, (ContentResolver)aobj[1]);
        return an1;
    }

    protected void a(an an1)
    {
        com.gau.go.launcherex.gowidget.weather.b.ak.a(a, an1);
        com.gau.go.launcherex.gowidget.weather.b.ak.b(a);
        (new am(a, null)).execute(new an[] {
            an1
        });
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((an)obj);
    }
}
