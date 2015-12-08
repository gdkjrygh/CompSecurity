// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzpm

public interface zzpn
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzpn
    {

        public static zzpn zzdA(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
            if (iinterface != null && (iinterface instanceof zzpn))
            {
                return (zzpn)iinterface;
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
                parcel1.writeString("com.google.android.gms.search.internal.ISearchAuthService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
                zza(zzpm.zza.zzdz(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzpn
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(zzpm zzpm1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthService");
            if (zzpm1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            zzpm1 = zzpm1.asBinder();
_L1:
            parcel.writeStrongBinder(zzpm1);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzpm1 = null;
              goto _L1
            zzpm1;
            parcel1.recycle();
            parcel.recycle();
            throw zzpm1;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zza(zzpm zzpm, String s, String s1)
        throws RemoteException;
}
