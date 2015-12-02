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
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.fieldstats.o;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.cl;
import com.whatsapp.util.m;
import com.whatsapp.util.q;
import com.whatsapp.util.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, wd, ao9, q5, 
//            a9r, alz, adu, og, 
//            App, q_, a8u, ThumbnailTextButton, 
//            k, i8, mk, k4, 
//            as_, kh, aok, au2, 
//            ContactInfo, Conversation, ak6, asw, 
//            wa, ContactPicker, au1, q4, 
//            we, x1, alv, wh, 
//            Main, xf, xl, a9g, 
//            k3, zz, z7, qk, 
//            ft, iz, a_i, or, 
//            i9, a1g, akl, op, 
//            a1m, m0, fu, m8, 
//            sm, DialogToastActivity, l, a1e, 
//            aoz, atv, d9, alh, 
//            h1, af1, vv, pg, 
//            a1i, t4, a94, aue, 
//            adk, aun

public class GroupChatInfo extends DialogToastListActivity
    implements wd
{

    private static final String H[];
    private static GroupChatInfo o;
    private TextView A;
    private HashMap B;
    private final adk C = new adu(this);
    private View D;
    private og E;
    private final Handler F = new Handler(new alz(this));
    private q4 G;
    private aun i;
    private og j;
    private TextView k;
    private TextView l;
    private ListView m;
    private ImageButton n;
    private View p;
    private TextView q;
    private TextView r;
    private String s;
    private View t;
    private ImageView u;
    private ao9 v;
    private TextView w;
    android.widget.CompoundButton.OnCheckedChangeListener x;
    private ArrayList y;
    private ak6 z;

    public GroupChatInfo()
    {
        y = new ArrayList();
        B = new HashMap();
        v = new ao9();
        i = new q5(this);
        x = new a9r(this);
    }

    static View a(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.p;
    }

    static og a(GroupChatInfo groupchatinfo, og og1)
    {
        groupchatinfo.E = og1;
        return og1;
    }

    static void a(GroupChatInfo groupchatinfo, int i1)
    {
        groupchatinfo.b(i1);
    }

    static void a(GroupChatInfo groupchatinfo, String s1)
    {
        groupchatinfo.j(s1);
    }

    static void a(GroupChatInfo groupchatinfo, ArrayList arraylist)
    {
        groupchatinfo.b(arraylist);
    }

    public static void a(og og1, Activity activity)
    {
        Intent intent = new Intent(activity, com/whatsapp/GroupChatInfo);
        intent.putExtra(H[20], og1.a);
        activity.startActivity(intent);
    }

    private void a(ArrayList arraylist)
    {
        int i1 = App.am;
        int j1 = arraylist.size();
        Object obj = findViewById(0x7f0b01fb);
        if (j1 == 0)
        {
            float f1;
            android.graphics.Bitmap bitmap;
            ViewGroup viewgroup;
            ImageView imageview;
            Iterator iterator;
            c4 c4_1;
            ThumbnailTextButton thumbnailtextbutton;
            int k1;
            boolean flag;
            try
            {
                q.setVisibility(8);
                ((View) (obj)).setVisibility(8);
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                throw arraylist;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_459;
            }
        }
        q.setText(Integer.toString(j1));
        q.setVisibility(0);
        ((View) (obj)).setVisibility(0);
        viewgroup = (ViewGroup)findViewById(0x7f0b0200);
        viewgroup.setOnClickListener(new q_(this));
        viewgroup.removeAllViews();
        j1 = getResources().getDimensionPixelSize(0x7f0a0048);
        k1 = getResources().getDimensionPixelSize(0x7f0a0049);
        imageview = new ImageView(this);
        imageview.setBackgroundResource(0x7f02063d);
        imageview.setPadding(j1, j1, j1, j1);
        imageview.setOnClickListener(new a8u(this));
        imageview.setImageDrawable(new m(getResources().getDrawable(0x7f0204f8)));
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        flag = App.aR();
        if (!flag)
        {
            try
            {
                if (arraylist.size() >= 12)
                {
                    viewgroup.addView(imageview);
                }
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                throw arraylist;
            }
        }
        f1 = getResources().getDimensionPixelSize(0x7f0a0047);
        iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c4_1 = (c4)iterator.next();
            thumbnailtextbutton = new ThumbnailTextButton(this);
            thumbnailtextbutton.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            thumbnailtextbutton.setLayoutParams(new android.view.ViewGroup.LayoutParams(k1 + j1, k1 + j1));
            thumbnailtextbutton.setPadding(j1, j1, j1, j1);
            thumbnailtextbutton.setRadius(f1);
            thumbnailtextbutton.setTextSize(k1 / 6);
            thumbnailtextbutton.setBorderSize(1.0F);
            thumbnailtextbutton.setBorderColor(0x66000000);
            bitmap = com.whatsapp.util.y.a(c4_1);
            obj = bitmap;
            if (bitmap == null)
            {
                obj = cl.g(this);
            }
            thumbnailtextbutton.setImageBitmap(((android.graphics.Bitmap) (obj)));
            thumbnailtextbutton.setText(App.az.e(c4_1.G).z());
            viewgroup.addView(thumbnailtextbutton);
        } while (i1 == 0);
        try
        {
            flag = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            try
            {
                throw arraylist;
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                throw arraylist;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_432;
        }
        if (arraylist.size() < 12)
        {
            break MISSING_BLOCK_LABEL_459;
        }
        viewgroup.addView(imageview);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_459;
        }
        arraylist = (HorizontalScrollView)findViewById(0x7f0b01ff);
        arraylist.getViewTreeObserver().addOnGlobalLayoutListener(new i8(this, arraylist));
        return;
        arraylist;
        throw arraylist;
    }

    private void a(ArrayList arraylist, String s1)
    {
        int i1 = App.am;
        s1 = mk.a(s1).i().iterator();
        do
        {
            if (!s1.hasNext())
            {
                break;
            }
            as_ as_1 = (as_)s1.next();
            og og1 = App.az.e(as_1.b);
            try
            {
                if (!arraylist.contains(og1))
                {
                    arraylist.add(og1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                throw arraylist;
            }
            try
            {
                if (as_1.a)
                {
                    B.put(og1.a, og1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                throw arraylist;
            }
        } while (i1 == 0);
        Collections.sort(arraylist, new kh(getApplicationContext()));
    }

    private void b()
    {
        try
        {
            if (!isFinishing())
            {
                m.postDelayed(new aok(this), 300L);
            }
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
    }

    private void b(int i1)
    {
        i1;
        JVM INSTR tableswitch 400 406: default 44
    //                   400 89
    //                   401 89
    //                   402 44
    //                   403 44
    //                   404 89
    //                   405 44
    //                   406 45;
           goto _L1 _L2 _L2 _L1 _L1 _L2 _L1 _L3
_L1:
        return;
_L3:
        App.b(App.au.getApplicationContext(), App.au.getApplicationContext().getString(0x7f0e040b, new Object[] {
            Integer.valueOf(com.whatsapp.au2.m)
        }), 0);
        App.ay();
        if (App.am == 0) goto _L1; else goto _L2
_L2:
        App.b(App.au.getApplicationContext(), 0x7f0e0409, 0);
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        throw numberformatexception;
    }

    static void b(GroupChatInfo groupchatinfo)
    {
        groupchatinfo.d();
    }

    static void b(GroupChatInfo groupchatinfo, String s1)
    {
        groupchatinfo.h(s1);
    }

    static void b(GroupChatInfo groupchatinfo, ArrayList arraylist)
    {
        groupchatinfo.a(arraylist);
    }

    private void b(ArrayList arraylist)
    {
        ContactInfo.a(arraylist, s, this);
    }

    static void c(GroupChatInfo groupchatinfo)
    {
        groupchatinfo.j();
    }

    static void c(GroupChatInfo groupchatinfo, String s1)
    {
        groupchatinfo.i(s1);
    }

    private boolean c(int i1)
    {
        og og1;
        try
        {
            og1 = E;
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        if (og1 != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        i1;
        JVM INSTR tableswitch 0 7: default 60
    //                   0 62
    //                   1 97
    //                   2 85
    //                   3 91
    //                   4 110
    //                   5 120
    //                   6 128
    //                   7 141;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        return true;
_L4:
        if (E.z == null) goto _L1; else goto _L12
_L12:
        ContactInfo.a(E, this);
        return true;
        NumberFormatException numberformatexception1;
        numberformatexception1;
        throw numberformatexception1;
_L6:
        m();
        return true;
_L7:
        e();
        return true;
_L5:
        startActivity(Conversation.a(E));
        return true;
_L8:
        App.b(E, this);
        return true;
_L9:
        showDialog(6);
        return true;
_L10:
        e(E.a);
        return true;
_L11:
        k(E.a);
        return true;
    }

    static og d(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.j;
    }

    private void d()
    {
        try
        {
            if (z != null)
            {
                z.cancel(true);
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        setSupportProgressBarIndeterminateVisibility(true);
        z = new ak6(this);
        asw.a(z, new Void[0]);
    }

    static ImageButton e(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.n;
    }

    private void e()
    {
        try
        {
            Intent intent = new Intent(H[1]);
            intent.setType(H[2]);
            intent.putExtra(H[0], E.a(this));
            intent.putExtra(H[3], 2);
            intent.setFlags(0x80000);
            startActivityForResult(intent, 11);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            showDialog(4);
        }
    }

    private void e(String s1)
    {
        if (!App.i())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        a(0x7f0e02bf, 0x7f0e0353);
        Vector vector = new Vector();
        vector.add(s1);
        s1 = new wa(this, s, null, vector, 89);
        App.b(s1);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        App.b(getBaseContext(), 0x7f0e0289, 0);
        return;
        s1;
        throw s1;
    }

    static ArrayList f(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.y;
    }

    private void f()
    {
label0:
        {
            if (y.size() < au2.g)
            {
                Intent intent = new Intent(this, com/whatsapp/ContactPicker);
                intent.putExtra(H[24], s);
                startActivityForResult(intent, 1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).create();
            alertdialog.setTitle(getString(0x7f0e0033));
            alertdialog.setMessage(getString(0x7f0e01f7, new Object[] {
                Integer.valueOf(au2.g)
            }));
            alertdialog.setButton(getString(0x7f0e02ba), new au1(this));
            alertdialog.show();
        }
    }

    static String g(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.s;
    }

    private void g()
    {
        byte byte0 = 8;
        j = App.az.e(s);
        p();
        o();
        y.clear();
        a(y, s);
        p.setVisibility(8);
        n.setVisibility(0);
        A.setText(getString(0x7f0e02c2, new Object[] {
            Integer.valueOf(Math.min(y.size(), au2.g)), Integer.valueOf(au2.g)
        }));
        boolean flag = com.whatsapp.mk.c(s);
        boolean flag1 = mk.e(s);
        Object obj;
        int i1;
        boolean flag2;
        try
        {
            flag2 = App.aS();
        }
        catch (NumberFormatException numberformatexception)
        {
            try
            {
                throw numberformatexception;
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
        }
        if (!flag2 || !flag)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        findViewById(0x7f0b01f7).setVisibility(0);
        j();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        findViewById(0x7f0b01f7).setVisibility(8);
        int j1;
        try
        {
            obj = findViewById(0x7f0b0201);
            i1 = mk.a(s).g();
        }
        catch (NumberFormatException numberformatexception3)
        {
            throw numberformatexception3;
        }
        if (i1 > 0)
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        ((View) (obj)).setVisibility(j1);
        obj = (Button)findViewById(0x7f0b01f5);
        if (flag)
        {
            j1 = 0x7f0e0177;
        } else
        {
            j1 = 0x7f0e0128;
        }
        try
        {
            ((Button) (obj)).setText(j1);
            findViewById(0x7f0b01f6).setVisibility(8);
            obj = findViewById(0x7f0b01f2);
        }
        catch (NumberFormatException numberformatexception4)
        {
            throw numberformatexception4;
        }
        if (flag1)
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        try
        {
            ((View) (obj)).setVisibility(j1);
            obj = findViewById(0x7f0b0160);
        }
        catch (NumberFormatException numberformatexception5)
        {
            throw numberformatexception5;
        }
        if (flag)
        {
            j1 = byte0;
        } else
        {
            j1 = 0;
        }
        ((View) (obj)).setVisibility(j1);
        invalidateOptionsMenu();
        G.notifyDataSetChanged();
        return;
    }

    public static void g(String s1)
    {
        GroupChatInfo groupchatinfo = o;
        if (groupchatinfo != null)
        {
            try
            {
                if (o.s.equals(s1))
                {
                    o.g();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        break MISSING_BLOCK_LABEL_34;
        s1;
        throw s1;
    }

    private void h()
    {
        ViewGroup viewgroup = (ViewGroup)findViewById(0x7f0b01f9);
        int i1;
        try
        {
            i1 = android.os.Build.VERSION.SDK_INT;
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
        if (i1 < 14)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        k = new Switch(this);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        k = new ToggleButton(this);
        ((CompoundButton)k).setOnCheckedChangeListener(x);
        viewgroup.addView(k);
        return;
    }

    static void h(GroupChatInfo groupchatinfo)
    {
        groupchatinfo.f();
    }

    private void h(String s1)
    {
        if (!App.i())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        a(0x7f0e02bf, 0x7f0e0353);
        Vector vector = new Vector();
        vector.add(s1);
        s1 = new we(this, s, null, vector, 13);
        com.whatsapp.App.c(s1);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        App.b(getBaseContext(), 0x7f0e0289, 0);
        g();
        return;
        s1;
        throw s1;
    }

    private void i()
    {
label0:
        {
label1:
            {
                int j1 = App.am;
                View view = m.getChildAt(0);
                if (view == null)
                {
                    break MISSING_BLOCK_LABEL_111;
                }
                int i1;
                try
                {
                    if (m.getWidth() <= m.getHeight())
                    {
                        break label0;
                    }
                    i1 = m.getFirstVisiblePosition();
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
                i1 = -D.getHeight() + 1;
            }
            try
            {
                D.offsetTopAndBottom(i1 - D.getTop());
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
        if (D.getTop() != 0)
        {
            D.offsetTopAndBottom(-D.getTop());
        }
    }

    static void i(GroupChatInfo groupchatinfo)
    {
        groupchatinfo.n();
    }

    private void i(String s1)
    {
        int i1 = App.am;
        int j1;
        int k1;
        boolean flag;
        try
        {
            if (j.a(this).equals(s1))
            {
                break MISSING_BLOCK_LABEL_160;
            }
            flag = App.i();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        j1 = s1.codePointCount(0, s1.length());
        k1 = com.whatsapp.au2.m;
        if (j1 <= k1)
        {
            try
            {
                p.setVisibility(0);
                n.setVisibility(8);
                Log.i((new StringBuilder()).append(H[18]).append(s1).toString());
                App.e(new x1(this, s, s1, null, 15, null));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_145;
            }
        }
        App.b(this, String.format(getString(0x7f0e040b), new Object[] {
            Integer.valueOf(com.whatsapp.au2.m)
        }), 0);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        App.b(getBaseContext(), 0x7f0e02ae, 0);
        return;
        s1;
        throw s1;
        s1;
        throw s1;
    }

    static Handler j(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.F;
    }

    private void j()
    {
        boolean flag;
        try
        {
            flag = App.aS();
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        if (!flag)
        {
            return;
        } else
        {
            runOnUiThread(new alv(this));
            return;
        }
    }

    private void j(String s1)
    {
        int i1 = App.am;
        if (B.containsKey(s1))
        {
            Vector vector = new Vector();
            boolean flag;
            try
            {
                vector.add(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_107;
            }
        }
        flag = App.i();
        if (flag)
        {
            a(0x7f0e02c1, 0x7f0e0353);
            vector = new Vector();
            vector.add(s1);
            s1 = new wh(this, s, null, vector, 28);
            try
            {
                App.f(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_107;
            }
        }
        App.b(getBaseContext(), 0x7f0e0289, 0);
        g();
    }

    private void k()
    {
        startActivity((new Intent(App.au.getApplicationContext(), Main.g())).putExtra(H[5], j.a).addFlags(0x24000000));
    }

    static void k(GroupChatInfo groupchatinfo)
    {
        groupchatinfo.k();
    }

    private void k(String s1)
    {
        if (!App.i())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        a(0x7f0e02c1, 0x7f0e0353);
        Vector vector = new Vector();
        vector.add(s1);
        s1 = new xf(this, s, null, vector, 90);
        App.a(s1);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        App.b(getBaseContext(), 0x7f0e0289, 0);
        return;
        s1;
        throw s1;
    }

    static ao9 l(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.v;
    }

    private void l()
    {
        boolean flag;
        try
        {
            flag = App.i();
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
            break MISSING_BLOCK_LABEL_43;
        }
        a(0x7f0e02c1, 0x7f0e0353);
        App.d(new xl(this, s, null, null, 14));
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        App.b(getBaseContext(), 0x7f0e0183, 0);
        return;
    }

    private void m()
    {
        Object obj = E.a();
        Intent intent = new Intent(H[12], android.provider.ContactsContract.Contacts.CONTENT_URI);
        try
        {
            intent.putExtra(H[11], ((String) (obj)));
            intent.setComponent(intent.resolveActivity(getPackageManager()));
            obj = intent.getComponent();
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
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        startActivityForResult(intent, 10);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        Log.i(H[10]);
        App.J();
        return;
    }

    static void m(GroupChatInfo groupchatinfo)
    {
        groupchatinfo.i();
    }

    static TextView n(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.k;
    }

    private void n()
    {
        Intent intent;
        if (!App.i())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        intent = (new Intent(App.au.getApplicationContext(), Main.g())).putExtra(H[4], j.a).addFlags(0x24000000);
        startActivity(intent);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        App.b(getBaseContext(), 0x7f0e0183, 0);
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        throw numberformatexception;
    }

    static ListView o(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.m;
    }

    private void o()
    {
label0:
        {
            int i1 = App.am;
            float f1;
            android.graphics.Bitmap bitmap;
            int j1;
            try
            {
                t.setVisibility(8);
                if (!a9g.a(j.a))
                {
                    break label0;
                }
                t.setVisibility(0);
                u.setVisibility(4);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw numberformatexception;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_119;
            }
        }
        j1 = getResources().getDimensionPixelSize(0x7f0a004b);
        f1 = getResources().getDimension(0x7f0a004a);
        bitmap = j.a(j1, f1, false);
        if (bitmap == null)
        {
            try
            {
                u.setImageBitmap(j.j());
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_111;
            }
        }
        u.setImageBitmap(bitmap);
        u.setVisibility(0);
    }

    private void p()
    {
        l.setText(com.whatsapp.util.c.b(j.a(this), this));
        Object obj;
        boolean flag;
        try
        {
            String s1 = com.whatsapp.util.q.h(this, com.whatsapp.App.c(Long.parseLong(j.M)));
            w.setText(getResources().getString(0x7f0e01be, new Object[] {
                s1
            }));
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.e((new StringBuilder()).append(H[13]).append(numberformatexception).toString());
            w.setText(getResources().getString(0x7f0e01be, new Object[] {
                getString(0x7f0e0458)
            }));
        }
        obj = j.x();
        try
        {
            flag = App.az.d(((String) (obj)));
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
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        r.setText(getString(0x7f0e01c0));
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        r.setText(getString(0x7f0e01bf, new Object[] {
            App.az.e(((String) (obj))).b()
        }));
        obj = findViewById(0x7f0b00b9);
        ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(new k3(this, ((View) (obj))));
        return;
    }

    static void p(GroupChatInfo groupchatinfo)
    {
        groupchatinfo.l();
    }

    static void q(GroupChatInfo groupchatinfo)
    {
        groupchatinfo.b();
    }

    static HashMap r(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.B;
    }

    static og s(GroupChatInfo groupchatinfo)
    {
        return groupchatinfo.E;
    }

    public void a()
    {
        y.clear();
        j = App.az.c(s);
        a(y, s);
        G.notifyDataSetChanged();
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
label0:
        {
label1:
            {
                if (s1 == null)
                {
                    break label1;
                }
                int i1;
                try
                {
                    if (!s1.equals((new StringBuilder()).append(App.k()).append(H[23]).toString()))
                    {
                        break label1;
                    }
                    G.notifyDataSetChanged();
                    i1 = App.am;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    throw s1;
                }
                if (i1 == 0)
                {
                    break label0;
                }
            }
            s1 = App.az.e(s1);
            if (s1 != null)
            {
                s1 = new zz(s1);
                og.a(y, s1);
                G.notifyDataSetChanged();
            }
        }
    }

    public void d(String s1)
    {
        if (mk.h(s1))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        Object obj = App.az.e(s1);
        if (obj != null)
        {
            obj = new z7(((og) (obj)));
            og.a(y, ((akx) (obj)));
            G.notifyDataSetChanged();
        }
        int i1 = App.am;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        try
        {
            if (s1.equals(s))
            {
                t.setVisibility(8);
                j.t();
                o();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        break MISSING_BLOCK_LABEL_90;
        s1;
        throw s1;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        int k1 = App.am;
        i1;
        JVM INSTR tableswitch 1 14: default 76
    //                   1 269
    //                   2 76
    //                   3 76
    //                   4 76
    //                   5 76
    //                   6 76
    //                   7 76
    //                   8 76
    //                   9 76
    //                   10 77
    //                   11 190
    //                   12 297
    //                   13 370
    //                   14 436;
           goto _L1 _L2 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L3:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = E;
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = intent.getData();
        if (obj != null)
        {
            Object obj1;
            boolean flag;
            try
            {
                App.az.a(intent.getData(), E);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_137;
            }
        }
        App.az.h(E);
        g();
        Conversation.h(E.a);
        if (k1 == 0) goto _L1; else goto _L8
_L8:
        Log.i((new StringBuilder()).append(H[14]).append(E).toString());
        if (k1 == 0) goto _L1; else goto _L4
_L4:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = E;
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        App.az.h(E);
        g();
        Conversation.h(E.a);
        if (k1 == 0) goto _L1; else goto _L9
_L9:
        try
        {
            Log.i((new StringBuilder()).append(H[16]).append(E).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L1; else goto _L2
_L2:
        if (j1 != -1) goto _L1; else goto _L10
_L10:
        obj1 = intent.getStringExtra(H[17]);
        h(((String) (obj1)));
        if (k1 == 0) goto _L1; else goto _L5
_L5:
        if (j1 != -1) goto _L1; else goto _L11
_L11:
        if (intent == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = intent.getBooleanExtra(H[15], false);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        t.setVisibility(0);
        u.setVisibility(4);
        qk.a(j, this);
        if (k1 == 0) goto _L1; else goto _L12
_L12:
        qk.a(intent, j, this, 13, this);
        if (k1 == 0) goto _L1; else goto _L6
_L6:
        com.whatsapp.qk.c().delete();
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = qk.b(j, this);
        if (!flag) goto _L1; else goto _L13
_L13:
        t.setVisibility(0);
        u.setVisibility(4);
        if (k1 == 0) goto _L1; else goto _L14
_L14:
        if (j1 != 0 || intent == null) goto _L1; else goto _L15
_L15:
        try
        {
            qk.a(intent, this);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L1; else goto _L7
_L7:
        o();
        return;
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
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
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
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        E = (og)((android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo()).targetView.getTag();
        c(menuitem.getItemId());
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        int i1;
        boolean flag1;
        boolean flag = false;
        int j1 = App.am;
        Log.i(H[6]);
        super.onCreate(bundle);
        ft.a(o.GROUP_INFO);
        requestWindowFeature(5L);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f03006e);
        s = getIntent().getStringExtra(H[9]);
        j = App.az.e(s);
        B.clear();
        a(y, s);
        m = getListView();
        G = new q4(this, this, y);
        Object obj = (LayoutInflater)getBaseContext().getSystemService(H[8]);
        Object obj1 = iz.a(((LayoutInflater) (obj)), 0x7f03006f, m, false);
        obj = iz.a(((LayoutInflater) (obj)), 0x7f030070, m, false);
        m.addFooterView(((View) (obj1)), null, false);
        m.addHeaderView(((View) (obj)), null, false);
        D = findViewById(0x7f0b00b9);
        D.setClickable(true);
        m.setOnScrollListener(new a_i(this));
        m.getViewTreeObserver().addOnGlobalLayoutListener(new or(this));
        m.setOnItemClickListener(new i9(this));
        a1g.a((TextView)findViewById(0x7f0b0122));
        a1g.a((TextView)findViewById(0x7f0b01fc));
        a1g.a((TextView)findViewById(0x7f0b0202));
        a1g.a((TextView)findViewById(0x7f0b01f8));
        ((View) (obj)).setClickable(false);
        ((View) (obj)).setFocusable(false);
        Object obj2 = new akl(this);
        View view = ((View) (obj1)).findViewById(0x7f0b01f2);
        try
        {
            flag1 = mk.e(s);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (flag1)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        view.setOnClickListener(((android.view.View.OnClickListener) (obj2)));
        view.setBackgroundResource(0x7f0205de);
        ((View) (obj)).findViewById(0x7f0b0121).setVisibility(8);
        q = (TextView)((View) (obj)).findViewById(0x7f0b01fd);
        ((View) (obj)).findViewById(0x7f0b01fb).setVisibility(8);
        w = (TextView)findViewById(0x7f0b01ee);
        r = (TextView)findViewById(0x7f0b01ef);
        obj2 = s;
        flag1 = j.l();
        if (!flag1)
        {
            try
            {
                flag1 = TextUtils.isEmpty(j.M);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_1046;
            }
        }
        flag1 = true;
_L1:
        App.a(((String) (obj2)), flag1);
        d();
        ((View) (obj1)).findViewById(0x7f0b01f5).setOnClickListener(new op(this));
        ((View) (obj1)).findViewById(0x7f0b01f6).setOnClickListener(new a1m(this));
        obj1 = new m0(this);
        ((View) (obj)).findViewById(0x7f0b0122).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        ((View) (obj)).findViewById(0x7f0b0123).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        ((View) (obj)).findViewById(0x7f0b01fe).setOnClickListener(new fu(this));
        u = (ImageView)findViewById(0x7f0b0109);
        obj1 = new m8(this);
        try
        {
            u.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
            t = findViewById(0x7f0b0108);
            o();
            m.setAdapter(G);
            registerForContextMenu(m);
            l = (TextView)findViewById(0x7f0b01ed);
            p();
            n = (ImageButton)findViewById(0x7f0b01f1);
            p = findViewById(0x7f0b01f0);
            n.setOnClickListener(new sm(this));
            A = (TextView)((View) (obj)).findViewById(0x7f0b0203);
            A.setText(getString(0x7f0e02c2, new Object[] {
                Integer.valueOf(Math.min(y.size(), au2.g)), Integer.valueOf(au2.g)
            }));
            com.whatsapp.util.y.a(s);
            obj1 = findViewById(0x7f0b0201);
            i1 = mk.a(s).g();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (i1 > 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        try
        {
            ((View) (obj1)).setVisibility(i1);
            obj1 = (TextView)findViewById(0x7f0b01f5);
            flag1 = com.whatsapp.mk.c(s);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (flag1)
        {
            i1 = 0x7f0e0177;
        } else
        {
            i1 = 0x7f0e0128;
        }
        try
        {
            ((TextView) (obj1)).setText(i1);
            obj1 = findViewById(0x7f0b0160);
            flag1 = com.whatsapp.mk.c(s);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        i1 = ((flag) ? 1 : 0);
        if (flag1)
        {
            i1 = 8;
        }
        try
        {
            ((View) (obj1)).setVisibility(i1);
            findViewById(0x7f0b01f6).setVisibility(8);
            flag1 = App.aS();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_928;
        }
        if (!com.whatsapp.mk.c(s))
        {
            break MISSING_BLOCK_LABEL_928;
        }
        ((View) (obj)).findViewById(0x7f0b01f7).setVisibility(0);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_940;
        }
        DialogToastActivity.g++;
        ((View) (obj)).findViewById(0x7f0b01f7).setVisibility(8);
        if (App.aS())
        {
            ((TextView)findViewById(0x7f0b01f8)).setOnClickListener(new l(this));
            h();
            a1e.g.a(i);
        }
        App.ah.a(C);
        App.b(this);
        if (bundle != null)
        {
            bundle = bundle.getString(H[7]);
            if (bundle != null)
            {
                try
                {
                    E = App.az.e(bundle);
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw bundle;
                }
            }
        }
        o = this;
        return;
        bundle;
        throw bundle;
        flag1 = false;
          goto _L1
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        view = (og)((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).targetView.getTag();
        if (view != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        try
        {
            flag = B.containsKey(((og) (view)).a);
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
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
            break MISSING_BLOCK_LABEL_149;
        }
        contextmenu.add(0, 2, 0, getString(0x7f0e0026));
        contextmenu.add(0, 3, 0, getString(0x7f0e0029));
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        contextmenu.add(0, 0, 0, getString(0x7f0e047d, new Object[] {
            view.z()
        }));
        flag = mk.e(s);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        contextmenu.add(0, 5, 0, getString(0x7f0e0358, new Object[] {
            view.z()
        }));
        flag = au2.k;
        if (flag)
        {
            try
            {
                flag = mk.b(s, ((og) (view)).a);
            }
            // Misplaced declaration of an exception variable
            catch (ContextMenu contextmenu)
            {
                throw contextmenu;
            }
            if (!flag)
            {
                contextmenu.add(0, 6, 0, getString(0x7f0e0028, new Object[] {
                    view.z()
                }));
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        contextmenu;
        try
        {
            throw contextmenu;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu) { }
        throw contextmenu;
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 50: // '2'
            atv atv1 = new atv(this);
            return new d9(this, 0x7f0e013e, App.az.c(j.a).a(this), atv1, com.whatsapp.au2.m, 0x7f0e03db, 0x7f0e02a8);

        case 1: // '\001'
            String s1 = getString(0x7f0e0129, new Object[] {
                j.a(this)
            });
            return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s1, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new alh(this)).setPositiveButton(0x7f0e010e, new h1(this)).create();

        case 2: // '\002'
            String s2 = getString(0x7f0e0178, new Object[] {
                j.a(this)
            });
            return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s2, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new af1(this)).setPositiveButton(0x7f0e0176, new vv(this)).create();

        case 3: // '\003'
            String s3 = getString(0x7f0e0150, new Object[] {
                j.a(this)
            });
            return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s3, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new pg(this)).setPositiveButton(0x7f0e02ba, new a1i(this)).create();

        case 6: // '\006'
            if (E != null)
            {
                String s4 = getString(0x7f0e035b, new Object[] {
                    E.a(this), j.a(this)
                });
                return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s4, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new t4(this)).setPositiveButton(0x7f0e02ba, new a94(this)).create();
            } else
            {
                return super.onCreateDialog(i1);
            }

        case 4: // '\004'
            Log.w(H[19]);
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0022).setNeutralButton(0x7f0e02ba, new aue(this)).create();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        try
        {
            if (mk.e(s))
            {
                menu.add(0, 1, 0, 0x7f0e002a).setIcon(0x7f0204fd).setShowAsAction(2);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        try
        {
            Log.i(H[22]);
            super.onDestroy();
            if (z != null)
            {
                z.cancel(true);
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        a1e.g.b(i);
        App.ah.b(C);
        App.a(this);
        v.a();
        com.whatsapp.util.y.c(s);
        o = null;
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 47
    //                   1: 32
    //                   16908332: 41;
           goto _L1 _L2 _L3
_L2:
        f();
        return true;
        menuitem;
        throw menuitem;
_L3:
        finish();
        return true;
_L1:
        return false;
    }

    public void onResume()
    {
        super.onResume();
        j();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            super.onSaveInstanceState(bundle);
            if (E != null)
            {
                bundle.putString(H[21], E.a);
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
        as = new String[25];
        obj = "k~O\004\r";
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
                obj = "zxD\030\007rr\016\003\006osN\036FzuT\003\007u8i$;^Dt5'IIe.!O";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "mxDD\turR\005\001\1778C\037\032hyRD\001osME\013txT\013\013o";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "k~O\004\rDbY\032\r";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "~xD5\017iyU\0327q\177D";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "~nI\0367|dO\037\030D|I\016";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "|dO\037\030D\177N\f\0074uR\017\tos";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "hsL\017\013osD5\002rr";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "wwY\005\035oII\004\016wwT\017\032";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "|\177D";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "|dO\037\030;\177N\f\0074uO\004\034~nTJ\033beT\017\005;uO\004\034zuTJ\004reTJ\013tcL\016HuyTJ\016tcN\016";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "k~O\004\r";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "zxD\030\007rr\016\003\006osN\036FzuT\003\007u8i$;^Dt";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "|dO\037\030x~A\036\001upOE\013isA\036\001tx\r\036\001vs\017\017\032iyRJ";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "|dO\037\030D\177N\f\0074dE\031\035wb\017\t\007ubA\t\034;xO\036HzrD\017\f;";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "re\177\030\rhsT";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "|dO\037\030D\177N\f\0074dE\031\035wb\017\031\003rf\017\t\007ubA\t\034;xO\036HzrD\017\f;";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "xyN\036\txb";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "|dO\037\030D\177N\f\0074uH\013\006|s\000\031\035y|E\t\034!";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "|dO\037\030x~A\036\001upOE\t\177r\000\017\020reT\003\006|6C\005\006owC\036R;wC\036\001m\177T\023HuyTJ\016tcN\016D;fR\005\nztL\023HowB\006\ro";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "|\177D";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "hsL\017\013osD5\002rr";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                obj = "|dO\037\030D\177N\f\0074rE\031\034iyY";
                byte0 = 21;
                i1 = 22;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "[e\016\035\000zbS\013\030k8N\017\034";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "|\177D";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                H = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 632
    //                   0 655
    //                   1 662
    //                   2 669
    //                   3 676;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_676;
_L3:
        byte byte1 = 104;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 27;
          goto _L9
_L5:
        byte1 = 22;
          goto _L9
_L6:
        byte1 = 32;
          goto _L9
        byte1 = 106;
          goto _L9
    }
}
