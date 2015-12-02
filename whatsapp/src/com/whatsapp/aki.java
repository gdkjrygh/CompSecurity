// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.h;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            App, a8v, au2

final class aki
    implements Runnable
{

    public final boolean a;
    final a8v b;

    aki(a8v a8v1, boolean flag)
    {
        b = a8v1;
        super();
        a = flag;
    }

    public void run()
    {
label0:
        {
            int i = App.am;
            if (a)
            {
                App.b(new String[] {
                    b.a.y.a
                });
            }
            if (App.aQ() && b.a.M != 14)
            {
                if (b.a.b() != null && au2.o && b.a.D < au2.c)
                {
                    App.H().b(h.e(b.a));
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                App.H().b(h.b(b.a));
                if (i == 0)
                {
                    break label0;
                }
            }
            App.au.a7.remove(b.a.y);
        }
    }
}
