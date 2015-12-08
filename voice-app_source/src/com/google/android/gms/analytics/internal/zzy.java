// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzkf;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzm, zzo

public final class zzy
{
    public static final class zza
    {

        private final Object zzLQ;
        private final zzkf zzLR;
        private Object zzLS;

        static zza zza(String s, float f)
        {
            return zza(s, f, f);
        }

        static zza zza(String s, float f, float f1)
        {
            return new zza(zzkf.zza(s, Float.valueOf(f1)), Float.valueOf(f));
        }

        static zza zza(String s, int i, int j)
        {
            return new zza(zzkf.zza(s, Integer.valueOf(j)), Integer.valueOf(i));
        }

        static zza zza(String s, long l, long l1)
        {
            return new zza(zzkf.zza(s, Long.valueOf(l1)), Long.valueOf(l));
        }

        static zza zza(String s, boolean flag, boolean flag1)
        {
            return new zza(zzkf.zzg(s, flag1), Boolean.valueOf(flag));
        }

        static zza zzc(String s, long l)
        {
            return zza(s, l, l);
        }

        static zza zzd(String s, String s1, String s2)
        {
            return new zza(zzkf.zzs(s, s2), s1);
        }

        static zza zzd(String s, boolean flag)
        {
            return zza(s, flag, flag);
        }

        static zza zze(String s, int i)
        {
            return zza(s, i, i);
        }

        static zza zzm(String s, String s1)
        {
            return zzd(s, s1, s1);
        }

        public Object get()
        {
            if (zzLS != null)
            {
                return zzLS;
            }
            if (zzd.zzZR && zzkf.isInitialized())
            {
                return zzLR.zzmZ();
            } else
            {
                return zzLQ;
            }
        }

        private zza(zzkf zzkf1, Object obj)
        {
            zzu.zzu(zzkf1);
            zzLR = zzkf1;
            zzLQ = obj;
        }
    }


    public static zza zzKZ = com.google.android.gms.analytics.internal.zza.zzd("analytics.service_enabled", false);
    public static zza zzLA = zza.zzm("analytics.fallback_responses.k", "404,502");
    public static zza zzLB = zza.zze("analytics.batch_retry_interval.seconds.k", 3600);
    public static zza zzLC = zza.zzc("analytics.service_monitor_interval", 0x5265c00L);
    public static zza zzLD = zza.zze("analytics.http_connection.connect_timeout_millis", 60000);
    public static zza zzLE = zza.zze("analytics.http_connection.read_timeout_millis", 61000);
    public static zza zzLF = zza.zzc("analytics.campaigns.time_limit", 0x5265c00L);
    public static zza zzLG = zza.zzm("analytics.first_party_experiment_id", "");
    public static zza zzLH = zza.zze("analytics.first_party_experiment_variant", 0);
    public static zza zzLI = com.google.android.gms.analytics.internal.zza.zzd("analytics.test.disable_receiver", false);
    public static zza zzLJ = zza.zza("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    public static zza zzLK = zza.zzc("analytics.service_client.connect_timeout_millis", 5000L);
    public static zza zzLL = zza.zzc("analytics.service_client.second_connect_delay_millis", 5000L);
    public static zza zzLM = zza.zzc("analytics.service_client.unexpected_reconnect_millis", 60000L);
    public static zza zzLN = zza.zzc("analytics.service_client.reconnect_throttle_millis", 0x1b7740L);
    public static zza zzLO = zza.zzc("analytics.monitoring.sample_period_millis", 0x5265c00L);
    public static zza zzLP = zza.zzc("analytics.initialization_warning_threshold", 5000L);
    public static zza zzLa = com.google.android.gms.analytics.internal.zza.zzd("analytics.service_client_enabled", true);
    public static zza zzLb = com.google.android.gms.analytics.internal.zza.zzd("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static zza zzLc = zza.zzc("analytics.max_tokens", 60L);
    public static zza zzLd = zza.zza("analytics.tokens_per_sec", 0.5F);
    public static zza zzLe = zza.zza("analytics.max_stored_hits", 2000, 20000);
    public static zza zzLf = zza.zze("analytics.max_stored_hits_per_app", 2000);
    public static zza zzLg = zza.zze("analytics.max_stored_properties_per_app", 100);
    public static zza zzLh = zza.zza("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
    public static zza zzLi = zza.zza("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    public static zza zzLj = zza.zzc("analytics.min_local_dispatch_millis", 0x1d4c0L);
    public static zza zzLk = zza.zzc("analytics.max_local_dispatch_millis", 0x6ddd00L);
    public static zza zzLl = zza.zzc("analytics.dispatch_alarm_millis", 0x6ddd00L);
    public static zza zzLm = zza.zzc("analytics.max_dispatch_alarm_millis", 0x1ee6280L);
    public static zza zzLn = zza.zze("analytics.max_hits_per_dispatch", 20);
    public static zza zzLo = zza.zze("analytics.max_hits_per_batch", 20);
    public static zza zzLp = zza.zzm("analytics.insecure_host", "http://www.google-analytics.com");
    public static zza zzLq = zza.zzm("analytics.secure_host", "https://ssl.google-analytics.com");
    public static zza zzLr = zza.zzm("analytics.simple_endpoint", "/collect");
    public static zza zzLs = zza.zzm("analytics.batching_endpoint", "/batch");
    public static zza zzLt = zza.zze("analytics.max_get_length", 2036);
    public static zza zzLu;
    public static zza zzLv;
    public static zza zzLw = zza.zze("analytics.max_hits_per_request.k", 20);
    public static zza zzLx = zza.zze("analytics.max_hit_length.k", 8192);
    public static zza zzLy = zza.zze("analytics.max_post_length.k", 8192);
    public static zza zzLz = zza.zze("analytics.max_batch_post_length", 8192);

    static 
    {
        zzLu = com.google.android.gms.analytics.internal.zza.zzd("analytics.batching_strategy.k", zzm.zzKD.name(), zzm.zzKD.name());
        zzLv = zza.zzm("analytics.compression_strategy.k", zzo.zzKL.name());
    }
}
