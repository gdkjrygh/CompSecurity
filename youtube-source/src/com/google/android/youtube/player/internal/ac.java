// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.youtube.player.internal:
//            ab, ad

public abstract class ac extends Binder
    implements ab
{

    public ac()
    {
        attachInterface(this, "com.google.android.youtube.player.internal.IThumbnailLoaderService");
    }

    public static ab a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
        if (iinterface != null && (iinterface instanceof ab))
        {
            return (ab)iinterface;
        } else
        {
            return new ad(ibinder);
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
            parcel1.writeString("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            a(parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            a();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            b();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            c();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            d();
            parcel1.writeNoException();
            return true;
        }
    }
}
