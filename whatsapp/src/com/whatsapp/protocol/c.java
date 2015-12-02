// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            c4, c_

public abstract class c
{

    private static final String z[];

    public c()
    {
    }

    public void a(int i)
    {
    }

    public void a(int i, String s)
    {
        a(i);
    }

    public void a(c_ c_1)
    {
        int j = c4.F;
        c_1 = c_1.b(z[0]);
        int i = 0;
        do
        {
label0:
            {
                if (i < c_1.size())
                {
                    Object obj = (c_)c_1.elementAt(i);
                    if (obj != null)
                    {
                        String s = ((c_) (obj)).d(z[1]);
                        obj = ((c_) (obj)).d(z[2]);
                        if (s != null)
                        {
                            a(Integer.parseInt(s), ((String) (obj)));
                        }
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    public abstract void a(c_ c_1, String s);

    public void a(Exception exception)
    {
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "T\024?e\r";
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
                obj = "R\t)o";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "E\0035~";
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
        byte0 = 49;
          goto _L9
_L5:
        byte0 = 102;
          goto _L9
_L6:
        byte0 = 77;
          goto _L9
        byte0 = 10;
          goto _L9
    }
}
