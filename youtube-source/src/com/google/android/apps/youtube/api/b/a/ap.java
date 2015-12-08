// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            ao, aq

public abstract class ap extends Binder
    implements ao
{

    public ap()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
    }

    public static ao a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
        if (iinterface != null && (iinterface instanceof ao))
        {
            return (ao)iinterface;
        } else
        {
            return new aq(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag2 = false;
        boolean flag7 = false;
        boolean flag8 = false;
        boolean flag9 = false;
        boolean flag1 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            a(parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            b(parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            a(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            b(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            a(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            b(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            b();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            c();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            d();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            flag2 = e();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag2)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            }
            a(flag2);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            f();
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            g();
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            boolean flag3 = flag7;
            if (parcel.readInt() != 0)
            {
                flag3 = true;
            }
            b(flag3);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            boolean flag4 = flag8;
            if (parcel.readInt() != 0)
            {
                flag4 = true;
            }
            c(flag4);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            h();
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            boolean flag5 = flag9;
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            }
            d(flag5);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            i();
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            j();
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, parcel);
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(i, parcel);
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            parcel = k();
            parcel1.writeNoException();
            parcel1.writeByteArray(parcel);
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            boolean flag6 = a(parcel.createByteArray());
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag6)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerService");
            l();
            parcel1.writeNoException();
            return true;
        }
    }
}
