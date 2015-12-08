// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;


// Referenced classes of package com.google.android.gms.cast.internal:
//            zze, ApplicationStatus

class zzUN
    implements Runnable
{

    final zze zzUJ;
    final zzUN zzUL;
    final ApplicationStatus zzUN;

    public void run()
    {
        zze.zza(zzUJ, zzUN);
    }

    nStatus(nStatus nstatus, zze zze1, ApplicationStatus applicationstatus)
    {
        zzUL = nstatus;
        zzUJ = zze1;
        zzUN = applicationstatus;
        super();
    }
}
