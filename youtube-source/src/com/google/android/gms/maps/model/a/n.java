// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.i;

// Referenced classes of package com.google.android.gms.maps.model.a:
//            m, o

public abstract class n extends Binder
    implements m
{

    public static m a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (iinterface != null && (iinterface instanceof m))
        {
            return (m)iinterface;
        } else
        {
            return new o(ibinder);
        }
    }

    public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag13 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag14 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        switch (j)
        {
        default:
            return super.onTransact(j, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            parcel = b();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            if (parcel.readInt() != 0)
            {
                i i1 = LatLng.CREATOR;
                parcel = i.a(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            parcel = d();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            b(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            parcel = e();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            }
            a(flag5);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag6 = f();
            parcel1.writeNoException();
            j = ((flag) ? 1 : 0);
            if (flag6)
            {
                j = 1;
            }
            parcel1.writeInt(j);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            g();
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            h();
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag7 = i();
            parcel1.writeNoException();
            j = ((flag1) ? 1 : 0);
            if (flag7)
            {
                j = 1;
            }
            parcel1.writeInt(j);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag8 = flag13;
            if (parcel.readInt() != 0)
            {
                flag8 = true;
            }
            b(flag8);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag9 = j();
            parcel1.writeNoException();
            j = ((flag2) ? 1 : 0);
            if (flag9)
            {
                j = 1;
            }
            parcel1.writeInt(j);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag10 = a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            j = ((flag3) ? 1 : 0);
            if (flag10)
            {
                j = 1;
            }
            parcel1.writeInt(j);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            j = k();
            parcel1.writeNoException();
            parcel1.writeInt(j);
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a(l.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag11 = flag14;
            if (parcel.readInt() != 0)
            {
                flag11 = true;
            }
            c(flag11);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag12 = l();
            parcel1.writeNoException();
            j = ((flag4) ? 1 : 0);
            if (flag12)
            {
                j = 1;
            }
            parcel1.writeInt(j);
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            float f = m();
            parcel1.writeNoException();
            parcel1.writeFloat(f);
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            b(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            b(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            float f1 = n();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;
        }
    }
}
