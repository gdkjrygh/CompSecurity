// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bj, db

public final class bt extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{

    private final db a;
    private final MediaController b;
    private final bj c = new bj(this);
    private final VideoView d;
    private long e;
    private String f;

    public bt(Context context, db db1)
    {
        super(context);
        a = db1;
        d = new VideoView(context);
        db1 = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        addView(d, db1);
        b = new MediaController(context);
        c.b();
        d.setOnCompletionListener(this);
        d.setOnPreparedListener(this);
        d.setOnErrorListener(this);
    }

    public static void a(db db1, String s, String s1)
    {
        HashMap hashmap;
        boolean flag;
        byte byte0;
        if (s1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 3;
        }
        hashmap = new HashMap(byte0);
        hashmap.put("what", s);
        if (!flag)
        {
            hashmap.put("extra", s1);
        }
        a(db1, "error", ((Map) (hashmap)));
    }

    private static void a(db db1, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s1, s2);
        a(db1, s, ((Map) (hashmap)));
    }

    private static void a(db db1, String s, Map map)
    {
        map.put("event", s);
        db1.a("onVideoEvent", map);
    }

    public final void a()
    {
        c.a();
        d.stopPlayback();
    }

    public final void a(int i)
    {
        d.seekTo(i);
    }

    public final void a(MotionEvent motionevent)
    {
        d.dispatchTouchEvent(motionevent);
    }

    public final void a(String s)
    {
        f = s;
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            d.setMediaController(b);
            return;
        } else
        {
            b.hide();
            d.setMediaController(null);
            return;
        }
    }

    public final void b()
    {
        if (!TextUtils.isEmpty(f))
        {
            d.setVideoPath(f);
            return;
        } else
        {
            a(a, "no_src", ((String) (null)));
            return;
        }
    }

    public final void c()
    {
        d.pause();
    }

    public final void d()
    {
        d.start();
    }

    public final void e()
    {
        long l = d.getCurrentPosition();
        if (e != l)
        {
            float f1 = (float)l / 1000F;
            a(a, "timeupdate", "time", String.valueOf(f1));
            e = l;
        }
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        a(a, "ended", new HashMap(1));
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        a(a, String.valueOf(i), String.valueOf(j));
        return true;
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        float f1 = (float)d.getDuration() / 1000F;
        a(a, "canplaythrough", "duration", String.valueOf(f1));
    }
}
