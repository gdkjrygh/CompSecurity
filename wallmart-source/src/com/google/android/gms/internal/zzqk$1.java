// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzqq, zzqk, zzqr, zzqo, 
//            zzqi

class zzaTC
    implements zzqq
{

    final zzqi zzaTB;
    final a zzaTC;
    final zzqk zzaTD;

    public void zza(Status status, Object obj, Integer integer, long l)
    {
        if (status.isSuccess())
        {
            if (integer == zzqr.zzaUg)
            {
                status = a.zza.zzaTQ;
            } else
            {
                status = a.zza.zzaTP;
            }
            status = new a(Status.zzaaD, zzaTB, null, (c)obj, status, l);
        } else
        {
            status = new a(new Status(16, (new StringBuilder()).append("There is no valid resource for the container: ").append(zzaTB.getContainerId()).toString()), null, a.zza.zzaTP);
        }
        zzaTC.zza(new zzqo(status));
    }

    a(zzqk zzqk1, zzqi zzqi1, a a)
    {
        zzaTD = zzqk1;
        zzaTB = zzqi1;
        zzaTC = a;
        super();
    }
}
