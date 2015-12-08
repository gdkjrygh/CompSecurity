// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzm

private static class zznI
    implements zzm
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public boolean zza(zzf zzf1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        if (zzf1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        zzf1 = zzf1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(zzf1);
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
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
