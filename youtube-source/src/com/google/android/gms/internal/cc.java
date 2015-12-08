// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ca, dc

final class cc
    implements Runnable
{

    final dc a;
    final ca b;

    cc(ca ca1, dc dc)
    {
        b = ca1;
        a = dc;
        super();
    }

    public final void run()
    {
        synchronized (ca.a(b))
        {
            ca.b(b);
            dc dc = a;
        }
    }
}
