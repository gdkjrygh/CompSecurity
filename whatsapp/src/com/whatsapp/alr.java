// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, ck, aoz

final class alr
    implements Runnable
{

    private static final String z[];
    private final boolean a;
    final ck b;

    alr(ck ck1, boolean flag)
    {
        b = ck1;
        super();
        a = flag;
    }

    public void run()
    {
label0:
        {
            int i = App.am;
            com.whatsapp.App.a(b.e);
            c4 c4_1 = App.ah.a(b.d);
            if (c4_1 != null)
            {
                Log.i((new StringBuilder()).append(z[3]).append(b.d).toString());
                c4_1.D = b.b;
                if (a)
                {
                    Log.i((new StringBuilder()).append(z[0]).append(b.d).append(z[4]).toString());
                    App.ah.b(b.d);
                    App.b(new String[] {
                        b.d.a
                    });
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                Log.i((new StringBuilder()).append(z[5]).append(b.d).append(z[6]).toString());
                App.p(c4_1);
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[2]).append(b.d).append(z[1]).toString());
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "y_V><lK\031?2jLP<48";
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
                obj = "#\007T7 kF^7s\177HW7";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "y_V><lK\031'=yEU7slH\031 6kBW6s";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "y_V><lK\031 6kBW6:v@\031";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "8FJr#}I];=\177\007J7 kNV<skSX&6";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "y_V><lK\031 6kBW6:v@\031";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "8NT?6|NX&6t^";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 83;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 24;
          goto _L9
_L5:
        byte1 = 39;
          goto _L9
_L6:
        byte1 = 57;
          goto _L9
        byte1 = 82;
          goto _L9
    }
}
