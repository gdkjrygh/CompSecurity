// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public final class <init>
{

    final NotifyTransactionStatusRequest zzaJm;

    public NotifyTransactionStatusRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(zzaJm.zzaHZ))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "googleTransactionId is required");
        if (zzaJm.status >= 1 && zzaJm.status <= 8)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "status is an unrecognized value");
        return zzaJm;
    }

    public zzaJm setGoogleTransactionId(String s)
    {
        zzaJm.zzaHZ = s;
        return this;
    }

    public zzaJm setStatus(int i)
    {
        zzaJm.status = i;
        return this;
    }

    private (NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        zzaJm = notifytransactionstatusrequest;
        super();
    }

    zzaJm(NotifyTransactionStatusRequest notifytransactionstatusrequest, zzaJm zzajm)
    {
        this(notifytransactionstatusrequest);
    }
}
