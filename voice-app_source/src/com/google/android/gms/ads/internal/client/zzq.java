// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzef;

public interface zzq
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzq
    {

        public static zzq zzj(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
            if (iinterface != null && (iinterface instanceof zzq))
            {
                return (zzq)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                parcel = zza(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()), parcel.readString(), com.google.android.gms.internal.zzef.zza.zzE(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzq
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public IBinder zza(zzd zzd1, String s, zzef zzef1, int i)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_109;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            parcel.writeString(s);
            zzd1 = obj;
            if (zzef1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzd1 = zzef1.asBinder();
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = parcel1.readStrongBinder();
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


    public abstract IBinder zza(zzd zzd, String s, zzef zzef, int i)
        throws RemoteException;
}
