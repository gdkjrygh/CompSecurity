// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzfk

static final class zzCn
    implements Callable
{

    final Runnable zzCn;

    public Object call()
        throws Exception
    {
        return zzeY();
    }

    public Void zzeY()
    {
        zzCn.run();
        return null;
    }

    (Runnable runnable)
    {
        zzCn = runnable;
        super();
    }
}
