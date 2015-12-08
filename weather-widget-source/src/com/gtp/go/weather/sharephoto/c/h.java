// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.go.weather.sharephoto.a.g;
import com.gtp.go.weather.sharephoto.b.o;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            d, e

class h extends AsyncTask
{

    final d a;

    private h(d d1)
    {
        a = d1;
        super();
    }

    h(d d1, e e)
    {
        this(d1);
    }

    protected transient Long a(Object aobj[])
    {
        long l = ((Long)aobj[0]).longValue();
        if (l <= 0L)
        {
            return Long.valueOf(0L);
        }
        aobj = d.a(a).getContentResolver().query(WeatherContentProvider.y, new String[] {
            "data_value"
        }, "photo_id=? and data_type=?", new String[] {
            String.valueOf(l), String.valueOf(2)
        }, null);
        boolean flag;
        if (aobj != null)
        {
            if (((Cursor) (aobj)).getCount() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                ((Cursor) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                ((Exception) (aobj)).printStackTrace();
            }
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            aobj = new ContentValues();
            ((ContentValues) (aobj)).put("photo_id", Long.valueOf(l));
            ((ContentValues) (aobj)).put("data_type", Integer.valueOf(2));
            d.a(a).getContentResolver().insert(WeatherContentProvider.y, ((ContentValues) (aobj)));
            return Long.valueOf(l);
        } else
        {
            return Long.valueOf(0L);
        }
    }

    protected void a(Long long1)
    {
        super.onPostExecute(long1);
        if (long1.longValue() != 0L)
        {
            d.b(a, g.a(d.a(a)).b().a(), long1.longValue(), 2);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Long)obj);
    }
}
