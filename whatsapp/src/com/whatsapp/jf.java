// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Environment;

// Referenced classes of package com.whatsapp:
//            vj, App

class jf
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final vj a;

    jf(vj vj1)
    {
        a = vj1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            vj.a(a).removeDialog(102);
            dialoginterface = Environment.getExternalStorageState();
            if (!dialoginterface.equals(z[1]) && !dialoginterface.equals(z[0]))
            {
                vj.a(a).showDialog(102);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.b();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "~MZ7\026vFp+\r";
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
                obj = "~MZ7\026vF";
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
        byte byte0 = 98;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 19;
          goto _L9
_L5:
        byte0 = 34;
          goto _L9
_L6:
        byte0 = 47;
          goto _L9
        byte0 = 89;
          goto _L9
    }
}
