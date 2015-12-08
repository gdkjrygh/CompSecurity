// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzoq;
import com.google.android.gms.nearby.bootstrap.zza;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.messages.internal.zzg;
import com.google.android.gms.nearby.messages.internal.zzh;
import com.google.android.gms.nearby.messages.zzc;
import com.google.android.gms.nearby.messages.zzd;
import com.google.android.gms.nearby.sharing.internal.zzi;
import com.google.android.gms.nearby.sharing.zze;

public final class Nearby
{

    public static final Api CONNECTIONS_API;
    public static final Connections Connections = new zzoq();
    public static final Api zzaEX;
    public static final zzc zzaEY = new zzg();
    public static final zzd zzaEZ = new zzh();
    public static final Api zzaFa;
    public static final com.google.android.gms.nearby.sharing.zzd zzaFb = new com.google.android.gms.nearby.sharing.internal.zzh();
    public static final zze zzaFc = new zzi();
    public static final Api zzaFd;
    public static final zza zzaFe = new zzoi();

    private Nearby()
    {
    }

    static 
    {
        CONNECTIONS_API = new Api("Nearby.CONNECTIONS_API", zzoq.zzNY, zzoq.zzNX, new Scope[0]);
        zzaEX = new Api("Nearby.MESSAGES_API", zzg.zzNY, zzg.zzNX, new Scope[0]);
        zzaFa = new Api("Nearby.SHARING_API", com.google.android.gms.nearby.sharing.internal.zzh.zzNY, com.google.android.gms.nearby.sharing.internal.zzh.zzNX, new Scope[0]);
        zzaFd = new Api("Nearby.BOOTSTRAP_API", zzoi.zzNY, zzoi.zzNX, new Scope[0]);
    }
}
