// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            aun, GroupChatInfo

class q5
    implements aun
{

    final GroupChatInfo a;

    q5(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void a(String s)
    {
        if (s.equals(GroupChatInfo.g(a)))
        {
            GroupChatInfo.c(a);
        }
    }
}
