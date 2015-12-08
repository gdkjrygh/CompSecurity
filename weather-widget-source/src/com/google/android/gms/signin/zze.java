// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import com.google.android.gms.common.internal.zzx;

public final class zze
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
    public static final class zza
    {

        private String zzaLe;
        private boolean zzaOh;
        private boolean zzaOi;
        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaOj;

        private String zzem(String s)
        {
            zzx.zzv(s);
            boolean flag;
            if (zzaLe == null || zzaLe.equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzb(flag, "two different server client ids provided");
            return s;
        }

        public zza zza(String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
        {
            zzaOh = true;
            zzaOi = true;
            zzaLe = zzem(s);
            zzaOj = (com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks)zzx.zzv(serverauthcodecallbacks);
            return this;
        }

        public zze zzzr()
        {
            return new zze(zzaOh, zzaOi, zzaLe, zzaOj);
        }

        public zza()
        {
        }
    }


    public static final zze zzaOd = (new zza()).zzzr();
    private final String zzRU;
    private final boolean zzaOe;
    private final boolean zzaOf;
    private final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaOg;

    private zze(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
    {
        zzaOe = flag;
        zzaOf = flag1;
        zzRU = s;
        zzaOg = serverauthcodecallbacks;
    }


    public String zzlG()
    {
        return zzRU;
    }

    public boolean zzzo()
    {
        return zzaOe;
    }

    public boolean zzzp()
    {
        return zzaOf;
    }

    public com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzzq()
    {
        return zzaOg;
    }

}
