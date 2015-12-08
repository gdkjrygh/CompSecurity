// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.a:
//            d, p

class e
    implements Runnable
{

    final d a;
    private final p b;

    e(d d1, p p)
    {
        a = d1;
        b = p;
        super();
    }

    public void run()
    {
        try
        {
            d.a(a).put(b);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
