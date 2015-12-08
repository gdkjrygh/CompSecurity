// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import io.wecloud.message.f.a;
import java.util.TimerTask;

// Referenced classes of package io.wecloud.message:
//            e, ClientService

class f extends TimerTask
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void run()
    {
        if (io.wecloud.message.ClientService.a(io.wecloud.message.e.a(a), io.wecloud.message.e.a(a).getApplicationContext()))
        {
            io.wecloud.message.f.a.a(io.wecloud.message.e.a(a).getApplicationContext()).a();
        }
    }
}
