// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataPoint

public interface zzj
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzj
    {

        public static zzj zzbh(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            if (iinterface != null && (iinterface instanceof zzj))
            {
                return (zzj)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.fitness.data.IDataSourceListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.data.IDataSourceListener");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (DataPoint)DataPoint.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zzc(parcel);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.fitness.data.IDataSourceListener");
        }
    }

    private static class zza.zza
        implements zzj
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zzc(DataPoint datapoint)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.data.IDataSourceListener");
            if (datapoint == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            datapoint.writeToParcel(parcel, 0);
_L1:
            zznF.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            datapoint;
            parcel.recycle();
            throw datapoint;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zzc(DataPoint datapoint)
        throws RemoteException;
}
