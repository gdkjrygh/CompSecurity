// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, Conversations

class oj
    implements Runnable
{

    final Conversations a;
    final String b;

    oj(Conversations conversations, String s)
    {
        a = conversations;
        b = s;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.v(b);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
