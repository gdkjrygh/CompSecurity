// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.bk;

// Referenced classes of package com.whatsapp:
//            adk, BroadcastDetails, a91

class ado extends adk
{

    final BroadcastDetails a;

    ado(BroadcastDetails broadcastdetails)
    {
        a = broadcastdetails;
        super();
    }

    public void a(c4 c4_1, int i)
    {
        if (c4_1 != null && c4_1.y.c.equals(BroadcastDetails.d(a).y.c) && bk.a(com.whatsapp.BroadcastDetails.a(a), c4_1.y.a) && c4_1.y.b)
        {
            BroadcastDetails.c(a).notifyDataSetChanged();
        }
    }
}
