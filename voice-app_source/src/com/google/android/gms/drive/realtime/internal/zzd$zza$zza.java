// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            zzd, ParcelableCollaborator

private static class zznF
    implements zzd
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(ParcelableCollaborator parcelablecollaborator)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
        if (parcelablecollaborator == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        parcelablecollaborator.writeToParcel(parcel, 0);
_L1:
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        parcelablecollaborator;
        parcel1.recycle();
        parcel.recycle();
        throw parcelablecollaborator;
    }

    public void zzb(ParcelableCollaborator parcelablecollaborator)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
        if (parcelablecollaborator == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        parcelablecollaborator.writeToParcel(parcel, 0);
_L1:
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        parcelablecollaborator;
        parcel1.recycle();
        parcel.recycle();
        throw parcelablecollaborator;
    }

    llaborator(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
