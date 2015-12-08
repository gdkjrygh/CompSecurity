// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.h;
import com.google.android.gms.maps.model.i;

// Referenced classes of package com.google.android.gms.maps.model.a:
//            j, l

public abstract class k extends Binder
    implements j
{

    public static j a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (iinterface != null && (iinterface instanceof j))
        {
            return (j)iinterface;
        } else
        {
            return new com.google.android.gms.maps.model.a.l(ibinder);
        }
    }

    public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
    {
        Object obj2 = null;
        Object obj = null;
        boolean flag1 = false;
        boolean flag = false;
        switch (i1)
        {
        default:
            return super.onTransact(i1, parcel, parcel1, j1);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            parcel = b();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLng.CREATOR;
                obj = i.a(parcel);
            }
            a(((LatLng) (obj)));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            parcel = c();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            a(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            a(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            float f = d();
            parcel1.writeNoException();
            parcel1.writeFloat(f);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            float f1 = e();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            Object obj1 = obj2;
            if (parcel.readInt() != 0)
            {
                obj1 = LatLngBounds.CREATOR;
                obj1 = h.a(parcel);
            }
            a(((LatLngBounds) (obj1)));
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            parcel = f();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            b(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            float f2 = g();
            parcel1.writeNoException();
            parcel1.writeFloat(f2);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            c(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            float f3 = h();
            parcel1.writeNoException();
            parcel1.writeFloat(f3);
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            boolean flag2;
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(flag2);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            boolean flag3 = i();
            parcel1.writeNoException();
            i1 = ((flag) ? 1 : 0);
            if (flag3)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            d(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            float f4 = j();
            parcel1.writeNoException();
            parcel1.writeFloat(f4);
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            boolean flag4 = a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            i1 = ((flag1) ? 1 : 0);
            if (flag4)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            i1 = k();
            parcel1.writeNoException();
            parcel1.writeInt(i1);
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            a(l.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
