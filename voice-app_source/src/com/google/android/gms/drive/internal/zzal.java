// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.zzm;

// Referenced classes of package com.google.android.gms.drive.internal:
//            GetPermissionsResponse, OnChangesResponse, OnContentsResponse, OnDeviceUsagePreferenceResponse, 
//            OnDownloadProgressResponse, OnDriveIdResponse, OnDrivePreferencesResponse, OnFetchThumbnailResponse, 
//            OnListEntriesResponse, OnListParentsResponse, OnLoadRealtimeResponse, OnMetadataResponse, 
//            OnResourceIdSetResponse, OnSyncMoreResponse

public interface zzal
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzal
    {

        public static zzal zzaP(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (iinterface != null && (iinterface instanceof zzal))
            {
                return (zzal)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                if (parcel.readInt() != 0)
                {
                    obj = (OnDownloadProgressResponse)OnDownloadProgressResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnDownloadProgressResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (OnListEntriesResponse)OnListEntriesResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnListEntriesResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (OnDriveIdResponse)OnDriveIdResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnDriveIdResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (OnMetadataResponse)OnMetadataResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnMetadataResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (OnContentsResponse)OnContentsResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnContentsResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (Status)Status.CREATOR.createFromParcel(parcel);
                }
                zzt(((Status) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                onSuccess();
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (OnListParentsResponse)OnListParentsResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnListParentsResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = (OnSyncMoreResponse)OnSyncMoreResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnSyncMoreResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = (OnLoadRealtimeResponse)OnLoadRealtimeResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnLoadRealtimeResponse) (obj)), com.google.android.gms.drive.realtime.internal.zzm.zza.zzbc(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = (OnResourceIdSetResponse)OnResourceIdSetResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnResourceIdSetResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = (OnDrivePreferencesResponse)OnDrivePreferencesResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnDrivePreferencesResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj11;
                if (parcel.readInt() != 0)
                {
                    obj = (OnDeviceUsagePreferenceResponse)OnDeviceUsagePreferenceResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnDeviceUsagePreferenceResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                boolean flag;
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzW(flag);
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj12;
                if (parcel.readInt() != 0)
                {
                    obj = (OnFetchThumbnailResponse)OnFetchThumbnailResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnFetchThumbnailResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj13;
                if (parcel.readInt() != 0)
                {
                    obj = (ChangeSequenceNumber)ChangeSequenceNumber.CREATOR.createFromParcel(parcel);
                }
                zza(((ChangeSequenceNumber) (obj)));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj14;
                if (parcel.readInt() != 0)
                {
                    obj = (OnChangesResponse)OnChangesResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OnChangesResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj15;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (GetPermissionsResponse)GetPermissionsResponse.CREATOR.createFromParcel(parcel);
            }
            zza(((GetPermissionsResponse) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        }
    }

    private static class zza.zza
        implements zzal
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void onSuccess()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            zznF.transact(7, parcel, parcel1, 0);
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

        public void zzW(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(15, parcel, parcel1, 0);
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

        public void zza(ChangeSequenceNumber changesequencenumber)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (changesequencenumber == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            changesequencenumber.writeToParcel(parcel, 0);
_L1:
            zznF.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            changesequencenumber;
            parcel1.recycle();
            parcel.recycle();
            throw changesequencenumber;
        }

        public void zza(GetPermissionsResponse getpermissionsresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (getpermissionsresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getpermissionsresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getpermissionsresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getpermissionsresponse;
        }

        public void zza(OnChangesResponse onchangesresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onchangesresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onchangesresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onchangesresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onchangesresponse;
        }

        public void zza(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (oncontentsresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            oncontentsresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            oncontentsresponse;
            parcel1.recycle();
            parcel.recycle();
            throw oncontentsresponse;
        }

        public void zza(OnDeviceUsagePreferenceResponse ondeviceusagepreferenceresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (ondeviceusagepreferenceresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            ondeviceusagepreferenceresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ondeviceusagepreferenceresponse;
            parcel1.recycle();
            parcel.recycle();
            throw ondeviceusagepreferenceresponse;
        }

        public void zza(OnDownloadProgressResponse ondownloadprogressresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (ondownloadprogressresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            ondownloadprogressresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ondownloadprogressresponse;
            parcel1.recycle();
            parcel.recycle();
            throw ondownloadprogressresponse;
        }

        public void zza(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (ondriveidresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            ondriveidresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ondriveidresponse;
            parcel1.recycle();
            parcel.recycle();
            throw ondriveidresponse;
        }

        public void zza(OnDrivePreferencesResponse ondrivepreferencesresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (ondrivepreferencesresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            ondrivepreferencesresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ondrivepreferencesresponse;
            parcel1.recycle();
            parcel.recycle();
            throw ondrivepreferencesresponse;
        }

        public void zza(OnFetchThumbnailResponse onfetchthumbnailresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onfetchthumbnailresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onfetchthumbnailresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onfetchthumbnailresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onfetchthumbnailresponse;
        }

        public void zza(OnListEntriesResponse onlistentriesresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onlistentriesresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            onlistentriesresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onlistentriesresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onlistentriesresponse;
        }

        public void zza(OnListParentsResponse onlistparentsresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onlistparentsresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onlistparentsresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onlistparentsresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onlistparentsresponse;
        }

        public void zza(OnLoadRealtimeResponse onloadrealtimeresponse, zzm zzm1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onloadrealtimeresponse == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            onloadrealtimeresponse.writeToParcel(parcel, 0);
_L3:
            if (zzm1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            onloadrealtimeresponse = zzm1.asBinder();
_L4:
            parcel.writeStrongBinder(onloadrealtimeresponse);
            zznF.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            onloadrealtimeresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onloadrealtimeresponse;
            onloadrealtimeresponse = null;
              goto _L4
        }

        public void zza(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onmetadataresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            onmetadataresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onmetadataresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onmetadataresponse;
        }

        public void zza(OnResourceIdSetResponse onresourceidsetresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onresourceidsetresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onresourceidsetresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onresourceidsetresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onresourceidsetresponse;
        }

        public void zza(OnSyncMoreResponse onsyncmoreresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onsyncmoreresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onsyncmoreresponse.writeToParcel(parcel, 0);
_L1:
            zznF.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onsyncmoreresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onsyncmoreresponse;
        }

        public void zzt(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            zznF.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void onSuccess()
        throws RemoteException;

    public abstract void zzW(boolean flag)
        throws RemoteException;

    public abstract void zza(ChangeSequenceNumber changesequencenumber)
        throws RemoteException;

    public abstract void zza(GetPermissionsResponse getpermissionsresponse)
        throws RemoteException;

    public abstract void zza(OnChangesResponse onchangesresponse)
        throws RemoteException;

    public abstract void zza(OnContentsResponse oncontentsresponse)
        throws RemoteException;

    public abstract void zza(OnDeviceUsagePreferenceResponse ondeviceusagepreferenceresponse)
        throws RemoteException;

    public abstract void zza(OnDownloadProgressResponse ondownloadprogressresponse)
        throws RemoteException;

    public abstract void zza(OnDriveIdResponse ondriveidresponse)
        throws RemoteException;

    public abstract void zza(OnDrivePreferencesResponse ondrivepreferencesresponse)
        throws RemoteException;

    public abstract void zza(OnFetchThumbnailResponse onfetchthumbnailresponse)
        throws RemoteException;

    public abstract void zza(OnListEntriesResponse onlistentriesresponse)
        throws RemoteException;

    public abstract void zza(OnListParentsResponse onlistparentsresponse)
        throws RemoteException;

    public abstract void zza(OnLoadRealtimeResponse onloadrealtimeresponse, zzm zzm)
        throws RemoteException;

    public abstract void zza(OnMetadataResponse onmetadataresponse)
        throws RemoteException;

    public abstract void zza(OnResourceIdSetResponse onresourceidsetresponse)
        throws RemoteException;

    public abstract void zza(OnSyncMoreResponse onsyncmoreresponse)
        throws RemoteException;

    public abstract void zzt(Status status)
        throws RemoteException;
}
