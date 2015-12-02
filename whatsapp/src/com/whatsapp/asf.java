// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            a8a, a9r, GroupChatInfo, a1e

class asf extends a8a
{

    final a9r e;

    asf(a9r a9r1, String s, long l)
    {
        e = a9r1;
        super(s, l);
    }

    public void a()
    {
        super.a();
        GroupChatInfo.c(e.a);
    }

    public void a(int i)
    {
        super.a(i);
        GroupChatInfo.c(e.a);
    }

    public void run()
    {
        super.run();
        a1e.g.a(GroupChatInfo.g(e.a), 0L);
        GroupChatInfo.c(e.a);
    }
}
