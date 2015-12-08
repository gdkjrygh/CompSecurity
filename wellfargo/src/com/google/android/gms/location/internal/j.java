// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.location.internal:
//            i, k

public abstract class j extends Binder
    implements i
{

    public static i a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
        if (iinterface != null && (iinterface instanceof i))
        {
            return (i)iinterface;
        } else
        {
            return new k(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int l, Parcel parcel, Parcel parcel1, int i1)
    {
        switch (l)
        {
        default:
            return super.onTransact(l, parcel, parcel1, i1);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            a(parcel.readInt(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            b(parcel.readInt(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            l = parcel.readInt();
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(l, parcel);
        parcel1.writeNoException();
        return true;
    }
}
