// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzcu, zzcp

private static class zznI
    implements zzcu
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(zzcp zzcp1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (zzcp1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzcp1 = zzcp1.asBinder();
_L1:
        parcel.writeStrongBinder(zzcp1);
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzcp1 = null;
          goto _L1
        zzcp1;
        parcel1.recycle();
        parcel.recycle();
        throw zzcp1;
    }

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
