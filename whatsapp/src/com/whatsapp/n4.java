// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, MediaGallery, MediaData, ContactPicker, 
//            a9w

class n4
    implements com.actionbarsherlock.view.ActionMode.Callback
{

    private static final String z[];
    final MediaGallery a;

    n4(MediaGallery mediagallery)
    {
        a = mediagallery;
        super();
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        int i = App.am;
        menuitem.getItemId();
        JVM INSTR tableswitch 0 1: default 32
    //                   0 34
    //                   1 208;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        actionmode = null;
        iterator = MediaGallery.f(a).values().iterator();
_L10:
        c4 c4_1;
        menuitem = actionmode;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        c4_1 = (c4)iterator.next();
        arraylist.add(Uri.fromFile(((MediaData)c4_1.B).file));
        if (actionmode != null) goto _L5; else goto _L4
_L4:
        menuitem = App.c(c4_1.w);
        actionmode = menuitem;
        if (i == 0) goto _L7; else goto _L6
_L6:
        actionmode = menuitem;
        if (menuitem.equals(App.c(c4_1.w))) goto _L7; else goto _L8
_L8:
        menuitem = z[0];
_L11:
        actionmode = menuitem;
        if (i == 0) goto _L10; else goto _L9
_L9:
        actionmode = new Intent(a, com/whatsapp/ContactPicker);
        actionmode.setType(menuitem);
        actionmode.putParcelableArrayListExtra(z[1], arraylist);
        a.startActivity(actionmode);
        MediaGallery.c(a).finish();
        if (i == 0) goto _L1; else goto _L3
_L3:
        a.showDialog(1);
        return false;
_L7:
        menuitem = actionmode;
          goto _L11
_L5:
        menuitem = actionmode;
          goto _L6
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        MediaGallery.a(a, new TextView(a.getSupportActionBar().getThemedContext(), null, 0x7f0f0054));
        actionmode.setCustomView(MediaGallery.k(a));
        menu.add(0, 1, 0, 0x7f0e010e).setIcon(0x7f020508).setShowAsAction(2);
        MediaGallery.a(a, menu.add(0, 0, 0, 0x7f0e00f4).setIcon(0x7f02050b));
        MediaGallery.b(a).setShowAsAction(2);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        MediaGallery.f(a).clear();
        MediaGallery.a(a, null);
        MediaGallery.d(a).notifyDataSetChanged();
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "Gp,";
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
                obj = "\f1b*i\004;(1h\031:h,(\b'r*gC\fR\nC,\022";
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
        byte byte0 = 6;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 109;
          goto _L9
_L5:
        byte0 = 95;
          goto _L9
_L6:
        byte0 = 6;
          goto _L9
        byte0 = 88;
          goto _L9
    }
}
