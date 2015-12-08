// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            ax, az

public abstract class ay extends Binder
    implements ax
{

    public ay()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.service.jar.IPlayerUiService");
    }

    public static ax a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.service.jar.IPlayerUiService");
        if (iinterface != null && (iinterface instanceof ax))
        {
            return (ax)iinterface;
        } else
        {
            return new az(ibinder);
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
            parcel1.writeString("com.google.android.apps.youtube.api.service.jar.IPlayerUiService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IPlayerUiService");
            b();
            parcel1.writeNoException();
            return true;
        }
    }
}
