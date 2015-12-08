// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.connection.AppMetadata;

// Referenced classes of package com.google.android.gms.internal:
//            zzor

public interface zzos
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzos
    {

        public static zzos zzdc(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (iinterface != null && (iinterface instanceof zzos))
            {
                return (zzos)iinterface;
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
                parcel1.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                return true;

            case 1001: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zzor zzor = com.google.android.gms.internal.zzor.zza.zzdb(parcel.readStrongBinder());
                String s = parcel.readString();
                AppMetadata appmetadata;
                if (parcel.readInt() != 0)
                {
                    appmetadata = (AppMetadata)AppMetadata.CREATOR.createFromParcel(parcel);
                } else
                {
                    appmetadata = null;
                }
                zza(zzor, s, appmetadata, parcel.readLong(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1002: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zzN(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1003: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zza(com.google.android.gms.internal.zzor.zza.zzdb(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1004: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zzf(parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1005: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zza(com.google.android.gms.internal.zzor.zza.zzdb(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1006: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zzO(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1007: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zza(com.google.android.gms.internal.zzor.zza.zzdb(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1008: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zza(com.google.android.gms.internal.zzor.zza.zzdb(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1009: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zza(com.google.android.gms.internal.zzor.zza.zzdb(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1010: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zza(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1011: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zzb(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1012: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zzg(parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1013: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zzP(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1014: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                zzE(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 1015: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                parcel = zzQ(parcel.readLong());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 1016: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                parcel = zzwS();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzos
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zzE(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            zznF.transact(1014, parcel, parcel1, 0);
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

        public void zzN(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            zznF.transact(1002, parcel, parcel1, 0);
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

        public void zzO(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            zznF.transact(1006, parcel, parcel1, 0);
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

        public void zzP(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            zznF.transact(1013, parcel, parcel1, 0);
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

        public String zzQ(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            zznF.transact(1015, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zza(zzor zzor1, int i, long l, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (zzor1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            zzor1 = zzor1.asBinder();
_L1:
            parcel.writeStrongBinder(zzor1);
            parcel.writeInt(i);
            parcel.writeLong(l);
            parcel.writeLong(l1);
            zznF.transact(1005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzor1 = null;
              goto _L1
            zzor1;
            parcel1.recycle();
            parcel.recycle();
            throw zzor1;
        }

        public void zza(zzor zzor1, String s, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (zzor1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            zzor1 = zzor1.asBinder();
_L1:
            parcel.writeStrongBinder(zzor1);
            parcel.writeString(s);
            parcel.writeLong(l);
            zznF.transact(1009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzor1 = null;
              goto _L1
            zzor1;
            parcel1.recycle();
            parcel.recycle();
            throw zzor1;
        }

        public void zza(zzor zzor1, String s, long l, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (zzor1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            zzor1 = zzor1.asBinder();
_L1:
            parcel.writeStrongBinder(zzor1);
            parcel.writeString(s);
            parcel.writeLong(l);
            parcel.writeLong(l1);
            zznF.transact(1003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzor1 = null;
              goto _L1
            zzor1;
            parcel1.recycle();
            parcel.recycle();
            throw zzor1;
        }

        public void zza(zzor zzor1, String s, AppMetadata appmetadata, long l, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (zzor1 == null) goto _L2; else goto _L1
_L1:
            zzor1 = zzor1.asBinder();
_L5:
            parcel.writeStrongBinder(zzor1);
            parcel.writeString(s);
            if (appmetadata == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            appmetadata.writeToParcel(parcel, 0);
_L6:
            parcel.writeLong(l);
            parcel.writeLong(l1);
            zznF.transact(1001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzor1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzor1;
            parcel1.recycle();
            parcel.recycle();
            throw zzor1;
              goto _L5
        }

        public void zza(zzor zzor1, String s, String s1, byte abyte0[], long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (zzor1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            zzor1 = zzor1.asBinder();
_L1:
            parcel.writeStrongBinder(zzor1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            parcel.writeLong(l);
            zznF.transact(1007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzor1 = null;
              goto _L1
            zzor1;
            parcel1.recycle();
            parcel.recycle();
            throw zzor1;
        }

        public void zza(zzor zzor1, String s, byte abyte0[], long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (zzor1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            zzor1 = zzor1.asBinder();
_L1:
            parcel.writeStrongBinder(zzor1);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            parcel.writeLong(l);
            zznF.transact(1008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzor1 = null;
              goto _L1
            zzor1;
            parcel1.recycle();
            parcel.recycle();
            throw zzor1;
        }

        public void zza(String as[], byte abyte0[], long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeStringArray(as);
            parcel.writeByteArray(abyte0);
            parcel.writeLong(l);
            zznF.transact(1010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            as;
            parcel1.recycle();
            parcel.recycle();
            throw as;
        }

        public void zzb(String as[], byte abyte0[], long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeStringArray(as);
            parcel.writeByteArray(abyte0);
            parcel.writeLong(l);
            zznF.transact(1011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            as;
            parcel1.recycle();
            parcel.recycle();
            throw as;
        }

        public void zzf(String s, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeString(s);
            parcel.writeLong(l);
            zznF.transact(1004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzg(String s, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeString(s);
            parcel.writeLong(l);
            zznF.transact(1012, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public String zzwS()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            zznF.transact(1016, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
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


    public abstract void zzE(long l)
        throws RemoteException;

    public abstract void zzN(long l)
        throws RemoteException;

    public abstract void zzO(long l)
        throws RemoteException;

    public abstract void zzP(long l)
        throws RemoteException;

    public abstract String zzQ(long l)
        throws RemoteException;

    public abstract void zza(zzor zzor, int i, long l, long l1)
        throws RemoteException;

    public abstract void zza(zzor zzor, String s, long l)
        throws RemoteException;

    public abstract void zza(zzor zzor, String s, long l, long l1)
        throws RemoteException;

    public abstract void zza(zzor zzor, String s, AppMetadata appmetadata, long l, long l1)
        throws RemoteException;

    public abstract void zza(zzor zzor, String s, String s1, byte abyte0[], long l)
        throws RemoteException;

    public abstract void zza(zzor zzor, String s, byte abyte0[], long l)
        throws RemoteException;

    public abstract void zza(String as[], byte abyte0[], long l)
        throws RemoteException;

    public abstract void zzb(String as[], byte abyte0[], long l)
        throws RemoteException;

    public abstract void zzf(String s, long l)
        throws RemoteException;

    public abstract void zzg(String s, long l)
        throws RemoteException;

    public abstract String zzwS()
        throws RemoteException;
}
