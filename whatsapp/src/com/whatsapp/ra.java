// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.notification.l;

// Referenced classes of package com.whatsapp:
//            App, pc

class ra
    implements Runnable
{

    final pc a;

    ra(pc pc1)
    {
        a = pc1;
        super();
    }

    public void run()
    {
        l.d().c();
        App.S();
        a.a.a();
    }
}
