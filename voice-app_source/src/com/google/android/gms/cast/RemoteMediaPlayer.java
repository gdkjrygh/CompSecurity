// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaStatus, MediaQueueItem, MediaInfo, CastDevice, 
//            TextTrackStyle, Cast

public class RemoteMediaPlayer
    implements Cast.MessageReceivedCallback
{
    public static interface MediaChannelResult
        extends Result
    {

        public abstract JSONObject getCustomData();
    }

    public static interface OnMetadataUpdatedListener
    {

        public abstract void onMetadataUpdated();
    }

    public static interface OnPreloadStatusUpdatedListener
    {

        public abstract void onPreloadStatusUpdated();
    }

    public static interface OnQueueStatusUpdatedListener
    {

        public abstract void onQueueStatusUpdated();
    }

    public static interface OnStatusUpdatedListener
    {

        public abstract void onStatusUpdated();
    }

    private class zza
        implements zzn
    {

        private GoogleApiClient zzSW;
        private long zzSX;
        final RemoteMediaPlayer zzSz;

        public void zza(String s, String s1, long l, String s2)
            throws IOException
        {
            if (zzSW == null)
            {
                throw new IOException("No GoogleApiClient available");
            } else
            {
                Cast.CastApi.sendMessage(zzSW, s, s1).setResultCallback(new zza(this, l));
                return;
            }
        }

        public void zzb(GoogleApiClient googleapiclient)
        {
            zzSW = googleapiclient;
        }

        public long zzlu()
        {
            long l = zzSX + 1L;
            zzSX = l;
            return l;
        }

        public zza()
        {
            zzSz = RemoteMediaPlayer.this;
            super();
            zzSX = 0L;
        }
    }

    private final class zza.zza
        implements ResultCallback
    {

        private final long zzSY;
        final zza zzSZ;

        public void onResult(Result result)
        {
            zzm((Status)result);
        }

        public void zzm(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.zzg(zzSZ.zzSz).zzb(zzSY, status.getStatusCode());
            }
        }

        zza.zza(zza zza1, long l)
        {
            zzSZ = zza1;
            super();
            zzSY = l;
        }
    }

    private static abstract class zzb extends com.google.android.gms.cast.internal.zzb
    {

        zzo zzTa;

        public Result createFailedResult(Status status)
        {
            return zzn(status);
        }

        public MediaChannelResult zzn(Status status)
        {
            return new MediaChannelResult(this, status) {

                final Status zzOl;
                final zzb zzTb;

                public JSONObject getCustomData()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzTb = zzb1;
                zzOl = status;
                super();
            }
            };
        }

        zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            zzTa = new _cls1(this);
        }
    }

    private static final class zzc
        implements MediaChannelResult
    {

        private final Status zzOt;
        private final JSONObject zzRJ;

        public JSONObject getCustomData()
        {
            return zzRJ;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        zzc(Status status, JSONObject jsonobject)
        {
            zzOt = status;
            zzRJ = jsonobject;
        }
    }


    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2101;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 2102;
    private final zzm zzSt = new zzm(null) {

        final RemoteMediaPlayer zzSz;

        protected void onMetadataUpdated()
        {
            RemoteMediaPlayer.zzb(zzSz);
        }

        protected void onPreloadStatusUpdated()
        {
            RemoteMediaPlayer.zzd(zzSz);
        }

        protected void onQueueStatusUpdated()
        {
            RemoteMediaPlayer.zzc(zzSz);
        }

        protected void onStatusUpdated()
        {
            RemoteMediaPlayer.zza(zzSz);
        }

            
            {
                zzSz = RemoteMediaPlayer.this;
                super(s);
            }
    };
    private final zza zzSu = new zza();
    private OnPreloadStatusUpdatedListener zzSv;
    private OnQueueStatusUpdatedListener zzSw;
    private OnMetadataUpdatedListener zzSx;
    private OnStatusUpdatedListener zzSy;
    private final Object zzqt = new Object();

    public RemoteMediaPlayer()
    {
        zzSt.zza(zzSu);
    }

    private void onMetadataUpdated()
    {
        if (zzSx != null)
        {
            zzSx.onMetadataUpdated();
        }
    }

    private void onPreloadStatusUpdated()
    {
        if (zzSv != null)
        {
            zzSv.onPreloadStatusUpdated();
        }
    }

    private void onQueueStatusUpdated()
    {
        if (zzSw != null)
        {
            zzSw.onQueueStatusUpdated();
        }
    }

    private void onStatusUpdated()
    {
        if (zzSy != null)
        {
            zzSy.onStatusUpdated();
        }
    }

    static int zza(RemoteMediaPlayer remotemediaplayer, int i)
    {
        return remotemediaplayer.zzaH(i);
    }

    static void zza(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onStatusUpdated();
    }

    private int zzaH(int i)
    {
        MediaStatus mediastatus = getMediaStatus();
        for (int j = 0; j < mediastatus.getQueueItemCount(); j++)
        {
            if (mediastatus.getQueueItem(j).getItemId() == i)
            {
                return j;
            }
        }

        return -1;
    }

    static void zzb(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onMetadataUpdated();
    }

    static void zzc(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onQueueStatusUpdated();
    }

    static void zzd(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onPreloadStatusUpdated();
    }

    static Object zze(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.zzqt;
    }

    static zza zzf(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.zzSu;
    }

    static zzm zzg(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.zzSt;
    }

    public long getApproximateStreamPosition()
    {
        long l;
        synchronized (zzqt)
        {
            l = zzSt.getApproximateStreamPosition();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaInfo getMediaInfo()
    {
        MediaInfo mediainfo;
        synchronized (zzqt)
        {
            mediainfo = zzSt.getMediaInfo();
        }
        return mediainfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaStatus getMediaStatus()
    {
        MediaStatus mediastatus;
        synchronized (zzqt)
        {
            mediastatus = zzSt.getMediaStatus();
        }
        return mediastatus;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getNamespace()
    {
        return zzSt.getNamespace();
    }

    public long getStreamDuration()
    {
        long l;
        synchronized (zzqt)
        {
            l = zzSt.getStreamDuration();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo)
    {
        return load(googleapiclient, mediainfo, true, 0L, null, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag)
    {
        return load(googleapiclient, mediainfo, flag, 0L, null, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l)
    {
        return load(googleapiclient, mediainfo, flag, l, null, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, JSONObject jsonobject)
    {
        return load(googleapiclient, mediainfo, flag, l, null, jsonobject);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, long al[], JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, mediainfo, flag, l, al, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final MediaInfo zzSM;
            final boolean zzSN;
            final long zzSO;
            final long zzSP[];
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSM, zzSN, zzSO, zzSP, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSM = mediainfo;
                zzSN = flag;
                zzSO = l;
                zzSP = al;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        zzSt.zzbB(s1);
    }

    public PendingResult pause(GoogleApiClient googleapiclient)
    {
        return pause(googleapiclient, null);
    }

    public PendingResult pause(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult play(GoogleApiClient googleapiclient)
    {
        return play(googleapiclient, null);
    }

    public PendingResult play(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zzc(zzTa, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueAppendItem(GoogleApiClient googleapiclient, MediaQueueItem mediaqueueitem, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        return queueInsertItems(googleapiclient, new MediaQueueItem[] {
            mediaqueueitem
        }, 0, jsonobject);
    }

    public PendingResult queueInsertItems(GoogleApiClient googleapiclient, MediaQueueItem amediaqueueitem[], int i, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, amediaqueueitem, i, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final MediaQueueItem zzSH[];
            final int zzSI;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSH, zzSI, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSH = amediaqueueitem;
                zzSI = i;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueJumpToItem(GoogleApiClient googleapiclient, int i, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, i, googleapiclient, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final int zzSQ;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
label0:
                {
                    synchronized (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz))
                    {
                        if (RemoteMediaPlayer.zza(zzSz, zzSQ) != -1)
                        {
                            break label0;
                        }
                        setResult(zzn(new Status(0)));
                    }
                    return;
                }
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSQ, null, 0, null, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                exception;
                zze1;
                JVM INSTR monitorexit ;
                throw exception;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSQ = i;
                zzSA = googleapiclient1;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueLoad(GoogleApiClient googleapiclient, MediaQueueItem amediaqueueitem[], int i, int j, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, amediaqueueitem, i, j, jsonobject) {

            final GoogleApiClient zzSA;
            final MediaQueueItem zzSD[];
            final int zzSE;
            final int zzSF;
            final JSONObject zzSG;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSD, zzSE, zzSF, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSD = amediaqueueitem;
                zzSE = i;
                zzSF = j;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueMoveItemToNewIndex(GoogleApiClient googleapiclient, int i, int j, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, i, j, googleapiclient, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final int zzSQ;
            final int zzSR;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                boolean flag = false;
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                int k = RemoteMediaPlayer.zza(zzSz, zzSQ);
                if (k != -1)
                {
                    break MISSING_BLOCK_LABEL_51;
                }
                setResult(zzn(new Status(0)));
                zze1;
                JVM INSTR monitorexit ;
                return;
                if (zzSR >= 0)
                {
                    break MISSING_BLOCK_LABEL_106;
                }
                setResult(zzn(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[] {
                    Integer.valueOf(zzSR)
                }))));
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                if (k != zzSR)
                {
                    break MISSING_BLOCK_LABEL_134;
                }
                setResult(zzn(new Status(0)));
                zze1;
                JVM INSTR monitorexit ;
                return;
                if (zzSR <= k) goto _L2; else goto _L1
_L1:
                k = zzSR + 1;
_L3:
                MediaQueueItem mediaqueueitem = zzSz.getMediaStatus().getQueueItem(k);
                k = ((flag) ? 1 : 0);
                if (mediaqueueitem == null)
                {
                    break MISSING_BLOCK_LABEL_178;
                }
                k = mediaqueueitem.getItemId();
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                zzm zzm1 = RemoteMediaPlayer.zzg(zzSz);
                zzo zzo = zzTa;
                int l = zzSQ;
                JSONObject jsonobject1 = zzSG;
                zzm1.zza(zzo, new int[] {
                    l
                }, k, jsonobject1);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L4:
                zze1;
                JVM INSTR monitorexit ;
                return;
_L2:
                k = zzSR;
                  goto _L3
                zzm1;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L4
                zzm1;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw zzm1;
                  goto _L3
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSQ = i;
                zzSR = j;
                zzSA = googleapiclient1;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueNext(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, 0, null, 1, null, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queuePrev(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, 0, null, -1, null, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueRemoveItem(GoogleApiClient googleapiclient, int i, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, i, googleapiclient, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final int zzSQ;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
label0:
                {
                    synchronized (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz))
                    {
                        if (RemoteMediaPlayer.zza(zzSz, zzSQ) != -1)
                        {
                            break label0;
                        }
                        setResult(zzn(new Status(0)));
                    }
                    return;
                }
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                zzm zzm1 = RemoteMediaPlayer.zzg(zzSz);
                zzo zzo = zzTa;
                int j = zzSQ;
                JSONObject jsonobject1 = zzSG;
                zzm1.zza(zzo, new int[] {
                    j
                }, jsonobject1);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                exception;
                zze1;
                JVM INSTR monitorexit ;
                throw exception;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSQ = i;
                zzSA = googleapiclient1;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueRemoveItems(GoogleApiClient googleapiclient, int ai[], JSONObject jsonobject)
        throws IllegalArgumentException
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, ai, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final int zzSK[];
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSK, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSK = ai;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueReorderItems(GoogleApiClient googleapiclient, int ai[], int i, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, ai, i, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final int zzSI;
            final int zzSL[];
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSL, zzSI, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSL = ai;
                zzSI = i;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueSetRepeatMode(GoogleApiClient googleapiclient, int i, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, i, jsonobject) {

            final GoogleApiClient zzSA;
            final int zzSF;
            final JSONObject zzSG;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, 0, null, 0, Integer.valueOf(zzSF), zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSF = i;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult queueUpdateItems(GoogleApiClient googleapiclient, MediaQueueItem amediaqueueitem[], JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, amediaqueueitem, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final MediaQueueItem zzSJ[];
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, 0, zzSJ, 0, null, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSJ = amediaqueueitem;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestStatus(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient) {

            final GoogleApiClient zzSA;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                super(googleapiclient);
            }
        });
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l)
    {
        return seek(googleapiclient, l, 0, null);
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l, int i)
    {
        return seek(googleapiclient, l, i, null);
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l, int i, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, l, i, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final long zzSS;
            final int zzST;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSS, zzST, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSS = l;
                zzST = i;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setActiveMediaTracks(GoogleApiClient googleapiclient, long al[])
    {
        if (al == null)
        {
            throw new IllegalArgumentException("trackIds cannot be null");
        } else
        {
            return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, al) {

                final GoogleApiClient zzSA;
                final long zzSB[];
                final RemoteMediaPlayer zzSz;

                protected void zza(zze zze1)
                {
                    zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                    zze1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                    RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSB);
                    RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                    zze1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    setResult(zzn(new Status(2100)));
                    RemoteMediaPlayer.zzf(zzSz).zzb(null);
                      goto _L1
                    obj;
                    zze1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.zzf(zzSz).zzb(null);
                    throw obj;
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zze)client);
                }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSB = al;
                super(googleapiclient);
            }
            });
        }
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onmetadataupdatedlistener)
    {
        zzSx = onmetadataupdatedlistener;
    }

    public void setOnPreloadStatusUpdatedListener(OnPreloadStatusUpdatedListener onpreloadstatusupdatedlistener)
    {
        zzSv = onpreloadstatusupdatedlistener;
    }

    public void setOnQueueStatusUpdatedListener(OnQueueStatusUpdatedListener onqueuestatusupdatedlistener)
    {
        zzSw = onqueuestatusupdatedlistener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onstatusupdatedlistener)
    {
        zzSy = onstatusupdatedlistener;
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag)
    {
        return setStreamMute(googleapiclient, flag, null);
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, flag, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final boolean zzSV;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSV, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
_L2:
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
                obj;
                  goto _L2
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSV = flag;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d)
        throws IllegalArgumentException
    {
        return setStreamVolume(googleapiclient, d, null);
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        if (Double.isInfinite(d) || Double.isNaN(d))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d).toString());
        } else
        {
            return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, d, jsonobject) {

                final GoogleApiClient zzSA;
                final JSONObject zzSG;
                final double zzSU;
                final RemoteMediaPlayer zzSz;

                protected void zza(zze zze1)
                {
                    zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                    zze1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                    RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSU, zzSG);
                    RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                    zze1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
_L2:
                    setResult(zzn(new Status(2100)));
                    RemoteMediaPlayer.zzf(zzSz).zzb(null);
                      goto _L1
                    obj;
                    zze1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.zzf(zzSz).zzb(null);
                    throw obj;
                    obj;
                      goto _L2
                    obj;
                      goto _L2
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zze)client);
                }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSU = d;
                zzSG = jsonobject;
                super(googleapiclient);
            }
            });
        }
    }

    public PendingResult setTextTrackStyle(GoogleApiClient googleapiclient, TextTrackStyle texttrackstyle)
    {
        if (texttrackstyle == null)
        {
            throw new IllegalArgumentException("trackStyle cannot be null");
        } else
        {
            return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, texttrackstyle) {

                final GoogleApiClient zzSA;
                final TextTrackStyle zzSC;
                final RemoteMediaPlayer zzSz;

                protected void zza(zze zze1)
                {
                    zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                    zze1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                    RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSC);
                    RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                    zze1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    setResult(zzn(new Status(2100)));
                    RemoteMediaPlayer.zzf(zzSz).zzb(null);
                      goto _L1
                    obj;
                    zze1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.zzf(zzSz).zzb(null);
                    throw obj;
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zze)client);
                }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSC = texttrackstyle;
                super(googleapiclient);
            }
            });
        }
    }

    public PendingResult stop(GoogleApiClient googleapiclient)
    {
        return stop(googleapiclient, null);
    }

    public PendingResult stop(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, jsonobject) {

            final GoogleApiClient zzSA;
            final JSONObject zzSG;
            final RemoteMediaPlayer zzSz;

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
                RemoteMediaPlayer.zzg(zzSz).zzb(zzTa, zzSG);
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzn(new Status(2100)));
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzf(zzSz).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzSz = RemoteMediaPlayer.this;
                zzSA = googleapiclient1;
                zzSG = jsonobject;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/cast/RemoteMediaPlayer$zzb$1

/* anonymous class */
    class zzb._cls1
        implements zzo
    {

        final zzb zzTb;

        public void zza(long l, int i, Object obj)
        {
            if (obj instanceof JSONObject)
            {
                obj = (JSONObject)obj;
            } else
            {
                obj = null;
            }
            zzTb.setResult(new zzc(new Status(i), ((JSONObject) (obj))));
        }

        public void zzy(long l)
        {
            zzTb.setResult(zzTb.zzn(new Status(2103)));
        }

            
            {
                zzTb = zzb1;
                super();
            }
    }

}
