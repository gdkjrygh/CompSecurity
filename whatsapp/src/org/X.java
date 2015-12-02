// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;


public final class X extends Enum
{

    public static final X AUTH_STATE;
    public static final X DISCONNECTED_STATE;
    public static final X LOGOUT_STATE;
    public static final X NOT_AUTH_STATE;
    private static final X a[];
    private static final String z[];

    private X(String s, int i)
    {
        super(s, i);
    }

    public static X valueOf(String s)
    {
        return (X)Enum.valueOf(org/X, s);
    }

    public static X[] values()
    {
        return (X[])a.clone();
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "H>U2\007P.A)\023P4".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "J>F\"\023Q%Z\"\001P0F8".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 284
    //                   0 307
    //                   1 313
    //                   2 320
    //                   3 327;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_327;
_L1:
        byte0 = 82;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 4;
          goto _L7
_L3:
        byte0 = 113;
          goto _L7
_L4:
        byte0 = 18;
          goto _L7
        byte0 = 125;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "@8A>\035J?W>\006A5M.\006E%W".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 405
    //                   2 412
    //                   3 419;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_419;
_L8:
        byte1 = 82;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 4;
          goto _L14
_L10:
        byte1 = 113;
          goto _L14
_L11:
        byte1 = 18;
          goto _L14
        byte1 = 125;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "E$F5\rW%S)\027".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 468
    //                   0 491
    //                   1 497
    //                   2 504
    //                   3 511;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_511;
_L15:
        byte2 = 82;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 4;
          goto _L21
_L17:
        byte2 = 113;
          goto _L21
_L18:
        byte2 = 18;
          goto _L21
        byte2 = 125;
          goto _L21
_L28:
        byte byte2;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, (new String(ac)).intern()
            });
            DISCONNECTED_STATE = new X(z[2], 0);
            NOT_AUTH_STATE = new X(z[1], 1);
            AUTH_STATE = new X(z[3], 2);
            LOGOUT_STATE = new X(z[0], 3);
            a = (new X[] {
                DISCONNECTED_STATE, NOT_AUTH_STATE, AUTH_STATE, LOGOUT_STATE
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 560
    //                   0 583
    //                   1 589
    //                   2 596
    //                   3 603;
           goto _L22 _L23 _L24 _L25 _L26
_L23:
        break; /* Loop/switch isn't completed */
_L26:
        break MISSING_BLOCK_LABEL_603;
_L22:
        byte byte3 = 82;
_L29:
        ac[i] = (char)(byte3 ^ c);
        i++;
        if (true) goto _L28; else goto _L27
_L27:
        byte3 = 4;
          goto _L29
_L24:
        byte3 = 113;
          goto _L29
_L25:
        byte3 = 18;
          goto _L29
        byte3 = 125;
          goto _L29
    }
}
