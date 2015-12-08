// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzjc

public interface zzjd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzjd
    {

        public static zzjd zzal(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
            if (iinterface != null && (iinterface instanceof zzjd))
            {
                return (zzjd)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.appstate.internal.IAppStateService");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                i = zzkV();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                i = zzkW();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zza(zzjc.zza.zzak(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zza(zzjc.zza.zzak(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zza(zzjc.zza.zzak(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zza(zzjc.zza.zzak(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zzb(zzjc.zza.zzak(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5008: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zzb(zzjc.zza.zzak(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5009: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zzc(zzjc.zza.zzak(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzjd
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(zzjc zzjc1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (zzjc1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            zzjc1 = zzjc1.asBinder();
_L1:
            parcel.writeStrongBinder(zzjc1);
            zznF.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzjc1 = null;
              goto _L1
            zzjc1;
            parcel1.recycle();
            parcel.recycle();
            throw zzjc1;
        }

        public void zza(zzjc zzjc1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (zzjc1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            zzjc1 = zzjc1.asBinder();
_L1:
            parcel.writeStrongBinder(zzjc1);
            parcel.writeInt(i);
            zznF.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzjc1 = null;
              goto _L1
            zzjc1;
            parcel1.recycle();
            parcel.recycle();
            throw zzjc1;
        }

        public void zza(zzjc zzjc1, int i, String s, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (zzjc1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            zzjc1 = zzjc1.asBinder();
_L1:
            parcel.writeStrongBinder(zzjc1);
            parcel.writeInt(i);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            zznF.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzjc1 = null;
              goto _L1
            zzjc1;
            parcel1.recycle();
            parcel.recycle();
            throw zzjc1;
        }

        public void zza(zzjc zzjc1, int i, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (zzjc1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            zzjc1 = zzjc1.asBinder();
_L1:
            parcel.writeStrongBinder(zzjc1);
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            zznF.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzjc1 = null;
              goto _L1
            zzjc1;
            parcel1.recycle();
            parcel.recycle();
            throw zzjc1;
        }

        public void zzb(zzjc zzjc1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (zzjc1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            zzjc1 = zzjc1.asBinder();
_L1:
            parcel.writeStrongBinder(zzjc1);
            zznF.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzjc1 = null;
              goto _L1
            zzjc1;
            parcel1.recycle();
            parcel.recycle();
            throw zzjc1;
        }

        public void zzb(zzjc zzjc1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (zzjc1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            zzjc1 = zzjc1.asBinder();
_L1:
            parcel.writeStrongBinder(zzjc1);
            parcel.writeInt(i);
            zznF.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzjc1 = null;
              goto _L1
            zzjc1;
            parcel1.recycle();
            parcel.recycle();
            throw zzjc1;
        }

        public void zzc(zzjc zzjc1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (zzjc1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            zzjc1 = zzjc1.asBinder();
_L1:
            parcel.writeStrongBinder(zzjc1);
            zznF.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzjc1 = null;
              goto _L1
            zzjc1;
            parcel1.recycle();
            parcel.recycle();
            throw zzjc1;
        }

        public int zzkV()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            zznF.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int zzkW()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            zznF.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
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


    public abstract void zza(zzjc zzjc)
        throws RemoteException;

    public abstract void zza(zzjc zzjc, int i)
        throws RemoteException;

    public abstract void zza(zzjc zzjc, int i, String s, byte abyte0[])
        throws RemoteException;

    public abstract void zza(zzjc zzjc, int i, byte abyte0[])
        throws RemoteException;

    public abstract void zzb(zzjc zzjc)
        throws RemoteException;

    public abstract void zzb(zzjc zzjc, int i)
        throws RemoteException;

    public abstract void zzc(zzjc zzjc)
        throws RemoteException;

    public abstract int zzkV()
        throws RemoteException;

    public abstract int zzkW()
        throws RemoteException;
}
