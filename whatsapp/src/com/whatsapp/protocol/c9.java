// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


public class c9 extends RuntimeException
{

    private static final long serialVersionUID = 1L;
    private static final String z[];
    String a;
    Throwable b;

    public c9(Throwable throwable, String s)
    {
        a = s;
        b = throwable;
    }

    public Throwable a()
    {
        return b;
    }

    public String getMessage()
    {
        return (new StringBuilder()).append(z[1]).append(b).append(z[0]).append(a).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "rb\035zE\rJ\034}z\035a\020wr\bP\001{yXH\tgcXW\034uy\002ER4";
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
                obj = "/V\tdg\021J\017.7";
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
        byte byte0 = 23;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 120;
          goto _L9
_L5:
        byte0 = 36;
          goto _L9
_L6:
        byte0 = 104;
          goto _L9
        byte0 = 20;
          goto _L9
    }
}
