// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.ListView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.HashSet;

// Referenced classes of package com.whatsapp:
//            Conversation, ConversationRow, App

class sh
    implements Runnable
{

    private static final String z[];
    final c4 a;
    final Conversation b;

    sh(Conversation conversation, c4 c4_1)
    {
        b = conversation;
        a = c4_1;
        super();
    }

    public void run()
    {
label0:
        {
            android.view.View view = b.aK.findViewWithTag(a);
            if (view != null)
            {
                ((ConversationRow)view).l();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (!Conversation.G(b).contains(a))
            {
                Conversation.G(b).add(a);
                Log.w((new StringBuilder()).append(z[0]).append(a.y.c).append(" ").append(b.aK.getFirstVisiblePosition()).append("-").append(b.aK.getLastVisiblePosition()).append(z[1]).append(b.aK.getCount()).append(")").toString());
            }
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "@d\033\005BQx\024\007NLeZ\001BEy\020\000O\031+\033\034\007Ub\020\004\007Ed\007S";
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
                obj = "\003#";
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
        byte byte0 = 39;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 35;
          goto _L9
_L5:
        byte0 = 11;
          goto _L9
_L6:
        byte0 = 117;
          goto _L9
        byte0 = 115;
          goto _L9
    }
}
