// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.ContentResolver;
import android.database.Cursor;
import com.jiubang.core.c.j;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            k

class o extends j
{

    final k a;

    public o(k k1, ContentResolver contentresolver)
    {
        a = k1;
        super(contentresolver);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        super.a(i, obj, cursor);
        if (k.a(a)) goto _L2; else goto _L1
_L1:
        if (cursor == null) goto _L4; else goto _L3
_L3:
        i;
        JVM INSTR tableswitch 1 13: default 88
    //                   1 98
    //                   2 89
    //                   3 107
    //                   4 117
    //                   5 126
    //                   6 135
    //                   7 144
    //                   8 152
    //                   9 170
    //                   10 179
    //                   11 161
    //                   12 188
    //                   13 201;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L4:
        return;
_L6:
        k.a(a, cursor);
        return;
_L5:
        k.b(a, cursor);
        return;
_L7:
        k.c(a, cursor);
        return;
_L8:
        k.d(a, cursor);
        return;
_L9:
        k.e(a, cursor);
        return;
_L10:
        k.f(a, cursor);
        return;
_L11:
        k.g(a, cursor);
_L12:
        k.h(a, cursor);
        return;
_L15:
        k.i(a, cursor);
        return;
_L13:
        com.gau.go.launcherex.goweather.livewallpaper.k.j(a, cursor);
        return;
_L14:
        a.a(cursor);
        return;
_L16:
        k.a(a, cursor, (String)obj);
        return;
_L17:
        k.k(a, cursor);
        return;
_L2:
        if (cursor != null)
        {
            cursor.close();
            return;
        }
        if (true) goto _L4; else goto _L18
_L18:
    }
}
