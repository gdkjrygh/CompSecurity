// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c_, VoipOptions

public final class mode
{

    private static final String z[];
    public final String algorithm;
    public final Integer length;
    public final Short mode;
    public final Integer offset;

    public static mode fromProtocolTreeNode(c_ c_1)
    {
        if (c_1 == null)
        {
            return null;
        } else
        {
            String s = c_1.d(z[8]);
            String s1 = c_1.d(z[4]);
            String s2 = c_1.d(z[6]);
            c_1 = c_1.d(z[5]);
            return new <init>(s, VoipOptions.access$000(s1, z[7]), VoipOptions.access$000(s2, z[9]), VoipOptions.access$100(c_1, z[10], 0, 2));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[0]).append(algorithm).append('\'').append(z[1]).append(offset).append(z[3]).append(length).append(z[2]).append(mode).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "iX`\007+DZl\016#\\UnAm";
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
                obj = "\004\035l\032,[XwA";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\004\035n\023.M\0";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\004\035o\031$OIkA";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "G[e\017/\\";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "ERg\031";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "DXm\033>@";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "G[e\017/\\";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "IQd\0238AIk\021";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "DXm\033>@";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "ERg\031";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 347
    //                   1 354
    //                   2 361
    //                   3 367;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_367;
_L3:
        byte byte1 = 74;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 40;
          goto _L9
_L5:
        byte1 = 61;
          goto _L9
_L6:
        byte1 = 3;
          goto _L9
        byte1 = 124;
          goto _L9
    }

    public (String s, Integer integer, Integer integer1, Short short1)
    {
        algorithm = s;
        offset = integer;
        length = integer1;
        mode = short1;
    }
}
