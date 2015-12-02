// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.FloatingChildLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            DialogToastFragmentActivity, wd, App, og, 
//            a82, k, u2, _e, 
//            rw, ik, akf, a_k, 
//            e3

public class QuickContactActivity extends DialogToastFragmentActivity
    implements wd
{

    private static final String z[];
    private FloatingChildLayout f;
    private og g;
    private ImageView h;
    private TextView i;

    public QuickContactActivity()
    {
    }

    static void a(QuickContactActivity quickcontactactivity)
    {
        quickcontactactivity.d();
    }

    static void a(QuickContactActivity quickcontactactivity, boolean flag)
    {
        quickcontactactivity.b(flag);
    }

    static og b(QuickContactActivity quickcontactactivity)
    {
        return quickcontactactivity.g;
    }

    private void b()
    {
label0:
        {
            int j = App.am;
            android.graphics.Bitmap bitmap = g.a(getResources().getDimensionPixelSize(0x7f0a004f), 0.0F, false);
            if (bitmap != null)
            {
                h.setImageBitmap(bitmap);
                if (j == 0)
                {
                    break label0;
                }
            }
            if (g.k())
            {
                h.setImageResource(0x7f02055b);
                if (j == 0)
                {
                    break label0;
                }
            }
            if (g.d())
            {
                h.setImageResource(0x7f020559);
                if (j == 0)
                {
                    break label0;
                }
            }
            h.setImageResource(0x7f02055a);
        }
    }

    private void b(boolean flag)
    {
label0:
        {
            getSupportLoaderManager().destroyLoader(0);
            if (flag)
            {
                f.f();
                if (!f.a(new a82(this)))
                {
                    finish();
                }
                if (App.am == 0)
                {
                    break label0;
                }
            }
            finish();
        }
    }

    static FloatingChildLayout c(QuickContactActivity quickcontactactivity)
    {
        return quickcontactactivity.f;
    }

    private void d()
    {
        if (f.b())
        {
            b(true);
        }
    }

    public void a()
    {
    }

    public void a(String s)
    {
    }

    public void a(Collection collection)
    {
    }

    public void b(String s)
    {
    }

    public void c(String s)
    {
    }

    public void d(String s)
    {
        b();
    }

    public void onAttachFragment(Fragment fragment)
    {
    }

    public void onBackPressed()
    {
        b(true);
    }

    protected void onCreate(Bundle bundle)
    {
        int j;
label0:
        {
            j = App.am;
            super.onCreate(bundle);
            Log.i(z[1]);
            bundle = getIntent();
            g = App.az.e(bundle.getStringExtra(z[0]));
            getWindow().setFlags(0x20000, 0x20000);
            setContentView(0x7f030099);
            f = (FloatingChildLayout)findViewById(0x7f0b0280);
            f.setOnOutsideTouchListener(new u2(this));
            bundle = bundle.getSourceBounds();
            if (bundle != null)
            {
                f.setChildTargetScreen(bundle);
            }
            i = (TextView)findViewById(0x7f0b0135);
            i.setText(com.whatsapp.util.c.b(g.a(this), this, i.getPaint()));
            if (g.t || g.k() || g.d())
            {
                findViewById(0x7f0b0162).setVisibility(0);
                findViewById(0x7f0b0281).setVisibility(8);
                if (j == 0)
                {
                    break label0;
                }
            }
            findViewById(0x7f0b0162).setVisibility(8);
            findViewById(0x7f0b0281).setVisibility(0);
        }
label1:
        {
            h = (ImageView)findViewById(0x7f0b015c);
            b();
            if (g.t && !g.d() || g.k())
            {
                h.setOnClickListener(new _e(this));
            }
            findViewById(0x7f0b0282).setOnClickListener(new rw(this));
            bundle = findViewById(0x7f0b0284);
            if (g.k() || g.d())
            {
                bundle.setVisibility(8);
                findViewById(0x7f0b0283).setVisibility(8);
                if (j == 0)
                {
                    break label1;
                }
            }
            bundle.setOnClickListener(new ik(this));
        }
        findViewById(0x7f0b0285).setOnClickListener(new akf(this));
        findViewById(0x7f0b0281).setOnClickListener(new a_k(this));
        FloatingChildLayout.b(f, new e3(this));
        App.b(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i(z[2]);
        App.a(this);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int j;
        as = new String[3];
        obj = "\004oI";
        byte1 = -1;
        j = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "\037sD\030S\riC\017Y\rrD\025^\001)N\t]\017rH";
                j = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                j = 2;
                obj = "\037sD\030S\riC\017Y\rrD\025^\001)I\036K\032tB\002";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 56;
_L9:
        obj[l] = (char)(byte0 ^ c1);
        l++;
          goto _L8
_L4:
        byte0 = 110;
          goto _L9
_L5:
        byte0 = 6;
          goto _L9
_L6:
        byte0 = 45;
          goto _L9
        byte0 = 123;
          goto _L9
    }
}
