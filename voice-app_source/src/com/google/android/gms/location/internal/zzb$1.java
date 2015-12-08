// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.DeadObjectException;
import android.os.IInterface;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzn, zzb, zzg

class zzayx
    implements zzn
{

    final zzb zzayx;

    public void zznL()
    {
        zzb.zza(zzayx);
    }

    public IInterface zznM()
        throws DeadObjectException
    {
        return zzut();
    }

    public zzg zzut()
        throws DeadObjectException
    {
        return (zzg)zzayx.zznM();
    }

    (zzb zzb1)
    {
        zzayx = zzb1;
        super();
    }
}
