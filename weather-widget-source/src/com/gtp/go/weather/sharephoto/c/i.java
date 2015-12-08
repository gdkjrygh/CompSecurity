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
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.b.o;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            d, e

class i extends AsyncTask
{

    final d a;

    private i(d d1)
    {
        a = d1;
        super();
    }

    i(d d1, e e)
    {
        this(d1);
    }

    protected transient g a(Object aobj[])
    {
        byte byte0;
        boolean flag;
        byte0 = -1;
        flag = true;
        aobj = (g)aobj[0];
        if (aobj == null) goto _L2; else goto _L1
_L1:
        ContentValues contentvalues;
        int j;
        contentvalues = new ContentValues();
        Object obj;
        android.net.Uri uri;
        int k;
        long l;
        if (((g) (aobj)).h())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        contentvalues.put("is_myfavourite", Integer.valueOf(j));
        contentvalues.put("favour", Integer.valueOf(((g) (aobj)).c()));
        d.a(a).getContentResolver().update(WeatherContentProvider.w, contentvalues, "photo_id=?", new String[] {
            String.valueOf(((g) (aobj)).a())
        });
        obj = d.a(a).getContentResolver();
        uri = WeatherContentProvider.y;
        l = ((g) (aobj)).a();
        obj = ((ContentResolver) (obj)).query(uri, new String[] {
            "data_value"
        }, "photo_id=? and data_type=?", new String[] {
            String.valueOf(l), String.valueOf(1)
        }, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        if (!((Cursor) (obj)).moveToFirst()) goto _L4; else goto _L3
_L3:
        k = ((Cursor) (obj)).getColumnCount();
        j = 0;
_L10:
        if (j >= k) goto _L4; else goto _L5
_L5:
        if (!((Cursor) (obj)).getColumnName(j).equals("data_value")) goto _L7; else goto _L6
_L6:
        j = ((Cursor) (obj)).getInt(j);
_L12:
        try
        {
            ((Cursor) (obj)).close();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
_L13:
        contentvalues.clear();
        if (j != 0) goto _L9; else goto _L8
_L8:
        contentvalues.put("photo_id", Long.valueOf(((g) (aobj)).a()));
        contentvalues.put("data_type", Integer.valueOf(1));
        if (((g) (aobj)).h())
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = -1;
        }
        contentvalues.put("data_value", Integer.valueOf(j));
        d.a(a).getContentResolver().insert(WeatherContentProvider.y, contentvalues);
_L2:
        return ((g) (aobj));
_L7:
        j++;
          goto _L10
_L9:
        if ((j != -1 || !((g) (aobj)).h()) && (j != 1 || ((g) (aobj)).h())) goto _L2; else goto _L11
_L11:
        j = byte0;
        if (((g) (aobj)).h())
        {
            j = 1;
        }
        contentvalues.put("data_value", Integer.valueOf(j));
        d.a(a).getContentResolver().update(WeatherContentProvider.y, contentvalues, "photo_id=? and data_type=?", new String[] {
            String.valueOf(((g) (aobj)).a()), String.valueOf(1)
        });
        return ((g) (aobj));
_L4:
        j = 0;
          goto _L12
        j = 0;
          goto _L13
    }

    protected void a(g g1)
    {
        super.onPostExecute(g1);
        if (g1 != null)
        {
            d d1 = a;
            String s = com.gtp.go.weather.sharephoto.a.g.a(d.a(a)).b().a();
            long l = g1.a();
            int j;
            if (g1.h())
            {
                j = 1;
            } else
            {
                j = -1;
            }
            d.b(d1, s, l, j);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((g)obj);
    }
}
