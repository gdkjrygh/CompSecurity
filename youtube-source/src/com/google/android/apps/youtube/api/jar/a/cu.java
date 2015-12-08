// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ct, cv

public abstract class cu extends Binder
    implements ct
{

    public cu()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.IPlayerSurfaceClient");
    }

    public static ct a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.IPlayerSurfaceClient");
        if (iinterface != null && (iinterface instanceof ct))
        {
            return (ct)iinterface;
        } else
        {
            return new cv(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.IPlayerSurfaceClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IPlayerSurfaceClient");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IPlayerSurfaceClient");
            a();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IPlayerSurfaceClient");
            b();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IPlayerSurfaceClient");
            c();
            parcel1.writeNoException();
            return true;
        }
    }
}
