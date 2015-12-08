// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzkf;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzc, zzd

public static final class 
{

    public static zzkf zzact;
    public static zzkf zzacu = zzkf.zzs("gms:common:stats:connections:ignored_calling_processes", "");
    public static zzkf zzacv = zzkf.zzs("gms:common:stats:connections:ignored_calling_services", "");
    public static zzkf zzacw = zzkf.zzs("gms:common:stats:connections:ignored_target_processes", "");
    public static zzkf zzacx = zzkf.zzs("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static zzkf zzacy = zzkf.zza("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

    static 
    {
        zzact = zzkf.zza("gms:common:stats:connections:level", Integer.valueOf(zzd.zzacz));
    }
}
