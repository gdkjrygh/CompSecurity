// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bd, bf

public abstract class be extends Binder
    implements bd
{

    public be()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.service.jar.ISurfaceTextureService");
    }

    public static bd a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceTextureService");
        if (iinterface != null && (iinterface instanceof bd))
        {
            return (bd)iinterface;
        } else
        {
            return new bf(ibinder);
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
            parcel1.writeString("com.google.android.apps.youtube.api.service.jar.ISurfaceTextureService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceTextureService");
            if (parcel.readInt() != 0)
            {
                parcel = (Surface)Surface.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceTextureService");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceTextureService");
            a();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceTextureService");
            b();
            parcel1.writeNoException();
            return true;
        }
    }
}
