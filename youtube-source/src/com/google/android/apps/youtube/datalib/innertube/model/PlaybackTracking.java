// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.a.a.a.a.nb;
import com.google.a.a.a.a.tb;
import com.google.android.apps.youtube.a.a.e;
import com.google.android.apps.youtube.a.a.h;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            x, TrackingUrl

public class PlaybackTracking
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new x();
    public static final String DEFAULT_QOE_BASE_URL = "https://s.youtube.com/api/stats/qoe";
    public static final String DEFAULT_VSS2_DELAYPLAY_BASE_URL = "https://s.youtube.com/api/stats/delayplay";
    public static final String DEFAULT_VSS2_PLAYBACK_BASE_URL = "https://s.youtube.com/api/stats/playback";
    public static final String DEFAULT_VSS2_WATCHTIME_BASE_URL = "https://s.youtube.com/api/stats/watchtime";
    private static final Set PTRACKING_CLIENT_PARAMS;
    private static final Set REMARKETING_CLIENT_PARAMS;
    private final List playbackTrackingUrls;
    private final TrackingUrl qoeTrackingUrl;
    private final TrackingUrl vss2DelayplayTrackingUrl;
    private final TrackingUrl vss2PlaybackTrackingUrl;
    private final TrackingUrl vss2WatchtimeTrackingUrl;

    public PlaybackTracking()
    {
        this(((nb) (null)));
    }

    public PlaybackTracking(nb nb1)
    {
        String s;
        if (nb1 != null && nb1.b != null)
        {
            s = nb1.b.b;
        } else
        {
            s = "https://s.youtube.com/api/stats/playback";
        }
        vss2PlaybackTrackingUrl = new TrackingUrl(s, TrackingUrl.NO_CLIENT_PARAMS);
        if (nb1 != null && nb1.c != null)
        {
            vss2DelayplayTrackingUrl = new TrackingUrl(nb1.c, TrackingUrl.NO_CLIENT_PARAMS);
        } else
        {
            vss2DelayplayTrackingUrl = new TrackingUrl("https://s.youtube.com/api/stats/delayplay", TrackingUrl.NO_CLIENT_PARAMS);
        }
        if (nb1 != null && nb1.d != null)
        {
            s = nb1.d.b;
        } else
        {
            s = "https://s.youtube.com/api/stats/watchtime";
        }
        vss2WatchtimeTrackingUrl = new TrackingUrl(s, TrackingUrl.NO_CLIENT_PARAMS);
        if (nb1 != null && nb1.f != null)
        {
            s = nb1.f.b;
        } else
        {
            s = "https://s.youtube.com/api/stats/qoe";
        }
        qoeTrackingUrl = new TrackingUrl(s, TrackingUrl.NO_CLIENT_PARAMS);
        playbackTrackingUrls = new ArrayList();
        if (nb1 != null && nb1.e != null)
        {
            playbackTrackingUrls.add(new TrackingUrl(nb1.e.b, PTRACKING_CLIENT_PARAMS, 0));
        }
        if (nb1 != null && nb1.g != null)
        {
            playbackTrackingUrls.add(new TrackingUrl(nb1.g.b, REMARKETING_CLIENT_PARAMS, nb1.g.c));
        }
    }

    public PlaybackTracking(e e1)
    {
        if (e1.a())
        {
            vss2PlaybackTrackingUrl = new TrackingUrl(e1.b());
        } else
        {
            vss2PlaybackTrackingUrl = new TrackingUrl("https://s.youtube.com/api/stats/playback", TrackingUrl.NO_CLIENT_PARAMS);
        }
        if (e1.c())
        {
            vss2DelayplayTrackingUrl = new TrackingUrl(e1.d());
        } else
        {
            vss2DelayplayTrackingUrl = new TrackingUrl("https://s.youtube.com/api/stats/delayplay", TrackingUrl.NO_CLIENT_PARAMS);
        }
        if (e1.g())
        {
            vss2WatchtimeTrackingUrl = new TrackingUrl(e1.h());
        } else
        {
            vss2WatchtimeTrackingUrl = new TrackingUrl("https://s.youtube.com/api/stats/watchtime", TrackingUrl.NO_CLIENT_PARAMS);
        }
        if (e1.i())
        {
            qoeTrackingUrl = new TrackingUrl(e1.j());
        } else
        {
            qoeTrackingUrl = new TrackingUrl("https://s.youtube.com/api/stats/qoe", TrackingUrl.NO_CLIENT_PARAMS);
        }
        playbackTrackingUrls = new ArrayList();
        h h1;
        for (e1 = e1.k().iterator(); e1.hasNext(); playbackTrackingUrls.add(new TrackingUrl(h1)))
        {
            h1 = (h)e1.next();
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass().equals(obj.getClass()))
        {
            obj = (PlaybackTracking)obj;
            if (b.a(vss2PlaybackTrackingUrl, ((PlaybackTracking) (obj)).vss2PlaybackTrackingUrl) && b.a(vss2DelayplayTrackingUrl, ((PlaybackTracking) (obj)).vss2DelayplayTrackingUrl) && b.a(vss2WatchtimeTrackingUrl, ((PlaybackTracking) (obj)).vss2WatchtimeTrackingUrl) && b.a(qoeTrackingUrl, ((PlaybackTracking) (obj)).qoeTrackingUrl) && b.a(playbackTrackingUrls, ((PlaybackTracking) (obj)).playbackTrackingUrls))
            {
                return true;
            }
        }
        return false;
    }

    public List getPlaybackTrackingUrls()
    {
        return playbackTrackingUrls;
    }

    public TrackingUrl getQoeTrackingUrl()
    {
        return qoeTrackingUrl;
    }

    public TrackingUrl getVss2DelayplayTrackingUrl()
    {
        return vss2DelayplayTrackingUrl;
    }

    public TrackingUrl getVss2PlaybackTrackingUrl()
    {
        return vss2PlaybackTrackingUrl;
    }

    public TrackingUrl getVss2WatchtimeTrackingUrl()
    {
        return vss2WatchtimeTrackingUrl;
    }

    public e toPlaybackTrackingProto()
    {
        e e1 = new e();
        e1.a(vss2PlaybackTrackingUrl.toTrackingUrlProto()).b(vss2DelayplayTrackingUrl.toTrackingUrlProto()).c(vss2WatchtimeTrackingUrl.toTrackingUrlProto()).d(qoeTrackingUrl.toTrackingUrlProto());
        for (Iterator iterator = playbackTrackingUrls.iterator(); iterator.hasNext(); e1.e(((TrackingUrl)iterator.next()).toTrackingUrlProto())) { }
        return e1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(parcel, toPlaybackTrackingProto());
    }

    static 
    {
        HashSet hashset = new HashSet();
        PTRACKING_CLIENT_PARAMS = hashset;
        hashset.add(TrackingUrl.ClientParam.CPN);
        hashset = new HashSet();
        REMARKETING_CLIENT_PARAMS = hashset;
        hashset.add(TrackingUrl.ClientParam.MS);
    }
}
