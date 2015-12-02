// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AsyncPlayer;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Filter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.whatsapp.notification.p;
import com.whatsapp.qrcode.QrCodeActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.bz;
import com.whatsapp.util.undobar.UndoBarController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            wd, lk, a3n, ao9, 
//            og, App, vl, u5, 
//            xe, h0, k, aoz, 
//            fp, xh, dx, wk, 
//            pd, r1, xy, at9, 
//            atb, Conversation, ContactInfo, mk, 
//            ListChatInfo, GroupChatInfo, ContactPicker, ListMembersSelector, 
//            au2, NewGroup, my, WebSessionsActivity

public class ConversationsFragment extends SherlockListFragment
    implements wd, lk, a3n
{

    private static final String z[];
    private ListView b;
    TextView c;
    private String d;
    private xe e;
    TextView f;
    private pd g;
    private String h;
    private ArrayList i;
    private ao9 j;
    private int k;

    public ConversationsFragment()
    {
        j = new ao9();
        g = null;
    }

    private DialogFragment a(og og1, DialogFragment dialogfragment)
    {
        Bundle bundle = new Bundle();
        bundle.putString(z[6], og1.a);
        dialogfragment.setArguments(bundle);
        return dialogfragment;
    }

    private View a(String s)
    {
        int i1 = App.am;
        if (s == null)
        {
            return null;
        }
        int l = 0;
        do
        {
label0:
            {
                if (l < b.getChildCount())
                {
                    View view = b.getChildAt(l);
                    Object obj = view.getTag();
                    if (obj instanceof vl)
                    {
                        obj = (vl)obj;
                        boolean flag;
                        try
                        {
                            flag = s.equals(((vl) (obj)).j);
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            throw s;
                        }
                        if (flag)
                        {
                            return view;
                        }
                    }
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            l++;
        } while (true);
    }

    static String a(ConversationsFragment conversationsfragment, String s)
    {
        conversationsfragment.d = s;
        return s;
    }

    static ArrayList a(ConversationsFragment conversationsfragment)
    {
        return conversationsfragment.i;
    }

    static ArrayList a(ConversationsFragment conversationsfragment, ArrayList arraylist)
    {
        conversationsfragment.i = arraylist;
        return arraylist;
    }

    private void a(Context context, String s)
    {
        if (e != null)
        {
            View view = a(s);
            if (view != null)
            {
                vl vl1 = (vl)view.getTag();
                s = u5.d(s);
                e.a(context, view, s, ((og) (s)).a.contains(z[19]), vl1);
            }
        }
    }

    static View b(ConversationsFragment conversationsfragment, String s)
    {
        return conversationsfragment.a(s);
    }

    static xe b(ConversationsFragment conversationsfragment)
    {
        return conversationsfragment.e;
    }

    static void b(int l)
    {
        c(l);
    }

    private void b(View view)
    {
        AnimationSet animationset = new AnimationSet(true);
        ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        animationset.addAnimation(scaleanimation);
        animationset.addAnimation(alphaanimation);
        int l = view.getTop();
        animationset.setDuration(300L);
        view.startAnimation(animationset);
        animationset.setAnimationListener(new h0(this, l));
    }

    static int c(ConversationsFragment conversationsfragment)
    {
        return conversationsfragment.k;
    }

    private void c()
    {
        View view;
        View view1;
        int l = App.az.l();
        view = getView().findViewById(0x7f0b019a);
        view1 = getView().findViewById(0x7f0b0199);
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        view1.setVisibility(0);
        b.setEmptyView(view1);
        view.setVisibility(8);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        view.setVisibility(0);
        b.setEmptyView(view);
        view1.setVisibility(8);
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    private static void c(int l)
    {
        android.content.SharedPreferences.Editor editor = App.au.getSharedPreferences(z[21], 0).edit();
        try
        {
            editor.putInt(z[20], l);
            if (!editor.commit())
            {
                Log.e(z[22]);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static ao9 d(ConversationsFragment conversationsfragment)
    {
        return conversationsfragment.j;
    }

    static int e()
    {
        return f();
    }

    static void e(ConversationsFragment conversationsfragment)
    {
        conversationsfragment.i();
    }

    private static int f()
    {
        return App.au.getSharedPreferences(z[26], 0).getInt(z[27], 0);
    }

    static String f(ConversationsFragment conversationsfragment)
    {
        return conversationsfragment.h;
    }

    static String g(ConversationsFragment conversationsfragment)
    {
        return conversationsfragment.d;
    }

    static ListView h(ConversationsFragment conversationsfragment)
    {
        return conversationsfragment.b;
    }

    private void i()
    {
        try
        {
            if (e != null)
            {
                e.notifyDataSetChanged();
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static void i(ConversationsFragment conversationsfragment)
    {
        conversationsfragment.c();
    }

    static pd j(ConversationsFragment conversationsfragment)
    {
        return conversationsfragment.g;
    }

    public void a()
    {
        xe xe1;
        i();
        xe1 = e;
        ActivityNotFoundException activitynotfoundexception;
        if (xe1 != null)
        {
            try
            {
                if (e.getCount() == 0)
                {
                    c();
                    return;
                }
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
        }
        break MISSING_BLOCK_LABEL_34;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    protected void a(int l)
    {
        int k1 = App.am;
        if (b.getLastVisiblePosition() >= b.getAdapter().getCount() - 1) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        int l1;
        l1 = b.getChildCount();
        i1 = 0;
        j1 = 0;
_L6:
        if (j1 >= l1) goto _L2; else goto _L3
_L3:
        View view = b.getChildAt(j1);
        if (view.getTop() >= l)
        {
            TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
            translateanimation.setDuration(150L);
            translateanimation.setStartOffset((int)Math.sqrt(i1 * 300) * 8);
            translateanimation.setFillAfter(false);
            view.startAnimation(translateanimation);
            i1++;
        }
        if (k1 == 0) goto _L4; else goto _L2
_L2:
        return;
_L4:
        j1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void a(View view)
    {
        App.ah.b(h, false);
    }

    public void a(CharSequence charsequence)
    {
        e.getFilter().filter(charsequence);
    }

    public void a(String s)
    {
        a(((Context) (App.au)), s);
    }

    public void a(String s, boolean flag)
    {
        getActivity().runOnUiThread(new fp(this, s, flag));
    }

    public void a(Collection collection)
    {
    }

    public void b()
    {
        xe xe1 = e;
        if (xe1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ActivityNotFoundException activitynotfoundexception;
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(xe.a(e));
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            try
            {
                throw activitynotfoundexception1;
            }
            catch (ActivityNotFoundException activitynotfoundexception2)
            {
                throw activitynotfoundexception2;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        i = h();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        e.getFilter().filter(xe.a(e));
        g();
        e.notifyDataSetChanged();
        if (e.getCount() == 0)
        {
            c();
        }
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
        ActivityNotFoundException activitynotfoundexception3;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
    }

    public void b(String s)
    {
        a(App.au, s);
    }

    public void c(String s)
    {
        a(App.au, s);
    }

    protected void d()
    {
        View view = getActivity().getLayoutInflater().inflate(0x7f030058, b, false);
        b.addFooterView(view, null, true);
        f = (TextView)view.findViewById(0x7f0b01a8);
        view = getActivity().getLayoutInflater().inflate(0x7f030058, b, false);
        view.setBackgroundResource(0x7f02063d);
        view.setOnClickListener(new xh(this));
        b.addFooterView(view, null, true);
        c = (TextView)view.findViewById(0x7f0b01a8);
    }

    void d(int l)
    {
        ((dx)getActivity()).a(l);
    }

    public void d(String s)
    {
        a(App.au, s);
    }

    public void e(String s)
    {
        getActivity().runOnUiThread(new wk(this));
    }

    void f(String s)
    {
        ((dx)getActivity()).f(s);
    }

    protected void g()
    {
        int l = 0;
        int i1;
        k = u5.c();
        i1 = k;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        c.setText(getString(0x7f0e004d, new Object[] {
            Integer.valueOf(k)
        }));
        c.setVisibility(0);
        f.setVisibility(8);
        i1 = App.am;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        TextView textview;
        ActivityNotFoundException activitynotfoundexception;
        int j1;
        try
        {
            c.setVisibility(8);
            textview = f;
            j1 = f();
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (j1 >= 3)
        {
            l = 8;
        }
        textview.setVisibility(l);
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    protected ArrayList h()
    {
        return u5.f();
    }

    public void onActivityCreated(Bundle bundle)
    {
        boolean flag = true;
        bz bz1 = new bz(z[0]);
        ListView listview;
        int l;
        try
        {
            super.onActivityCreated(bundle);
            setHasOptionsMenu(true);
            if (g == null)
            {
                g = new pd();
                g.b = getString(0x7f0e01f5);
                g.d = getString(0x7f0e01bb);
                g.h = getString(0x7f0e01bc);
                g.c = getString(0x7f0e00fd);
                g.g = getString(0x7f0e00f7);
                g.a = getString(0x7f0e0101);
                g.e = getString(0x7f0e0100);
                g.i = getString(0x7f0e00fe);
                g.j = getString(0x7f0e00fc);
                g.f = getString(0x7f0e01f3);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            Log.i(z[1]);
            App.aT();
            App.b(this);
            App.a(this);
            i = h();
            b = getListView();
            listview = b;
            l = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (l >= 11)
        {
            flag = false;
        }
        try
        {
            listview.setFastScrollEnabled(flag);
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                b.setSelector(0x7f02063d);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            b.setScrollbarFadingEnabled(true);
            d();
            g();
            b.setOnScrollListener(new r1(this));
            e = new xe(this);
            b.setAdapter(e);
            b.setOnItemClickListener(new xy(this));
            if (e.getCount() == 0)
            {
                c();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            registerForContextMenu(b);
            getView().findViewById(0x7f0b01db).setOnClickListener(new at9(this));
            getView().findViewById(0x7f0b0198).setOnClickListener(new atb(this));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        h = bundle.getString(z[2]);
        bz1.a();
        return;
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        int j1 = App.am;
        l;
        JVM INSTR lookupswitch 3: default 40
    //                   1: 41
    //                   10: 81
    //                   11: 156;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (i1 != -1) goto _L1; else goto _L5
_L5:
        Object obj = intent.getStringExtra(z[3]);
        obj = App.az.e(((String) (obj)));
        android.net.Uri uri;
        try
        {
            startActivity(Conversation.a(((og) (obj))));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (j1 == 0) goto _L1; else goto _L3
_L3:
        if (i1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = App.az.e(h);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        uri = intent.getData();
        if (uri != null)
        {
            try
            {
                App.az.a(intent.getData(), ((og) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            if (j1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        App.az.h(((og) (obj)));
        if (j1 == 0) goto _L1; else goto _L6
_L6:
        try
        {
            Log.i(z[5]);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (j1 == 0) goto _L1; else goto _L4
_L4:
        if (i1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        intent = App.az.e(h);
        try
        {
            App.az.h(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (j1 == 0) goto _L1; else goto _L7
_L7:
        Log.i(z[4]);
        return;
        intent;
        throw intent;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        int i1 = App.am;
        menuitem.getItemId();
        JVM INSTR tableswitch 2131427336 2131427344: default 60
    //                   2131427336 327
    //                   2131427337 426
    //                   2131427338 617
    //                   2131427339 66
    //                   2131427340 653
    //                   2131427341 97
    //                   2131427342 523
    //                   2131427343 671
    //                   2131427344 635;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        return super.onContextItemSelected(menuitem);
_L5:
        menuitem = App.az.e(h);
        try
        {
            if (((og) (menuitem)).z != null)
            {
                ContactInfo.a(menuitem, getActivity());
            }
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        return true;
_L7:
        menuitem = App.az.e(h);
        boolean flag;
        if (!menuitem.k())
        {
            break MISSING_BLOCK_LABEL_242;
        }
        Log.i((new StringBuilder()).append(z[10]).append(menuitem).toString());
        flag = mk.f;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        App.b(getActivity(), 0x7f0e01f6, 0);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        flag = com.whatsapp.mk.c(((og) (menuitem)).a);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        flag = menuitem.p();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        a(menuitem, new ExitGroupDialogFragment()).show(getFragmentManager(), null);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        a(menuitem, new DeleteGroupDialogFragment()).show(getFragmentManager(), null);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        flag = menuitem.d();
        if (!flag) goto _L12; else goto _L11
_L11:
        a(menuitem, new DeleteBroadcastListDialogFragment()).show(getFragmentManager(), null);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_298;
        }
_L12:
        try
        {
            a(menuitem, new DeleteContactDialogFragment()).show(getFragmentManager(), null);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        return true;
        menuitem;
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
        catch (MenuItem menuitem) { }
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
        catch (MenuItem menuitem) { }
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
        catch (MenuItem menuitem) { }
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        throw menuitem;
_L2:
        Intent intent;
        menuitem = App.az.e(h).a();
        intent = new Intent(z[12], android.provider.ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra(z[17], menuitem);
        intent.setComponent(intent.resolveActivity(getActivity().getPackageManager()));
        if (intent.getComponent() == null) goto _L14; else goto _L13
_L13:
        startActivityForResult(intent, 10);
        if (i1 == 0) goto _L15; else goto _L14
_L14:
        try
        {
            Log.w(z[16]);
            App.J();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
          goto _L15
        menuitem;
        throw menuitem;
_L3:
        menuitem = new Intent(z[11]);
        menuitem.setType(z[14]);
        menuitem.putExtra(z[15], App.az.e(h).a(getActivity()));
        menuitem.putExtra(z[13], 2);
        menuitem.setFlags(0x80000);
        try
        {
            startActivityForResult(menuitem, 11);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            App.b(getActivity(), 0x7f0e0022, 0);
        }
        return true;
_L8:
        flag = App.ae;
        if (flag) goto _L17; else goto _L16
_L16:
        flag = App.aC;
        if (!flag) goto _L18; else goto _L17
_L17:
        int l;
        try
        {
            flag = App.m();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (flag)
        {
            l = 0x7f0e0287;
        } else
        {
            l = 0x7f0e0288;
        }
        try
        {
            d(l);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (i1 == 0) goto _L19; else goto _L18
_L18:
        a(App.az.e(h), new EmailConversationMediaChoiceDialogFragment()).show(getFragmentManager(), null);
_L19:
        return true;
        menuitem;
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        throw menuitem;
_L4:
        b(((android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo()).targetView);
        return true;
_L10:
        a(((android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo()).targetView);
        return true;
_L6:
        App.az.g(App.az.e(h));
        return true;
_L9:
        menuitem = App.az.e(h);
        flag = menuitem.d();
        if (!flag) goto _L21; else goto _L20
_L20:
        try
        {
            ListChatInfo.a(menuitem, getActivity());
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (i1 == 0) goto _L22; else goto _L21
_L21:
        GroupChatInfo.a(menuitem, getActivity());
          goto _L22
        menuitem;
        throw menuitem;
_L15:
        return true;
_L22:
        return true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        int j1;
        j1 = App.am;
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        view = (vl)((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).targetView.getTag();
        if (view != null) goto _L2; else goto _L1
_L1:
        Log.i(z[23]);
_L3:
        return;
        contextmenu;
        throw contextmenu;
_L2:
        h = ((vl) (view)).j;
        contextmenuinfo = App.az.e(h);
        try
        {
            if (z[24].equals(((vl) (view)).j))
            {
                contextmenu.add(0, 0x7f0b000d, 0, getString(0x7f0e0122));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        boolean flag = contextmenuinfo.p();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        try
        {
            flag = ((og) (contextmenuinfo)).a.contains(z[25]);
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        if (!flag)
        {
            contextmenu.add(0, 0x7f0b000d, 0, getString(0x7f0e0128));
            return;
        }
          goto _L3
        contextmenu;
        throw contextmenu;
        dh dh;
        try
        {
            flag = ((og) (contextmenuinfo)).a.equals(mk.d());
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        if (flag) goto _L3; else goto _L4
_L4:
        dh = ((og) (contextmenuinfo)).z;
        if (dh != null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        flag = contextmenuinfo.k();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        int l;
        try
        {
            l = ((vl) (view)).o.getVisibility();
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        if (l == 0) goto _L3; else goto _L5
_L5:
        contextmenu.add(0, 0x7f0b000f, 0, getString(0x7f0e01dc));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        flag = contextmenuinfo.d();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        contextmenu.add(0, 0x7f0b000f, 0, getString(0x7f0e021d));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        try
        {
            contextmenu.add(0, 0x7f0b0008, 0, getString(0x7f0e0026));
            contextmenu.add(0, 0x7f0b0009, 0, getString(0x7f0e0029));
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        contextmenu.add(0, 0x7f0b000b, 0, getString(0x7f0e047b));
        flag = contextmenuinfo.d();
        if (!flag)
        {
            try
            {
                if (!App.a())
                {
                    contextmenu.add(0, 0x7f0b000c, 0, getString(0x7f0e002e));
                }
            }
            // Misplaced declaration of an exception variable
            catch (ContextMenu contextmenu)
            {
                throw contextmenu;
            }
        }
        flag = App.ah.y(((og) (contextmenuinfo)).a);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        flag = og.e(((og) (contextmenuinfo)).a);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        contextmenu.add(0, 0x7f0b0010, 0, getString(0x7f0e0451));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_504;
        }
        contextmenu.add(0, 0x7f0b0010, 0, getString(0x7f0e0452));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_504;
        }
        flag = og.e(((og) (contextmenuinfo)).a);
        if (flag)
        {
            try
            {
                contextmenu.add(0, 0x7f0b000a, 0, getString(0x7f0e004a));
            }
            // Misplaced declaration of an exception variable
            catch (ContextMenu contextmenu)
            {
                throw contextmenu;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_504;
            }
        }
        contextmenu.add(0, 0x7f0b000a, 0, getString(0x7f0e004b));
        flag = contextmenuinfo.k();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_557;
        }
        int i1;
        try
        {
            flag = com.whatsapp.mk.c(((og) (contextmenuinfo)).a);
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        if (flag)
        {
            i1 = 0x7f0e0177;
        } else
        {
            i1 = 0x7f0e0128;
        }
        contextmenu.add(0, 0x7f0b000d, 0, getString(i1));
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = contextmenuinfo.d();
        if (flag)
        {
            try
            {
                contextmenu.add(0, 0x7f0b000d, 0, getString(0x7f0e012a));
            }
            // Misplaced declaration of an exception variable
            catch (ContextMenu contextmenu)
            {
                throw contextmenu;
            }
            if (j1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        contextmenu.add(0, 0x7f0b000d, 0, getString(0x7f0e0123));
        if (App.ah.t(h) == null) goto _L3; else goto _L6
_L6:
        contextmenu.add(0, 0x7f0b000e, 0, getString(0x7f0e0144));
        return;
        contextmenu;
        throw contextmenu;
        contextmenu;
        try
        {
            throw contextmenu;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu) { }
        throw contextmenu;
        contextmenu;
        try
        {
            throw contextmenu;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu) { }
        try
        {
            throw contextmenu;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu) { }
        throw contextmenu;
        contextmenu;
        throw contextmenu;
        contextmenu;
        try
        {
            throw contextmenu;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu) { }
        try
        {
            throw contextmenu;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu) { }
        try
        {
            throw contextmenu;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu) { }
        try
        {
            throw contextmenu;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu) { }
        throw contextmenu;
        contextmenu;
        throw contextmenu;
        contextmenu;
        try
        {
            throw contextmenu;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu) { }
        throw contextmenu;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030055, viewgroup, false);
    }

    public void onDestroy()
    {
        Log.i(z[8]);
        super.onDestroy();
        App.a(this);
        App.b(this);
        j.a();
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        int i1 = App.am;
        menuitem.getItemId();
        JVM INSTR tableswitch 2131427346 2131427352: default 52
    //                   2131427346 75
    //                   2131427347 52
    //                   2131427348 52
    //                   2131427349 54
    //                   2131427350 95
    //                   2131427351 52
    //                   2131427352 233;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L1 _L5
_L1:
        return false;
_L3:
        startActivityForResult(new Intent(getActivity(), com/whatsapp/ContactPicker), 1);
        return true;
_L2:
        startActivity(new Intent(getActivity(), com/whatsapp/ListMembersSelector));
        return true;
_L4:
        int l;
        menuitem = u5.d().iterator();
        l = 0;
_L7:
        String s;
        if (!menuitem.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)menuitem.next();
        boolean flag = mk.h(s);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = s.contains(App.k());
        if (flag)
        {
            try
            {
                flag = com.whatsapp.og.c(s);
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                throw menuitem;
            }
            if (!flag)
            {
                l++;
            }
        }
        if (i1 == 0) goto _L7; else goto _L6
_L6:
        if (l < au2.r) goto _L9; else goto _L8
_L8:
        f(getString(0x7f0e01bd, new Object[] {
            Integer.valueOf(au2.r)
        }));
        return true;
        menuitem;
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.MenuItem menuitem) { }
        throw menuitem;
        menuitem;
        throw menuitem;
_L9:
        startActivity(new Intent(getActivity(), com/whatsapp/NewGroup));
        return true;
_L5:
        flag = my.t();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        startActivity(new Intent(getActivity(), com/whatsapp/WebSessionsActivity));
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        flag = App.i();
        if (flag)
        {
            try
            {
                startActivity(new Intent(getActivity(), com/whatsapp/qrcode/QrCodeActivity));
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                throw menuitem;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_310;
            }
        }
        App.b(getActivity(), 0x7f0e0289, 0);
        return true;
        menuitem;
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.MenuItem menuitem) { }
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.MenuItem menuitem) { }
        throw menuitem;
    }

    public void onPause()
    {
        Log.i(z[18]);
        super.onPause();
        UndoBarController.b(getActivity());
    }

    public void onResume()
    {
        Log.i(z[7]);
        super.onResume();
        p.a();
        App.k.stop();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString(z[9], h);
    }

    public void onStart()
    {
        super.onStart();
    }

    public void onStop()
    {
        super.onStop();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int l;
        as = new String[28];
        obj = "dU'IauI(KmhT:\020gu_(Ka";
        byte0 = -1;
        l = 0;
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
                as1[l] = ((String) (obj));
                obj = "dU'IauI(KmhT:\020gu_(Ka";
                l = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                obj = "KU'XTu_:Lach&HNn^";
                l = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[l] = ((String) (obj));
                l = 3;
                obj = "dU'KedN";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[l] = ((String) (obj));
                obj = "dU'IauI(KmhT:\020vbI<Sp(I\"Vt(Y&QpfY=\037jhNi^`c_-";
                byte0 = 3;
                l = 4;
                break;

            case 3: // '\003'
                as1[l] = ((String) (obj));
                l = 5;
                obj = "dU'IauI(KmhT:\020vbI<Sp'Y&QpfY=\037jhNi^`c_-";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[l] = ((String) (obj));
                l = 6;
                obj = "mS-";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[l] = ((String) (obj));
                obj = "dU'IauI(KmhT:\020vbI<Ra";
                byte0 = 6;
                l = 7;
                break;

            case 6: // '\006'
                as1[l] = ((String) (obj));
                l = 8;
                obj = "dU'IauI(KmhT:\020`bI=Mk~";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[l] = ((String) (obj));
                l = 9;
                obj = "KU'XTu_:Lach&HNn^";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[l] = ((String) (obj));
                l = 10;
                obj = "dU'IauI(KmhT:\020`bV,Ka(];Pqw\0";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[l] = ((String) (obj));
                l = 11;
                obj = "fT-Mkn^gVjs_'K*fY=Vki\024\000qWBh\035`KUe\f{MS";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[l] = ((String) (obj));
                l = 12;
                obj = "fT-Mkn^gVjs_'K*fY=Vki\024\000qWBh\035";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[l] = ((String) (obj));
                l = 13;
                obj = "wR&QaXN0Oa";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[l] = ((String) (obj));
                l = 14;
                obj = "qT-\021ei^;Pmc\024*JvtU;\021ms_$\020ghT=^gs";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[l] = ((String) (obj));
                l = 15;
                obj = "wR&Qa";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[l] = ((String) (obj));
                l = 16;
                obj = "dU'IauI(KmhT:\020ghT=Z|s\032:Fws_$\037ghT=^gs\032%Vws\032*Pqk^iQks\032/Pqi^";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[l] = ((String) (obj));
                l = 17;
                obj = "wR&Qa";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[l] = ((String) (obj));
                l = 18;
                obj = "dU'IauI(KmhT:\020tfO:Z";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[l] = ((String) (obj));
                l = 19;
                obj = "`H&JtXT&Kmd_\tKajJ";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[l] = ((String) (obj));
                l = 20;
                obj = "c_%Zpbe*Wese*PqiN";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[l] = ((String) (obj));
                l = 21;
                obj = "dU$\021so[=LewJ\026Ovb\\,MaiY,L";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[l] = ((String) (obj));
                l = 22;
                obj = "dU'IauI(KmhT:\020wbN-ZhbN,\\lfNfYenV,[";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[l] = ((String) (obj));
                l = 23;
                obj = "dU'IauI(KmhT:\020ghT=Z|s\025'Jhk";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[l] = ((String) (obj));
                l = 24;
                obj = "eH&^`d[:K";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[l] = ((String) (obj));
                l = 25;
                obj = "`H&JtXT&Kmd_\tKajJ";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[l] = ((String) (obj));
                l = 26;
                obj = "dU$\021so[=LewJ\026Ovb\\,MaiY,L";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[l] = ((String) (obj));
                l = 27;
                obj = "c_%Zpbe*Wese*PqiN";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[l] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 696
    //                   0 718
    //                   1 725
    //                   2 732
    //                   3 739;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_739;
_L3:
        byte byte1 = 4;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 7;
          goto _L9
_L5:
        byte1 = 58;
          goto _L9
_L6:
        byte1 = 73;
          goto _L9
        byte1 = 63;
          goto _L9
    }

    private class ExitGroupDialogFragment extends DialogFragment
    {

        private static final String z;

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = App.az.e(getArguments().getString(z));
            String s = getString(0x7f0e0178, new Object[] {
                bundle.a(getActivity())
            });
            return (new android.app.AlertDialog.Builder(getActivity())).setMessage(com.whatsapp.util.c.b(s, getActivity().getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new w6(this)).setPositiveButton(0x7f0e0176, new n2(this, bundle)).create();
        }

        static 
        {
            char ac[];
            int l;
            int i1;
            ac = "4\027e".toCharArray();
            i1 = ac.length;
            l = 0;
_L7:
            char c1;
            if (i1 <= l)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[l];
            l % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 103;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_103;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 50;
_L8:
            ac[l] = (char)(byte0 ^ c1);
            l++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 94;
              goto _L8
_L3:
            byte0 = 126;
              goto _L8
_L4:
            byte0 = 1;
              goto _L8
            byte0 = 67;
              goto _L8
        }

        public ExitGroupDialogFragment()
        {
        }
    }


    private class DeleteGroupDialogFragment extends DialogFragment
    {

        private static final String z;

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = App.az.e(getArguments().getString(z));
            String s = getString(0x7f0e0129, new Object[] {
                bundle.a(getActivity())
            });
            return (new android.app.AlertDialog.Builder(getActivity())).setMessage(com.whatsapp.util.c.b(s, getActivity().getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new ld(this)).setPositiveButton(0x7f0e010e, new rn(this, bundle)).create();
        }

        static 
        {
            char ac[];
            int l;
            int i1;
            ac = "d%\037".toCharArray();
            i1 = ac.length;
            l = 0;
_L7:
            char c1;
            if (i1 <= l)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[l];
            l % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 104;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_104;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 26;
_L8:
            ac[l] = (char)(byte0 ^ c1);
            l++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 14;
              goto _L8
_L3:
            byte0 = 76;
              goto _L8
_L4:
            byte0 = 123;
              goto _L8
            byte0 = 75;
              goto _L8
        }

        public DeleteGroupDialogFragment()
        {
        }
    }


    private class DeleteBroadcastListDialogFragment extends DialogFragment
    {

        private static final String z;

        public Dialog onCreateDialog(Bundle bundle)
        {
            og og1;
label0:
            {
                og1 = App.az.e(getArguments().getString(z));
                if (TextUtils.isEmpty(og1.n))
                {
                    bundle = getString(0x7f0e012c);
                    if (App.am == 0)
                    {
                        break label0;
                    }
                }
                bundle = getString(0x7f0e012b, new Object[] {
                    og1.a(getActivity())
                });
            }
            return (new android.app.AlertDialog.Builder(getActivity())).setMessage(com.whatsapp.util.c.b(bundle, getActivity().getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new xc(this)).setPositiveButton(0x7f0e010e, new mf(this, og1)).create();
        }

        static 
        {
            char ac[];
            int l;
            int i1;
            ac = ",Tg".toCharArray();
            i1 = ac.length;
            l = 0;
_L7:
            char c1;
            if (i1 <= l)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[l];
            l % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 103;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_103;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 97;
_L8:
            ac[l] = (char)(byte0 ^ c1);
            l++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 70;
              goto _L8
_L3:
            byte0 = 61;
              goto _L8
_L4:
            byte0 = 3;
              goto _L8
            byte0 = 100;
              goto _L8
        }

        public DeleteBroadcastListDialogFragment()
        {
        }
    }


    private class DeleteContactDialogFragment extends DialogFragment
    {

        private static final String z;

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = App.az.e(getArguments().getString(z));
            String s = getString(0x7f0e0127, new Object[] {
                bundle.a(getActivity())
            });
            return (new android.app.AlertDialog.Builder(getActivity())).setMessage(com.whatsapp.util.c.b(s, getActivity().getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new ass(this)).setPositiveButton(0x7f0e010e, new aop(this, bundle)).create();
        }

        static 
        {
            char ac[];
            int l;
            int i1;
            ac = ";aN".toCharArray();
            i1 = ac.length;
            l = 0;
_L7:
            char c1;
            if (i1 <= l)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[l];
            l % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 104;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_104;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 122;
_L8:
            ac[l] = (char)(byte0 ^ c1);
            l++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 81;
              goto _L8
_L3:
            byte0 = 8;
              goto _L8
_L4:
            byte0 = 42;
              goto _L8
            byte0 = 38;
              goto _L8
        }

        public DeleteContactDialogFragment()
        {
        }
    }


    private class EmailConversationMediaChoiceDialogFragment extends DialogFragment
    {

        private static final String z;

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = App.az.e(getArguments().getString(z));
            return (new android.app.AlertDialog.Builder(getActivity())).setMessage(0x7f0e0146).setPositiveButton(0x7f0e0053, new atc(this, bundle)).setNeutralButton(0x7f0e04b4, new m(this, bundle)).create();
        }

        static 
        {
            char ac[];
            int l;
            int i1;
            ac = "Qy2".toCharArray();
            i1 = ac.length;
            l = 0;
_L7:
            char c1;
            if (i1 <= l)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[l];
            l % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 104;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_104;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 87;
_L8:
            ac[l] = (char)(byte0 ^ c1);
            l++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 59;
              goto _L8
_L3:
            byte0 = 16;
              goto _L8
_L4:
            byte0 = 86;
              goto _L8
            byte0 = 113;
              goto _L8
        }

        public EmailConversationMediaChoiceDialogFragment()
        {
        }
    }

}
