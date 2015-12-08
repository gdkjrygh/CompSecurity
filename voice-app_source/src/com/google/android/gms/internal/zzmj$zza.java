// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzmj

public static abstract class zza.zznF extends Binder
    implements zzmj
{
    private static class zza
        implements zzmj
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(DataTypeCreateRequest datatypecreaterequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            if (datatypecreaterequest == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            datatypecreaterequest.writeToParcel(parcel, 0);
_L1:
            zznF.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            datatypecreaterequest;
            parcel.recycle();
            throw datatypecreaterequest;
        }

        public void zza(DataTypeReadRequest datatypereadrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            if (datatypereadrequest == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            datatypereadrequest.writeToParcel(parcel, 0);
_L1:
            zznF.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            datatypereadrequest;
            parcel.recycle();
            throw datatypereadrequest;
        }

        public void zza(DisableFitRequest disablefitrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            if (disablefitrequest == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            disablefitrequest.writeToParcel(parcel, 0);
_L1:
            zznF.transact(22, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            disablefitrequest;
            parcel.recycle();
            throw disablefitrequest;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzmj zzbu(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
        if (iinterface != null && (iinterface instanceof zzmj))
        {
            return (zzmj)iinterface;
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
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = (DataTypeCreateRequest)DataTypeCreateRequest.CREATOR.createFromParcel(parcel);
            }
            zza(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (DataTypeReadRequest)DataTypeReadRequest.CREATOR.createFromParcel(parcel);
            }
            zza(parcel1);
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            parcel1 = obj2;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (DisableFitRequest)DisableFitRequest.CREATOR.createFromParcel(parcel);
        }
        zza(parcel1);
        return true;
    }
}
