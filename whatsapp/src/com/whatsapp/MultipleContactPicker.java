// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.util.Log;
import com.whatsapp.util.bk;
import com.whatsapp.util.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, wd, ao9, q8, 
//            App, og, a5, abl, 
//            k, tr, zn, zz, 
//            mk, z7, aou, iz, 
//            v7, o_, hb, alx, 
//            yn

public class MultipleContactPicker extends DialogToastListActivity
    implements wd
{

    private static final String z[];
    private ImageButton i;
    private int j;
    private View k;
    private InputMethodManager l;
    private final TextWatcher m = new q8(this);
    private int n;
    private Set o;
    private ArrayList p;
    private ArrayList q;
    private a5 r;
    private boolean s;
    private ao9 t;
    private boolean u;
    private EditText v;

    public MultipleContactPicker()
    {
        u = true;
        q = new ArrayList();
        p = new ArrayList();
        o = new HashSet();
        t = new ao9();
    }

    static int a(MultipleContactPicker multiplecontactpicker)
    {
        return multiplecontactpicker.j;
    }

    static void a(MultipleContactPicker multiplecontactpicker, int i1)
    {
        multiplecontactpicker.b(i1);
    }

    static void a(MultipleContactPicker multiplecontactpicker, String s1)
    {
        multiplecontactpicker.e(s1);
    }

    static boolean a(MultipleContactPicker multiplecontactpicker, boolean flag)
    {
        multiplecontactpicker.s = flag;
        return flag;
    }

    static boolean a(og og1)
    {
        return b(og1);
    }

    static ao9 b(MultipleContactPicker multiplecontactpicker)
    {
        return multiplecontactpicker.t;
    }

    private void b()
    {
        int i1 = App.am;
        Iterator iterator;
        try
        {
            if (p != null)
            {
                p.clear();
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        iterator = q.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            og og1 = (og)iterator.next();
            p.add(og1);
        } while (i1 == 0);
        try
        {
            if (r != null)
            {
                r.notifyDataSetChanged();
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
    }

    private void b(int i1)
    {
        getSupportActionBar().setSubtitle(String.format(App.j.a(0x7f0d001e, i1), new Object[] {
            Integer.valueOf(i1)
        }));
    }

    private static boolean b(og og1)
    {
        return z[8].equals(og1.a);
    }

    static boolean c(MultipleContactPicker multiplecontactpicker)
    {
        return multiplecontactpicker.u;
    }

    static Set d(MultipleContactPicker multiplecontactpicker)
    {
        return multiplecontactpicker.o;
    }

    private void d()
    {
        int i1 = App.am;
        ArrayList arraylist = q;
        arraylist;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj2;
        obj2 = new ArrayList();
        obj = q.iterator();
_L2:
        og og1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og1 = (og)((Iterator) (obj)).next();
        if (og1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag = og1.L;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((ArrayList) (obj2)).add(og1);
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        q.clear();
        App.az.b(q);
        if (q.size() >= 20)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        k.findViewById(0x7f0b024b).setVisibility(8);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        k.findViewById(0x7f0b024b).setVisibility(0);
        obj = new tr(getApplicationContext());
        obj2 = ((ArrayList) (obj2)).iterator();
_L6:
        Iterator iterator;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og1 = (og)((Iterator) (obj2)).next();
        iterator = q.iterator();
_L4:
        og og2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og2 = (og)iterator.next();
        if (og1 == null || og2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = ((tr) (obj)).a(og1, og2);
        if (j1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        og2.L = true;
        if (i1 == 0 || i1 == 0) goto _L4; else goto _L3
_L3:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        Collections.sort(q, new tr(getApplicationContext()));
        b();
        arraylist;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
    }

    static int e(MultipleContactPicker multiplecontactpicker)
    {
        return multiplecontactpicker.n;
    }

    private void e(String s1)
    {
        int i1 = App.am;
        ArrayList arraylist = p;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        p.clear();
        s1 = s1.toLowerCase();
        iterator = q.iterator();
_L4:
        og og1;
        String s2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og1 = (og)iterator.next();
        if (og1.z == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s2 = og1.a(this).toLowerCase();
        if (s2.startsWith(s1)) goto _L2; else goto _L1
_L1:
        boolean flag = s2.contains((new StringBuilder()).append(" ").append(s1).toString());
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        p.add(og1);
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (p.size() == 0)
        {
            s1 = new og(z[0]);
            p.add(s1);
        }
        arraylist;
        JVM INSTR monitorexit ;
        Collections.sort(p, new tr(getApplicationContext()));
        r.notifyDataSetChanged();
        return;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally { }
        throw s1;
        arraylist;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static ArrayList f(MultipleContactPicker multiplecontactpicker)
    {
        return multiplecontactpicker.q;
    }

    static void g(MultipleContactPicker multiplecontactpicker)
    {
        multiplecontactpicker.b();
    }

    static ImageButton h(MultipleContactPicker multiplecontactpicker)
    {
        return multiplecontactpicker.i;
    }

    static EditText i(MultipleContactPicker multiplecontactpicker)
    {
        return multiplecontactpicker.v;
    }

    public void a()
    {
        d();
        r.notifyDataSetChanged();
    }

    public void a(String s1)
    {
        s1 = App.az.e(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        s1 = new zn(s1);
        if (og.a(q, s1))
        {
            r.notifyDataSetChanged();
        }
        return;
        s1;
        throw s1;
    }

    public void a(Collection collection)
    {
        r.notifyDataSetChanged();
    }

    public void b(String s1)
    {
    }

    public void c(String s1)
    {
        s1 = App.az.e(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        s1 = new zz(s1);
        if (og.a(q, s1))
        {
            r.notifyDataSetChanged();
        }
        return;
        s1;
        throw s1;
    }

    public void d(String s1)
    {
        if (mk.h(s1))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s1 = App.az.e(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s1 = new z7(s1);
        if (og.a(q, s1))
        {
            r.notifyDataSetChanged();
        }
        return;
        s1;
        throw s1;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.dispatchTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return flag;
    }

    public void onBackPressed()
    {
        boolean flag;
        try
        {
            flag = s;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        b();
        s = false;
        v.setText("");
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        super.onBackPressed();
        return;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        obj = (og)getListView().getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        int i1;
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
        if (App.i())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        a(0x7f0e02ad);
        i1 = App.am;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        showDialog(107);
        x.a(new aou(this, ((og) (obj))));
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        int i1 = App.am;
        Log.i(z[2]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(getLayoutInflater().inflate(0x7f030088, null, false));
        j = getIntent().getIntExtra(z[5], -1);
        n = getIntent().getIntExtra(z[7], 0x7f0e01f7);
        setTitle(getIntent().getStringExtra(z[4]));
        bundle = getListView();
        String s1;
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                bundle.setFastScrollAlwaysVisible(true);
                bundle.setScrollBarStyle(0x2000000);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        k = ((LayoutInflater)getBaseContext().getSystemService(z[1])).inflate(0x7f03008b, bundle, false);
        bundle.addHeaderView(k);
        v = (EditText)k.findViewById(0x7f0b024c);
        v.addTextChangedListener(m);
        iz.a(v);
        i = (ImageButton)k.findViewById(0x7f0b024d);
        i.setOnClickListener(new v7(this));
        l = (InputMethodManager)getSystemService(z[3]);
        d();
        o = new HashSet();
        s1 = getIntent().getStringExtra(z[6]);
        if (!TextUtils.isEmpty(s1))
        {
            String as[] = s1.split(",");
            Iterator iterator = q.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                og og1 = (og)iterator.next();
                alx alx1;
                try
                {
                    if (bk.a(as, og1.a))
                    {
                        og1.L = true;
                        o.add(og1.a);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw bundle;
                }
            } while (i1 == 0);
        }
        try
        {
            bundle.setEmptyView(findViewById(0x7f0b0137));
            bundle.setFastScrollEnabled(true);
            bundle.setScrollbarFadingEnabled(true);
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                bundle.setSelector(0x7f02063d);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        b(o.size());
        r = new a5(this, this, 0x7f030089, p);
        setListAdapter(r);
        hb.a(this, getSupportActionBar(), getString(0x7f0e013b), new o_(this));
        alx1 = new alx(this);
        findViewById(0x7f0b01db).setOnClickListener(alx1);
        registerForContextMenu(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        obj = (og)getListView().getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        if (obj != null)
        {
            boolean flag;
            try
            {
                flag = b(((og) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (ContextMenu contextmenu)
            {
                throw contextmenu;
            }
            if (!flag)
            {
                boolean flag1;
                try
                {
                    flag1 = App.C(((og) (obj)).a);
                }
                // Misplaced declaration of an exception variable
                catch (ContextMenu contextmenu)
                {
                    throw contextmenu;
                }
                if (flag1)
                {
                    super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
                    contextmenu.add(0, 0, 0, String.format(getString(0x7f0e005f), new Object[] {
                        ((og) (obj)).n
                    }));
                    return;
                }
            }
        }
    }

    protected Dialog onCreateDialog(int i1)
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

    public void onDestroy()
    {
        Log.i(z[9]);
        super.onDestroy();
        q.clear();
        p.clear();
        t.a();
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 33
    //                   16908332 24;
           goto _L1 _L2
_L2:
        finish();
        return true;
        menuitem;
        throw menuitem;
_L1:
        return true;
    }

    public void onPause()
    {
        super.onPause();
        App.a(this);
    }

    public void onResume()
    {
        super.onResume();
        App.b(this);
        r.notifyDataSetChanged();
    }

    public boolean onSearchRequested()
    {
        boolean flag;
        try
        {
            flag = s;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (q.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        findViewById(0x7f0b024b).setVisibility(0);
        l.toggleSoftInput(0, 0);
        v.requestFocus();
        v.setText("");
        getListView().post(new yn(this));
        return false;
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[10];
        obj = "xeH]\030bi\rU\n";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "zk\034_\fbU\f^\037zk\021U\013";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "{\177\tD\020ff\000S\026x~\004S\rfc\006[\034d%\006B\034w~\0";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "\177d\025E\rIg\000D\021yn";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "bc\021\\\034";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "zc\bY\r";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "eo\tU\032bo\001";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "zc\bY\rI}\004B\027\177d\002o\013sy\nE\013uo:C\rd";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "xeH]\030bi\rU\n";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "{\177\tD\020ff\000S\026x~\004S\rfc\006[\034d%\001U\nbx\nI";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 121;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 22;
          goto _L9
_L5:
        byte1 = 10;
          goto _L9
_L6:
        byte1 = 101;
          goto _L9
        byte1 = 48;
          goto _L9
    }
}
