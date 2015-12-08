// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.d;
import com.google.android.gms.maps.model.h;
import com.google.android.gms.maps.model.i;

// Referenced classes of package com.google.android.gms.maps.a:
//            a, c

public abstract class b extends Binder
    implements a
{

    public static a a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (iinterface != null && (iinterface instanceof a))
        {
            return (a)iinterface;
        } else
        {
            return new c(ibinder);
        }
    }

    public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int l)
    {
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj = null;
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        switch (j)
        {
        default:
            return super.onTransact(j, parcel, parcel1, l);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a();
            parcel1.writeNoException();
            parcel = obj5;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = b();
            parcel1.writeNoException();
            parcel = obj6;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj7;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj8;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = b(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj9;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj10;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj1 = CameraPosition.CREATOR;
                parcel = d.a(parcel);
            } else
            {
                parcel = null;
            }
            obj1 = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj1 != null)
            {
                parcel = ((k) (obj1)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLng.CREATOR;
                parcel = i.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj1));
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLng.CREATOR;
                obj = i.a(parcel);
            } else
            {
                obj = null;
            }
            obj = a(((LatLng) (obj)), parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLngBounds.CREATOR;
                obj = h.a(parcel);
            } else
            {
                obj = null;
            }
            obj = a(((LatLngBounds) (obj)), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj3;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = LatLngBounds.CREATOR;
            obj = h.a(parcel);
        } else
        {
            obj = null;
        }
        obj = a(((LatLngBounds) (obj)), parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel1.writeNoException();
        parcel = obj4;
        if (obj != null)
        {
            parcel = ((k) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
