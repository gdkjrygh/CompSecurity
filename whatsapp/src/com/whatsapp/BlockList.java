// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.util.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, wd, ao9, g8, 
//            App, k, og, tr, 
//            tv, n6, n_, ContactPicker

public class BlockList extends DialogToastListActivity
    implements wd
{

    private static final String z[];
    g8 i;
    private ao9 j;
    public boolean k;
    ArrayList l;

    public BlockList()
    {
        l = new ArrayList();
        k = false;
        j = new ao9();
    }

    static ao9 a(BlockList blocklist)
    {
        return blocklist.j;
    }

    private void b()
    {
        d();
        i.notifyDataSetChanged();
    }

    private void d()
    {
        Enumeration enumeration;
        int i1;
        i1 = App.am;
        l.clear();
        enumeration = App.L.keys();
_L3:
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        String s;
        og og1;
        s = (String)enumeration.nextElement();
        og1 = App.az.e(s);
        if (og1 == null) goto _L2; else goto _L1
_L1:
        l.add(og1);
        if (i1 == 0) goto _L3; else goto _L2
_L2:
        l.add(new og(s));
          goto _L3
        NoSuchElementException nosuchelementexception;
        nosuchelementexception;
        try
        {
            throw nosuchelementexception;
        }
        // Misplaced declaration of an exception variable
        catch (NoSuchElementException nosuchelementexception) { }
        if (i1 == 0) goto _L3; else goto _L4
_L4:
        Collections.sort(l, new tr(getApplicationContext()));
        return;
        nosuchelementexception;
        throw nosuchelementexception;
    }

    public void a()
    {
        b();
    }

    public void a(String s)
    {
    }

    public void a(Collection collection)
    {
        b();
    }

    public void b(String s)
    {
    }

    public void c(String s)
    {
        b();
    }

    public void d(String s)
    {
        b();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        if (j1 != -1 || i1 != 3)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        boolean flag;
        try
        {
            flag = App.i();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        App.b(getBaseContext(), 0x7f0e02ad, 0);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        showDialog(107);
        k = true;
        x.a(new tv(this, intent));
        return;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        obj = (og)getListView().getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        int i1;
        boolean flag;
        try
        {
            i1 = menuitem.getItemId();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            try
            {
                throw menuitem;
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem) { }
            try
            {
                throw menuitem;
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
        }
        switch (i1)
        {
        default:
            return super.onContextItemSelected(menuitem);

        case 0: // '\0'
            break;
        }
        flag = App.i();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        App.b(getBaseContext(), 0x7f0e02ad, 0);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        showDialog(107);
        k = false;
        x.a(new n6(this, ((og) (obj))));
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f030023);
        d();
        i = new g8(this, this, 0x7f030039, l);
        setListAdapter(i);
        getListView().setEmptyView(findViewById(0x7f0b00ca));
        registerForContextMenu(getListView());
        getListView().setOnItemClickListener(new n_(this));
        App.b(this);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        obj = (og)getListView().getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        contextmenu.add(0, 0, 0, String.format(getString(0x7f0e005f), new Object[] {
            ((og) (obj)).a(this)
        }));
    }

    public Dialog onCreateDialog(int i1)
    {
        ProgressDialog progressdialog;
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 107: // 'k'
            progressdialog = new ProgressDialog(this);
            break;
        }
        progressdialog.setMessage(getString(0x7f0e0353));
        progressdialog.setIndeterminate(true);
        progressdialog.setCancelable(false);
        return progressdialog;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, 0x7f0e023d).setIcon(0x7f0204fd).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        super.onDestroy();
        j.a();
        App.a(this);
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        int i1 = App.am;
        switch (menuitem.getItemId())
        {
        default:
            return true;

        case 0: // '\0'
            menuitem = new Intent(this, com/whatsapp/ContactPicker);
            StringBuilder stringbuilder = new StringBuilder();
            Iterator iterator = l.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                stringbuilder.append(((og)iterator.next()).a).append(",");
            } while (i1 == 0);
            menuitem.putExtra(z[1], true);
            menuitem.putExtra(z[0], stringbuilder.toString());
            startActivityForResult(menuitem, 3);
            return true;

        case 16908332: 
            finish();
            return true;
        }
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[2];
        obj = ".p7ND)x\007AF?h";
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
                i1 = 1;
                obj = ".p7ND\023\1777C[-\177,";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 47;
_L9:
        obj[j1] = (char)(byte0 ^ c1);
        j1++;
          goto _L8
_L4:
        byte0 = 76;
          goto _L9
_L5:
        byte0 = 28;
          goto _L9
_L6:
        byte0 = 88;
          goto _L9
        byte0 = 45;
          goto _L9
    }
}
