// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, GroupChatRecentLocationsActivity, GroupChatInfo

class fu
    implements android.view.View.OnClickListener
{

    private static final String z;
    final GroupChatInfo a;

    fu(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (App.ar())
            {
                view = new Intent(a, com/whatsapp/GroupChatRecentLocationsActivity);
                view.putExtra(z, GroupChatInfo.g(a));
                a.startActivity(view);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.b(a, 0x7f0e01a4, 0);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "e\032L".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 10;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 15;
          goto _L8
_L3:
        byte0 = 115;
          goto _L8
_L4:
        byte0 = 40;
          goto _L8
        byte0 = 70;
          goto _L8
    }
}
