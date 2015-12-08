// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.zzi;
import com.google.android.gms.maps.model.zzk;
import com.google.android.gms.maps.model.zzl;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IStreetViewPanoramaDelegate, zzr, zzs, zzt, 
//            zzu

private static class zznF
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
        streetviewpanoramaorientation = com.google.android.gms.dynamic.a.zza.zznF(parcel1.readStrongBinder());
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

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
