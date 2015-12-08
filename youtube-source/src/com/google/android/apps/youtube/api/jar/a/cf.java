// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.api.b.a.ag;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ce, cg

public abstract class cf extends Binder
    implements ce
{

    public cf()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
    }

    public static ce a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
        if (iinterface != null && (iinterface instanceof ce))
        {
            return (ce)iinterface;
        } else
        {
            return new cg(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag = false;
        boolean flag1 = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
            a(ag.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
            b();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            }
            a(s, flag, flag1, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAdOverlayClient");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
