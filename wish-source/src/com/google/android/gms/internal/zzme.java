// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzme
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
    public static final class zza
    {

        private boolean zzaBI;
        private boolean zzaBJ;
        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaBK;
        private String zzayN;

        public zzme zzwg()
        {
            return new zzme(zzaBI, zzaBJ, zzayN, zzaBK);
        }

        public zza()
        {
        }
    }


    public static final zzme zzaBD = (new zza()).zzwg();
    private final boolean zzaBE;
    private final boolean zzaBF;
    private final String zzaBG;
    private final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzaBH;

    private zzme(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks)
    {
        zzaBE = flag;
        zzaBF = flag1;
        zzaBG = s;
        zzaBH = serverauthcodecallbacks;
    }


    public String zzvv()
    {
        return zzaBG;
    }

    public boolean zzwd()
    {
        return zzaBE;
    }

    public boolean zzwe()
    {
        return zzaBF;
    }

    public com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzwf()
    {
        return zzaBH;
    }

}
