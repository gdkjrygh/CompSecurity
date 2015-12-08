// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzh

private static class zznF
    implements zzh
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zze(zzi zzi1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        if (zzi1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzi1 = zzi1.asBinder();
_L1:
        parcel.writeStrongBinder(zzi1);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzi1 = null;
          goto _L1
        zzi1;
        parcel1.recycle();
        parcel.recycle();
        throw zzi1;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
