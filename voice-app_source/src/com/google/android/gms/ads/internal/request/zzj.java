// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel, zzh

public interface zzj
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzj
    {

        public static zzj zzV(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
            if (iinterface != null && (iinterface instanceof zzj))
            {
                return (zzj)iinterface;
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
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.request.IAdResponseListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = AdResponseParcel.CREATOR.zzk(parcel);
            } else
            {
                parcel = null;
            }
            zzb(parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
        }
    }

    private static class zza.zza
        implements zzj
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zzb(AdResponseParcel adresponseparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdResponseListener");
            if (adresponseparcel == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            adresponseparcel.writeToParcel(parcel, 0);
_L1:
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            adresponseparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adresponseparcel;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zzb(AdResponseParcel adresponseparcel)
        throws RemoteException;
}
