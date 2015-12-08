// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zziz, zziy

private static class zznF
    implements zziz
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zziy zziy1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
        if (zziy1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zziy1 = zziy1.asBinder();
_L1:
        parcel.writeStrongBinder(zziy1);
        parcel.writeString(s);
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zziy1 = null;
          goto _L1
        zziy1;
        parcel1.recycle();
        parcel.recycle();
        throw zziy1;
    }

    public void zzb(zziy zziy1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
        if (zziy1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zziy1 = zziy1.asBinder();
_L1:
        parcel.writeStrongBinder(zziy1);
        parcel.writeString(s);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zziy1 = null;
          goto _L1
        zziy1;
        parcel1.recycle();
        parcel.recycle();
        throw zziy1;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
