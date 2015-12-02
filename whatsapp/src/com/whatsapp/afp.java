// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ConversationRow

class afp
    implements Runnable
{

    final ConversationRow a;

    afp(ConversationRow conversationrow)
    {
        a = conversationrow;
        super();
    }

    public void run()
    {
        a.a();
    }
}
