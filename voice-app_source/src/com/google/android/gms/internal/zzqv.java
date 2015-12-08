// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;

public interface zzqv
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzqv
    {

        public static zzqv zzdK(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            if (iinterface != null && (iinterface instanceof zzqv))
            {
                return (zzqv)iinterface;
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
                parcel1.writeString("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                i = parcel.readInt();
                MaskedWallet maskedwallet;
                if (parcel.readInt() != 0)
                {
                    maskedwallet = (MaskedWallet)MaskedWallet.CREATOR.createFromParcel(parcel);
                } else
                {
                    maskedwallet = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(i, maskedwallet, parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                i = parcel.readInt();
                FullWallet fullwallet;
                if (parcel.readInt() != 0)
                {
                    fullwallet = (FullWallet)FullWallet.CREATOR.createFromParcel(parcel);
                } else
                {
                    fullwallet = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(i, fullwallet, parcel);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                i = parcel.readInt();
                boolean flag;
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(i, flag, parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zzj(i, parcel);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                Status status;
                GetInstrumentsResponse getinstrumentsresponse;
                if (parcel.readInt() != 0)
                {
                    status = (Status)Status.CREATOR.createFromParcel(parcel);
                } else
                {
                    status = null;
                }
                if (parcel.readInt() != 0)
                {
                    getinstrumentsresponse = (GetInstrumentsResponse)GetInstrumentsResponse.CREATOR.createFromParcel(parcel);
                } else
                {
                    getinstrumentsresponse = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(status, getinstrumentsresponse, parcel);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                i = parcel.readInt();
                boolean flag1;
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zzb(i, flag1, parcel);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                break;
            }
            Status status1;
            GetBuyFlowInitializationTokenResponse getbuyflowinitializationtokenresponse;
            if (parcel.readInt() != 0)
            {
                status1 = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                status1 = null;
            }
            if (parcel.readInt() != 0)
            {
                getbuyflowinitializationtokenresponse = (GetBuyFlowInitializationTokenResponse)GetBuyFlowInitializationTokenResponse.CREATOR.createFromParcel(parcel);
            } else
            {
                getbuyflowinitializationtokenresponse = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(status1, getbuyflowinitializationtokenresponse, parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        }
    }

    private static class zza.zza
        implements zzqv
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(int i, FullWallet fullwallet, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            parcel.writeInt(i);
            if (fullwallet == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            fullwallet.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            fullwallet;
            parcel1.recycle();
            parcel.recycle();
            throw fullwallet;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(int i, MaskedWallet maskedwallet, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            parcel.writeInt(i);
            if (maskedwallet == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            maskedwallet.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            maskedwallet;
            parcel1.recycle();
            parcel.recycle();
            throw maskedwallet;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(int i, boolean flag, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            parcel.writeInt(i);
            if (flag)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(3, parcel, parcel1, 0);
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

        public void zza(Status status, GetBuyFlowInitializationTokenResponse getbuyflowinitializationtokenresponse, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            if (status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L5:
            if (getbuyflowinitializationtokenresponse == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            getbuyflowinitializationtokenresponse.writeToParcel(parcel, 0);
_L6:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L7:
            zznF.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
_L4:
            parcel.writeInt(0);
              goto _L6
            parcel.writeInt(0);
              goto _L7
        }

        public void zza(Status status, GetInstrumentsResponse getinstrumentsresponse, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            if (status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L5:
            if (getinstrumentsresponse == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            getinstrumentsresponse.writeToParcel(parcel, 0);
_L6:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L7:
            zznF.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
_L4:
            parcel.writeInt(0);
              goto _L6
            parcel.writeInt(0);
              goto _L7
        }

        public void zzb(int i, boolean flag, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            parcel.writeInt(i);
            if (flag)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(6, parcel, parcel1, 0);
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

        public void zzj(int i, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(4, parcel, parcel1, 0);
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

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zza(int i, FullWallet fullwallet, Bundle bundle)
        throws RemoteException;

    public abstract void zza(int i, MaskedWallet maskedwallet, Bundle bundle)
        throws RemoteException;

    public abstract void zza(int i, boolean flag, Bundle bundle)
        throws RemoteException;

    public abstract void zza(Status status, GetBuyFlowInitializationTokenResponse getbuyflowinitializationtokenresponse, Bundle bundle)
        throws RemoteException;

    public abstract void zza(Status status, GetInstrumentsResponse getinstrumentsresponse, Bundle bundle)
        throws RemoteException;

    public abstract void zzb(int i, boolean flag, Bundle bundle)
        throws RemoteException;

    public abstract void zzj(int i, Bundle bundle)
        throws RemoteException;
}
