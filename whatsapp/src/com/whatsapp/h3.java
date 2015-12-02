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
//            App, ContactsFragment, ListMembersSelector, NewGroup, 
//            a19

class h3
    implements com.actionbarsherlock.view.ActionMode.Callback
{

    private static final String z[];
    final ContactsFragment a;

    h3(ContactsFragment contactsfragment)
    {
        a = contactsfragment;
        super();
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        int i = App.am;
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 36
    //                   2131427346: 38
    //                   2131427350: 150;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        actionmode = new StringBuilder();
        menuitem = ContactsFragment.c(a).keySet().iterator();
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
        menuitem = new Intent(a.getActivity(), com/whatsapp/ListMembersSelector);
        menuitem.putExtra(z[1], actionmode.toString());
        a.startActivity(menuitem);
        if (i == 0) goto _L1; else goto _L3
_L3:
        actionmode = new StringBuilder();
        menuitem = ContactsFragment.c(a).keySet().iterator();
        do
        {
            if (!menuitem.hasNext())
            {
                break;
            }
            String s1 = (String)menuitem.next();
            if (actionmode.length() != 0)
            {
                actionmode.append(",");
            }
            actionmode.append(s1);
        } while (i == 0);
        menuitem = new Intent(a.getActivity(), com/whatsapp/NewGroup);
        menuitem.putExtra(z[0], actionmode.toString());
        a.startActivity(menuitem);
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        menu.add(0, 0x7f0b0012, 0, 0x7f0e029d).setShowAsAction(6);
        menu.add(0, 0x7f0b0016, 0, 0x7f0e0240).setShowAsAction(6);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        ContactsFragment.a(a, null);
        ContactsFragment.j(a).notifyDataSetChanged();
        ContactsFragment.a(a, null);
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return false;
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "S\0216^".toCharArray();
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
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 49;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 57;
          goto _L9
_L5:
        byte0 = 120;
          goto _L9
_L6:
        byte0 = 82;
          goto _L9
        byte0 = 45;
          goto _L9
    }
}
