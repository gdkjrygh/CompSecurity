// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzeh;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zzc

private static class zznI
    implements zzc
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public IBinder zza(zzd zzd1, zzeh zzeh1, int i)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (zzd1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        zzd1 = zzd1.asBinder();
_L1:
        parcel.writeStrongBinder(zzd1);
        zzd1 = obj;
        if (zzeh1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zzd1 = zzeh1.asBinder();
        parcel.writeStrongBinder(zzd1);
        parcel.writeInt(i);
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzd1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return zzd1;
        zzd1 = null;
          goto _L1
        zzd1;
        parcel1.recycle();
        parcel.recycle();
        throw zzd1;
    }

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
