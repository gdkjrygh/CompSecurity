// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c_, VoipOptions

public final class mode
{

    private static final String z[];
    public final Short mode;

    public static mode fromProtocolTreeNode(c_ c_1)
    {
        if (c_1 == null)
        {
            return null;
        } else
        {
            return new <init>(VoipOptions.access$100(c_1.d(z[0]), z[1], 0, 3));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[2]).append(mode).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "dx5-";
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
                obj = "dx5-";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "Gx8;+Zb!8<ld\"!!gl<'*l*";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 78;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 9;
          goto _L9
_L5:
        byte0 = 23;
          goto _L9
_L6:
        byte0 = 81;
          goto _L9
        byte0 = 72;
          goto _L9
    }

    public (Short short1)
    {
        mode = short1;
    }
}
