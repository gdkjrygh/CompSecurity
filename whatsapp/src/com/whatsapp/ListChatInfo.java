// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, wd, ao9, abh, 
//            ad3, og, App, ContactInfo, 
//            Conversation, au2, ContactPicker, _c, 
//            mk, afo, asw, k, 
//            vn, uq, abl, k4, 
//            zz, z7, iz, c_, 
//            asz, j, adf, lg, 
//            x6, aoz, jw, d9, 
//            z9, ef, bb, aln, 
//            qm, adk

public class ListChatInfo extends DialogToastListActivity
    implements wd
{

    private static final String z[];
    private ListView i;
    private afo j;
    private android.view.View.OnClickListener k;
    private og l;
    private TextView m;
    private ArrayList n;
    private ImageButton o;
    private uq p;
    private og q;
    private View r;
    private ao9 s;
    private TextView t;
    private TextView u;
    private final adk v = new ad3(this);

    public ListChatInfo()
    {
        n = new ArrayList();
        s = new ao9();
        k = new abh(this);
    }

    static ArrayList a(ListChatInfo listchatinfo)
    {
        return listchatinfo.n;
    }

    static void a(ListChatInfo listchatinfo, og og1)
    {
        listchatinfo.b(og1);
    }

    static void a(ListChatInfo listchatinfo, ArrayList arraylist)
    {
        listchatinfo.a(arraylist);
    }

    private void a(og og1)
    {
        Object obj = og1.a();
        og1 = new Intent(z[18], android.provider.ContactsContract.Contacts.CONTENT_URI);
        try
        {
            og1.putExtra(z[19], ((String) (obj)));
            og1.setComponent(og1.resolveActivity(getPackageManager()));
            obj = og1.getComponent();
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            try
            {
                throw og1;
            }
            // Misplaced declaration of an exception variable
            catch (og og1)
            {
                throw og1;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        startActivityForResult(og1, 10);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        Log.i(z[20]);
        App.J();
        return;
    }

    public static void a(og og1, Activity activity)
    {
        Intent intent = new Intent(activity, com/whatsapp/ListChatInfo);
        intent.putExtra(z[16], og1.a);
        activity.startActivity(intent);
    }

    private void a(ArrayList arraylist)
    {
        Object obj;
        try
        {
            obj = q;
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = q.a;
        }
        ContactInfo.a(arraylist, ((String) (obj)), this);
    }

    private boolean a(og og1, int i1)
    {
        i1;
        JVM INSTR tableswitch 0 5: default 40
    //                   0 42
    //                   1 92
    //                   2 59
    //                   3 86
    //                   4 102
    //                   5 109;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return true;
_L2:
        if (og1.z == null) goto _L1; else goto _L8
_L8:
        ContactInfo.a(og1, this);
        return true;
        og1;
        throw og1;
_L4:
        if (og1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        App.b(this, 0x7f0e01aa, 0);
        if (App.am == 0) goto _L1; else goto _L9
_L9:
        a(og1);
        return true;
        og1;
        throw og1;
_L5:
        d();
        return true;
_L3:
        startActivity(Conversation.a(og1));
        return true;
_L6:
        App.b(og1, this);
        return true;
_L7:
        showDialog(6);
        return true;
    }

    static og b(ListChatInfo listchatinfo)
    {
        return listchatinfo.l;
    }

    static og b(ListChatInfo listchatinfo, og og1)
    {
        listchatinfo.l = og1;
        return og1;
    }

    private void b()
    {
label0:
        {
            if (n.size() < au2.i)
            {
                Intent intent = new Intent(this, com/whatsapp/ContactPicker);
                intent.putExtra(z[17], q.a);
                startActivityForResult(intent, 1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).create();
            alertdialog.setTitle(getString(0x7f0e0033));
            alertdialog.setMessage(getString(0x7f0e0062, new Object[] {
                Integer.valueOf(au2.i)
            }));
            alertdialog.setButton(getString(0x7f0e02ba), new _c(this));
            alertdialog.show();
        }
    }

    private void b(og og1)
    {
        mk.d(q.a, og1.a);
        n.remove(og1);
        g();
    }

    static void c(ListChatInfo listchatinfo)
    {
        listchatinfo.b();
    }

    static og d(ListChatInfo listchatinfo)
    {
        return listchatinfo.q;
    }

    private void d()
    {
        try
        {
            Intent intent = new Intent(z[11]);
            intent.setType(z[8]);
            intent.putExtra(z[10], l.a(this));
            intent.putExtra(z[9], 2);
            intent.setFlags(0x80000);
            startActivityForResult(intent, 11);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            showDialog(4);
        }
    }

    static ao9 e(ListChatInfo listchatinfo)
    {
        return listchatinfo.s;
    }

    private void e()
    {
        try
        {
            String s1 = com.whatsapp.util.q.h(this, Long.parseLong(q.M));
            m.setText(getResources().getString(0x7f0e01be, new Object[] {
                s1
            }));
            m.setVisibility(0);
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.e((new StringBuilder()).append(z[4]).append(numberformatexception).toString());
            m.setVisibility(8);
        }
        try
        {
            if (j != null)
            {
                j.cancel(true);
            }
        }
        catch (NumberFormatException numberformatexception1)
        {
            throw numberformatexception1;
        }
        setSupportProgressBarIndeterminateVisibility(true);
        j = new afo(this, null);
        asw.a(j, new Void[0]);
    }

    private void e(String s1)
    {
        mk.a(q.a, s1);
        s1 = App.az.e(s1);
        n.add(s1);
        g();
    }

    private void f()
    {
label0:
        {
label1:
            {
                int j1 = App.am;
                View view = i.getChildAt(0);
                if (view == null)
                {
                    break MISSING_BLOCK_LABEL_111;
                }
                int i1;
                try
                {
                    if (i.getWidth() <= i.getHeight())
                    {
                        break label0;
                    }
                    i1 = i.getFirstVisiblePosition();
                }
                catch (NumberFormatException numberformatexception)
                {
                    throw numberformatexception;
                }
                if (i1 == 0)
                {
                    i1 = view.getTop();
                    if (j1 == 0)
                    {
                        break label1;
                    }
                }
                i1 = -r.getHeight() + 1;
            }
            try
            {
                r.offsetTopAndBottom(i1 - r.getTop());
            }
            catch (NumberFormatException numberformatexception1)
            {
                try
                {
                    throw numberformatexception1;
                }
                catch (NumberFormatException numberformatexception2)
                {
                    throw numberformatexception2;
                }
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_111;
            }
        }
        if (r.getTop() != 0)
        {
            r.offsetTopAndBottom(-r.getTop());
        }
    }

    static void f(ListChatInfo listchatinfo)
    {
        listchatinfo.h();
    }

    private void g()
    {
        int i1;
        try
        {
            i1 = au2.i;
        }
        catch (NumberFormatException numberformatexception)
        {
            try
            {
                throw numberformatexception;
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        t.setText(Integer.toString(n.size()));
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        t.setText(getString(0x7f0e02c2, new Object[] {
            Integer.valueOf(n.size()), Integer.valueOf(au2.i)
        }));
        Collections.sort(n, new vn(getApplicationContext()));
        p.notifyDataSetChanged();
        h();
        return;
    }

    static void g(ListChatInfo listchatinfo)
    {
        listchatinfo.e();
    }

    private void h()
    {
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(q.n);
        }
        catch (NumberFormatException numberformatexception)
        {
            try
            {
                throw numberformatexception;
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        u.setText(String.format(App.j.a(0x7f0d0005, n.size()), new Object[] {
            Integer.valueOf(n.size())
        }));
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        u.setText(com.whatsapp.util.c.b(q.a(this), getBaseContext()));
        return;
    }

    static void h(ListChatInfo listchatinfo)
    {
        listchatinfo.f();
    }

    public void a()
    {
        int i1 = App.am;
        n.clear();
        Iterator iterator = mk.a(q.a).b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = App.az.e(((String) (obj)));
            try
            {
                if (!n.contains(obj))
                {
                    n.add(obj);
                }
            }
            catch (NumberFormatException numberformatexception)
            {
                throw numberformatexception;
            }
        } while (i1 == 0);
        g();
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
        if (!s1.equals((new StringBuilder()).append(App.k()).append(z[12]).toString()))
        {
            s1 = App.az.e(s1);
            if (s1 != null)
            {
                s1 = new zz(s1);
                og.a(n, s1);
                p.notifyDataSetChanged();
            }
        }
    }

    public void d(String s1)
    {
        if (!mk.h(s1))
        {
            s1 = App.az.e(s1);
            if (s1 != null)
            {
                s1 = new z7(s1);
                og.a(n, s1);
                p.notifyDataSetChanged();
            }
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        int k1 = App.am;
        i1;
        JVM INSTR lookupswitch 3: default 40
    //                   1: 171
    //                   10: 41
    //                   11: 123;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        android.net.Uri uri = intent.getData();
        if (uri != null)
        {
            try
            {
                App.az.a(intent.getData(), l);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_90;
            }
        }
        App.az.h(l);
        g();
        Conversation.h(l.a);
        if (k1 == 0) goto _L1; else goto _L5
_L5:
        Log.i(z[13]);
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        App.az.h(l);
        g();
        Conversation.h(l.a);
        if (k1 == 0) goto _L1; else goto _L6
_L6:
        try
        {
            Log.i(z[14]);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (j1 == -1)
        {
            e(intent.getStringExtra(z[15]));
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        intent;
        throw intent;
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        l = (og)((android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo()).targetView.getTag();
        a(l, menuitem.getItemId());
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        int i1 = App.am;
        Log.i(z[0]);
        super.onCreate(bundle);
        requestWindowFeature(5L);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f03006e);
        Object obj = getIntent().getStringExtra(z[3]);
        q = App.az.e(((String) (obj)));
        i = getListView();
        p = new uq(this, this, 0x7f030092, n);
        obj = (LayoutInflater)getBaseContext().getSystemService(z[2]);
        Object obj1 = iz.a(((LayoutInflater) (obj)), 0x7f03006f, i, false);
        obj = iz.a(((LayoutInflater) (obj)), 0x7f030070, i, false);
        i.addFooterView(((View) (obj1)), null, false);
        i.addHeaderView(((View) (obj)), null, false);
        r = findViewById(0x7f0b00b9);
        r.setClickable(true);
        i.setOnScrollListener(new c_(this));
        i.getViewTreeObserver().addOnGlobalLayoutListener(new asz(this));
        i.setOnItemClickListener(new j(this));
        ((View) (obj)).setClickable(false);
        ((View) (obj)).setFocusable(false);
        adf adf1 = new adf(this);
        obj1 = ((View) (obj1)).findViewById(0x7f0b01f2);
        ((TextView)((View) (obj1)).findViewById(0x7f0b01f4)).setText(0x7f0e0024);
        ((View) (obj1)).setVisibility(0);
        ((View) (obj1)).setOnClickListener(adf1);
        ((View) (obj1)).setBackgroundResource(0x7f0205de);
        ((View) (obj)).findViewById(0x7f0b0121).setVisibility(8);
        ((View) (obj)).findViewById(0x7f0b01fb).setVisibility(8);
        findViewById(0x7f0b0109).setVisibility(8);
        m = (TextView)findViewById(0x7f0b01ee);
        findViewById(0x7f0b01ef).setVisibility(8);
        ((TextView)findViewById(0x7f0b0202)).setText(0x7f0e0304);
        obj1 = new lg(this);
        ((View) (obj)).findViewById(0x7f0b0122).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        ((View) (obj)).findViewById(0x7f0b0123).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        i.setAdapter(p);
        registerForContextMenu(i);
        u = (TextView)findViewById(0x7f0b01ed);
        o = (ImageButton)findViewById(0x7f0b01f1);
        o.setOnClickListener(k);
        t = (TextView)findViewById(0x7f0b0203);
        t.setText(getString(0x7f0e02c2, new Object[] {
            Integer.valueOf(n.size()), Integer.valueOf(au2.i)
        }));
        obj = (Button)findViewById(0x7f0b01f5);
        ((Button) (obj)).setText(0x7f0e012a);
        ((Button) (obj)).setOnClickListener(new x6(this));
        obj = mk.a(q.a).b().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj2 = (String)((Iterator) (obj)).next();
            obj2 = App.az.e(((String) (obj2)));
            try
            {
                if (!n.contains(obj2))
                {
                    n.add(obj2);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        } while (i1 == 0);
        h();
        e();
        g();
        App.ah.a(v);
        App.b(this);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_660;
        }
        bundle = bundle.getString(z[1]);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_660;
        }
        l = App.az.e(bundle);
        return;
        bundle;
        throw bundle;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        view = (og)((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).targetView.getTag();
        if (view != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            contextmenu.add(0, 1, 0, getString(0x7f0e024f, new Object[] {
                view.z()
            }));
            contextmenu.add(0, 4, 0, getString(0x7f0e0070, new Object[] {
                view.z()
            }));
            contextmenuinfo = ((og) (view)).z;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            try
            {
                throw contextmenu;
            }
            // Misplaced declaration of an exception variable
            catch (ContextMenu contextmenu)
            {
                throw contextmenu;
            }
        }
        if (contextmenuinfo != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        contextmenu.add(0, 2, 0, getString(0x7f0e0026));
        contextmenu.add(0, 3, 0, getString(0x7f0e0029));
        if (App.am == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        contextmenu.add(0, 0, 0, getString(0x7f0e047d, new Object[] {
            view.z()
        }));
        if (n.size() <= 1) goto _L1; else goto _L3
_L3:
        contextmenu.add(0, 5, 0, getString(0x7f0e0359, new Object[] {
            view.z()
        }));
        return;
        contextmenu;
        throw contextmenu;
    }

    protected Dialog onCreateDialog(int i1)
    {
        i1;
        JVM INSTR lookupswitch 4: default 44
    //                   2: 93
    //                   4: 290
    //                   6: 199
    //                   50: 50;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return super.onCreateDialog(i1);
_L5:
        jw jw1 = new jw(this);
        return new d9(this, 0x7f0e013f, App.az.c(q.a).n, jw1, au2.m, 0, 0);
_L2:
        if (!TextUtils.isEmpty(q.a(this))) goto _L7; else goto _L6
_L6:
        String s1 = getString(0x7f0e012c);
        if (App.am == 0) goto _L8; else goto _L7
_L7:
        s1 = getString(0x7f0e012b, new Object[] {
            q.a(this)
        });
_L8:
        return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s1, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new z9(this)).setPositiveButton(0x7f0e02ba, new ef(this)).create();
_L4:
        if (l != null)
        {
            String s2 = getString(0x7f0e035e, new Object[] {
                l.a(this)
            });
            return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s2, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new bb(this)).setPositiveButton(0x7f0e02ba, new aln(this)).create();
        } else
        {
            return super.onCreateDialog(i1);
        }
_L3:
        Log.w(z[6]);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0022).setNeutralButton(0x7f0e02ba, new qm(this)).create();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 1, 0, 0x7f0e0024).setIcon(0x7f0204fd).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        try
        {
            Log.i(z[7]);
            super.onDestroy();
            if (j != null)
            {
                j.cancel(true);
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        s.a();
        App.ah.b(v);
        App.a(this);
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 47
    //                   1: 32
    //                   16908332: 41;
           goto _L1 _L2 _L3
_L2:
        b();
        return true;
        menuitem;
        throw menuitem;
_L3:
        finish();
        return true;
_L1:
        return false;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            super.onSaveInstanceState(bundle);
            if (l != null)
            {
                bundle.putString(z[5], l.a);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[21];
        obj = "@Ap8pO@b8pEFe#\000OZf-[I";
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
                obj = "_Mo)LXMg\023EEL";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "@Iz#ZXwj\"I@Iw)]";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "KAg";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "@Ap8LDIw%AJG,/]IIw%@B\005w%BI\007f>]CZ#";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "_Mo)LXMg\023EEL";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "@Ap8LDIw%AJG,-KH\bf4F_\\j\"H\fKl\"[MKwv\017MKw%YE\\zlAC\\#*@YFg`\017\\Zl.NNDzl[MJo)[";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "@Ap8pO@b8pEFe#\000HMp8]CQ";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "ZFgbNBLq#FH\006`9]_GqbFXMncLCFw-LX";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "\\@l\"Js\\z<J";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "\\@l\"J";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "MFg>@EL-%AXMm8\001MKw%@B\006J\002|izW\023`~wF\bfx";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "l[-;GM\\p-_\\\006m)[";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "@Ap8pO@b8pEFe#\000^Mp9CX\007`#AXI`8\017BGwlNHLf(";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "@Ap8pO@b8pEFe#\000^Mp9CX\007p'F\\\007`#AXI`8\017BGwlNHLf(";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "OGm8NO\\";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "KAg";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "KAg";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "MFg>@EL-%AXMm8\001MKw%@B\006J\002|izW";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "\\@l\"J";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "KZl9_\fAm*@\003Kl\"[IPwl\\U[w)B\fKl\"[MKwlCE[wlLC]o(\017BGwlIC]m(";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 544
    //                   0 567
    //                   1 574
    //                   2 581
    //                   3 587;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_587;
_L3:
        byte byte1 = 47;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 44;
          goto _L9
_L5:
        byte1 = 40;
          goto _L9
_L6:
        byte1 = 3;
          goto _L9
        byte1 = 76;
          goto _L9
    }
}
