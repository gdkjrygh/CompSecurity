// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com;

import com.whatsapp.DialogToastActivity;
import java.security.Provider;

// Referenced classes of package com:
//            a, b

final class c extends Provider
{

    private static final String z[];

    public c()
    {
        boolean flag = false;
        boolean flag1 = a.a;
        super(z[0], 1.0D, z[4]);
        put(z[3], com/b.getName());
        put(z[1], z[2]);
        if (DialogToastActivity.g != 0)
        {
            if (!flag1)
            {
                flag = true;
            }
            a.a = flag;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "z<Ca\016f\007cS";
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
                obj = "e0Na\004S\007Lz\022Y8\003G>wd}F8qudy\006Z0@q\030B0I]\030";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "e:K`\001W'H";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "e0Na\004S\007Lz\022Y8\003G>wd}F8q";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "wua}\030C-\000g\006S6Dr\037Uu_u\030R:@4\030C8Oq\004\026%_{\000_1HfVB=L`VC&HgV\0311HbYC'Lz\022Y8";
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
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 118;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 54;
          goto _L9
_L5:
        byte1 = 85;
          goto _L9
_L6:
        byte1 = 45;
          goto _L9
        byte1 = 20;
          goto _L9
    }
}
