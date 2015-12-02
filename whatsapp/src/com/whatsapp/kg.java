// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.List;

// Referenced classes of package com.whatsapp:
//            k6, App

public class kg extends k6
{

    private static final String z[];
    int b;
    List c;
    boolean d;
    String e;

    public kg(String s, List list, int i, boolean flag)
    {
        e = s;
        c = list;
        b = i;
        d = flag;
    }

    public String a()
    {
        String s;
        if (e == null)
        {
            s = z[3];
        } else
        {
            s = (new StringBuilder()).append(z[4]).append(e).toString();
        }
        return (new StringBuilder()).append(z[2]).append(s).append(z[0]).append(b).append(z[1]).append(c.size()).toString();
    }

    public void c()
    {
        App.a(e, c, b, false, d, null, null);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = ".[u2!4\017";
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
                obj = ".\fa1#}\025,";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\177]S/7i\\,";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "c@\1776d|Jo'*z\017a1#}";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "c\\kb5{J~;dgK6b";
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
        byte byte1 = 68;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 14;
          goto _L9
_L5:
        byte1 = 47;
          goto _L9
_L6:
        byte1 = 12;
          goto _L9
        byte1 = 66;
          goto _L9
    }
}
