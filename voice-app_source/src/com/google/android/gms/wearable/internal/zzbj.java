// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            CapabilityInfoParcelable, AddLocalCapabilityResponse, zzbg, zza, 
//            CloseChannelResponse, DeleteDataItemsResponse, GetAllCapabilitiesResponse, GetCapabilityResponse, 
//            zzq, GetChannelInputStreamResponse, zzm, GetChannelOutputStreamResponse, 
//            zzn, GetConnectedNodesResponse, GetDataItemResponse, GetFdForAssetResponse, 
//            GetLocalNodeResponse, OpenChannelResponse, PutDataResponse, ChannelSendFileResponse, 
//            RemoveLocalCapabilityResponse, SendMessageResponse, ChannelReceiveFileResponse

final class zzbj
{
    static final class zza extends zzb
    {

        public void zza(AddLocalCapabilityResponse addlocalcapabilityresponse)
        {
            zzP(new zzg.zzb(zzbg.zzfn(addlocalcapabilityresponse.statusCode)));
        }

        public zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static abstract class zzb extends com.google.android.gms.wearable.internal.zza
    {

        private com.google.android.gms.common.api.zza.zzb zzNO;

        public void zzP(Object obj)
        {
            com.google.android.gms.common.api.zza.zzb zzb1 = zzNO;
            if (zzb1 != null)
            {
                zzb1.zzm(obj);
                zzNO = null;
            }
        }

        public zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzNO = zzb1;
        }
    }

    static final class zzc extends zzb
    {

        public void zza(CloseChannelResponse closechannelresponse)
        {
            zzP(new Status(closechannelresponse.statusCode));
        }

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzd extends zzb
    {

        public void zzb(CloseChannelResponse closechannelresponse)
        {
            zzP(new Status(closechannelresponse.statusCode));
        }

        public zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zze extends zzb
    {

        public void zza(DeleteDataItemsResponse deletedataitemsresponse)
        {
            zzP(new zzu.zzc(zzbg.zzfn(deletedataitemsresponse.statusCode), deletedataitemsresponse.zzaUp));
        }

        public zze(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzf extends zzb
    {

        public void zza(GetAllCapabilitiesResponse getallcapabilitiesresponse)
        {
            zzP(new zzg.zzd(zzbg.zzfn(getallcapabilitiesresponse.statusCode), zzbj.zzw(getallcapabilitiesresponse.zzaUq)));
        }

        public zzf(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzg extends zzb
    {

        public void zza(GetCapabilityResponse getcapabilityresponse)
        {
            zzP(new zzg.zze(zzbg.zzfn(getcapabilityresponse.statusCode), new zzg.zzc(getcapabilityresponse.zzaUr)));
        }

        public zzg(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzh extends zzb
    {

        private final com.google.android.gms.wearable.internal.zzq zzaUQ;

        public void zza(GetChannelInputStreamResponse getchannelinputstreamresponse)
        {
            com.google.android.gms.wearable.internal.zzm zzm1 = null;
            if (getchannelinputstreamresponse.zzaUs != null)
            {
                zzm1 = new com.google.android.gms.wearable.internal.zzm(new android.os.ParcelFileDescriptor.AutoCloseInputStream(getchannelinputstreamresponse.zzaUs));
                zzaUQ.zza(zzm1.zzBb());
            }
            zzP(new ChannelImpl.zza(new Status(getchannelinputstreamresponse.statusCode), zzm1));
        }

        public zzh(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.internal.zzq zzq1)
        {
            super(zzb1);
            zzaUQ = (com.google.android.gms.wearable.internal.zzq)com.google.android.gms.common.internal.zzu.zzu(zzq1);
        }
    }

    static final class zzi extends zzb
    {

        private final com.google.android.gms.wearable.internal.zzq zzaUQ;

        public void zza(GetChannelOutputStreamResponse getchanneloutputstreamresponse)
        {
            com.google.android.gms.wearable.internal.zzn zzn1 = null;
            if (getchanneloutputstreamresponse.zzaUs != null)
            {
                zzn1 = new com.google.android.gms.wearable.internal.zzn(new android.os.ParcelFileDescriptor.AutoCloseOutputStream(getchanneloutputstreamresponse.zzaUs));
                zzaUQ.zza(zzn1.zzBb());
            }
            zzP(new ChannelImpl.zzb(new Status(getchanneloutputstreamresponse.statusCode), zzn1));
        }

        public zzi(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.internal.zzq zzq1)
        {
            super(zzb1);
            zzaUQ = (com.google.android.gms.wearable.internal.zzq)com.google.android.gms.common.internal.zzu.zzu(zzq1);
        }
    }

    static final class zzj extends zzb
    {

        public void zza(GetConnectedNodesResponse getconnectednodesresponse)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.addAll(getconnectednodesresponse.zzaUw);
            zzP(new zzax.zzb(zzbg.zzfn(getconnectednodesresponse.statusCode), arraylist));
        }

        public zzj(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzk extends zzb
    {

        public void zza(GetDataItemResponse getdataitemresponse)
        {
            zzP(new zzu.zzb(zzbg.zzfn(getdataitemresponse.statusCode), getdataitemresponse.zzaUx));
        }

        public zzk(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzl extends zzb
    {

        public void zzad(DataHolder dataholder)
        {
            zzP(new DataItemBuffer(dataholder));
        }

        public zzl(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzm extends zzb
    {

        public void zza(GetFdForAssetResponse getfdforassetresponse)
        {
            zzP(new zzu.zzd(zzbg.zzfn(getfdforassetresponse.statusCode), getfdforassetresponse.zzaUy));
        }

        public zzm(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzn extends zzb
    {

        public void zza(GetLocalNodeResponse getlocalnoderesponse)
        {
            zzP(new zzax.zzc(zzbg.zzfn(getlocalnoderesponse.statusCode), getlocalnoderesponse.zzaUz));
        }

        public zzn(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzo extends com.google.android.gms.wearable.internal.zza
    {

        public void zza(Status status)
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
            zzP(new zzi.zzb(zzbg.zzfn(openchannelresponse.statusCode), openchannelresponse.zzaTP));
        }

        public zzp(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzq extends zzb
    {

        private final List zzwE;

        public void zza(PutDataResponse putdataresponse)
        {
            zzP(new zzu.zzb(zzbg.zzfn(putdataresponse.statusCode), putdataresponse.zzaUx));
            if (putdataresponse.statusCode != 0)
            {
                for (putdataresponse = zzwE.iterator(); putdataresponse.hasNext(); ((FutureTask)putdataresponse.next()).cancel(true)) { }
            }
        }

        zzq(com.google.android.gms.common.api.zza.zzb zzb1, List list)
        {
            super(zzb1);
            zzwE = list;
        }
    }

    static final class zzr extends zzb
    {

        public void zza(ChannelSendFileResponse channelsendfileresponse)
        {
            zzP(new Status(channelsendfileresponse.statusCode));
        }

        public zzr(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzs extends zzb
    {

        public void zza(RemoveLocalCapabilityResponse removelocalcapabilityresponse)
        {
            zzP(new zzg.zzb(zzbg.zzfn(removelocalcapabilityresponse.statusCode)));
        }

        public zzs(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzt extends zzb
    {

        public void zza(SendMessageResponse sendmessageresponse)
        {
            zzP(new zzav.zzb(zzbg.zzfn(sendmessageresponse.statusCode), sendmessageresponse.zzaxg));
        }

        public zzt(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzu extends zzb
    {

        public void zza(ChannelReceiveFileResponse channelreceivefileresponse)
        {
            zzP(new Status(channelreceivefileresponse.statusCode));
        }

        public zzu(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }


    private static Map zzv(List list)
    {
        HashMap hashmap = new HashMap(list.size() * 2);
        CapabilityInfoParcelable capabilityinfoparcelable;
        for (list = list.iterator(); list.hasNext(); hashmap.put(capabilityinfoparcelable.getName(), new zzg.zzc(capabilityinfoparcelable)))
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
