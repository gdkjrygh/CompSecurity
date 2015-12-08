// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zziz, zziy

public static abstract class zza.zznF extends Binder
    implements zziz
{
    private static class zza
        implements zziz
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(zziy zziy1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
            if (zziy1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zziy1 = zziy1.asBinder();
_L1:
            parcel.writeStrongBinder(zziy1);
            parcel.writeString(s);
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zziy1 = null;
              goto _L1
            zziy1;
            parcel1.recycle();
            parcel.recycle();
            throw zziy1;
        }

        public void zzb(zziy zziy1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
            if (zziy1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zziy1 = zziy1.asBinder();
_L1:
            parcel.writeStrongBinder(zziy1);
            parcel.writeString(s);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zziy1 = null;
              goto _L1
            zziy1;
            parcel1.recycle();
            parcel.recycle();
            throw zziy1;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zziz zzai(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
        if (iinterface != null && (iinterface instanceof zziz))
        {
            return (zziz)iinterface;
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
            parcel1.writeString("com.google.android.gms.appinvite.internal.IAppInviteService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
            zzb(zzah(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
            zza(zzah(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
