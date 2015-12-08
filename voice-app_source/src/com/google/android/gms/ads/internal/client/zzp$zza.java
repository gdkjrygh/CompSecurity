// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzcx;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzp, zzo, zzn

public static abstract class attachInterface extends Binder
    implements zzp
{
    private static class zza
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
            zzo zzo1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzo1 = com.google.android.gms.ads.internal.client.zzo.zza.zzh(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzo1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzp zzi(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (iinterface != null && (iinterface instanceof zzp))
        {
            return (zzp)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        zzo zzo1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzo1 = zzbi();
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (zzo1 != null)
            {
                parcel = zzo1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzb(zzg(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zza(com.google.android.gms.internal..zzz(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zza(com.google.android.gms.internal..zzA(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zza(parcel.readString(), com.google.android.gms.internal..zzC(parcel.readStrongBinder()), com.google.android.gms.internal..zzB(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            obj = zzo1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = NativeAdOptionsParcel.CREATOR.zzf(parcel);
        }
        zza(((NativeAdOptionsParcel) (obj)));
        parcel1.writeNoException();
        return true;
    }

    public zza.zznF()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }
}
