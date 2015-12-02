// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.util.Log;
import com.whatsapp.util.ap;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;
import com.whatsapp.util.o;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, a13, App, au2, 
//            w5, og, iz, RangeSeekBar, 
//            rx, VideoTimelineView, akw, ab9, 
//            VideoView, s8, ao0, qe, 
//            ga, abr, ConversationTextEntry, aka, 
//            ct, a_y, ci, ata, 
//            cq

public class VideoPreviewActivity extends DialogToastActivity
{

    private static final String J[];
    private long A;
    private long B;
    private File C;
    private ImageButton D;
    private VideoView E;
    private ImageView F;
    private boolean G;
    private TextView H;
    private boolean I;
    private ao0 j;
    private ConversationTextEntry k;
    private TextView l;
    private ImageView m;
    private float n;
    private FrameLayout o;
    private int p;
    private VideoTimelineView q;
    private o r;
    private cq s;
    private long t;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener u;
    private FrameLayout v;
    private View w;
    private TextView x;
    private RangeSeekBar y;
    private SeekBar z;

    public VideoPreviewActivity()
    {
        p = 640;
        n = 3F;
        u = new a13(this);
    }

    private long a(long l1, long l2)
    {
        long l3;
label0:
        {
label1:
            {
                int i1;
                int j1;
                int k1;
label2:
                {
                    k1 = App.am;
                    l3 = l2 - l1;
                    if (l3 < 1000L)
                    {
                        l3 = 1000L;
                    }
                    if (l1 == 0L && l2 == r.c() && C.length() <= (long)au2.q * 0x100000L)
                    {
                        l1 = C.length();
                        if (k1 == 0)
                        {
                            break label0;
                        }
                    }
                    if (!w5.b(C))
                    {
                        break label1;
                    }
                    if (!r.d() && w5.a(C))
                    {
                        l1 = (C.length() * l3) / r.c();
                        if (k1 == 0)
                        {
                            break label0;
                        }
                    }
                    int i2 = r.e();
                    int j2 = r.f();
                    if (i2 >= j2)
                    {
                        j1 = p;
                        i1 = (j2 * j1) / i2;
                        if (k1 == 0)
                        {
                            break label2;
                        }
                    }
                    i1 = p;
                    j1 = (i2 * i1) / j2;
                }
                n = c1.a(j1, i1, l3);
                l1 = (long)(((float)(i1 * j1) * n * (float)(l3 / 1000L)) / 8F + (float)((0x17700L * (l3 / 1000L)) / 8L));
                if (k1 == 0)
                {
                    break label0;
                }
            }
            l1 = (C.length() * l3) / r.c();
        }
        x.setText(Formatter.formatShortFileSize(this, l1));
        l.setText(DateUtils.formatElapsedTime(l3 / 1000L));
        return l1;
    }

    static long a(VideoPreviewActivity videopreviewactivity, long l1)
    {
        videopreviewactivity.t = l1;
        return l1;
    }

    static long a(VideoPreviewActivity videopreviewactivity, long l1, long l2)
    {
        return videopreviewactivity.a(l1, l2);
    }

    static VideoView a(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.E;
    }

    private void a()
    {
        Intent intent = new Intent();
        intent.putExtra(J[8], C.getAbsolutePath());
        setResult(1, intent);
        finish();
    }

    public static void a(Activity activity, og og1, File file)
    {
        Intent intent;
label0:
        {
            intent = new Intent(activity, com/whatsapp/VideoPreviewActivity);
            intent.putExtra(J[1], file.getAbsolutePath());
            if (og1.k())
            {
                file = activity.getString(0x7f0e01ae, new Object[] {
                    og1.a(activity)
                });
                if (App.am == 0)
                {
                    break label0;
                }
            }
            file = activity.getString(0x7f0e037d, new Object[] {
                og1.a(activity)
            });
        }
        intent.putExtra(J[0], file);
        activity.startActivityForResult(intent, 24);
    }

    private void a(boolean flag)
    {
label0:
        {
            if (flag && F.getVisibility() != 0)
            {
                F.setVisibility(0);
                x.setVisibility(0);
                l.setVisibility(0);
                AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
                alphaanimation.setDuration(300L);
                F.startAnimation(alphaanimation);
                x.startAnimation(alphaanimation);
                l.startAnimation(alphaanimation);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (!flag && F.getVisibility() != 8)
            {
                F.setVisibility(8);
                x.setVisibility(8);
                l.setVisibility(8);
                AlphaAnimation alphaanimation1 = new AlphaAnimation(1.0F, 0.0F);
                alphaanimation1.setDuration(300L);
                F.startAnimation(alphaanimation1);
                x.startAnimation(alphaanimation1);
                l.startAnimation(alphaanimation1);
            }
        }
    }

    static boolean a(VideoPreviewActivity videopreviewactivity, boolean flag)
    {
        videopreviewactivity.G = flag;
        return flag;
    }

    static long b(VideoPreviewActivity videopreviewactivity, long l1)
    {
        videopreviewactivity.B = l1;
        return l1;
    }

    static o b(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.r;
    }

    static void b(VideoPreviewActivity videopreviewactivity, boolean flag)
    {
        videopreviewactivity.a(flag);
    }

    static RangeSeekBar c(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.y;
    }

    static boolean c(VideoPreviewActivity videopreviewactivity, boolean flag)
    {
        videopreviewactivity.I = flag;
        return flag;
    }

    static ImageView d(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.F;
    }

    static boolean e(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.I;
    }

    static ao0 f(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.j;
    }

    static ImageButton g(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.D;
    }

    static SeekBar h(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.z;
    }

    static File i(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.C;
    }

    static ConversationTextEntry j(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.k;
    }

    static TextView k(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.H;
    }

    static long l(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.B;
    }

    static cq m(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.s;
    }

    static long n(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.t;
    }

    static View o(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.w;
    }

    static boolean p(VideoPreviewActivity videopreviewactivity)
    {
        return videopreviewactivity.G;
    }

    public Bitmap a(long l1)
    {
        MediaMetadataRetriever mediametadataretriever = new MediaMetadataRetriever();
        Bitmap bitmap;
        try
        {
            mediametadataretriever.setDataSource(C.getAbsolutePath());
            bitmap = mediametadataretriever.getFrameAtTime(l1);
        }
        catch (Exception exception)
        {
            Log.e((new StringBuilder()).append(J[7]).append(exception.toString()).toString());
            exception = c1.b(C.getAbsolutePath());
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            Log.e((new StringBuilder()).append(J[6]).append(nosuchmethoderror.toString()).toString());
            nosuchmethoderror = c1.b(C.getAbsolutePath());
        }
        mediametadataretriever.release();
        return bitmap;
    }

    public void onCreate(Bundle bundle)
    {
        long l1;
        Log.i(J[2]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        w = iz.a(getLayoutInflater(), 0x7f0300ac, null, false);
        setContentView(w);
        C = new File(getIntent().getStringExtra(J[5]));
        bundle = getIntent().getStringExtra(J[3]);
        long l2;
        try
        {
            if (!TextUtils.isEmpty(bundle))
            {
                getSupportActionBar().setTitle(com.whatsapp.util.c.b(bundle, getBaseContext()));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            r = new o(C);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.e(J[4]);
            a();
            return;
        }
        m = (ImageView)findViewById(0x7f0b012a);
        H = (TextView)findViewById(0x7f0b02bc);
        x = (TextView)findViewById(0x7f0b02bd);
        l = (TextView)findViewById(0x7f0b0194);
        t = 0L;
        B = r.c();
        p = Math.min(640, Math.max(r.e(), r.f()));
        A = r.c();
        l1 = a(t, B);
        try
        {
            if (l1 > (long)au2.q * 0x100000L)
            {
                A = (r.c() * (long)au2.q * 0x100000L) / l1;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        o = (FrameLayout)findViewById(0x7f0b02c0);
        l2 = r.c();
        if (A >= r.c()) goto _L2; else goto _L1
_L1:
        l1 = A;
_L4:
        y = new RangeSeekBar(Long.valueOf(0L), Long.valueOf(l2), Long.valueOf(l1), this);
        if (A < r.c())
        {
            B = A;
            y.setSelectedMaxValue(Long.valueOf(B));
            a(t, B);
        }
        y.setSlowScrubStep(getResources().getDisplayMetrics().density * 72F);
        y.setTopExtension((int)(getResources().getDisplayMetrics().density * 38F));
        y.setOnRangeSeekBarChangeListener(new rx(this));
        y.setNotifyWhileDragging(true);
        o.addView(y);
        v = (FrameLayout)findViewById(0x7f0b02bf);
        q = new VideoTimelineView(this);
        q.setVideoFile(C);
        v.addView(q);
        bundle = (Button)findViewById(0x7f0b01bd);
        bundle.setText(0x7f0e0373);
        bundle.setOnClickListener(new akw(this));
        ((Button)findViewById(0x7f0b01be)).setOnClickListener(new ab9(this));
        E = (VideoView)findViewById(0x7f0b00e9);
        findViewById(0x7f0b02c2).setVisibility(0);
        E.setOnPreparedListener(new s8(this));
        E.setVideoPath(C.getAbsolutePath());
        E.requestFocus();
        E.seekTo(1);
        j = new ao0(this);
        j.setPriority(4);
        j.start();
        j.a(0L);
        z = (SeekBar)findViewById(0x7f0b00ed);
        z.setMax((int)r.c());
        z.setOnSeekBarChangeListener(new qe(this));
        F = (ImageView)findViewById(0x7f0b00ea);
        bundle = new ga(this);
        findViewById(0x7f0b00e8).setOnClickListener(bundle);
        F.setOnClickListener(bundle);
        D = (ImageButton)findViewById(0x7f0b0167);
        D.setOnClickListener(new abr(this));
        k = (ConversationTextEntry)findViewById(0x7f0b0182);
        k.setInputEnterDone(true);
        k.setFilters(new InputFilter[] {
            new aka(160)
        });
        k.setOnEditorActionListener(new ct(this));
        bundle = (TextView)findViewById(0x7f0b022b);
        k.addTextChangedListener(new a_y(this, bundle));
        s = new ci(this, this);
        s.a(new ata(this));
        w.getViewTreeObserver().addOnGlobalLayoutListener(u);
        return;
        bundle;
        throw bundle;
_L2:
        l1 = 0L;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onDestroy()
    {
        Log.i(J[9]);
        super.onDestroy();
        if (j != null)
        {
            j.interrupt();
            j = null;
        }
        if (w != null)
        {
            w.getViewTreeObserver().removeGlobalOnLayoutListener(u);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[10];
        obj = "#\030,.:";
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
                obj = "1\0304'\000'\020,*";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "!\030<'0'\003=462\006w!-2\020,'";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "#\030,.:";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "!\030<'0'\003=462\006w >3Q.+;2\036";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "1\0304'\000'\020,*";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "!\030<'0'\003=462\006w%:#\0071&:8\0050725";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "!\030<'0'\003=462\006w%:#\0071&:8\0050725";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "1\0304'\000'\020,*";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "!\030<'0'\003=462\006w&:$\005*-&";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                J = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 95;
_L9:
        obj[j1] = (char)(byte1 ^ c2);
        j1++;
          goto _L8
_L4:
        byte1 = 87;
          goto _L9
_L5:
        byte1 = 113;
          goto _L9
_L6:
        byte1 = 88;
          goto _L9
        byte1 = 66;
          goto _L9
    }
}
