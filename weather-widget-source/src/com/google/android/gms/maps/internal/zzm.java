// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzf;

public interface zzm
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzm
    {

        public static zzm zzcy(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            if (iinterface != null && (iinterface instanceof zzm))
            {
                return (zzm)iinterface;
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
            boolean flag;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                flag = zza(com.google.android.gms.maps.model.internal.zzf.zza.zzcT(parcel.readStrongBinder()));
                parcel1.writeNoException();
                break;
            }
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
        }
    }

    private static class zza.zza
        implements zzm
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public boolean zza(zzf zzf1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            if (zzf1 == null)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            zzf1 = zzf1.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(zzf1);
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            zzf1 = null;
              goto _L1
            zzf1;
            parcel1.recycle();
            parcel.recycle();
            throw zzf1;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract boolean zza(zzf zzf)
        throws RemoteException;
}
