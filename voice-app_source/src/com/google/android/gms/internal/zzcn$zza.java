// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzcn

public static abstract class zza.zznF extends Binder
    implements zzcn
{
    private static class zza
        implements zzcn
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public IBinder zza(zzd zzd1, zzd zzd2, zzd zzd3, int i)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (zzd2 == null) goto _L4; else goto _L3
_L3:
            zzd1 = zzd2.asBinder();
_L6:
            parcel.writeStrongBinder(zzd1);
            zzd1 = obj;
            if (zzd3 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            zzd1 = zzd3.asBinder();
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            zzd1 = null;
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L5
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzcn zzv(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (iinterface != null && (iinterface instanceof zzcn))
        {
            return (zzcn)iinterface;
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
            parcel1.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            parcel = zza(com.google.android.gms.dynamic.zbg(parcel.readStrongBinder()), com.google.android.gms.dynamic.zbg(parcel.readStrongBinder()), com.google.android.gms.dynamic.zbg(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }
}
