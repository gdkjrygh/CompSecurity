// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzau, AddListenerRequest, AncsNotificationParcelable, RemoveListenerRequest, 
//            zzat

public interface zzaw
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzaw
    {

        public static zzaw zzea(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            if (iinterface != null && (iinterface instanceof zzaw))
            {
                return (zzaw)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag = false;
            zzau zzau15 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj = null;
            Object obj11 = null;
            Object obj1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableService");
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau15 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                }
                zza(zzau15, ((ConnectionConfiguration) (obj)));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzc(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau2 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = zzau15;
                if (parcel.readInt() != 0)
                {
                    obj = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(parcel);
                }
                zza(zzau2, ((PutDataRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau3 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zza(zzau3, ((Uri) (obj)));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau4 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zzb(zzau4, ((Uri) (obj)));
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau5 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zza(zzau5, ((Uri) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau6 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zzc(zzau6, ((Uri) (obj)));
                parcel1.writeNoException();
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau7 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zzb(zzau7, ((Uri) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau8 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = (Asset)Asset.CREATOR.createFromParcel(parcel);
                }
                zza(zzau8, ((Asset) (obj)));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzc(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzd(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 43: // '+'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 46: // '.'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzd(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 47: // '/'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zze(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau9 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = (AddListenerRequest)AddListenerRequest.CREATOR.createFromParcel(parcel);
                }
                zza(zzau9, ((AddListenerRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau10 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = (RemoveListenerRequest)RemoveListenerRequest.CREATOR.createFromParcel(parcel);
                }
                zza(zzau10, ((RemoveListenerRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zze(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzf(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzg(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzh(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau11 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                }
                zza(zzau11, ((AncsNotificationParcelable) (obj)));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzc(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzi(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzf(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), zzat.zza.zzdX(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), zzat.zza.zzdX(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau12 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                String s = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                }
                zza(zzau12, s, ((ParcelFileDescriptor) (obj)));
                parcel1.writeNoException();
                return true;

            case 39: // '\''
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau13 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                String s1 = parcel.readString();
                ParcelFileDescriptor parcelfiledescriptor;
                if (parcel.readInt() != 0)
                {
                    parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcelfiledescriptor = null;
                }
                zza(zzau13, s1, parcelfiledescriptor, parcel.readLong(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzj(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 48: // '0'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zza(zzau, flag);
                parcel1.writeNoException();
                return true;

            case 49: // '1'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzk(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 50: // '2'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau1 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                zzb(zzau1, flag);
                parcel1.writeNoException();
                return true;

            case 51: // '3'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzl(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 52: // '4'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzm(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 53: // '5'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()), parcel.readByte());
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzau zzau14 = com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder());
                ConnectionConfiguration connectionconfiguration = obj11;
                if (parcel.readInt() != 0)
                {
                    connectionconfiguration = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                }
                zzb(zzau14, connectionconfiguration);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzn(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzo(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzp(com.google.android.gms.wearable.internal.zzau.zza.zzdY(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzaw
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zza(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zza(zzau zzau1, byte byte0)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeByte(byte0);
            zznI.transact(53, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zza(zzau zzau1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeInt(i);
            zznI.transact(43, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zza(zzau zzau1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            zznI.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, Uri uri, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i);
            zznI.transact(40, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, Asset asset)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (asset == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            asset.writeToParcel(parcel, 0);
_L6:
            zznI.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, ConnectionConfiguration connectionconfiguration)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            connectionconfiguration.writeToParcel(parcel, 0);
_L6:
            zznI.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, PutDataRequest putdatarequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (putdatarequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            putdatarequest.writeToParcel(parcel, 0);
_L6:
            zznI.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, AddListenerRequest addlistenerrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (addlistenerrequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            addlistenerrequest.writeToParcel(parcel, 0);
_L6:
            zznI.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, AncsNotificationParcelable ancsnotificationparcelable)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (ancsnotificationparcelable == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ancsnotificationparcelable.writeToParcel(parcel, 0);
_L6:
            zznI.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, RemoveListenerRequest removelistenerrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (removelistenerrequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            removelistenerrequest.writeToParcel(parcel, 0);
_L6:
            zznI.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, zzat zzat1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zzau1 = obj;
            if (zzat1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            zzau1 = zzat1.asBinder();
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            zznI.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zza(zzau zzau1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            zznI.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zza(zzau zzau1, String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            parcel.writeInt(i);
            zznI.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zza(zzau zzau1, String s, ParcelFileDescriptor parcelfiledescriptor)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
            zznI.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, String s, ParcelFileDescriptor parcelfiledescriptor, long l, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
            parcel.writeLong(l);
            parcel.writeLong(l1);
            zznI.transact(39, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zza(zzau zzau1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznI.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zza(zzau zzau1, String s, String s1, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            zznI.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zza(zzau zzau1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznI.transact(48, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzb(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzb(zzau zzau1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeInt(i);
            zznI.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzb(zzau zzau1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            zznI.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zzb(zzau zzau1, Uri uri, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i);
            zznI.transact(41, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zzb(zzau zzau1, ConnectionConfiguration connectionconfiguration)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            connectionconfiguration.writeToParcel(parcel, 0);
_L6:
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zzb(zzau zzau1, zzat zzat1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zzau1 = obj;
            if (zzat1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            zzau1 = zzat1.asBinder();
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            zznI.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzb(zzau zzau1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            zznI.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzb(zzau zzau1, String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            parcel.writeInt(i);
            zznI.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzb(zzau zzau1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznI.transact(50, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzc(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzc(zzau zzau1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeInt(i);
            zznI.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzc(zzau zzau1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null) goto _L2; else goto _L1
_L1:
            zzau1 = zzau1.asBinder();
_L5:
            parcel.writeStrongBinder(zzau1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            zznI.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzau1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
              goto _L5
        }

        public void zzc(zzau zzau1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            zznI.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzd(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzd(zzau zzau1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            zznI.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zze(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zze(zzau zzau1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            zznI.transact(47, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzf(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzf(zzau zzau1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            parcel.writeString(s);
            zznI.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzg(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzh(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzi(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzj(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzk(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(49, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzl(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(51, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzm(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(52, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzn(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzo(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        public void zzp(zzau zzau1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzau1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzau1 = zzau1.asBinder();
_L1:
            parcel.writeStrongBinder(zzau1);
            zznI.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzau1 = null;
              goto _L1
            zzau1;
            parcel1.recycle();
            parcel.recycle();
            throw zzau1;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zza(zzau zzau)
        throws RemoteException;

    public abstract void zza(zzau zzau, byte byte0)
        throws RemoteException;

    public abstract void zza(zzau zzau, int i)
        throws RemoteException;

    public abstract void zza(zzau zzau, Uri uri)
        throws RemoteException;

    public abstract void zza(zzau zzau, Uri uri, int i)
        throws RemoteException;

    public abstract void zza(zzau zzau, Asset asset)
        throws RemoteException;

    public abstract void zza(zzau zzau, ConnectionConfiguration connectionconfiguration)
        throws RemoteException;

    public abstract void zza(zzau zzau, PutDataRequest putdatarequest)
        throws RemoteException;

    public abstract void zza(zzau zzau, AddListenerRequest addlistenerrequest)
        throws RemoteException;

    public abstract void zza(zzau zzau, AncsNotificationParcelable ancsnotificationparcelable)
        throws RemoteException;

    public abstract void zza(zzau zzau, RemoveListenerRequest removelistenerrequest)
        throws RemoteException;

    public abstract void zza(zzau zzau, zzat zzat, String s)
        throws RemoteException;

    public abstract void zza(zzau zzau, String s)
        throws RemoteException;

    public abstract void zza(zzau zzau, String s, int i)
        throws RemoteException;

    public abstract void zza(zzau zzau, String s, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException;

    public abstract void zza(zzau zzau, String s, ParcelFileDescriptor parcelfiledescriptor, long l, long l1)
        throws RemoteException;

    public abstract void zza(zzau zzau, String s, String s1)
        throws RemoteException;

    public abstract void zza(zzau zzau, String s, String s1, byte abyte0[])
        throws RemoteException;

    public abstract void zza(zzau zzau, boolean flag)
        throws RemoteException;

    public abstract void zzb(zzau zzau)
        throws RemoteException;

    public abstract void zzb(zzau zzau, int i)
        throws RemoteException;

    public abstract void zzb(zzau zzau, Uri uri)
        throws RemoteException;

    public abstract void zzb(zzau zzau, Uri uri, int i)
        throws RemoteException;

    public abstract void zzb(zzau zzau, ConnectionConfiguration connectionconfiguration)
        throws RemoteException;

    public abstract void zzb(zzau zzau, zzat zzat, String s)
        throws RemoteException;

    public abstract void zzb(zzau zzau, String s)
        throws RemoteException;

    public abstract void zzb(zzau zzau, String s, int i)
        throws RemoteException;

    public abstract void zzb(zzau zzau, boolean flag)
        throws RemoteException;

    public abstract void zzc(zzau zzau)
        throws RemoteException;

    public abstract void zzc(zzau zzau, int i)
        throws RemoteException;

    public abstract void zzc(zzau zzau, Uri uri)
        throws RemoteException;

    public abstract void zzc(zzau zzau, String s)
        throws RemoteException;

    public abstract void zzd(zzau zzau)
        throws RemoteException;

    public abstract void zzd(zzau zzau, String s)
        throws RemoteException;

    public abstract void zze(zzau zzau)
        throws RemoteException;

    public abstract void zze(zzau zzau, String s)
        throws RemoteException;

    public abstract void zzf(zzau zzau)
        throws RemoteException;

    public abstract void zzf(zzau zzau, String s)
        throws RemoteException;

    public abstract void zzg(zzau zzau)
        throws RemoteException;

    public abstract void zzh(zzau zzau)
        throws RemoteException;

    public abstract void zzi(zzau zzau)
        throws RemoteException;

    public abstract void zzj(zzau zzau)
        throws RemoteException;

    public abstract void zzk(zzau zzau)
        throws RemoteException;

    public abstract void zzl(zzau zzau)
        throws RemoteException;

    public abstract void zzm(zzau zzau)
        throws RemoteException;

    public abstract void zzn(zzau zzau)
        throws RemoteException;

    public abstract void zzo(zzau zzau)
        throws RemoteException;

    public abstract void zzp(zzau zzau)
        throws RemoteException;
}
