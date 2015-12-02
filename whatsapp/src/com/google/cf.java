// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            cl, c1, c8, cs, 
//            ef, bi, af

public abstract class cf extends Enum
{

    public static final cf EXACT_GROUPING;
    public static final cf POSSIBLE;
    public static final cf STRICT_GROUPING;
    public static final cf VALID;
    private static final cf a[];
    private static final String z[];

    private cf(String s, int i)
    {
        super(s, i);
    }

    cf(String s, int i, ef ef)
    {
        this(s, i);
    }

    public static cf valueOf(String s)
    {
        return (cf)Enum.valueOf(com/google/cf, s);
    }

    public static cf[] values()
    {
        return (cf[])a.clone();
    }

    abstract boolean a(bi bi, String s, af af);

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "4Ww\016\016.Hd\002\017!Fx\n";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "!@e\036\0233Cs";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\"[d\004\031%Pq\037\025$_\177\003\035";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "'Nz\004\036";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                POSSIBLE = new cl(z[1], 0);
                VALID = new c1(z[3], 1);
                STRICT_GROUPING = new c8(z[2], 2);
                EXACT_GROUPING = new cs(z[0], 3);
                a = (new cf[] {
                    POSSIBLE, VALID, STRICT_GROUPING, EXACT_GROUPING
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 293
    //                   1 299
    //                   2 305
    //                   3 311;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_311;
_L3:
        byte byte0 = 90;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 113;
          goto _L9
_L5:
        byte0 = 15;
          goto _L9
_L6:
        byte0 = 54;
          goto _L9
        byte0 = 77;
          goto _L9
    }
}
