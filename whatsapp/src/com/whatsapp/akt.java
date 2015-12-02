// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.h;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, vp, k2

final class akt
    implements Runnable
{

    final List a;

    akt(List list)
    {
        a = list;
        super();
    }

    public void run()
    {
        List list = App.d(a);
        if (list.size() > 0)
        {
            vp vp1 = new vp(new k2(a));
            App.H().c(h.a(list, vp1));
        }
    }
}
