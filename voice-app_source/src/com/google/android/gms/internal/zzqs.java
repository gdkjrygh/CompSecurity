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
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzqv, zzqu

public interface zzqs
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzqs
    {

        public static zzqs zzdH(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
            if (iinterface != null && (iinterface instanceof zzqs))
            {
                return (zzqs)iinterface;
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
                parcel1.writeString("com.google.android.gms.wallet.internal.IOwService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                Bundle bundle;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    bundle = null;
                }
                zza(parcel1, bundle, zzqv.zza.zzdK(parcel.readStrongBinder()));
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                Bundle bundle1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (FullWalletRequest)FullWalletRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    bundle1 = null;
                }
                zza(parcel1, bundle1, zzqv.zza.zzdK(parcel.readStrongBinder()));
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                String s = parcel.readString();
                String s1 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                zza(s, s1, parcel1, zzqv.zza.zzdK(parcel.readStrongBinder()));
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                if (parcel.readInt() != 0)
                {
                    parcel1 = (NotifyTransactionStatusRequest)NotifyTransactionStatusRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(parcel1, parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                zza(parcel1, zzqv.zza.zzdK(parcel.readStrongBinder()));
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                Bundle bundle2;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (CreateWalletObjectsRequest)CreateWalletObjectsRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    bundle2 = null;
                }
                zza(parcel1, bundle2, zzqv.zza.zzdK(parcel.readStrongBinder()));
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                Bundle bundle3;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    bundle3 = null;
                }
                zza(parcel1, bundle3, zzqu.zza.zzdJ(parcel.readStrongBinder()));
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                Bundle bundle4;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (GetInstrumentsRequest)GetInstrumentsRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    bundle4 = null;
                }
                zza(parcel1, bundle4, zzqv.zza.zzdK(parcel.readStrongBinder()));
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zzz(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zzA(parcel);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                zzb(parcel1, zzqv.zza.zzdK(parcel.readStrongBinder()));
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                break;
            }
            Bundle bundle5;
            if (parcel.readInt() != 0)
            {
                parcel1 = (GetBuyFlowInitializationTokenRequest)GetBuyFlowInitializationTokenRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle5 = null;
            }
            zza(parcel1, bundle5, zzqv.zza.zzdK(parcel.readStrongBinder()));
            return true;
        }
    }

    private static class zza.zza
        implements zzqs
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zzA(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(10, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel.recycle();
            throw bundle;
        }

        public void zza(Bundle bundle, zzqv zzqv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            bundle = obj;
            if (zzqv1 == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            bundle = zzqv1.asBinder();
            parcel.writeStrongBinder(bundle);
            zznF.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            bundle;
            parcel.recycle();
            throw bundle;
        }

        public void zza(CreateWalletObjectsRequest createwalletobjectsrequest, Bundle bundle, zzqv zzqv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (createwalletobjectsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createwalletobjectsrequest.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            createwalletobjectsrequest = obj;
            if (zzqv1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            createwalletobjectsrequest = zzqv1.asBinder();
            parcel.writeStrongBinder(createwalletobjectsrequest);
            zznF.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            createwalletobjectsrequest;
            parcel.recycle();
            throw createwalletobjectsrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(FullWalletRequest fullwalletrequest, Bundle bundle, zzqv zzqv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (fullwalletrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            fullwalletrequest.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            fullwalletrequest = obj;
            if (zzqv1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            fullwalletrequest = zzqv1.asBinder();
            parcel.writeStrongBinder(fullwalletrequest);
            zznF.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            fullwalletrequest;
            parcel.recycle();
            throw fullwalletrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(MaskedWalletRequest maskedwalletrequest, Bundle bundle, zzqu zzqu1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (maskedwalletrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            maskedwalletrequest.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            maskedwalletrequest = obj;
            if (zzqu1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            maskedwalletrequest = zzqu1.asBinder();
            parcel.writeStrongBinder(maskedwalletrequest);
            zznF.transact(7, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            maskedwalletrequest;
            parcel.recycle();
            throw maskedwalletrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(MaskedWalletRequest maskedwalletrequest, Bundle bundle, zzqv zzqv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (maskedwalletrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            maskedwalletrequest.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            maskedwalletrequest = obj;
            if (zzqv1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            maskedwalletrequest = zzqv1.asBinder();
            parcel.writeStrongBinder(maskedwalletrequest);
            zznF.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            maskedwalletrequest;
            parcel.recycle();
            throw maskedwalletrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(NotifyTransactionStatusRequest notifytransactionstatusrequest, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (notifytransactionstatusrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            notifytransactionstatusrequest.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            zznF.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            notifytransactionstatusrequest;
            parcel.recycle();
            throw notifytransactionstatusrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(GetBuyFlowInitializationTokenRequest getbuyflowinitializationtokenrequest, Bundle bundle, zzqv zzqv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (getbuyflowinitializationtokenrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getbuyflowinitializationtokenrequest.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            getbuyflowinitializationtokenrequest = obj;
            if (zzqv1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            getbuyflowinitializationtokenrequest = zzqv1.asBinder();
            parcel.writeStrongBinder(getbuyflowinitializationtokenrequest);
            zznF.transact(12, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getbuyflowinitializationtokenrequest;
            parcel.recycle();
            throw getbuyflowinitializationtokenrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(GetInstrumentsRequest getinstrumentsrequest, Bundle bundle, zzqv zzqv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (getinstrumentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getinstrumentsrequest.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            getinstrumentsrequest = obj;
            if (zzqv1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            getinstrumentsrequest = zzqv1.asBinder();
            parcel.writeStrongBinder(getinstrumentsrequest);
            zznF.transact(8, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getinstrumentsrequest;
            parcel.recycle();
            throw getinstrumentsrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(String s, String s1, Bundle bundle, zzqv zzqv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            parcel.writeString(s);
            parcel.writeString(s1);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            s = obj;
            if (zzqv1 == null)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            s = zzqv1.asBinder();
            parcel.writeStrongBinder(s);
            zznF.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel.recycle();
            throw s;
        }

        public void zzb(Bundle bundle, zzqv zzqv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            bundle = obj;
            if (zzqv1 == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            bundle = zzqv1.asBinder();
            parcel.writeStrongBinder(bundle);
            zznF.transact(11, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            bundle;
            parcel.recycle();
            throw bundle;
        }

        public void zzz(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(9, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel.recycle();
            throw bundle;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zzA(Bundle bundle)
        throws RemoteException;

    public abstract void zza(Bundle bundle, zzqv zzqv)
        throws RemoteException;

    public abstract void zza(CreateWalletObjectsRequest createwalletobjectsrequest, Bundle bundle, zzqv zzqv)
        throws RemoteException;

    public abstract void zza(FullWalletRequest fullwalletrequest, Bundle bundle, zzqv zzqv)
        throws RemoteException;

    public abstract void zza(MaskedWalletRequest maskedwalletrequest, Bundle bundle, zzqu zzqu)
        throws RemoteException;

    public abstract void zza(MaskedWalletRequest maskedwalletrequest, Bundle bundle, zzqv zzqv)
        throws RemoteException;

    public abstract void zza(NotifyTransactionStatusRequest notifytransactionstatusrequest, Bundle bundle)
        throws RemoteException;

    public abstract void zza(GetBuyFlowInitializationTokenRequest getbuyflowinitializationtokenrequest, Bundle bundle, zzqv zzqv)
        throws RemoteException;

    public abstract void zza(GetInstrumentsRequest getinstrumentsrequest, Bundle bundle, zzqv zzqv)
        throws RemoteException;

    public abstract void zza(String s, String s1, Bundle bundle, zzqv zzqv)
        throws RemoteException;

    public abstract void zzb(Bundle bundle, zzqv zzqv)
        throws RemoteException;

    public abstract void zzz(Bundle bundle)
        throws RemoteException;
}
