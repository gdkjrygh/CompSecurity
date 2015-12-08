// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.i;

// Referenced classes of package com.google.android.gms.maps.a:
//            p

final class r
    implements p
{

    private IBinder a;

    r(IBinder ibinder)
    {
        a = ibinder;
    }

    public final k a(LatLng latlng)
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
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        latlng = l.a(parcel1.readStrongBinder());
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

    public final LatLng a(k k1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        k1 = obj;
        if (parcel1.readInt() != 0)
        {
            k1 = LatLng.CREATOR;
            k1 = i.a(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return k1;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final VisibleRegion a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = VisibleRegion.CREATOR;
        obj = com.google.android.gms.maps.model.r.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return ((VisibleRegion) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
