// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzm, IGoogleMapDelegate

public static abstract class attachInterface extends Binder
    implements zzm
{
    private static class zza
        implements zzm
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
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
            zznF.transact(1, parcel, parcel1, 0);
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

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzm zzcu(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
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
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            zza(apDelegate.zza.zzch(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }

    public zza.zznF()
    {
        attachInterface(this, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }
}
