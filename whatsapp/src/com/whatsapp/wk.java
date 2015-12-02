// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ConversationsFragment

class wk
    implements Runnable
{

    final ConversationsFragment a;

    wk(ConversationsFragment conversationsfragment)
    {
        a = conversationsfragment;
        super();
    }

    public void run()
    {
        ConversationsFragment.e(a);
    }
}
