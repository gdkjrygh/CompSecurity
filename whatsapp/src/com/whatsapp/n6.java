// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            og, App, BlockList

class n6
    implements Runnable
{

    final BlockList a;
    final og b;

    n6(BlockList blocklist, og og1)
    {
        a = blocklist;
        b = og1;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.a(a, false, b.a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
