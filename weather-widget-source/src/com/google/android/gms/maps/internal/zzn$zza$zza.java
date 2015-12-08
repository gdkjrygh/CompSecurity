// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzn

private static class zznI
    implements zzn
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zzb(zzf zzf1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (zzf1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzf1 = zzf1.asBinder();
_L1:
        parcel.writeStrongBinder(zzf1);
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzf1 = null;
          goto _L1
        zzf1;
        parcel1.recycle();
        parcel.recycle();
        throw zzf1;
    }

    public void zzc(zzf zzf1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (zzf1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzf1 = zzf1.asBinder();
_L1:
        parcel.writeStrongBinder(zzf1);
        zznI.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzf1 = null;
          goto _L1
        zzf1;
        parcel1.recycle();
        parcel.recycle();
        throw zzf1;
    }

    public void zzd(zzf zzf1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (zzf1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzf1 = zzf1.asBinder();
_L1:
        parcel.writeStrongBinder(zzf1);
        zznI.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
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
