// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            RegisterName

class ww
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final RegisterName a;

    ww(RegisterName registername)
    {
        a = registername;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Log.i(z[2]);
        a.removeDialog(109);
        dialoginterface = new Intent(z[0], Uri.parse(z[1]));
        a.startActivity(dialoginterface);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\025>-.?\0354g5>\0005'(~\0253=5?\032~\037\025\025#";
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
                obj = "\034$=,#N\177f1?\0269%9~\000' ($\021\"g??\031\177>=\017\007$((%\007";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\0065.5#\0005;21\0315f89\025<&;\177\0271'(}\027?'25\027$f>%\000$&2\177\0278,?;\007$((%\007";
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
        byte byte0 = 80;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 116;
          goto _L9
_L5:
        byte0 = 80;
          goto _L9
_L6:
        byte0 = 73;
          goto _L9
        byte0 = 92;
          goto _L9
    }
}
