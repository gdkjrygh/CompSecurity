// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.math.BigDecimal;

// Referenced classes of package com.whatsapp:
//            p2

final class mx extends Enum
{

    public static final mx BIG_DECIMAL;
    public static final mx BYTE;
    public static final mx DOUBLE;
    public static final mx FLOAT;
    public static final mx INTEGER;
    public static final mx LONG;
    public static final mx SHORT;
    private static final mx a[];
    private static final String z[];

    private mx(String s, int i)
    {
        super(s, i);
    }

    public static mx fromNumber(Number number)
    {
label0:
        {
            try
            {
                if (!(number instanceof Long))
                {
                    break label0;
                }
                number = LONG;
            }
            // Misplaced declaration of an exception variable
            catch (Number number)
            {
                throw number;
            }
            return number;
        }
label1:
        {
            try
            {
                if (!(number instanceof Double))
                {
                    break label1;
                }
                number = DOUBLE;
            }
            // Misplaced declaration of an exception variable
            catch (Number number)
            {
                throw number;
            }
            return number;
        }
label2:
        {
            try
            {
                if (!(number instanceof Integer))
                {
                    break label2;
                }
                number = INTEGER;
            }
            // Misplaced declaration of an exception variable
            catch (Number number)
            {
                throw number;
            }
            return number;
        }
label3:
        {
            try
            {
                if (!(number instanceof Float))
                {
                    break label3;
                }
                number = FLOAT;
            }
            // Misplaced declaration of an exception variable
            catch (Number number)
            {
                throw number;
            }
            return number;
        }
label4:
        {
            try
            {
                if (!(number instanceof Short))
                {
                    break label4;
                }
                number = SHORT;
            }
            // Misplaced declaration of an exception variable
            catch (Number number)
            {
                throw number;
            }
            return number;
        }
label5:
        {
            try
            {
                if (!(number instanceof Byte))
                {
                    break label5;
                }
                number = BYTE;
            }
            // Misplaced declaration of an exception variable
            catch (Number number)
            {
                throw number;
            }
            return number;
        }
label6:
        {
            try
            {
                if (!(number instanceof BigDecimal))
                {
                    break label6;
                }
                number = BIG_DECIMAL;
            }
            // Misplaced declaration of an exception variable
            catch (Number number)
            {
                throw number;
            }
            return number;
        }
        throw new IllegalArgumentException((new StringBuilder()).append(z[3]).append(number.getClass().getName()).append(z[2]).toString());
    }

    public static mx valueOf(String s)
    {
        return (mx)Enum.valueOf(com/whatsapp/mx, s);
    }

    public static mx[] values()
    {
        return (mx[])a.clone();
    }

    public Number toNumber(double d)
    {
        Long long1;
        int i;
        try
        {
            i = p2.a[ordinal()];
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        i;
        JVM INSTR tableswitch 1 7: default 56
    //                   1 94
    //                   2 109
    //                   3 114
    //                   4 124
    //                   5 133
    //                   6 144
    //                   7 155;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        throw new InstantiationError((new StringBuilder()).append(z[0]).append(this).append(z[1]).toString());
_L2:
        long1 = new Long((long)d);
        return long1;
_L3:
        return Double.valueOf(d);
_L4:
        return new Integer((int)d);
_L5:
        return new Float(d);
_L6:
        return new Short((short)(int)d);
_L7:
        return new Byte((byte)(int)d);
_L8:
        return new BigDecimal(d);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "%[x\b~fYyA|#Hb\017";
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
                obj = "fNy\017kftcBh#H6@h,_u[";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "a\032\177\\*(Ub\017y3Jf@x2_r";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\bO{Mo4\032uCk5I6\b";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\025rY}^";
                byte0 = 3;
                i = 4;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "\002uCmF\003";
                i = 5;
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "\017tBjM\003h";
                i = 6;
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\000vYn^";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\004sQpN\003y_bK\n";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\nuXh";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\004cBj";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                LONG = new mx(z[9], 0);
                DOUBLE = new mx(z[5], 1);
                INTEGER = new mx(z[6], 2);
                FLOAT = new mx(z[7], 3);
                SHORT = new mx(z[4], 4);
                BYTE = new mx(z[10], 5);
                BIG_DECIMAL = new mx(z[8], 6);
                a = (new mx[] {
                    LONG, DOUBLE, INTEGER, FLOAT, SHORT, BYTE, BIG_DECIMAL
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 492
    //                   0 515
    //                   1 522
    //                   2 529
    //                   3 536;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_536;
_L3:
        byte byte1 = 10;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 70;
          goto _L9
_L5:
        byte1 = 58;
          goto _L9
_L6:
        byte1 = 22;
          goto _L9
        byte1 = 47;
          goto _L9
    }
}
