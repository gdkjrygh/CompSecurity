// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import android.location.LocationManager;

// Referenced classes of package io.wecloud.message:
//            ClientService

class c
    implements Runnable
{

    final ClientService a;

    c(ClientService clientservice)
    {
        a = clientservice;
        super();
    }

    public void run()
    {
        if (!ClientService.g(a))
        {
            ClientService.e(a).removeUpdates(ClientService.f(a));
            io.wecloud.message.e.c.b(ClientService.c(), "get location timeout!");
        }
    }
}
