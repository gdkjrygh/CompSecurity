// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzff, zzfe

private static class zznF
    implements zzff
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zzfe zzfe1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (zzfe1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzfe1 = zzfe1.asBinder();
_L1:
        parcel.writeStrongBinder(zzfe1);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzfe1 = null;
          goto _L1
        zzfe1;
        parcel1.recycle();
        parcel.recycle();
        throw zzfe1;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
