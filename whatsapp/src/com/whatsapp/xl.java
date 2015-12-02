// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            wc, GroupChatInfo

class xl extends wc
{

    final GroupChatInfo j;

    xl(GroupChatInfo groupchatinfo, String s, String s1, Vector vector, int i)
    {
        j = groupchatinfo;
        super(s, s1, vector, i);
    }

    public void b()
    {
        GroupChatInfo.q(j);
    }
}
