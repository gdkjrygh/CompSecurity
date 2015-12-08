// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzmk

private static class zznF
    implements zzmk
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(DailyTotalRequest dailytotalrequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (dailytotalrequest == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        dailytotalrequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(7, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        dailytotalrequest;
        parcel.recycle();
        throw dailytotalrequest;
    }

    public void zza(DataDeleteRequest datadeleterequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (datadeleterequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        datadeleterequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        datadeleterequest;
        parcel.recycle();
        throw datadeleterequest;
    }

    public void zza(DataInsertRequest datainsertrequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (datainsertrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        datainsertrequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        datainsertrequest;
        parcel.recycle();
        throw datainsertrequest;
    }

    public void zza(DataReadRequest datareadrequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (datareadrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        datareadrequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        datareadrequest;
        parcel.recycle();
        throw datareadrequest;
    }

    public void zza(GetSyncInfoRequest getsyncinforequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (getsyncinforequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        getsyncinforequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getsyncinforequest;
        parcel.recycle();
        throw getsyncinforequest;
    }

    public void zza(ReadRawRequest readrawrequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (readrawrequest == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        readrawrequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        readrawrequest;
        parcel.recycle();
        throw readrawrequest;
    }

    public void zza(ReadStatsRequest readstatsrequest)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (readstatsrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        readstatsrequest.writeToParcel(parcel, 0);
_L1:
        zznF.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        readstatsrequest;
        parcel.recycle();
        throw readstatsrequest;
    }

    atsRequest(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
