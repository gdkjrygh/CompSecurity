// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzau, AddLocalCapabilityResponse, ChannelReceiveFileResponse, ChannelSendFileResponse, 
//            CloseChannelResponse, DeleteDataItemsResponse, GetAllCapabilitiesResponse, GetCapabilityResponse, 
//            GetChannelInputStreamResponse, GetChannelOutputStreamResponse, GetCloudSyncOptInOutDoneResponse, GetCloudSyncOptInStatusResponse, 
//            GetCloudSyncSettingResponse, GetConfigResponse, GetConfigsResponse, GetConnectedNodesResponse, 
//            GetDataItemResponse, GetFdForAssetResponse, GetLocalNodeResponse, OpenChannelResponse, 
//            PutDataResponse, RemoveLocalCapabilityResponse, SendMessageResponse, StorageInfoResponse

private static class zznI
    implements zzau
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(AddLocalCapabilityResponse addlocalcapabilityresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (addlocalcapabilityresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        addlocalcapabilityresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        addlocalcapabilityresponse;
        parcel1.recycle();
        parcel.recycle();
        throw addlocalcapabilityresponse;
    }

    public void zza(ChannelReceiveFileResponse channelreceivefileresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (channelreceivefileresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        channelreceivefileresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        channelreceivefileresponse;
        parcel1.recycle();
        parcel.recycle();
        throw channelreceivefileresponse;
    }

    public void zza(ChannelSendFileResponse channelsendfileresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (channelsendfileresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        channelsendfileresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        channelsendfileresponse;
        parcel1.recycle();
        parcel.recycle();
        throw channelsendfileresponse;
    }

    public void zza(CloseChannelResponse closechannelresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (closechannelresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        closechannelresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        closechannelresponse;
        parcel1.recycle();
        parcel.recycle();
        throw closechannelresponse;
    }

    public void zza(DeleteDataItemsResponse deletedataitemsresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (deletedataitemsresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        deletedataitemsresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        deletedataitemsresponse;
        parcel1.recycle();
        parcel.recycle();
        throw deletedataitemsresponse;
    }

    public void zza(GetAllCapabilitiesResponse getallcapabilitiesresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getallcapabilitiesresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getallcapabilitiesresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getallcapabilitiesresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getallcapabilitiesresponse;
    }

    public void zza(GetCapabilityResponse getcapabilityresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getcapabilityresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getcapabilityresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getcapabilityresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getcapabilityresponse;
    }

    public void zza(GetChannelInputStreamResponse getchannelinputstreamresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getchannelinputstreamresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getchannelinputstreamresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getchannelinputstreamresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getchannelinputstreamresponse;
    }

    public void zza(GetChannelOutputStreamResponse getchanneloutputstreamresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getchanneloutputstreamresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getchanneloutputstreamresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getchanneloutputstreamresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getchanneloutputstreamresponse;
    }

    public void zza(GetCloudSyncOptInOutDoneResponse getcloudsyncoptinoutdoneresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getcloudsyncoptinoutdoneresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getcloudsyncoptinoutdoneresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getcloudsyncoptinoutdoneresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getcloudsyncoptinoutdoneresponse;
    }

    public void zza(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getcloudsyncoptinstatusresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getcloudsyncoptinstatusresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getcloudsyncoptinstatusresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getcloudsyncoptinstatusresponse;
    }

    public void zza(GetCloudSyncSettingResponse getcloudsyncsettingresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getcloudsyncsettingresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getcloudsyncsettingresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getcloudsyncsettingresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getcloudsyncsettingresponse;
    }

    public void zza(GetConfigResponse getconfigresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getconfigresponse == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        getconfigresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getconfigresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getconfigresponse;
    }

    public void zza(GetConfigsResponse getconfigsresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getconfigsresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getconfigsresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getconfigsresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getconfigsresponse;
    }

    public void zza(GetConnectedNodesResponse getconnectednodesresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getconnectednodesresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getconnectednodesresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getconnectednodesresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getconnectednodesresponse;
    }

    public void zza(GetDataItemResponse getdataitemresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getdataitemresponse == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        getdataitemresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getdataitemresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getdataitemresponse;
    }

    public void zza(GetFdForAssetResponse getfdforassetresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getfdforassetresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getfdforassetresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getfdforassetresponse;
        parcel1.recycle();
        parcel.recycle();
        throw getfdforassetresponse;
    }

    public void zza(GetLocalNodeResponse getlocalnoderesponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (getlocalnoderesponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getlocalnoderesponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getlocalnoderesponse;
        parcel1.recycle();
        parcel.recycle();
        throw getlocalnoderesponse;
    }

    public void zza(OpenChannelResponse openchannelresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (openchannelresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        openchannelresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        openchannelresponse;
        parcel1.recycle();
        parcel.recycle();
        throw openchannelresponse;
    }

    public void zza(PutDataResponse putdataresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (putdataresponse == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        putdataresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        putdataresponse;
        parcel1.recycle();
        parcel.recycle();
        throw putdataresponse;
    }

    public void zza(RemoveLocalCapabilityResponse removelocalcapabilityresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (removelocalcapabilityresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        removelocalcapabilityresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        removelocalcapabilityresponse;
        parcel1.recycle();
        parcel.recycle();
        throw removelocalcapabilityresponse;
    }

    public void zza(SendMessageResponse sendmessageresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (sendmessageresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        sendmessageresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        sendmessageresponse;
        parcel1.recycle();
        parcel.recycle();
        throw sendmessageresponse;
    }

    public void zza(StorageInfoResponse storageinforesponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (storageinforesponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        storageinforesponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        storageinforesponse;
        parcel1.recycle();
        parcel.recycle();
        throw storageinforesponse;
    }

    public void zzae(DataHolder dataholder)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (dataholder == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L1:
        zznI.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        dataholder;
        parcel1.recycle();
        parcel.recycle();
        throw dataholder;
    }

    public void zzb(CloseChannelResponse closechannelresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (closechannelresponse == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        closechannelresponse.writeToParcel(parcel, 0);
_L1:
        zznI.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        closechannelresponse;
        parcel1.recycle();
        parcel.recycle();
        throw closechannelresponse;
    }

    public void zzc(Status status)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (status == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        status.writeToParcel(parcel, 0);
_L1:
        zznI.transact(11, parcel, parcel1, 0);
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

    esponse(IBinder ibinder)
    {
        zznI = ibinder;
    }
}
