// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
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
import com.google.android.gms.maps.model.zza;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IGoogleMapDelegate, zzb, zzl, zzd, 
//            ILocationSourceDelegate, zze, zzf, zzg, 
//            zzi, zzj, zzk, zzm, 
//            zzn, zzo, zzp, zzq, 
//            zzw, IProjectionDelegate, IUiSettingsDelegate

private static class zznI
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
        circleoptions = com.google.android.gms.maps.model.internal.(parcel1.readStrongBinder());
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
        groundoverlayoptions = com.google.android.gms.maps.model.internal.(parcel1.readStrongBinder());
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
        markeroptions = com.google.android.gms.maps.model.internal.(parcel1.readStrongBinder());
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
        polygonoptions = com.google.android.gms.maps.model.internal.(parcel1.readStrongBinder());
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
        polylineoptions = com.google.android.gms.maps.model.internal._11__08_P(parcel1.readStrongBinder());
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
        tileoverlayoptions = com.google.android.gms.maps.model.internal._11__08_P(parcel1.readStrongBinder());
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
        zzd1 = com.google.android.gms.maps.model.internal._11__08_P(parcel1.readStrongBinder());
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
        Location location = (Location)Location.CREATOR.omParcel(parcel1);
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
        iprojectiondelegate = I(parcel1.readStrongBinder());
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
        iuisettingsdelegate = N(parcel1.readStrongBinder());
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

    public void setOnMapClickListener(zzi zzi1)
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

    public void setOnMyLocationButtonClickListener(zzo zzo1)
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

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
