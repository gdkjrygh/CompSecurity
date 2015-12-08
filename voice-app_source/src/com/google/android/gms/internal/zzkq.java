// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzkq
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzkq
    {

        public static zzkq zzaL(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
            if (iinterface != null && (iinterface instanceof zzkq))
            {
                return (zzkq)iinterface;
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
                parcel1.writeString("com.google.android.gms.common.internal.service.ICommonCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
                zzbB(parcel.readInt());
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
        }
    }

    private static class zza.zza
        implements zzkq
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zzbB(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonCallbacks");
            parcel.writeInt(i);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zzbB(int i)
        throws RemoteException;
}
