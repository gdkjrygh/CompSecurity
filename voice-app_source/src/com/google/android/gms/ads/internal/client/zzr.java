// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfj;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel, zzm, zzn, zzt, 
//            zzu, AdRequestParcel, zzf, zzh

public interface zzr
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzr
    {

        public static zzr zzk(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iinterface != null && (iinterface instanceof zzr))
            {
                return (zzr)iinterface;
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
            zzd zzd1 = null;
            Object obj2 = null;
            Object obj = null;
            boolean flag = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zzd1 = zzaM();
                parcel1.writeNoException();
                parcel = obj;
                if (zzd1 != null)
                {
                    parcel = zzd1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                destroy();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                boolean flag1 = isReady();
                parcel1.writeNoException();
                if (flag1)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                Object obj1 = zzd1;
                if (parcel.readInt() != 0)
                {
                    obj1 = AdRequestParcel.CREATOR.zzb(parcel);
                }
                boolean flag2 = zza(((AdRequestParcel) (obj1)));
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag2)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                pause();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                resume();
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzn.zza.zzg(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzt.zza.zzm(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                showInterstitial();
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                stopLoading();
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zzaP();
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                parcel = zzaN();
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

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                AdSizeParcel adsizeparcel = obj2;
                if (parcel.readInt() != 0)
                {
                    adsizeparcel = AdSizeParcel.CREATOR.zzc(parcel);
                }
                zza(adsizeparcel);
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(com.google.android.gms.internal.zzff.zza.zzM(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(com.google.android.gms.internal.zzfj.zza.zzQ(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                parcel = getMediationAdapterClassName();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(com.google.android.gms.internal.zzci.zza.zzs(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzm.zza.zzf(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzu.zza.zzn(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
        }
    }

    private static class zza.zza
        implements zzr
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void destroy()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zznF.transact(2, parcel, parcel1, 0);
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

        public String getMediationAdapterClassName()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zznF.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isReady()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void pause()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

        public void resume()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

        public void showInterstitial()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zznF.transact(9, parcel, parcel1, 0);
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

        public void stopLoading()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zznF.transact(10, parcel, parcel1, 0);
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

        public void zza(AdSizeParcel adsizeparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (adsizeparcel == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L1:
            zznF.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            adsizeparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adsizeparcel;
        }

        public void zza(zzm zzm1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzm1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzm1 = zzm1.asBinder();
_L1:
            parcel.writeStrongBinder(zzm1);
            zznF.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzm1 = null;
              goto _L1
            zzm1;
            parcel1.recycle();
            parcel.recycle();
            throw zzm1;
        }

        public void zza(zzn zzn1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzn1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzn1 = zzn1.asBinder();
_L1:
            parcel.writeStrongBinder(zzn1);
            zznF.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzn1 = null;
              goto _L1
            zzn1;
            parcel1.recycle();
            parcel.recycle();
            throw zzn1;
        }

        public void zza(zzt zzt1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzt1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzt1 = zzt1.asBinder();
_L1:
            parcel.writeStrongBinder(zzt1);
            zznF.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzt1 = null;
              goto _L1
            zzt1;
            parcel1.recycle();
            parcel.recycle();
            throw zzt1;
        }

        public void zza(zzu zzu1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzu1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzu1 = zzu1.asBinder();
_L1:
            parcel.writeStrongBinder(zzu1);
            zznF.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzu1 = null;
              goto _L1
            zzu1;
            parcel1.recycle();
            parcel.recycle();
            throw zzu1;
        }

        public void zza(zzci zzci1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzci1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzci1 = zzci1.asBinder();
_L1:
            parcel.writeStrongBinder(zzci1);
            zznF.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzci1 = null;
              goto _L1
            zzci1;
            parcel1.recycle();
            parcel.recycle();
            throw zzci1;
        }

        public void zza(zzff zzff1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzff1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzff1 = zzff1.asBinder();
_L1:
            parcel.writeStrongBinder(zzff1);
            zznF.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzff1 = null;
              goto _L1
            zzff1;
            parcel1.recycle();
            parcel.recycle();
            throw zzff1;
        }

        public void zza(zzfj zzfj1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzfj1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzfj1 = zzfj1.asBinder();
_L1:
            parcel.writeStrongBinder(zzfj1);
            parcel.writeString(s);
            zznF.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzfj1 = null;
              goto _L1
            zzfj1;
            parcel1.recycle();
            parcel.recycle();
            throw zzfj1;
        }

        public boolean zza(AdRequestParcel adrequestparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L1:
            int i;
            zznF.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            parcel.writeInt(0);
              goto _L1
            adrequestparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adrequestparcel;
        }

        public zzd zzaM()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public AdSizeParcel zzaN()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zznF.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            AdSizeParcel adsizeparcel = AdSizeParcel.CREATOR.zzc(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return adsizeparcel;
_L2:
            adsizeparcel = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zzaP()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zznF.transact(11, parcel, parcel1, 0);
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


    public abstract void destroy()
        throws RemoteException;

    public abstract String getMediationAdapterClassName()
        throws RemoteException;

    public abstract boolean isReady()
        throws RemoteException;

    public abstract void pause()
        throws RemoteException;

    public abstract void resume()
        throws RemoteException;

    public abstract void showInterstitial()
        throws RemoteException;

    public abstract void stopLoading()
        throws RemoteException;

    public abstract void zza(AdSizeParcel adsizeparcel)
        throws RemoteException;

    public abstract void zza(zzm zzm)
        throws RemoteException;

    public abstract void zza(zzn zzn)
        throws RemoteException;

    public abstract void zza(zzt zzt)
        throws RemoteException;

    public abstract void zza(zzu zzu)
        throws RemoteException;

    public abstract void zza(zzci zzci)
        throws RemoteException;

    public abstract void zza(zzff zzff)
        throws RemoteException;

    public abstract void zza(zzfj zzfj, String s)
        throws RemoteException;

    public abstract boolean zza(AdRequestParcel adrequestparcel)
        throws RemoteException;

    public abstract zzd zzaM()
        throws RemoteException;

    public abstract AdSizeParcel zzaN()
        throws RemoteException;

    public abstract void zzaP()
        throws RemoteException;
}
