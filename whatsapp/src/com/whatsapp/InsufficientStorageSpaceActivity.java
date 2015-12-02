// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, App, a14

public class InsufficientStorageSpaceActivity extends DialogToastActivity
{

    private static final String z[];
    private long j;

    public InsufficientStorageSpaceActivity()
    {
    }

    private String a(long l)
    {
        String s;
label0:
        {
            int i = App.am;
            if (l == -1L)
            {
                try
                {
                    throw new IllegalArgumentException(z[3]);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
            }
            if (l < 0x100000L)
            {
                s = (new StringBuilder()).append(l / 1024L).append(z[4]).toString();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (l < 0x40000000L)
            {
                s = (new StringBuilder()).append(l / 0x100000L).append(z[5]).toString();
                if (i == 0)
                {
                    break label0;
                }
            }
            s = (new StringBuilder()).append(l / 0x40000000L).append(z[6]).toString();
        }
        return s;
    }

    public void onBackPressed()
    {
        Intent intent = new Intent(z[1]);
        intent.addCategory(z[2]);
        intent.setFlags(0x10000000);
        startActivity(intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001c);
        bundle = (Button)findViewById(0x7f0b0086);
        TextView textview = (TextView)findViewById(0x7f0b0085);
        j = getIntent().getLongExtra(z[0], -1L);
        textview.setText(String.format(getString(0x7f0e020b), new Object[] {
            a(j)
        }));
        bundle.setOnClickListener(new a14(this));
    }

    protected void onResume()
    {
        super.onResume();
        long l = App.aY();
        try
        {
            if (l > j)
            {
                finish();
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "M]]G4pHY@4ZdRf(JHO";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "_CXV>WI\022M?JHRP\177_NHM>P\003qe\030p";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "_CXV>WI\022M?JHRP\177]LHA6Q_E\n\031q`y";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "sDOW8PJ\034M?JHRPq[UHV0\036^LE2[cYA5[IuJ\023GYYW";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\036f~";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\036`~";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\036j~";
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
        char c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 81;
_L9:
        obj[k] = (char)(byte1 ^ c);
        k++;
          goto _L8
_L4:
        byte1 = 62;
          goto _L9
_L5:
        byte1 = 45;
          goto _L9
_L6:
        byte1 = 60;
          goto _L9
        byte1 = 36;
          goto _L9
    }
}
