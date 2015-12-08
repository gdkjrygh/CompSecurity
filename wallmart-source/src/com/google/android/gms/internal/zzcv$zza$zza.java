// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzcr

private static class zznI
    implements zzcv
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(zzcr zzcr1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (zzcr1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzcr1 = zzcr1.asBinder();
_L1:
        parcel.writeStrongBinder(zzcr1);
        parcel.writeString(s);
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzcr1 = null;
          goto _L1
        zzcr1;
        parcel1.recycle();
        parcel.recycle();
        throw zzcr1;
    }

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
