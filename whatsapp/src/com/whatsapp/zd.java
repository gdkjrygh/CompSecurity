// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.whatsapp:
//            VoipActivity, Conversation

class zd
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final String a[];
    final VoipActivity.ReplyWithMessageDialogFragment b;

    zd(VoipActivity.ReplyWithMessageDialogFragment replywithmessagedialogfragment, String as[])
    {
        b = replywithmessagedialogfragment;
        a = as;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (VoipActivity)b.getActivity();
        Intent intent = new Intent(b.getActivity(), com/whatsapp/Conversation);
        intent.putExtra(z[0], VoipActivity.g(dialoginterface));
        intent.addFlags(0x14000000);
        if (i != a.length - 1)
        {
            intent.putExtra(z[1], (byte)0);
            intent.putExtra(z[2], a[i]);
            intent.putExtra(z[3], true);
            Conversation.ae = true;
        }
        b.getActivity().startActivity(intent);
        VoipActivity.f(dialoginterface);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "*.\007";
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
                obj = "7&<(90\"";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "3/\002.%\037*\020;";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "(&\020\0033(&\0219";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 64;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 64;
          goto _L9
_L5:
        byte0 = 71;
          goto _L9
_L6:
        byte0 = 99;
          goto _L9
        byte0 = 92;
          goto _L9
    }
}
