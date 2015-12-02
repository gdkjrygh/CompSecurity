// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.lang.reflect.Method;

// Referenced classes of package com.google:
//            p, d8, eh, P, 
//            fR, ee

final class r extends p
{

    private static final String z[];
    private final Method h;
    private final Method i;

    r(fR fr, String s, Class class1, Class class2)
    {
        super(fr, s, class1, class2);
        i = d8.b(d, z[0], new Class[0]);
        h = d8.b(class2, (new StringBuilder()).append(z[2]).append(s).append(z[1]).toString(), new Class[0]);
    }

    private Object a(Object obj)
    {
        if (d.isInstance(obj))
        {
            return obj;
        } else
        {
            return ((eh)d8.b(i, null, new Object[0])).a((P)obj).a();
        }
    }

    public eh a()
    {
        return (eh)d8.b(i, null, new Object[0]);
    }

    public void a(ee ee, Object obj)
    {
        super.a(ee, a(obj));
    }

    static 
    {
        Object obj;
        int j;
        int k;
        obj = "4ZjW\0353Syp\032".toCharArray();
        k = obj.length;
        j = 0;
_L6:
        Object obj1;
        char ac[];
        char c;
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\030Jty\f?M".toCharArray();
            k = obj1.length;
            j = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_195;
_L1:
        byte0 = 104;
_L7:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L6
_L2:
        byte0 = 90;
          goto _L7
_L3:
        byte0 = 63;
          goto _L7
_L4:
        byte0 = 29;
          goto _L7
        byte0 = 21;
          goto _L7
_L13:
        byte byte0;
        if (k <= j)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            ac = "=Zi".toCharArray();
            k = ac.length;
            j = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 240
    //                   0 261
    //                   1 267
    //                   2 273
    //                   3 279;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_279;
_L8:
        byte1 = 104;
_L14:
        obj1[j] = (char)(byte1 ^ c);
        j++;
          goto _L13
_L9:
        byte1 = 90;
          goto _L14
_L10:
        byte1 = 63;
          goto _L14
_L11:
        byte1 = 29;
          goto _L14
        byte1 = 21;
          goto _L14
_L21:
        byte byte1;
        if (k <= j)
        {
            z = (new String[] {
                obj, obj1, (new String(ac)).intern()
            });
            return;
        }
        c = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 345
    //                   1 351
    //                   2 357
    //                   3 363;
           goto _L15 _L16 _L17 _L18 _L19
_L16:
        break; /* Loop/switch isn't completed */
_L19:
        break MISSING_BLOCK_LABEL_363;
_L15:
        byte byte2 = 104;
_L22:
        ac[j] = (char)(byte2 ^ c);
        j++;
        if (true) goto _L21; else goto _L20
_L20:
        byte2 = 90;
          goto _L22
_L17:
        byte2 = 63;
          goto _L22
_L18:
        byte2 = 29;
          goto _L22
        byte2 = 21;
          goto _L22
    }
}
