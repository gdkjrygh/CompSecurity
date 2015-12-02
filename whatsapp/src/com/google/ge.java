// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google:
//            d9, bp, cR

public class ge extends RuntimeException
{

    private static final long serialVersionUID = 0x986022c4d65db14dL;
    private static final String z[];
    private final List a;

    public ge(cR cr)
    {
        super(z[2]);
        a = null;
    }

    public ge(List list)
    {
        super(a(list));
        a = list;
    }

    private static String a(List list)
    {
        StringBuilder stringbuilder;
        boolean flag;
        int i;
        i = d9.c;
        stringbuilder = new StringBuilder(z[0]);
        list = list.iterator();
        flag = true;
_L2:
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        String s = (String)list.next();
        boolean flag1 = flag;
        if (flag)
        {
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            flag1 = false;
        }
        try
        {
            stringbuilder.append(z[1]);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        flag = flag1;
_L3:
        stringbuilder.append(s);
        if (i == 0) goto _L2; else goto _L1
_L1:
        return stringbuilder.toString();
        flag = false;
          goto _L3
    }

    public bp a()
    {
        return new bp(getMessage());
    }

    public List b()
    {
        return Collections.unmodifiableList(a);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "^tMirtt\036wz`bWtt3c[kfzc[~3ux[vw`+\036".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "?1".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_195;
_L1:
        byte0 = 19;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 19;
          goto _L7
_L3:
        byte0 = 17;
          goto _L7
_L4:
        byte0 = 62;
          goto _L7
        byte0 = 26;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            ac = "^tMirtt\036mr`1Ss``xP}3atOozatZ:uztR~`=1\0362_ze[:af\177Js~v1]uf\177u\036t|g1Z\177gvcSs}v1Irzpy\036|zv}Zi3dtL\1773~xMiz}v\0274".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 240
    //                   0 261
    //                   1 267
    //                   2 273
    //                   3 279;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_279;
_L8:
        byte1 = 19;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 19;
          goto _L14
_L10:
        byte1 = 17;
          goto _L14
_L11:
        byte1 = 62;
          goto _L14
        byte1 = 26;
          goto _L14
_L21:
        byte byte1;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
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
        byte byte2 = 19;
_L22:
        ac[i] = (char)(byte2 ^ c);
        i++;
        if (true) goto _L21; else goto _L20
_L20:
        byte2 = 19;
          goto _L22
_L17:
        byte2 = 17;
          goto _L22
_L18:
        byte2 = 62;
          goto _L22
        byte2 = 26;
          goto _L22
    }
}
