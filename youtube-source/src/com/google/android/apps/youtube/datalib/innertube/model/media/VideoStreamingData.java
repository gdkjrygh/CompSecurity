// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.a.a.a.a.fj;
import com.google.a.a.a.a.sb;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.media:
//            l, FormatStream, f, g, 
//            k, PlayerConfig

public class VideoStreamingData
    implements Parcelable
{

    public static final int AUDIO_ONLY_STREAM_ITAG = 140;
    public static final android.os.Parcelable.Creator CREATOR = new l();
    private static final long NO_EXPIRATION_TIME = 0x7fffffffffffffffL;
    private final List adaptiveFormatStreams = new ArrayList();
    private final List allFormatStreams = new ArrayList();
    private final long expirationInElapsedTimeMillis;
    private final FormatStream hlsStream;
    private final boolean isLive;
    private final List progressiveFormatStreams = new ArrayList();
    private final sb streamingData;
    private final long videoDurationMillis;
    private final String videoId;

    public VideoStreamingData(sb sb1, String s, long l1, long l2, boolean flag)
    {
        boolean flag1 = false;
        super();
        streamingData = sb1;
        videoId = s;
        videoDurationMillis = l1;
        isLive = flag;
        fj afj[];
        int j1;
        if (sb1.b != 0L)
        {
            expirationInElapsedTimeMillis = TimeUnit.MILLISECONDS.convert(sb1.b, TimeUnit.SECONDS) + l2;
        } else
        {
            expirationInElapsedTimeMillis = 0x7fffffffffffffffL;
        }
        if (!TextUtils.isEmpty(sb1.f))
        {
            hlsStream = FormatStream.forHls(Uri.parse(sb1.f), s, l1);
        } else
        {
            hlsStream = null;
        }
        afj = sb1.c;
        j1 = afj.length;
        for (int i = 0; i < j1; i++)
        {
            Object obj1 = afj[i];
            if (!((fj) (obj1)).s)
            {
                obj1 = new FormatStream(((fj) (obj1)), s, l1);
                allFormatStreams.add(obj1);
                progressiveFormatStreams.add(obj1);
            }
        }

        sb1 = sb1.d;
        j1 = sb1.length;
        for (int i1 = ((flag1) ? 1 : 0); i1 < j1; i1++)
        {
            Object obj = sb1[i1];
            if (!((fj) (obj)).s)
            {
                obj = new FormatStream(((fj) (obj)), s, l1);
                allFormatStreams.add(obj);
                adaptiveFormatStreams.add(obj);
            }
        }

    }

    public static VideoStreamingData create(sb sb1, String s, long l1, long l2, boolean flag)
    {
        return new VideoStreamingData(sb1, s, l1, l2, flag);
    }

    private Set getOfflineSupportedMimeTypes(boolean flag)
    {
        if (flag)
        {
            return f.a;
        } else
        {
            return g.a;
        }
    }

    private List sortAndFilter(List list, Set set)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            FormatStream formatstream = (FormatStream)list.next();
            String s = formatstream.getSimpleMimeType();
            boolean flag;
            if (s != null && set.contains(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                arraylist.add(formatstream);
            }
        } while (true);
        Collections.sort(arraylist, new k(this));
        return arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
_L2:
        return false;
        if (obj == null || !getClass().equals(obj.getClass())) goto _L2; else goto _L1
_L1:
        Object obj1 = (VideoStreamingData)obj;
        if (b.a(getVideoId(), ((VideoStreamingData) (obj1)).getVideoId()) && b.a(getHlsManifestUri(), ((VideoStreamingData) (obj1)).getHlsManifestUri()) && isLive() == ((VideoStreamingData) (obj1)).isLive() && getVideoDurationMillis() == ((VideoStreamingData) (obj1)).getVideoDurationMillis() && getAllFormatStreams().size() == ((VideoStreamingData) (obj1)).getAllFormatStreams().size() && isLive == ((VideoStreamingData) (obj1)).isLive && expirationInElapsedTimeMillis == ((VideoStreamingData) (obj1)).expirationInElapsedTimeMillis)
        {
            obj = getAllFormatStreams();
            obj1 = ((VideoStreamingData) (obj1)).getAllFormatStreams();
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= getAllFormatStreams().size())
                    {
                        break label1;
                    }
                    if (!b.a(((List) (obj)).get(i), ((List) (obj1)).get(i)))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L2; else goto _L3
_L3:
        return true;
    }

    public List getAdaptiveFormatStreams()
    {
        return Collections.unmodifiableList(adaptiveFormatStreams);
    }

    public List getAllFormatStreams()
    {
        return Collections.unmodifiableList(allFormatStreams);
    }

    public FormatStream getAudioOnlyStream()
    {
        return getFormatStreamByItag(140);
    }

    public long getExpirationInElapsedTimeMillis()
    {
        return expirationInElapsedTimeMillis;
    }

    public int getExpiredForSeconds(long l1)
    {
        if (!isExpired(l1))
        {
            return 0;
        } else
        {
            return (int)TimeUnit.SECONDS.convert(l1 - expirationInElapsedTimeMillis, TimeUnit.MILLISECONDS);
        }
    }

    public FormatStream getFormatStreamByItag(int i)
    {
        for (Iterator iterator = allFormatStreams.iterator(); iterator.hasNext();)
        {
            FormatStream formatstream = (FormatStream)iterator.next();
            if (formatstream.getItag() == i)
            {
                return formatstream;
            }
        }

        return null;
    }

    public Uri getHlsManifestUri()
    {
        if (streamingData.f != null)
        {
            return Uri.parse(streamingData.f);
        } else
        {
            return null;
        }
    }

    public FormatStream getHlsStream()
    {
        return hlsStream;
    }

    public FormatStream getOfflineVideoStream(int i, PlayerConfig playerconfig)
    {
        Set set;
        boolean flag;
        if (playerconfig.isExoPlayerEnabled() && !adaptiveFormatStreams.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        set = getOfflineSupportedMimeTypes(flag);
        if (flag)
        {
            playerconfig = getAdaptiveFormatStreams();
        } else
        {
            playerconfig = getProgressiveFormatStreams();
        }
        for (playerconfig = sortAndFilter(playerconfig, set).iterator(); playerconfig.hasNext();)
        {
            FormatStream formatstream = (FormatStream)playerconfig.next();
            if (formatstream.getHeight() <= i)
            {
                return formatstream;
            }
        }

        return null;
    }

    public List getProgressiveFormatStreams()
    {
        return Collections.unmodifiableList(progressiveFormatStreams);
    }

    public long getVideoDurationMillis()
    {
        return videoDurationMillis;
    }

    public String getVideoId()
    {
        return videoId;
    }

    public boolean hasAudioOnlyStream()
    {
        return hasStreamForItag(140);
    }

    public boolean hasStreamForItag(int i)
    {
        return getFormatStreamByItag(i) != null;
    }

    public int hashCode()
    {
        c.b(false);
        return 0;
    }

    public boolean isAudioOnly()
    {
        return allFormatStreams.size() == 1 && hasAudioOnlyStream();
    }

    public boolean isExpired(long l1)
    {
        return l1 >= expirationInElapsedTimeMillis;
    }

    public boolean isLive()
    {
        return isLive;
    }

    public boolean isOffline()
    {
        for (Iterator iterator = allFormatStreams.iterator(); iterator.hasNext();)
        {
            if (!((FormatStream)iterator.next()).isLocal())
            {
                return false;
            }
        }

        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(parcel, streamingData);
        parcel.writeString(videoId);
        parcel.writeLong(videoDurationMillis);
        parcel.writeLong(expirationInElapsedTimeMillis);
        if (isLive)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
