// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.fieldstats.j;
import com.whatsapp.fieldstats.o;
import com.whatsapp.fieldstats.z;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, wd, qz, a_5, 
//            App, qy, yr, ae, 
//            afv, u1, ft, jj, 
//            a8i, a1g, a8y, d9, 
//            jr

public class SetStatus extends DialogToastActivity
    implements wd
{

    static int j;
    private static SetStatus k;
    static ArrayList l;
    static int s;
    static int t;
    private static final String z[];
    private View m;
    private final Handler n = new qz(this);
    u1 o;
    TextView p;
    private String q;
    private final Handler r = new Handler(new a_5(this));

    public SetStatus()
    {
        q = null;
    }

    static View a(SetStatus setstatus)
    {
        return setstatus.m;
    }

    static void b(SetStatus setstatus)
    {
        setstatus.e();
    }

    static void c(SetStatus setstatus)
    {
        setstatus.h();
    }

    private boolean c()
    {
        int i1 = App.am;
        ObjectInputStream objectinputstream;
        String as[];
        int j1;
        if (!(new File(getFilesDir(), z[2])).exists())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        objectinputstream = new ObjectInputStream(openFileInput(z[1]));
        String s1 = (String)objectinputstream.readObject();
        l = new ArrayList();
        as = s1.split("\n");
        j1 = as.length;
        int i = 0;
_L2:
        String s2;
        if (i >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = as[i];
        if (s2.length() > 0)
        {
            l.add(s2);
        }
        i++;
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        objectinputstream.close();
        return true;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        try
        {
            throw classnotfoundexception;
        }
        catch (ClassNotFoundException classnotfoundexception1)
        {
            Log.c(z[3], classnotfoundexception1);
        }
        catch (IOException ioexception)
        {
            Log.a(ioexception);
        }
        return false;
    }

    static void d(SetStatus setstatus)
    {
        setstatus.g();
    }

    private void e()
    {
label0:
        {
            com.whatsapp.fieldstats.z.a(App.au, j.STATUS_UPDATE_C, Integer.valueOf(1));
            n.removeMessages(0);
            if (q != null)
            {
                App.aJ = q;
                q = null;
                n.sendEmptyMessage(1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.e(z[6]);
        }
    }

    private void g()
    {
        n.removeMessages(0);
        n.sendEmptyMessage(0);
    }

    private void h()
    {
        int i = App.am;
        ObjectOutputStream objectoutputstream;
        StringBuilder stringbuilder;
        Iterator iterator;
        objectoutputstream = new ObjectOutputStream(App.au.openFileOutput(z[7], 0));
        stringbuilder = new StringBuilder();
        iterator = l.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            stringbuilder.append((String)iterator.next()).append("\n");
        } while (i == 0);
        if (stringbuilder.length() > 1)
        {
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        }
        FileNotFoundException filenotfoundexception;
        try
        {
            objectoutputstream.writeObject(stringbuilder.toString());
            objectoutputstream.close();
            return;
        }
        catch (FileNotFoundException filenotfoundexception1)
        {
            filenotfoundexception1.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_114;
        filenotfoundexception;
        throw filenotfoundexception;
        return;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        return;
    }

    public void a()
    {
    }

    public void a(String s1)
    {
    }

    public void a(Collection collection)
    {
    }

    public void b(String s1)
    {
    }

    public void c(String s1)
    {
        runOnUiThread(new qy(this, s1));
    }

    public ArrayList d()
    {
        int i1 = App.am;
        ArrayList arraylist = new ArrayList();
        TypedArray typedarray = getResources().obtainTypedArray(0x7f070006);
        int i = 0;
        do
        {
            if (i >= typedarray.length())
            {
                break;
            }
            arraylist.add(typedarray.getString(i));
            i++;
        } while (i1 == 0);
        return arraylist;
    }

    public void d(String s1)
    {
    }

    public void e(String s1)
    {
        showDialog(2);
        q = s1;
        if (!App.a(s1, new yr(this), new ae(this), new afv(this)))
        {
            g();
        }
        n.sendEmptyMessageDelayed(0, 32000L);
    }

    public void f()
    {
        findViewById(0x7f0b019c).setVisibility(0);
        findViewById(0x7f0b0292).setVisibility(8);
        App.a((new StringBuilder()).append(App.k()).append(z[4]).toString(), 0L, new Messenger(r));
    }

    protected void onActivityResult(int i, int i1, Intent intent)
    {
        if (i1 == -1)
        {
            intent = intent.getStringExtra(z[0]);
            if (i == t)
            {
                l.add(0, intent);
                e(intent);
            } else
            {
                if (s >= 0)
                {
                    l.remove(s);
                    l.add(s, intent);
                }
                if (i == j)
                {
                    e(intent);
                    return;
                }
            }
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        android.widget.AdapterView.AdapterContextMenuInfo adaptercontextmenuinfo = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        switch (menuitem.getItemId())
        {
        default:
            return true;

        case 1: // '\001'
            l.remove(adaptercontextmenuinfo.position);
            break;
        }
        s = -1;
        o.notifyDataSetChanged();
        h();
        return true;
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            Log.i(z[5]);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setContentView(0x7f0300a0);
            ft.a(o.STATUS_VIEWS);
            m = findViewById(0x7f0b0291);
            if (!App.aF)
            {
                f();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            m.setOnClickListener(new jj(this));
        }
        p = (TextView)findViewById(0x7f0b0120);
        p.setText(com.whatsapp.util.c.b(App.aJ, getBaseContext()));
        if (!c())
        {
            l = d();
        }
        bundle = (ListView)findViewById(0x7f0b0295);
        bundle.setEmptyView(findViewById(0x7f0b0296));
        o = new u1(this, this, 0x7f0b0297, l);
        bundle.setAdapter(o);
        bundle.setOnItemClickListener(new a8i(this));
        registerForContextMenu(bundle);
        App.b(this);
        a1g.a((TextView)findViewById(0x7f0b011d));
        a1g.a((TextView)findViewById(0x7f0b0293));
        k = this;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        contextmenu.add(0, 1, 0, getString(0x7f0e012e));
    }

    public Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            return ProgressDialog.show(this, getString(0x7f0e0407), getString(0x7f0e0406), true, false);

        case 1: // '\001'
            return ProgressDialog.show(this, getString(0x7f0e0404), getString(0x7f0e0403), true, false);

        case 50: // '2'
            a8y a8y1 = new a8y(this);
            return new d9(this, 0x7f0e0030, App.aJ, a8y1, 139, 0, 0x7f0e02a7);

        case 2: // '\002'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getString(0x7f0e0407));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 3: // '\003'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e011e).setPositiveButton(0x7f0e011b, new jr(this)).setNegativeButton(0x7f0e007b, null).create();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, 0x7f0e011b).setIcon(0x7f02053f);
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        App.a(this);
        if (k == this)
        {
            k = null;
        }
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        boolean flag = true;
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 36
    //                   0: 44
    //                   16908332: 73;
           goto _L1 _L2 _L3
_L1:
        flag = super.onOptionsItemSelected(menuitem);
_L5:
        return flag;
_L2:
        if (l.size() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a(0x7f0e02b2);
        if (App.am == 0) goto _L5; else goto _L4
_L4:
        showDialog(3);
        return true;
_L3:
        finish();
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        i = 0;
        obj = "yR[\033\027y";
        byte0 = -1;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "yR[\033\027y";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "yR[\033\027y";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "iT_\016\026o\tI\033\003~SI@\021oTS\016\016c\\[\033\013eHe\n\020xIH";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "JU\024\030\nkRI\016\022z\bT\n\026";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "yR[\033\027y\tY\035\007kR_";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "yCN\034\026kRO\034MyR[\033\027ySJ\013\003~C^@\026oKJ\034\026kRO\034BcU\032\001\027fJ";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "yR[\033\027y";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                s = -1;
                k = null;
                t = 0;
                j = 2;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 295
    //                   1 302
    //                   2 309
    //                   3 316;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_316;
_L3:
        byte byte1 = 98;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 10;
          goto _L9
_L5:
        byte1 = 38;
          goto _L9
_L6:
        byte1 = 58;
          goto _L9
        byte1 = 111;
          goto _L9
    }
}
