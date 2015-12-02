// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.fieldstats.o;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.x;
import java.io.File;
import java.util.Arrays;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, akz, oc, au2, 
//            App, mk, aoz, vz, 
//            Main, og, qk, fe, 
//            ft, j3, bo, aka, 
//            adg, fb, hb, za

public class NewGroup extends DialogToastActivity
{

    private static final String z[];
    private TextView j;
    private fe k;
    private EditText l;
    private og m;
    private ImageView n;
    private za o;

    public NewGroup()
    {
        o = new akz(this);
        m = new oc(this);
    }

    static fe a(NewGroup newgroup)
    {
        return newgroup.k;
    }

    private void a(Vector vector)
    {
label0:
        {
            String s = com.whatsapp.util.c.a(l.getText().toString());
            if (s.codePointCount(0, s.length()) <= au2.m)
            {
                if (vector.size() == 0)
                {
                    App.b(this, getString(0x7f0e02b4), 0);
                    return;
                }
            } else
            {
                App.b(this, String.format(getString(0x7f0e040b), new Object[] {
                    Integer.valueOf(au2.m)
                }), 0);
                return;
            }
            String s1 = mk.d(s);
            mk.a(s1, vector);
            if (App.i())
            {
                Log.i((new StringBuilder()).append(z[2]).append(s1).toString());
                App.ah.g(mk.a(s1, s, vector, 2));
                x.a(new vz(this, s1, s, vector));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.i(z[1]);
            App.ah.g(mk.a(s1, s, vector, 3));
        }
        startActivity(new Intent(this, Main.g()));
        finish();
    }

    static og b(NewGroup newgroup)
    {
        return newgroup.m;
    }

    static TextView c(NewGroup newgroup)
    {
        return newgroup.j;
    }

    static EditText d(NewGroup newgroup)
    {
        return newgroup.l;
    }

    protected void onActivityResult(int i, int i1, Intent intent)
    {
        int j1 = App.am;
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   1: 203
    //                   12: 41
    //                   13: 132;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        if (i1 != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (intent == null || !intent.getBooleanExtra(z[3], false))
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(z[5]);
        m.c().delete();
        m.h().delete();
        n.setImageResource(0x7f020097);
        if (j1 == 0) goto _L1; else goto _L5
_L5:
        Log.i(z[4]);
        qk.a(intent, m, this, 13, this);
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        com.whatsapp.qk.c().delete();
        if (i1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(z[6]);
        i = getResources().getDimensionPixelSize(0x7f0a0054);
        n.setImageBitmap(m.a(i, 0.0F, false));
        if (j1 == 0) goto _L1; else goto _L6
_L6:
        if (i1 != 0 || intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        qk.a(intent, this);
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (i1 == -1)
        {
            a(new Vector(Arrays.asList(intent.getStringExtra(z[7]).split(","))));
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        k.a(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        Log.i(z[8]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(0x7f03008f);
        ft.a(o.NEW_GROUP);
        n = (ImageView)findViewById(0x7f0b0256);
        j3 j3_1 = new j3(this);
        n.setOnClickListener(j3_1);
        if (bundle == null)
        {
            m.c().delete();
            m.h().delete();
        }
        j = (TextView)findViewById(0x7f0b0257);
        j.setText(Integer.toString(au2.m));
        findViewById(0x7f0b01bf).setOnClickListener(new bo(this));
        k = new fe(this);
        k.a(o);
        n.setImageResource(0x7f020097);
        l = (EditText)findViewById(0x7f0b0234);
        l.setFilters(new InputFilter[] {
            new aka(au2.m)
        });
        l.addTextChangedListener(new adg(this));
        hb.a(this, getSupportActionBar(), getString(0x7f0e02a2), new fb(this));
    }

    public void onDestroy()
    {
        Log.i(z[0]);
        super.onDestroy();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "a=K\022#`-LZ5j+H\007>v";
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
                obj = "a=K\022#`-LZ?`xR\020%x7N\036qn;_\020\"|t\034\0230f4\034\001>/;N\0200{=\034\022#`-L";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "a=K\022#`-LZ6`x_\0074n,YU6}7I\005k";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "f+c\0074|=H";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "a=K\022#`-LZ2}7L\0059`,S";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "a=K\022#`-LZ#j+Y\001!g7H\032";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "a=K\022#`-LZ!g7H\032!f;W\0205";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "e1X\006";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "a=K\022#`-LZ2}=]\0014";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 81;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 15;
          goto _L9
_L5:
        byte1 = 88;
          goto _L9
_L6:
        byte1 = 60;
          goto _L9
        byte1 = 117;
          goto _L9
    }
}
