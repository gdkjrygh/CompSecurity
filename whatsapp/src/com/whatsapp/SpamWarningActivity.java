// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, CircularProgressBar, hn, App, 
//            zp, yh

public class SpamWarningActivity extends DialogToastActivity
{

    private static ConditionVariable j;
    private static final String z[];
    private int k;

    public SpamWarningActivity()
    {
    }

    private void a()
    {
        CircularProgressBar circularprogressbar = (CircularProgressBar)findViewById(0x7f0b0088);
        circularprogressbar.setVisibility(0);
        circularprogressbar.setProgressBarBackgroundColor(0xffff0000);
        circularprogressbar.setProgressBarColor(0xffe0e0e0);
        circularprogressbar.setPaintStrokeFactor(30);
        circularprogressbar.setKnobEnabled(true);
        circularprogressbar.setMax(k * 1000);
        (new hn(this, k * 1000, 10L, circularprogressbar)).start();
    }

    public static void a(boolean flag)
    {
label0:
        {
            if (flag)
            {
                j.open();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            j.close();
        }
    }

    private void b()
    {
        (new zp(this)).start();
    }

    static ConditionVariable c()
    {
        return j;
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        Intent intent = new Intent(z[0]);
        intent.addCategory(z[1]);
        intent.setFlags(0x10000000);
        startActivity(intent);
    }

    protected void onCreate(Bundle bundle)
    {
        int l;
        int i1;
        l = App.am;
        super.onCreate(bundle);
        setContentView(0x7f03001d);
        setTitle(0x7f0e03f0);
        i1 = getIntent().getIntExtra(z[5], 100);
        k = getIntent().getIntExtra(z[2], -1);
        Log.i((new StringBuilder()).append(z[4]).append(i1).append(z[3]).append(k).toString());
        i1;
        JVM INSTR tableswitch 101 106: default 136
    //                   101 232
    //                   102 239
    //                   103 246
    //                   104 253
    //                   105 136
    //                   106 260;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6
_L1:
        int i;
label0:
        {
            if (k == -1)
            {
                i = 0x7f0e03ee;
                if (l == 0)
                {
                    break label0;
                }
            }
            i = 0x7f0e03ec;
        }
_L10:
        ((Button)findViewById(0x7f0b0089)).setOnClickListener(new yh(this, i1));
        ((TextView)findViewById(0x7f0b0087)).setText(i);
        if (k != -1) goto _L8; else goto _L7
_L7:
        findViewById(0x7f0b0088).setVisibility(8);
        b();
        if (l == 0) goto _L9; else goto _L8
_L8:
        findViewById(0x7f0b008a).setVisibility(8);
        a();
_L9:
        return;
_L2:
        i = 0x7f0e03f3;
        if (l == 0) goto _L10; else goto _L3
_L3:
        i = 0x7f0e03f1;
        if (l == 0) goto _L10; else goto _L4
_L4:
        i = 0x7f0e03f2;
        if (l == 0) goto _L10; else goto _L5
_L5:
        i = 0x7f0e03f5;
        if (l == 0) goto _L10; else goto _L6
_L6:
        i = 0x7f0e03f4;
        if (l != 0) goto _L1; else goto _L10
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "3\005_<\017;\017\025'\016&\016U:N3\bO'\017<Ev\017)\034";
        byte0 = -1;
        i = 0;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "3\005_<\017;\017\025'\016&\016U:N1\nO+\007=\031B`(\035&~";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "7\023K'\022+4R ?!\016X!\0166\030";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "r\nU*@7\023K'\022+K\023'\016r\030^-\017<\017Hg@";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\001\033Z#73\031U'\0165*X:\t$\002O7@!\037Z<\0247\017\0339\t&\003\033-\0176\016\033";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "!\033Z#?%\nI \t<\fd<\0053\030T ?9\016B";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                j = new ConditionVariable(false);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 224
    //                   0 247
    //                   1 254
    //                   2 261
    //                   3 268;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_268;
_L3:
        byte byte1 = 96;
_L9:
        obj[l] = (char)(byte1 ^ c1);
        l++;
          goto _L8
_L4:
        byte1 = 82;
          goto _L9
_L5:
        byte1 = 107;
          goto _L9
_L6:
        byte1 = 59;
          goto _L9
        byte1 = 78;
          goto _L9
    }
}
