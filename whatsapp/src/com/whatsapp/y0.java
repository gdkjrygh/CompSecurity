// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.bk;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            wd, BroadcastDetails, a91

class y0
    implements wd
{

    final BroadcastDetails a;

    y0(BroadcastDetails broadcastdetails)
    {
        a = broadcastdetails;
        super();
    }

    public void a()
    {
        BroadcastDetails.c(a).notifyDataSetChanged();
    }

    public void a(String s)
    {
        if (bk.a(BroadcastDetails.a(a), s))
        {
            BroadcastDetails.c(a).notifyDataSetChanged();
        }
    }

    public void a(Collection collection)
    {
    }

    public void b(String s)
    {
        if (bk.a(BroadcastDetails.a(a), s))
        {
            BroadcastDetails.c(a).notifyDataSetChanged();
        }
    }

    public void c(String s)
    {
        if (bk.a(BroadcastDetails.a(a), s))
        {
            BroadcastDetails.c(a).notifyDataSetChanged();
        }
    }

    public void d(String s)
    {
        if (bk.a(BroadcastDetails.a(a), s))
        {
            BroadcastDetails.c(a).notifyDataSetChanged();
        }
    }
}
