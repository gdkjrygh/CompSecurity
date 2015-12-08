// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzf;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzeh

public interface zzeg
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzeg
    {

        public static zzeg zzF(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (iinterface != null && (iinterface instanceof zzeg))
            {
                return (zzeg)iinterface;
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
            Object obj2 = null;
            zzd zzd3 = null;
            AdSizeParcel adsizeparcel = null;
            boolean flag;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd3 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    adsizeparcel = AdSizeParcel.CREATOR.zzc(parcel);
                } else
                {
                    adsizeparcel = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj2 = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    obj2 = null;
                }
                zza(zzd3, adsizeparcel, ((AdRequestParcel) (obj2)), parcel.readString(), zzeh.zza.zzG(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj2 = getView();
                parcel1.writeNoException();
                parcel = adsizeparcel;
                if (obj2 != null)
                {
                    parcel = ((zzd) (obj2)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd3 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder());
                Object obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                }
                zza(zzd3, ((AdRequestParcel) (obj)), parcel.readString(), zzeh.zza.zzG(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                showInterstitial();
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                destroy();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd3 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder());
                AdSizeParcel adsizeparcel1;
                AdRequestParcel adrequestparcel2;
                if (parcel.readInt() != 0)
                {
                    adsizeparcel1 = AdSizeParcel.CREATOR.zzc(parcel);
                } else
                {
                    adsizeparcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    adrequestparcel2 = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    adrequestparcel2 = null;
                }
                zza(zzd3, adsizeparcel1, adrequestparcel2, parcel.readString(), parcel.readString(), zzeh.zza.zzG(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder());
                AdRequestParcel adrequestparcel;
                if (parcel.readInt() != 0)
                {
                    adrequestparcel = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    adrequestparcel = null;
                }
                zza(zzd1, adrequestparcel, parcel.readString(), parcel.readString(), zzeh.zza.zzG(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                pause();
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                resume();
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd zzd2 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder());
                AdRequestParcel adrequestparcel1;
                if (parcel.readInt() != 0)
                {
                    adrequestparcel1 = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    adrequestparcel1 = null;
                }
                zza(zzd2, adrequestparcel1, parcel.readString(), com.google.android.gms.ads.internal.reward.mediation.client.zza.zza.zzab(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                Object obj1 = zzd3;
                if (parcel.readInt() != 0)
                {
                    obj1 = AdRequestParcel.CREATOR.zzb(parcel);
                }
                zza(((AdRequestParcel) (obj1)), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                showVideo();
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                flag = isInitialized();
                parcel1.writeNoException();
                break;
            }
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
    }

    private static class zza.zza
        implements zzeg
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
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

        public zzd getView()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isInitialized()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zznF.transact(13, parcel, parcel1, 0);
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
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zznF.transact(8, parcel, parcel1, 0);
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
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

        public void showInterstitial()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

        public void showVideo()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

        public void zza(AdRequestParcel adrequestparcel, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L1:
            parcel.writeString(s);
            zznF.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            adrequestparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adrequestparcel;
        }

        public void zza(zzd zzd1, AdRequestParcel adrequestparcel, String s, com.google.android.gms.ads.internal.reward.mediation.client.zza zza1, String s1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            zzd1 = obj;
            if (zza1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            zzd1 = zza1.asBinder();
            parcel.writeStrongBinder(zzd1);
            parcel.writeString(s1);
            zznF.transact(10, parcel, parcel1, 0);
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
              goto _L5
        }

        public void zza(zzd zzd1, AdRequestParcel adrequestparcel, String s, zzeh zzeh1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            zzd1 = obj;
            if (zzeh1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            zzd1 = zzeh1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznF.transact(3, parcel, parcel1, 0);
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
              goto _L5
        }

        public void zza(zzd zzd1, AdRequestParcel adrequestparcel, String s, String s1, zzeh zzeh1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            zzd1 = obj;
            if (zzeh1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            zzd1 = zzeh1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznF.transact(7, parcel, parcel1, 0);
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
              goto _L5
        }

        public void zza(zzd zzd1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, zzeh zzeh1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            zzd1 = obj;
            if (zzeh1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            zzd1 = zzeh1.asBinder();
            parcel.writeStrongBinder(zzd1);
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

        public void zza(zzd zzd1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, zzeh zzeh1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            parcel.writeString(s1);
            zzd1 = obj;
            if (zzeh1 == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            zzd1 = zzeh1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznF.transact(6, parcel, parcel1, 0);
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

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void destroy()
        throws RemoteException;

    public abstract zzd getView()
        throws RemoteException;

    public abstract boolean isInitialized()
        throws RemoteException;

    public abstract void pause()
        throws RemoteException;

    public abstract void resume()
        throws RemoteException;

    public abstract void showInterstitial()
        throws RemoteException;

    public abstract void showVideo()
        throws RemoteException;

    public abstract void zza(AdRequestParcel adrequestparcel, String s)
        throws RemoteException;

    public abstract void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, com.google.android.gms.ads.internal.reward.mediation.client.zza zza1, String s1)
        throws RemoteException;

    public abstract void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, zzeh zzeh)
        throws RemoteException;

    public abstract void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, String s1, zzeh zzeh)
        throws RemoteException;

    public abstract void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, zzeh zzeh)
        throws RemoteException;

    public abstract void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, zzeh zzeh)
        throws RemoteException;
}
