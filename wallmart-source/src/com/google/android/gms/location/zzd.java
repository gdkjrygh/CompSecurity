// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzd
    {

        public static zzd zzbX(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (iinterface != null && (iinterface instanceof zzd))
            {
                return (zzd)iinterface;
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
                parcel1.writeString("com.google.android.gms.location.ILocationListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Location)Location.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onLocationChanged(parcel);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.location.ILocationListener");
        }
    }

    private static class zza.zza
        implements zzd
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void onLocationChanged(Location location)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
            if (location == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            location.writeToParcel(parcel, 0);
_L1:
            zznI.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            location;
            parcel.recycle();
            throw location;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void onLocationChanged(Location location)
        throws RemoteException;
}
