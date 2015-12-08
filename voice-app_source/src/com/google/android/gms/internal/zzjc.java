// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;

public interface zzjc
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzjc
    {

        public static zzjc zzak(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            if (iinterface != null && (iinterface instanceof zzjc))
            {
                return (zzjc)iinterface;
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
            Object obj = null;
            DataHolder dataholder = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    dataholder = DataHolder.CREATOR.zzS(parcel);
                }
                zza(i, dataholder);
                parcel1.writeNoException();
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                DataHolder dataholder1 = obj;
                if (parcel.readInt() != 0)
                {
                    dataholder1 = DataHolder.CREATOR.zzS(parcel);
                }
                zza(dataholder1);
                parcel1.writeNoException();
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                zzg(parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                zzkU();
                parcel1.writeNoException();
                return true;

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                zzao(parcel.readInt());
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.appstate.internal.IAppStateCallbacks");
        }
    }

    private static class zza.zza
        implements zzjc
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(int i, DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            parcel.writeInt(i);
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            zznF.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void zza(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            zznF.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void zzao(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            parcel.writeInt(i);
            zznF.transact(5005, parcel, parcel1, 0);
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

        public void zzg(int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            parcel.writeInt(i);
            parcel.writeInt(j);
            zznF.transact(5003, parcel, parcel1, 0);
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

        public void zzkU()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            zznF.transact(5004, parcel, parcel1, 0);
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


    public abstract void zza(int i, DataHolder dataholder)
        throws RemoteException;

    public abstract void zza(DataHolder dataholder)
        throws RemoteException;

    public abstract void zzao(int i)
        throws RemoteException;

    public abstract void zzg(int i, int j)
        throws RemoteException;

    public abstract void zzkU()
        throws RemoteException;
}
