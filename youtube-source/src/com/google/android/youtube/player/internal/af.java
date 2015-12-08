// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.youtube.player.internal:
//            ae, ag, ab, y, 
//            aa

public abstract class af extends Binder
    implements ae
{

    public af()
    {
        attachInterface(this, "com.google.android.youtube.player.internal.IYouTubeService");
    }

    public static ae a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
        if (iinterface != null && (iinterface instanceof ae))
        {
            return (ae)iinterface;
        } else
        {
            return new ag(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.youtube.player.internal.IYouTubeService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
            parcel = a();
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
            parcel = parcel.readStrongBinder();
            ab ab1;
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                if (iinterface != null && (iinterface instanceof y))
                {
                    parcel = (y)iinterface;
                } else
                {
                    parcel = new aa(parcel);
                }
            }
            ab1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj;
            if (ab1 != null)
            {
                parcel = ab1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
            break;
        }
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        parcel1.writeNoException();
        return true;
    }
}
