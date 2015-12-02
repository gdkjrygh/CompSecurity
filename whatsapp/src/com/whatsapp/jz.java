// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.x;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            f4, nc, fm, r_

class jz extends Handler
{

    private static final String z[];
    final f4 a;

    private jz(f4 f4_1)
    {
        a = f4_1;
        super();
    }

    jz(f4 f4_1, r_ r_)
    {
        this(f4_1);
    }

    public void handleMessage(Message message)
    {
label0:
        {
            if (f4.a(a) == null)
            {
                break label0;
            }
            message = new File((new StringBuilder()).append(f4.c(a)).append(z[1]).append(z[0]).toString());
            if (message.length() > 0L)
            {
                x.a(new nc(this, message));
                if (fm.a == 0)
                {
                    break label0;
                }
            }
            sendEmptyMessageDelayed(0, 50L);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\\Hje";
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
                obj = "\\\030";
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
        char c = obj[j];
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
        byte byte0 = 124;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 114;
          goto _L9
_L5:
        byte0 = 41;
          goto _L9
_L6:
        byte0 = 11;
          goto _L9
        byte0 = 6;
          goto _L9
    }
}
