// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityRecognitionResultCreator;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationAvailabilityCreator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationRequestCreator;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzd;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzg, ParcelableGeofence, LocationRequestInternal, zzk, 
//            LocationRequestUpdateData, zzl, zzf, zzh

public static abstract class zza.zznF extends Binder
    implements zzg
{
    private static class zza
        implements zzg
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public Status zza(GestureRequest gesturerequest, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (gesturerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            gesturerequest.writeToParcel(parcel, 0);
_L5:
            if (pendingintent == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L6:
            zznF.transact(60, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_127;
            }
            gesturerequest = (Status)Status.CREATOR.createFromParcel(parcel1);
_L7:
            parcel1.recycle();
            parcel.recycle();
            return gesturerequest;
_L2:
            parcel.writeInt(0);
              goto _L5
            gesturerequest;
            parcel1.recycle();
            parcel.recycle();
            throw gesturerequest;
_L4:
            parcel.writeInt(0);
              goto _L6
            gesturerequest = null;
              goto _L7
        }

        public void zza(long l, boolean flag, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeLong(l);
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L1:
            zznF.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
        }

        public void zza(PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L1:
            zznF.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
        }

        public void zza(PendingIntent pendingintent, zzf zzf1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingintent == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L3:
            if (zzf1 == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            pendingintent = zzf1.asBinder();
_L4:
            parcel.writeStrongBinder(pendingintent);
            parcel.writeString(s);
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
            pendingintent = null;
              goto _L4
        }

        public void zza(Location location, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (location == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            location.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            zznF.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            location;
            parcel1.recycle();
            parcel.recycle();
            throw location;
        }

        public void zza(GeofencingRequest geofencingrequest, PendingIntent pendingintent, zzf zzf1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (geofencingrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            geofencingrequest.writeToParcel(parcel, 0);
_L5:
            if (pendingintent == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L6:
            if (zzf1 == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            geofencingrequest = zzf1.asBinder();
_L7:
            parcel.writeStrongBinder(geofencingrequest);
            zznF.transact(57, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            geofencingrequest;
            parcel1.recycle();
            parcel.recycle();
            throw geofencingrequest;
_L4:
            parcel.writeInt(0);
              goto _L6
            geofencingrequest = null;
              goto _L7
        }

        public void zza(LocationRequest locationrequest, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            locationrequest.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            zznF.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            locationrequest;
            parcel1.recycle();
            parcel.recycle();
            throw locationrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(LocationRequest locationrequest, zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            locationrequest.writeToParcel(parcel, 0);
_L3:
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            locationrequest = zzd1.asBinder();
_L4:
            parcel.writeStrongBinder(locationrequest);
            zznF.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            locationrequest;
            parcel1.recycle();
            parcel.recycle();
            throw locationrequest;
            locationrequest = null;
              goto _L4
        }

        public void zza(LocationRequest locationrequest, zzd zzd1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            locationrequest.writeToParcel(parcel, 0);
_L3:
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            locationrequest = zzd1.asBinder();
_L4:
            parcel.writeStrongBinder(locationrequest);
            parcel.writeString(s);
            zznF.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            locationrequest;
            parcel1.recycle();
            parcel.recycle();
            throw locationrequest;
            locationrequest = null;
              goto _L4
        }

        public void zza(LocationSettingsRequest locationsettingsrequest, zzh zzh1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationsettingsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            locationsettingsrequest.writeToParcel(parcel, 0);
_L3:
            if (zzh1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            locationsettingsrequest = zzh1.asBinder();
_L4:
            parcel.writeStrongBinder(locationsettingsrequest);
            parcel.writeString(s);
            zznF.transact(63, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            locationsettingsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw locationsettingsrequest;
            locationsettingsrequest = null;
              goto _L4
        }

        public void zza(LocationRequestInternal locationrequestinternal, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationrequestinternal == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            locationrequestinternal.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            zznF.transact(53, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            locationrequestinternal;
            parcel1.recycle();
            parcel.recycle();
            throw locationrequestinternal;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(LocationRequestInternal locationrequestinternal, zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationrequestinternal == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            locationrequestinternal.writeToParcel(parcel, 0);
_L3:
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            locationrequestinternal = zzd1.asBinder();
_L4:
            parcel.writeStrongBinder(locationrequestinternal);
            zznF.transact(52, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            locationrequestinternal;
            parcel1.recycle();
            parcel.recycle();
            throw locationrequestinternal;
            locationrequestinternal = null;
              goto _L4
        }

        public void zza(LocationRequestUpdateData locationrequestupdatedata)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationrequestupdatedata == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            locationrequestupdatedata.writeToParcel(parcel, 0);
_L1:
            zznF.transact(59, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            locationrequestupdatedata;
            parcel1.recycle();
            parcel.recycle();
            throw locationrequestupdatedata;
        }

        public void zza(zzf zzf1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (zzf1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zzf1 = zzf1.asBinder();
_L1:
            parcel.writeStrongBinder(zzf1);
            parcel.writeString(s);
            zznF.transact(4, parcel, parcel1, 0);
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

        public void zza(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zznF.transact(10, parcel, parcel1, 0);
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

        public void zza(List list, PendingIntent pendingintent, zzf zzf1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeTypedList(list);
            if (pendingintent == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L3:
            if (zzf1 == null)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            list = zzf1.asBinder();
_L4:
            parcel.writeStrongBinder(list);
            parcel.writeString(s);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
            list = null;
              goto _L4
        }

        public void zza(String as[], zzf zzf1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeStringArray(as);
            if (zzf1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            as = zzf1.asBinder();
_L1:
            parcel.writeStrongBinder(as);
            parcel.writeString(s);
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            as = null;
              goto _L1
            as;
            parcel1.recycle();
            parcel.recycle();
            throw as;
        }

        public void zzac(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        public Status zzb(PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingintent == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L3:
            zznF.transact(61, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            pendingintent = (Status)Status.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return pendingintent;
_L2:
            parcel.writeInt(0);
              goto _L3
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
            pendingintent = null;
              goto _L4
        }

        public void zzb(Location location)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (location == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            location.writeToParcel(parcel, 0);
_L1:
            zznF.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            location;
            parcel1.recycle();
            parcel.recycle();
            throw location;
        }

        public void zzc(PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L1:
            zznF.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
        }

        public ActivityRecognitionResult zzdk(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            zznF.transact(64, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = ActivityRecognitionResult.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public Location zzdl(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            zznF.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public LocationAvailability zzdm(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            zznF.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = LocationAvailability.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public Location zzuu()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            zznF.transact(7, parcel, parcel1, 0);
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

        public IBinder zzuv()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            IBinder ibinder;
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            zznF.transact(51, parcel, parcel1, 0);
            parcel1.readException();
            ibinder = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return ibinder;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzg zzbW(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (iinterface != null && (iinterface instanceof zzg))
        {
            return (zzg)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        boolean flag2 = false;
        boolean flag = false;
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj1 = parcel.createTypedArrayList(ParcelableGeofence.CREATOR);
            if (parcel.readInt() != 0)
            {
                obj = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            zza(((List) (obj1)), ((PendingIntent) (obj)), zzbV(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 57: // '9'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = (GeofencingRequest)GeofencingRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                obj1 = null;
            }
            zza(((GeofencingRequest) (obj)), ((PendingIntent) (obj1)), zzbV(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            zza(((PendingIntent) (obj)), zzbV(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            zza(parcel.createStringArray(), zzbV(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            zza(zzbV(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            long l = parcel.readLong();
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(l, flag, parcel);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(parcel);
            parcel1.writeNoException();
            return true;

        case 64: // '@'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel = zzdk(parcel.readString());
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

        case 60: // '<'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = GestureRequest.CREATOR.zzed(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = zza(((GestureRequest) (obj)), parcel);
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
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = zzb(parcel);
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

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel = zzuu();
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

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = LocationRequest.CREATOR.createFromParcel(parcel);
            }
            zza(((LocationRequest) (obj)), com.google.android.gms.location.zzbT(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = LocationRequest.CREATOR.createFromParcel(parcel);
            }
            zza(((LocationRequest) (obj)), com.google.android.gms.location.zzbT(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = LocationRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(((LocationRequest) (obj)), parcel);
            parcel1.writeNoException();
            return true;

        case 52: // '4'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = LocationRequestInternal.CREATOR.zzek(parcel);
            }
            zza(((LocationRequestInternal) (obj)), com.google.android.gms.location.zzbT(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = LocationRequestInternal.CREATOR.zzek(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(((LocationRequestInternal) (obj)), parcel);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            zza(com.google.android.gms.location.zzbT(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zzc(parcel);
            parcel1.writeNoException();
            return true;

        case 59: // ';'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = LocationRequestUpdateData.CREATOR.zzel(parcel);
            }
            zza(((LocationRequestUpdateData) (obj)));
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            boolean flag1 = flag2;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            }
            zzac(flag1);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                parcel = (Location)Location.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zzb(parcel);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel = zzdl(parcel.readString());
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

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = (Location)Location.CREATOR.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            zza(((Location) (obj)), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel = zzdm(parcel.readString());
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

        case 51: // '3'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel = zzuv();
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;

        case 63: // '?'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (LocationSettingsRequest)LocationSettingsRequest.CREATOR.createFromParcel(parcel);
        } else
        {
            obj = null;
        }
        zza(((LocationSettingsRequest) (obj)), zzbX(parcel.readStrongBinder()), parcel.readString());
        parcel1.writeNoException();
        return true;
    }
}
