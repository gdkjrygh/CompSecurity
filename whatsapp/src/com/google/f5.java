// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google:
//            cR, bp, ga

final class f5
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private static final String z[];
    private byte a[];
    private String b;

    f5(cR cr)
    {
        b = cr.getClass().getName();
        a = cr.e();
    }

    protected Object readResolve()
    {
        Object obj;
        try
        {
            obj = (ga)Class.forName(b).getMethod(z[4], new Class[0]).invoke(null, new Object[0]);
            ((ga) (obj)).a(a);
            obj = ((ga) (obj)).b();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException(z[5], classnotfoundexception);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new RuntimeException(z[1], nosuchmethodexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(z[0], illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new RuntimeException(z[3], invocationtargetexception.getCause());
        }
        catch (bp bp1)
        {
            throw new RuntimeException(z[2], bp1);
        }
        return obj;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "\"R~db\022\034ki.\024]sj.\031YhD{\036P{c|WQzrf\030X".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\"R~db\022\034ki.\021Uqb.\031YhD{\036P{c|WQzrf\030X".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 295
    //                   1 302
    //                   2 309
    //                   3 316;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_316;
_L1:
        byte0 = 14;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 119;
          goto _L7
_L3:
        byte0 = 60;
          goto _L7
_L4:
        byte0 = 31;
          goto _L7
        byte0 = 6;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\"R~db\022\034ki.\002R{c|\004H~hjWLmiz\030\034}sh\021Ym".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 364
    //                   0 387
    //                   1 394
    //                   2 401
    //                   3 408;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_408;
_L8:
        byte1 = 14;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 119;
          goto _L14
_L10:
        byte1 = 60;
          goto _L14
_L11:
        byte1 = 31;
          goto _L14
        byte1 = 6;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "2Nmi|W_~jb\036Rx&`\022K]sg\033Xzt".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_500;
_L15:
        byte2 = 14;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 119;
          goto _L21
_L17:
        byte2 = 60;
          goto _L21
_L18:
        byte2 = 31;
          goto _L21
        byte2 = 6;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\031YhD{\036P{c|".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 548
    //                   0 571
    //                   1 578
    //                   2 585
    //                   3 592;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_592;
_L22:
        byte3 = 14;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 119;
          goto _L28
_L24:
        byte3 = 60;
          goto _L28
_L25:
        byte3 = 31;
          goto _L28
        byte3 = 6;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            ac = "\"R~db\022\034ki.\021Uqb.\007NpraW^j`h\022N?eb\026Ol".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 640
    //                   0 664
    //                   1 671
    //                   2 678
    //                   3 685;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_685;
_L29:
        byte4 = 14;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 119;
          goto _L35
_L31:
        byte4 = 60;
          goto _L35
_L32:
        byte4 = 31;
          goto _L35
        byte4 = 6;
          goto _L35
_L42:
        byte byte4;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 732
    //                   0 756
    //                   1 763
    //                   2 770
    //                   3 777;
           goto _L36 _L37 _L38 _L39 _L40
_L37:
        break; /* Loop/switch isn't completed */
_L40:
        break MISSING_BLOCK_LABEL_777;
_L36:
        byte byte5 = 14;
_L43:
        ac[i] = (char)(byte5 ^ c);
        i++;
        if (true) goto _L42; else goto _L41
_L41:
        byte5 = 119;
          goto _L43
_L38:
        byte5 = 60;
          goto _L43
_L39:
        byte5 = 31;
          goto _L43
        byte5 = 6;
          goto _L43
    }
}
