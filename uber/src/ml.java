// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import java.util.HashMap;
import java.util.Map;

public final class ml extends FrameLayout
    implements android.media.AudioManager.OnAudioFocusChangeListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{

    private final akk a;
    private final MediaController b;
    private final mm c = new mm(this);
    private final FrameLayout d;
    private final VideoView e;
    private TextView f;
    private MediaPlayer g;
    private boolean h;
    private boolean i;
    private long j;
    private long k;
    private String l;
    private float m;

    public ml(Context context, akk akk1)
    {
        super(context);
        a = akk1;
        d = new FrameLayout(context);
        addView(d);
        e = new _cls2(new _cls1(context));
        d.addView(e, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        f = new TextView(context);
        f.setBackgroundColor(0xff000000);
        i();
        b = new MediaController(context);
        m = 1.0F;
        c.b();
        e.setOnCompletionListener(this);
        e.setOnPreparedListener(this);
        e.setOnErrorListener(this);
    }

    static long a(ml ml1, long l1)
    {
        ml1.k = l1;
        return l1;
    }

    static MediaPlayer a(ml ml1)
    {
        return ml1.g;
    }

    private static void a(akk akk1, String s)
    {
        a(akk1, s, ((Map) (new HashMap(1))));
    }

    public static void a(akk akk1, String s, String s1)
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
        a(akk1, "error", ((Map) (hashmap)));
    }

    private static void a(akk akk1, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s1, s2);
        a(akk1, s, ((Map) (hashmap)));
    }

    private static void a(akk akk1, String s, Map map)
    {
        map.put("event", s);
        akk1.a("onVideoEvent", map);
    }

    private void b(float f1)
    {
        if (g != null)
        {
            try
            {
                g.setVolume(f1, f1);
                return;
            }
            catch (IllegalStateException illegalstateexception)
            {
                return;
            }
        } else
        {
            of.e("AdVideoView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
    }

    static void b(ml ml1)
    {
        ml1.i();
    }

    static long c(ml ml1)
    {
        return ml1.j;
    }

    static MediaPlayer d(ml ml1)
    {
        ml1.g = null;
        return null;
    }

    static VideoView e(ml ml1)
    {
        return ml1.e;
    }

    static void f(ml ml1)
    {
        ml1.j();
    }

    private void i()
    {
        if (!k())
        {
            d.addView(f, new android.widget.FrameLayout.LayoutParams(-1, -1));
            d.bringChildToFront(f);
        }
    }

    private void j()
    {
        if (k())
        {
            d.removeView(f);
        }
    }

    private boolean k()
    {
        return f.getParent() != null;
    }

    private void l()
    {
        i = true;
        n();
    }

    private void m()
    {
        i = false;
        n();
    }

    private void n()
    {
        if (!h && i)
        {
            b(m);
            return;
        } else
        {
            b(0.0F);
            return;
        }
    }

    private AudioManager o()
    {
        return (AudioManager)e.getContext().getSystemService("audio");
    }

    public final void a()
    {
        AudioManager audiomanager = o();
        if (audiomanager != null)
        {
            audiomanager.abandonAudioFocus(this);
        }
        c.a();
        e.stopPlayback();
    }

    public final void a(float f1)
    {
        m = f1;
        n();
    }

    public final void a(int i1)
    {
        if (g != null)
        {
            e.seekTo(i1);
        }
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k1, l1);
        layoutparams.setMargins(i1, j1, 0, 0);
        d.setLayoutParams(layoutparams);
        requestLayout();
    }

    public final void a(MotionEvent motionevent)
    {
        e.dispatchTouchEvent(motionevent);
    }

    public final void a(String s)
    {
        l = s;
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            e.setMediaController(b);
            return;
        } else
        {
            b.hide();
            e.setMediaController(null);
            return;
        }
    }

    public final void b()
    {
        if (!TextUtils.isEmpty(l))
        {
            e.setVideoPath(l);
            return;
        } else
        {
            a(a, "no_src", ((String) (null)));
            return;
        }
    }

    public final void c()
    {
        e.pause();
    }

    public final void d()
    {
        if (!i)
        {
            AudioManager audiomanager = o();
            if (audiomanager != null && audiomanager.requestAudioFocus(this, 3, 2) == 1)
            {
                l();
            }
        }
        e.start();
    }

    public final void e()
    {
        h = true;
        n();
    }

    public final void f()
    {
        h = false;
        n();
    }

    public final void g()
    {
        long l1 = e.getCurrentPosition();
        if (j != l1 && l1 > 0L)
        {
            j();
            float f1 = (float)l1 / 1000F;
            a(a, "timeupdate", "time", String.valueOf(f1));
            j = l1;
        }
    }

    public final void h()
    {
        TextView textview = new TextView(e.getContext());
        textview.setText("AdMob");
        textview.setTextColor(0xffff0000);
        textview.setBackgroundColor(-256);
        d.addView(textview, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        d.bringChildToFront(textview);
    }

    public final void onAudioFocusChange(int i1)
    {
        if (i1 > 0)
        {
            l();
        } else
        if (i1 < 0)
        {
            m();
            return;
        }
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        a(a, "ended");
    }

    public final boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        a(a, String.valueOf(i1), String.valueOf(j1));
        return true;
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        g = mediaplayer;
        if (k == 0L)
        {
            mediaplayer = new _cls3((float)mediaplayer.getDuration() / 1000F, mediaplayer.getVideoWidth(), mediaplayer.getVideoHeight());
            a(a, "canplaythrough", mediaplayer);
        } else
        {
            int i1 = (int)k;
            e.post(new _cls4(i1));
        }
        g.setOnInfoListener(new _cls5());
        n();
    }

    public final void setBackgroundColor(int i1)
    {
        super.setBackgroundColor(i1);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).toString();
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls4 {}

}
