// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzk

static final class zzaZO
    implements com.google.android.gms.wearable.pi.OpenChannelResult
{

    private final Status zzQA;
    private final Channel zzaZO;

    public Channel getChannel()
    {
        return zzaZO;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    annelResult(Status status, Channel channel)
    {
        zzQA = (Status)zzx.zzv(status);
        zzaZO = channel;
    }
}
