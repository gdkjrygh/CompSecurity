// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c_, VoipOptions

public final class mode
{

    private static final String z[];
    public final Short compressionGain;
    public final Boolean enableLimiter;
    public final Short mode;
    public final Short targetLevel;

    public static mode fromProtocolTreeNode(c_ c_1)
    {
        if (c_1 == null)
        {
            return null;
        } else
        {
            String s = c_1.d(z[3]);
            String s1 = c_1.d(z[1]);
            String s2 = c_1.d(z[4]);
            c_1 = c_1.d(z[5]);
            return new <init>(VoipOptions.access$100(s, z[6], 0, 31), VoipOptions.access$100(s1, z[2], 0, 90), VoipOptions.access$200(s2), VoipOptions.access$100(c_1, z[0], 0, 2));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[7]).append(targetLevel).append(z[10]).append(compressionGain).append(z[8]).append(enableLimiter).append(z[9]).append(mode).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "<0yi";
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
                obj = "20p|\0244,ne\t?8|e\b";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "20p|\0244,ne\t?\177zm\017?";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "%>ok\003%3xz\003=";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "=6pe\0224-xb\00733x";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "<0yi";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "%>ok\003%\177qi\02043";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\0208~w\0220-zi\022\035:ki\nl";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "}\177xb\00733x@\017<6ii\024l";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "}\177pc\0024b";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "}\177~c\013!-x\177\02580sK\00781 ";
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
    //                   3 368;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_368;
_L3:
        byte byte1 = 102;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 81;
          goto _L9
_L5:
        byte1 = 95;
          goto _L9
_L6:
        byte1 = 29;
          goto _L9
        byte1 = 12;
          goto _L9
    }

    public (Short short1, Short short2, Boolean boolean1, Short short3)
    {
        targetLevel = short1;
        compressionGain = short2;
        enableLimiter = boolean1;
        mode = short3;
    }
}
