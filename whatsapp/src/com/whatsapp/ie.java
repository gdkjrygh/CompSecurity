// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.bd;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import org.whispersystems.aa;

// Referenced classes of package com.whatsapp:
//            App, ys

final class ie
    implements Runnable
{

    private static final String z[];
    final ys a;
    private final boolean b;
    private final bd c;
    private final byte d[];
    private final bd e[];
    private final int f;

    ie(ys ys1, byte abyte0[], int i, bd abd[], bd bd, boolean flag)
    {
        a = ys1;
        super();
        d = abyte0;
        f = i;
        e = abd;
        c = bd;
        b = flag;
    }

    public void run()
    {
        byte abyte0[] = aa.a(f);
        if (b)
        {
            Log.i(z[2]);
            App.a(d, abyte0, (byte)5, e, c);
        }
        Log.i((new StringBuilder()).append(z[1]).append(a.a).append(z[3]).append(a.c).append(z[4]).append(f).append(z[0]).append(a.b).toString());
        c4 c4_1 = new c4(a.c);
        c4_1.I = a.b;
        App.a(c4_1, a.a, abyte0);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "N\030UZW\007\034U]\022\017\036\020M[\003\017\020";
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
                obj = "\017\022_U]\032\006\020KW\035\017^][\000\r\020KW\032\030I\031@\013\033E\\A\032J";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\017\022_U]\032\006\020KW\035\017^][\000\r\020I@\013\001U@A";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "N\f_K\022";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "N\035YMZN";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 50;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 110;
          goto _L9
_L5:
        byte1 = 106;
          goto _L9
_L6:
        byte1 = 48;
          goto _L9
        byte1 = 57;
          goto _L9
    }
}
