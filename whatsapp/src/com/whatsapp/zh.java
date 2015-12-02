// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            x1, GroupChatInfo

class zh
    implements Runnable
{

    final int a;
    final x1 b;

    zh(x1 x1_1, int i)
    {
        b = x1_1;
        a = i;
        super();
    }

    public void run()
    {
        GroupChatInfo.a(b.j, a);
    }
}
