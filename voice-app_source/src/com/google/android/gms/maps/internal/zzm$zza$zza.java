// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzm, IGoogleMapDelegate

private static class zznF
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

    legate(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
