// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzkd, zzkc, zzke

private static class zznF
    implements zzkd
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void destroy()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        zznF.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void disconnect()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        zznF.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void zza(zzkc zzkc1)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (zzkc1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = zzkc1.asBinder();
        parcel.writeStrongBinder(ibinder);
        zznF.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        zzkc1;
        parcel.recycle();
        throw zzkc1;
    }

    public void zza(zzkc zzkc1, int i)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (zzkc1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ibinder = zzkc1.asBinder();
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        zznF.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        zzkc1;
        parcel.recycle();
        throw zzkc1;
    }

    public void zza(zzkc zzkc1, zzke zzke1, String s, String s1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (zzkc1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        zzkc1 = zzkc1.asBinder();
_L1:
        parcel.writeStrongBinder(zzkc1);
        zzkc1 = obj;
        if (zzke1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        zzkc1 = zzke1.asBinder();
        parcel.writeStrongBinder(zzkc1);
        parcel.writeString(s);
        parcel.writeString(s1);
        zznF.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        zzkc1 = null;
          goto _L1
        zzkc1;
        parcel.recycle();
        throw zzkc1;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
