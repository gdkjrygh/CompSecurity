// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.maps.a:
//            a

final class c
    implements a
{

    private IBinder a;

    c(IBinder ibinder)
    {
        a = ibinder;
    }

    public final k a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        k k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        k = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final k a(float f)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        k k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        parcel.writeFloat(f);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        k = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final k a(float f, float f1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        k k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        parcel.writeFloat(f);
        parcel.writeFloat(f1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        k = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final k a(float f, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        k k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        parcel.writeFloat(f);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        k = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final k a(CameraPosition cameraposition)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (cameraposition == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        cameraposition.writeToParcel(parcel, 0);
_L1:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        cameraposition = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return cameraposition;
        parcel.writeInt(0);
          goto _L1
        cameraposition;
        parcel1.recycle();
        parcel.recycle();
        throw cameraposition;
    }

    public final k a(LatLng latlng)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L1:
        a.transact(8, parcel, parcel1, 0);
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

    public final k a(LatLng latlng, float f)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L1:
        parcel.writeFloat(f);
        a.transact(9, parcel, parcel1, 0);
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

    public final k a(LatLngBounds latlngbounds, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (latlngbounds == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L1:
        parcel.writeInt(i);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        latlngbounds = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return latlngbounds;
        parcel.writeInt(0);
          goto _L1
        latlngbounds;
        parcel1.recycle();
        parcel.recycle();
        throw latlngbounds;
    }

    public final k a(LatLngBounds latlngbounds, int i, int j, int k)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (latlngbounds == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L1:
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        latlngbounds = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return latlngbounds;
        parcel.writeInt(0);
          goto _L1
        latlngbounds;
        parcel1.recycle();
        parcel.recycle();
        throw latlngbounds;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final k b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        k k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        k = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final k b(float f)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        k k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        parcel.writeFloat(f);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        k = l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
