// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            Conversation, ConversationContentLayout

class auj
    implements Runnable
{

    final Conversation a;

    auj(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void run()
    {
        Conversation.K(a).setUnfreezeHeight();
        Conversation.K(a).requestLayout();
    }
}
