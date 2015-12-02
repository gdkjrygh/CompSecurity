// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.y;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IProjectionDelegate

class le
    implements IProjectionDelegate
{

    private IBinder le;

    public IBinder asBinder()
    {
        return le;
    }

    public VisibleRegion getVisibleRegion()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        VisibleRegion visibleregion;
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        le.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        visibleregion = VisibleRegion.CREATOR._mthdo(parcel1);
        i = le;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        visibleregion = null;
        parcel1.recycle();
        parcel.recycle();
        return visibleregion;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public d toScreenLocation(LatLng latlng)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
        if (le == 0)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        parcel.writeInt(0);
        le.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        latlng = com.google.android.gms.dynamic.e.a.a.le(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return latlng;
        latlng;
        parcel1.recycle();
        parcel.recycle();
        throw latlng;
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
