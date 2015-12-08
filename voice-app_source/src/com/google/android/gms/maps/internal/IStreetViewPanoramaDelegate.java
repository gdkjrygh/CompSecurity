// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.zze;
import com.google.android.gms.maps.model.zzi;
import com.google.android.gms.maps.model.zzk;
import com.google.android.gms.maps.model.zzl;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzr, zzs, zzt, zzu

public interface IStreetViewPanoramaDelegate
    extends IInterface
{
    public static abstract class zza extends Binder
        implements IStreetViewPanoramaDelegate
    {

        public static IStreetViewPanoramaDelegate zzcG(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (iinterface != null && (iinterface instanceof IStreetViewPanoramaDelegate))
            {
                return (IStreetViewPanoramaDelegate)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj2 = null;
            Object obj = null;
            Object obj1 = null;
            boolean flag12 = false;
            boolean flag13 = false;
            boolean flag14 = false;
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0)
                {
                    flag4 = true;
                }
                enableZoom(flag4);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag5 = flag12;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                enablePanning(flag5);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag6 = flag13;
                if (parcel.readInt() != 0)
                {
                    flag6 = true;
                }
                enableUserNavigation(flag6);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag7 = flag14;
                if (parcel.readInt() != 0)
                {
                    flag7 = true;
                }
                enableStreetNames(flag7);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag8 = isZoomGesturesEnabled();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag9 = isPanningGesturesEnabled();
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag9)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag10 = isUserNavigationEnabled();
                parcel1.writeNoException();
                i = ((flag2) ? 1 : 0);
                if (flag10)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag11 = isStreetNamesEnabled();
                parcel1.writeNoException();
                i = ((flag3) ? 1 : 0);
                if (flag11)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = StreetViewPanoramaCamera.CREATOR.zzeT(parcel);
                } else
                {
                    obj = null;
                }
                animateTo(((StreetViewPanoramaCamera) (obj)), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                parcel = getPanoramaCamera();
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

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                setPositionWithID(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR.zzeP(parcel);
                }
                setPosition(((LatLng) (obj)));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR.zzeP(parcel);
                }
                setPositionWithRadius(((LatLng) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                parcel = getStreetViewPanoramaLocation();
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

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                setOnStreetViewPanoramaChangeListener(zzs.zza.zzcA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                setOnStreetViewPanoramaCameraChangeListener(zzr.zza.zzcz(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                setOnStreetViewPanoramaClickListener(zzt.zza.zzcB(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                parcel = pointToOrientation(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()));
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

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                zzd zzd1;
                if (parcel.readInt() != 0)
                {
                    parcel = StreetViewPanoramaOrientation.CREATOR.zzeW(parcel);
                } else
                {
                    parcel = null;
                }
                zzd1 = orientationToPoint(parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (zzd1 != null)
                {
                    parcel = zzd1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                setOnStreetViewPanoramaLongClickListener(zzu.zza.zzcC(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements IStreetViewPanoramaDelegate
    {

        private IBinder zznF;

        public void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (streetviewpanoramacamera == null)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            parcel.writeInt(1);
            streetviewpanoramacamera.writeToParcel(parcel, 0);
_L1:
            parcel.writeLong(l);
            zznF.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramacamera;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramacamera;
        }

        public IBinder asBinder()
        {
            return zznF;
        }

        public void enablePanning(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        public void enableStreetNames(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        public void enableUserNavigation(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(3, parcel, parcel1, 0);
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

        public void enableZoom(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(1, parcel, parcel1, 0);
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

        public StreetViewPanoramaCamera getPanoramaCamera()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            zznF.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            StreetViewPanoramaCamera streetviewpanoramacamera = StreetViewPanoramaCamera.CREATOR.zzeT(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return streetviewpanoramacamera;
_L2:
            streetviewpanoramacamera = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public StreetViewPanoramaLocation getStreetViewPanoramaLocation()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            zznF.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            StreetViewPanoramaLocation streetviewpanoramalocation = StreetViewPanoramaLocation.CREATOR.zzeV(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return streetviewpanoramalocation;
_L2:
            streetviewpanoramalocation = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isPanningGesturesEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            zznF.transact(6, parcel, parcel1, 0);
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

        public boolean isStreetNamesEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            zznF.transact(8, parcel, parcel1, 0);
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

        public boolean isUserNavigationEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            zznF.transact(7, parcel, parcel1, 0);
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

        public boolean isZoomGesturesEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            zznF.transact(5, parcel, parcel1, 0);
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

        public zzd orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (streetviewpanoramaorientation == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            streetviewpanoramaorientation.writeToParcel(parcel, 0);
_L1:
            zznF.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            streetviewpanoramaorientation = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return streetviewpanoramaorientation;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramaorientation;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramaorientation;
        }

        public StreetViewPanoramaOrientation pointToOrientation(zzd zzd1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zznF.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = obj;
            if (parcel1.readInt() != 0)
            {
                zzd1 = StreetViewPanoramaOrientation.CREATOR.zzeW(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public void setOnStreetViewPanoramaCameraChangeListener(zzr zzr1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (zzr1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzr1 = zzr1.asBinder();
_L1:
            parcel.writeStrongBinder(zzr1);
            zznF.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzr1 = null;
              goto _L1
            zzr1;
            parcel1.recycle();
            parcel.recycle();
            throw zzr1;
        }

        public void setOnStreetViewPanoramaChangeListener(zzs zzs1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (zzs1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzs1 = zzs1.asBinder();
_L1:
            parcel.writeStrongBinder(zzs1);
            zznF.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzs1 = null;
              goto _L1
            zzs1;
            parcel1.recycle();
            parcel.recycle();
            throw zzs1;
        }

        public void setOnStreetViewPanoramaClickListener(zzt zzt1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (zzt1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzt1 = zzt1.asBinder();
_L1:
            parcel.writeStrongBinder(zzt1);
            zznF.transact(17, parcel, parcel1, 0);
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

        public void setOnStreetViewPanoramaLongClickListener(zzu zzu1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (zzu1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzu1 = zzu1.asBinder();
_L1:
            parcel.writeStrongBinder(zzu1);
            zznF.transact(20, parcel, parcel1, 0);
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

        public void setPosition(LatLng latlng)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            zznF.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
        }

        public void setPositionWithID(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            parcel.writeString(s);
            zznF.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void setPositionWithRadius(LatLng latlng, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            zznF.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
        throws RemoteException;

    public abstract void enablePanning(boolean flag)
        throws RemoteException;

    public abstract void enableStreetNames(boolean flag)
        throws RemoteException;

    public abstract void enableUserNavigation(boolean flag)
        throws RemoteException;

    public abstract void enableZoom(boolean flag)
        throws RemoteException;

    public abstract StreetViewPanoramaCamera getPanoramaCamera()
        throws RemoteException;

    public abstract StreetViewPanoramaLocation getStreetViewPanoramaLocation()
        throws RemoteException;

    public abstract boolean isPanningGesturesEnabled()
        throws RemoteException;

    public abstract boolean isStreetNamesEnabled()
        throws RemoteException;

    public abstract boolean isUserNavigationEnabled()
        throws RemoteException;

    public abstract boolean isZoomGesturesEnabled()
        throws RemoteException;

    public abstract zzd orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        throws RemoteException;

    public abstract StreetViewPanoramaOrientation pointToOrientation(zzd zzd)
        throws RemoteException;

    public abstract void setOnStreetViewPanoramaCameraChangeListener(zzr zzr)
        throws RemoteException;

    public abstract void setOnStreetViewPanoramaChangeListener(zzs zzs)
        throws RemoteException;

    public abstract void setOnStreetViewPanoramaClickListener(zzt zzt)
        throws RemoteException;

    public abstract void setOnStreetViewPanoramaLongClickListener(zzu zzu)
        throws RemoteException;

    public abstract void setPosition(LatLng latlng)
        throws RemoteException;

    public abstract void setPositionWithID(String s)
        throws RemoteException;

    public abstract void setPositionWithRadius(LatLng latlng, int i)
        throws RemoteException;
}
