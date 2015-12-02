// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.whatsapp:
//            a96, o5, n5, a98, 
//            afg, b4, App

public class VideoView extends SurfaceView
    implements android.widget.MediaController.MediaPlayerControl
{

    private static final String B[];
    private boolean A;
    private int a;
    private int b;
    private android.media.MediaPlayer.OnBufferingUpdateListener c;
    android.view.SurfaceHolder.Callback d;
    private Uri e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private MediaPlayer k;
    private int l;
    private android.media.MediaPlayer.OnPreparedListener m;
    private boolean n;
    private int o;
    android.media.MediaPlayer.OnVideoSizeChangedListener p;
    private boolean q;
    android.media.MediaPlayer.OnPreparedListener r;
    private android.media.MediaPlayer.OnInfoListener s;
    private SurfaceHolder t;
    private Map u;
    private int v;
    private android.media.MediaPlayer.OnCompletionListener w;
    private android.media.MediaPlayer.OnErrorListener x;
    private android.media.MediaPlayer.OnCompletionListener y;
    private android.media.MediaPlayer.OnErrorListener z;

    public VideoView(Context context)
    {
        super(context);
        g = B[1];
        l = 0;
        o = 0;
        t = null;
        k = null;
        p = new a96(this);
        r = new o5(this);
        w = new n5(this);
        x = new a98(this);
        c = new afg(this);
        d = new b4(this);
        a();
    }

    public VideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        a();
    }

    public VideoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = B[0];
        l = 0;
        o = 0;
        t = null;
        k = null;
        p = new a96(this);
        r = new o5(this);
        w = new n5(this);
        x = new a98(this);
        c = new afg(this);
        d = new b4(this);
        a();
    }

    static int a(VideoView videoview)
    {
        return videoview.i;
    }

    static int a(VideoView videoview, int i1)
    {
        videoview.b = i1;
        return i1;
    }

    static SurfaceHolder a(VideoView videoview, SurfaceHolder surfaceholder)
    {
        videoview.t = surfaceholder;
        return surfaceholder;
    }

    private void a()
    {
        v = 0;
        b = 0;
        getHolder().addCallback(d);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        l = 0;
        o = 0;
    }

    static void a(VideoView videoview, boolean flag)
    {
        videoview.a(flag);
    }

    private void a(boolean flag)
    {
        MediaPlayer mediaplayer = k;
        if (mediaplayer == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        IllegalArgumentException illegalargumentexception;
        try
        {
            k.reset();
            k.release();
            k = null;
            l = 0;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        o = 0;
        return;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    static int b(VideoView videoview, int i1)
    {
        videoview.a = i1;
        return i1;
    }

    static android.media.MediaPlayer.OnPreparedListener b(VideoView videoview)
    {
        return videoview.m;
    }

    static boolean b(VideoView videoview, boolean flag)
    {
        videoview.A = flag;
        return flag;
    }

    static int c(VideoView videoview, int i1)
    {
        videoview.i = i1;
        return i1;
    }

    static android.media.MediaPlayer.OnCompletionListener c(VideoView videoview)
    {
        return videoview.y;
    }

    private boolean c()
    {
        MediaPlayer mediaplayer = k;
        if (mediaplayer == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        int i1 = l;
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        i1 = l;
        if (i1 != 0)
        {
            IllegalArgumentException illegalargumentexception;
            int j1;
            try
            {
                j1 = l;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (j1 != 1)
            {
                return true;
            }
        }
        break MISSING_BLOCK_LABEL_52;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        return false;
    }

    static boolean c(VideoView videoview, boolean flag)
    {
        videoview.n = flag;
        return flag;
    }

    static int d(VideoView videoview, int i1)
    {
        videoview.l = i1;
        return i1;
    }

    static MediaPlayer d(VideoView videoview)
    {
        return videoview.k;
    }

    private void d()
    {
label0:
        {
            SurfaceHolder surfaceholder;
            try
            {
                if (e == null)
                {
                    break label0;
                }
                surfaceholder = t;
            }
            catch (IOException ioexception)
            {
                try
                {
                    throw ioexception;
                }
                catch (IOException ioexception1)
                {
                    throw ioexception1;
                }
            }
            if (surfaceholder != null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
        }
        return;
        Intent intent = new Intent(B[2]);
        intent.putExtra(B[5], B[6]);
        getContext().sendBroadcast(intent);
        a(false);
        int i1;
        k = new MediaPlayer();
        i1 = f;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        k.setAudioSessionId(f);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 < 9)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        f = k.getAudioSessionId();
        try
        {
            k.setOnPreparedListener(r);
            k.setOnVideoSizeChangedListener(p);
            k.setOnCompletionListener(w);
            k.setOnErrorListener(x);
            k.setOnInfoListener(s);
            k.setOnBufferingUpdateListener(c);
            j = 0;
            k.setDataSource(getContext(), e, u);
            k.setDisplay(t);
            k.setAudioStreamType(3);
            k.setScreenOnWhilePlaying(true);
            k.prepareAsync();
            l = 1;
            return;
        }
        catch (IOException ioexception2)
        {
            Log.c((new StringBuilder()).append(B[3]).append(e).toString(), ioexception2);
        }
        l = -1;
        o = -1;
        x.onError(k, 1, 0);
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        Log.c((new StringBuilder()).append(B[4]).append(e).toString(), ((Throwable) (obj)));
        l = -1;
        o = -1;
        x.onError(k, 1, 0);
        return;
    }

    static boolean d(VideoView videoview, boolean flag)
    {
        videoview.q = flag;
        return flag;
    }

    static int e(VideoView videoview)
    {
        return videoview.o;
    }

    static int e(VideoView videoview, int i1)
    {
        videoview.v = i1;
        return i1;
    }

    static int f(VideoView videoview)
    {
        return videoview.h;
    }

    static int f(VideoView videoview, int i1)
    {
        videoview.j = i1;
        return i1;
    }

    static int g(VideoView videoview)
    {
        return videoview.a;
    }

    static int g(VideoView videoview, int i1)
    {
        videoview.o = i1;
        return i1;
    }

    static void h(VideoView videoview)
    {
        videoview.d();
    }

    static android.media.MediaPlayer.OnErrorListener i(VideoView videoview)
    {
        return videoview.z;
    }

    static int j(VideoView videoview)
    {
        return videoview.b;
    }

    static int k(VideoView videoview)
    {
        return videoview.v;
    }

    public void b()
    {
        a(false);
    }

    public boolean canPause()
    {
        return q;
    }

    public boolean canSeekBackward()
    {
        return n;
    }

    public boolean canSeekForward()
    {
        return A;
    }

    public int getAudioSessionId()
    {
        if (f == 0)
        {
            MediaPlayer mediaplayer = new MediaPlayer();
            f = mediaplayer.getAudioSessionId();
            mediaplayer.release();
        }
        return f;
    }

    public int getBufferPercentage()
    {
label0:
        {
            int i1;
            try
            {
                if (k == null)
                {
                    break label0;
                }
                i1 = j;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return i1;
        }
        return 0;
    }

    public int getCurrentPosition()
    {
label0:
        {
            int i1;
            try
            {
                if (!c())
                {
                    break label0;
                }
                i1 = k.getCurrentPosition();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return i1;
        }
        return 0;
    }

    public int getDuration()
    {
label0:
        {
            int i1;
            try
            {
                if (!c())
                {
                    break label0;
                }
                i1 = k.getDuration();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return i1;
        }
        return -1;
    }

    public boolean isPlaying()
    {
        boolean flag;
        try
        {
            flag = c();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (k.isPlaying())
        {
            return true;
        }
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/whatsapp/VideoView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(com/whatsapp/VideoView.getName());
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int k2;
        int i3;
        i3 = App.am;
        i2 = getDefaultSize(v, i1);
        k2 = getDefaultSize(b, j1);
        l1 = k2;
        k1 = i2;
        if (v <= 0) goto _L2; else goto _L1
_L1:
        int l2 = b;
        l1 = k2;
        k1 = i2;
        if (l2 <= 0) goto _L2; else goto _L3
_L3:
        int j3;
        l2 = android.view.View.MeasureSpec.getMode(i1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j3 = android.view.View.MeasureSpec.getMode(j1);
        k2 = android.view.View.MeasureSpec.getSize(j1);
        if (l2 != 0x40000000 || j3 != 0x40000000) goto _L5; else goto _L4
_L4:
        if (v * k2 >= b * i1) goto _L7; else goto _L6
_L6:
        j1 = (v * k2) / b;
        l1 = k2;
        k1 = j1;
        if (i3 == 0) goto _L2; else goto _L8
_L8:
        IllegalArgumentException illegalargumentexception;
        try
        {
            k1 = v;
            l1 = b;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (k1 * k2 <= l1 * j1) goto _L10; else goto _L9
_L9:
        l1 = (b * j1) / v;
        if (i3 == 0) goto _L11; else goto _L5
_L5:
        if (l2 != 0x40000000) goto _L13; else goto _L12
_L12:
        l1 = (b * i1) / v;
        if (j3 != 0x80000000 || l1 <= k2) goto _L15; else goto _L14
_L14:
        if (i3 == 0) goto _L16; else goto _L13
_L13:
        if (j3 != 0x40000000) goto _L18; else goto _L17
_L17:
        j1 = (v * k2) / b;
        l1 = k2;
        k1 = j1;
        if (l2 != 0x80000000) goto _L2; else goto _L19
_L19:
        l1 = k2;
        k1 = j1;
        if (j1 <= i1) goto _L2; else goto _L20
_L20:
        if (i3 == 0) goto _L16; else goto _L18
_L18:
        int j2 = v;
        j1 = b;
        if (j3 == 0x80000000 && j1 > k2)
        {
            j2 = (v * k2) / b;
            j1 = k2;
        }
        l1 = j1;
        k1 = j2;
        if (l2 == 0x80000000)
        {
            l1 = j1;
            k1 = j2;
            if (j2 > i1)
            {
                l1 = (b * i1) / v;
                k1 = i1;
            }
        }
_L2:
        setMeasuredDimension(k1, l1);
        return;
        illegalargumentexception;
        throw illegalargumentexception;
_L16:
        l1 = k2;
        k1 = i1;
        continue; /* Loop/switch isn't completed */
_L15:
        k1 = i1;
        continue; /* Loop/switch isn't completed */
_L11:
        k1 = j1;
        continue; /* Loop/switch isn't completed */
_L10:
        l1 = k2;
        k1 = j1;
        if (true) goto _L2; else goto _L7
_L7:
        j1 = i1;
        if (true) goto _L8; else goto _L21
_L21:
    }

    public void pause()
    {
        boolean flag = c();
        IllegalArgumentException illegalargumentexception;
        if (flag)
        {
            try
            {
                if (k.isPlaying())
                {
                    k.pause();
                    l = 4;
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        o = 4;
        return;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public void seekTo(int i1)
    {
        boolean flag;
        try
        {
            flag = c();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        k.seekTo(i1);
        h = 0;
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        h = i1;
        return;
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        m = onpreparedlistener;
    }

    public void setVideoPath(String s1)
    {
        setVideoURI(Uri.parse(s1));
    }

    public void setVideoURI(Uri uri)
    {
        setVideoURI(uri, null);
    }

    public void setVideoURI(Uri uri, Map map)
    {
        e = uri;
        u = map;
        h = 0;
        d();
        requestLayout();
        invalidate();
    }

    public void start()
    {
        try
        {
            if (c())
            {
                k.start();
                l = 3;
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        o = 3;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[7];
        obj = "eo\033\034'eo\032\016";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "eo\033\034'eo\032\016";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "Pi\022W)]b\r\026!W(\022\f;ZeQ\024=@o\034\n-Ap\026\032-Pi\022\024)]b";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "Eo\033\034'Eo\032\016g\023S\021\030*_c_\r'\023i\017\034&\023e\020\027<Vh\013Ch";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "Eo\033\034'Eo\032\016g\023S\021\030*_c_\r'\023i\017\034&\023e\020\027<Vh\013Ch";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "Pi\022\024)]b";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "Cg\n\n-";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                B = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 72;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 51;
          goto _L9
_L5:
        byte1 = 6;
          goto _L9
_L6:
        byte1 = 127;
          goto _L9
        byte1 = 121;
          goto _L9
    }
}
