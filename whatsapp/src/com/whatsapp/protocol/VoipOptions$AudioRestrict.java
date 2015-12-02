// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c_, VoipOptions

public final class rate
{

    private static final String z[];
    public final String encoding;
    public final Integer rate;

    public static rate fromProtocolTreeNode(c_ c_1)
    {
        if (c_1 == null)
        {
            return null;
        } else
        {
            return new <init>(c_1.d(z[4]), VoipOptions.access$000(c_1.d(z[3]), z[2]));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[0]).append(encoding).append('\'').append(z[1]).append(rate).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "BDoIcQTxT~jR\177[imRdDemV6\007";
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
                obj = "/\021yAxf\f";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "qP\177E";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "qP\177E";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "f_h";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 221
    //                   2 228
    //                   3 235;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_235;
_L3:
        byte byte1 = 12;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 3;
          goto _L9
_L5:
        byte1 = 49;
          goto _L9
_L6:
        byte1 = 11;
          goto _L9
        byte1 = 32;
          goto _L9
    }

    public (String s, Integer integer)
    {
        encoding = s;
        rate = integer;
    }
}
