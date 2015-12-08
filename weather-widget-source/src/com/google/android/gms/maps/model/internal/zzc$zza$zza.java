// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zzd;
import com.google.android.gms.maps.model.zze;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzc

private static class zznI
    implements zzc
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public float getBearing()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(12, parcel, parcel1, 0);
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

    public LatLngBounds getBounds()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        LatLngBounds latlngbounds = LatLngBounds.CREATOR.zzeZ(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return latlngbounds;
_L2:
        latlngbounds = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public float getHeight()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(8, parcel, parcel1, 0);
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

    public String getId()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(2, parcel, parcel1, 0);
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

    public LatLng getPosition()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        LatLng latlng = LatLng.CREATOR.zzfa(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return latlng;
_L2:
        latlng = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public float getTransparency()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(18, parcel, parcel1, 0);
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

    public float getWidth()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(7, parcel, parcel1, 0);
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

    public float getZIndex()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(14, parcel, parcel1, 0);
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

    public int hashCodeRemote()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(20, parcel, parcel1, 0);
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

    public boolean isVisible()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(16, parcel, parcel1, 0);
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

    public void remove()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        zznI.transact(1, parcel, parcel1, 0);
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

    public void setBearing(float f)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        parcel.writeFloat(f);
        zznI.transact(11, parcel, parcel1, 0);
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

    public void setDimensions(float f)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        parcel.writeFloat(f);
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

    public void setPosition(LatLng latlng)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L1:
        zznI.transact(3, parcel, parcel1, 0);
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

    public void setPositionFromBounds(LatLngBounds latlngbounds)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (latlngbounds == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L1:
        zznI.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        latlngbounds;
        parcel1.recycle();
        parcel.recycle();
        throw latlngbounds;
    }

    public void setTransparency(float f)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        parcel.writeFloat(f);
        zznI.transact(17, parcel, parcel1, 0);
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

    public void setVisible(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        zznI.transact(15, parcel, parcel1, 0);
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

    public void setZIndex(float f)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        parcel.writeFloat(f);
        zznI.transact(13, parcel, parcel1, 0);
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

    public void zza(float f, float f1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        parcel.writeFloat(f);
        parcel.writeFloat(f1);
        zznI.transact(6, parcel, parcel1, 0);
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

    public boolean zza(zzc zzc1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (zzc1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        zzc1 = zzc1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(zzc1);
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
        zzc1 = null;
          goto _L1
        zzc1;
        parcel1.recycle();
        parcel.recycle();
        throw zzc1;
    }

    public void zzw(com.google.android.gms.dynamic.zzd zzd1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (zzd1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzd1 = zzd1.asBinder();
_L1:
        parcel.writeStrongBinder(zzd1);
        zznI.transact(21, parcel, parcel1, 0);
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

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
