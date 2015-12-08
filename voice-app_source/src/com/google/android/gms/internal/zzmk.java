// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;

public interface zzmk
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzmk
    {

        public static zzmk zzbv(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
            if (iinterface != null && (iinterface instanceof zzmk))
            {
                return (zzmk)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                parcel1 = obj;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (DataReadRequest)DataReadRequest.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                parcel1 = obj1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (DataInsertRequest)DataInsertRequest.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                parcel1 = obj2;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (DataDeleteRequest)DataDeleteRequest.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                parcel1 = obj3;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (GetSyncInfoRequest)GetSyncInfoRequest.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                parcel1 = obj4;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ReadStatsRequest)ReadStatsRequest.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                parcel1 = obj5;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ReadRawRequest)ReadRawRequest.CREATOR.createFromParcel(parcel);
                }
                zza(parcel1);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                parcel1 = obj6;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = (DailyTotalRequest)DailyTotalRequest.CREATOR.createFromParcel(parcel);
            }
            zza(parcel1);
            return true;
        }
    }

    private static class zza.zza
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

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zza(DailyTotalRequest dailytotalrequest)
        throws RemoteException;

    public abstract void zza(DataDeleteRequest datadeleterequest)
        throws RemoteException;

    public abstract void zza(DataInsertRequest datainsertrequest)
        throws RemoteException;

    public abstract void zza(DataReadRequest datareadrequest)
        throws RemoteException;

    public abstract void zza(GetSyncInfoRequest getsyncinforequest)
        throws RemoteException;

    public abstract void zza(ReadRawRequest readrawrequest)
        throws RemoteException;

    public abstract void zza(ReadStatsRequest readstatsrequest)
        throws RemoteException;
}
