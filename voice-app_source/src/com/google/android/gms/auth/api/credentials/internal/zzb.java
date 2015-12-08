// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class zzb
    implements CredentialRequestResult
{

    private final Status zzOt;
    private final Credential zzPb;

    public zzb(Status status, Credential credential)
    {
        zzOt = status;
        zzPb = credential;
    }

    public static zzb zzj(Status status)
    {
        return new zzb(status, null);
    }

    public Credential getCredential()
    {
        return zzPb;
    }

    public Status getStatus()
    {
        return zzOt;
    }
}
