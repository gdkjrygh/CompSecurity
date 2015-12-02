// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, wd, iq, og, 
//            a9g, aut, App, k, 
//            qk, fe, Main, jd, 
//            ru, q1, hb, pa, 
//            iz, Conversations, za

public class ProfilePhotoReminder extends DialogToastActivity
    implements wd
{

    public static boolean j;
    private static final String z[];
    private Runnable k;
    private View l;
    private ImageView m;
    private Bitmap n;
    private og o;
    private Handler p;
    private za q;
    private fe r;
    private EditText s;
    private TextView t;

    public ProfilePhotoReminder()
    {
        q = new iq(this);
    }

    static fe a(ProfilePhotoReminder profilephotoreminder)
    {
        return profilephotoreminder.r;
    }

    private void a(Bitmap bitmap)
    {
        m.setImageBitmap(bitmap);
    }

    static EditText b(ProfilePhotoReminder profilephotoreminder)
    {
        return profilephotoreminder.s;
    }

    private void b()
    {
        float f;
        int i;
        l.setVisibility(8);
        i = getResources().getDimensionPixelSize(0x7f0a0054);
        f = getResources().getDimension(0x7f0a0053);
        if (!a9g.a(o.a)) goto _L2; else goto _L1
_L1:
        Bitmap bitmap;
        m.setEnabled(false);
        l.setVisibility(0);
        if (n == null)
        {
            n = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ALPHA_8);
        }
        bitmap = n;
_L4:
        a(bitmap);
        return;
_L2:
label0:
        {
            m.setEnabled(true);
            l.setVisibility(4);
            Bitmap bitmap1 = o.a(i, f, false);
            bitmap = bitmap1;
            if (bitmap1 != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (o.q == 0 && o.u == 0)
            {
                l.setVisibility(0);
                if (p == null)
                {
                    p = new Handler();
                    k = new aut(this);
                }
                p.removeCallbacks(k);
                p.postDelayed(k, 30000L);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            l.setVisibility(4);
        }
        bitmap = og.a(0x7f020096, i, f);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static TextView c(ProfilePhotoReminder profilephotoreminder)
    {
        return profilephotoreminder.t;
    }

    static og d(ProfilePhotoReminder profilephotoreminder)
    {
        return profilephotoreminder.o;
    }

    static View e(ProfilePhotoReminder profilephotoreminder)
    {
        return profilephotoreminder.l;
    }

    public void a()
    {
    }

    public void a(String s1)
    {
    }

    public void a(Collection collection)
    {
    }

    public void b(String s1)
    {
    }

    public void c(String s1)
    {
    }

    public void d(String s1)
    {
        if (o != null && s1.equals(o.a))
        {
            o = App.az.f();
            b();
        }
    }

    protected void onActivityResult(int i, int i1, Intent intent)
    {
        int j1 = App.am;
        i;
        JVM INSTR tableswitch 12 13: default 28
    //                   12 29
    //                   13 89;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (i1 != -1) goto _L1; else goto _L4
_L4:
        if (intent == null || !intent.getBooleanExtra(z[1], false))
        {
            break; /* Loop/switch isn't completed */
        }
        l.setVisibility(0);
        qk.a(o, this);
        if (j1 == 0) goto _L1; else goto _L5
_L5:
        qk.a(intent, o, this, 13, this);
        if (j1 == 0) goto _L1; else goto _L3
_L3:
        qk.c().delete();
        if (i1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!qk.b(o, this)) goto _L1; else goto _L6
_L6:
        l.setVisibility(0);
        if (j1 == 0) goto _L1; else goto _L7
_L7:
        if (i1 != 0 || intent == null) goto _L1; else goto _L8
_L8:
        qk.a(intent, this);
        return;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        r.a(configuration);
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            Log.i(z[3]);
            super.onCreate(bundle);
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            setContentView(0x7f030097);
            o = App.az.f();
            if (o == null)
            {
                Log.i(z[2]);
                App.q(z[5]);
                startActivity(new Intent(this, com/whatsapp/Main));
                finish();
                return;
            }
            t = (TextView)findViewById(0x7f0b0278);
            t.setText(Integer.toString(25));
            findViewById(0x7f0b01bf).setOnClickListener(new jd(this));
            r = new fe(this);
            r.a(q);
            m = (ImageView)findViewById(0x7f0b0256);
            bundle = new ru(this);
            m.setOnClickListener(bundle);
            hb.a(this, getSupportActionBar(), getString(0x7f0e02a2), new q1(this));
            l = findViewById(0x7f0b0152);
            b();
            s = (EditText)findViewById(0x7f0b0275);
            s.addTextChangedListener(new pa(this));
            s.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(25)
            });
            bundle = App.x(this);
            s.setText(bundle);
            iz.a(s, bundle);
            s.setSelection(s.length());
            if (App.au.aa())
            {
                Log.w(z[6]);
                Conversations.a(this, 113);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (App.aU())
            {
                Log.w(z[4]);
                Conversations.a(this, 114);
            }
        }
        App.b(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i(z[0]);
        if (o != null)
        {
            App.a(this);
        }
        if (p != null)
        {
            p.removeCallbacks(k);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "q^S$!mIL*'uCN'%hBX':.HY1<sCE";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "h_c0-rIH";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "q^S$!mIL*'uCN'%hBX':.ON')uI\023,',AY";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "q^S$!mIL*'uCN'%hBX':.ON')uI";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "q^S$!mIL*'uCN'%hBX':._Ko-y\\U0-e";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "bCR4-s_]6!nBOb*nYR!-!XSb%`ER";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "q^S$!mIL*'uCN'%hBX':.OP-+j\001K0'oK";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 265
    //                   2 272
    //                   3 279;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_279;
_L3:
        byte byte1 = 72;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 1;
          goto _L9
_L5:
        byte1 = 44;
          goto _L9
_L6:
        byte1 = 60;
          goto _L9
        byte1 = 66;
          goto _L9
    }
}
