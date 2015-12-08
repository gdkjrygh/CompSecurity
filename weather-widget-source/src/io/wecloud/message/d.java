// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import io.wecloud.message.g.e;
import java.util.TimerTask;

// Referenced classes of package io.wecloud.message:
//            ClientService, j

class d extends TimerTask
{

    final ClientService a;

    d(ClientService clientservice)
    {
        a = clientservice;
        super();
    }

    public void run()
    {
        j.c(a.getApplicationContext());
        if (ClientService.c(a) != null)
        {
            ClientService.c(a).a(ClientService.h(a));
        }
    }
}
