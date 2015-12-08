// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IGoogleMapDelegate

public interface zzl
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzl
    {

        public static zzl zzcx(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            if (iinterface != null && (iinterface instanceof zzl))
            {
                return (zzl)iinterface;
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
                parcel1.writeString("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                zza(IGoogleMapDelegate.zza.zzcl(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
        }
    }

    private static class zza.zza
        implements zzl
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zza(IGoogleMapDelegate igooglemapdelegate)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            if (igooglemapdelegate == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            igooglemapdelegate = igooglemapdelegate.asBinder();
_L1:
            parcel.writeStrongBinder(igooglemapdelegate);
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igooglemapdelegate = null;
              goto _L1
            igooglemapdelegate;
            parcel1.recycle();
            parcel.recycle();
            throw igooglemapdelegate;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zza(IGoogleMapDelegate igooglemapdelegate)
        throws RemoteException;
}
