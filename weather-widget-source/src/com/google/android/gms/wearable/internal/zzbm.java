// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.DataItemBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            CapabilityInfoParcelable, AddLocalCapabilityResponse, zzbj, zza, 
//            CloseChannelResponse, DeleteDataItemsResponse, GetAllCapabilitiesResponse, GetCapabilityResponse, 
//            zzs, GetChannelInputStreamResponse, zzo, GetChannelOutputStreamResponse, 
//            zzp, GetConnectedNodesResponse, GetDataItemResponse, GetFdForAssetResponse, 
//            GetLocalNodeResponse, OpenChannelResponse, PutDataResponse, ChannelSendFileResponse, 
//            RemoveLocalCapabilityResponse, SendMessageResponse, ChannelReceiveFileResponse

final class zzbm
{
    static final class zza extends zzb
    {

        public void zza(AddLocalCapabilityResponse addlocalcapabilityresponse)
        {
            zzR(new zzi.zzb(zzbj.zzfx(addlocalcapabilityresponse.statusCode)));
        }

        public zza(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static abstract class zzb extends com.google.android.gms.wearable.internal.zza
    {

        private com.google.android.gms.common.api.zzc.zzb zzPW;

        public void zzR(Object obj)
        {
            com.google.android.gms.common.api.zzc.zzb zzb1 = zzPW;
            if (zzb1 != null)
            {
                zzb1.zzn(obj);
                zzPW = null;
            }
        }

        public zzb(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            zzPW = zzb1;
        }
    }

    static final class zzc extends zzb
    {

        public void zza(CloseChannelResponse closechannelresponse)
        {
            zzR(new Status(closechannelresponse.statusCode));
        }

        public zzc(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzd extends zzb
    {

        public void zzb(CloseChannelResponse closechannelresponse)
        {
            zzR(new Status(closechannelresponse.statusCode));
        }

        public zzd(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zze extends zzb
    {

        public void zza(DeleteDataItemsResponse deletedataitemsresponse)
        {
            zzR(new zzw.zzc(zzbj.zzfx(deletedataitemsresponse.statusCode), deletedataitemsresponse.zzbaq));
        }

        public zze(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzf extends zzb
    {

        public void zza(GetAllCapabilitiesResponse getallcapabilitiesresponse)
        {
            zzR(new zzi.zzd(zzbj.zzfx(getallcapabilitiesresponse.statusCode), zzbm.zzw(getallcapabilitiesresponse.zzbar)));
        }

        public zzf(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzg extends zzb
    {

        public void zza(GetCapabilityResponse getcapabilityresponse)
        {
            zzR(new zzi.zze(zzbj.zzfx(getcapabilityresponse.statusCode), new zzi.zzc(getcapabilityresponse.zzbas)));
        }

        public zzg(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzh extends zzb
    {

        private final com.google.android.gms.wearable.internal.zzs zzbaT;

        public void zza(GetChannelInputStreamResponse getchannelinputstreamresponse)
        {
            com.google.android.gms.wearable.internal.zzo zzo1 = null;
            if (getchannelinputstreamresponse.zzbat != null)
            {
                zzo1 = new com.google.android.gms.wearable.internal.zzo(new android.os.ParcelFileDescriptor.AutoCloseInputStream(getchannelinputstreamresponse.zzbat));
                zzbaT.zza(zzo1.zzCD());
            }
            zzR(new ChannelImpl.zza(new Status(getchannelinputstreamresponse.statusCode), zzo1));
        }

        public zzh(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.internal.zzs zzs1)
        {
            super(zzb1);
            zzbaT = (com.google.android.gms.wearable.internal.zzs)zzx.zzv(zzs1);
        }
    }

    static final class zzi extends zzb
    {

        private final com.google.android.gms.wearable.internal.zzs zzbaT;

        public void zza(GetChannelOutputStreamResponse getchanneloutputstreamresponse)
        {
            com.google.android.gms.wearable.internal.zzp zzp1 = null;
            if (getchanneloutputstreamresponse.zzbat != null)
            {
                zzp1 = new com.google.android.gms.wearable.internal.zzp(new android.os.ParcelFileDescriptor.AutoCloseOutputStream(getchanneloutputstreamresponse.zzbat));
                zzbaT.zza(zzp1.zzCD());
            }
            zzR(new ChannelImpl.zzb(new Status(getchanneloutputstreamresponse.statusCode), zzp1));
        }

        public zzi(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.internal.zzs zzs1)
        {
            super(zzb1);
            zzbaT = (com.google.android.gms.wearable.internal.zzs)zzx.zzv(zzs1);
        }
    }

    static final class zzj extends zzb
    {

        public void zza(GetConnectedNodesResponse getconnectednodesresponse)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.addAll(getconnectednodesresponse.zzbaz);
            zzR(new zzba.zzb(zzbj.zzfx(getconnectednodesresponse.statusCode), arraylist));
        }

        public zzj(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzk extends zzb
    {

        public void zza(GetDataItemResponse getdataitemresponse)
        {
            zzR(new zzw.zzb(zzbj.zzfx(getdataitemresponse.statusCode), getdataitemresponse.zzbaA));
        }

        public zzk(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzl extends zzb
    {

        public void zzae(DataHolder dataholder)
        {
            zzR(new DataItemBuffer(dataholder));
        }

        public zzl(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzm extends zzb
    {

        public void zza(GetFdForAssetResponse getfdforassetresponse)
        {
            zzR(new zzw.zzd(zzbj.zzfx(getfdforassetresponse.statusCode), getfdforassetresponse.zzbaB));
        }

        public zzm(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzn extends zzb
    {

        public void zza(GetLocalNodeResponse getlocalnoderesponse)
        {
            zzR(new zzba.zzc(zzbj.zzfx(getlocalnoderesponse.statusCode), getlocalnoderesponse.zzbaC));
        }

        public zzn(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzo extends com.google.android.gms.wearable.internal.zza
    {

        public void zzc(Status status)
        {
        }

        zzo()
        {
        }
    }

    static final class zzp extends zzb
    {

        public void zza(OpenChannelResponse openchannelresponse)
        {
            zzR(new zzk.zzb(zzbj.zzfx(openchannelresponse.statusCode), openchannelresponse.zzaZR));
        }

        public zzp(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzq extends zzb
    {

        private final List zzxu;

        public void zza(PutDataResponse putdataresponse)
        {
            zzR(new zzw.zzb(zzbj.zzfx(putdataresponse.statusCode), putdataresponse.zzbaA));
            if (putdataresponse.statusCode != 0)
            {
                for (putdataresponse = zzxu.iterator(); putdataresponse.hasNext(); ((FutureTask)putdataresponse.next()).cancel(true)) { }
            }
        }

        zzq(com.google.android.gms.common.api.zzc.zzb zzb1, List list)
        {
            super(zzb1);
            zzxu = list;
        }
    }

    static final class zzr extends zzb
    {

        public void zza(ChannelSendFileResponse channelsendfileresponse)
        {
            zzR(new Status(channelsendfileresponse.statusCode));
        }

        public zzr(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzs extends zzb
    {

        public void zza(RemoveLocalCapabilityResponse removelocalcapabilityresponse)
        {
            zzR(new zzi.zzb(zzbj.zzfx(removelocalcapabilityresponse.statusCode)));
        }

        public zzs(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzt extends zzb
    {

        public void zza(SendMessageResponse sendmessageresponse)
        {
            zzR(new zzay.zzb(zzbj.zzfx(sendmessageresponse.statusCode), sendmessageresponse.zzaBi));
        }

        public zzt(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzu extends zzb
    {

        public void zza(ChannelReceiveFileResponse channelreceivefileresponse)
        {
            zzR(new Status(channelreceivefileresponse.statusCode));
        }

        public zzu(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
        }
    }


    private static Map zzv(List list)
    {
        HashMap hashmap = new HashMap(list.size() * 2);
        CapabilityInfoParcelable capabilityinfoparcelable;
        for (list = list.iterator(); list.hasNext(); hashmap.put(capabilityinfoparcelable.getName(), new zzi.zzc(capabilityinfoparcelable)))
        {
            capabilityinfoparcelable = (CapabilityInfoParcelable)list.next();
        }

        return hashmap;
    }

    static Map zzw(List list)
    {
        return zzv(list);
    }
}
