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
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.zzb;
import com.google.android.gms.maps.model.internal.zzc;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzh;
import com.google.android.gms.maps.model.zzi;
import com.google.android.gms.maps.model.zzo;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzb, zzl, IProjectionDelegate, IUiSettingsDelegate, 
//            zzd, ILocationSourceDelegate, zze, zzf, 
//            zzg, zzi, zzj, zzk, 
//            zzm, zzn, zzo, zzp, 
//            zzq, zzw

public interface IGoogleMapDelegate
    extends IInterface
{
    public static abstract class zza extends Binder
        implements IGoogleMapDelegate
    {

        public static IGoogleMapDelegate zzcl(IBinder ibinder)
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
            IPolylineDelegate ipolylinedelegate = null;
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj4 = null;
            Object obj7 = null;
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
                moveCamera(com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                animateCamera(com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                animateCameraWithCallback(com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder()), zzb.zza.zzcj(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder()), parcel.readInt(), zzb.zza.zzcj(parcel.readStrongBinder()));
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
                    parcel = PolylineOptions.CREATOR.zzfe(parcel);
                } else
                {
                    parcel = null;
                }
                ipolylinedelegate = addPolyline(parcel);
                parcel1.writeNoException();
                parcel = obj;
                if (ipolylinedelegate != null)
                {
                    parcel = ipolylinedelegate.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                zzg zzg1;
                if (parcel.readInt() != 0)
                {
                    parcel = PolygonOptions.CREATOR.zzfd(parcel);
                } else
                {
                    parcel = null;
                }
                zzg1 = addPolygon(parcel);
                parcel1.writeNoException();
                parcel = ipolylinedelegate;
                if (zzg1 != null)
                {
                    parcel = zzg1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                zzf zzf1;
                if (parcel.readInt() != 0)
                {
                    parcel = MarkerOptions.CREATOR.zzfb(parcel);
                } else
                {
                    parcel = null;
                }
                zzf1 = addMarker(parcel);
                parcel1.writeNoException();
                parcel = obj1;
                if (zzf1 != null)
                {
                    parcel = zzf1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                zzc zzc1;
                if (parcel.readInt() != 0)
                {
                    parcel = GroundOverlayOptions.CREATOR.zzeY(parcel);
                } else
                {
                    parcel = null;
                }
                zzc1 = addGroundOverlay(parcel);
                parcel1.writeNoException();
                parcel = obj2;
                if (zzc1 != null)
                {
                    parcel = zzc1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                zzh zzh1;
                if (parcel.readInt() != 0)
                {
                    parcel = TileOverlayOptions.CREATOR.zzfk(parcel);
                } else
                {
                    parcel = null;
                }
                zzh1 = addTileOverlay(parcel);
                parcel1.writeNoException();
                parcel = obj3;
                if (zzh1 != null)
                {
                    parcel = zzh1.asBinder();
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
                setLocationSource(ILocationSourceDelegate.zza.zzcn(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                IUiSettingsDelegate iuisettingsdelegate = getUiSettings();
                parcel1.writeNoException();
                parcel = obj5;
                if (iuisettingsdelegate != null)
                {
                    parcel = iuisettingsdelegate.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                IProjectionDelegate iprojectiondelegate = getProjection();
                parcel1.writeNoException();
                parcel = obj6;
                if (iprojectiondelegate != null)
                {
                    parcel = iprojectiondelegate.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnCameraChangeListener(zze.zza.zzcq(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMapClickListener(zzi.zza.zzcu(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMapLongClickListener(zzk.zza.zzcw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMarkerClickListener(zzm.zza.zzcy(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMarkerDragListener(zzn.zza.zzcz(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnInfoWindowClickListener(zzg.zza.zzcs(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setInfoWindowAdapter(zzd.zza.zzcm(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                zzb zzb1;
                if (parcel.readInt() != 0)
                {
                    parcel = CircleOptions.CREATOR.zzeX(parcel);
                } else
                {
                    parcel = null;
                }
                zzb1 = addCircle(parcel);
                parcel1.writeNoException();
                parcel = obj4;
                if (zzb1 != null)
                {
                    parcel = zzb1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 36: // '$'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMyLocationChangeListener(zzp.zza.zzcB(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnMyLocationButtonClickListener(zzo.zza.zzcA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                snapshot(zzw.zza.zzcJ(parcel.readStrongBinder()), com.google.android.gms.dynamic.zzd.zza.zzbk(parcel.readStrongBinder()));
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
                setOnMapLoadedCallback(zzj.zza.zzcv(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 44: // ','
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                com.google.android.gms.maps.model.internal.zzd zzd1 = getFocusedBuilding();
                parcel1.writeNoException();
                parcel = obj7;
                if (zzd1 != null)
                {
                    parcel = zzd1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 45: // '-'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnIndoorStateChangeListener(zzf.zza.zzcr(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 53: // '5'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                getMapAsync(zzl.zza.zzcx(parcel.readStrongBinder()));
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

            case 80: // 'P'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                setOnPoiClickListener(zzq.zza.zzcC(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements IGoogleMapDelegate
    {

        private IBinder zznI;

        public zzb addCircle(CircleOptions circleoptions)
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
            zznI.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            circleoptions = com.google.android.gms.maps.model.internal.zzb.zza.zzcP(parcel1.readStrongBinder());
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

        public zzc addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
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
            zznI.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            groundoverlayoptions = com.google.android.gms.maps.model.internal.zzc.zza.zzcQ(parcel1.readStrongBinder());
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

        public zzf addMarker(MarkerOptions markeroptions)
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
            zznI.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            markeroptions = com.google.android.gms.maps.model.internal.zzf.zza.zzcT(parcel1.readStrongBinder());
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

        public zzg addPolygon(PolygonOptions polygonoptions)
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
            zznI.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            polygonoptions = com.google.android.gms.maps.model.internal.zzg.zza.zzcU(parcel1.readStrongBinder());
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
            zznI.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            polylineoptions = com.google.android.gms.maps.model.internal.IPolylineDelegate.zza.zzcV(parcel1.readStrongBinder());
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

        public zzh addTileOverlay(TileOverlayOptions tileoverlayoptions)
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
            zznI.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            tileoverlayoptions = com.google.android.gms.maps.model.internal.zzh.zza.zzcW(parcel1.readStrongBinder());
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
            zznI.transact(5, parcel, parcel1, 0);
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
            zznI.transact(6, parcel, parcel1, 0);
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
            zznI.transact(7, parcel, parcel1, 0);
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

        public IBinder asBinder()
        {
            return zznI;
        }

        public void clear()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznI.transact(14, parcel, parcel1, 0);
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
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            CameraPosition cameraposition = CameraPosition.CREATOR.zzeW(parcel1);
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

        public com.google.android.gms.maps.model.internal.zzd getFocusedBuilding()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.maps.model.internal.zzd zzd1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznI.transact(44, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = com.google.android.gms.maps.model.internal.zzd.zza.zzcR(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void getMapAsync(zzl zzl1)
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
            zznI.transact(53, parcel, parcel1, 0);
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

        public int getMapType()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zznI.transact(15, parcel, parcel1, 0);
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
            zznI.transact(2, parcel, parcel1, 0);
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
            zznI.transact(3, parcel, parcel1, 0);
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
            zznI.transact(23, parcel, parcel1, 0);
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
            zznI.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            iprojectiondelegate = IProjectionDelegate.zza.zzcI(parcel1.readStrongBinder());
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
            zznI.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            iuisettingsdelegate = IUiSettingsDelegate.zza.zzcN(parcel1.readStrongBinder());
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
            zznI.transact(40, parcel, parcel1, 0);
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
            zznI.transact(19, parcel, parcel1, 0);
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
            zznI.transact(21, parcel, parcel1, 0);
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
            zznI.transact(17, parcel, parcel1, 0);
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
            zznI.transact(4, parcel, parcel1, 0);
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
            zznI.transact(54, parcel, parcel1, 0);
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
            zznI.transact(57, parcel, parcel1, 0);
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
            zznI.transact(58, parcel, parcel1, 0);
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
            zznI.transact(56, parcel, parcel1, 0);
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
            zznI.transact(55, parcel, parcel1, 0);
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
            zznI.transact(60, parcel, parcel1, 0);
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
            zznI.transact(41, parcel, parcel1, 0);
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
            zznI.transact(61, parcel, parcel1, 0);
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
            zznI.transact(20, parcel, parcel1, 0);
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
            zznI.transact(33, parcel, parcel1, 0);
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
            zznI.transact(24, parcel, parcel1, 0);
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
            zznI.transact(16, parcel, parcel1, 0);
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
            zznI.transact(22, parcel, parcel1, 0);
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

        public void setOnCameraChangeListener(zze zze1)
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
            zznI.transact(27, parcel, parcel1, 0);
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

        public void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzf zzf1)
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
            zznI.transact(45, parcel, parcel1, 0);
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

        public void setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzg zzg1)
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
            zznI.transact(32, parcel, parcel1, 0);
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

        public void setOnMapClickListener(com.google.android.gms.maps.internal.zzi zzi1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (zzi1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzi1 = zzi1.asBinder();
_L1:
            parcel.writeStrongBinder(zzi1);
            zznI.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzi1 = null;
              goto _L1
            zzi1;
            parcel1.recycle();
            parcel.recycle();
            throw zzi1;
        }

        public void setOnMapLoadedCallback(zzj zzj1)
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
            zznI.transact(42, parcel, parcel1, 0);
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

        public void setOnMapLongClickListener(zzk zzk1)
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
            zznI.transact(29, parcel, parcel1, 0);
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

        public void setOnMarkerClickListener(zzm zzm1)
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
            zznI.transact(30, parcel, parcel1, 0);
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

        public void setOnMarkerDragListener(zzn zzn1)
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
            zznI.transact(31, parcel, parcel1, 0);
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

        public void setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzo zzo1)
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
            zznI.transact(37, parcel, parcel1, 0);
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

        public void setOnMyLocationChangeListener(zzp zzp1)
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
            zznI.transact(36, parcel, parcel1, 0);
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

        public void setOnPoiClickListener(zzq zzq1)
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
            zznI.transact(80, parcel, parcel1, 0);
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
            zznI.transact(39, parcel, parcel1, 0);
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
            zznI.transact(18, parcel, parcel1, 0);
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
            zznI.transact(38, parcel, parcel1, 0);
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
            zznI.transact(59, parcel, parcel1, 0);
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
            zznI = ibinder;
        }
    }


    public abstract zzb addCircle(CircleOptions circleoptions)
        throws RemoteException;

    public abstract zzc addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
        throws RemoteException;

    public abstract zzf addMarker(MarkerOptions markeroptions)
        throws RemoteException;

    public abstract zzg addPolygon(PolygonOptions polygonoptions)
        throws RemoteException;

    public abstract IPolylineDelegate addPolyline(PolylineOptions polylineoptions)
        throws RemoteException;

    public abstract zzh addTileOverlay(TileOverlayOptions tileoverlayoptions)
        throws RemoteException;

    public abstract void animateCamera(zzd zzd)
        throws RemoteException;

    public abstract void animateCameraWithCallback(zzd zzd, com.google.android.gms.maps.internal.zzb zzb)
        throws RemoteException;

    public abstract void animateCameraWithDurationAndCallback(zzd zzd, int i, com.google.android.gms.maps.internal.zzb zzb)
        throws RemoteException;

    public abstract void clear()
        throws RemoteException;

    public abstract CameraPosition getCameraPosition()
        throws RemoteException;

    public abstract com.google.android.gms.maps.model.internal.zzd getFocusedBuilding()
        throws RemoteException;

    public abstract void getMapAsync(zzl zzl)
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

    public abstract void setLocationSource(ILocationSourceDelegate ilocationsourcedelegate)
        throws RemoteException;

    public abstract void setMapType(int i)
        throws RemoteException;

    public abstract void setMyLocationEnabled(boolean flag)
        throws RemoteException;

    public abstract void setOnCameraChangeListener(zze zze)
        throws RemoteException;

    public abstract void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzf zzf)
        throws RemoteException;

    public abstract void setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzg zzg)
        throws RemoteException;

    public abstract void setOnMapClickListener(com.google.android.gms.maps.internal.zzi zzi)
        throws RemoteException;

    public abstract void setOnMapLoadedCallback(zzj zzj)
        throws RemoteException;

    public abstract void setOnMapLongClickListener(zzk zzk)
        throws RemoteException;

    public abstract void setOnMarkerClickListener(zzm zzm)
        throws RemoteException;

    public abstract void setOnMarkerDragListener(zzn zzn)
        throws RemoteException;

    public abstract void setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzo zzo)
        throws RemoteException;

    public abstract void setOnMyLocationChangeListener(zzp zzp)
        throws RemoteException;

    public abstract void setOnPoiClickListener(zzq zzq)
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
