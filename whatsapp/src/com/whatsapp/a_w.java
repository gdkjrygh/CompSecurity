// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            Conversation

class a_w
    implements Runnable
{

    final Conversation a;

    a_w(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void run()
    {
        Conversation.a(a, null);
    }
}
