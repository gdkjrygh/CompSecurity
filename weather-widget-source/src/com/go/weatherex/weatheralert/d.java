// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.weatheralert;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.model.c;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package com.go.weatherex.weatheralert:
//            WeatherAlertActivity, e

class d extends AsyncQueryHandler
{

    final WeatherAlertActivity a;

    public d(WeatherAlertActivity weatheralertactivity, ContentResolver contentresolver)
    {
        a = weatheralertactivity;
        super(contentresolver);
    }

    private void a()
    {
        if (!WeatherAlertActivity.d(a).isEmpty())
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm Z", Locale.ENGLISH);
            Collections.sort(WeatherAlertActivity.d(a), new e(this, simpledateformat));
        }
    }

    private void a(Cursor cursor)
    {
        WeatherAlertActivity.d(a).clear();
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        int j;
        j = cursor.getColumnCount();
        obj = cursor.getColumnNames();
        cursor.moveToFirst();
_L27:
        c c1 = new c();
        int i = 0;
_L28:
        if (i >= j) goto _L4; else goto _L3
_L3:
        if (!obj[i].equals("alert_id")) goto _L6; else goto _L5
_L5:
        c1.c(cursor.getInt(i));
          goto _L7
_L6:
        if (!obj[i].equals("cityId")) goto _L9; else goto _L8
_L8:
        c1.g(cursor.getString(i));
          goto _L7
        obj;
        ((Exception) (obj)).printStackTrace();
_L2:
        cursor.close();
        return;
_L9:
        if (!obj[i].equals("publish_time")) goto _L11; else goto _L10
_L10:
        c1.a(cursor.getString(i));
          goto _L7
        obj;
        cursor.close();
        throw obj;
_L11:
        if (!obj[i].equals("exp_time")) goto _L13; else goto _L12
_L12:
        c1.b(cursor.getString(i));
          goto _L7
_L13:
        if (!obj[i].equals("type")) goto _L15; else goto _L14
_L14:
        c1.c(cursor.getString(i));
          goto _L7
_L15:
        if (!obj[i].equals("description")) goto _L17; else goto _L16
_L16:
        c1.d(cursor.getString(i));
          goto _L7
_L17:
        if (!obj[i].equals("phenomena")) goto _L19; else goto _L18
_L18:
        c1.e(cursor.getString(i));
          goto _L7
_L19:
        if (!obj[i].equals("level")) goto _L21; else goto _L20
_L20:
        c1.b(cursor.getInt(i));
          goto _L7
_L21:
        if (!obj[i].equals("message")) goto _L23; else goto _L22
_L22:
        c1.f(cursor.getString(i));
          goto _L7
_L23:
        if (!obj[i].equals("tz_offset")) goto _L25; else goto _L24
_L24:
        c1.a(cursor.getInt(i));
          goto _L7
_L25:
        if (!obj[i].equals("has_read")) goto _L7; else goto _L26
_L26:
        boolean flag;
        if (cursor.getInt(i) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1.c(flag);
          goto _L7
_L4:
        if (!a(c1))
        {
            c1.a(r.c(c1.d()));
            WeatherAlertActivity.d(a).add(c1);
        }
        flag = cursor.moveToNext();
        if (flag) goto _L27; else goto _L2
_L7:
        i++;
          goto _L28
    }

    private boolean a(c c1)
    {
        for (Iterator iterator = WeatherAlertActivity.d(a).iterator(); iterator.hasNext();)
        {
            if (((c)iterator.next()).k() == c1.k())
            {
                return true;
            }
        }

        return false;
    }

    public void a(String s)
    {
        s = (new StringBuilder()).append("cityId='").append(s).append("'").toString();
        startQuery(0, null, WeatherContentProvider.k, new String[] {
            "alert_id", "cityId", "exp_time", "publish_time", "level", "message", "description", "tz_offset", "has_read"
        }, s, null, "cityId");
    }

    protected void onQueryComplete(int i, Object obj, Cursor cursor)
    {
        super.onQueryComplete(i, obj, cursor);
        if (cursor != null)
        {
            a(cursor);
            a();
            a.a();
        }
    }
}
