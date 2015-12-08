// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzkq;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzd

public final class zzc
{
    public static final class zza
    {

        public static zzkq zzafD;
        public static zzkq zzafE = zzkq.zzu("gms:common:stats:connections:ignored_calling_processes", "");
        public static zzkq zzafF = zzkq.zzu("gms:common:stats:connections:ignored_calling_services", "");
        public static zzkq zzafG = zzkq.zzu("gms:common:stats:connections:ignored_target_processes", "");
        public static zzkq zzafH = zzkq.zzu("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        public static zzkq zzafI = zzkq.zza("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

        static 
        {
            zzafD = zzkq.zza("gms:common:stats:connections:level", Integer.valueOf(zzd.LOG_LEVEL_OFF));
        }
    }

    public static final class zzb
    {

        public static zzkq zzafD;
        public static zzkq zzafI = zzkq.zza("gms:common:stats:wakelocks:time_out_duration", Long.valueOf(0x927c0L));

        static 
        {
            zzafD = zzkq.zza("gms:common:stats:wakeLocks:level", Integer.valueOf(zzd.LOG_LEVEL_OFF));
        }
    }


    public static zzkq zzafC = zzkq.zza("gms:common:stats:max_num_of_events", Integer.valueOf(100));

}
