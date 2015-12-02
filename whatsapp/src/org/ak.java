// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;

import java.util.EventObject;

// Referenced classes of package org:
//            a0, g

public class ak extends EventObject
{

    public static final long d = -1L;
    private static final long serialVersionUID = 0xf29be36d82d2b5a5L;
    private static final String z[];
    private final long a;
    private final long b;
    private final int c;

    public ak(Object obj, long l, int i, long l1)
    {
        int j = a0.a;
        super(obj);
        c = i;
        b = l;
        a = l1;
        if (g.b != 0)
        {
            a0.a = j + 1;
        }
    }

    public int a()
    {
        return c;
    }

    public long b()
    {
        return b;
    }

    public long c()
    {
        return a;
    }

    public String toString()
    {
        int i = a0.a;
        String s = (new StringBuilder()).append(getClass().getName()).append(z[2]).append(source).append(z[0]).append(b).append(z[3]).append(c).append(z[1]).append(a).append("]").toString();
        if (i != 0)
        {
            g.b++;
        }
        return s;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "{M%E\0166\001l".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "{M\"C\0002P".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_236;
_L1:
        byte0 = 122;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 87;
          goto _L7
_L3:
        byte0 = 109;
          goto _L7
_L4:
        byte0 = 81;
          goto _L7
        byte0 = 42;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\f\036>_\b4\bl".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 284
    //                   0 307
    //                   1 314
    //                   2 321
    //                   3 328;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_328;
_L8:
        byte1 = 122;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 87;
          goto _L14
_L10:
        byte1 = 109;
          goto _L14
_L11:
        byte1 = 81;
          goto _L14
        byte1 = 42;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "{M3S\0162\036l".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 406
    //                   2 413
    //                   3 420;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_420;
_L15:
        byte2 = 122;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 87;
          goto _L21
_L17:
        byte2 = 109;
          goto _L21
_L18:
        byte2 = 81;
          goto _L21
        byte2 = 42;
          goto _L21
_L28:
        byte byte2;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 468
    //                   0 491
    //                   1 498
    //                   2 505
    //                   3 512;
           goto _L22 _L23 _L24 _L25 _L26
_L23:
        break; /* Loop/switch isn't completed */
_L26:
        break MISSING_BLOCK_LABEL_512;
_L22:
        byte byte3 = 122;
_L29:
        ac[i] = (char)(byte3 ^ c1);
        i++;
        if (true) goto _L28; else goto _L27
_L27:
        byte3 = 87;
          goto _L29
_L24:
        byte3 = 109;
          goto _L29
_L25:
        byte3 = 81;
          goto _L29
        byte3 = 42;
          goto _L29
    }
}
