// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identity.intents.UserAddressRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zznm, zznl

private static class zznF
    implements zznm
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zznl zznl1, UserAddressRequest useraddressrequest, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.identity.intents.internal.IAddressService");
        if (zznl1 == null) goto _L2; else goto _L1
_L1:
        zznl1 = zznl1.asBinder();
_L5:
        parcel.writeStrongBinder(zznl1);
        if (useraddressrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        useraddressrequest.writeToParcel(parcel, 0);
_L6:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L7:
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zznl1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zznl1;
        parcel1.recycle();
        parcel.recycle();
        throw zznl1;
        parcel.writeInt(0);
          goto _L7
    }

    ddressRequest(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
