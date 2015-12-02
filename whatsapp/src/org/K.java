// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;


public final class K extends Enum
{

    public static final K MESSAGES;
    public static final K RECENT;
    public static final K UIDNEXT;
    public static final K UIDVALIDITY;
    public static final K UNSEEN;
    private static final K a[];
    private static final String z[];

    private K(String s, int i)
    {
        super(s, i);
    }

    public static K valueOf(String s)
    {
        return (K)Enum.valueOf(org/K, s);
    }

    public static K[] values()
    {
        return (K[])a.clone();
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "\037GL?\007\004".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\037@[4\007\022]".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 348
    //                   0 371
    //                   1 378
    //                   2 385
    //                   3 392;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_392;
_L1:
        byte0 = 66;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 74;
          goto _L7
_L3:
        byte0 = 9;
          goto _L7
_L4:
        byte0 = 31;
          goto _L7
        byte0 = 122;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\007LL)\003\rLL".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 440
    //                   0 463
    //                   1 470
    //                   2 477
    //                   3 484;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_484;
_L8:
        byte1 = 66;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 74;
          goto _L14
_L10:
        byte1 = 9;
          goto _L14
_L11:
        byte1 = 31;
          goto _L14
        byte1 = 122;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "\037@[,\003\006@[3\026\023".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 532
    //                   0 555
    //                   1 562
    //                   2 569
    //                   3 576;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_576;
_L15:
        byte2 = 66;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 74;
          goto _L21
_L17:
        byte2 = 9;
          goto _L21
_L18:
        byte2 = 31;
          goto _L21
        byte2 = 122;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            ac = "\030L\\?\f\036".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 624
    //                   0 647
    //                   1 654
    //                   2 661
    //                   3 668;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_668;
_L22:
        byte3 = 66;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 74;
          goto _L28
_L24:
        byte3 = 9;
          goto _L28
_L25:
        byte3 = 31;
          goto _L28
        byte3 = 122;
          goto _L28
_L35:
        byte byte3;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, (new String(ac)).intern()
            });
            MESSAGES = new K(z[2], 0);
            RECENT = new K(z[4], 1);
            UIDNEXT = new K(z[1], 2);
            UIDVALIDITY = new K(z[3], 3);
            UNSEEN = new K(z[0], 4);
            a = (new K[] {
                MESSAGES, RECENT, UIDNEXT, UIDVALIDITY, UNSEEN
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 716
    //                   0 740
    //                   1 747
    //                   2 754
    //                   3 761;
           goto _L29 _L30 _L31 _L32 _L33
_L30:
        break; /* Loop/switch isn't completed */
_L33:
        break MISSING_BLOCK_LABEL_761;
_L29:
        byte byte4 = 66;
_L36:
        ac[i] = (char)(byte4 ^ c);
        i++;
        if (true) goto _L35; else goto _L34
_L34:
        byte4 = 74;
          goto _L36
_L31:
        byte4 = 9;
          goto _L36
_L32:
        byte4 = 31;
          goto _L36
        byte4 = 122;
          goto _L36
    }
}
