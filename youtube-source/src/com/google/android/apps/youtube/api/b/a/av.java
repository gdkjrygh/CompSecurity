// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            au, aw

public abstract class av extends Binder
    implements au
{

    public av()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.service.jar.ILiveOverlayService");
    }

    public static au a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.service.jar.ILiveOverlayService");
        if (iinterface != null && (iinterface instanceof au))
        {
            return (au)iinterface;
        } else
        {
            return new aw(ibinder);
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
            parcel1.writeString("com.google.android.apps.youtube.api.service.jar.ILiveOverlayService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ILiveOverlayService");
            b();
            parcel1.writeNoException();
            return true;
        }
    }
}
