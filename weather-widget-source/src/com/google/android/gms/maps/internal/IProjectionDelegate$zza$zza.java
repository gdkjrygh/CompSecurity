// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.zze;
import com.google.android.gms.maps.model.zzp;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IProjectionDelegate

private static class zznI
    implements IProjectionDelegate
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public LatLng fromScreenLocation(zzd zzd1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (zzd1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        zzd1 = zzd1.asBinder();
_L1:
        parcel.writeStrongBinder(zzd1);
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzd1 = obj;
        if (parcel1.readInt() != 0)
        {
            zzd1 = LatLng.CREATOR.zzfa(parcel1);
        }
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

    public VisibleRegion getVisibleRegion()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        zznI.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        VisibleRegion visibleregion = VisibleRegion.CREATOR.zzfl(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return visibleregion;
_L2:
        visibleregion = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public zzd toScreenLocation(LatLng latlng)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L1:
        zznI.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        latlng = com.google.android.gms.dynamic.a.zza.zznI(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return latlng;
        parcel.writeInt(0);
          goto _L1
        latlng;
        parcel1.recycle();
        parcel.recycle();
        throw latlng;
    }

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
