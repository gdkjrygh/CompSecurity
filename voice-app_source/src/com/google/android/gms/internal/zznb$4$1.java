// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;

// Referenced classes of package com.google.android.gms.internal:
//            zznb, zzlz, zzmk

class <init> extends <init>
{

    final tResult zzall;

    public void zza(DailyTotalResult dailytotalresult)
        throws RemoteException
    {
        zzall.tResult(dailytotalresult);
    }

    piClient(piClient piclient)
    {
        zzall = piclient;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zznb$4

/* anonymous class */
    class zznb._cls4 extends zzlz.zza
    {

        final zznb zzalh;
        final DataType zzalk;

        protected Result createFailedResult(Status status)
        {
            return zzE(status);
        }

        protected DailyTotalResult zzE(Status status)
        {
            return DailyTotalResult.zzK(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzlz)client);
        }

        protected void zza(zzlz zzlz1)
            throws RemoteException
        {
            Object obj = new zznb._cls4._cls1(this);
            String s = zzlz1.getContext().getPackageName();
            obj = new DailyTotalRequest(((zzme) (obj)), zzalk, s);
            ((zzmk)zzlz1.zznM()).zza(((DailyTotalRequest) (obj)));
        }

            
            {
                zzalh = zznb1;
                zzalk = datatype;
                super(googleapiclient);
            }
    }

}
