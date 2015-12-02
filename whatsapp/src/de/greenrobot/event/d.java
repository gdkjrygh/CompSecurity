// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


// Referenced classes of package de.greenrobot.event:
//            l, g

class d extends ThreadLocal
{

    final g a;

    d(g g)
    {
        a = g;
        super();
    }

    protected l a()
    {
        return new l();
    }

    protected Object initialValue()
    {
        return a();
    }
}
