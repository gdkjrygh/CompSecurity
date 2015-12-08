// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.common.api:
//            zzl, Result, Status, PendingResult, 
//            AbstractPendingResult

public final class PendingResults
{
    private static final class zza extends AbstractPendingResult
    {

        private final Result zzXN;

        protected Result createFailedResult(Status status)
        {
            if (status.getStatusCode() != zzXN.getStatus().getStatusCode())
            {
                throw new UnsupportedOperationException("Creating failed results is not supported");
            } else
            {
                return zzXN;
            }
        }

        public zza(Result result)
        {
            super(Looper.getMainLooper());
            zzXN = result;
        }
    }

    private static final class zzb extends AbstractPendingResult
    {

        protected Result createFailedResult(Status status)
        {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }

        public zzb()
        {
            super(Looper.getMainLooper());
        }
    }


    private PendingResults()
    {
    }

    public static PendingResult canceledPendingResult()
    {
        zzl zzl1 = new zzl(Looper.getMainLooper());
        zzl1.cancel();
        return zzl1;
    }

    public static PendingResult canceledPendingResult(Result result)
    {
        zzu.zzb(result, "Result must not be null");
        boolean flag;
        if (result.getStatus().getStatusCode() == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Status code must be CommonStatusCodes.CANCELED");
        result = new zza(result);
        result.cancel();
        return result;
    }

    public static PendingResult immediatePendingResult(Result result)
    {
        zzu.zzb(result, "Result must not be null");
        zzb zzb1 = new zzb();
        zzb1.setResult(result);
        return zzb1;
    }

    public static PendingResult immediatePendingResult(Status status)
    {
        zzu.zzb(status, "Result must not be null");
        zzl zzl1 = new zzl(Looper.getMainLooper());
        zzl1.setResult(status);
        return zzl1;
    }
}
