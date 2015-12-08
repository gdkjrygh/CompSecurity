// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.common.api:
//            zzo, Result, Status, PendingResult, 
//            OptionalPendingResult, zzb, zza

public final class PendingResults
{
    private static final class zza extends com.google.android.gms.common.api.zzb
    {

        private final Result zzaaB;

        protected Result zzb(Status status)
        {
            if (status.getStatusCode() != zzaaB.getStatus().getStatusCode())
            {
                throw new UnsupportedOperationException("Creating failed results is not supported");
            } else
            {
                return zzaaB;
            }
        }

        public zza(Result result)
        {
            super(Looper.getMainLooper());
            zzaaB = result;
        }
    }

    private static final class zzb extends com.google.android.gms.common.api.zza
    {

        protected Result zzb(Status status)
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
        zzo zzo1 = new zzo(Looper.getMainLooper());
        zzo1.cancel();
        return zzo1;
    }

    public static PendingResult canceledPendingResult(Result result)
    {
        zzx.zzb(result, "Result must not be null");
        boolean flag;
        if (result.getStatus().getStatusCode() == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Status code must be CommonStatusCodes.CANCELED");
        result = new zza(result);
        result.cancel();
        return result;
    }

    public static OptionalPendingResult immediatePendingResult(Result result)
    {
        zzx.zzb(result, "Result must not be null");
        zzb zzb1 = new zzb();
        zzb1.zza(result);
        return zzb1;
    }

    public static PendingResult immediatePendingResult(Status status)
    {
        zzx.zzb(status, "Result must not be null");
        zzo zzo1 = new zzo(Looper.getMainLooper());
        zzo1.zza(status);
        return zzo1;
    }
}
