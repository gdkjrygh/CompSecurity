// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Activity;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import com.jiubang.core.c.j;

// Referenced classes of package com.go.weatherex.setting:
//            b, g

class f extends j
{

    final b a;

    public f(b b1, ContentResolver contentresolver)
    {
        a = b1;
        super(contentresolver);
    }

    protected void a(int i, Object obj, int k)
    {
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        if (cursor == null)
        {
            return;
        }
        i;
        JVM INSTR tableswitch 1 18: default 92
    //                   1 99
    //                   2 126
    //                   3 157
    //                   4 616
    //                   5 220
    //                   6 269
    //                   7 318
    //                   8 367
    //                   9 448
    //                   10 92
    //                   11 92
    //                   12 92
    //                   13 92
    //                   14 92
    //                   15 92
    //                   16 532
    //                   17 92
    //                   18 679;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L1 _L1 _L1 _L1 _L1 _L1 _L11 _L1 _L12
_L17:
        cursor.close();
        return;
_L2:
        if (cursor.moveToFirst())
        {
            b.a(a, cursor.getString(0));
        }
          goto _L1
_L3:
        if (cursor.getCount() <= 0) goto _L14; else goto _L13
_L13:
        b.a(a, cursor);
          goto _L1
_L14:
        try
        {
            b.a(a, false);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L1
_L4:
        if (cursor.moveToNext())
        {
            b.a(a).a = cursor.getInt(0);
            b.b(a).a = b.a(a).a;
            if (b.b(a).a != 1);
        }
          goto _L1
_L6:
        if (cursor.moveToNext())
        {
            b.a(a).c = cursor.getInt(0);
            b.b(a).c = b.a(a).c;
        }
          goto _L1
_L7:
        if (cursor.moveToNext())
        {
            b.a(a).d = cursor.getInt(0);
            b.b(a).d = b.a(a).d;
        }
          goto _L1
_L8:
        if (cursor.moveToNext())
        {
            b.a(a).e = cursor.getInt(0);
            b.b(a).e = b.a(a).e;
        }
          goto _L1
_L9:
        if (!cursor.moveToNext()) goto _L1; else goto _L15
_L15:
        b.a(a).f = cursor.getInt(0);
        b.b(a).f = b.a(a).f;
        b.a(a).f;
        JVM INSTR tableswitch 1 3: default 710
    //                   1 92
    //                   2 92
    //                   3 92;
           goto _L1 _L1 _L1 _L1
_L1:
        if (true) goto _L17; else goto _L16
_L16:
_L10:
        if (!cursor.moveToNext()) goto _L17; else goto _L18
_L18:
        b.a(a).g = cursor.getInt(0);
        b.b(a).g = b.a(a).g;
        switch (b.a(a).g)
        {
        }
        if (true) goto _L17; else goto _L19
_L19:
_L11:
        if (!cursor.moveToNext()) goto _L17; else goto _L20
_L20:
        b.a(a).h = cursor.getInt(0);
        b.b(a).h = b.a(a).h;
        switch (b.a(a).h)
        {
        }
        if (true) goto _L17; else goto _L21
_L21:
_L5:
        if (cursor.moveToNext())
        {
            b.a(a).b = cursor.getInt(0);
            b.b(a).b = b.a(a).b;
            if (b.b(a).b != 1);
        }
          goto _L17
_L12:
        if (!cursor.moveToNext()) goto _L17; else goto _L22
_L22:
        b.a(a, cursor.getInt(0));
          goto _L17
    }

    protected void a(int i, Object obj, ContentProviderResult acontentproviderresult[])
    {
        i;
        JVM INSTR tableswitch 17 17: default 20
    //                   17 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (acontentproviderresult != null && acontentproviderresult.length > 0)
        {
            obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_SETTINGS_CHANGE");
            b.c(a).sendBroadcast(((Intent) (obj)));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
