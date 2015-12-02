// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.CountDownTimer;
import android.text.format.DateUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            VerifySms, VerifyNumber, App

class a_t extends CountDownTimer
{

    private static final String z[];
    final VerifySms a;

    a_t(VerifySms verifysms, long l, long l1)
    {
        a = verifysms;
        super(l, l1);
    }

    public void onFinish()
    {
label0:
        {
            Log.i((new StringBuilder()).append(z[1]).append(VerifySms.s()).toString());
            if (VerifySms.s() == 1)
            {
                if ("".equals(VerifyNumber.k))
                {
                    a.g(z[0]);
                }
                VerifySms.j(a);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            VerifySms.x(a);
            Log.i(z[2]);
            if (a.j || a.isFinishing())
            {
                a.d();
            }
        }
    }

    public void onTick(long l)
    {
        VerifySms.c(a, (VerifySms.h(a) + VerifySms.j()) - l);
        VerifySms.c(a).setProgress((int)(((double)VerifySms.v(a) * 100D) / (double)VerifySms.y(a)));
        VerifySms.d(l);
        String s = DateUtils.formatElapsedTime((VerifySms.y(a) - VerifySms.v(a)) / 1000L);
        VerifySms.w(a).setText(s);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "Q\037yu\024Q\037{w\024V\023xvVW\016";
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
                obj = "T\037gz_[\tx`\026V\023xvVW\0165";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "T\037gz_[\tx`\026V\023xvVW\0168uPL\033y";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 57;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 34;
          goto _L9
_L5:
        byte0 = 122;
          goto _L9
_L6:
        byte0 = 21;
          goto _L9
        byte0 = 19;
          goto _L9
    }
}
