// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzpi, zzph

private static class zznF
    implements zzpi
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zzph zzph1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (zzph1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzph1 = zzph1.asBinder();
_L1:
        parcel.writeStrongBinder(zzph1);
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzph1 = null;
          goto _L1
        zzph1;
        parcel1.recycle();
        parcel.recycle();
        throw zzph1;
    }

    public void zza(zzph zzph1, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (zzph1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzph1 = zzph1.asBinder();
_L1:
        parcel.writeStrongBinder(zzph1);
        parcel.writeByteArray(abyte0);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzph1 = null;
          goto _L1
        zzph1;
        parcel1.recycle();
        parcel.recycle();
        throw zzph1;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
