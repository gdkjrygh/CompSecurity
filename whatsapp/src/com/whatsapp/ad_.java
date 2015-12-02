// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            adk, Broadcasts, h, og

class ad_ extends adk
{

    final Broadcasts a;

    ad_(Broadcasts broadcasts)
    {
        a = broadcasts;
        super();
    }

    public void a(c4 c4_1, int i)
    {
        if (c4_1 != null && c4_1.E && c4_1.y.b)
        {
            com.whatsapp.Broadcasts.a(a).notifyDataSetChanged();
        }
    }

    public void a(String s)
    {
        if (og.b(s))
        {
            com.whatsapp.Broadcasts.a(a).a();
        }
    }

    public void b(c4 c4_1, int i)
    {
        if (c4_1 != null && c4_1.E && c4_1.y.b)
        {
            com.whatsapp.Broadcasts.a(a).a();
        }
    }
}
