// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.notification.l;

// Referenced classes of package com.whatsapp:
//            HomeActivity

class o3
    implements Runnable
{

    final HomeActivity a;

    o3(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }

    public void run()
    {
        if (HomeActivity.c(a) == 0)
        {
            l.d().c();
        }
    }
}
