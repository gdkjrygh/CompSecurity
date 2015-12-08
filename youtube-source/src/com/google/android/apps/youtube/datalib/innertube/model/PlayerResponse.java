// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.a.a.a.a.bh;
import com.google.a.a.a.a.fj;
import com.google.a.a.a.a.gr;
import com.google.a.a.a.a.ig;
import com.google.a.a.a.a.nc;
import com.google.a.a.a.a.ne;
import com.google.a.a.a.a.ng;
import com.google.a.a.a.a.nh;
import com.google.a.a.a.a.nk;
import com.google.a.a.a.a.nw;
import com.google.a.a.a.a.sb;
import com.google.a.a.a.a.tz;
import com.google.a.a.a.a.ua;
import com.google.a.a.a.a.uh;
import com.google.a.a.a.a.v;
import com.google.a.a.a.a.vh;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            y, v, InfoCardCollection, w, 
//            PlaybackTracking, ap

public class PlayerResponse
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new y();
    private Uri captionsTracksUri;
    private InfoCardCollection infoCardCollectionRenderer;
    private com.google.android.apps.youtube.datalib.innertube.model.v offlineState;
    private w playabilityStatus;
    private PlaybackTracking playbackTracking;
    private PlayerConfig playerConfig;
    private final nw playerResponseProto;
    private final long streamingDataTimestampElapsedMillis;
    private VideoStreamingData videoStreamingData;

    public PlayerResponse(nw nw1, long l)
    {
        playerResponseProto = (nw)c.a(nw1);
        streamingDataTimestampElapsedMillis = l;
    }

    public static PlayerResponse fromBlob(byte abyte0[], long l)
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            nw nw1 = new nw();
            com.google.protobuf.nano.c.a(nw1, abyte0);
            abyte0 = new PlayerResponse(nw1, l);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    private SparseArray getFormatsSparseArrayByItag(fj afj[])
    {
        SparseArray sparsearray = new SparseArray();
        for (int i = afj.length - 1; i >= 0; i--)
        {
            fj fj1 = afj[i];
            sparsearray.put(fj1.b, fj1);
        }

        return sparsearray;
    }

    private static String getVideoIdFromProto(nw nw1)
    {
        if (nw1.j != null)
        {
            return nw1.j.b;
        } else
        {
            return "";
        }
    }

    private fj[] toValuesArray(SparseArray sparsearray)
    {
        int i = sparsearray.size();
        fj afj[] = new fj[i];
        for (i--; i >= 0; i--)
        {
            afj[i] = (fj)sparsearray.valueAt(i);
        }

        return afj;
    }

    public PlayerResponse cloneAndMergeOfflineStreams(FormatStream formatstream, FormatStream formatstream1)
    {
        long l = 0L;
        sb sb1 = playerResponseProto.d;
        if (sb1 != null)
        {
            l = sb1.b;
        }
        return cloneAndMergeOfflineStreams(formatstream, formatstream1, streamingDataTimestampElapsedMillis, l);
    }

    public PlayerResponse cloneAndMergeOfflineStreams(FormatStream formatstream, FormatStream formatstream1, long l, long l1)
    {
        nw nw1 = new nw();
        com.google.protobuf.nano.c.a(nw1, com.google.protobuf.nano.c.a(playerResponseProto));
        sb sb1 = nw1.d;
        if (sb1 != null)
        {
            SparseArray sparsearray;
            if (l1 > 0L)
            {
                sb1.b = l1;
            } else
            {
                sb1.b = 0L;
            }
            sparsearray = getFormatsSparseArrayByItag(sb1.d);
            if (formatstream != null)
            {
                if (formatstream.isAdaptive())
                {
                    sparsearray.put(formatstream.getItag(), formatstream.getFormatStreamProto());
                } else
                {
                    SparseArray sparsearray1 = getFormatsSparseArrayByItag(sb1.c);
                    sparsearray1.put(formatstream.getItag(), formatstream.getFormatStreamProto());
                    sb1.c = toValuesArray(sparsearray1);
                }
            }
            if (formatstream1 != null)
            {
                sparsearray.put(formatstream1.getItag(), formatstream1.getFormatStreamProto());
            }
            sb1.d = toValuesArray(sparsearray);
        }
        return new PlayerResponse(nw1, l);
    }

    public PlayerResponse cloneAndReplaceOfflineState(com.google.android.apps.youtube.datalib.innertube.model.v v1)
    {
        nw nw1 = new nw();
        com.google.protobuf.nano.c.a(nw1, com.google.protobuf.nano.c.a(playerResponseProto));
        nw1.l = v1.a();
        return new PlayerResponse(nw1, streamingDataTimestampElapsedMillis);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof PlayerResponse))
            {
                return false;
            }
            obj = (PlayerResponse)obj;
            if (!b.a(getVideoId(), ((PlayerResponse) (obj)).getVideoId()) || !b.a(getPlayabilityStatus(), ((PlayerResponse) (obj)).getPlayabilityStatus()))
            {
                return false;
            }
        }
        return true;
    }

    public Uri getCaptionTracksUri()
    {
        if (captionsTracksUri == null && playerResponseProto.i != null && playerResponseProto.i.b != null)
        {
            captionsTracksUri = Uri.parse(playerResponseProto.i.b.b);
        }
        return captionsTracksUri;
    }

    public ne getExpandedAnnotation()
    {
        if (playerResponseProto.k != null)
        {
            return playerResponseProto.k.b;
        } else
        {
            return null;
        }
    }

    public gr getHeartbeatParams()
    {
        return playerResponseProto.f;
    }

    public InfoCardCollection getInfoCardCollection()
    {
        if (infoCardCollectionRenderer == null && playerResponseProto.r != null && playerResponseProto.r.b != null)
        {
            infoCardCollectionRenderer = new InfoCardCollection(playerResponseProto.r.b);
        }
        return infoCardCollectionRenderer;
    }

    public Map getInstreamAdPlayerResponseMap()
    {
        HashMap hashmap = new HashMap();
        nc anc[] = playerResponseProto.g;
        int k = anc.length;
        for (int i = 0; i < k; i++)
        {
            Object obj = anc[i];
            if (((nc) (obj)).e != null && ((nc) (obj)).e.b != null)
            {
                obj = new PlayerResponse(((nc) (obj)).e.b, streamingDataTimestampElapsedMillis);
                hashmap.put(((PlayerResponse) (obj)).getVideoId(), obj);
            }
        }

        if (hashmap.isEmpty())
        {
            return Collections.emptyMap();
        } else
        {
            return Collections.unmodifiableMap(hashmap);
        }
    }

    public int getLengthSeconds()
    {
        if (playerResponseProto.j != null)
        {
            return (int)playerResponseProto.j.d;
        } else
        {
            return 0;
        }
    }

    public com.google.android.apps.youtube.datalib.innertube.model.v getOfflineState()
    {
        if (offlineState == null && playerResponseProto.l != null)
        {
            offlineState = new com.google.android.apps.youtube.datalib.innertube.model.v(playerResponseProto.l);
        }
        return offlineState;
    }

    public w getPlayabilityStatus()
    {
        if (playabilityStatus == null && playerResponseProto.c != null)
        {
            playabilityStatus = new w(playerResponseProto.c, isForOffline());
        }
        return playabilityStatus;
    }

    public PlaybackTracking getPlaybackTracking()
    {
        if (playbackTracking == null)
        {
            playbackTracking = new PlaybackTracking(playerResponseProto.h);
        }
        return playbackTracking;
    }

    public PlayerConfig getPlayerConfig(com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType exoplayeractivationtype)
    {
        if (playerConfig == null)
        {
            c.a(exoplayeractivationtype);
            if (playerResponseProto.m != null)
            {
                exoplayeractivationtype = new PlayerConfig(playerResponseProto.m, exoplayeractivationtype);
            } else
            {
                exoplayeractivationtype = new PlayerConfig(new nh(), exoplayeractivationtype);
            }
            playerConfig = exoplayeractivationtype;
        }
        return playerConfig;
    }

    public ap getThumbnailDetails()
    {
        com.google.a.a.a.a.sx sx;
        if (playerResponseProto.j != null)
        {
            sx = playerResponseProto.j.l;
        } else
        {
            sx = null;
        }
        return new ap(sx);
    }

    public String getTitle()
    {
        if (playerResponseProto.j != null)
        {
            return playerResponseProto.j.c;
        } else
        {
            return "";
        }
    }

    public tz getVastProto()
    {
        nc anc[] = playerResponseProto.g;
        int k = anc.length;
        for (int i = 0; i < k; i++)
        {
            nc nc1 = anc[i];
            if (nc1.f != null)
            {
                return nc1.f.b;
            }
        }

        return null;
    }

    public String getVideoId()
    {
        return getVideoIdFromProto(playerResponseProto);
    }

    public VideoStreamingData getVideoStreamingData()
    {
        if (videoStreamingData == null && playerResponseProto.d != null)
        {
            long l;
            if (playerResponseProto.j != null)
            {
                l = playerResponseProto.j.d;
            } else
            {
                l = 0L;
            }
            videoStreamingData = VideoStreamingData.create(playerResponseProto.d, getVideoId(), l * 1000L, streamingDataTimestampElapsedMillis, isLive());
        }
        return videoStreamingData;
    }

    public String getVmapXml()
    {
        nc anc[] = playerResponseProto.g;
        int k = anc.length;
        for (int i = 0; i < k; i++)
        {
            nc nc1 = anc[i];
            if (nc1.b != null)
            {
                return nc1.b.b;
            }
        }

        return null;
    }

    public int hashCode()
    {
        int k = getVideoId().hashCode();
        int i;
        if (getPlayabilityStatus() == null)
        {
            i = 0;
        } else
        {
            i = getPlayabilityStatus().hashCode();
        }
        return i + (k + 19) * 19;
    }

    public boolean isForOffline()
    {
        return getOfflineState() != null;
    }

    public boolean isLive()
    {
        if (playerResponseProto.j != null)
        {
            return playerResponseProto.j.e;
        } else
        {
            return false;
        }
    }

    public PlayerResponse sanitizeForOffline()
    {
        nw nw1 = new nw();
        com.google.protobuf.nano.c.a(nw1, com.google.protobuf.nano.c.a(playerResponseProto));
        sb sb1 = nw1.d;
        if (sb1 != null)
        {
            sb1.d = fj.a;
            sb1.c = fj.a;
        }
        nw1.g = nc.a;
        return new PlayerResponse(nw1, streamingDataTimestampElapsedMillis);
    }

    public byte[] toBlob()
    {
        return com.google.protobuf.nano.c.a(playerResponseProto);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(parcel, playerResponseProto);
        parcel.writeLong(streamingDataTimestampElapsedMillis);
    }

}
