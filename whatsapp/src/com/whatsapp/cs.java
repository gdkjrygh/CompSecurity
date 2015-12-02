// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.whatsapp:
//            aoz, q7

class cs
    implements Runnable
{

    final CountDownLatch a;
    final aoz b;
    final c4 c;

    cs(aoz aoz1, c4 c4, CountDownLatch countdownlatch)
    {
        b = aoz1;
        c = c4;
        a = countdownlatch;
        super();
    }

    public void run()
    {
        aoz.c(b).b(c);
        a.countDown();
    }
}
