// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzht

static final class zzHA
    implements Callable
{

    final Runnable zzHA;

    public Object call()
        throws Exception
    {
        return zzgp();
    }

    public Void zzgp()
    {
        zzHA.run();
        return null;
    }

    (Runnable runnable)
    {
        zzHA = runnable;
        super();
    }
}
