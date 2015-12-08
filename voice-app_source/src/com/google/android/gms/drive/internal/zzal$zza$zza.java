// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.zzm;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzal, GetPermissionsResponse, OnChangesResponse, OnContentsResponse, 
//            OnDeviceUsagePreferenceResponse, OnDownloadProgressResponse, OnDriveIdResponse, OnDrivePreferencesResponse, 
//            OnFetchThumbnailResponse, OnListEntriesResponse, OnListParentsResponse, OnLoadRealtimeResponse, 
//            OnMetadataResponse, OnResourceIdSetResponse, OnSyncMoreResponse

private static class zznF
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

    ponse(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
