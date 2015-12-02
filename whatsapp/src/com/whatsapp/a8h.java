// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            a8e, a9r, GroupChatInfo, a1e

class a8h extends a8e
{

    final a9r d;

    a8h(a9r a9r1, String s)
    {
        d = a9r1;
        super(s);
    }

    public void a()
    {
        super.a();
        GroupChatInfo.c(d.a);
    }

    public void a(int i)
    {
        super.a(i);
        GroupChatInfo.c(d.a);
    }

    public void run()
    {
        super.run();
        a1e.g.c(GroupChatInfo.g(d.a));
        GroupChatInfo.c(d.a);
    }
}
