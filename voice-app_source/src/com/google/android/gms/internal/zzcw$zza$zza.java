// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzcw, zzcs

private static class zznF
    implements zzcw
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(zzcs zzcs1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (zzcs1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzcs1 = zzcs1.asBinder();
_L1:
        parcel.writeStrongBinder(zzcs1);
        parcel.writeString(s);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzcs1 = null;
          goto _L1
        zzcs1;
        parcel1.recycle();
        parcel.recycle();
        throw zzcs1;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
