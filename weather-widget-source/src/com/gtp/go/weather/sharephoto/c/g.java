// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.go.weather.sharephoto.b.j;
import com.gtp.go.weather.sharephoto.b.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            d, e

class g extends AsyncTask
{

    final d a;

    private g(d d1)
    {
        a = d1;
        super();
    }

    g(d d1, e e)
    {
        this(d1);
    }

    protected transient Object doInBackground(Object aobj[])
    {
        Cursor cursor = d.a(a).getContentResolver().query(WeatherContentProvider.y, new String[] {
            "photo_id", "data_type", "data_value", "user_id", "city_id"
        }, null, null, null);
        aobj = new ArrayList();
        if (cursor != null)
        {
            if (cursor.moveToFirst())
            {
                int k = cursor.getColumnCount();
                do
                {
                    j j1 = new j();
                    int i = 0;
                    while (i < k) 
                    {
                        String s = cursor.getColumnName(i);
                        if (s.equals("photo_id"))
                        {
                            j1.a(cursor.getLong(i));
                        } else
                        if (s.equals("data_type"))
                        {
                            j1.a(cursor.getInt(i));
                        } else
                        if (s.equals("data_value"))
                        {
                            j1.b(cursor.getInt(i));
                        }
                        i++;
                    }
                    ((ArrayList) (aobj)).add(j1);
                } while (cursor.moveToNext());
            }
            try
            {
                cursor.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        if (!((ArrayList) (aobj)).isEmpty())
        {
            Object obj = com.gtp.go.weather.sharephoto.a.g.a(d.a(a)).b().a();
            aobj = ((ArrayList) (aobj)).iterator();
            do
            {
                if (!((Iterator) (aobj)).hasNext())
                {
                    break;
                }
                j j2 = (j)((Iterator) (aobj)).next();
                if (j2.b() == 1)
                {
                    d.a(a, ((String) (obj)), j2.a(), j2.c());
                } else
                if (j2.b() == 2)
                {
                    d.a(a, ((String) (obj)), j2.a(), 2);
                } else
                if (j2.b() == 3)
                {
                    d.a(a, ((String) (obj)), j2);
                }
            } while (true);
            d.b(a);
        }
        return null;
    }
}
