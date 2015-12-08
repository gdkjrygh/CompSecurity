// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments.navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.a.a.i;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.utils.al;
import java.text.ParseException;

// Referenced classes of package com.google.android.apps.youtube.app.fragments.navigation:
//            g

public class WatchDescriptor
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private static final String EXTRA_INVENTORY_IDENTIFIER = "android.intent.extra.inventory_identifier";
    private final i localProto;
    private final PlaybackStartDescriptor playbackStartDescriptor;

    private WatchDescriptor(i k)
    {
        c.a(k);
        playbackStartDescriptor = new PlaybackStartDescriptor(k.a());
        localProto = k;
    }

    WatchDescriptor(i k, g g1)
    {
        this(k);
    }

    public WatchDescriptor(PlaybackStartDescriptor playbackstartdescriptor)
    {
        localProto = new i();
        playbackStartDescriptor = (PlaybackStartDescriptor)c.a(playbackstartdescriptor);
    }

    public static final WatchDescriptor createFromExternalIntent(Intent intent)
    {
        c.a(intent);
        Object obj = intent.getData();
        intent = intent.getExtras();
        try
        {
            obj = al.a(((Uri) (obj)));
            obj = new WatchDescriptor(new PlaybackStartDescriptor(((al) (obj)).a, -1, ((al) (obj)).c, WatchFeature.EXTERNAL_URL));
            ((WatchDescriptor) (obj)).setFinishOnEnded(intent.getBoolean("finish_on_ended", false));
            ((WatchDescriptor) (obj)).setForceFullscreen(intent.getBoolean("force_fullscreen", false));
            ((WatchDescriptor) (obj)).setMustAuthenticate(intent.getBoolean("must_authenticate", false));
            ((WatchDescriptor) (obj)).setNoAnimation(intent.getBoolean("no_animation", false));
            ((WatchDescriptor) (obj)).setSkipRemoteDialog(intent.getBoolean("skip_remote_route_dialog", false));
            ((WatchDescriptor) (obj)).setTvId(intent.getString("youtube_tv_uid", ""));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return ((WatchDescriptor) (obj));
    }

    public static final WatchDescriptor createFromMediaSearchIntent(Intent intent)
    {
        c.a(intent);
        intent = intent.getExtras();
        try
        {
            intent = intent.getStringArray("android.intent.extra.inventory_identifier");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (intent.length != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        intent = al.a(Uri.parse(intent[0]));
        intent = new WatchDescriptor(new PlaybackStartDescriptor(((al) (intent)).a, -1, ((al) (intent)).c, WatchFeature.EXTERNAL_URL));
        return intent;
        return null;
    }

    public static final WatchDescriptor createFromPlaylistId(String s, String s1)
    {
        if (s1 == null)
        {
            s1 = "";
        }
        return new WatchDescriptor(new PlaybackStartDescriptor(s1, s, -1, 0, WatchFeature.NO_FEATURE));
    }

    public int describeContents()
    {
        return 0;
    }

    public PlaybackStartDescriptor getPlaybackStartDescriptor()
    {
        return playbackStartDescriptor;
    }

    public String getTvId()
    {
        return localProto.j();
    }

    public boolean mustAuthenticate()
    {
        return localProto.b();
    }

    public boolean noAnimation()
    {
        return localProto.g();
    }

    public void setFinishOnEnded(boolean flag)
    {
        localProto.b(flag);
    }

    public void setForceFullscreen(boolean flag)
    {
        localProto.c(flag);
    }

    public void setKeepHistory(boolean flag)
    {
        localProto.f(flag);
    }

    public void setMustAuthenticate(boolean flag)
    {
        localProto.a(flag);
    }

    public void setNoAnimation(boolean flag)
    {
        localProto.d(flag);
    }

    public void setSkipRemoteDialog(boolean flag)
    {
        localProto.e(flag);
    }

    public void setTvId(String s)
    {
        localProto.a(s);
    }

    public boolean shouldFinishOnEnded()
    {
        return localProto.c();
    }

    public boolean shouldForceFullscreen()
    {
        return localProto.d();
    }

    public boolean shouldKeepHistory()
    {
        return localProto.i();
    }

    public boolean shouldSkipRemoteDialog()
    {
        return localProto.h();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        localProto.a(playbackStartDescriptor.getPlaybackStartDescriptorProto());
        j.a(parcel, localProto);
    }

}
