// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface zzc
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzc
    {

        public static zzc zzds(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            if (iinterface != null && (iinterface instanceof zzc))
            {
                return (zzc)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj = null;
            zzd zzd1;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                parcel = zza(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                zzd1 = zza(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                parcel = obj;
                break;
            }
            if (zzd1 != null)
            {
                parcel = zzd1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements zzc
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public zzd zza(zzd zzd1, int i, int j, String s, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeString(s);
            parcel.writeInt(k);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public zzd zza(zzd zzd1, int i, int j, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract zzd zza(zzd zzd, int i, int j, String s, int k)
        throws RemoteException;

    public abstract zzd zza(zzd zzd, int i, int j, String s, String s1)
        throws RemoteException;
}
