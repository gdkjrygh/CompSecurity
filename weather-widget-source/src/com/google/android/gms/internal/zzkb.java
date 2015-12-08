// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

class zzkb
    implements com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
{

    private Status zzQA;
    private ProxyResponse zzRN;

    public zzkb(ProxyResponse proxyresponse)
    {
        zzRN = proxyresponse;
        zzQA = Status.zzaaD;
    }

    public zzkb(Status status)
    {
        zzQA = status;
    }

    public ProxyResponse getResponse()
    {
        return zzRN;
    }

    public Status getStatus()
    {
        return zzQA;
    }
}
