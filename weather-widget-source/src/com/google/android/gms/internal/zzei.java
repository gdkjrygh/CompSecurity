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
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzi;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.dynamic.zzd;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzej, zzek, zzel

public interface zzei
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzei
    {

        public static zzei zzF(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (iinterface != null && (iinterface instanceof zzei))
            {
                return (zzei)iinterface;
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
            Object obj1 = null;
            Object obj2 = null;
            zzd zzd3 = null;
            String s = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd3 = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdSizeParcel.CREATOR.zzc(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    obj1 = null;
                }
                zza(zzd3, ((AdSizeParcel) (obj)), ((AdRequestParcel) (obj1)), parcel.readString(), com.google.android.gms.internal.zzej.zza.zzG(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj1 = getView();
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (obj1 != null)
                {
                    parcel = ((zzd) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd3 = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder());
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                }
                zza(zzd3, ((AdRequestParcel) (obj)), parcel.readString(), com.google.android.gms.internal.zzej.zza.zzG(parcel.readStrongBinder()));
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
                zzd3 = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder());
                AdRequestParcel adrequestparcel;
                if (parcel.readInt() != 0)
                {
                    obj = AdSizeParcel.CREATOR.zzc(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    adrequestparcel = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    adrequestparcel = null;
                }
                zza(zzd3, ((AdSizeParcel) (obj)), adrequestparcel, parcel.readString(), parcel.readString(), com.google.android.gms.internal.zzej.zza.zzG(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    obj = null;
                }
                zza(zzd1, ((AdRequestParcel) (obj)), parcel.readString(), parcel.readString(), com.google.android.gms.internal.zzej.zza.zzG(parcel.readStrongBinder()));
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
                zzd zzd2 = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    obj = null;
                }
                zza(zzd2, ((AdRequestParcel) (obj)), parcel.readString(), com.google.android.gms.ads.internal.reward.mediation.client.zza.zza.zzad(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                }
                zza(((AdRequestParcel) (obj)), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                showVideo();
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                boolean flag = isInitialized();
                parcel1.writeNoException();
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd3 = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder());
                NativeAdOptionsParcel nativeadoptionsparcel;
                String s1;
                zzej zzej;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    obj = null;
                }
                s = parcel.readString();
                s1 = parcel.readString();
                zzej = com.google.android.gms.internal.zzej.zza.zzG(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    nativeadoptionsparcel = NativeAdOptionsParcel.CREATOR.zzf(parcel);
                } else
                {
                    nativeadoptionsparcel = null;
                }
                zza(zzd3, ((AdRequestParcel) (obj)), s, s1, zzej, nativeadoptionsparcel, parcel.createStringArrayList());
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj = zzdS();
                parcel1.writeNoException();
                parcel = zzd3;
                if (obj != null)
                {
                    parcel = ((zzek) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj = zzdT();
                parcel1.writeNoException();
                parcel = s;
                break;
            }
            if (obj != null)
            {
                parcel = ((zzel) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
    }

    private static class zza.zza
        implements zzei
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void destroy()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zznI.transact(5, parcel, parcel1, 0);
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
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
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
            zznI.transact(13, parcel, parcel1, 0);
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
            zznI.transact(8, parcel, parcel1, 0);
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
            zznI.transact(9, parcel, parcel1, 0);
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
            zznI.transact(4, parcel, parcel1, 0);
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
            zznI.transact(12, parcel, parcel1, 0);
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
            zznI.transact(11, parcel, parcel1, 0);
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
            zznI.transact(10, parcel, parcel1, 0);
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

        public void zza(zzd zzd1, AdRequestParcel adrequestparcel, String s, zzej zzej1)
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
            if (zzej1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            zzd1 = zzej1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznI.transact(3, parcel, parcel1, 0);
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

        public void zza(zzd zzd1, AdRequestParcel adrequestparcel, String s, String s1, zzej zzej1)
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
            if (zzej1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            zzd1 = zzej1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznI.transact(7, parcel, parcel1, 0);
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

        public void zza(zzd zzd1, AdRequestParcel adrequestparcel, String s, String s1, zzej zzej1, NativeAdOptionsParcel nativeadoptionsparcel, List list)
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
            if (zzej1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            zzd1 = zzej1.asBinder();
            parcel.writeStrongBinder(zzd1);
            if (nativeadoptionsparcel == null)
            {
                break MISSING_BLOCK_LABEL_175;
            }
            parcel.writeInt(1);
            nativeadoptionsparcel.writeToParcel(parcel, 0);
_L7:
            parcel.writeStringList(list);
            zznI.transact(14, parcel, parcel1, 0);
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

        public void zza(zzd zzd1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, zzej zzej1)
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
            if (zzej1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            zzd1 = zzej1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznI.transact(1, parcel, parcel1, 0);
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

        public void zza(zzd zzd1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, zzej zzej1)
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
            if (zzej1 == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            zzd1 = zzej1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznI.transact(6, parcel, parcel1, 0);
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

        public zzek zzdS()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzek zzek;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zznI.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            zzek = com.google.android.gms.internal.zzek.zza.zzH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzek;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzel zzdT()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzel zzel;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zznI.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            zzel = com.google.android.gms.internal.zzel.zza.zzI(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzel;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
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

    public abstract void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, zzej zzej)
        throws RemoteException;

    public abstract void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, String s1, zzej zzej)
        throws RemoteException;

    public abstract void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, String s1, zzej zzej, NativeAdOptionsParcel nativeadoptionsparcel, List list)
        throws RemoteException;

    public abstract void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, zzej zzej)
        throws RemoteException;

    public abstract void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, zzej zzej)
        throws RemoteException;

    public abstract zzek zzdS()
        throws RemoteException;

    public abstract zzel zzdT()
        throws RemoteException;
}
