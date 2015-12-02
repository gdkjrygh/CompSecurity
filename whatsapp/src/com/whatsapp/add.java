// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.Cursor;
import android.view.View;
import android.widget.ListView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            adk, Conversation, s, App, 
//            aoz

class add extends adk
{

    private static final String z[];
    final Conversation a;

    add(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void a(c4 c4_1, int i)
    {
        if (c4_1 != null && c4_1.y.a.equals(a.A) && c4_1.w != 8)
        {
            Conversation.e(a, c4_1);
            if (i == 3 && c4_1.w == 1 && a.aK.getLastVisiblePosition() >= a.aK.getCount() - 2 && a.aK.getChildCount() > 0 && c4_1.equals(a.aK.getChildAt(a.aK.getChildCount() - 1).getTag()))
            {
                Conversation.ag(a);
            }
        }
    }

    public void a(String s1)
    {
        if (s1 != null && s1.equals(a.A))
        {
            a.U.getCursor().requery();
            if (!App.ah.h(a.A) && Conversation.E(a) != null)
            {
                Conversation.E(a).setVisibility(8);
                a.aK.removeHeaderView(Conversation.E(a));
                Log.i((new StringBuilder()).append(z[1]).append(a.aK.getHeaderViewsCount()).toString());
                com.whatsapp.Conversation.a(a, null);
                Log.i(z[0]);
                a.U.notifyDataSetChanged();
            }
        }
    }

    public void b(c4 c4_1)
    {
        if (c4_1 != null && c4_1.y.a.equals(a.A) && c4_1.y.b && c4_1.w != 8)
        {
            if (a.U.getCursor() != null)
            {
                Conversation.l(a).add(c4_1);
            }
            if (Conversation.aj(a) && c4_1.M == 6 && (c4_1.t == 1L || c4_1.t == 4L || c4_1.t == 5L || c4_1.t == 7L || c4_1.t == 12L || c4_1.t == 13L || c4_1.t == 14L || c4_1.t == 17L))
            {
                com.whatsapp.Conversation.a(a);
            }
            if (Conversation.aj(a) && Conversation.ad(a) != 0)
            {
                com.whatsapp.s.a(a.U, com.whatsapp.s.a(a.U));
                com.whatsapp.Conversation.a(a, 0);
            }
            a.U.notifyDataSetChanged();
            Conversation.ag(a);
        }
    }

    public void b(c4 c4_1, int i)
    {
label0:
        {
label1:
            {
                i = App.am;
                if (c4_1 == null || !c4_1.y.a.equals(a.A) || c4_1.w == 8)
                {
                    break label0;
                }
                if (Conversation.X(a) != 0)
                {
                    Conversation.ab(a).add(c4_1);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                if (Conversation.n(a))
                {
                    a.U.getCursor().requery();
                    Conversation.b(a, false);
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                if (!c4_1.y.b)
                {
                    Conversation.c(a, c4_1);
                }
            }
            a.U.notifyDataSetChanged();
            Conversation.M(a);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "tuRj[ei]hWxt\023pWdn_t_y}Yx\021{u]x[vhPu[e5RsJasOu\\{\177\023n[zuJy\\bnHsP";
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
                obj = "tuRj[ei]hWxt\023pWdn_t_y}Yx\021{u]x[vhPu[e5Ty_s\177N\177Pc:";
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
        byte byte0 = 62;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 23;
          goto _L9
_L5:
        byte0 = 26;
          goto _L9
_L6:
        byte0 = 60;
          goto _L9
        byte0 = 28;
          goto _L9
    }
}
