// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzjs

class zzTG
    implements ResultCallback
{

    final zzjs zzTB;
    final long zzTG;

    public void onResult(Result result)
    {
        zzm((Status)result);
    }

    public void zzm(Status status)
    {
        if (!status.isSuccess())
        {
            zzTB.zzb(zzTG, status.getStatusCode());
        }
    }

    s(zzjs zzjs1, long l)
    {
        zzTB = zzjs1;
        zzTG = l;
        super();
    }
}
