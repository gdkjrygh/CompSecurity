// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.fieldstats.o;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.c;
import java.io.File;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, wd, App, og, 
//            a9g, a3g, k, qk, 
//            ft, Main, ad7, bf, 
//            yf

public class ProfileInfoActivity extends DialogToastActivity
    implements wd
{

    private static final String z[];
    private Bitmap j;
    private boolean k;
    private View l;
    private TextView m;
    private Runnable n;
    private og o;
    private Handler p;
    private ImageView q;

    public ProfileInfoActivity()
    {
    }

    static og a(ProfileInfoActivity profileinfoactivity)
    {
        return profileinfoactivity.o;
    }

    private void a(Bitmap bitmap)
    {
        q.setImageBitmap(bitmap);
    }

    private void b()
    {
        float f;
        int i;
        int i1;
        i = App.am;
        l.setVisibility(8);
        i1 = getResources().getDimensionPixelSize(0x7f0a004e);
        int j1 = Math.min(getWindowManager().getDefaultDisplay().getWidth(), getWindowManager().getDefaultDisplay().getHeight());
        f = (6F * (float)i1) / (float)j1;
        if (!a9g.a(o.a)) goto _L2; else goto _L1
_L1:
        Bitmap bitmap;
        q.setEnabled(false);
        l.setVisibility(0);
        if (j == null)
        {
            j = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ALPHA_8);
        }
        bitmap = j;
        k = false;
_L4:
        a(bitmap);
        return;
_L2:
label0:
        {
label1:
            {
                q.setEnabled(true);
                l.setVisibility(4);
                Bitmap bitmap1 = o.a(i1, f, false);
                bitmap = bitmap1;
                if (bitmap1 != null)
                {
                    break label0;
                }
                if (o.q == 0 && o.u == 0)
                {
                    l.setVisibility(0);
                    if (p == null)
                    {
                        p = new Handler();
                        n = new a3g(this);
                    }
                    p.removeCallbacks(n);
                    p.postDelayed(n, 30000L);
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                l.setVisibility(4);
            }
            Bitmap bitmap2 = og.a(0x7f02055a, i1, f);
            k = false;
            bitmap = bitmap2;
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            bitmap = bitmap2;
        }
        k = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean b(ProfileInfoActivity profileinfoactivity)
    {
        return profileinfoactivity.k;
    }

    static View c(ProfileInfoActivity profileinfoactivity)
    {
        return profileinfoactivity.l;
    }

    static TextView d(ProfileInfoActivity profileinfoactivity)
    {
        return profileinfoactivity.m;
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
        if (o != null && s.equals(o.a))
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
        com.whatsapp.qk.c().delete();
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

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i(z[2]);
        if (!WhatsAppLibLoader.a(null))
        {
            Log.i(z[5]);
            finish();
        } else
        {
            setContentView(0x7f030096);
            ft.a(o.PROFILE);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            o = App.az.f();
            if (o == null)
            {
                Log.i(z[3]);
                App.q(z[6]);
                startActivity(new Intent(this, com/whatsapp/Main));
                finish();
                return;
            }
            m = (TextView)findViewById(0x7f0b0275);
            bundle = App.x(this);
            m.setText(com.whatsapp.util.c.b(bundle, this));
            findViewById(0x7f0b0277).setOnClickListener(new ad7(this));
            q = (ImageView)findViewById(0x7f0b0109);
            q.setOnClickListener(new bf(this));
            findViewById(0x7f0b0256).setOnClickListener(new yf(this));
            l = findViewById(0x7f0b0152);
            b();
            App.b(this);
            if (z[4].equals(getIntent().getAction()))
            {
                qk.a(getIntent(), o, this, 13, this);
                return;
            }
        }
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
            p.removeCallbacks(n);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "4M mP(Z&e_+\020+nJ0M r";
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
                obj = "-L\020y\\7Z;";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "4M mP(Z&e_+\020,y\\%K*";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "4M mP(Z&e_+\020,y\\%K*$W+\022\"n";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "%Q+yV-[abW0Z!\177\027%\\;bV*\021\016_m\005|\007T}\005k\016";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "%] yM-Q(+]1Zo\177VdQ.\177P2ZogP&M.yP!LofP7L&e^";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "'P!}\\6L.\177P+Q<+[+J!h\\dK +T%V!";
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
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 57;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 68;
          goto _L9
_L5:
        byte1 = 63;
          goto _L9
_L6:
        byte1 = 79;
          goto _L9
        byte1 = 11;
          goto _L9
    }
}
