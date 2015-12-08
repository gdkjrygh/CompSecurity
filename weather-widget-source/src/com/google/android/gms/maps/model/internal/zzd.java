// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface zzd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzd
    {

        public static zzd zzcR(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            if (iinterface != null && (iinterface instanceof zzd))
            {
                return (zzd)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag1 = false;
            boolean flag = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                i = getActiveLevelIndex();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                i = getDefaultLevelIndex();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                parcel = getLevels();
                parcel1.writeNoException();
                parcel1.writeBinderList(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                boolean flag2 = isUnderground();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag2)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                boolean flag3 = zzb(zzcR(parcel.readStrongBinder()));
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag3)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                i = hashCodeRemote();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzd
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public int getActiveLevelIndex()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            zznI.transact(1, parcel, parcel1, 0);
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

        public int getDefaultLevelIndex()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            zznI.transact(2, parcel, parcel1, 0);
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

        public List getLevels()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            zznI.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createBinderArrayList();
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int hashCodeRemote()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            zznI.transact(6, parcel, parcel1, 0);
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

        public boolean isUnderground()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            zznI.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean zzb(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            zzd1 = zzd1.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(zzd1);
            zznI.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract int getActiveLevelIndex()
        throws RemoteException;

    public abstract int getDefaultLevelIndex()
        throws RemoteException;

    public abstract List getLevels()
        throws RemoteException;

    public abstract int hashCodeRemote()
        throws RemoteException;

    public abstract boolean isUnderground()
        throws RemoteException;

    public abstract boolean zzb(zzd zzd1)
        throws RemoteException;
}
