// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.s;

// Referenced classes of package com.google.android.gms.maps.a:
//            cc, ce

public abstract class cd extends Binder
    implements cc
{

    public static cc a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        if (iinterface != null && (iinterface instanceof cc))
        {
            return (cc)iinterface;
        } else
        {
            return new ce(ibinder);
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
            parcel1.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = StreetViewPanoramaCamera.CREATOR.a(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
