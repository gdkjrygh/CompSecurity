// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

// Referenced classes of package com.google.android.gms.internal:
//            zzqq

public static abstract class zza.zznF extends Binder
    implements zzqq
{
    private static class zza
        implements zzqq
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public int getState()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            zznF.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void initialize(WalletFragmentInitParams walletfragmentinitparams)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (walletfragmentinitparams == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            walletfragmentinitparams.writeToParcel(parcel, 0);
_L1:
            zznF.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            walletfragmentinitparams;
            parcel1.recycle();
            parcel.recycle();
            throw walletfragmentinitparams;
        }

        public void onActivityResult(int i, int j, Intent intent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            parcel.writeInt(i);
            parcel.writeInt(j);
            if (intent == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            parcel.writeInt(1);
            intent.writeToParcel(parcel, 0);
_L1:
            zznF.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            intent;
            parcel1.recycle();
            parcel.recycle();
            throw intent;
        }

        public void onCreate(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public zzd onCreateView(zzd zzd1, zzd zzd2, Bundle bundle)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            zzd1 = obj;
            if (zzd2 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            zzd1 = zzd2.asBinder();
            parcel.writeStrongBinder(zzd1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L5
        }

        public void onPause()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            zznF.transact(6, parcel, parcel1, 0);
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

        public void onResume()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            zznF.transact(5, parcel, parcel1, 0);
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

        public void onSaveInstanceState(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() != 0)
            {
                bundle.readFromParcel(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public void onStart()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            zznF.transact(4, parcel, parcel1, 0);
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

        public void onStop()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            zznF.transact(7, parcel, parcel1, 0);
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

        public void setEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12, parcel, parcel1, 0);
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

        public void updateMaskedWallet(MaskedWallet maskedwallet)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (maskedwallet == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            maskedwallet.writeToParcel(parcel, 0);
_L1:
            zznF.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            maskedwallet;
            parcel1.recycle();
            parcel.recycle();
            throw maskedwallet;
        }

        public void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (maskedwalletrequest == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            maskedwalletrequest.writeToParcel(parcel, 0);
_L1:
            zznF.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            maskedwalletrequest;
            parcel1.recycle();
            parcel.recycle();
            throw maskedwalletrequest;
        }

        public void zza(zzd zzd1, WalletFragmentOptions walletfragmentoptions, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (walletfragmentoptions == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            walletfragmentoptions.writeToParcel(parcel, 0);
_L6:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_127;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L7:
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
            parcel.writeInt(0);
              goto _L7
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzqq zzdF(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
        if (iinterface != null && (iinterface instanceof zzqq))
        {
            return (zzqq)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        WalletFragmentOptions walletfragmentoptions = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            zzd zzd1 = com.google.android.gms.dynamic.zbg(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                walletfragmentoptions = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(parcel);
            } else
            {
                walletfragmentoptions = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(zzd1, walletfragmentoptions, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onCreate(parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            zzd zzd2 = com.google.android.gms.dynamic.zbg(parcel.readStrongBinder());
            zzd zzd3 = com.google.android.gms.dynamic.zbg(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zzd2 = onCreateView(zzd2, zzd3, parcel);
            parcel1.writeNoException();
            parcel = walletfragmentoptions;
            if (zzd2 != null)
            {
                parcel = zzd2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            onStart();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            onResume();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            onPause();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            onStop();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onSaveInstanceState(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            i = parcel.readInt();
            j = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (Intent)Intent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onActivityResult(i, j, parcel);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (WalletFragmentInitParams)WalletFragmentInitParams.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            initialize(parcel);
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            updateMaskedWalletRequest(parcel);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setEnabled(flag);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            i = getState();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (MaskedWallet)MaskedWallet.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        updateMaskedWallet(parcel);
        parcel1.writeNoException();
        return true;
    }
}
