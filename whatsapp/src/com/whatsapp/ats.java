// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            ConversationRowLocation, App

class ats extends bv
{

    private static final String z[];
    final String b;
    final ConversationRowLocation c;

    ats(ConversationRowLocation conversationrowlocation, String s)
    {
        c = conversationrowlocation;
        b = s;
        super();
    }

    public void a(View view)
    {
        Uri uri = Uri.parse(b);
        view = uri;
        if (uri.getScheme() == null)
        {
            view = Uri.parse((new StringBuilder()).append(z[0]).append(b).toString());
        }
        view = new Intent(z[1], view);
        try
        {
            c.getContext().startActivity(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            App.b(App.au.getApplicationContext(), 0x7f0e0022, 0);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\017\037hN+HD";
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
                obj = "\006\005xL~\016\0172W\177\023\016rJ?\006\bhW~\tEJwT0";
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
        char c1 = obj[j];
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
        byte byte0 = 17;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 103;
          goto _L9
_L5:
        byte0 = 107;
          goto _L9
_L6:
        byte0 = 28;
          goto _L9
        byte0 = 62;
          goto _L9
    }
}
