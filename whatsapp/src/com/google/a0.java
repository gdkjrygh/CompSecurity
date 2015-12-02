// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            k, bQ, aO, al, 
//            aL, aV, ax, aX, 
//            aY

public abstract class a0
{

    public static int b;
    private static final String z[];
    private final k a;
    private final bQ c;

    a0(bQ bq)
    {
        c = bq;
        a = new k(bq);
    }

    public static a0 a(bQ bq)
    {
label0:
        {
            try
            {
                if (!bq.e(1))
                {
                    break label0;
                }
                bq = new aO(bq);
            }
            // Misplaced declaration of an exception variable
            catch (bQ bq)
            {
                throw bq;
            }
            return bq;
        }
label1:
        {
            try
            {
                if (bq.e(2))
                {
                    break label1;
                }
                bq = new al(bq);
            }
            // Misplaced declaration of an exception variable
            catch (bQ bq)
            {
                throw bq;
            }
            return bq;
        }
        switch (k.a(bq, 1, 4))
        {
        default:
            switch (k.a(bq, 1, 5))
            {
            default:
                switch (k.a(bq, 1, 7))
                {
                default:
                    throw new IllegalStateException((new StringBuilder()).append(z[10]).append(bq).toString());

                case 56: // '8'
                    try
                    {
                        bq = new aY(bq, z[8], z[11]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (bQ bq)
                    {
                        throw bq;
                    }
                    return bq;

                case 57: // '9'
                    return new aY(bq, z[0], z[3]);

                case 58: // ':'
                    return new aY(bq, z[6], z[13]);

                case 59: // ';'
                    return new aY(bq, z[14], z[1]);

                case 60: // '<'
                    return new aY(bq, z[7], z[4]);

                case 61: // '='
                    return new aY(bq, z[9], z[5]);

                case 62: // '>'
                    return new aY(bq, z[15], z[2]);

                case 63: // '?'
                    return new aY(bq, z[16], z[12]);
                }

            case 12: // '\f'
                try
                {
                    bq = new ax(bq);
                }
                // Misplaced declaration of an exception variable
                catch (bQ bq)
                {
                    throw bq;
                }
                return bq;

            case 13: // '\r'
                return new aX(bq);
            }

        case 4: // '\004'
            try
            {
                bq = new aL(bq);
            }
            // Misplaced declaration of an exception variable
            catch (bQ bq)
            {
                throw bq;
            }
            return bq;

        case 5: // '\005'
            return new aV(bq);
        }
    }

    protected final k a()
    {
        return a;
    }

    protected final bQ b()
    {
        return c;
    }

    public abstract String c();

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[17];
        obj = "t\000;";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "v\001";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "v\005";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "v\003";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "v\007";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "v\007";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "t\003;";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "t\003;";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "t\003;";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "t\000;";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "2\\`YT0\\+S^$]oRI}\022";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                obj = "v\003";
                byte0 = 10;
                i = 11;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "v\005";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "v\001";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "t\000;";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "t\003;";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "t\000;";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_500;
_L3:
        byte byte1 = 59;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 71;
          goto _L9
_L5:
        byte1 = 50;
          goto _L9
_L6:
        byte1 = 11;
          goto _L9
        byte1 = 55;
          goto _L9
    }
}
