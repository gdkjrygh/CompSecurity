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
import com.gtp.go.weather.sharephoto.b.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.b.a:
//            a

public class b
{

    public static int a(Context context, ContentValues contentvalues, String s, String as[])
    {
        return context.getContentResolver().update(WeatherContentProvider.A, contentvalues, s, as);
    }

    public static int a(Context context, String s, String as[])
    {
        return context.getContentResolver().delete(WeatherContentProvider.A, s, as);
    }

    public static Uri a(Context context, com.gtp.go.weather.sharephoto.b.b b1)
    {
        context = context.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("award_id", Long.valueOf(b1.a()));
        contentvalues.put("user_award_id", Long.valueOf(b1.b()));
        contentvalues.put("award_type", Integer.valueOf(b1.c()));
        if (b1.c() == 1)
        {
            b1 = b1.d();
            contentvalues.put("apk_name", b1.d());
            contentvalues.put("apk_package_name", b1.c());
            contentvalues.put("apk_pic_path", b1.b());
            contentvalues.put("apk_pic_url", b1.a());
            contentvalues.put("apk_url", b1.e());
            contentvalues.put("apk_url_type", Integer.valueOf(b1.f()));
        }
        return context.insert(WeatherContentProvider.A, contentvalues);
    }

    public static com.gtp.go.weather.sharephoto.b.b a(Cursor cursor)
    {
        com.gtp.go.weather.sharephoto.b.b b1 = new com.gtp.go.weather.sharephoto.b.b();
        a a1 = new a();
        b1.a(a1);
        int j = cursor.getColumnCount();
        int i = 0;
        while (i < j) 
        {
            String s = cursor.getColumnName(i);
            if ("_id".equals(s))
            {
                b1.a(cursor.getInt(i));
            } else
            if ("award_id".equals(s))
            {
                b1.a(cursor.getLong(i));
            } else
            if ("user_award_id".equals(s))
            {
                b1.b(cursor.getLong(i));
            } else
            if ("award_type".equals(s))
            {
                b1.b(cursor.getInt(i));
            } else
            if ("apk_name".equals(s))
            {
                a1.d(cursor.getString(i));
            } else
            if ("apk_package_name".equals(s))
            {
                a1.c(cursor.getString(i));
            } else
            if ("apk_pic_path".equals(s))
            {
                a1.b(cursor.getString(i));
            } else
            if ("apk_pic_url".equals(s))
            {
                a1.a(cursor.getString(i));
            } else
            if ("apk_url".equals(s))
            {
                a1.e(cursor.getString(i));
            } else
            if ("apk_url_type".equals(s))
            {
                a1.a(cursor.getInt(i));
            }
            i++;
        }
        return b1;
    }

    public static com.gtp.go.weather.sharephoto.b.b a(JSONObject jsonobject)
    {
        com.gtp.go.weather.sharephoto.b.b b1 = new com.gtp.go.weather.sharephoto.b.b();
        b1.a(jsonobject.optLong("awardId", -1L));
        b1.b(jsonobject.optInt("type", -1));
        if (b1.c() == 1)
        {
            jsonobject = jsonobject.optJSONObject("awardDetail");
            if (jsonobject != null)
            {
                b1.a(com.gtp.go.weather.sharephoto.b.a.a.a(jsonobject));
            }
        }
        return b1;
    }

    public static List a(Context context, String as[], String s, String as1[])
    {
        ArrayList arraylist = new ArrayList();
        context = context.getContentResolver().query(WeatherContentProvider.A, as, s, as1, "_id");
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

    public static List a(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        int j = jsonarray.length();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(a(jsonarray.getJSONObject(i)));
        }

        return arraylist;
    }
}
