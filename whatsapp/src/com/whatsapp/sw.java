// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            wd, Broadcasts, h

class sw
    implements wd
{

    final Broadcasts a;

    sw(Broadcasts broadcasts)
    {
        a = broadcasts;
        super();
    }

    public void a()
    {
        Broadcasts.a(a).notifyDataSetChanged();
    }

    public void a(String s)
    {
        Broadcasts.a(a).notifyDataSetChanged();
    }

    public void a(Collection collection)
    {
    }

    public void b(String s)
    {
        Broadcasts.a(a).notifyDataSetChanged();
    }

    public void c(String s)
    {
        Broadcasts.a(a).notifyDataSetChanged();
    }

    public void d(String s)
    {
        Broadcasts.a(a).notifyDataSetChanged();
    }
}
