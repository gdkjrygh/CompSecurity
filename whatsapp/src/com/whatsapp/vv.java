// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo

class vv
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z;
    final GroupChatInfo a;

    vv(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Log.i(z);
        GroupChatInfo.p(a);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\b\022:ws0\t;dl@\017;ao\006\003>]o\n\001#gD\035\017 r".toCharArray();
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
    //                   0 85
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 3;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 111;
          goto _L8
_L3:
        byte0 = 96;
          goto _L8
_L4:
        byte0 = 85;
          goto _L8
        byte0 = 2;
          goto _L8
    }
}
