// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzj, AdResponseParcel

private static class zzlW
    implements zzj
{

    private IBinder zzlW;

    public IBinder asBinder()
    {
        return zzlW;
    }

    public void zzb(AdResponseParcel adresponseparcel)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdResponseListener");
        if (adresponseparcel == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        adresponseparcel.writeToParcel(parcel, 0);
_L1:
        zzlW.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        adresponseparcel;
        parcel1.recycle();
        parcel.recycle();
        throw adresponseparcel;
    }

    rcel(IBinder ibinder)
    {
        zzlW = ibinder;
    }
}
