// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Environment;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            vj, App

class su
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final vj a;

    su(vj vj1)
    {
        a = vj1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            vj.a(a).removeDialog(107);
            dialoginterface = Environment.getExternalStorageState();
            if (!dialoginterface.equals(z[0]) && !dialoginterface.equals(z[2]))
            {
                Log.v((new StringBuilder()).append(z[1]).append(Environment.getExternalStorageState()).toString());
                vj.a(a).showDialog(107);
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
        as = new String[3];
        obj = "F)T\017WN\"";
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
                obj = "]#S\bER+R\006P_)S\004\fO/@\rLLiS\004P_)S\004EY)L\003BH-T\021G^#U\016FY4N\023@J4E\017L_ N\024MO'R\nQN2S\030\fX2@\025F\026";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "F)T\017WN\"~\023L";
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
        char c = obj[j];
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
        byte byte0 = 35;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 43;
          goto _L9
_L5:
        byte0 = 70;
          goto _L9
_L6:
        byte0 = 33;
          goto _L9
        byte0 = 97;
          goto _L9
    }
}
