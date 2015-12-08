// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzhq

public final class zzhs
{
    private static abstract class zza extends zzhq
    {

        public void onStop()
        {
        }

        private zza()
        {
        }

    }

    public static interface zzb
    {

        public abstract void zzd(Bundle bundle);
    }


    static SharedPreferences zzH(Context context)
    {
        return zzv(context);
    }

    public static Future zza(Context context, int i)
    {
        return (new zza(context, i) {

            final int zzHx;
            final Context zzrn;

            public void zzdG()
            {
                android.content.SharedPreferences.Editor editor = zzhs.zzH(zzrn).edit();
                editor.putInt("webview_cache_version", zzHx);
                editor.apply();
            }

            
            {
                zzrn = context;
                zzHx = i;
                super();
            }
        }).zzgn();
    }

    public static Future zza(Context context, zzb zzb1)
    {
        return (new zza(context, zzb1) {

            final zzb zzHw;
            final Context zzrn;

            public void zzdG()
            {
                SharedPreferences sharedpreferences = zzhs.zzH(zzrn);
                Bundle bundle = new Bundle();
                bundle.putBoolean("use_https", sharedpreferences.getBoolean("use_https", true));
                if (zzHw != null)
                {
                    zzHw.zzd(bundle);
                }
            }

            
            {
                zzrn = context;
                zzHw = zzb1;
                super();
            }
        }).zzgn();
    }

    public static Future zza(Context context, boolean flag)
    {
        return (new zza(context, flag) {

            final boolean zzHv;
            final Context zzrn;

            public void zzdG()
            {
                android.content.SharedPreferences.Editor editor = zzhs.zzH(zzrn).edit();
                editor.putBoolean("use_https", zzHv);
                editor.apply();
            }

            
            {
                zzrn = context;
                zzHv = flag;
                super();
            }
        }).zzgn();
    }

    public static Future zzb(Context context, zzb zzb1)
    {
        return (new zza(context, zzb1) {

            final zzb zzHw;
            final Context zzrn;

            public void zzdG()
            {
                SharedPreferences sharedpreferences = zzhs.zzH(zzrn);
                Bundle bundle = new Bundle();
                bundle.putInt("webview_cache_version", sharedpreferences.getInt("webview_cache_version", 0));
                if (zzHw != null)
                {
                    zzHw.zzd(bundle);
                }
            }

            
            {
                zzrn = context;
                zzHw = zzb1;
                super();
            }
        }).zzgn();
    }

    private static SharedPreferences zzv(Context context)
    {
        return context.getSharedPreferences("admob", 0);
    }
}
