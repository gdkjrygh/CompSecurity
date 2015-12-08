// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzkq;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzm, zzo

public final class zzy
{
    public static final class zza
    {

        private final Object zzNP;
        private final zzkq zzNQ;
        private Object zzNR;

        static zza zza(String s, float f)
        {
            return zza(s, f, f);
        }

        static zza zza(String s, float f, float f1)
        {
            return new zza(zzkq.zza(s, Float.valueOf(f1)), Float.valueOf(f));
        }

        static zza zza(String s, int i, int j)
        {
            return new zza(zzkq.zza(s, Integer.valueOf(j)), Integer.valueOf(i));
        }

        static zza zza(String s, long l, long l1)
        {
            return new zza(zzkq.zza(s, Long.valueOf(l1)), Long.valueOf(l));
        }

        static zza zza(String s, boolean flag, boolean flag1)
        {
            return new zza(zzkq.zzg(s, flag1), Boolean.valueOf(flag));
        }

        static zza zzc(String s, long l)
        {
            return zza(s, l, l);
        }

        static zza zzd(String s, String s1, String s2)
        {
            return new zza(zzkq.zzu(s, s2), s1);
        }

        static zza zzd(String s, boolean flag)
        {
            return zza(s, flag, flag);
        }

        static zza zze(String s, int i)
        {
            return zza(s, i, i);
        }

        static zza zzn(String s, String s1)
        {
            return zzd(s, s1, s1);
        }

        public Object get()
        {
            if (zzNR != null)
            {
                return zzNR;
            }
            if (zzd.zzacF && zzkq.isInitialized())
            {
                return zzNQ.zznN();
            } else
            {
                return zzNP;
            }
        }

        private zza(zzkq zzkq1, Object obj)
        {
            zzx.zzv(zzkq1);
            zzNQ = zzkq1;
            zzNP = obj;
        }
    }


    public static zza zzMY = com.google.android.gms.analytics.internal.zza.zzd("analytics.service_enabled", false);
    public static zza zzMZ = com.google.android.gms.analytics.internal.zza.zzd("analytics.service_client_enabled", true);
    public static zza zzNA = zza.zze("analytics.batch_retry_interval.seconds.k", 3600);
    public static zza zzNB = zza.zzc("analytics.service_monitor_interval", 0x5265c00L);
    public static zza zzNC = zza.zze("analytics.http_connection.connect_timeout_millis", 60000);
    public static zza zzND = zza.zze("analytics.http_connection.read_timeout_millis", 61000);
    public static zza zzNE = zza.zzc("analytics.campaigns.time_limit", 0x5265c00L);
    public static zza zzNF = zza.zzn("analytics.first_party_experiment_id", "");
    public static zza zzNG = zza.zze("analytics.first_party_experiment_variant", 0);
    public static zza zzNH = com.google.android.gms.analytics.internal.zza.zzd("analytics.test.disable_receiver", false);
    public static zza zzNI = zza.zza("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    public static zza zzNJ = zza.zzc("analytics.service_client.connect_timeout_millis", 5000L);
    public static zza zzNK = zza.zzc("analytics.service_client.second_connect_delay_millis", 5000L);
    public static zza zzNL = zza.zzc("analytics.service_client.unexpected_reconnect_millis", 60000L);
    public static zza zzNM = zza.zzc("analytics.service_client.reconnect_throttle_millis", 0x1b7740L);
    public static zza zzNN = zza.zzc("analytics.monitoring.sample_period_millis", 0x5265c00L);
    public static zza zzNO = zza.zzc("analytics.initialization_warning_threshold", 5000L);
    public static zza zzNa = com.google.android.gms.analytics.internal.zza.zzd("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static zza zzNb = zza.zzc("analytics.max_tokens", 60L);
    public static zza zzNc = zza.zza("analytics.tokens_per_sec", 0.5F);
    public static zza zzNd = zza.zza("analytics.max_stored_hits", 2000, 20000);
    public static zza zzNe = zza.zze("analytics.max_stored_hits_per_app", 2000);
    public static zza zzNf = zza.zze("analytics.max_stored_properties_per_app", 100);
    public static zza zzNg = zza.zza("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
    public static zza zzNh = zza.zza("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    public static zza zzNi = zza.zzc("analytics.min_local_dispatch_millis", 0x1d4c0L);
    public static zza zzNj = zza.zzc("analytics.max_local_dispatch_millis", 0x6ddd00L);
    public static zza zzNk = zza.zzc("analytics.dispatch_alarm_millis", 0x6ddd00L);
    public static zza zzNl = zza.zzc("analytics.max_dispatch_alarm_millis", 0x1ee6280L);
    public static zza zzNm = zza.zze("analytics.max_hits_per_dispatch", 20);
    public static zza zzNn = zza.zze("analytics.max_hits_per_batch", 20);
    public static zza zzNo = zza.zzn("analytics.insecure_host", "http://www.google-analytics.com");
    public static zza zzNp = zza.zzn("analytics.secure_host", "https://ssl.google-analytics.com");
    public static zza zzNq = zza.zzn("analytics.simple_endpoint", "/collect");
    public static zza zzNr = zza.zzn("analytics.batching_endpoint", "/batch");
    public static zza zzNs = zza.zze("analytics.max_get_length", 2036);
    public static zza zzNt;
    public static zza zzNu;
    public static zza zzNv = zza.zze("analytics.max_hits_per_request.k", 20);
    public static zza zzNw = zza.zze("analytics.max_hit_length.k", 8192);
    public static zza zzNx = zza.zze("analytics.max_post_length.k", 8192);
    public static zza zzNy = zza.zze("analytics.max_batch_post_length", 8192);
    public static zza zzNz = zza.zzn("analytics.fallback_responses.k", "404,502");

    static 
    {
        zzNt = com.google.android.gms.analytics.internal.zza.zzd("analytics.batching_strategy.k", zzm.zzMD.name(), zzm.zzMD.name());
        zzNu = zza.zzn("analytics.compression_strategy.k", zzo.zzMK.name());
    }
}
