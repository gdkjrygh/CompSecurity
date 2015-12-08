// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AddLocalCapabilityResponse, ChannelReceiveFileResponse, ChannelSendFileResponse, CloseChannelResponse, 
//            DeleteDataItemsResponse, GetAllCapabilitiesResponse, GetCapabilityResponse, GetChannelInputStreamResponse, 
//            GetChannelOutputStreamResponse, GetCloudSyncOptInOutDoneResponse, GetCloudSyncOptInStatusResponse, GetCloudSyncSettingResponse, 
//            GetConfigResponse, GetConfigsResponse, GetConnectedNodesResponse, GetDataItemResponse, 
//            GetFdForAssetResponse, GetLocalNodeResponse, OpenChannelResponse, PutDataResponse, 
//            RemoveLocalCapabilityResponse, SendMessageResponse, StorageInfoResponse

public interface zzau
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzau
    {

        public static zzau zzdY(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (iinterface != null && (iinterface instanceof zzau))
            {
                return (zzau)iinterface;
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
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0)
                {
                    obj = (GetConfigResponse)GetConfigResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetConfigResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (GetConfigsResponse)GetConfigsResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetConfigsResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (GetCloudSyncOptInOutDoneResponse)GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetCloudSyncOptInOutDoneResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (GetCloudSyncSettingResponse)GetCloudSyncSettingResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetCloudSyncSettingResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (GetCloudSyncOptInStatusResponse)GetCloudSyncOptInStatusResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetCloudSyncOptInStatusResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (PutDataResponse)PutDataResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((PutDataResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (GetDataItemResponse)GetDataItemResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetDataItemResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR.zzaa(parcel);
                }
                zzae(((DataHolder) (obj)));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = (DeleteDataItemsResponse)DeleteDataItemsResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((DeleteDataItemsResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = (SendMessageResponse)SendMessageResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((SendMessageResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = (GetFdForAssetResponse)GetFdForAssetResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetFdForAssetResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj11;
                if (parcel.readInt() != 0)
                {
                    obj = (GetLocalNodeResponse)GetLocalNodeResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetLocalNodeResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj12;
                if (parcel.readInt() != 0)
                {
                    obj = (GetConnectedNodesResponse)GetConnectedNodesResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetConnectedNodesResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj13;
                if (parcel.readInt() != 0)
                {
                    obj = (OpenChannelResponse)OpenChannelResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((OpenChannelResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj14;
                if (parcel.readInt() != 0)
                {
                    obj = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((CloseChannelResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj15;
                if (parcel.readInt() != 0)
                {
                    obj = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(parcel);
                }
                zzb(((CloseChannelResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj16;
                if (parcel.readInt() != 0)
                {
                    obj = (GetChannelInputStreamResponse)GetChannelInputStreamResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetChannelInputStreamResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj17;
                if (parcel.readInt() != 0)
                {
                    obj = (GetChannelOutputStreamResponse)GetChannelOutputStreamResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetChannelOutputStreamResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj18;
                if (parcel.readInt() != 0)
                {
                    obj = (ChannelReceiveFileResponse)ChannelReceiveFileResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((ChannelReceiveFileResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj19;
                if (parcel.readInt() != 0)
                {
                    obj = (ChannelSendFileResponse)ChannelSendFileResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((ChannelSendFileResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj20;
                if (parcel.readInt() != 0)
                {
                    obj = (Status)Status.CREATOR.createFromParcel(parcel);
                }
                zzc(((Status) (obj)));
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj21;
                if (parcel.readInt() != 0)
                {
                    obj = (StorageInfoResponse)StorageInfoResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((StorageInfoResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj22;
                if (parcel.readInt() != 0)
                {
                    obj = (GetCapabilityResponse)GetCapabilityResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetCapabilityResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj23;
                if (parcel.readInt() != 0)
                {
                    obj = (GetAllCapabilitiesResponse)GetAllCapabilitiesResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((GetAllCapabilitiesResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj24;
                if (parcel.readInt() != 0)
                {
                    obj = (AddLocalCapabilityResponse)AddLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
                }
                zza(((AddLocalCapabilityResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj25;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (RemoveLocalCapabilityResponse)RemoveLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
            }
            zza(((RemoveLocalCapabilityResponse) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }
    }

    private static class zza.zza
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

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zza(AddLocalCapabilityResponse addlocalcapabilityresponse)
        throws RemoteException;

    public abstract void zza(ChannelReceiveFileResponse channelreceivefileresponse)
        throws RemoteException;

    public abstract void zza(ChannelSendFileResponse channelsendfileresponse)
        throws RemoteException;

    public abstract void zza(CloseChannelResponse closechannelresponse)
        throws RemoteException;

    public abstract void zza(DeleteDataItemsResponse deletedataitemsresponse)
        throws RemoteException;

    public abstract void zza(GetAllCapabilitiesResponse getallcapabilitiesresponse)
        throws RemoteException;

    public abstract void zza(GetCapabilityResponse getcapabilityresponse)
        throws RemoteException;

    public abstract void zza(GetChannelInputStreamResponse getchannelinputstreamresponse)
        throws RemoteException;

    public abstract void zza(GetChannelOutputStreamResponse getchanneloutputstreamresponse)
        throws RemoteException;

    public abstract void zza(GetCloudSyncOptInOutDoneResponse getcloudsyncoptinoutdoneresponse)
        throws RemoteException;

    public abstract void zza(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse)
        throws RemoteException;

    public abstract void zza(GetCloudSyncSettingResponse getcloudsyncsettingresponse)
        throws RemoteException;

    public abstract void zza(GetConfigResponse getconfigresponse)
        throws RemoteException;

    public abstract void zza(GetConfigsResponse getconfigsresponse)
        throws RemoteException;

    public abstract void zza(GetConnectedNodesResponse getconnectednodesresponse)
        throws RemoteException;

    public abstract void zza(GetDataItemResponse getdataitemresponse)
        throws RemoteException;

    public abstract void zza(GetFdForAssetResponse getfdforassetresponse)
        throws RemoteException;

    public abstract void zza(GetLocalNodeResponse getlocalnoderesponse)
        throws RemoteException;

    public abstract void zza(OpenChannelResponse openchannelresponse)
        throws RemoteException;

    public abstract void zza(PutDataResponse putdataresponse)
        throws RemoteException;

    public abstract void zza(RemoveLocalCapabilityResponse removelocalcapabilityresponse)
        throws RemoteException;

    public abstract void zza(SendMessageResponse sendmessageresponse)
        throws RemoteException;

    public abstract void zza(StorageInfoResponse storageinforesponse)
        throws RemoteException;

    public abstract void zzae(DataHolder dataholder)
        throws RemoteException;

    public abstract void zzb(CloseChannelResponse closechannelresponse)
        throws RemoteException;

    public abstract void zzc(Status status)
        throws RemoteException;
}
