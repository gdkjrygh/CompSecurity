// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.location:
//            zzc, LocationAvailability, LocationResult

private static class zznF
    implements zzc
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void onLocationAvailability(LocationAvailability locationavailability)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
        if (locationavailability == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        locationavailability.writeToParcel(parcel, 0);
_L1:
        zznF.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        locationavailability;
        parcel.recycle();
        throw locationavailability;
    }

    public void onLocationResult(LocationResult locationresult)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
        if (locationresult == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        locationresult.writeToParcel(parcel, 0);
_L1:
        zznF.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        locationresult;
        parcel.recycle();
        throw locationresult;
    }

    lt(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
