// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            du, xp, App, a1g, 
//            aoz, abl, j4, a38, 
//            at5

abstract class dq extends du
{

    private static final String z[];
    private ImageView c[];
    private final Handler d = new Handler();
    private Activity e;
    private int f;
    Runnable g;
    private final int h[] = {
        0x7f0b00bc, 0x7f0b00bd, 0x7f0b00be, 0x7f0b00bf, 0x7f0b00c0
    };

    public dq(Activity activity)
    {
        super(activity, 0x7f030022);
        f = 0;
        g = new xp(this);
        e = activity;
    }

    static int[] a(dq dq1)
    {
        return dq1.h;
    }

    static int b(dq dq1)
    {
        return dq1.f;
    }

    static Handler c(dq dq1)
    {
        return dq1.d;
    }

    static ImageView[] d(dq dq1)
    {
        return dq1.c;
    }

    public void a()
    {
label0:
        {
            if (e.getResources().getConfiguration().orientation == 1)
            {
                findViewById(0x7f0b00b9).setVisibility(0);
                findViewById(0x7f0b00c2).setVisibility(0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            findViewById(0x7f0b00b9).setVisibility(8);
            findViewById(0x7f0b00c2).setVisibility(8);
        }
    }

    protected void a(int i)
    {
        int j;
        j = App.am;
        f = i;
        i;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 371;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        c = new ImageView[h.length];
        i = 0;
_L7:
        if (i >= h.length) goto _L5; else goto _L4
_L4:
        c[i] = (ImageView)findViewById(h[i]);
        c[i].setVisibility(0);
        Drawable drawable = e.getResources().getDrawable(0x7f020146);
        c[i].setImageDrawable(drawable.mutate());
        if (j == 0) goto _L6; else goto _L5
_L5:
        findViewById(0x7f0b00c1).setVisibility(0);
        findViewById(0x7f0b00c5).setVisibility(8);
        findViewById(0x7f0b00c6).setVisibility(8);
        findViewById(0x7f0b00c8).setVisibility(0);
        Object obj = a1g.a();
        View view = findViewById(0x7f0b00c1);
        TranslateAnimation translateanimation = new TranslateAnimation(-50F * ((a1g) (obj)).g, 0.0F, 0.0F, 0.0F);
        translateanimation.setDuration(200L);
        view.startAnimation(translateanimation);
        view = findViewById(0x7f0b00bb);
        obj = new TranslateAnimation(((a1g) (obj)).g * 50F, 0.0F, 0.0F, 0.0F);
        ((Animation) (obj)).setDuration(200L);
        view.startAnimation(((Animation) (obj)));
        d.removeCallbacks(g);
        d.postDelayed(g, 500L);
        if (true)
        {
            AlphaAnimation aalphaanimation[] = new AlphaAnimation[h.length];
            i = 0;
            do
            {
                if (i >= c.length)
                {
                    break;
                }
                aalphaanimation[i] = new AlphaAnimation(1.0F, 0.0F);
                aalphaanimation[i].setDuration(50L);
                aalphaanimation[i].setFillAfter(true);
                c[i].startAnimation(aalphaanimation[i]);
                i++;
            } while (j == 0);
        }
        ((TextView)findViewById(0x7f0b00c3)).setText("");
        ((TextView)findViewById(0x7f0b00c4)).setText("");
        if (j == 0) goto _L1; else goto _L3
_L3:
        i = 0;
        do
        {
            if (i >= h.length)
            {
                break;
            }
            findViewById(h[i]).setVisibility(8);
            i++;
        } while (j == 0);
        a1g a1g1 = a1g.a();
        View view1 = findViewById(0x7f0b00c1);
        Object obj1 = new TranslateAnimation(50F * a1g1.g, 0.0F, 0.0F, 0.0F);
        ((Animation) (obj1)).setDuration(200L);
        view1.startAnimation(((Animation) (obj1)));
        view1 = findViewById(0x7f0b00bb);
        obj1 = new AnimationSet(true);
        ((AnimationSet) (obj1)).addAnimation(new TranslateAnimation(a1g1.g * -50F, 0.0F, 0.0F, 0.0F));
        ((AnimationSet) (obj1)).addAnimation(new AlphaAnimation(1.0F, 0.0F));
        ((AnimationSet) (obj1)).setDuration(200L);
        view1.startAnimation(((Animation) (obj1)));
        findViewById(0x7f0b00bb).setVisibility(8);
        findViewById(0x7f0b00c1).setVisibility(0);
        findViewById(0x7f0b00c5).setVisibility(8);
        findViewById(0x7f0b00c6).setVisibility(8);
        findViewById(0x7f0b00c8).setVisibility(8);
        findViewById(0x7f0b00c7).setVisibility(0);
        ((TextView)findViewById(0x7f0b00c3)).setText(0x7f0e0319);
        ((TextView)findViewById(0x7f0b00c4)).setText(App.j.a(0x7f0d0027, App.ah.n(), new Object[] {
            Integer.valueOf(App.ah.n())
        }));
        return;
_L6:
        i++;
          goto _L7
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    protected void onCreate(Bundle bundle)
    {
        int i;
label0:
        {
            i = 0;
            super.onCreate(bundle);
            findViewById(0x7f0b00c5).setOnClickListener(new j4(this));
            findViewById(0x7f0b00c6).setOnClickListener(new a38(this));
            findViewById(0x7f0b00c7).setOnClickListener(new at5(this));
            if (e.getResources().getConfiguration().orientation == 1)
            {
                findViewById(0x7f0b00b9).setVisibility(0);
                findViewById(0x7f0b00c2).setVisibility(0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            findViewById(0x7f0b00b9).setVisibility(8);
            findViewById(0x7f0b00c2).setVisibility(8);
        }
        if (bundle != null)
        {
            i = bundle.getInt(z[1]);
        }
        a(i);
        getWindow().setSoftInputMode(3);
    }

    public Bundle onSaveInstanceState()
    {
        Bundle bundle = super.onSaveInstanceState();
        if (bundle != null)
        {
            bundle.putInt(z[0], f);
        }
        return bundle;
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "v!\002DO".toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 154
    //                   2 160
    //                   3 166;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_166;
_L3:
        byte byte0 = 42;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 5;
          goto _L9
_L5:
        byte0 = 85;
          goto _L9
_L6:
        byte0 = 99;
          goto _L9
        byte0 = 48;
          goto _L9
    }
}
