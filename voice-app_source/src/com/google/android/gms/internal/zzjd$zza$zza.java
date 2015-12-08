// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzjd, zzjc

private static class zznF
    implements zzjd
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zzjc zzjc1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (zzjc1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        zzjc1 = zzjc1.asBinder();
_L1:
        parcel.writeStrongBinder(zzjc1);
        zznF.transact(5005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzjc1 = null;
          goto _L1
        zzjc1;
        parcel1.recycle();
        parcel.recycle();
        throw zzjc1;
    }

    public void zza(zzjc zzjc1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (zzjc1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        zzjc1 = zzjc1.asBinder();
_L1:
        parcel.writeStrongBinder(zzjc1);
        parcel.writeInt(i);
        zznF.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzjc1 = null;
          goto _L1
        zzjc1;
        parcel1.recycle();
        parcel.recycle();
        throw zzjc1;
    }

    public void zza(zzjc zzjc1, int i, String s, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (zzjc1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        zzjc1 = zzjc1.asBinder();
_L1:
        parcel.writeStrongBinder(zzjc1);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        zznF.transact(5006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzjc1 = null;
          goto _L1
        zzjc1;
        parcel1.recycle();
        parcel.recycle();
        throw zzjc1;
    }

    public void zza(zzjc zzjc1, int i, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (zzjc1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        zzjc1 = zzjc1.asBinder();
_L1:
        parcel.writeStrongBinder(zzjc1);
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        zznF.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzjc1 = null;
          goto _L1
        zzjc1;
        parcel1.recycle();
        parcel.recycle();
        throw zzjc1;
    }

    public void zzb(zzjc zzjc1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (zzjc1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        zzjc1 = zzjc1.asBinder();
_L1:
        parcel.writeStrongBinder(zzjc1);
        zznF.transact(5008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzjc1 = null;
          goto _L1
        zzjc1;
        parcel1.recycle();
        parcel.recycle();
        throw zzjc1;
    }

    public void zzb(zzjc zzjc1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (zzjc1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        zzjc1 = zzjc1.asBinder();
_L1:
        parcel.writeStrongBinder(zzjc1);
        parcel.writeInt(i);
        zznF.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzjc1 = null;
          goto _L1
        zzjc1;
        parcel1.recycle();
        parcel.recycle();
        throw zzjc1;
    }

    public void zzc(zzjc zzjc1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (zzjc1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        zzjc1 = zzjc1.asBinder();
_L1:
        parcel.writeStrongBinder(zzjc1);
        zznF.transact(5009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzjc1 = null;
          goto _L1
        zzjc1;
        parcel1.recycle();
        parcel.recycle();
        throw zzjc1;
    }

    public int zzkV()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        zznF.transact(5001, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int zzkW()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        zznF.transact(5002, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
