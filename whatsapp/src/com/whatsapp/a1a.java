// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.ci;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, ChangeNumber, o4

final class a1a
    implements ci
{

    private static final String z[];

    a1a()
    {
    }

    public void a(int i)
    {
        int j;
        j = App.am;
        Log.e((new StringBuilder()).append(z[1]).append(i).toString());
        i;
        JVM INSTR lookupswitch 4: default 72
    //                   400: 95
    //                   401: 121
    //                   405: 140
    //                   409: 152;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (i < 500)
        {
            ChangeNumber.e().sendEmptyMessage(6);
            o4.O();
            App.at();
        }
_L6:
        return;
_L2:
        Log.w(z[0]);
        ChangeNumber.e().sendEmptyMessage(5);
        o4.O();
        App.at();
        if (j == 0) goto _L6; else goto _L3
_L3:
        ChangeNumber.e().sendEmptyMessage(6);
        o4.O();
        App.at();
        if (j == 0) goto _L6; else goto _L4
_L4:
        ChangeNumber.D.run();
        if (j == 0) goto _L6; else goto _L5
_L5:
        if (j == 0) goto _L6; else goto _L1
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ",\f\037fL*\n\013eI*\026QkC*\007\025%E:\t\034mY`\t\037|H'";
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
                obj = ",\f\037fL*\n\013eI*\026QnJ&\b^";
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
        byte byte0 = 43;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 79;
          goto _L9
_L5:
        byte0 = 100;
          goto _L9
_L6:
        byte0 = 126;
          goto _L9
        byte0 = 8;
          goto _L9
    }
}
