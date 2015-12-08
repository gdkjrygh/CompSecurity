// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.j;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.m;
import com.google.android.gms.maps.model.n;

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

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
    {
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj = null;
        j j1 = null;
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a();
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = b();
            parcel1.writeNoException();
            parcel = obj5;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj6;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj7;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = b(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj8;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj9;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = CameraPosition.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            j1 = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (j1 != null)
            {
                parcel = j1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = LatLng.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = j1;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLng.CREATOR.a(parcel);
            } else
            {
                obj = null;
            }
            obj = a(((LatLng) (obj)), parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj1;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLngBounds.CREATOR.a(parcel);
            } else
            {
                obj = null;
            }
            obj = a(((LatLngBounds) (obj)), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = LatLngBounds.CREATOR.a(parcel);
        } else
        {
            obj = null;
        }
        obj = a(((LatLngBounds) (obj)), parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel1.writeNoException();
        parcel = obj3;
        if (obj != null)
        {
            parcel = ((j) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
