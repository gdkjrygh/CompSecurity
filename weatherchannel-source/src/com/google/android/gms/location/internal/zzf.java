// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzf
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzf
    {

        public static zzf zzbV(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
        /* block-local class not found */
        class zza {}

            if (iinterface != null && (iinterface instanceof zzf))
            {
                return (zzf)iinterface;
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
                parcel1.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                zza(parcel.readInt(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                zzb(parcel.readInt(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                i = parcel.readInt();
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(i, parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.location.internal.IGeofencerCallbacks");
        }
    }


    public abstract void zza(int i, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void zza(int i, String as[])
        throws RemoteException;

    public abstract void zzb(int i, String as[])
        throws RemoteException;
}
