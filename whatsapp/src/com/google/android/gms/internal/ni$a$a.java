// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.b;

// Referenced classes of package com.google.android.gms.internal:
//            ni, nc

class le
    implements ni
{

    private IBinder le;

    public void S(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        le.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(LocationRequest locationrequest, b b1)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = nc.a;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (locationrequest == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        parcel.writeInt(1);
        locationrequest.writeToParcel(parcel, 0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        com.google.android.gms.location.nServices.a.a++;
        parcel.writeInt(0);
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        locationrequest = b1.asBinder();
_L1:
        parcel.writeStrongBinder(locationrequest);
        le.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        locationrequest = null;
          goto _L1
        locationrequest;
        parcel1.recycle();
        parcel.recycle();
        throw locationrequest;
    }

    public void a(b b1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        le.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public IBinder asBinder()
    {
        return le;
    }

    public Location bZ(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = nc.a;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        le.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        s = (Location)Location.CREATOR.createFromParcel(parcel1);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        s = null;
        parcel1.recycle();
        parcel.recycle();
        if (com.google.android.gms.location.nServices.a.a != 0)
        {
            nc.a = i + 1;
        }
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    nRequest(IBinder ibinder)
    {
        le = ibinder;
    }
}
