// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c_, VoipOptions

public final class enableHighPassFiltering
{

    private static final String z[];
    public final Boolean enableComfortNoiseGeneration;
    public final Boolean enableHighPassFiltering;

    public static enableHighPassFiltering fromProtocolTreeNode(c_ c_1)
    {
        if (c_1 == null)
        {
            return null;
        } else
        {
            return new <init>(VoipOptions.access$200(c_1.d(z[3])), VoipOptions.access$200(c_1.d(z[2])));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[1]).append(enableComfortNoiseGeneration).append(z[0]).append(enableHighPassFiltering).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\033[\027xCU\027\027^KP\023\"wQD=\033zVR\t\033xE\n";
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
                obj = "z\022\001uG[\027\023xGX\016\001mGY\032\020zGt\024\037pME\017<yKD\0365sLR\t\023bKX\025O";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "_\013\024";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "T\025\025";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 34;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 55;
          goto _L9
_L5:
        byte0 = 123;
          goto _L9
_L6:
        byte0 = 114;
          goto _L9
        byte0 = 22;
          goto _L9
    }

    public (Boolean boolean1, Boolean boolean2)
    {
        enableComfortNoiseGeneration = boolean1;
        enableHighPassFiltering = boolean2;
    }
}
