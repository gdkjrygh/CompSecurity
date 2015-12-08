// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzlc, zzlb

private static class zznI
    implements zzlc
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(zzlb zzlb1)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
        if (zzlb1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = zzlb1.asBinder();
        parcel.writeStrongBinder(ibinder);
        zznI.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        zzlb1;
        parcel.recycle();
        throw zzlb1;
    }

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
