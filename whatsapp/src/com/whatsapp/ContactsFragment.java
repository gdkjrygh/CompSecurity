// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ListView;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.whatsapp.fieldstats.l;
import com.whatsapp.fieldstats.o;
import com.whatsapp.util.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            a3n, wd, og, ao9, 
//            App, a1o, ContactPickerHelp, ft, 
//            dh, al, asw, a19, 
//            k, zn, zz, z7, 
//            h3, a1b, atl, aot, 
//            xx, eb

public class ContactsFragment extends SherlockListFragment
    implements a3n, wd
{

    private static final og b;
    private static final og f;
    private static final og l;
    private static final String z[];
    private HashMap c;
    private Handler d;
    private al e;
    private ao9 g;
    private a19 h;
    private ActionMode i;
    private ArrayList j;
    private CharSequence k;
    private com.actionbarsherlock.view.ActionMode.Callback m;
    private ArrayList n;

    public ContactsFragment()
    {
        n = new ArrayList();
        j = new ArrayList();
        g = new ao9();
        d = new Handler();
    }

    static ActionMode a(ContactsFragment contactsfragment, ActionMode actionmode)
    {
        contactsfragment.i = actionmode;
        return actionmode;
    }

    static ao9 a(ContactsFragment contactsfragment)
    {
        return contactsfragment.g;
    }

    static og a()
    {
        return l;
    }

    static ArrayList a(ContactsFragment contactsfragment, CharSequence charsequence)
    {
        return contactsfragment.a(charsequence);
    }

    private ArrayList a(CharSequence charsequence)
    {
        int i1;
        i1 = App.am;
        ArrayList arraylist;
        ArrayList arraylist1;
        Iterator iterator;
        og og1;
        if (charsequence != null)
        {
            charsequence = charsequence.toString().toLowerCase();
        } else
        {
            charsequence = null;
        }
        arraylist = n;
        arraylist;
        JVM INSTR monitorenter ;
        arraylist1 = new ArrayList();
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        iterator = n.iterator();
_L4:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og1 = (og)iterator.next();
        if (og1.z != null && og1.d(charsequence))
        {
            arraylist1.add(og1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        arraylist1.addAll(n);
_L5:
        arraylist;
        JVM INSTR monitorexit ;
        return arraylist1;
        charsequence;
        arraylist;
        JVM INSTR monitorexit ;
        throw charsequence;
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (i1 == 0) goto _L5; else goto _L2
    }

    static HashMap a(ContactsFragment contactsfragment, HashMap hashmap)
    {
        contactsfragment.c = hashmap;
        return hashmap;
    }

    private void a(int i1)
    {
    }

    static void a(ContactsFragment contactsfragment, int i1)
    {
        contactsfragment.a(i1);
    }

    static void a(ContactsFragment contactsfragment, og og1)
    {
        contactsfragment.c(og1);
    }

    private void a(boolean flag)
    {
label0:
        {
            if (App.Z == null)
            {
                App.b(getActivity(), 0x7f0e0191, 1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ((SherlockFragmentActivity)getActivity()).setSupportProgressBarIndeterminateVisibility(true);
            x.a(new a1o(this, flag));
        }
    }

    private static boolean a(og og1)
    {
        return z[0].equals(og1.a);
    }

    static CharSequence b(ContactsFragment contactsfragment, CharSequence charsequence)
    {
        contactsfragment.k = charsequence;
        return charsequence;
    }

    static ArrayList b(ContactsFragment contactsfragment)
    {
        return contactsfragment.n;
    }

    private void b()
    {
        startActivity(new Intent(getActivity(), com/whatsapp/ContactPickerHelp));
    }

    static boolean b(og og1)
    {
        return a(og1);
    }

    static og c()
    {
        return f;
    }

    static HashMap c(ContactsFragment contactsfragment)
    {
        return contactsfragment.c;
    }

    private void c(og og1)
    {
        ft.a(o.TELL_A_FRIEND, l.INVITE_NON_WA_CONTACT);
        App.a(getActivity(), Uri.parse((new StringBuilder()).append(z[4]).append(og1.z.a()).toString()), getString(0x7f0e0442, new Object[] {
            z[3]
        }));
    }

    static CharSequence d(ContactsFragment contactsfragment)
    {
        return contactsfragment.k;
    }

    private void d()
    {
        if (e != null)
        {
            e.cancel(true);
        }
        e = new al(this, null);
        asw.a(e, new Void[0]);
    }

    static og e()
    {
        return b;
    }

    static void e(ContactsFragment contactsfragment)
    {
        contactsfragment.b();
    }

    private void f()
    {
label0:
        {
            if (i == null)
            {
                break label0;
            }
            if (c.size() == 0)
            {
                i.finish();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            i.setTitle(Integer.toString(c.size()));
        }
    }

    static void f(ContactsFragment contactsfragment)
    {
        contactsfragment.g();
    }

    private void g()
    {
    }

    static void g(ContactsFragment contactsfragment)
    {
        contactsfragment.d();
    }

    static ArrayList h(ContactsFragment contactsfragment)
    {
        return contactsfragment.j;
    }

    static void i(ContactsFragment contactsfragment)
    {
        contactsfragment.f();
    }

    static a19 j(ContactsFragment contactsfragment)
    {
        return contactsfragment.h;
    }

    static Handler k(ContactsFragment contactsfragment)
    {
        return contactsfragment.d;
    }

    public void a()
    {
        d();
    }

    public void a(CharSequence charsequence)
    {
        h.getFilter().filter(charsequence);
    }

    public void a(String s)
    {
        s = App.az.e(s);
        if (s != null)
        {
            s = new zn(s);
            if (og.a(n, s))
            {
                h.notifyDataSetChanged();
            }
        }
    }

    public void a(Collection collection)
    {
        h.notifyDataSetChanged();
    }

    public void b(String s)
    {
    }

    public void c(String s)
    {
        s = App.az.e(s);
        if (s != null)
        {
            s = new zz(s);
            if (og.a(n, s))
            {
                h.notifyDataSetChanged();
            }
        }
    }

    public void d(String s)
    {
        s = App.az.e(s);
        if (s != null)
        {
            s = new z7(s);
            if (og.a(n, s))
            {
                h.notifyDataSetChanged();
            }
        }
    }

    public boolean h()
    {
        if (i != null)
        {
            return false;
        }
        if (m == null)
        {
            m = new h3(this);
        }
        h.notifyDataSetChanged();
        i = ((SherlockFragmentActivity)getActivity()).startActionMode(m);
        return true;
    }

    public void onActivityCreated(Bundle bundle)
    {
label0:
        {
            super.onActivityCreated(bundle);
            setHasOptionsMenu(true);
            d();
            h = new a1b(this, getActivity(), j);
            setListAdapter(h);
            bundle = getListView();
            bundle.setFastScrollEnabled(true);
            bundle.setScrollbarFadingEnabled(true);
            View view = getView().findViewById(0x7f0b0138);
            view.setVisibility(0);
            getView().findViewById(0x7f0b0137).setVisibility(8);
            bundle.setEmptyView(view);
            getView().findViewById(0x7f0b01db).setOnClickListener(new atl(this));
            bundle.setTextFilterEnabled(true);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                bundle.setFastScrollAlwaysVisible(true);
                bundle.setScrollBarStyle(0x2000000);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            bundle.setSelector(0x7f02063d);
        }
        registerForContextMenu(bundle);
        bundle.setOnItemClickListener(new aot(this));
        bundle.setOnItemLongClickListener(new xx(this, bundle));
        App.b(this);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
label0:
        {
            switch (menuitem.getItemId())
            {
            default:
                return super.onContextItemSelected(menuitem);

            case 2131427357: 
                menuitem = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
                break;
            }
            menuitem = (og)getListView().getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (menuitem)).position);
            if (!App.i())
            {
                App.b(getActivity(), 0x7f0e02ad, 0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            getActivity().showDialog(107);
            x.a(new eb(this, menuitem));
        }
        return true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        obj = (og)((ListView)view).getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        if (!App.C(((og) (obj)).a))
        {
            return;
        } else
        {
            contextmenu.add(0, 0x7f0b001d, 0, String.format(getString(0x7f0e005f), new Object[] {
                ((og) (obj)).n
            }));
            super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
            return;
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030037, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        App.a(this);
        if (e != null)
        {
            e.cancel(true);
        }
        g.a();
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131427348: 
            menuitem = new Intent(z[1]);
            menuitem.setType(z[2]);
            startActivity(menuitem);
            return true;

        case 2131427356: 
            ft.a(o.TELL_A_FRIEND, l.CONTACTS_MENU);
            App.c(getActivity());
            return true;

        case 2131427351: 
            a(true);
            return true;

        case 2131427335: 
            b();
            return true;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[5];
        obj = "\036zK'w\004v\016/e";
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
                obj = "\021{\0028y\031qH#x\004p\b>8\021v\022#y\036;/\004E5G2";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "\006{\002dw\036q\024%\177\024;\005?d\003z\024dr\031gI)y\036a\007)b";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "\030a\022:eJ:I=~\021a\025+f\000;\005%{_q\ne";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "\003x\025>yJ";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                z = as;
                b = new og("");
                l = new og("");
                f = new og("");
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 251
    //                   1 258
    //                   2 265
    //                   3 272;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_272;
_L3:
        byte byte1 = 22;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 112;
          goto _L9
_L5:
        byte1 = 21;
          goto _L9
_L6:
        byte1 = 102;
          goto _L9
        byte1 = 74;
          goto _L9
    }
}
