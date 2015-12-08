// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            de

final class df
    implements Runnable
{

    final de a;

    df(de de1)
    {
        a = de1;
        super();
    }

    public final void run()
    {
        de.a(a, Thread.currentThread());
        a.a();
    }
}
