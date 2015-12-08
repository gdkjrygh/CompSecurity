// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.CameraUpdateParcelable;
import com.google.android.gms.maps.model.internal.GroundOverlayOptionsParcelable;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.MarkerOptionsParcelable;
import com.google.android.gms.maps.model.internal.zze;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.internal.zzj;
import com.google.android.gms.maps.model.internal.zzk;
import com.google.android.gms.maps.model.internal.zzm;
import com.google.android.gms.maps.model.zzb;
import com.google.android.gms.maps.model.zzc;
import com.google.android.gms.maps.model.zzh;
import com.google.android.gms.maps.model.zzn;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzb, zzm, IProjectionDelegate, IUiSettingsDelegate, 
//            zzd, zze, ILocationSourceDelegate, zzf, 
//            zzg, zzh, zzj, zzk, 
//            zzl, zzn, zzo, zzp, 
//            zzq, zzw

public interface IGoogleMapDelegate
    extends IInterface
{
    public static abstract class zza extends Binder
        implements IGoogleMapDelegate
    {

        public static IGoogleMapDelegate zzch(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (iinterface != null && (iinterface instanceof IGoogleMapDelegate))
            {
                return (IGoogleMapDelegate)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag13 = false;
            boolean flag3 = false;
            boolean flag14 = false;
            boolean flag4 = false;
            boolean flag5 = false;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj6 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            IPolylineDelegate ipolylinedelegate = null;
            Object obj1 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                parcel = getCameraPosition();
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

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                float f = getMaxZoomLevel();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                float f1 = getMinZoomLevel();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                moveCamera(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                animateCamera(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                animateCameraWithCallback(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()), zzb.zza.zzcf(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()), parcel.readInt(), zzb.zza.zzcf(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                stopAnimation();
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = PolylineOptions.CREATOR.zzeS(parcel);
                } else
                {
                    parcel = null;
                }
                ipolylinedelegate = addPolyline(parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (ipolylinedelegate != null)
                {
                    parcel = ipolylinedelegate.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = PolygonOptions.CREATOR.zzeR(parcel);
                } else
                {
                    parcel = null;
                }
                obj = addPolygon(parcel);
                parcel1.writeNoException();
                parcel = obj2;
                if (obj != null)
                {
                    parcel = ((zzj) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = MarkerOptions.CREATOR.zzeQ(parcel);
                } else
                {
                    parcel = null;
                }
                obj = addMarker(parcel);
                parcel1.writeNoException();
                parcel = obj3;
                if (obj != null)
                {
                    parcel = ((zzi) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = GroundOverlayOptions.CREATOR.zzeN(parcel);
                } else
                {
                    parcel = null;
                }
                obj = addGroundOverlay(parcel);
                parcel1.writeNoException();
                parcel = obj4;
                if (obj != null)
                {
                    parcel = ((zzf) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = TileOverlayOptions.CREATOR.zzeY(parcel);
                } else
                {
                    parcel = null;
                }
                obj = addTileOverlay(parcel);
                parcel1.writeNoException();
                parcel = obj5;
                if (obj != null)
                {
                    parcel = ((zzk) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                clear();
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                i = getMapType();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setMapType(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                flag5 = isTrafficEnabled();
                parcel1.writeNoException();
                if (flag5)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                setTrafficEnabled(flag5);
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean flag6 = isIndoorEnabled();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag6)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean flag7;
                if (parcel.readInt() != 0)
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
                flag7 = setIndoorEnabled(flag7);
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag7)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean flag8 = isMyLocationEnabled();
                parcel1.writeNoException();
                i = ((flag2) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean flag9 = flag13;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                setMyLocationEnabled(flag9);
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                parcel = getMyLocation();
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

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setLocationSource(ILocationSourceDelegate.zza.zzck(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                obj = getUiSettings();
                parcel1.writeNoException();
                parcel = obj7;
                if (obj != null)
                {
                    parcel = ((IUiSettingsDelegate) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                obj = getProjection();
                parcel1.writeNoException();
                parcel = obj8;
                if (obj != null)
                {
                    parcel = ((IProjectionDelegate) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnCameraChangeListener(zzf.zza.zzcn(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMapClickListener(zzj.zza.zzcr(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMapLongClickListener(zzl.zza.zzct(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMarkerClickListener(zzn.zza.zzcv(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMarkerDragListener(zzo.zza.zzcw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnInfoWindowClickListener(zzh.zza.zzcp(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setInfoWindowAdapter(zzd.zza.zzci(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = CircleOptions.CREATOR.zzeM(parcel);
                } else
                {
                    parcel = null;
                }
                obj = addCircle(parcel);
                parcel1.writeNoException();
                parcel = obj6;
                if (obj != null)
                {
                    parcel = ((zze) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 36: // '$'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMyLocationChangeListener(zzq.zza.zzcy(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMyLocationButtonClickListener(zzp.zza.zzcx(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                snapshot(zzw.zza.zzcF(parcel.readStrongBinder()), com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 39: // '\''
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setPadding(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean flag10 = isBuildingsEnabled();
                parcel1.writeNoException();
                i = ((flag3) ? 1 : 0);
                if (flag10)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean flag11 = flag14;
                if (parcel.readInt() != 0)
                {
                    flag11 = true;
                }
                setBuildingsEnabled(flag11);
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMapLoadedCallback(zzk.zza.zzcs(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 44: // ','
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                obj = getFocusedBuilding();
                parcel1.writeNoException();
                parcel = obj9;
                if (obj != null)
                {
                    parcel = ((zzg) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 45: // '-'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnIndoorStateChangeListener(zzg.zza.zzco(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 53: // '5'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                getMapAsync(zzm.zza.zzcu(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 54: // '6'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

            case 55: // '7'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                onResume();
                parcel1.writeNoException();
                return true;

            case 56: // '8'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                onPause();
                parcel1.writeNoException();
                return true;

            case 57: // '9'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                onDestroy();
                parcel1.writeNoException();
                return true;

            case 58: // ':'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                onLowMemory();
                parcel1.writeNoException();
                return true;

            case 59: // ';'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean flag12 = useViewLifecycleWhenInFragment();
                parcel1.writeNoException();
                i = ((flag4) ? 1 : 0);
                if (flag12)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 60: // '<'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

            case 61: // '='
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setContentDescription(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 64: // '@'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = CameraUpdateParcelable.CREATOR.zzfb(parcel);
                }
                moveCamera2(((CameraUpdateParcelable) (obj)));
                parcel1.writeNoException();
                return true;

            case 65: // 'A'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                obj = obj11;
                if (parcel.readInt() != 0)
                {
                    obj = CameraUpdateParcelable.CREATOR.zzfb(parcel);
                }
                animateCamera2(((CameraUpdateParcelable) (obj)));
                parcel1.writeNoException();
                return true;

            case 66: // 'B'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                obj = obj12;
                if (parcel.readInt() != 0)
                {
                    obj = CameraUpdateParcelable.CREATOR.zzfb(parcel);
                }
                animateCameraWithCallback2(((CameraUpdateParcelable) (obj)), zzb.zza.zzcf(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 67: // 'C'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                obj = obj13;
                if (parcel.readInt() != 0)
                {
                    obj = CameraUpdateParcelable.CREATOR.zzfb(parcel);
                }
                animateCameraWithDurationAndCallback2(((CameraUpdateParcelable) (obj)), parcel.readInt(), zzb.zza.zzcf(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 68: // 'D'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = MarkerOptions.CREATOR.zzeQ(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = MarkerOptionsParcelable.CREATOR.zzfd(parcel);
                } else
                {
                    parcel = null;
                }
                obj = addMarker2(((MarkerOptions) (obj)), parcel);
                parcel1.writeNoException();
                parcel = ipolylinedelegate;
                if (obj != null)
                {
                    parcel = ((zzi) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 69: // 'E'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setInfoWindowRenderer(zze.zza.zzcj(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 70: // 'F'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = GroundOverlayOptions.CREATOR.zzeN(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = GroundOverlayOptionsParcelable.CREATOR.zzfc(parcel);
            } else
            {
                parcel = null;
            }
            obj = addGroundOverlay2(((GroundOverlayOptions) (obj)), parcel);
            parcel1.writeNoException();
            parcel = obj1;
            if (obj != null)
            {
                parcel = ((zzf) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements IGoogleMapDelegate
    {

        private IBinder zznF;

        public zze addCircle(CircleOptions circleoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (circleoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            circleoptions.writeToParcel(parcel, 0);
_L1:
            zznF.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            circleoptions = com.google.android.gms.maps.model.internal.zze.zza.zzcL(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return circleoptions;
            parcel.writeInt(0);
              goto _L1
            circleoptions;
            parcel1.recycle();
            parcel.recycle();
            throw circleoptions;
        }

        public zzf addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (groundoverlayoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            groundoverlayoptions.writeToParcel(parcel, 0);
_L1:
            zznF.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            groundoverlayoptions = com.google.android.gms.maps.model.internal.zzf.zza.zzcM(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return groundoverlayoptions;
            parcel.writeInt(0);
              goto _L1
            groundoverlayoptions;
            parcel1.recycle();
            parcel.recycle();
            throw groundoverlayoptions;
        }

        public zzf addGroundOverlay2(GroundOverlayOptions groundoverlayoptions, GroundOverlayOptionsParcelable groundoverlayoptionsparcelable)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (groundoverlayoptions == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            groundoverlayoptions.writeToParcel(parcel, 0);
_L3:
            if (groundoverlayoptionsparcelable == null)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            parcel.writeInt(1);
            groundoverlayoptionsparcelable.writeToParcel(parcel, 0);
_L4:
            zznF.transact(70, parcel, parcel1, 0);
            parcel1.readException();
            groundoverlayoptions = com.google.android.gms.maps.model.internal.zzf.zza.zzcM(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return groundoverlayoptions;
_L2:
            parcel.writeInt(0);
              goto _L3
            groundoverlayoptions;
            parcel1.recycle();
            parcel.recycle();
            throw groundoverlayoptions;
            parcel.writeInt(0);
              goto _L4
        }

        public zzi addMarker(MarkerOptions markeroptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (markeroptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            markeroptions.writeToParcel(parcel, 0);
_L1:
            zznF.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            markeroptions = com.google.android.gms.maps.model.internal.zzi.zza.zzcP(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return markeroptions;
            parcel.writeInt(0);
              goto _L1
            markeroptions;
            parcel1.recycle();
            parcel.recycle();
            throw markeroptions;
        }

        public zzi addMarker2(MarkerOptions markeroptions, MarkerOptionsParcelable markeroptionsparcelable)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (markeroptions == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            markeroptions.writeToParcel(parcel, 0);
_L3:
            if (markeroptionsparcelable == null)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            parcel.writeInt(1);
            markeroptionsparcelable.writeToParcel(parcel, 0);
_L4:
            zznF.transact(68, parcel, parcel1, 0);
            parcel1.readException();
            markeroptions = com.google.android.gms.maps.model.internal.zzi.zza.zzcP(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return markeroptions;
_L2:
            parcel.writeInt(0);
              goto _L3
            markeroptions;
            parcel1.recycle();
            parcel.recycle();
            throw markeroptions;
            parcel.writeInt(0);
              goto _L4
        }

        public zzj addPolygon(PolygonOptions polygonoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (polygonoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            polygonoptions.writeToParcel(parcel, 0);
_L1:
            zznF.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            polygonoptions = com.google.android.gms.maps.model.internal.zzj.zza.zzcQ(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return polygonoptions;
            parcel.writeInt(0);
              goto _L1
            polygonoptions;
            parcel1.recycle();
            parcel.recycle();
            throw polygonoptions;
        }

        public IPolylineDelegate addPolyline(PolylineOptions polylineoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (polylineoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            polylineoptions.writeToParcel(parcel, 0);
_L1:
            zznF.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            polylineoptions = com.google.android.gms.maps.model.internal.IPolylineDelegate.zza.zzcR(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return polylineoptions;
            parcel.writeInt(0);
              goto _L1
            polylineoptions;
            parcel1.recycle();
            parcel.recycle();
            throw polylineoptions;
        }

        public zzk addTileOverlay(TileOverlayOptions tileoverlayoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (tileoverlayoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            tileoverlayoptions.writeToParcel(parcel, 0);
_L1:
            zznF.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            tileoverlayoptions = com.google.android.gms.maps.model.internal.zzk.zza.zzcS(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return tileoverlayoptions;
            parcel.writeInt(0);
              goto _L1
            tileoverlayoptions;
            parcel1.recycle();
            parcel.recycle();
            throw tileoverlayoptions;
        }

        public void animateCamera(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zznF.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public void animateCamera2(CameraUpdateParcelable cameraupdateparcelable)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (cameraupdateparcelable == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            cameraupdateparcelable.writeToParcel(parcel, 0);
_L1:
            zznF.transact(65, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            cameraupdateparcelable;
            parcel1.recycle();
            parcel.recycle();
            throw cameraupdateparcelable;
        }

        public void animateCameraWithCallback(zzd zzd1, com.google.android.gms.maps.internal.zzb zzb1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zzd1 = obj;
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            zzd1 = zzb1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznF.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public void animateCameraWithCallback2(CameraUpdateParcelable cameraupdateparcelable, com.google.android.gms.maps.internal.zzb zzb1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (cameraupdateparcelable == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            cameraupdateparcelable.writeToParcel(parcel, 0);
_L3:
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            cameraupdateparcelable = zzb1.asBinder();
_L4:
            parcel.writeStrongBinder(cameraupdateparcelable);
            zznF.transact(66, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            cameraupdateparcelable;
            parcel1.recycle();
            parcel.recycle();
            throw cameraupdateparcelable;
            cameraupdateparcelable = null;
              goto _L4
        }

        public void animateCameraWithDurationAndCallback(zzd zzd1, int i, com.google.android.gms.maps.internal.zzb zzb1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            zzd1 = obj;
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzd1 = zzb1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zznF.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public void animateCameraWithDurationAndCallback2(CameraUpdateParcelable cameraupdateparcelable, int i, com.google.android.gms.maps.internal.zzb zzb1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (cameraupdateparcelable == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            cameraupdateparcelable.writeToParcel(parcel, 0);
_L3:
            parcel.writeInt(i);
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            cameraupdateparcelable = zzb1.asBinder();
_L4:
            parcel.writeStrongBinder(cameraupdateparcelable);
            zznF.transact(67, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            cameraupdateparcelable;
            parcel1.recycle();
            parcel.recycle();
            throw cameraupdateparcelable;
            cameraupdateparcelable = null;
              goto _L4
        }

        public IBinder asBinder()
        {
            return zznF;
        }

        public void clear()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(14, parcel, parcel1, 0);
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

        public CameraPosition getCameraPosition()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            CameraPosition cameraposition = CameraPosition.CREATOR.zzeL(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return cameraposition;
_L2:
            cameraposition = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzg getFocusedBuilding()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzg zzg1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(44, parcel, parcel1, 0);
            parcel1.readException();
            zzg1 = com.google.android.gms.maps.model.internal.zzg.zza.zzcN(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzg1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void getMapAsync(com.google.android.gms.maps.internal.zzm zzm1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzm1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzm1 = zzm1.asBinder();
_L1:
            parcel.writeStrongBinder(zzm1);
            zznF.transact(53, parcel, parcel1, 0);
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

        public int getMapType()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(15, parcel, parcel1, 0);
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

        public float getMaxZoomLevel()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            f = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public float getMinZoomLevel()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            f = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Location getMyLocation()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Location location = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return location;
_L2:
            location = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public IProjectionDelegate getProjection()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            IProjectionDelegate iprojectiondelegate;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            iprojectiondelegate = IProjectionDelegate.zza.zzcE(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return iprojectiondelegate;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public IUiSettingsDelegate getUiSettings()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            IUiSettingsDelegate iuisettingsdelegate;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            iuisettingsdelegate = IUiSettingsDelegate.zza.zzcJ(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return iuisettingsdelegate;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isBuildingsEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(40, parcel, parcel1, 0);
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

        public boolean isIndoorEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(19, parcel, parcel1, 0);
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

        public boolean isMyLocationEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(21, parcel, parcel1, 0);
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

        public boolean isTrafficEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(17, parcel, parcel1, 0);
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

        public void moveCamera(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zznF.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public void moveCamera2(CameraUpdateParcelable cameraupdateparcelable)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (cameraupdateparcelable == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            cameraupdateparcelable.writeToParcel(parcel, 0);
_L1:
            zznF.transact(64, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            cameraupdateparcelable;
            parcel1.recycle();
            parcel.recycle();
            throw cameraupdateparcelable;
        }

        public void onCreate(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(54, parcel, parcel1, 0);
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

        public void onDestroy()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(57, parcel, parcel1, 0);
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

        public void onLowMemory()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(58, parcel, parcel1, 0);
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

        public void onPause()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(56, parcel, parcel1, 0);
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
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(55, parcel, parcel1, 0);
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
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(60, parcel, parcel1, 0);
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

        public void setBuildingsEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(41, parcel, parcel1, 0);
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

        public void setContentDescription(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel.writeString(s);
            zznF.transact(61, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean setIndoorEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
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

        public void setInfoWindowAdapter(com.google.android.gms.maps.internal.zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zznF.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public void setInfoWindowRenderer(com.google.android.gms.maps.internal.zze zze1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zze1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zze1 = zze1.asBinder();
_L1:
            parcel.writeStrongBinder(zze1);
            zznF.transact(69, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zze1 = null;
              goto _L1
            zze1;
            parcel1.recycle();
            parcel.recycle();
            throw zze1;
        }

        public void setLocationSource(ILocationSourceDelegate ilocationsourcedelegate)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (ilocationsourcedelegate == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ilocationsourcedelegate = ilocationsourcedelegate.asBinder();
_L1:
            parcel.writeStrongBinder(ilocationsourcedelegate);
            zznF.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ilocationsourcedelegate = null;
              goto _L1
            ilocationsourcedelegate;
            parcel1.recycle();
            parcel.recycle();
            throw ilocationsourcedelegate;
        }

        public void setMapType(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel.writeInt(i);
            zznF.transact(16, parcel, parcel1, 0);
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

        public void setMyLocationEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(22, parcel, parcel1, 0);
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

        public void setOnCameraChangeListener(com.google.android.gms.maps.internal.zzf zzf1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzf1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzf1 = zzf1.asBinder();
_L1:
            parcel.writeStrongBinder(zzf1);
            zznF.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzf1 = null;
              goto _L1
            zzf1;
            parcel1.recycle();
            parcel.recycle();
            throw zzf1;
        }

        public void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzg zzg1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzg1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzg1 = zzg1.asBinder();
_L1:
            parcel.writeStrongBinder(zzg1);
            zznF.transact(45, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzg1 = null;
              goto _L1
            zzg1;
            parcel1.recycle();
            parcel.recycle();
            throw zzg1;
        }

        public void setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzh zzh1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzh1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzh1 = zzh1.asBinder();
_L1:
            parcel.writeStrongBinder(zzh1);
            zznF.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzh1 = null;
              goto _L1
            zzh1;
            parcel1.recycle();
            parcel.recycle();
            throw zzh1;
        }

        public void setOnMapClickListener(com.google.android.gms.maps.internal.zzj zzj1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzj1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzj1 = zzj1.asBinder();
_L1:
            parcel.writeStrongBinder(zzj1);
            zznF.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzj1 = null;
              goto _L1
            zzj1;
            parcel1.recycle();
            parcel.recycle();
            throw zzj1;
        }

        public void setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzk zzk1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzk1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzk1 = zzk1.asBinder();
_L1:
            parcel.writeStrongBinder(zzk1);
            zznF.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzk1 = null;
              goto _L1
            zzk1;
            parcel1.recycle();
            parcel.recycle();
            throw zzk1;
        }

        public void setOnMapLongClickListener(zzl zzl1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzl1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzl1 = zzl1.asBinder();
_L1:
            parcel.writeStrongBinder(zzl1);
            zznF.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzl1 = null;
              goto _L1
            zzl1;
            parcel1.recycle();
            parcel.recycle();
            throw zzl1;
        }

        public void setOnMarkerClickListener(com.google.android.gms.maps.internal.zzn zzn1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzn1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzn1 = zzn1.asBinder();
_L1:
            parcel.writeStrongBinder(zzn1);
            zznF.transact(30, parcel, parcel1, 0);
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

        public void setOnMarkerDragListener(zzo zzo1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzo1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzo1 = zzo1.asBinder();
_L1:
            parcel.writeStrongBinder(zzo1);
            zznF.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzo1 = null;
              goto _L1
            zzo1;
            parcel1.recycle();
            parcel.recycle();
            throw zzo1;
        }

        public void setOnMyLocationButtonClickListener(zzp zzp1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzp1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzp1 = zzp1.asBinder();
_L1:
            parcel.writeStrongBinder(zzp1);
            zznF.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzp1 = null;
              goto _L1
            zzp1;
            parcel1.recycle();
            parcel.recycle();
            throw zzp1;
        }

        public void setOnMyLocationChangeListener(zzq zzq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzq1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzq1 = zzq1.asBinder();
_L1:
            parcel.writeStrongBinder(zzq1);
            zznF.transact(36, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzq1 = null;
              goto _L1
            zzq1;
            parcel1.recycle();
            parcel.recycle();
            throw zzq1;
        }

        public void setPadding(int i, int j, int k, int l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            parcel.writeInt(l);
            zznF.transact(39, parcel, parcel1, 0);
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

        public void setTrafficEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(18, parcel, parcel1, 0);
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

        public void snapshot(zzw zzw1, zzd zzd1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzw1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            zzw1 = zzw1.asBinder();
_L1:
            parcel.writeStrongBinder(zzw1);
            zzw1 = obj;
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            zzw1 = zzd1.asBinder();
            parcel.writeStrongBinder(zzw1);
            zznF.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzw1 = null;
              goto _L1
            zzw1;
            parcel1.recycle();
            parcel.recycle();
            throw zzw1;
        }

        public void stopAnimation()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

        public boolean useViewLifecycleWhenInFragment()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznF.transact(59, parcel, parcel1, 0);
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

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract zze addCircle(CircleOptions circleoptions)
        throws RemoteException;

    public abstract zzf addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
        throws RemoteException;

    public abstract zzf addGroundOverlay2(GroundOverlayOptions groundoverlayoptions, GroundOverlayOptionsParcelable groundoverlayoptionsparcelable)
        throws RemoteException;

    public abstract zzi addMarker(MarkerOptions markeroptions)
        throws RemoteException;

    public abstract zzi addMarker2(MarkerOptions markeroptions, MarkerOptionsParcelable markeroptionsparcelable)
        throws RemoteException;

    public abstract zzj addPolygon(PolygonOptions polygonoptions)
        throws RemoteException;

    public abstract IPolylineDelegate addPolyline(PolylineOptions polylineoptions)
        throws RemoteException;

    public abstract zzk addTileOverlay(TileOverlayOptions tileoverlayoptions)
        throws RemoteException;

    public abstract void animateCamera(zzd zzd)
        throws RemoteException;

    public abstract void animateCamera2(CameraUpdateParcelable cameraupdateparcelable)
        throws RemoteException;

    public abstract void animateCameraWithCallback(zzd zzd, com.google.android.gms.maps.internal.zzb zzb)
        throws RemoteException;

    public abstract void animateCameraWithCallback2(CameraUpdateParcelable cameraupdateparcelable, com.google.android.gms.maps.internal.zzb zzb)
        throws RemoteException;

    public abstract void animateCameraWithDurationAndCallback(zzd zzd, int i, com.google.android.gms.maps.internal.zzb zzb)
        throws RemoteException;

    public abstract void animateCameraWithDurationAndCallback2(CameraUpdateParcelable cameraupdateparcelable, int i, com.google.android.gms.maps.internal.zzb zzb)
        throws RemoteException;

    public abstract void clear()
        throws RemoteException;

    public abstract CameraPosition getCameraPosition()
        throws RemoteException;

    public abstract zzg getFocusedBuilding()
        throws RemoteException;

    public abstract void getMapAsync(com.google.android.gms.maps.internal.zzm zzm)
        throws RemoteException;

    public abstract int getMapType()
        throws RemoteException;

    public abstract float getMaxZoomLevel()
        throws RemoteException;

    public abstract float getMinZoomLevel()
        throws RemoteException;

    public abstract Location getMyLocation()
        throws RemoteException;

    public abstract IProjectionDelegate getProjection()
        throws RemoteException;

    public abstract IUiSettingsDelegate getUiSettings()
        throws RemoteException;

    public abstract boolean isBuildingsEnabled()
        throws RemoteException;

    public abstract boolean isIndoorEnabled()
        throws RemoteException;

    public abstract boolean isMyLocationEnabled()
        throws RemoteException;

    public abstract boolean isTrafficEnabled()
        throws RemoteException;

    public abstract void moveCamera(zzd zzd)
        throws RemoteException;

    public abstract void moveCamera2(CameraUpdateParcelable cameraupdateparcelable)
        throws RemoteException;

    public abstract void onCreate(Bundle bundle)
        throws RemoteException;

    public abstract void onDestroy()
        throws RemoteException;

    public abstract void onLowMemory()
        throws RemoteException;

    public abstract void onPause()
        throws RemoteException;

    public abstract void onResume()
        throws RemoteException;

    public abstract void onSaveInstanceState(Bundle bundle)
        throws RemoteException;

    public abstract void setBuildingsEnabled(boolean flag)
        throws RemoteException;

    public abstract void setContentDescription(String s)
        throws RemoteException;

    public abstract boolean setIndoorEnabled(boolean flag)
        throws RemoteException;

    public abstract void setInfoWindowAdapter(com.google.android.gms.maps.internal.zzd zzd)
        throws RemoteException;

    public abstract void setInfoWindowRenderer(com.google.android.gms.maps.internal.zze zze)
        throws RemoteException;

    public abstract void setLocationSource(ILocationSourceDelegate ilocationsourcedelegate)
        throws RemoteException;

    public abstract void setMapType(int i)
        throws RemoteException;

    public abstract void setMyLocationEnabled(boolean flag)
        throws RemoteException;

    public abstract void setOnCameraChangeListener(com.google.android.gms.maps.internal.zzf zzf)
        throws RemoteException;

    public abstract void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzg zzg)
        throws RemoteException;

    public abstract void setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzh zzh)
        throws RemoteException;

    public abstract void setOnMapClickListener(com.google.android.gms.maps.internal.zzj zzj)
        throws RemoteException;

    public abstract void setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzk zzk)
        throws RemoteException;

    public abstract void setOnMapLongClickListener(zzl zzl)
        throws RemoteException;

    public abstract void setOnMarkerClickListener(com.google.android.gms.maps.internal.zzn zzn)
        throws RemoteException;

    public abstract void setOnMarkerDragListener(zzo zzo)
        throws RemoteException;

    public abstract void setOnMyLocationButtonClickListener(zzp zzp)
        throws RemoteException;

    public abstract void setOnMyLocationChangeListener(zzq zzq)
        throws RemoteException;

    public abstract void setPadding(int i, int j, int k, int l)
        throws RemoteException;

    public abstract void setTrafficEnabled(boolean flag)
        throws RemoteException;

    public abstract void snapshot(zzw zzw, zzd zzd)
        throws RemoteException;

    public abstract void stopAnimation()
        throws RemoteException;

    public abstract boolean useViewLifecycleWhenInFragment()
        throws RemoteException;
}
