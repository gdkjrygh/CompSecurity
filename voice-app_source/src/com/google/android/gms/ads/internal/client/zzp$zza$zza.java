// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzcx;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzp, zzn, zzo

private static class zznF
    implements zzp
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(NativeAdOptionsParcel nativeadoptionsparcel)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (nativeadoptionsparcel == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        nativeadoptionsparcel.writeToParcel(parcel, 0);
_L1:
        zznF.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        nativeadoptionsparcel;
        parcel1.recycle();
        parcel.recycle();
        throw nativeadoptionsparcel;
    }

    public void zza(zzcu zzcu1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (zzcu1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzcu1 = zzcu1.asBinder();
_L1:
        parcel.writeStrongBinder(zzcu1);
        zznF.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzcu1 = null;
          goto _L1
        zzcu1;
        parcel1.recycle();
        parcel.recycle();
        throw zzcu1;
    }

    public void zza(zzcv zzcv1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (zzcv1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzcv1 = zzcv1.asBinder();
_L1:
        parcel.writeStrongBinder(zzcv1);
        zznF.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzcv1 = null;
          goto _L1
        zzcv1;
        parcel1.recycle();
        parcel.recycle();
        throw zzcv1;
    }

    public void zza(String s, zzcx zzcx1, zzcw zzcw1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        parcel.writeString(s);
        if (zzcx1 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        s = zzcx1.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        s = obj;
        if (zzcw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        s = zzcw1.asBinder();
        parcel.writeStrongBinder(s);
        zznF.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public void zzb(zzn zzn1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (zzn1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzn1 = zzn1.asBinder();
_L1:
        parcel.writeStrongBinder(zzn1);
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzn1 = null;
          goto _L1
        zzn1;
        parcel1.recycle();
        parcel.recycle();
        throw zzn1;
    }

    public zzo zzbi()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        zzo zzo;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzo = zznF(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzo;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    ionsParcel(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
