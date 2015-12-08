// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.me;
import com.google.a.a.a.a.wb;
import com.google.a.a.a.a.wl;
import com.google.android.apps.youtube.a.a.d;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.protobuf.micro.a;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.model:
//            a

public class PlaybackStartDescriptor
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.apps.youtube.core.player.model.a();
    public static final String NO_PLAYLIST_ID = "";
    public static final int NO_PLAYLIST_INDEX = -1;
    public static final String NO_VIDEO_ID = "";
    public static final int NO_VIDEO_START_TIME = 0;
    private final d localProto;

    public PlaybackStartDescriptor(kz kz1, WatchFeature watchfeature)
    {
        c.a(kz1);
        localProto = new d();
        d d1;
        if (kz1.i != null)
        {
            wb wb1 = kz1.i;
            localProto.a(wb1.b);
            localProto.c(wb1.c);
            localProto.a(valueOrMissingPlaylistIndex(wb1.d, wb1.c));
            localProto.d(wb1.f);
            localProto.e(wb1.j);
            localProto.b(wb1.g);
            localProto.a(false);
        } else
        if (kz1.u != null)
        {
            wl wl1 = kz1.u;
            localProto.a("");
            localProto.c(wl1.b);
            localProto.a(wl1.c);
            localProto.d(wl1.e);
            localProto.e("");
            localProto.b(false);
            localProto.a(false);
        } else
        if (kz1.w != null)
        {
            me me1 = kz1.w;
            localProto.a(me1.b);
            localProto.c(me1.c);
            localProto.a(valueOrMissingPlaylistIndex(me1.d, me1.c));
            localProto.d(me1.e);
            localProto.e("");
            localProto.b(false);
            localProto.a(true);
        } else
        {
            throw new IllegalArgumentException("Navigation endpoint does not contain watch data");
        }
        d1 = localProto;
        if (kz1.b != null)
        {
            kz1 = a.a(kz1.b);
        } else
        {
            kz1 = a.a;
        }
        d1.a(kz1);
        localProto.b(watchfeature.ordinal());
        localProto.c(0);
        localProto.c(true);
        c.b(validate());
    }

    public PlaybackStartDescriptor(d d1)
    {
        c.a(d1);
        localProto = d1;
    }

    public PlaybackStartDescriptor(String s, String s1, int i, int k, WatchFeature watchfeature)
    {
        localProto = new d();
        d d1 = localProto;
        if (s == null)
        {
            s = "";
        }
        d1.a(s);
        s = localProto;
        if (s1 == null)
        {
            s1 = "";
        }
        s.c(s1);
        localProto.a(i);
        localProto.b(watchfeature.ordinal());
        localProto.c(k);
        localProto.d("");
        localProto.e("");
        localProto.a(a.a);
        localProto.b(false);
        localProto.a(false);
        c.b(validate());
    }

    public PlaybackStartDescriptor(List list, int i, int k, WatchFeature watchfeature)
    {
        localProto = new d();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (!TextUtils.isEmpty(s))
            {
                localProto.b(s);
            }
        } while (true);
        localProto.c("");
        localProto.a(i);
        localProto.c(k);
        localProto.b(watchfeature.ordinal());
        localProto.d("");
        localProto.e("");
        localProto.a(a.a);
        localProto.b(false);
        localProto.a(false);
        c.b(validate());
    }

    private int valueOrMissingPlaylistIndex(int i, String s)
    {
        int k = i;
        if (i == 0)
        {
            k = i;
            if (TextUtils.isEmpty(s))
            {
                k = -1;
            }
        }
        return k;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getClickTrackingParams()
    {
        return localProto.i().b();
    }

    public String getParams()
    {
        return localProto.h();
    }

    public d getPlaybackStartDescriptorProto()
    {
        return localProto;
    }

    public String getPlayerParams()
    {
        return localProto.o();
    }

    public String getPlaylistId()
    {
        return localProto.d();
    }

    public int getPlaylistIndex()
    {
        return localProto.g();
    }

    public String getVideoId()
    {
        return localProto.a();
    }

    public List getVideoIds()
    {
        if (localProto.c() > 0)
        {
            return localProto.b();
        } else
        {
            return null;
        }
    }

    public int getVideoStartTime()
    {
        return localProto.n();
    }

    public WatchFeature getWatchFeature()
    {
        return WatchFeature.fromOrdinal(localProto.m());
    }

    public boolean isFromRemoteQueue()
    {
        String s = getPlaylistId();
        return s != null && s.startsWith("RQ");
    }

    public boolean isInnerTube()
    {
        return localProto.l();
    }

    public boolean isOffline()
    {
        return localProto.j();
    }

    public boolean isScriptedPlay()
    {
        return localProto.r();
    }

    public boolean isWatchNextDisabled()
    {
        return localProto.q();
    }

    public void setOffline(boolean flag)
    {
        localProto.a(flag);
    }

    public void setScriptedPlay(boolean flag)
    {
        localProto.f(flag);
    }

    public void setStartPaused(boolean flag)
    {
        localProto.d(flag);
    }

    public void setWatchNextDisabled(boolean flag)
    {
        localProto.e(flag);
    }

    public boolean shouldContinuePlayback()
    {
        return localProto.k();
    }

    public boolean shouldStartPaused()
    {
        return localProto.p();
    }

    public String toString()
    {
        String s1 = getVideoId();
        String s2 = getPlaylistId();
        int i = getPlaylistIndex();
        String s;
        if (getVideoIds() != null)
        {
            s = getVideoIds().toString();
        } else
        {
            s = "";
        }
        return String.format("PlaybackStartDescriptor:\n  VideoId:%s\n  PlaylistId:%s\n  Index:%d\n  VideoIds:%s", new Object[] {
            s1, s2, Integer.valueOf(i), s
        });
    }

    boolean validate()
    {
        if (TextUtils.isEmpty(getVideoId()) && TextUtils.isEmpty(getPlaylistId()) && getVideoIds() == null)
        {
            L.b((new StringBuilder("Invalid PlaybackStartDescriptor\n")).append(toString()).toString());
            return false;
        } else
        {
            return true;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(parcel, getPlaybackStartDescriptorProto());
    }

}
