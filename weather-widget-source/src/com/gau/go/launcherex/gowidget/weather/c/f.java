// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.c;

import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.jiubang.core.c.j;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.c:
//            e

class f extends j
{

    final e a;
    private SoftReference c;

    public f(e e1, ContentResolver contentresolver, e e2)
    {
        a = e1;
        super(contentresolver);
        c = new SoftReference(e2);
    }

    protected void a(int i, Object obj, int k)
    {
        super.a(i, obj, k);
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_SETTINGS_CHANGE");
            e.b(a).sendBroadcast(intent);
            i = ((Integer)obj).intValue();
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(i));
            a(-1, null, WeatherContentProvider.g, ((ContentValues) (obj)), "setting_key=?", new String[] {
                "key_live_wallpaper_city_flag"
            });
            return;

        case 2: // '\002'
            e.a(a, obj);
            break;
        }
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        Object obj1;
        byte byte0;
        byte0 = -1;
        super.a(i, obj, cursor);
        obj1 = (e)c.get();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 1 4: default 60
    //                   1 61
    //                   2 74
    //                   3 60
    //                   4 242;
           goto _L2 _L3 _L4 _L2 _L5
_L2:
        return;
_L3:
        e.a(((e) (obj1)), cursor);
        ((e) (obj1)).a(1);
        return;
_L4:
        if (cursor == null) goto _L2; else goto _L6
_L6:
        if (!cursor.moveToFirst()) goto _L8; else goto _L7
_L7:
        obj1 = cursor.getString(0);
        obj = ((ArrayList)obj).iterator();
_L11:
        if (!((Iterator) (obj)).hasNext()) goto _L8; else goto _L9
_L9:
        if (!((String) (obj1)).equals((String)((Iterator) (obj)).next())) goto _L11; else goto _L10
_L10:
        obj1 = (WeatherBean)e.a(a).d().get(0);
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        obj = ((WeatherBean) (obj1)).c();
        if (((WeatherBean) (obj1)).e() == 1)
        {
            i = 1;
        } else
        {
            i = 2;
        }
_L22:
        try
        {
            obj1 = new ContentValues();
            ((ContentValues) (obj1)).put("setting_value", ((String) (obj)));
            a(1, Integer.valueOf(i), WeatherContentProvider.g, ((ContentValues) (obj1)), "setting_key=?", new String[] {
                "key_live_wallpaper_city_id"
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            cursor.close();
            return;
        }
        finally
        {
            cursor.close();
        }
_L8:
        cursor.close();
        return;
        throw obj;
_L5:
        if (cursor == null) goto _L2; else goto _L14
_L14:
        if (!cursor.moveToFirst() || cursor.getInt(0) != 2) goto _L16; else goto _L15
_L15:
        obj = e.a(a).d().iterator();
_L20:
        if (!((Iterator) (obj)).hasNext()) goto _L18; else goto _L17
_L17:
        obj1 = (WeatherBean)((Iterator) (obj)).next();
        if (((WeatherBean) (obj1)).e() != 1) goto _L20; else goto _L19
_L19:
        obj = ((WeatherBean) (obj1)).c();
        i = 1;
_L21:
        try
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("setting_value", ((String) (obj)));
            a(1, Integer.valueOf(i), WeatherContentProvider.g, contentvalues, "setting_key=?", new String[] {
                "key_live_wallpaper_city_id"
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            cursor.close();
            return;
        }
        finally
        {
            cursor.close();
        }
        cursor.close();
        return;
_L16:
        cursor.close();
        return;
        throw obj;
_L18:
        i = -1;
        obj = "--";
        if (true) goto _L21; else goto _L13
_L13:
        obj = "--";
        i = byte0;
          goto _L22
    }

    protected void a(int i, Object obj, ContentProviderResult acontentproviderresult[])
    {
        super.a(i, obj, acontentproviderresult);
        if (i == 1)
        {
            obj = ((Object) ((Object[])(Object[])obj));
            boolean flag = ((Boolean)obj[0]).booleanValue();
            boolean flag1 = ((Boolean)obj[1]).booleanValue();
            obj = (ArrayList)obj[2];
            a.a(e.c(a).b, flag1);
            if (flag)
            {
                a.a(((ArrayList) (obj)));
            }
        } else
        if (i == 2 && e.c(a).m == 1)
        {
            e.d(a);
            return;
        }
    }
}
