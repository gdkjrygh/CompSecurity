// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.location:
//            o, q, LocationResult, LocationAvailability, 
//            f

public abstract class p extends Binder
    implements o
{

    public static o a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (iinterface != null && (iinterface instanceof o))
        {
            return (o)iinterface;
        } else
        {
            return new q(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.ILocationCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = (LocationResult)LocationResult.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
            parcel1 = obj1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = LocationAvailability.CREATOR.a(parcel);
        }
        a(parcel1);
        return true;
    }
}
