// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.api.b.a.ay;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cw, cy

public abstract class cx extends Binder
    implements cw
{

    public cx()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.IPlayerUiClient");
    }

    public static cw a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.IPlayerUiClient");
        if (iinterface != null && (iinterface instanceof cw))
        {
            return (cw)iinterface;
        } else
        {
            return new cy(ibinder);
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
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.IPlayerUiClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IPlayerUiClient");
            a(ay.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IPlayerUiClient");
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IPlayerUiClient");
            flag = flag1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            flag = true;
        }
        b(flag);
        parcel1.writeNoException();
        return true;
    }
}
