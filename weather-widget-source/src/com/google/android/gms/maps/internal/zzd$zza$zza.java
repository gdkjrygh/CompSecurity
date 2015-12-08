// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzd

private static class zznI
    implements com.google.android.gms.maps.internal.zzd
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public zzd zzf(zzf zzf1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (zzf1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzf1 = zzf1.asBinder();
_L1:
        parcel.writeStrongBinder(zzf1);
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzf1 = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzf1;
        zzf1 = null;
          goto _L1
        zzf1;
        parcel1.recycle();
        parcel.recycle();
        throw zzf1;
    }

    public zzd zzg(zzf zzf1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (zzf1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzf1 = zzf1.asBinder();
_L1:
        parcel.writeStrongBinder(zzf1);
        zznI.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        zzf1 = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzf1;
        zzf1 = null;
          goto _L1
        zzf1;
        parcel1.recycle();
        parcel.recycle();
        throw zzf1;
    }

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
