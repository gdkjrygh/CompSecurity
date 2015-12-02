// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            VerifySms, bj, asw

class pe extends CountDownTimer
{

    private static final String z[];
    final VerifySms a;
    final View b;
    final long c;
    final ProgressBar d;

    pe(VerifySms verifysms, long l, long l1, ProgressBar progressbar, long l2, View view)
    {
        a = verifysms;
        d = progressbar;
        c = l2;
        b = view;
        super(l, l1);
    }

    public void onFinish()
    {
        VerifySms.p(a).setEnabled(true);
        b.setVisibility(8);
        d.setVisibility(8);
        String s = VerifySms.b(a);
        if (s != null)
        {
            Log.i(z[1]);
            VerifySms.r(a);
            asw.a(new bj(a), new String[] {
                s, z[0]
            });
        }
    }

    public void onTick(long l)
    {
        d.setProgress((int)(((double)(c - l) * 100D) / (double)c));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "[R\0253.K";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
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
                obj = "YV\027*-V@\b0dL\\\020-?K\\\022-?F^\0001dK\\\013&d[A\034n8NE\000'(@W\0";
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
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 75;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 47;
          goto _L9
_L5:
        byte0 = 51;
          goto _L9
_L6:
        byte0 = 101;
          goto _L9
        byte0 = 67;
          goto _L9
    }
}
