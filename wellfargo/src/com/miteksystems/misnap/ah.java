// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            t, b

final class ah
    implements Runnable
{

    final t a;

    ah(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        if (t.j(a) != null && t.j(a).a())
        {
            t.j(a).c();
        }
    }
}
