// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.go.weatherex.sidebar:
//            b

class f
    implements com.go.weatherex.home.b.f
{

    final String a;
    final int b;
    final b c;

    f(b b1, String s, int i)
    {
        c = b1;
        a = s;
        b = i;
        super();
    }

    public void a(Bitmap bitmap, String s)
    {
        if (!a.equals(s))
        {
            return;
        }
        if (b != 1) goto _L2; else goto _L1
_L1:
        com.go.weatherex.sidebar.b.a(c, bitmap);
_L4:
        bitmap = com.go.weatherex.sidebar.b.c(c).obtainMessage();
        bitmap.what = 2;
        bitmap.arg1 = b;
        com.go.weatherex.sidebar.b.c(c).sendMessage(bitmap);
        return;
_L2:
        if (b == 2)
        {
            com.go.weatherex.sidebar.b.b(c, bitmap);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
