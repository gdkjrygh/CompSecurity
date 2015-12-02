// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.b3;
import com.whatsapp.util.Log;
import org.whispersystems.al;
import org.whispersystems.bZ;

// Referenced classes of package com.whatsapp:
//            tt, an, App, alr

class ck
    implements Runnable
{

    private static final String z[];
    final an a;
    final int b;
    final int c;
    final a d;
    final b3 e;

    ck(an an1, b3 b3, a a1, int i, int j)
    {
        a = an1;
        e = b3;
        d = a1;
        b = i;
        c = j;
        super();
    }

    public void run()
    {
        long l = com.whatsapp.tt.a(d.a);
        Log.i((new StringBuilder()).append(z[4]).append(l).append(z[0]).append(d).toString());
        if (com.whatsapp.an.a(a).aq.c(l))
        {
            bZ bz = com.whatsapp.an.a(a).aq.b(l);
            if (bz.e().c() != c)
            {
                Log.i((new StringBuilder()).append(z[3]).append(d).toString());
                com.whatsapp.an.a(a).aq.a(l);
                com.whatsapp.an.a(a).aq.f(l);
                com.whatsapp.an.a(a).ab().post(new alr(this, true));
                return;
            }
            if (b > 2 && com.whatsapp.an.a(a).aq.a(l, d))
            {
                Log.i((new StringBuilder()).append(z[5]).append(d).append(z[2]).toString());
                com.whatsapp.an.a(a).ab().post(new alr(this, true));
                return;
            }
            if (b == 2)
            {
                Log.i((new StringBuilder()).append(z[1]).append(d).toString());
                com.whatsapp.an.a(a).aq.a(d, bz.e().n());
            }
        }
        com.whatsapp.an.a(a).ab().post(new alr(this, false));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "G\016dPD\023\0051G\001\023\030h\025\026\002\tt\\\024\023JwZ\026G";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\006\022~Y\013\023\0061B\r\013\0061G\001\004\005cQD\023\002t\025\006\006\031t\025\017\002\0231@\027\002\0161A\013G\031t[\000G";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "G\037\177A\r\013Jp\025\n\002\0351E\026\002\001tLD\017\013b\025\006\002\017\177\025\002\002\036r]\001\003";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\006\022~Y\013\023\0061Q\001\013\017e\\\n\000JbP\027\024\003~[D\003\037t\025\020\bJcP\003\016\031eG\005\023\003~[D\016\0161V\f\006\004vPD\001\005c\025";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\006\022~Y\013\023\0061V\f\002\tz\\\n\000JbP\027\024\003~[\027G\f~GD";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\006\022~Y\013\023\0061B\r\013\0061B\005\016\0361A\013G\031t[\000G";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 100;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 103;
          goto _L9
_L5:
        byte1 = 106;
          goto _L9
_L6:
        byte1 = 17;
          goto _L9
        byte1 = 53;
          goto _L9
    }
}
