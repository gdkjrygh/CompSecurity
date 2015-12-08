// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.datalib.innertube.model.media.e;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            n, o

public final class m
    implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener, n
{

    public static final Set a = com.google.android.apps.youtube.datalib.innertube.model.media.e.a();
    private o b;
    private MediaPlayer c;

    public m()
    {
        c = new MediaPlayer();
        c.setOnPreparedListener(this);
        c.setOnVideoSizeChangedListener(this);
        c.setOnBufferingUpdateListener(this);
        c.setOnSeekCompleteListener(this);
        c.setOnCompletionListener(this);
        c.setOnErrorListener(this);
        c.setOnInfoListener(this);
    }

    public final void a()
    {
        c.prepareAsync();
    }

    public final void a(float f1, float f2)
    {
        c.setVolume(f1, f2);
    }

    public final void a(int i)
    {
        c.seekTo(i);
    }

    public final void a(Context context, Uri uri, Map map)
    {
        c.setDataSource(context, uri, map);
    }

    public final void a(Surface surface)
    {
        c.setSurface(surface);
    }

    public final void a(SurfaceHolder surfaceholder)
    {
        c.setDisplay(surfaceholder);
    }

    public final void a(o o1)
    {
        b = o1;
    }

    public final void a(boolean flag)
    {
        c.setScreenOnWhilePlaying(flag);
    }

    public final void b()
    {
        c.start();
    }

    public final void b(int i)
    {
        c.setVideoScalingMode(i);
    }

    public final void c()
    {
        c.pause();
    }

    public final void c(int i)
    {
        c.setAudioStreamType(i);
    }

    public final void d()
    {
        c.release();
    }

    public final int e()
    {
        return c.getCurrentPosition();
    }

    public final int f()
    {
        return c.getDuration();
    }

    public final Set h()
    {
        return a;
    }

    public final void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        if (b != null)
        {
            b.d(i);
        }
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (b != null)
        {
            b.g();
        }
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        if (b != null)
        {
            return b.a(i, j);
        } else
        {
            return false;
        }
    }

    public final boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (b != null)
        {
            return b.a(this, i, j);
        } else
        {
            return false;
        }
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        if (b != null)
        {
            b.b(this);
        }
    }

    public final void onSeekComplete(MediaPlayer mediaplayer)
    {
        if (b != null)
        {
            b.a(this);
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        if (b != null)
        {
            b.b(this, i, j);
        }
    }

}
