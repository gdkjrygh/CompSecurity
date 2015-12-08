// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;

public interface zzoj
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzoj
    {

        public static zzoj zzcV(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            if (iinterface != null && (iinterface instanceof zzoj))
            {
                return (zzoj)iinterface;
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
                parcel1.writeString("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                Device device;
                if (parcel.readInt() != 0)
                {
                    device = (Device)Device.CREATOR.createFromParcel(parcel);
                } else
                {
                    device = null;
                }
                zza(device, parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                onDisconnected();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                onError(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                zzdO(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                zzwL();
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzoj
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void onDisconnected()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void onError(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            parcel.writeInt(i);
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zza(Device device, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            if (device == null)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            parcel.writeInt(1);
            device.writeToParcel(parcel, 0);
_L1:
            parcel.writeByteArray(abyte0);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            device;
            parcel1.recycle();
            parcel.recycle();
            throw device;
        }

        public void zzdO(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            parcel.writeString(s);
            zznF.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzwL()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            zznF.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
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


    public abstract void onDisconnected()
        throws RemoteException;

    public abstract void onError(int i)
        throws RemoteException;

    public abstract void zza(Device device, byte abyte0[])
        throws RemoteException;

    public abstract void zzdO(String s)
        throws RemoteException;

    public abstract void zzwL()
        throws RemoteException;
}
