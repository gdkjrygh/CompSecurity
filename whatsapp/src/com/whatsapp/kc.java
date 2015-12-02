// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.List;

// Referenced classes of package com.whatsapp:
//            k6, App

public class kc extends k6
{

    private static final String z[];
    String b;
    boolean c;
    int d;
    List e;

    public kc(String s, List list, int i, boolean flag)
    {
        b = s;
        e = list;
        d = i;
        c = flag;
    }

    public String a()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(z[0]).append(d).append(z[1]).append(b).append(z[2]);
        Object obj;
        if (e != null)
        {
            obj = Integer.valueOf(e.size());
        } else
        {
            obj = "-";
        }
        return stringbuilder.append(obj).toString();
    }

    public void c()
    {
        App.a(b, e, d, c);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\037\027>v\032\035\025\016j\f\013E\025}\017\013_A";
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
                obj = "N\f\005>_";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "NF\005a\013\017\f\rwEN";
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
        char c1 = obj[j];
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
        byte byte0 = 127;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 110;
          goto _L9
_L5:
        byte0 = 101;
          goto _L9
_L6:
        byte0 = 97;
          goto _L9
        byte0 = 4;
          goto _L9
    }
}
