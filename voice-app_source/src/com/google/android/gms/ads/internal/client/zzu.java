// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzu
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzu
    {

        public static zzu zzn(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
            if (iinterface != null && (iinterface instanceof zzu))
            {
                return (zzu)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                long l = getValue();
                parcel1.writeNoException();
                parcel1.writeLong(l);
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        }
    }

    private static class zza.zza
        implements zzu
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public long getValue()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            long l;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            l = parcel1.readLong();
            parcel1.recycle();
            parcel.recycle();
            return l;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract long getValue()
        throws RemoteException;
}
