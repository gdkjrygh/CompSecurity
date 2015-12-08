// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.api.b.a.bb;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            dc, de

public abstract class dd extends Binder
    implements dc
{

    public dd()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
    }

    public static dc a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
        if (iinterface != null && (iinterface instanceof dc))
        {
            return (dc)iinterface;
        } else
        {
            return new de(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag1 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
            a(bb.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
            flag1 = a();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag1)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
            parcel = b();
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

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            }
            a(flag1);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
            c();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceHolderClient");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }
}
