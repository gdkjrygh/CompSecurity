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
import android.widget.CheckBox;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.view.VerticalStretchLayout;
import com.gtp.a.a.b.c;
import com.jiubang.core.c.j;

// Referenced classes of package com.go.weatherex.setting:
//            ba, bk

class bj extends j
{

    final ba a;

    public bj(ba ba1, ContentResolver contentresolver)
    {
        a = ba1;
        super(contentresolver);
    }

    protected void a(int i, Object obj, int k)
    {
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        if (cursor == null)
        {
            return;
        }
        i;
        JVM INSTR tableswitch 1 18: default 100
    //                   1 107
    //                   2 134
    //                   3 165
    //                   4 777
    //                   5 248
    //                   6 297
    //                   7 346
    //                   8 395
    //                   9 521
    //                   10 100
    //                   11 100
    //                   12 100
    //                   13 100
    //                   14 100
    //                   15 100
    //                   16 649
    //                   17 100
    //                   18 928;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L1 _L1 _L1 _L1 _L1 _L1 _L11 _L1 _L12
_L21:
        cursor.close();
        return;
_L2:
        if (cursor.moveToFirst())
        {
            ba.a(a, cursor.getString(0));
        }
          goto _L1
_L3:
        if (cursor.getCount() <= 0) goto _L14; else goto _L13
_L13:
        ba.a(a, cursor);
          goto _L1
_L14:
        try
        {
            ba.a(a, false);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L1
_L4:
        if (!cursor.moveToNext()) goto _L1; else goto _L15
_L15:
        ba.a(a).a = cursor.getInt(0);
        ba.b(a).a = ba.a(a).a;
        ba.b(a, true);
        if (ba.b(a).a != 1)
        {
            flag = false;
        }
        com.go.weatherex.setting.ba.c(a).setChecked(flag);
          goto _L1
_L6:
        if (cursor.moveToNext())
        {
            ba.a(a).c = cursor.getInt(0);
            ba.b(a).c = ba.a(a).c;
        }
          goto _L1
_L7:
        if (cursor.moveToNext())
        {
            ba.a(a).d = cursor.getInt(0);
            ba.b(a).d = ba.a(a).d;
        }
          goto _L1
_L8:
        if (cursor.moveToNext())
        {
            ba.a(a).e = cursor.getInt(0);
            ba.b(a).e = ba.a(a).e;
        }
          goto _L1
_L9:
        if (!cursor.moveToNext()) goto _L1; else goto _L16
_L16:
        ba.a(a).f = cursor.getInt(0);
        ba.b(a).f = ba.a(a).f;
        ba.a(a).f;
        JVM INSTR tableswitch 1 3: default 965
    //                   1 476
    //                   2 491
    //                   3 506;
           goto _L1 _L17 _L18 _L19
_L1:
        if (true) goto _L21; else goto _L20
_L20:
_L17:
        ba.d(a).setText(0x7f0803e9);
          goto _L21
_L18:
        ba.d(a).setText(0x7f0803ea);
          goto _L21
_L19:
        ba.d(a).setText(0x7f0803eb);
          goto _L21
_L10:
        if (!cursor.moveToNext()) goto _L21; else goto _L22
_L22:
        ba.a(a).g = cursor.getInt(0);
        ba.b(a).g = ba.a(a).g;
        ba.a(a).g;
        JVM INSTR tableswitch 1 3: default 968
    //                   1 604
    //                   2 619
    //                   3 634;
           goto _L23 _L24 _L25 _L26
_L23:
        if (true) goto _L21; else goto _L27
_L27:
_L24:
        ba.e(a).setText(0x7f0803ed);
          goto _L21
_L25:
        ba.e(a).setText(0x7f0803ee);
          goto _L21
_L26:
        ba.e(a).setText(0x7f0803ef);
          goto _L21
_L11:
        if (!cursor.moveToNext()) goto _L21; else goto _L28
_L28:
        ba.a(a).h = cursor.getInt(0);
        ba.b(a).h = ba.a(a).h;
        ba.a(a).h;
        JVM INSTR tableswitch 1 3: default 971
    //                   1 732
    //                   2 762
    //                   3 747;
           goto _L29 _L30 _L31 _L32
_L29:
        if (true) goto _L21; else goto _L33
_L33:
_L30:
        ba.f(a).setText(0x7f0803f4);
          goto _L21
_L32:
        ba.f(a).setText(0x7f0803f2);
          goto _L21
_L31:
        ba.f(a).setText(0x7f0803f3);
          goto _L21
_L5:
        if (!cursor.moveToNext()) goto _L21; else goto _L34
_L34:
        ba.a(a).b = cursor.getInt(0);
        ba.b(a).b = ba.a(a).b;
        com.go.weatherex.setting.ba.c(a, true);
        if (ba.b(a).b == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ba.d(a, flag);
        ba.e(a, flag);
        ba.f(a, flag);
        ba.g(a, flag);
        ba.g(a).setChecked(flag);
        if (!flag) goto _L36; else goto _L35
_L35:
        ba.h(a).b();
          goto _L21
_L36:
        ba.h(a).a();
          goto _L21
_L12:
        if (!cursor.moveToNext()) goto _L21; else goto _L37
_L37:
        ba.a(a, cursor.getInt(0));
          goto _L21
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
            ba.a(a, System.currentTimeMillis() - ba.i(a));
            c.a("LJL", (new StringBuilder()).append("onBatchComplete:mTime:").append(ba.i(a)).toString());
            c.a("LJL", (new StringBuilder()).append("TOKEN_UPDATE_SETTINGS:").append(System.currentTimeMillis()).toString());
            obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_SETTINGS_CHANGE");
            com.go.weatherex.setting.ba.j(a).sendBroadcast(((Intent) (obj)));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
