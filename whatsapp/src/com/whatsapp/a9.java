// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            App, ContactPicker, ListMembersSelector

class a9
    implements com.actionbarsherlock.view.ActionMode.Callback
{

    private static final String z;
    final ContactPicker a;

    a9(ContactPicker contactpicker)
    {
        a = contactpicker;
        super();
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        int i = App.am;
        menuitem.getItemId();
        JVM INSTR tableswitch 0 0: default 28
    //                   0 30;
           goto _L1 _L2
_L1:
        return false;
_L2:
        actionmode = new StringBuilder();
        menuitem = ContactPicker.r(a).keySet().iterator();
        do
        {
            if (!menuitem.hasNext())
            {
                break;
            }
            String s = (String)menuitem.next();
            if (actionmode.length() != 0)
            {
                actionmode.append(",");
            }
            actionmode.append(s);
        } while (i == 0);
        menuitem = new Intent(a, com/whatsapp/ListMembersSelector);
        menuitem.putExtra(z, actionmode.toString());
        a.startActivity(menuitem);
        a.finish();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        actionmode = menu.add(0, 0, 0, 0x7f0e0061);
        actionmode.setIcon(0x7f020500);
        actionmode.setShowAsAction(2);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        ContactPicker.a(a, null);
        ContactPicker.b(a);
        ContactPicker.a(a, null);
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return false;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "]\017p\177".toCharArray();
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
        byte byte0 = 102;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 55;
          goto _L8
_L3:
        byte0 = 102;
          goto _L8
_L4:
        byte0 = 20;
          goto _L8
        byte0 = 12;
          goto _L8
    }
}
