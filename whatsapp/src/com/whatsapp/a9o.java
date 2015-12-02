// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            Conversation, og, App

class a9o
    implements Runnable
{

    final Conversation a;

    a9o(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.a(a, Conversation.I(a), a.aD.a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
