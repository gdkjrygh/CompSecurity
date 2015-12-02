// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            a92, GroupChatInfo

class atv
    implements a92
{

    final GroupChatInfo a;

    atv(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void a(String s)
    {
        GroupChatInfo.c(a, s);
    }
}
