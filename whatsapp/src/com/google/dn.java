// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;

// Referenced classes of package com.google:
//            cR, a3, gv, ge, 
//            fa

public abstract class dn
    implements cR
{

    public static int a;
    private static final String z[];

    public dn()
    {
    }

    public a3 a()
    {
        Object obj;
        try
        {
            obj = a3.a(b());
            a(((gv) (obj)).b());
            obj = ((gv) (obj)).a();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(z[0], ioexception);
        }
        return ((a3) (obj));
    }

    ge a()
    {
        return new ge(this);
    }

    public byte[] e()
    {
        byte abyte0[];
        try
        {
            abyte0 = new byte[b()];
            fa fa1 = fa.a(abyte0);
            a(fa1);
            fa1.b();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(z[1], ioexception);
        }
        return abyte0;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "O9q+ p5y+/{|w-a}|A;5y\017w0(r;#6)n9tb r|J\r\004d?f25u3mbio4l7-x|m'7y.#* l,f,h2".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "O9q+ p5y+/{|w-a}|a;5y|b03}%#6)n9tb r|J\r\004d?f25u3mbio4l7-x|m'7y.#* l,f,h2".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 130
    //                   1 136
    //                   2 142
    //                   3 147;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_147;
_L1:
        byte0 = 65;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 28;
          goto _L7
_L3:
        byte0 = 92;
          goto _L7
_L4:
        byte0 = 3;
          goto _L7
        byte0 = 66;
          goto _L7
_L14:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 210
    //                   1 216
    //                   2 222
    //                   3 227;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_227;
_L8:
        byte byte1 = 65;
_L15:
        ac[i] = (char)(byte1 ^ c);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 28;
          goto _L15
_L10:
        byte1 = 92;
          goto _L15
_L11:
        byte1 = 3;
          goto _L15
        byte1 = 66;
          goto _L15
    }
}
