// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ck, cm

public abstract class cl extends Binder
    implements ck
{

    public cl()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
    }

    public static ck a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
        if (iinterface != null && (iinterface instanceof ck))
        {
            return (ck)iinterface;
        } else
        {
            return new cm(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag2 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            b();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            c();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            d();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            String s = parcel.readString();
            String s1 = parcel.readString();
            i = parcel.readInt();
            j = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(s, s1, i, j, flag, flag2);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            e();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            f();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            g();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            h();
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            b(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(flag, parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            boolean flag1 = flag2;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            }
            a(flag1);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            i();
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            j();
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IApiPlayerClient");
            k();
            parcel1.writeNoException();
            return true;
        }
    }
}
