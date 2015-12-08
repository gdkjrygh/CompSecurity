// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

// Referenced classes of package com.google.android.gms.internal:
//            zzqt, zzqq, zzqr

public static abstract class zza.zznF extends Binder
    implements zzqt
{
    private static class zza
        implements zzqt
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public zzqq zza(zzd zzd1, zzc zzc1, WalletFragmentOptions walletfragmentoptions, zzqr zzqr1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L7:
            parcel.writeStrongBinder(zzd1);
            if (zzc1 == null) goto _L4; else goto _L3
_L3:
            zzd1 = zzc1.asBinder();
_L8:
            parcel.writeStrongBinder(zzd1);
            if (walletfragmentoptions == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            walletfragmentoptions.writeToParcel(parcel, 0);
_L9:
            zzd1 = obj;
            if (zzqr1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            zzd1 = zzqr1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = zzqq.zza.zzdF(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
_L2:
            zzd1 = null;
              goto _L7
_L4:
            zzd1 = null;
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L7
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzqt zzdI(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
        if (iinterface != null && (iinterface instanceof zzqt))
        {
            return (zzqt)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj1 = null;
        zzd zzd;
        zzc zzc;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            zzd = com.google.android.gms.dynamic.zbg(parcel.readStrongBinder());
            zzc = com.google.android.gms.dynamic.zbf(parcel.readStrongBinder());
            break;
        }
        Object obj;
        if (parcel.readInt() != 0)
        {
            obj = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(parcel);
        } else
        {
            obj = null;
        }
        obj = zza(zzd, zzc, ((WalletFragmentOptions) (obj)), zzdG(parcel.readStrongBinder()));
        parcel1.writeNoException();
        parcel = obj1;
        if (obj != null)
        {
            parcel = ((zzqq) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
