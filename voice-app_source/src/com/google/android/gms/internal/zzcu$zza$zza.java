// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzcu, zzco

private static class zznF
    implements zzcu
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zzco zzco1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if (zzco1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzco1 = zzco1.asBinder();
_L1:
        parcel.writeStrongBinder(zzco1);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzco1 = null;
          goto _L1
        zzco1;
        parcel1.recycle();
        parcel.recycle();
        throw zzco1;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
