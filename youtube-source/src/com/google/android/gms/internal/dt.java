// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bp, ds

final class dt
    implements Runnable
{

    final bp a;
    final ds b;

    dt(ds ds, bp bp1)
    {
        b = ds;
        a = bp1;
        super();
    }

    public final void run()
    {
        a.j();
    }
}
