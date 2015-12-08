// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzkr, zzkq

private static class zznF
    implements zzkr
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zzkq zzkq1)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
        if (zzkq1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = zzkq1.asBinder();
        parcel.writeStrongBinder(ibinder);
        zznF.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        zzkq1;
        parcel.recycle();
        throw zzkq1;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
