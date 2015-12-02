// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.b3;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            tt, an, App, yx

class h5
    implements Runnable
{

    private static final String z[];
    final an a;
    final a b;
    final b3 c;

    h5(an an1, a a1, b3 b3)
    {
        a = an1;
        b = a1;
        c = b3;
        super();
    }

    public void run()
    {
        long l = com.whatsapp.tt.a(b.a);
        Log.i((new StringBuilder()).append(z[0]).append(l).append(z[1]).append(b).toString());
        com.whatsapp.an.a(a).aq.e(l);
        com.whatsapp.an.a(a).aq.a(l, null);
        com.whatsapp.an.a(a).ab().post(new yx(this));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\001_18:\024K~00\fB*=;\007\007-1&\023N1:&@A1&u";
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
                obj = "@C+1u\024H~'0\022Q;&u\020K?=;\024B& u\022B=1<\020S~2:\022\007";
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
        byte byte0 = 85;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 96;
          goto _L9
_L5:
        byte0 = 39;
          goto _L9
_L6:
        byte0 = 94;
          goto _L9
        byte0 = 84;
          goto _L9
    }
}
