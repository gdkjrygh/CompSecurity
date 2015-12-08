// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.view.KeyEvent;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            au

public final class at
{

    private final au a;
    private int b;
    private int c;
    private int d;
    private int e;

    public at(au au1)
    {
        a = (au)com.google.android.apps.youtube.common.fromguava.c.a(au1);
        b = 0x80000000;
        c = 0x80000000;
        d = 0x80000000;
        e = 0;
    }

    public static boolean b(int i)
    {
        return i == 90 || i == 87 || i == 85 || i == 88 || i == 89 || i == 86 || i == 126 || i == 127 || i == 130 || i == 79 || i == 175;
    }

    private static boolean c(int i)
    {
        return i == 79 || i == 85 || i == 86 || i == 126 || i == 127 || i == 175;
    }

    public final void a(int i, int j)
    {
        b = i;
        c = j;
    }

    public final boolean a(int i)
    {
        if (i == 89 || i == 90)
        {
            if (d != 0x80000000 && i == e)
            {
                a.b(d);
                d = 0x80000000;
                e = 0;
            }
        } else
        if (!c(i))
        {
            return false;
        }
        return true;
    }

    public final boolean a(int i, KeyEvent keyevent)
    {
        if (d != 0x80000000 && i != e)
        {
            return true;
        }
        if (i == 89 || i == 90)
        {
            if (b != 0x80000000 && c != 0x80000000)
            {
                if (keyevent.getRepeatCount() == 0)
                {
                    d = b;
                    e = i;
                    a.a();
                }
                int j = d;
                if (i == 89)
                {
                    i = -20000;
                } else
                {
                    i = 20000;
                }
                d = i + j;
                d = Math.max(0, Math.min(d, c));
                a.a(d);
            }
            return true;
        }
        if (!c(i)) goto _L2; else goto _L1
_L1:
        if (keyevent.getRepeatCount() > 0)
        {
            return true;
        }
        i;
        JVM INSTR lookupswitch 6: default 216
    //                   79: 218
    //                   85: 218
    //                   86: 242
    //                   126: 230
    //                   127: 242
    //                   175: 254;
           goto _L3 _L4 _L4 _L5 _L6 _L5 _L7
_L3:
        return true;
_L4:
        a.b();
        continue; /* Loop/switch isn't completed */
_L6:
        a.c();
        continue; /* Loop/switch isn't completed */
_L5:
        a.d();
        continue; /* Loop/switch isn't completed */
_L7:
        a.e();
        if (true) goto _L3; else goto _L2
_L2:
        return false;
    }
}
