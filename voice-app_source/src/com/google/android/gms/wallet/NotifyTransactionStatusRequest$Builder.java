// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public final class <init>
{

    final NotifyTransactionStatusRequest zzaRx;

    public NotifyTransactionStatusRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(zzaRx.zzaQm))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "googleTransactionId is required");
        if (zzaRx.status >= 1 && zzaRx.status <= 8)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "status is an unrecognized value");
        return zzaRx;
    }

    public zzaRx setDetailedReason(String s)
    {
        zzaRx.zzaRw = s;
        return this;
    }

    public zzaRx setGoogleTransactionId(String s)
    {
        zzaRx.zzaQm = s;
        return this;
    }

    public zzaRx setStatus(int i)
    {
        zzaRx.status = i;
        return this;
    }

    private (NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        zzaRx = notifytransactionstatusrequest;
        super();
    }

    zzaRx(NotifyTransactionStatusRequest notifytransactionstatusrequest, zzaRx zzarx)
    {
        this(notifytransactionstatusrequest);
    }
}
