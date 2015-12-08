// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import java.util.List;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            e

class j extends com.jiubang.core.c.j
{

    final e a;

    public j(e e1, ContentResolver contentresolver)
    {
        a = e1;
        super(contentresolver);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        super.a(i, obj, cursor);
        i;
        JVM INSTR tableswitch 1 16: default 88
    //                   1 108
    //                   2 320
    //                   3 398
    //                   4 439
    //                   5 88
    //                   6 157
    //                   7 346
    //                   8 88
    //                   9 372
    //                   10 88
    //                   11 469
    //                   12 88
    //                   13 88
    //                   14 88
    //                   15 88
    //                   16 424;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L1 _L8 _L1 _L9 _L1 _L1 _L1 _L1 _L10
_L1:
        if (cursor == null || cursor.isClosed()) goto _L12; else goto _L11
_L11:
        cursor.close();
_L12:
        return;
_L2:
        if (!e.a(a, cursor) && obj != null)
        {
            e.a(a, (List)obj);
        } else
        if (e.a(a))
        {
            e.b(a);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        ContentValues contentvalues = new ContentValues();
        if (cursor != null && cursor.getCount() > 0)
        {
            contentvalues.put("city_id", e.c(a));
            String s = (new StringBuilder()).append(e.d(a)).append("").toString();
            a(-1, null, WeatherContentProvider.E, contentvalues, "go_widget_id=?", new String[] {
                s
            });
        } else
        {
            contentvalues.put("go_widget_id", (new StringBuilder()).append(e.d(a)).append("").toString());
            contentvalues.put("city_id", e.c(a));
            a(-1, null, WeatherContentProvider.E, contentvalues);
        }
        if (obj != null)
        {
            e.a(a, (List)obj);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        e.b(a, cursor);
        if (obj != null)
        {
            e.a(a, (List)obj);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        e.c(a, cursor);
        if (obj != null)
        {
            e.a(a, (List)obj);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        e.d(a, cursor);
        if (obj != null)
        {
            e.a(a, (List)obj);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        e.e(a, cursor);
        if (obj != null)
        {
            e.a(a, (List)obj);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        e.a(a, (String)obj, cursor);
        continue; /* Loop/switch isn't completed */
_L5:
        if (cursor != null)
        {
            e.f(a, cursor);
            if (obj != null)
            {
                e.a(a, (List)obj);
            }
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (cursor != null)
        {
            cursor.moveToFirst();
            boolean flag;
            if (cursor.getInt(0) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e.a(a, flag);
            if (e.e(a))
            {
                e.f(a).a(true);
            } else
            {
                e.f(a).a(false);
            }
            if (obj != null)
            {
                e.a(a, (List)obj);
            } else
            {
                e.b(a);
            }
        }
        if (true) goto _L1; else goto _L13
_L13:
        obj;
        ((Exception) (obj)).printStackTrace();
        return;
    }
}
