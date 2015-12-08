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
import com.gtp.go.weather.sharephoto.b.b;
import com.gtp.go.weather.sharephoto.b.d;
import com.gtp.go.weather.sharephoto.b.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.b.a:
//            b

public class c
{

    public static int a(Context context, ContentValues contentvalues, String s, String as[])
    {
        return context.getContentResolver().update(WeatherContentProvider.z, contentvalues, s, as);
    }

    public static int a(Context context, String s, String as[])
    {
        return context.getContentResolver().delete(WeatherContentProvider.z, s, as);
    }

    public static Uri a(Context context, d d1)
    {
        context = context.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("award_desc", d1.c());
        contentvalues.put("award_time", Long.valueOf(d1.d()));
        contentvalues.put("award_type", Integer.valueOf(d1.e()));
        contentvalues.put("is_receive", Integer.valueOf(d1.j()));
        contentvalues.put("prompt_type", Integer.valueOf(d1.b()));
        contentvalues.put("small_pic_path", d1.g());
        contentvalues.put("small_pic_url", d1.f());
        contentvalues.put("user_award_id", Long.valueOf(d1.a()));
        contentvalues.put("award_id", Long.valueOf(d1.h()));
        return context.insert(WeatherContentProvider.z, contentvalues);
    }

    public static d a(Cursor cursor)
    {
        d d1 = new d();
        int j = cursor.getColumnCount();
        int i = 0;
        while (i < j) 
        {
            String s = cursor.getColumnName(i);
            if ("_id".equals(s))
            {
                d1.a(cursor.getInt(i));
            } else
            if ("award_desc".equals(s))
            {
                d1.a(cursor.getString(i));
            } else
            if ("award_id".equals(s))
            {
                d1.c(cursor.getLong(i));
            } else
            if ("award_time".equals(s))
            {
                d1.b(cursor.getLong(i));
            } else
            if ("award_type".equals(s))
            {
                d1.c(cursor.getInt(i));
            } else
            if ("is_receive".equals(s))
            {
                d1.d(cursor.getInt(i));
            } else
            if ("prompt_type".equals(s))
            {
                d1.b(cursor.getInt(i));
            } else
            if ("small_pic_path".equals(s))
            {
                d1.c(cursor.getString(i));
            } else
            if ("small_pic_url".equals(s))
            {
                d1.b(cursor.getString(i));
            } else
            if ("user_award_id".equals(s))
            {
                d1.a(cursor.getLong(i));
            }
            i++;
        }
        return d1;
    }

    public static d a(JSONObject jsonobject)
    {
        d d1 = new d();
        d1.a(jsonobject.optLong("userAwardId", -1L));
        d1.b(jsonobject.optInt("promptType", -1));
        d1.a(jsonobject.optString("awardDesc", ""));
        d1.b(jsonobject.optLong("awardTime", 0L));
        d1.c(jsonobject.optInt("awardType", -1));
        JSONObject jsonobject1 = jsonobject.optJSONObject("smallPic");
        if (jsonobject1 != null)
        {
            d1.b(f.a(jsonobject1).a());
        }
        d1.d(jsonobject.optInt("isReceive", 0));
        if (d1.j() != 0)
        {
            jsonobject = b.a(jsonobject.optJSONObject("award"));
            jsonobject.b(d1.a());
            d1.c(jsonobject.a());
            d1.a(jsonobject);
        }
        return d1;
    }

    public static List a(Context context, String as[], String s, String as1[])
    {
        ArrayList arraylist = new ArrayList();
        context = context.getContentResolver().query(WeatherContentProvider.z, as, s, as1, "_id");
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
