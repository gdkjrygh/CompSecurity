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

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            d, e

class j extends AsyncTask
{

    final d a;

    private j(d d1)
    {
        a = d1;
        super();
    }

    j(d d1, e e)
    {
        this(d1);
    }

    protected transient com.gtp.go.weather.sharephoto.b.j a(Object aobj[])
    {
label0:
        {
            Object obj = null;
            com.gtp.go.weather.sharephoto.b.j j1 = (com.gtp.go.weather.sharephoto.b.j)aobj[0];
            if (j1 != null)
            {
                aobj = d.a(a).getContentResolver();
                android.net.Uri uri = WeatherContentProvider.y;
                long l = j1.a();
                int i = j1.c();
                aobj = ((ContentResolver) (aobj)).query(uri, new String[] {
                    "data_value"
                }, "photo_id=? and data_type=? and data_value=?", new String[] {
                    String.valueOf(l), String.valueOf(3), String.valueOf(i)
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
                aobj = obj;
                if (flag)
                {
                    break label0;
                }
                aobj = new ContentValues();
                ((ContentValues) (aobj)).put("photo_id", Long.valueOf(j1.a()));
                ((ContentValues) (aobj)).put("data_type", Integer.valueOf(3));
                ((ContentValues) (aobj)).put("data_value", Integer.valueOf(j1.c()));
                d.a(a).getContentResolver().insert(WeatherContentProvider.y, ((ContentValues) (aobj)));
            }
            aobj = j1;
        }
        return ((com.gtp.go.weather.sharephoto.b.j) (aobj));
    }

    protected void a(com.gtp.go.weather.sharephoto.b.j j1)
    {
        super.onPostExecute(j1);
        if (j1 != null)
        {
            d.a(a, j1);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((com.gtp.go.weather.sharephoto.b.j)obj);
    }
}
