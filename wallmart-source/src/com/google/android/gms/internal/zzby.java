// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzbu, zzbv, zzbx

public final class zzby
{

    public static final zzbu zztV = zzbu.zzP("gads:sdk_core_experiment_id");
    public static final zzbu zztW = zzbu.zzc("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final zzbu zztX = zzbu.zza("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final zzbu zztY = zzbu.zzP("gads:request_builder:singleton_webview_experiment_id");
    public static final zzbu zztZ = zzbu.zza("gads:sdk_use_dynamic_module", Boolean.valueOf(false));
    public static final zzbu zzuA = zzbu.zzc("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final zzbu zzuB = zzbu.zza("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final zzbu zzuC = zzbu.zzc("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final zzbu zzuD = zzbu.zza("gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final zzbu zzuE = zzbu.zza("gads:enable_content_fetching", Boolean.valueOf(true));
    public static final zzbu zzuF = zzbu.zza("gads:content_length_weight", 1);
    public static final zzbu zzuG = zzbu.zza("gads:content_age_weight", 1);
    public static final zzbu zzuH = zzbu.zza("gads:min_content_len", 11);
    public static final zzbu zzuI = zzbu.zza("gads:fingerprint_number", 10);
    public static final zzbu zzuJ = zzbu.zza("gads:sleep_sec", 10);
    public static final zzbu zzuK = zzbu.zza("gad:app_index_enabled", Boolean.valueOf(true));
    public static final zzbu zzuL = zzbu.zzP("gads:kitkat_interstitial_workaround:experiment_id");
    public static final zzbu zzuM = zzbu.zza("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final zzbu zzuN = zzbu.zza("gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final zzbu zzuO = zzbu.zza("gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final zzbu zzuP = zzbu.zzP("gads:interstitial_follow_url:experiment_id");
    public static final zzbu zzuQ = zzbu.zza("gads:analytics_enabled", Boolean.valueOf(true));
    public static final zzbu zzuR = zzbu.zza("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final zzbu zzuS = zzbu.zza("gads:webview_cache_version", 0);
    public static final zzbu zzuT = zzbu.zzQ("gads:pan:experiment_id");
    public static final zzbu zzuU = zzbu.zzc("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final zzbu zzuV = zzbu.zza("gads:ad_manager_creator:enabled", Boolean.valueOf(true));
    public static final zzbu zzuW = zzbu.zza("gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final zzbu zzuX = zzbu.zza("gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final zzbu zzuY = zzbu.zzb("gads:device_info_caching_expiry_ms:expiry", 0x493e0L);
    public static final zzbu zzuZ = zzbu.zza("gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final zzbu zzua = zzbu.zzP("gads:sdk_use_dynamic_module_experiment_id");
    public static final zzbu zzub = zzbu.zza("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final zzbu zzuc = zzbu.zza("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final zzbu zzud = zzbu.zza("gads:block_autoclicks", Boolean.valueOf(false));
    public static final zzbu zzue = zzbu.zzP("gads:block_autoclicks_experiment_id");
    public static final zzbu zzuf = zzbu.zzQ("gads:prefetch:experiment_id");
    public static final zzbu zzug = zzbu.zzP("gads:spam_app_context:experiment_id");
    public static final zzbu zzuh = zzbu.zza("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final zzbu zzui = zzbu.zzP("gads:video_stream_cache:experiment_id");
    public static final zzbu zzuj = zzbu.zza("gads:video_stream_cache:limit_count", 5);
    public static final zzbu zzuk = zzbu.zza("gads:video_stream_cache:limit_space", 0x800000);
    public static final zzbu zzul = zzbu.zza("gads:video_stream_exo_cache:buffer_size", 0x800000);
    public static final zzbu zzum = zzbu.zzb("gads:video_stream_cache:limit_time_sec", 300L);
    public static final zzbu zzun = zzbu.zzb("gads:video_stream_cache:notify_interval_millis", 1000L);
    public static final zzbu zzuo = zzbu.zza("gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final zzbu zzup = zzbu.zza("gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    public static final zzbu zzuq = zzbu.zzc("gads:video:metric_frame_hash_times", "");
    public static final zzbu zzur = zzbu.zzb("gads:video:metric_frame_hash_time_leniency", 500L);
    public static final zzbu zzus = zzbu.zzQ("gads:spam_ad_id_decorator:experiment_id");
    public static final zzbu zzut = zzbu.zza("gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final zzbu zzuu = zzbu.zzQ("gads:looper_for_gms_client:experiment_id");
    public static final zzbu zzuv = zzbu.zza("gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    public static final zzbu zzuw = zzbu.zza("gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    public static final zzbu zzux = zzbu.zza("gads:sw_dynamite:enabled", Boolean.valueOf(true));
    public static final zzbu zzuy = zzbu.zzc("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final zzbu zzuz = zzbu.zzc("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final zzbu zzva = zzbu.zza("gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final zzbu zzvb = zzbu.zza("gads:adid_reporting:enabled", Boolean.valueOf(false));
    public static final zzbu zzvc = zzbu.zza("gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final zzbu zzvd = zzbu.zza("gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
    public static final zzbu zzve = zzbu.zzb("gads:network:cache_prediction_duration_s", 300L);

    public static List zzde()
    {
        return zzp.zzbF().zzde();
    }

    public static void zzw(Context context)
    {
        zzp.zzbG().zzw(context);
    }

}
