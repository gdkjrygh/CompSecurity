// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            qu, ConversationRowVideo

class aj
    implements Runnable
{

    final qu a;

    aj(qu qu1)
    {
        a = qu1;
        super();
    }

    public void run()
    {
        if (ConversationRowVideo.a(a.d) == a)
        {
            ConversationRowVideo.a(a.d, null);
        }
    }
}
