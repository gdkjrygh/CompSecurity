// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzhk

static final class zzGg
    implements Callable
{

    final Runnable zzGg;

    public Object call()
        throws Exception
    {
        return zzgk();
    }

    public Void zzgk()
    {
        zzGg.run();
        return null;
    }

    (Runnable runnable)
    {
        zzGg = runnable;
        super();
    }
}
