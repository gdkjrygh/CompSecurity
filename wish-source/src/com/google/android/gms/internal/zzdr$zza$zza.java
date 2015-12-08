// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzdr, zzdq

private static class zzlW
    implements zzdr
{

    private IBinder zzlW;

    public IBinder asBinder()
    {
        return zzlW;
    }

    public void zza(zzdq zzdq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (zzdq1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzdq1 = zzdq1.asBinder();
_L1:
        parcel.writeStrongBinder(zzdq1);
        zzlW.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzdq1 = null;
          goto _L1
        zzdq1;
        parcel1.recycle();
        parcel.recycle();
        throw zzdq1;
    }

    (IBinder ibinder)
    {
        zzlW = ibinder;
    }
}
