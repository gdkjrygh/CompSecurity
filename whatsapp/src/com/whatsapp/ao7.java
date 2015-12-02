// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.m;

// Referenced classes of package com.whatsapp:
//            Conversation, iz, af_, ju, 
//            qj, as3, og, mk, 
//            s, ConversationTextEntry

class ao7
    implements com.actionbarsherlock.view.ActionMode.Callback
{

    private static final String z;
    final Conversation a;

    ao7(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        menu = (ViewGroup)iz.a((LayoutInflater)a.getSupportActionBar().getThemedContext().getSystemService(z), 0x7f03004e, null, false);
        menu.findViewById(0x7f0b005a).setBackgroundDrawable(new m(a.getResources().getDrawable(0x7f02006a)));
        actionmode.setCustomView(menu);
        actionmode = (EditText)menu.findViewById(0x7f0b0058);
        actionmode.addTextChangedListener(new af_(this, actionmode));
        actionmode.setOnEditorActionListener(new ju(this));
        menu.findViewById(0x7f0b0187).setOnClickListener(new qj(this));
        a.findViewById(0x7f0b0188).setOnClickListener(new as3(this));
        actionmode.setText(Conversation.ai(a));
        actionmode.selectAll();
        actionmode.requestFocus();
        actionmode.setSelected(true);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        Conversation.b(a, null);
        Conversation.o = null;
        if (!Conversation.aj(a) || mk.c(a.aD.a))
        {
            Conversation.i(a).setVisibility(0);
        }
        Conversation.h(a).setVisibility(0);
        Conversation.g(a);
        a.U.notifyDataSetChanged();
        Conversation.w(a).requestFocus();
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
        ac = "\027l\0372c\017R\0173p\027l\0228d".toCharArray();
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
        byte byte0 = 22;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 123;
          goto _L8
_L3:
        byte0 = 13;
          goto _L8
_L4:
        byte0 = 102;
          goto _L8
        byte0 = 93;
          goto _L8
    }
}
