// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, ao9, ad_, sw, 
//            App, aoz, Main, h, 
//            y7, wd, adk

public class Broadcasts extends DialogToastListActivity
{

    private static final String z[];
    private final wd i = new sw(this);
    private h j;
    private final adk k = new ad_(this);
    private final ao9 l = new ao9();

    public Broadcasts()
    {
    }

    static h a(Broadcasts broadcasts)
    {
        return broadcasts.j;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onContextItemSelected(menuitem);

        case 1: // '\001'
            App.a((c4)((android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo()).targetView.getTag(), false);
            break;
        }
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        Log.i(z[0]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        App.ah.a(k);
        App.b(i);
        if (App.Z == null || !App.ah.y() || App.f(this) != 3)
        {
            Log.i(z[1]);
            App.q(z[2]);
            startActivity(new Intent(this, com/whatsapp/Main));
            finish();
            return;
        }
        setContentView(0x7f030026);
        j = new h(this);
        bundle = getListView();
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            flag = true;
        }
        bundle.setFastScrollEnabled(flag);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            bundle.setSelector(0x7f02063d);
        }
        bundle.setScrollbarFadingEnabled(true);
        bundle.setAdapter(j);
        bundle.setOnItemClickListener(new y7(this));
        registerForContextMenu(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        contextmenu.add(0, 1, 0, getString(0x7f0e010e));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        Log.i(z[3]);
        super.onDestroy();
        l.a();
        App.ah.b(k);
        App.a(i);
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[4];
        obj = "gx5U\027fk)@\000*i(Q\022qo";
        byte1 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "gx5U\027fk)@\000*i(Q\022qouZ\034(g?\031\034w'7G\024v~5F\026(n8";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "gx5U\027fk)@\000%h5A\035foz@\034%g;]\035";
                i1 = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "gx5U\027fk)@\000*n?G\007we#";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 202
    //                   2 208
    //                   3 214;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_214;
_L3:
        byte byte0 = 115;
_L9:
        obj[j1] = (char)(byte0 ^ c);
        j1++;
          goto _L8
_L4:
        byte0 = 5;
          goto _L9
_L5:
        byte0 = 10;
          goto _L9
_L6:
        byte0 = 90;
          goto _L9
        byte0 = 52;
          goto _L9
    }
}
