// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            Conversation, s, App, au2, 
//            MediaData

class at6
    implements com.actionbarsherlock.view.ActionMode.Callback
{

    private static final String z;
    private MenuItem a;
    private MenuItem b;
    private MenuItem c;
    private MenuItem d;
    private MenuItem e;
    private MenuItem f;
    private MenuItem g;
    final Conversation h;

    at6(Conversation conversation)
    {
        h = conversation;
        super();
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        case 3: // '\003'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        default:
            return false;

        case 1: // '\001'
            Conversation.j(h);
            return true;

        case 0: // '\0'
            Conversation.T(h);
            return true;

        case 2: // '\002'
            Conversation.C(h);
            Conversation.F(h);
            return true;

        case 6: // '\006'
            actionmode = (c4)((java.util.Map.Entry)h.Z.entrySet().iterator().next()).getValue();
            com.whatsapp.Conversation.a(h, actionmode);
            Conversation.F(h);
            return true;

        case 4: // '\004'
            actionmode = (c4)((java.util.Map.Entry)h.Z.entrySet().iterator().next()).getValue();
            Conversation.d(h, actionmode);
            Conversation.F(h);
            return true;

        case 5: // '\005'
            actionmode = (c4)((java.util.Map.Entry)h.Z.entrySet().iterator().next()).getValue();
            Conversation.f(h, actionmode);
            Conversation.F(h);
            return true;

        case 15: // '\017'
            actionmode = (c4)((java.util.Map.Entry)h.Z.entrySet().iterator().next()).getValue();
            break;
        }
        Conversation.b(h, actionmode);
        Conversation.F(h);
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        f = h.b(menu, 15, 0x7f0e0205, 0x7f02050d);
        a = h.b(menu, 0, 0x7f0e010e, 0x7f020508);
        g = h.b(menu, 2, 0x7f0e0102, 0x7f020506);
        c = h.b(menu, 6, 0x7f0e03d1, 0x7f020519);
        d = h.b(menu, 4, 0x7f0e007b, 0x7f020504);
        e = h.b(menu, 5, 0x7f0e007b, 0x7f020504);
        b = h.b(menu, 1, 0x7f0e00f4, 0x7f02050b);
        b.setShowAsAction(2);
        a.setShowAsAction(2);
        g.setShowAsAction(2);
        c.setShowAsAction(2);
        d.setShowAsAction(2);
        e.setShowAsAction(2);
        f.setShowAsAction(2);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        Log.i(z);
        h.Z = null;
        h.U.notifyDataSetChanged();
        com.whatsapp.Conversation.a(h, null);
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        int i;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i = App.am;
        a.setVisible(true);
        b.setVisible(true);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        menu = h.Z.values().iterator();
        flag = true;
_L4:
        if (!menu.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (((c4)menu.next()).w == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        flag = false;
        if (i == 0) goto _L4; else goto _L3
_L3:
        g.setVisible(flag);
        if (h.Z.size() != 1) goto _L6; else goto _L5
_L5:
        menu = (c4)((java.util.Map.Entry)h.Z.entrySet().iterator().next()).getValue();
        ((c4) (menu)).w;
        JVM INSTR tableswitch 0 5: default 232
    //                   0 323
    //                   1 333
    //                   2 333
    //                   3 333
    //                   4 232
    //                   5 328;
           goto _L7 _L8 _L9 _L9 _L9 _L7 _L10
_L7:
        MenuItem menuitem = f;
        flag = flag1;
        if (((c4) (menu)).y.b)
        {
            flag = flag1;
            if (bg.a(((c4) (menu)).M, 4) >= 0)
            {
                flag = flag1;
                if (App.Y > au2.p)
                {
                    flag = flag1;
                    if (au2.p > 0L)
                    {
                        flag = true;
                    }
                }
            }
        }
        menuitem.setVisible(flag);
_L6:
        actionmode.setTitle(String.valueOf(h.Z.size()));
        return true;
_L8:
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L10:
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L9:
        MediaData mediadata = (MediaData)((c4) (menu)).B;
        if (((c4) (menu)).y.b || mediadata.transferred)
        {
            c.setVisible(true);
        }
        if (!mediadata.transferring)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((c4) (menu)).y.b)
        {
            d.setVisible(true);
            a.setVisible(false);
            b.setVisible(false);
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        e.setVisible(true);
        a.setVisible(false);
        b.setVisible(false);
        if (true) goto _L7; else goto _L2
_L2:
        flag = false;
        if (true) goto _L3; else goto _L11
_L11:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ".\016;\024\004?\0224\026\b\"\017z\021\004!\0046\026\b\"\0170\f\005(\005".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
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
        byte byte0 = 97;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 77;
          goto _L8
_L3:
        byte0 = 97;
          goto _L8
_L4:
        byte0 = 85;
          goto _L8
        byte0 = 98;
          goto _L8
    }
}
