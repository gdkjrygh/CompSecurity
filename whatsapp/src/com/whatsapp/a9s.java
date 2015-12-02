// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.EnumSet;

// Referenced classes of package com.whatsapp:
//            App, a8g

final class a9s
    implements Runnable
{

    final boolean a;
    final boolean b;
    final a8g c;
    final boolean d;
    final EnumSet e;
    final String f;

    a9s(boolean flag, String s, boolean flag1, boolean flag2, a8g a8g, EnumSet enumset)
    {
        a = flag;
        f = s;
        b = flag1;
        d = flag2;
        c = a8g;
        e = enumset;
        super();
    }

    public void run()
    {
label0:
        {
            if (a)
            {
                synchronized (App.t())
                {
                    App.a(f, b, d, c, e);
                }
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.a(f, b, d, c, e);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
