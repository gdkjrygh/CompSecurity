// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, Conversations

class u6
    implements Runnable
{

    final String a;
    final Conversations b;

    u6(Conversations conversations, String s)
    {
        b = conversations;
        a = s;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.a(a, null);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
