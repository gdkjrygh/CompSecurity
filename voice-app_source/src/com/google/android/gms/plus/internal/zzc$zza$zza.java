// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zzc

private static class zznF
    implements zzc
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public zzd zza(zzd zzd1, int i, int j, String s, int k)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        if (zzd1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        zzd1 = zzd1.asBinder();
_L1:
        parcel.writeStrongBinder(zzd1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeString(s);
        parcel.writeInt(k);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzd1 = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
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

    public zzd zza(zzd zzd1, int i, int j, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        if (zzd1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        zzd1 = zzd1.asBinder();
_L1:
        parcel.writeStrongBinder(zzd1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeString(s);
        parcel.writeString(s1);
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        zzd1 = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
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
        zznF = ibinder;
    }
}
