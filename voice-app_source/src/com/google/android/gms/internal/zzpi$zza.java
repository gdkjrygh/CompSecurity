// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzpi, zzph

public static abstract class zza.zznF extends Binder
    implements zzpi
{
    private static class zza
        implements zzpi
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(zzph zzph1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
            if (zzph1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzph1 = zzph1.asBinder();
_L1:
            parcel.writeStrongBinder(zzph1);
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzph1 = null;
              goto _L1
            zzph1;
            parcel1.recycle();
            parcel.recycle();
            throw zzph1;
        }

        public void zza(zzph zzph1, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
            if (zzph1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zzph1 = zzph1.asBinder();
_L1:
            parcel.writeStrongBinder(zzph1);
            parcel.writeByteArray(abyte0);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzph1 = null;
              goto _L1
            zzph1;
            parcel1.recycle();
            parcel.recycle();
            throw zzph1;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzpi zzdx(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (iinterface != null && (iinterface instanceof zzpi))
        {
            return (zzpi)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.safetynet.internal.ISafetyNetService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
            zza(zzdw(parcel.readStrongBinder()), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
            zza(zzdw(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
