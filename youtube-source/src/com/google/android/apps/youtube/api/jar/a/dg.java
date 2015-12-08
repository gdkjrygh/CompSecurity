// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.api.b.a.be;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            df, dh

public abstract class dg extends Binder
    implements df
{

    public dg()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.ISurfaceTextureClient");
    }

    public static df a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceTextureClient");
        if (iinterface != null && (iinterface instanceof df))
        {
            return (df)iinterface;
        } else
        {
            return new dh(ibinder);
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
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.ISurfaceTextureClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurfaceTextureClient");
            a(be.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
