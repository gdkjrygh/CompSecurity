// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzak, GetMetadataRequest, QueryRequest, UpdateMetadataRequest, 
//            CreateContentsRequest, CreateFileRequest, CreateFolderRequest, OpenContentsRequest, 
//            DriveServiceResponse, CloseContentsRequest, OpenFileIntentSenderRequest, CreateFileIntentSenderRequest, 
//            AuthorizeAccessRequest, ListParentsRequest, AddEventListenerRequest, RemoveEventListenerRequest, 
//            DisconnectRequest, TrashResourceRequest, CloseContentsAndUpdateMetadataRequest, DeleteResourceRequest, 
//            LoadRealtimeRequest, SetResourceParentsRequest, GetDriveIdFromUniqueIdentifierRequest, CheckResourceIdsExistRequest, 
//            SetDrivePreferencesRequest, SetFileUploadPreferencesRequest, CancelPendingActionsRequest, UntrashResourceRequest, 
//            FetchThumbnailRequest, GetChangesRequest, UnsubscribeResourceRequest, GetPermissionsRequest, 
//            AddPermissionRequest, UpdatePermissionRequest, RemovePermissionRequest, zzal, 
//            zzam

public static abstract class zza.zznF extends Binder
    implements zzak
{
    private static class zza
        implements zzak
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public IntentSender zza(CreateFileIntentSenderRequest createfileintentsenderrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (createfileintentsenderrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createfileintentsenderrequest.writeToParcel(parcel, 0);
_L3:
            zznF.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            createfileintentsenderrequest = (IntentSender)IntentSender.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return createfileintentsenderrequest;
_L2:
            parcel.writeInt(0);
              goto _L3
            createfileintentsenderrequest;
            parcel1.recycle();
            parcel.recycle();
            throw createfileintentsenderrequest;
            createfileintentsenderrequest = null;
              goto _L4
        }

        public IntentSender zza(OpenFileIntentSenderRequest openfileintentsenderrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (openfileintentsenderrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            openfileintentsenderrequest.writeToParcel(parcel, 0);
_L3:
            zznF.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            openfileintentsenderrequest = (IntentSender)IntentSender.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return openfileintentsenderrequest;
_L2:
            parcel.writeInt(0);
              goto _L3
            openfileintentsenderrequest;
            parcel1.recycle();
            parcel.recycle();
            throw openfileintentsenderrequest;
            openfileintentsenderrequest = null;
              goto _L4
        }

        public DriveServiceResponse zza(OpenContentsRequest opencontentsrequest, zzal zzal1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (opencontentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            opencontentsrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_133;
            }
            opencontentsrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(opencontentsrequest);
            zznF.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            opencontentsrequest = obj;
            if (parcel1.readInt() != 0)
            {
                opencontentsrequest = (DriveServiceResponse)DriveServiceResponse.CREATOR.createFromParcel(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return opencontentsrequest;
_L2:
            parcel.writeInt(0);
              goto _L3
            opencontentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw opencontentsrequest;
            opencontentsrequest = null;
              goto _L4
        }

        public void zza(RealtimeDocumentSyncRequest realtimedocumentsyncrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (realtimedocumentsyncrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            realtimedocumentsyncrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            realtimedocumentsyncrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(realtimedocumentsyncrequest);
            zznF.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            realtimedocumentsyncrequest;
            parcel1.recycle();
            parcel.recycle();
            throw realtimedocumentsyncrequest;
            realtimedocumentsyncrequest = null;
              goto _L4
        }

        public void zza(AddEventListenerRequest addeventlistenerrequest, zzam zzam1, String s, zzal zzal1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (addeventlistenerrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            addeventlistenerrequest.writeToParcel(parcel, 0);
_L3:
            if (zzam1 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            addeventlistenerrequest = zzam1.asBinder();
_L4:
            parcel.writeStrongBinder(addeventlistenerrequest);
            parcel.writeString(s);
            addeventlistenerrequest = obj;
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            addeventlistenerrequest = zzal1.asBinder();
            parcel.writeStrongBinder(addeventlistenerrequest);
            zznF.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            addeventlistenerrequest;
            parcel1.recycle();
            parcel.recycle();
            throw addeventlistenerrequest;
            addeventlistenerrequest = null;
              goto _L4
        }

        public void zza(AddPermissionRequest addpermissionrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (addpermissionrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            addpermissionrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            addpermissionrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(addpermissionrequest);
            zznF.transact(48, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            addpermissionrequest;
            parcel1.recycle();
            parcel.recycle();
            throw addpermissionrequest;
            addpermissionrequest = null;
              goto _L4
        }

        public void zza(AuthorizeAccessRequest authorizeaccessrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (authorizeaccessrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            authorizeaccessrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            authorizeaccessrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(authorizeaccessrequest);
            zznF.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            authorizeaccessrequest;
            parcel1.recycle();
            parcel.recycle();
            throw authorizeaccessrequest;
            authorizeaccessrequest = null;
              goto _L4
        }

        public void zza(CancelPendingActionsRequest cancelpendingactionsrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (cancelpendingactionsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            cancelpendingactionsrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            cancelpendingactionsrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(cancelpendingactionsrequest);
            zznF.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            cancelpendingactionsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw cancelpendingactionsrequest;
            cancelpendingactionsrequest = null;
              goto _L4
        }

        public void zza(CheckResourceIdsExistRequest checkresourceidsexistrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (checkresourceidsexistrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            checkresourceidsexistrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            checkresourceidsexistrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(checkresourceidsexistrequest);
            zznF.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            checkresourceidsexistrequest;
            parcel1.recycle();
            parcel.recycle();
            throw checkresourceidsexistrequest;
            checkresourceidsexistrequest = null;
              goto _L4
        }

        public void zza(CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (closecontentsandupdatemetadatarequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            closecontentsandupdatemetadatarequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            closecontentsandupdatemetadatarequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(closecontentsandupdatemetadatarequest);
            zznF.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            closecontentsandupdatemetadatarequest;
            parcel1.recycle();
            parcel.recycle();
            throw closecontentsandupdatemetadatarequest;
            closecontentsandupdatemetadatarequest = null;
              goto _L4
        }

        public void zza(CloseContentsRequest closecontentsrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (closecontentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            closecontentsrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            closecontentsrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(closecontentsrequest);
            zznF.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            closecontentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw closecontentsrequest;
            closecontentsrequest = null;
              goto _L4
        }

        public void zza(CreateContentsRequest createcontentsrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (createcontentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createcontentsrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            createcontentsrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(createcontentsrequest);
            zznF.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            createcontentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw createcontentsrequest;
            createcontentsrequest = null;
              goto _L4
        }

        public void zza(CreateFileRequest createfilerequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (createfilerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createfilerequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            createfilerequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(createfilerequest);
            zznF.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            createfilerequest;
            parcel1.recycle();
            parcel.recycle();
            throw createfilerequest;
            createfilerequest = null;
              goto _L4
        }

        public void zza(CreateFolderRequest createfolderrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (createfolderrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createfolderrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            createfolderrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(createfolderrequest);
            zznF.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            createfolderrequest;
            parcel1.recycle();
            parcel.recycle();
            throw createfolderrequest;
            createfolderrequest = null;
              goto _L4
        }

        public void zza(DeleteResourceRequest deleteresourcerequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (deleteresourcerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            deleteresourcerequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            deleteresourcerequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(deleteresourcerequest);
            zznF.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            deleteresourcerequest;
            parcel1.recycle();
            parcel.recycle();
            throw deleteresourcerequest;
            deleteresourcerequest = null;
              goto _L4
        }

        public void zza(DisconnectRequest disconnectrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (disconnectrequest == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            disconnectrequest.writeToParcel(parcel, 0);
_L1:
            zznF.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            disconnectrequest;
            parcel1.recycle();
            parcel.recycle();
            throw disconnectrequest;
        }

        public void zza(FetchThumbnailRequest fetchthumbnailrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (fetchthumbnailrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            fetchthumbnailrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            fetchthumbnailrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(fetchthumbnailrequest);
            zznF.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            fetchthumbnailrequest;
            parcel1.recycle();
            parcel.recycle();
            throw fetchthumbnailrequest;
            fetchthumbnailrequest = null;
              goto _L4
        }

        public void zza(GetChangesRequest getchangesrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (getchangesrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getchangesrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            getchangesrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(getchangesrequest);
            zznF.transact(44, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getchangesrequest;
            parcel1.recycle();
            parcel.recycle();
            throw getchangesrequest;
            getchangesrequest = null;
              goto _L4
        }

        public void zza(GetDriveIdFromUniqueIdentifierRequest getdriveidfromuniqueidentifierrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (getdriveidfromuniqueidentifierrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getdriveidfromuniqueidentifierrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            getdriveidfromuniqueidentifierrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(getdriveidfromuniqueidentifierrequest);
            zznF.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getdriveidfromuniqueidentifierrequest;
            parcel1.recycle();
            parcel.recycle();
            throw getdriveidfromuniqueidentifierrequest;
            getdriveidfromuniqueidentifierrequest = null;
              goto _L4
        }

        public void zza(GetMetadataRequest getmetadatarequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (getmetadatarequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getmetadatarequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            getmetadatarequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(getmetadatarequest);
            zznF.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getmetadatarequest;
            parcel1.recycle();
            parcel.recycle();
            throw getmetadatarequest;
            getmetadatarequest = null;
              goto _L4
        }

        public void zza(GetPermissionsRequest getpermissionsrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (getpermissionsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getpermissionsrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            getpermissionsrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(getpermissionsrequest);
            zznF.transact(47, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getpermissionsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw getpermissionsrequest;
            getpermissionsrequest = null;
              goto _L4
        }

        public void zza(ListParentsRequest listparentsrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (listparentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            listparentsrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            listparentsrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(listparentsrequest);
            zznF.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            listparentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw listparentsrequest;
            listparentsrequest = null;
              goto _L4
        }

        public void zza(LoadRealtimeRequest loadrealtimerequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (loadrealtimerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            loadrealtimerequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            loadrealtimerequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(loadrealtimerequest);
            zznF.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            loadrealtimerequest;
            parcel1.recycle();
            parcel.recycle();
            throw loadrealtimerequest;
            loadrealtimerequest = null;
              goto _L4
        }

        public void zza(QueryRequest queryrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (queryrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            queryrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            queryrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            queryrequest;
            parcel1.recycle();
            parcel.recycle();
            throw queryrequest;
            queryrequest = null;
              goto _L4
        }

        public void zza(QueryRequest queryrequest, zzam zzam1, zzal zzal1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (queryrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            queryrequest.writeToParcel(parcel, 0);
_L3:
            if (zzam1 == null)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            queryrequest = zzam1.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            queryrequest = obj;
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            queryrequest = zzal1.asBinder();
            parcel.writeStrongBinder(queryrequest);
            zznF.transact(51, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            queryrequest;
            parcel1.recycle();
            parcel.recycle();
            throw queryrequest;
            queryrequest = null;
              goto _L4
        }

        public void zza(RemoveEventListenerRequest removeeventlistenerrequest, zzam zzam1, String s, zzal zzal1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (removeeventlistenerrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            removeeventlistenerrequest.writeToParcel(parcel, 0);
_L3:
            if (zzam1 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            removeeventlistenerrequest = zzam1.asBinder();
_L4:
            parcel.writeStrongBinder(removeeventlistenerrequest);
            parcel.writeString(s);
            removeeventlistenerrequest = obj;
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            removeeventlistenerrequest = zzal1.asBinder();
            parcel.writeStrongBinder(removeeventlistenerrequest);
            zznF.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            removeeventlistenerrequest;
            parcel1.recycle();
            parcel.recycle();
            throw removeeventlistenerrequest;
            removeeventlistenerrequest = null;
              goto _L4
        }

        public void zza(RemovePermissionRequest removepermissionrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (removepermissionrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            removepermissionrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            removepermissionrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(removepermissionrequest);
            zznF.transact(50, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            removepermissionrequest;
            parcel1.recycle();
            parcel.recycle();
            throw removepermissionrequest;
            removepermissionrequest = null;
              goto _L4
        }

        public void zza(SetDrivePreferencesRequest setdrivepreferencesrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (setdrivepreferencesrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            setdrivepreferencesrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setdrivepreferencesrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(setdrivepreferencesrequest);
            zznF.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            setdrivepreferencesrequest;
            parcel1.recycle();
            parcel.recycle();
            throw setdrivepreferencesrequest;
            setdrivepreferencesrequest = null;
              goto _L4
        }

        public void zza(SetFileUploadPreferencesRequest setfileuploadpreferencesrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (setfileuploadpreferencesrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            setfileuploadpreferencesrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setfileuploadpreferencesrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(setfileuploadpreferencesrequest);
            zznF.transact(36, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            setfileuploadpreferencesrequest;
            parcel1.recycle();
            parcel.recycle();
            throw setfileuploadpreferencesrequest;
            setfileuploadpreferencesrequest = null;
              goto _L4
        }

        public void zza(SetResourceParentsRequest setresourceparentsrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (setresourceparentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            setresourceparentsrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setresourceparentsrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(setresourceparentsrequest);
            zznF.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            setresourceparentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw setresourceparentsrequest;
            setresourceparentsrequest = null;
              goto _L4
        }

        public void zza(TrashResourceRequest trashresourcerequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (trashresourcerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            trashresourcerequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            trashresourcerequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(trashresourcerequest);
            zznF.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            trashresourcerequest;
            parcel1.recycle();
            parcel.recycle();
            throw trashresourcerequest;
            trashresourcerequest = null;
              goto _L4
        }

        public void zza(UnsubscribeResourceRequest unsubscriberesourcerequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (unsubscriberesourcerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            unsubscriberesourcerequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            unsubscriberesourcerequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(unsubscriberesourcerequest);
            zznF.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            unsubscriberesourcerequest;
            parcel1.recycle();
            parcel.recycle();
            throw unsubscriberesourcerequest;
            unsubscriberesourcerequest = null;
              goto _L4
        }

        public void zza(UntrashResourceRequest untrashresourcerequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (untrashresourcerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            untrashresourcerequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            untrashresourcerequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(untrashresourcerequest);
            zznF.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            untrashresourcerequest;
            parcel1.recycle();
            parcel.recycle();
            throw untrashresourcerequest;
            untrashresourcerequest = null;
              goto _L4
        }

        public void zza(UpdateMetadataRequest updatemetadatarequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (updatemetadatarequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            updatemetadatarequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            updatemetadatarequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(updatemetadatarequest);
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            updatemetadatarequest;
            parcel1.recycle();
            parcel.recycle();
            throw updatemetadatarequest;
            updatemetadatarequest = null;
              goto _L4
        }

        public void zza(UpdatePermissionRequest updatepermissionrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (updatepermissionrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            updatepermissionrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            updatepermissionrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(updatepermissionrequest);
            zznF.transact(49, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            updatepermissionrequest;
            parcel1.recycle();
            parcel.recycle();
            throw updatepermissionrequest;
            updatepermissionrequest = null;
              goto _L4
        }

        public void zza(zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzal1 = zzal1.asBinder();
_L1:
            parcel.writeStrongBinder(zzal1);
            zznF.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzal1 = null;
              goto _L1
            zzal1;
            parcel1.recycle();
            parcel.recycle();
            throw zzal1;
        }

        public void zza(zzam zzam1, zzal zzal1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (zzam1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            zzam1 = zzam1.asBinder();
_L1:
            parcel.writeStrongBinder(zzam1);
            zzam1 = obj;
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            zzam1 = zzal1.asBinder();
            parcel.writeStrongBinder(zzam1);
            zznF.transact(52, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzam1 = null;
              goto _L1
            zzam1;
            parcel1.recycle();
            parcel.recycle();
            throw zzam1;
        }

        public void zzb(QueryRequest queryrequest, zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (queryrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            queryrequest.writeToParcel(parcel, 0);
_L3:
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            queryrequest = zzal1.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            zznF.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            queryrequest;
            parcel1.recycle();
            parcel.recycle();
            throw queryrequest;
            queryrequest = null;
              goto _L4
        }

        public void zzb(zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzal1 = zzal1.asBinder();
_L1:
            parcel.writeStrongBinder(zzal1);
            zznF.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzal1 = null;
              goto _L1
            zzal1;
            parcel1.recycle();
            parcel.recycle();
            throw zzal1;
        }

        public void zzc(zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzal1 = zzal1.asBinder();
_L1:
            parcel.writeStrongBinder(zzal1);
            zznF.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzal1 = null;
              goto _L1
            zzal1;
            parcel1.recycle();
            parcel.recycle();
            throw zzal1;
        }

        public void zzd(zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzal1 = zzal1.asBinder();
_L1:
            parcel.writeStrongBinder(zzal1);
            zznF.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzal1 = null;
              goto _L1
            zzal1;
            parcel1.recycle();
            parcel.recycle();
            throw zzal1;
        }

        public void zze(zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzal1 = zzal1.asBinder();
_L1:
            parcel.writeStrongBinder(zzal1);
            zznF.transact(41, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzal1 = null;
              goto _L1
            zzal1;
            parcel1.recycle();
            parcel.recycle();
            throw zzal1;
        }

        public void zzf(zzal zzal1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (zzal1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzal1 = zzal1.asBinder();
_L1:
            parcel.writeStrongBinder(zzal1);
            zznF.transact(43, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzal1 = null;
              goto _L1
            zzal1;
            parcel1.recycle();
            parcel.recycle();
            throw zzal1;
        }

        zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public static zzak zzaO(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
        if (iinterface != null && (iinterface instanceof zzak))
        {
            return (zzak)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj = null;
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
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        Object obj27 = null;
        Object obj28 = null;
        Object obj29 = null;
        Object obj30 = null;
        Object obj31 = null;
        Object obj32 = null;
        Object obj33 = null;
        Object obj34 = null;
        GetMetadataRequest getmetadatarequest = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.drive.internal.IDriveService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            if (parcel.readInt() != 0)
            {
                getmetadatarequest = (GetMetadataRequest)GetMetadataRequest.CREATOR.createFromParcel(parcel);
            }
            zza(getmetadatarequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            QueryRequest queryrequest = obj;
            if (parcel.readInt() != 0)
            {
                queryrequest = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
            }
            zza(queryrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            UpdateMetadataRequest updatemetadatarequest = obj1;
            if (parcel.readInt() != 0)
            {
                updatemetadatarequest = (UpdateMetadataRequest)UpdateMetadataRequest.CREATOR.createFromParcel(parcel);
            }
            zza(updatemetadatarequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CreateContentsRequest createcontentsrequest = obj2;
            if (parcel.readInt() != 0)
            {
                createcontentsrequest = (CreateContentsRequest)CreateContentsRequest.CREATOR.createFromParcel(parcel);
            }
            zza(createcontentsrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CreateFileRequest createfilerequest = obj3;
            if (parcel.readInt() != 0)
            {
                createfilerequest = (CreateFileRequest)CreateFileRequest.CREATOR.createFromParcel(parcel);
            }
            zza(createfilerequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CreateFolderRequest createfolderrequest = obj4;
            if (parcel.readInt() != 0)
            {
                createfolderrequest = (CreateFolderRequest)CreateFolderRequest.CREATOR.createFromParcel(parcel);
            }
            zza(createfolderrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            OpenContentsRequest opencontentsrequest = obj5;
            if (parcel.readInt() != 0)
            {
                opencontentsrequest = (OpenContentsRequest)OpenContentsRequest.CREATOR.createFromParcel(parcel);
            }
            parcel = zza(opencontentsrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CloseContentsRequest closecontentsrequest = obj6;
            if (parcel.readInt() != 0)
            {
                closecontentsrequest = (CloseContentsRequest)CloseContentsRequest.CREATOR.createFromParcel(parcel);
            }
            zza(closecontentsrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            zza(zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            OpenFileIntentSenderRequest openfileintentsenderrequest = obj7;
            if (parcel.readInt() != 0)
            {
                openfileintentsenderrequest = (OpenFileIntentSenderRequest)OpenFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
            }
            parcel = zza(openfileintentsenderrequest);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CreateFileIntentSenderRequest createfileintentsenderrequest = obj8;
            if (parcel.readInt() != 0)
            {
                createfileintentsenderrequest = (CreateFileIntentSenderRequest)CreateFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
            }
            parcel = zza(createfileintentsenderrequest);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            AuthorizeAccessRequest authorizeaccessrequest = obj9;
            if (parcel.readInt() != 0)
            {
                authorizeaccessrequest = (AuthorizeAccessRequest)AuthorizeAccessRequest.CREATOR.createFromParcel(parcel);
            }
            zza(authorizeaccessrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            ListParentsRequest listparentsrequest = obj10;
            if (parcel.readInt() != 0)
            {
                listparentsrequest = (ListParentsRequest)ListParentsRequest.CREATOR.createFromParcel(parcel);
            }
            zza(listparentsrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            AddEventListenerRequest addeventlistenerrequest = obj11;
            if (parcel.readInt() != 0)
            {
                addeventlistenerrequest = (AddEventListenerRequest)AddEventListenerRequest.CREATOR.createFromParcel(parcel);
            }
            zza(addeventlistenerrequest, zzaQ(parcel.readStrongBinder()), parcel.readString(), zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            RemoveEventListenerRequest removeeventlistenerrequest = obj12;
            if (parcel.readInt() != 0)
            {
                removeeventlistenerrequest = (RemoveEventListenerRequest)RemoveEventListenerRequest.CREATOR.createFromParcel(parcel);
            }
            zza(removeeventlistenerrequest, zzaQ(parcel.readStrongBinder()), parcel.readString(), zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            DisconnectRequest disconnectrequest = obj13;
            if (parcel.readInt() != 0)
            {
                disconnectrequest = (DisconnectRequest)DisconnectRequest.CREATOR.createFromParcel(parcel);
            }
            zza(disconnectrequest);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            TrashResourceRequest trashresourcerequest = obj14;
            if (parcel.readInt() != 0)
            {
                trashresourcerequest = (TrashResourceRequest)TrashResourceRequest.CREATOR.createFromParcel(parcel);
            }
            zza(trashresourcerequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest = obj15;
            if (parcel.readInt() != 0)
            {
                closecontentsandupdatemetadatarequest = (CloseContentsAndUpdateMetadataRequest)CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(parcel);
            }
            zza(closecontentsandupdatemetadatarequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            QueryRequest queryrequest1 = obj16;
            if (parcel.readInt() != 0)
            {
                queryrequest1 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
            }
            zzb(queryrequest1, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            DeleteResourceRequest deleteresourcerequest = obj17;
            if (parcel.readInt() != 0)
            {
                deleteresourcerequest = (DeleteResourceRequest)DeleteResourceRequest.CREATOR.createFromParcel(parcel);
            }
            zza(deleteresourcerequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            LoadRealtimeRequest loadrealtimerequest = obj18;
            if (parcel.readInt() != 0)
            {
                loadrealtimerequest = (LoadRealtimeRequest)LoadRealtimeRequest.CREATOR.createFromParcel(parcel);
            }
            zza(loadrealtimerequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            SetResourceParentsRequest setresourceparentsrequest = obj19;
            if (parcel.readInt() != 0)
            {
                setresourceparentsrequest = (SetResourceParentsRequest)SetResourceParentsRequest.CREATOR.createFromParcel(parcel);
            }
            zza(setresourceparentsrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            GetDriveIdFromUniqueIdentifierRequest getdriveidfromuniqueidentifierrequest = obj20;
            if (parcel.readInt() != 0)
            {
                getdriveidfromuniqueidentifierrequest = (GetDriveIdFromUniqueIdentifierRequest)GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(parcel);
            }
            zza(getdriveidfromuniqueidentifierrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CheckResourceIdsExistRequest checkresourceidsexistrequest = obj21;
            if (parcel.readInt() != 0)
            {
                checkresourceidsexistrequest = (CheckResourceIdsExistRequest)CheckResourceIdsExistRequest.CREATOR.createFromParcel(parcel);
            }
            zza(checkresourceidsexistrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            zzb(zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            zzc(zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            SetDrivePreferencesRequest setdrivepreferencesrequest = obj22;
            if (parcel.readInt() != 0)
            {
                setdrivepreferencesrequest = (SetDrivePreferencesRequest)SetDrivePreferencesRequest.CREATOR.createFromParcel(parcel);
            }
            zza(setdrivepreferencesrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            RealtimeDocumentSyncRequest realtimedocumentsyncrequest = obj23;
            if (parcel.readInt() != 0)
            {
                realtimedocumentsyncrequest = (RealtimeDocumentSyncRequest)RealtimeDocumentSyncRequest.CREATOR.createFromParcel(parcel);
            }
            zza(realtimedocumentsyncrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            zzd(zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            SetFileUploadPreferencesRequest setfileuploadpreferencesrequest = obj24;
            if (parcel.readInt() != 0)
            {
                setfileuploadpreferencesrequest = (SetFileUploadPreferencesRequest)SetFileUploadPreferencesRequest.CREATOR.createFromParcel(parcel);
            }
            zza(setfileuploadpreferencesrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CancelPendingActionsRequest cancelpendingactionsrequest = obj25;
            if (parcel.readInt() != 0)
            {
                cancelpendingactionsrequest = (CancelPendingActionsRequest)CancelPendingActionsRequest.CREATOR.createFromParcel(parcel);
            }
            zza(cancelpendingactionsrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            UntrashResourceRequest untrashresourcerequest = obj26;
            if (parcel.readInt() != 0)
            {
                untrashresourcerequest = (UntrashResourceRequest)UntrashResourceRequest.CREATOR.createFromParcel(parcel);
            }
            zza(untrashresourcerequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            zze(zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            FetchThumbnailRequest fetchthumbnailrequest = obj27;
            if (parcel.readInt() != 0)
            {
                fetchthumbnailrequest = (FetchThumbnailRequest)FetchThumbnailRequest.CREATOR.createFromParcel(parcel);
            }
            zza(fetchthumbnailrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            zzf(zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            GetChangesRequest getchangesrequest = obj28;
            if (parcel.readInt() != 0)
            {
                getchangesrequest = (GetChangesRequest)GetChangesRequest.CREATOR.createFromParcel(parcel);
            }
            zza(getchangesrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 46: // '.'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            UnsubscribeResourceRequest unsubscriberesourcerequest = obj29;
            if (parcel.readInt() != 0)
            {
                unsubscriberesourcerequest = (UnsubscribeResourceRequest)UnsubscribeResourceRequest.CREATOR.createFromParcel(parcel);
            }
            zza(unsubscriberesourcerequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 47: // '/'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            GetPermissionsRequest getpermissionsrequest = obj30;
            if (parcel.readInt() != 0)
            {
                getpermissionsrequest = (GetPermissionsRequest)GetPermissionsRequest.CREATOR.createFromParcel(parcel);
            }
            zza(getpermissionsrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 48: // '0'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            AddPermissionRequest addpermissionrequest = obj31;
            if (parcel.readInt() != 0)
            {
                addpermissionrequest = (AddPermissionRequest)AddPermissionRequest.CREATOR.createFromParcel(parcel);
            }
            zza(addpermissionrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 49: // '1'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            UpdatePermissionRequest updatepermissionrequest = obj32;
            if (parcel.readInt() != 0)
            {
                updatepermissionrequest = (UpdatePermissionRequest)UpdatePermissionRequest.CREATOR.createFromParcel(parcel);
            }
            zza(updatepermissionrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 50: // '2'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            RemovePermissionRequest removepermissionrequest = obj33;
            if (parcel.readInt() != 0)
            {
                removepermissionrequest = (RemovePermissionRequest)RemovePermissionRequest.CREATOR.createFromParcel(parcel);
            }
            zza(removepermissionrequest, zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 51: // '3'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            QueryRequest queryrequest2 = obj34;
            if (parcel.readInt() != 0)
            {
                queryrequest2 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
            }
            zza(queryrequest2, zzaQ(parcel.readStrongBinder()), zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 52: // '4'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            zza(zzaQ(parcel.readStrongBinder()), zzaP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
