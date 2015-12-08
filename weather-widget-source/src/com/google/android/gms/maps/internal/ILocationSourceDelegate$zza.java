// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            ILocationSourceDelegate, zzh

public static abstract class attachInterface extends Binder
    implements ILocationSourceDelegate
{
    private static class zza
        implements ILocationSourceDelegate
    {

        private IBinder zznI;

        public void activate(zzh zzh1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            if (zzh1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzh1 = zzh1.asBinder();
_L1:
            parcel.writeStrongBinder(zzh1);
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzh1 = null;
              goto _L1
            zzh1;
            parcel1.recycle();
            parcel.recycle();
            throw zzh1;
        }

        public IBinder asBinder()
        {
            return zznI;
        }

        public void deactivate()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            zznI.transact(2, parcel, parcel1, 0);
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

        zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public static ILocationSourceDelegate zzcn(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        if (iinterface != null && (iinterface instanceof ILocationSourceDelegate))
        {
            return (ILocationSourceDelegate)iinterface;
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
            parcel1.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            activate(activate(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            deactivate();
            parcel1.writeNoException();
            return true;
        }
    }

    public zza.zznI()
    {
        attachInterface(this, "com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }
}
