// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;

public final class zzpt
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
    public static final class zza
    {

        private String zzaHb;
        private boolean zzaJV;
        private boolean zzaJW;
        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaJX;

        private String zzea(String s)
        {
            zzu.zzu(s);
            boolean flag;
            if (zzaHb == null || zzaHb.equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "two different server client ids provided");
            return s;
        }

        public zza zza(String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
        {
            zzaJV = true;
            zzaJW = true;
            zzaHb = zzea(s);
            zzaJX = (com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks)zzu.zzu(serverauthcodecallbacks);
            return this;
        }

        public zzpt zzyc()
        {
            return new zzpt(zzaJV, zzaJW, zzaHb, zzaJX);
        }

        public zza()
        {
        }
    }


    public static final zzpt zzaJQ = (new zza()).zzyc();
    private final boolean zzaJR;
    private final boolean zzaJS;
    private final String zzaJT;
    private final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaJU;

    private zzpt(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
    {
        zzaJR = flag;
        zzaJS = flag1;
        zzaJT = s;
        zzaJU = serverauthcodecallbacks;
    }


    public boolean zzxZ()
    {
        return zzaJR;
    }

    public String zzxt()
    {
        return zzaJT;
    }

    public boolean zzya()
    {
        return zzaJS;
    }

    public com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzyb()
    {
        return zzaJU;
    }

}
