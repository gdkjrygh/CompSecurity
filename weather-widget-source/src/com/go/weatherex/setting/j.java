// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.go.weatherex.setting:
//            i

class j extends com.jiubang.core.c.j
{

    final i a;

    public j(i k, ContentResolver contentresolver)
    {
        a = k;
        super(contentresolver);
    }

    protected void a(int k, Object obj, int l)
    {
        if (l <= 0) goto _L2; else goto _L1
_L1:
        k;
        JVM INSTR tableswitch 2 4: default 32
    //                   2 33
    //                   3 32
    //                   4 49;
           goto _L2 _L3 _L2 _L4
_L2:
        return;
_L3:
        i.a(a);
        i.a(a, 2);
        return;
_L4:
        i.a(a);
        i.a(a, 1);
        return;
    }

    protected void a(int k, Object obj, Cursor cursor)
    {
        if (cursor == null)
        {
            return;
        }
        k;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 39
    //                   2 32
    //                   3 114;
           goto _L1 _L2 _L1 _L3
_L1:
        cursor.close();
        return;
_L2:
        if (!cursor.moveToNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        k = cursor.getInt(0);
        ContentValues contentvalues1;
        if (k == 2 || k == -1)
        {
            try
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("setting_value", ((CityBean)obj).a());
                a(2, null, WeatherContentProvider.g, contentvalues, "setting_key=?", new String[] {
                    "key_live_wallpaper_city_id"
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                cursor.close();
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (cursor.moveToFirst() && "--".equals(cursor.getString(0)))
        {
            obj = (String)obj;
            contentvalues1 = new ContentValues();
            contentvalues1.put("setting_value", ((String) (obj)));
            a(4, null, WeatherContentProvider.g, contentvalues1, "setting_key=?", new String[] {
                "key_live_wallpaper_city_id"
            });
        }
        if (true) goto _L1; else goto _L4
_L4:
        throw obj;
    }

    protected void a(int k, Object obj, ContentProviderResult acontentproviderresult[])
    {
        super.a(k, obj, acontentproviderresult);
    }
}
