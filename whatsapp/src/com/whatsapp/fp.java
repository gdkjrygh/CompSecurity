// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.ListView;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, ConversationsFragment

class fp
    implements Runnable
{

    private static final String z[];
    final String a;
    final ConversationsFragment b;
    final boolean c;

    fp(ConversationsFragment conversationsfragment, String s, boolean flag)
    {
        b = conversationsfragment;
        a = s;
        c = flag;
        super();
    }

    public void run()
    {
label0:
        {
            int i = App.am;
            Log.i((new StringBuilder()).append(z[2]).append(a).toString());
            View view = ConversationsFragment.b(b, a);
            if (view != null)
            {
                if (c)
                {
                    view.findViewById(0x7f0b019c).setVisibility(0);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                view.findViewById(0x7f0b019c).setVisibility(8);
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.w((new StringBuilder()).append(z[0]).append(a).append(" ").append(ConversationsFragment.h(b).getFirstVisiblePosition()).append("-").append(ConversationsFragment.h(b).getLastVisiblePosition()).append(z[1]).append(ConversationsFragment.h(b).getCount()).append(")").toString());
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\002)\003(4\0235\f*8\016(\036q#\004 \037;\"\t|M0>A0\004;&A \002,q";
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
                obj = "An";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\002)\003(4\0235\f*8\016(\036q6\023)\030.~\025)\n9=\004\001\0371$\021\026\03716\023#\036-3\0004Bd";
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
        char c1 = obj[j];
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
        byte byte0 = 81;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 97;
          goto _L9
_L5:
        byte0 = 70;
          goto _L9
_L6:
        byte0 = 109;
          goto _L9
        byte0 = 94;
          goto _L9
    }
}
