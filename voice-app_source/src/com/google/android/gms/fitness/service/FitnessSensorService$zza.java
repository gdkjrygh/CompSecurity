// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.zzmg;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.service:
//            FitnessSensorService, FitnessSensorServiceRequest

private static class <init> extends com.google.android.gms.fitness.internal.service.est
{

    private final FitnessSensorService zzamZ;

    public void zza(FitnessDataSourcesRequest fitnessdatasourcesrequest, zzmg zzmg1)
        throws RemoteException
    {
        zzamZ.zzrA();
        zzmg1.zza(new DataSourcesResult(zzamZ.onFindDataSources(fitnessdatasourcesrequest.getDataTypes()), Status.zzXP));
    }

    public void zza(FitnessUnregistrationRequest fitnessunregistrationrequest, zzmu zzmu1)
        throws RemoteException
    {
        zzamZ.zzrA();
        if (zzamZ.onUnregister(fitnessunregistrationrequest.getDataSource()))
        {
            zzmu1.zzm(Status.zzXP);
            return;
        } else
        {
            zzmu1.zzm(new Status(13));
            return;
        }
    }

    public void zza(FitnessSensorServiceRequest fitnesssensorservicerequest, zzmu zzmu1)
        throws RemoteException
    {
        zzamZ.zzrA();
        if (zzamZ.onRegister(fitnesssensorservicerequest))
        {
            zzmu1.zzm(Status.zzXP);
            return;
        } else
        {
            zzmu1.zzm(new Status(13));
            return;
        }
    }

    private st(FitnessSensorService fitnesssensorservice)
    {
        zzamZ = fitnesssensorservice;
    }

    zzamZ(FitnessSensorService fitnesssensorservice, zzamZ zzamz)
    {
        this(fitnesssensorservice);
    }
}
