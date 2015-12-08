// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.a:
//            s, u

public abstract class t extends Binder
    implements s
{

    public static s a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (iinterface != null && (iinterface instanceof s))
        {
            return (s)iinterface;
        } else
        {
            return new u(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag8 = false;
        boolean flag9 = false;
        boolean flag10 = false;
        boolean flag11 = false;
        boolean flag12 = false;
        boolean flag13 = false;
        boolean flag14 = false;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag7 = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            a(flag7);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag8;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            b(flag7);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag9;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            c(flag7);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag10;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            d(flag7);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag11;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            e(flag7);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag12;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            f(flag7);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag13;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            g(flag7);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag14;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            h(flag7);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = a();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = b();
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = c();
            parcel1.writeNoException();
            i = ((flag2) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = d();
            parcel1.writeNoException();
            i = ((flag3) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = e();
            parcel1.writeNoException();
            i = ((flag4) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = f();
            parcel1.writeNoException();
            i = ((flag5) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = g();
            parcel1.writeNoException();
            i = ((flag6) ? 1 : 0);
            break;
        }
        if (flag7)
        {
            i = 1;
        }
        parcel1.writeInt(i);
        return true;
    }
}
