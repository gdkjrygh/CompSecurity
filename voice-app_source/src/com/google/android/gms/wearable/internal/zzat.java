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
//            zzar, AddListenerRequest, AncsNotificationParcelable, RemoveListenerRequest, 
//            zzaq

public interface zzat
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzat
    {

        public static zzat zzdQ(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            if (iinterface != null && (iinterface instanceof zzat))
            {
                return (zzat)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag = false;
            zzar zzar15 = null;
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
                zzar15 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                }
                zza(zzar15, ((ConnectionConfiguration) (obj)));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzc(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar2 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = zzar15;
                if (parcel.readInt() != 0)
                {
                    obj = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(parcel);
                }
                zza(zzar2, ((PutDataRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar3 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zza(zzar3, ((Uri) (obj)));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar4 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zzb(zzar4, ((Uri) (obj)));
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar5 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zza(zzar5, ((Uri) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar6 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zzc(zzar6, ((Uri) (obj)));
                parcel1.writeNoException();
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar7 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                zzb(zzar7, ((Uri) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar8 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = (Asset)Asset.CREATOR.createFromParcel(parcel);
                }
                zza(zzar8, ((Asset) (obj)));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzc(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzd(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 43: // '+'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 46: // '.'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzd(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 47: // '/'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zze(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar9 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = (AddListenerRequest)AddListenerRequest.CREATOR.createFromParcel(parcel);
                }
                zza(zzar9, ((AddListenerRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar10 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = (RemoveListenerRequest)RemoveListenerRequest.CREATOR.createFromParcel(parcel);
                }
                zza(zzar10, ((RemoveListenerRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zze(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzf(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzg(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzh(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar11 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                }
                zza(zzar11, ((AncsNotificationParcelable) (obj)));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzc(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzi(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzf(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), zzaq.zza.zzdN(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()), zzaq.zza.zzdN(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar12 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                String s = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                }
                zza(zzar12, s, ((ParcelFileDescriptor) (obj)));
                parcel1.writeNoException();
                return true;

            case 39: // '\''
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar13 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                String s1 = parcel.readString();
                ParcelFileDescriptor parcelfiledescriptor;
                if (parcel.readInt() != 0)
                {
                    parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcelfiledescriptor = null;
                }
                zza(zzar13, s1, parcelfiledescriptor, parcel.readLong(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzj(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 48: // '0'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zza(zzar, flag);
                parcel1.writeNoException();
                return true;

            case 49: // '1'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzk(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 50: // '2'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar1 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                zzb(zzar1, flag);
                parcel1.writeNoException();
                return true;

            case 51: // '3'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzl(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzar zzar14 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder());
                ConnectionConfiguration connectionconfiguration = obj11;
                if (parcel.readInt() != 0)
                {
                    connectionconfiguration = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                }
                zzb(zzar14, connectionconfiguration);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzm(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzn(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzo(com.google.android.gms.wearable.internal.zzar.zza.zzdO(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzat
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zza(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zza(zzar zzar1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeInt(i);
            zznF.transact(43, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zza(zzar zzar1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            zznF.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, Uri uri, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i);
            zznF.transact(40, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, Asset asset)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (asset == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            asset.writeToParcel(parcel, 0);
_L6:
            zznF.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, ConnectionConfiguration connectionconfiguration)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            connectionconfiguration.writeToParcel(parcel, 0);
_L6:
            zznF.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, PutDataRequest putdatarequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (putdatarequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            putdatarequest.writeToParcel(parcel, 0);
_L6:
            zznF.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, AddListenerRequest addlistenerrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (addlistenerrequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            addlistenerrequest.writeToParcel(parcel, 0);
_L6:
            zznF.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, AncsNotificationParcelable ancsnotificationparcelable)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (ancsnotificationparcelable == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ancsnotificationparcelable.writeToParcel(parcel, 0);
_L6:
            zznF.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, RemoveListenerRequest removelistenerrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (removelistenerrequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            removelistenerrequest.writeToParcel(parcel, 0);
_L6:
            zznF.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, zzaq zzaq1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zzar1 = obj;
            if (zzaq1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            zzar1 = zzaq1.asBinder();
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            zznF.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zza(zzar zzar1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            zznF.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zza(zzar zzar1, String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zza(zzar zzar1, String s, ParcelFileDescriptor parcelfiledescriptor)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
            zznF.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, String s, ParcelFileDescriptor parcelfiledescriptor, long l, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
            parcel.writeLong(l);
            parcel.writeLong(l1);
            zznF.transact(39, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zza(zzar zzar1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zza(zzar zzar1, String s, String s1, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            zznF.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zza(zzar zzar1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(48, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzb(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzb(zzar zzar1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeInt(i);
            zznF.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzb(zzar zzar1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            zznF.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zzb(zzar zzar1, Uri uri, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i);
            zznF.transact(41, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zzb(zzar zzar1, ConnectionConfiguration connectionconfiguration)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            connectionconfiguration.writeToParcel(parcel, 0);
_L6:
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zzb(zzar zzar1, zzaq zzaq1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zzar1 = obj;
            if (zzaq1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            zzar1 = zzaq1.asBinder();
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            zznF.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzb(zzar zzar1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            zznF.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzb(zzar zzar1, String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzb(zzar zzar1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(50, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzc(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzc(zzar zzar1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeInt(i);
            zznF.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzc(zzar zzar1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null) goto _L2; else goto _L1
_L1:
            zzar1 = zzar1.asBinder();
_L5:
            parcel.writeStrongBinder(zzar1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            zznF.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzar1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
              goto _L5
        }

        public void zzc(zzar zzar1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            zznF.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzd(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzd(zzar zzar1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            zznF.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zze(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zze(zzar zzar1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            zznF.transact(47, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzf(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzf(zzar zzar1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            parcel.writeString(s);
            zznF.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzg(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzh(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzi(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzj(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzk(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(49, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzl(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(51, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzm(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzn(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        public void zzo(zzar zzar1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (zzar1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzar1 = zzar1.asBinder();
_L1:
            parcel.writeStrongBinder(zzar1);
            zznF.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzar1 = null;
              goto _L1
            zzar1;
            parcel1.recycle();
            parcel.recycle();
            throw zzar1;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zza(zzar zzar)
        throws RemoteException;

    public abstract void zza(zzar zzar, int i)
        throws RemoteException;

    public abstract void zza(zzar zzar, Uri uri)
        throws RemoteException;

    public abstract void zza(zzar zzar, Uri uri, int i)
        throws RemoteException;

    public abstract void zza(zzar zzar, Asset asset)
        throws RemoteException;

    public abstract void zza(zzar zzar, ConnectionConfiguration connectionconfiguration)
        throws RemoteException;

    public abstract void zza(zzar zzar, PutDataRequest putdatarequest)
        throws RemoteException;

    public abstract void zza(zzar zzar, AddListenerRequest addlistenerrequest)
        throws RemoteException;

    public abstract void zza(zzar zzar, AncsNotificationParcelable ancsnotificationparcelable)
        throws RemoteException;

    public abstract void zza(zzar zzar, RemoveListenerRequest removelistenerrequest)
        throws RemoteException;

    public abstract void zza(zzar zzar, zzaq zzaq, String s)
        throws RemoteException;

    public abstract void zza(zzar zzar, String s)
        throws RemoteException;

    public abstract void zza(zzar zzar, String s, int i)
        throws RemoteException;

    public abstract void zza(zzar zzar, String s, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException;

    public abstract void zza(zzar zzar, String s, ParcelFileDescriptor parcelfiledescriptor, long l, long l1)
        throws RemoteException;

    public abstract void zza(zzar zzar, String s, String s1)
        throws RemoteException;

    public abstract void zza(zzar zzar, String s, String s1, byte abyte0[])
        throws RemoteException;

    public abstract void zza(zzar zzar, boolean flag)
        throws RemoteException;

    public abstract void zzb(zzar zzar)
        throws RemoteException;

    public abstract void zzb(zzar zzar, int i)
        throws RemoteException;

    public abstract void zzb(zzar zzar, Uri uri)
        throws RemoteException;

    public abstract void zzb(zzar zzar, Uri uri, int i)
        throws RemoteException;

    public abstract void zzb(zzar zzar, ConnectionConfiguration connectionconfiguration)
        throws RemoteException;

    public abstract void zzb(zzar zzar, zzaq zzaq, String s)
        throws RemoteException;

    public abstract void zzb(zzar zzar, String s)
        throws RemoteException;

    public abstract void zzb(zzar zzar, String s, int i)
        throws RemoteException;

    public abstract void zzb(zzar zzar, boolean flag)
        throws RemoteException;

    public abstract void zzc(zzar zzar)
        throws RemoteException;

    public abstract void zzc(zzar zzar, int i)
        throws RemoteException;

    public abstract void zzc(zzar zzar, Uri uri)
        throws RemoteException;

    public abstract void zzc(zzar zzar, String s)
        throws RemoteException;

    public abstract void zzd(zzar zzar)
        throws RemoteException;

    public abstract void zzd(zzar zzar, String s)
        throws RemoteException;

    public abstract void zze(zzar zzar)
        throws RemoteException;

    public abstract void zze(zzar zzar, String s)
        throws RemoteException;

    public abstract void zzf(zzar zzar)
        throws RemoteException;

    public abstract void zzf(zzar zzar, String s)
        throws RemoteException;

    public abstract void zzg(zzar zzar)
        throws RemoteException;

    public abstract void zzh(zzar zzar)
        throws RemoteException;

    public abstract void zzi(zzar zzar)
        throws RemoteException;

    public abstract void zzj(zzar zzar)
        throws RemoteException;

    public abstract void zzk(zzar zzar)
        throws RemoteException;

    public abstract void zzl(zzar zzar)
        throws RemoteException;

    public abstract void zzm(zzar zzar)
        throws RemoteException;

    public abstract void zzn(zzar zzar)
        throws RemoteException;

    public abstract void zzo(zzar zzar)
        throws RemoteException;
}
