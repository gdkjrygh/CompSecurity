// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            m4, Conversation, og, App

class nh
    implements Runnable
{

    final m4 a;

    nh(m4 m4_1)
    {
        a = m4_1;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.a(a.a, Conversation.I(a.a), a.a.aD.a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
