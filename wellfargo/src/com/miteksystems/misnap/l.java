// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            k

final class l
    implements Runnable
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public final void run()
    {
        (new StringBuilder("Focuing req received:focussing?")).append(k.a(a)).toString();
        if (k.b(a) != null && !k.a(a))
        {
            a.c();
        }
    }
}
