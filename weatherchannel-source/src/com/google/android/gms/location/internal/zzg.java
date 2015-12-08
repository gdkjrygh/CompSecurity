// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationRequestCreator;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzd;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzf, zzh, LocationRequestInternal, LocationRequestUpdateData, 
//            ParcelableGeofence, zzk, zzl

public interface zzg
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzg
    {

        public static zzg zzbW(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        /* block-local class not found */
        class zza {}

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
                zza(((List) (obj1)), ((PendingIntent) (obj)), zzf.zza.zzbV(parcel.readStrongBinder()), parcel.readString());
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
                zza(((GeofencingRequest) (obj)), ((PendingIntent) (obj1)), zzf.zza.zzbV(parcel.readStrongBinder()));
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
                zza(((PendingIntent) (obj)), zzf.zza.zzbV(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                zza(parcel.createStringArray(), zzf.zza.zzbV(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                zza(zzf.zza.zzbV(parcel.readStrongBinder()), parcel.readString());
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
                zza(((LocationRequest) (obj)), com.google.android.gms.location.zzd.zza.zzbT(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = LocationRequest.CREATOR.createFromParcel(parcel);
                }
                zza(((LocationRequest) (obj)), com.google.android.gms.location.zzd.zza.zzbT(parcel.readStrongBinder()), parcel.readString());
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
                zza(((LocationRequestInternal) (obj)), com.google.android.gms.location.zzd.zza.zzbT(parcel.readStrongBinder()));
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
                zza(com.google.android.gms.location.zzd.zza.zzbT(parcel.readStrongBinder()));
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
            zza(((LocationSettingsRequest) (obj)), zzh.zza.zzbX(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }


    public abstract Status zza(GestureRequest gesturerequest, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void zza(long l, boolean flag, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void zza(PendingIntent pendingintent)
        throws RemoteException;

    public abstract void zza(PendingIntent pendingintent, zzf zzf, String s)
        throws RemoteException;

    public abstract void zza(Location location, int i)
        throws RemoteException;

    public abstract void zza(GeofencingRequest geofencingrequest, PendingIntent pendingintent, zzf zzf)
        throws RemoteException;

    public abstract void zza(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void zza(LocationRequest locationrequest, zzd zzd)
        throws RemoteException;

    public abstract void zza(LocationRequest locationrequest, zzd zzd, String s)
        throws RemoteException;

    public abstract void zza(LocationSettingsRequest locationsettingsrequest, zzh zzh, String s)
        throws RemoteException;

    public abstract void zza(LocationRequestInternal locationrequestinternal, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void zza(LocationRequestInternal locationrequestinternal, zzd zzd)
        throws RemoteException;

    public abstract void zza(LocationRequestUpdateData locationrequestupdatedata)
        throws RemoteException;

    public abstract void zza(zzf zzf, String s)
        throws RemoteException;

    public abstract void zza(zzd zzd)
        throws RemoteException;

    public abstract void zza(List list, PendingIntent pendingintent, zzf zzf, String s)
        throws RemoteException;

    public abstract void zza(String as[], zzf zzf, String s)
        throws RemoteException;

    public abstract void zzac(boolean flag)
        throws RemoteException;

    public abstract Status zzb(PendingIntent pendingintent)
        throws RemoteException;

    public abstract void zzb(Location location)
        throws RemoteException;

    public abstract void zzc(PendingIntent pendingintent)
        throws RemoteException;

    public abstract ActivityRecognitionResult zzdk(String s)
        throws RemoteException;

    public abstract Location zzdl(String s)
        throws RemoteException;

    public abstract LocationAvailability zzdm(String s)
        throws RemoteException;

    public abstract Location zzuu()
        throws RemoteException;

    public abstract IBinder zzuv()
        throws RemoteException;
}
