// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import java.net.InetAddress;

final class a
{

    private static final String z[];
    final InetAddress a;
    final long b;

    a(InetAddress inetaddress, long l)
    {
        a = inetaddress;
        b = l;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[1]).append(a).append(z[0]).append(b).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "B\020\034r\035\007B\034^\004\003U4c\001\002Y\n7";
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
                i = 1;
                obj = "'^\034~,\nT\013o\036\035g\020~\005+H\tc\037\027K\030n\t\034U\nyP";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 109;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 110;
          goto _L9
_L5:
        byte0 = 48;
          goto _L9
_L6:
        byte0 = 121;
          goto _L9
        byte0 = 10;
          goto _L9
    }
}
