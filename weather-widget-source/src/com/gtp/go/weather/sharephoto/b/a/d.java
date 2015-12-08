// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b.a;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.go.weather.sharephoto.b.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d
{

    public static int a(Context context, ContentValues contentvalues, String s, String as[])
    {
        return context.getContentResolver().update(WeatherContentProvider.x, contentvalues, s, as);
    }

    public static int a(Context context, String s, String as[])
    {
        return context.getContentResolver().delete(WeatherContentProvider.x, s, as);
    }

    public static Uri a(Context context, e e1)
    {
        context = context.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("photo_id", Long.valueOf(e1.f()));
        contentvalues.put("photo_path", e1.g());
        contentvalues.put("photo_upload_size", Long.valueOf(e1.i()));
        contentvalues.put("has_watermark", String.valueOf(e1.e()));
        contentvalues.put("description", e1.a());
        contentvalues.put("city_id", e1.b());
        contentvalues.put("city_name", e1.c());
        if (e1.e())
        {
            contentvalues.put("watermark_path", e1.h());
            contentvalues.put("watermark_upload_size", Long.valueOf(e1.j()));
        }
        return context.insert(WeatherContentProvider.x, contentvalues);
    }

    public static e a(Cursor cursor)
    {
        e e1 = new e();
        int j = cursor.getColumnCount();
        int i = 0;
        while (i < j) 
        {
            String s = cursor.getColumnName(i);
            if ("_id".equals(s))
            {
                e1.a(cursor.getInt(i));
            } else
            if ("photo_id".equals(s))
            {
                e1.a(cursor.getLong(i));
            } else
            if ("photo_path".equals(s))
            {
                e1.d(cursor.getString(i));
            } else
            if ("photo_upload_size".equals(s))
            {
                e1.b(cursor.getLong(i));
            } else
            if ("watermark_path".equals(s))
            {
                e1.e(cursor.getString(i));
            } else
            if ("watermark_upload_size".equals(s))
            {
                e1.c(cursor.getLong(i));
            } else
            if ("has_watermark".equals(s))
            {
                e1.a(Boolean.valueOf(cursor.getString(i)).booleanValue());
            } else
            if ("description".equals(s))
            {
                e1.a(cursor.getString(i));
            } else
            if ("city_id".equals(s))
            {
                e1.b(cursor.getString(i));
            } else
            if ("city_name".equals(s))
            {
                e1.c(cursor.getString(i));
            }
            i++;
        }
        return e1;
    }

    public static List a(Context context)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (Iterator iterator = a(context, new String[] {
    "_id", "photo_id", "photo_path", "photo_upload_size", "watermark_path", "watermark_upload_size", "description", "city_id", "city_name"
}, null, null).iterator(); iterator.hasNext();)
        {
            e e1 = (e)iterator.next();
            if (!e1.l())
            {
                arraylist1.add(e1);
            } else
            {
                if (e1.e() && !e1.m())
                {
                    e1.a(false);
                }
                arraylist.add(e1);
            }
        }

        a(context, ((List) (arraylist1)));
        return arraylist;
    }

    public static List a(Context context, String as[], String s, String as1[])
    {
        ArrayList arraylist = new ArrayList();
        context = context.getContentResolver().query(WeatherContentProvider.x, as, s, as1, "photo_id");
        if (context != null)
        {
            if (context.moveToFirst())
            {
                do
                {
                    arraylist.add(a(((Cursor) (context))));
                } while (context.moveToNext());
            }
            context.close();
        }
        return arraylist;
    }

    public static void a(Context context, List list)
    {
        for (list = list.iterator(); list.hasNext(); a(context, "photo_id=?", new String[] {
    String.valueOf(((e)list.next()).f())
})) { }
    }
}
