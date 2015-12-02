// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            Conversation, ali, App

class x4
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final Conversation a;

    x4(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
        Conversation.ae(a).dismiss();
        view = new Intent(z[0]);
        view.setType(z[1]);
        try
        {
            a.startActivityForResult(view, 7);
            Conversation.a0 = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            App.b(a, 0x7f0e0022, 0);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "[de\020^Sn/\013_Noo\026\037[iu\013^T$Q+rq";
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
                obj = "LdeLPTns\rX^$b\027CIesLUSx.\001^T~`\001E";
                i = 1;
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
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 49;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 58;
          goto _L9
_L5:
        byte0 = 10;
          goto _L9
_L6:
        byte0 = 1;
          goto _L9
        byte0 = 98;
          goto _L9
    }
}
