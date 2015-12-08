// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzck

private static class zznF
    implements zzck
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public Uri getUri()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Uri uri = (Uri)Uri.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return uri;
_L2:
        uri = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public zzd zzdw()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        zzd zzd;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzd = com.google.android.gms.dynamic..zznF(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzd;
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
