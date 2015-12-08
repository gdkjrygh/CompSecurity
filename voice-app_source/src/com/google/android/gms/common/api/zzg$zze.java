// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, Status

static interface ntKey
{

    public abstract void cancel();

    public abstract void forceFailureUnlessReady(Status status);

    public abstract void zza(ntKey ntkey);

    public abstract void zzb(nt nt)
        throws DeadObjectException;

    public abstract ntKey zzms();

    public abstract int zzmv();

    public abstract void zzr(Status status);
}
