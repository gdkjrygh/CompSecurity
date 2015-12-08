// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzf, PlacesParams, zzh, zzg

private static class zznI
    implements zzf
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(AddPlaceRequest addplacerequest, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (addplacerequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        addplacerequest.writeToParcel(parcel, 0);
_L3:
        if (placesparams == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        addplacerequest = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        addplacerequest = zzh1.asBinder();
        parcel.writeStrongBinder(addplacerequest);
        zznI.transact(14, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        addplacerequest;
        parcel.recycle();
        throw addplacerequest;
        parcel.writeInt(0);
          goto _L4
    }

    public void zza(NearbyAlertRequest nearbyalertrequest, PlacesParams placesparams, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (nearbyalertrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        nearbyalertrequest.writeToParcel(parcel, 0);
_L5:
        if (placesparams == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L6:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L7:
        zznI.transact(11, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        nearbyalertrequest;
        parcel.recycle();
        throw nearbyalertrequest;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public void zza(PlaceReport placereport, PlacesParams placesparams)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (placereport == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placereport.writeToParcel(parcel, 0);
_L3:
        if (placesparams == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        zznI.transact(15, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        placereport;
        parcel.recycle();
        throw placereport;
        parcel.writeInt(0);
          goto _L4
    }

    public void zza(PlaceRequest placerequest, PlacesParams placesparams, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (placerequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placerequest.writeToParcel(parcel, 0);
_L5:
        if (placesparams == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L6:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L7:
        zznI.transact(9, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        placerequest;
        parcel.recycle();
        throw placerequest;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public void zza(UserDataType userdatatype, LatLngBounds latlngbounds, List list, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (userdatatype == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        userdatatype.writeToParcel(parcel, 0);
_L5:
        if (latlngbounds == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L6:
        parcel.writeStringList(list);
        if (placesparams == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L7:
        userdatatype = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        userdatatype = zzh1.asBinder();
        parcel.writeStrongBinder(userdatatype);
        zznI.transact(8, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        userdatatype;
        parcel.recycle();
        throw userdatatype;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public void zza(PlacesParams placesparams, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L3:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L4:
        zznI.transact(10, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        placesparams;
        parcel.recycle();
        throw placesparams;
        parcel.writeInt(0);
          goto _L4
    }

    public void zza(PlaceAlias placealias, String s, String s1, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (placealias == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placealias.writeToParcel(parcel, 0);
_L3:
        parcel.writeString(s);
        parcel.writeString(s1);
        if (placesparams == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        placealias = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        placealias = zzh1.asBinder();
        parcel.writeStrongBinder(placealias);
        zznI.transact(16, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        placealias;
        parcel.recycle();
        throw placealias;
        parcel.writeInt(0);
          goto _L4
    }

    public void zza(LatLng latlng, PlaceFilter placefilter, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (latlng == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L5:
        if (placefilter == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        placefilter.writeToParcel(parcel, 0);
_L6:
        if (placesparams == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L7:
        latlng = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        latlng = zzh1.asBinder();
        parcel.writeStrongBinder(latlng);
        zznI.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        latlng;
        parcel.recycle();
        throw latlng;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public void zza(LatLngBounds latlngbounds, int i, String s, PlaceFilter placefilter, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (latlngbounds == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L5:
        parcel.writeInt(i);
        parcel.writeString(s);
        if (placefilter == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        placefilter.writeToParcel(parcel, 0);
_L6:
        if (placesparams == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L7:
        latlngbounds = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        latlngbounds = zzh1.asBinder();
        parcel.writeStrongBinder(latlngbounds);
        zznI.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        latlngbounds;
        parcel.recycle();
        throw latlngbounds;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public void zza(String s, int i, int j, int k, PlacesParams placesparams, zzg zzg1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        s = obj;
        if (zzg1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        s = zzg1.asBinder();
        parcel.writeStrongBinder(s);
        zznI.transact(20, parcel, null, 1);
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

    public void zza(String s, int i, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        parcel.writeString(s);
        parcel.writeInt(i);
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        s = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        s = zzh1.asBinder();
        parcel.writeStrongBinder(s);
        zznI.transact(18, parcel, null, 1);
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

    public void zza(String s, PlacesParams placesparams, zzg zzg1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        parcel.writeString(s);
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        s = obj;
        if (zzg1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        s = zzg1.asBinder();
        parcel.writeStrongBinder(s);
        zznI.transact(19, parcel, null, 1);
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

    public void zza(String s, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        parcel.writeString(s);
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        s = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        s = zzh1.asBinder();
        parcel.writeStrongBinder(s);
        zznI.transact(3, parcel, null, 1);
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

    public void zza(String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        parcel.writeString(s);
        if (latlngbounds == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L5:
        if (autocompletefilter == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        autocompletefilter.writeToParcel(parcel, 0);
_L6:
        if (placesparams == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L7:
        s = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        s = zzh1.asBinder();
        parcel.writeStrongBinder(s);
        zznI.transact(13, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        s;
        parcel.recycle();
        throw s;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public void zza(List list, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        parcel.writeStringList(list);
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        list = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        list = zzh1.asBinder();
        parcel.writeStrongBinder(list);
        zznI.transact(7, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
        if (true) goto _L4; else goto _L3
_L3:
        list;
        parcel.recycle();
        throw list;
    }

    public void zzb(PlaceFilter placefilter, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (placefilter == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placefilter.writeToParcel(parcel, 0);
_L3:
        if (placesparams == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        placefilter = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        placefilter = zzh1.asBinder();
        parcel.writeStrongBinder(placefilter);
        zznI.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        placefilter;
        parcel.recycle();
        throw placefilter;
        parcel.writeInt(0);
          goto _L4
    }

    public void zzb(PlacesParams placesparams, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L3:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L4:
        zznI.transact(12, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        placesparams;
        parcel.recycle();
        throw placesparams;
        parcel.writeInt(0);
          goto _L4
    }

    public void zzb(String s, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        parcel.writeString(s);
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        s = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        s = zzh1.asBinder();
        parcel.writeStrongBinder(s);
        zznI.transact(6, parcel, null, 1);
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

    public void zzb(List list, PlacesParams placesparams, zzh zzh1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
        parcel.writeStringList(list);
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L4:
        list = obj;
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        list = zzh1.asBinder();
        parcel.writeStrongBinder(list);
        zznI.transact(17, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
        if (true) goto _L4; else goto _L3
_L3:
        list;
        parcel.recycle();
        throw list;
    }

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
