// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzci, zzch

private static class zznF
    implements zzci
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zzch zzch1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (zzch1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzch1 = zzch1.asBinder();
_L1:
        parcel.writeStrongBinder(zzch1);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzch1 = null;
          goto _L1
        zzch1;
        parcel1.recycle();
        parcel.recycle();
        throw zzch1;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
