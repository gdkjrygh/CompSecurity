// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.zzl;

public interface zzs
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzs
    {

        public static zzs zzcE(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
            if (iinterface != null && (iinterface instanceof zzs))
            {
                return (zzs)iinterface;
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
                parcel1.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = StreetViewPanoramaLocation.CREATOR.zzfh(parcel);
            } else
            {
                parcel = null;
            }
            onStreetViewPanoramaChange(parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
        }
    }

    private static class zza.zza
        implements zzs
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
            if (streetviewpanoramalocation == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            streetviewpanoramalocation.writeToParcel(parcel, 0);
_L1:
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramalocation;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramalocation;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation)
        throws RemoteException;
}
