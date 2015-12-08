// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzdv, zzdu

private static class zzlW
    implements zzdv
{

    private IBinder zzlW;

    public IBinder asBinder()
    {
        return zzlW;
    }

    public boolean isValidPurchase(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        parcel.writeString(s);
        zzlW.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public void zza(zzdu zzdu1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (zzdu1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzdu1 = zzdu1.asBinder();
_L1:
        parcel.writeStrongBinder(zzdu1);
        zzlW.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzdu1 = null;
          goto _L1
        zzdu1;
        parcel1.recycle();
        parcel.recycle();
        throw zzdu1;
    }

    (IBinder ibinder)
    {
        zzlW = ibinder;
    }
}
