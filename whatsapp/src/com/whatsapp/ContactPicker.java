// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.ActivityManager;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.contact.b;
import com.whatsapp.fieldstats.l;
import com.whatsapp.fieldstats.o;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;
import com.whatsapp.util.x;
import e;
import f;
import g;
import h;
import j;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l;

// Referenced classes of package com.whatsapp:
//            VerifyMessageStoreActivity, wd, og, ao9, 
//            App, k, Conversation, aoc, 
//            u5, aoz, d2, tr, 
//            abl, ab8, ContactPickerHelp, zn, 
//            mk, k4, alj, w2, 
//            abx, abs, zz, z7, 
//            a9, a1d, Main, akn, 
//            i5, afd, ale, r9, 
//            a9f, zq, alo, rs, 
//            aff, a_x, ay, asl, 
//            ul, a8t, al8, lr, 
//            ft

public class ContactPicker extends VerifyMessageStoreActivity
    implements wd
{

    private static final og F;
    private static final og Q;
    private static boolean W;
    private static final String Y[];
    private static final og s;
    private boolean A;
    private ArrayList B;
    private com.actionbarsherlock.view.ActionMode.Callback C;
    private boolean D;
    private ao9 E;
    private ArrayList G;
    private Handler H;
    private og I;
    private ab8 J;
    private String K;
    private String L;
    private boolean M;
    private com.actionbarsherlock.view.MenuItem N;
    private ViewPager O;
    private ArrayList P;
    private ArrayList R;
    private ActionMode S;
    private boolean T;
    private String U;
    private boolean V;
    private String X;
    private final Object k = new Object();
    private boolean l;
    private boolean m;
    private String n;
    private String o;
    private boolean p;
    private byte q;
    private boolean r;
    private Set t;
    private ab8 u;
    private Intent v;
    private HashMap w;
    private ab8 x;
    private boolean y;
    private ArrayList z;

    public ContactPicker()
    {
        H = new Handler();
        t = new HashSet();
        G = null;
        n = "";
        X = null;
        U = null;
        P = new ArrayList();
        z = new ArrayList();
        B = new ArrayList();
        R = new ArrayList();
        E = new ao9();
    }

    static ActionMode a(ContactPicker contactpicker, ActionMode actionmode)
    {
        contactpicker.S = actionmode;
        return actionmode;
    }

    static String a(ContactPicker contactpicker, String s1)
    {
        contactpicker.o = s1;
        return s1;
    }

    static HashMap a(ContactPicker contactpicker, HashMap hashmap)
    {
        contactpicker.w = hashmap;
        return hashmap;
    }

    static boolean a(ContactPicker contactpicker)
    {
        return contactpicker.p;
    }

    static boolean a(ContactPicker contactpicker, og og1)
    {
        return contactpicker.a(og1);
    }

    private boolean a(og og1)
    {
        int i1;
        boolean flag;
        flag = false;
        i1 = App.am;
        boolean flag1;
        try
        {
            Log.i((new StringBuilder()).append(Y[29]).append(og1.a).toString());
            flag1 = b(og1);
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            throw og1;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        String s1;
        boolean flag2;
        try
        {
            flag2 = App.C(og1.a);
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            throw og1;
        }
        if (flag2) goto _L1; else goto _L3
_L3:
        s1 = og1.a;
        boolean flag3;
        try
        {
            I = og1;
            flag3 = T;
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            try
            {
                throw og1;
            }
            // Misplaced declaration of an exception variable
            catch (og og1) { }
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
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        flag3 = m;
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        if (og.e(K))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        showDialog(0);
        return true;
label0:
        {
            try
            {
                if (!V)
                {
                    break label0;
                }
                Log.e(Y[27]);
                setResult(-1, App.az.a(og1, true));
                finish();
            }
            // Misplaced declaration of an exception variable
            catch (og og1)
            {
                throw og1;
            }
            return true;
        }
        if (G == null) goto _L5; else goto _L4
_L4:
        v = new Intent(this, com/whatsapp/Conversation);
        v.putExtra(Y[37], s1);
        v.putExtra(Y[30], q);
        v.putExtra(Y[28], true);
        v.putExtra(Y[31], getIntent().getBooleanExtra(Y[43], false));
        v.putParcelableArrayListExtra(Y[39], G);
        v.addFlags(0x14000000);
        boolean flag4 = getIntent().getBooleanExtra(Y[26], false);
        flag = flag4;
        if (!flag4)
        {
            og1 = G.iterator();
            flag = flag4;
            do
            {
                if (!og1.hasNext())
                {
                    break;
                }
                if (c1.c((Uri)og1.next()) == 1)
                {
                    continue;
                }
                if (i1 == 0)
                {
                    break MISSING_BLOCK_LABEL_850;
                }
                flag = true;
            } while (i1 == 0);
        }
_L8:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            showDialog(1);
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            throw og1;
        }
        if (i1 == 0) goto _L1; else goto _L6
_L6:
        Conversation.ae = true;
        startActivity(v);
        finish();
        return true;
_L5:
        og1 = n;
        if (og1 == null)
        {
            break MISSING_BLOCK_LABEL_602;
        }
        int j1 = n.length();
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_602;
        }
        boolean flag5;
        try
        {
            v = new Intent(this, com/whatsapp/Conversation);
            v.putExtra(Y[24], s1);
            v.putExtra(Y[41], q);
            v.putExtra(Y[35], n);
            v.putExtra(Y[34], true);
            og1 = v;
            s1 = Y[44];
            flag5 = m;
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            throw og1;
        }
        if (!flag5)
        {
            flag = true;
        }
        og1.putExtra(s1, flag);
        v.addFlags(0x14000000);
        flag = m;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            showDialog(1);
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            throw og1;
        }
        if (i1 == 0) goto _L1; else goto _L7
_L7:
        Conversation.ae = true;
        startActivity(v);
        finish();
        return true;
        og1;
        try
        {
            throw og1;
        }
        // Misplaced declaration of an exception variable
        catch (og og1) { }
        throw og1;
        og1;
        throw og1;
label1:
        {
            try
            {
                if (X == null)
                {
                    break label1;
                }
                v = new Intent(this, com/whatsapp/Conversation);
                v.putExtra(Y[40], s1);
                v.putExtra(Y[33], X);
                v.putExtra(Y[38], U);
                v.putExtra(Y[45], q);
                v.putExtra(Y[25], true);
                v.addFlags(0x14000000);
                showDialog(1);
            }
            // Misplaced declaration of an exception variable
            catch (og og1)
            {
                throw og1;
            }
            return true;
        }
label2:
        {
            try
            {
                if (!A)
                {
                    break label2;
                }
                v = new Intent();
                v.putExtra(Y[42], s1);
                showDialog(2);
            }
            // Misplaced declaration of an exception variable
            catch (og og1)
            {
                throw og1;
            }
            return true;
        }
label3:
        {
            try
            {
                if (!p)
                {
                    break label3;
                }
                v = new Intent();
                v.putExtra(Y[36], s1);
                showDialog(3);
            }
            // Misplaced declaration of an exception variable
            catch (og og1)
            {
                throw og1;
            }
            return true;
        }
        og1 = new Intent();
        og1.putExtra(Y[32], s1);
        setResult(-1, og1);
        finish();
        return true;
        flag = true;
          goto _L8
    }

    static void b(ContactPicker contactpicker)
    {
        contactpicker.i();
    }

    static void b(ContactPicker contactpicker, String s1)
    {
        contactpicker.g(s1);
    }

    private static boolean b(og og1)
    {
        return Y[17].equals(og1.a);
    }

    static void c(ContactPicker contactpicker)
    {
        contactpicker.o();
    }

    private void c(boolean flag)
    {
label0:
        {
label1:
            {
                int i1;
                try
                {
                    if (App.Z != null)
                    {
                        break label1;
                    }
                    com.whatsapp.App.b(this, 0x7f0e0191, 1);
                    i1 = App.am;
                }
                catch (SecurityException securityexception)
                {
                    throw securityexception;
                }
                if (i1 == 0)
                {
                    break label0;
                }
            }
            setSupportProgressBarIndeterminateVisibility(true);
            com.whatsapp.util.x.a(new aoc(this, flag));
        }
    }

    static boolean c(og og1)
    {
        return b(og1);
    }

    static boolean d(ContactPicker contactpicker)
    {
        return contactpicker.T;
    }

    static void e(ContactPicker contactpicker)
    {
        contactpicker.m();
    }

    static ViewPager f(ContactPicker contactpicker)
    {
        return contactpicker.O;
    }

    private void f()
    {
        Object obj;
        Object obj1;
        int i1;
        i1 = App.am;
        obj1 = u5.d();
        obj = new ArrayList();
        obj1 = ((ArrayList) (obj1)).iterator();
_L2:
        String s1;
        og og1;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (String)((Iterator) (obj1)).next();
        og1 = App.az.e(s1);
        if (og1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        dh dh = og1.z;
        if (dh == null)
        {
            try
            {
                if (s1.endsWith(Y[3]))
                {
                    ((ArrayList) (obj)).add(og1.a);
                }
            }
            catch (SecurityException securityexception1)
            {
                throw securityexception1;
            }
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((ArrayList) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (String)iterator.next();
            obj2 = App.az.b(((String) (obj2))).iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                og og2 = (og)((Iterator) (obj2)).next();
            } while (i1 == 0);
        } while (i1 == 0);
        if (((ArrayList) (obj)).size() > 0)
        {
            obj = (String)((ArrayList) (obj)).get(0);
            ArrayList arraylist = App.az.i();
            Iterator iterator1 = arraylist.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                og og3 = (og)iterator1.next();
                SecurityException securityexception;
                boolean flag;
                try
                {
                    if (og3.a == null)
                    {
                        continue;
                    }
                    flag = og3.a.startsWith(((String) (obj)));
                }
                catch (SecurityException securityexception2)
                {
                    throw securityexception2;
                }
                if (!flag);
            } while (i1 == 0);
            arraylist.clear();
        }
        return;
        securityexception;
        throw securityexception;
    }

    static og g()
    {
        return s;
    }

    static void g(ContactPicker contactpicker)
    {
        contactpicker.l();
    }

    private void g(String s1)
    {
        String s2;
        int i1;
        i1 = App.am;
        s2 = s1;
        if (s1 != null)
        {
            s2 = s1.toLowerCase();
        }
        s1 = ((String) (k));
        s1;
        JVM INSTR monitorenter ;
        z.clear();
        B.clear();
        R.clear();
        if (!T && !D) goto _L2; else goto _L1
_L1:
        Iterator iterator = P.iterator();
_L4:
        og og1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og1 = (og)iterator.next();
        boolean flag;
        if (og1.z == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = og1.k();
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = og1.d(s2);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = t.contains(og1.a);
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        B.add(og1);
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (i1 == 0) goto _L5; else goto _L2
_L2:
        flag = M;
        if (!flag) goto _L7; else goto _L6
_L6:
        iterator = P.iterator();
_L9:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og1 = (og)iterator.next();
        if (!App.ah.v(og1.a))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = og1.d(s2);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        z.add(og1);
        if (i1 == 0) goto _L9; else goto _L8
_L8:
        if (i1 == 0) goto _L5; else goto _L7
_L7:
        iterator = P.iterator();
_L10:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og1 = (og)iterator.next();
        if (!og1.d(s2))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = og1.k();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        flag = og1.p();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        flag = og1.d(s2);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        z.add(og1);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        flag = App.ah.v(og1.a);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        flag = App.ah.y(og1.a);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        z.add(og1);
        if (og1.z != null)
        {
            B.add(og1);
        }
        if (!og1.k())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = og1.d(s2);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        R.add(og1);
        if (i1 == 0) goto _L10; else goto _L5
_L5:
        s1;
        JVM INSTR monitorexit ;
        Collections.sort(z, new d2(getApplicationContext()));
        Collections.sort(B, new tr(getApplicationContext()));
        Collections.sort(R, new tr(getApplicationContext()));
        if (z.size() == 0)
        {
            s1 = new og(Y[0]);
            z.add(s1);
        }
        if (B.size() == 0)
        {
            s1 = new og(Y[1]);
            B.add(s1);
        }
        if (R.size() == 0)
        {
            s1 = new og(Y[2]);
            R.add(s1);
        }
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        s1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
    }

    private int h(String s1)
    {
        int i1 = App.am;
        boolean flag;
        q = -1;
        flag = s1.startsWith(Y[11]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        q = 2;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        flag = s1.startsWith(Y[15]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        q = 3;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        flag = s1.startsWith(Y[12]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        q = 1;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        flag = s1.startsWith(Y[14]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        q = 4;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        try
        {
            if (s1.startsWith(Y[13]))
            {
                q = 0;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        return q;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
    }

    private void h()
    {
        ActionMode actionmode = S;
        if (actionmode == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        SecurityException securityexception;
        int i1;
        try
        {
            i1 = w.size();
        }
        catch (SecurityException securityexception1)
        {
            try
            {
                throw securityexception1;
            }
            catch (SecurityException securityexception2)
            {
                throw securityexception2;
            }
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        S.finish();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        S.setTitle(String.format(App.j.a(0x7f0d001e, w.size()), new Object[] {
            Integer.valueOf(w.size())
        }));
        return;
        securityexception;
        throw securityexception;
    }

    static void h(ContactPicker contactpicker)
    {
        contactpicker.f();
    }

    private void i()
    {
        u.notifyDataSetChanged();
        J.notifyDataSetChanged();
        x.notifyDataSetChanged();
    }

    static void i(ContactPicker contactpicker)
    {
        contactpicker.h();
    }

    static ab8 j(ContactPicker contactpicker)
    {
        return contactpicker.J;
    }

    static og k()
    {
        return Q;
    }

    static boolean k(ContactPicker contactpicker)
    {
        return contactpicker.r;
    }

    static ArrayList l(ContactPicker contactpicker)
    {
        return contactpicker.B;
    }

    private void l()
    {
        startActivity(new Intent(this, com/whatsapp/ContactPickerHelp));
    }

    static og m(ContactPicker contactpicker)
    {
        return contactpicker.I;
    }

    private void m()
    {
        int i1 = App.am;
        z.clear();
        B.clear();
        R.clear();
        if (T) goto _L2; else goto _L1
_L1:
        boolean flag = D;
        if (!flag) goto _L3; else goto _L2
_L2:
        Iterator iterator = P.iterator();
_L5:
        og og1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og1 = (og)iterator.next();
        flag = t.contains(og1.a);
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = og1.k();
        if (!flag)
        {
            try
            {
                if (og1.z != null)
                {
                    B.add(og1);
                }
            }
            catch (SecurityException securityexception1)
            {
                throw securityexception1;
            }
        }
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        if (i1 == 0) goto _L6; else goto _L3
_L3:
        try
        {
            flag = M;
        }
        catch (SecurityException securityexception2)
        {
            throw securityexception2;
        }
        if (!flag) goto _L8; else goto _L7
_L7:
        Iterator iterator1 = P.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            og og2 = (og)iterator1.next();
            SecurityException securityexception;
            String s1;
            boolean flag1;
            try
            {
                if (App.ah.v(og2.a))
                {
                    z.add(og2);
                }
            }
            catch (SecurityException securityexception3)
            {
                throw securityexception3;
            }
        } while (i1 == 0);
        if (i1 == 0) goto _L6; else goto _L8
_L8:
        iterator1 = P.iterator();
_L9:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        og2 = (og)iterator1.next();
        flag1 = og2.k();
        if (!flag1)
        {
            try
            {
                if (og2.z != null)
                {
                    B.add(og2);
                }
            }
            // Misplaced declaration of an exception variable
            catch (SecurityException securityexception4)
            {
                throw securityexception4;
            }
        }
        flag1 = og2.k();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        flag1 = og2.p();
        if (!flag1)
        {
            try
            {
                if (og2.n != null)
                {
                    R.add(og2);
                }
            }
            // Misplaced declaration of an exception variable
            catch (SecurityException securityexception4)
            {
                throw securityexception4;
            }
        }
        flag1 = og2.k();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        flag1 = og2.p();
        if (flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = og2.n;
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        z.add(og2);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (App.ah.v(og2.a))
            {
                z.add(og2);
            }
        }
        // Misplaced declaration of an exception variable
        catch (SecurityException securityexception4)
        {
            throw securityexception4;
        }
        if (i1 == 0) goto _L9; else goto _L6
_L6:
        Collections.sort(z, new d2(getApplicationContext()));
        Collections.sort(B, new tr(getApplicationContext()));
        Collections.sort(R, new tr(getApplicationContext()));
        flag1 = V;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        flag1 = A;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        flag1 = r;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        flag1 = p;
        if (!flag1)
        {
            try
            {
                if (!B.isEmpty())
                {
                    getSupportActionBar().setSubtitle(String.format(App.j.a(0x7f0d001c, B.size()), new Object[] {
                        Integer.valueOf(B.size())
                    }));
                }
            }
            // Misplaced declaration of an exception variable
            catch (SecurityException securityexception4)
            {
                throw securityexception4;
            }
        }
        try
        {
            if (z.size() == 0)
            {
                z.add(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (SecurityException securityexception4)
        {
            throw securityexception4;
        }
        try
        {
            if (B.size() == 0)
            {
                B.add(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (SecurityException securityexception4)
        {
            throw securityexception4;
        }
        try
        {
            if (R.size() == 0)
            {
                R.add(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (SecurityException securityexception4)
        {
            throw securityexception4;
        }
        flag1 = T;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        flag1 = D;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        flag1 = M;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        flag1 = V;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        flag1 = A;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        SecurityException securityexception4;
        try
        {
            flag1 = r;
        }
        catch (SecurityException securityexception5)
        {
            try
            {
                throw securityexception5;
            }
            catch (SecurityException securityexception6)
            {
                throw securityexception6;
            }
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        if (o == null)
        {
            z.add(Q);
            z.add(F);
            B.add(Q);
            B.add(F);
            R.add(Q);
            R.add(F);
        }
        return;
        securityexception;
        throw securityexception;
        securityexception;
        throw securityexception;
        securityexception;
        throw securityexception;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
        securityexception4;
        throw securityexception4;
    }

    static ab8 n(ContactPicker contactpicker)
    {
        return contactpicker.x;
    }

    static og n()
    {
        return F;
    }

    private void o()
    {
        int i1 = App.am;
        ArrayList arraylist = P;
        arraylist;
        JVM INSTR monitorenter ;
        boolean flag = p;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        P = App.az.b();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        P.clear();
        flag = y;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        App.az.e(P);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        App.az.d(P);
        if (TextUtils.isEmpty(o))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        g(o);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        m();
        arraylist;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
    }

    static boolean o(ContactPicker contactpicker)
    {
        return contactpicker.M;
    }

    static ao9 p(ContactPicker contactpicker)
    {
        return contactpicker.E;
    }

    static String q(ContactPicker contactpicker)
    {
        return contactpicker.o;
    }

    static HashMap r(ContactPicker contactpicker)
    {
        return contactpicker.w;
    }

    static Intent s(ContactPicker contactpicker)
    {
        return contactpicker.v;
    }

    static ArrayList t(ContactPicker contactpicker)
    {
        return contactpicker.R;
    }

    static Handler u(ContactPicker contactpicker)
    {
        return contactpicker.H;
    }

    static boolean v(ContactPicker contactpicker)
    {
        return contactpicker.A;
    }

    static boolean w(ContactPicker contactpicker)
    {
        return contactpicker.D;
    }

    static boolean x(ContactPicker contactpicker)
    {
        return contactpicker.V;
    }

    static ab8 y(ContactPicker contactpicker)
    {
        return contactpicker.u;
    }

    public void a()
    {
        try
        {
            if (!W)
            {
                o();
                i();
                setSupportProgressBarIndeterminateVisibility(com.whatsapp.contact.b.b());
            }
            return;
        }
        catch (SecurityException securityexception)
        {
            throw securityexception;
        }
    }

    public void a(String s1)
    {
        s1 = App.az.e(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        s1 = new zn(s1);
        if (og.a(P, s1))
        {
            i();
        }
        return;
        s1;
        throw s1;
    }

    public void a(Collection collection)
    {
        i();
    }

    protected void b()
    {
        Intent intent;
        int i2;
        i2 = App.am;
        intent = getIntent();
        if (intent.getAction() == null) goto _L2; else goto _L1
_L1:
        boolean flag = intent.getAction().equals(Y[46]);
        if (!flag) goto _L2; else goto _L3
_L3:
        V = true;
        if (i2 == 0) goto _L4; else goto _L2
_L2:
        flag = intent.getBooleanExtra(Y[84], false);
        if (!flag) goto _L6; else goto _L5
_L5:
        y = true;
        if (i2 == 0) goto _L4; else goto _L6
_L6:
        flag = intent.getBooleanExtra(Y[73], false);
        if (!flag) goto _L8; else goto _L7
_L7:
        A = true;
        if (i2 == 0) goto _L4; else goto _L8
_L8:
        flag = intent.getBooleanExtra(Y[64], false);
        if (!flag) goto _L10; else goto _L9
_L9:
        getSupportActionBar().setTitle(0x7f0e00d2);
        p = true;
        if (i2 == 0) goto _L4; else goto _L10
_L10:
        try
        {
            flag = intent.getBooleanExtra(Y[62], false);
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        if (!flag) goto _L12; else goto _L11
_L11:
        T = true;
        m = false;
        String s1 = intent.getStringExtra(Y[60]);
        if (s1 != null)
        {
            int i1;
            try
            {
                i1 = s1.length();
            }
            catch (Exception exception2)
            {
                throw exception2;
            }
            if (i1 > 1)
            {
                String as[] = s1.split(",");
                int j2 = as.length;
                int j1 = 0;
                do
                {
                    if (j1 >= j2)
                    {
                        break;
                    }
                    String s2 = as[j1];
                    Object obj;
                    Exception exception;
                    try
                    {
                        if (s2.length() > 0)
                        {
                            t.add(s2);
                        }
                    }
                    catch (Exception exception3)
                    {
                        throw exception3;
                    }
                    j1++;
                } while (i2 == 0);
            }
        }
        if (i2 == 0) goto _L4; else goto _L12
_L12:
        obj = intent.getStringExtra(Y[80]);
        K = ((String) (obj));
        if (obj == null) goto _L14; else goto _L13
_L13:
        T = true;
        m = true;
        t = mk.a(K).b();
        if (i2 == 0) goto _L4; else goto _L14
_L14:
        flag = intent.getBooleanExtra(Y[90], false);
        if (!flag) goto _L16; else goto _L15
_L15:
        getSupportActionBar().setTitle(0x7f0e00d1);
        M = true;
        if (i2 == 0) goto _L4; else goto _L16
_L16:
        try
        {
            flag = intent.getBooleanExtra(Y[82], false);
        }
        catch (Exception exception5)
        {
            throw exception5;
        }
        if (!flag) goto _L18; else goto _L17
_L17:
        D = true;
        obj = intent.getStringExtra(Y[83]);
        if (obj != null)
        {
            try
            {
                j1 = ((String) (obj)).length();
            }
            catch (Exception exception6)
            {
                throw exception6;
            }
            if (j1 > 1)
            {
                obj = ((String) (obj)).split(",");
                j2 = obj.length;
                j1 = 0;
                do
                {
                    if (j1 >= j2)
                    {
                        break;
                    }
                    s2 = obj[j1];
                    Exception exception4;
                    try
                    {
                        if (s2.length() > 0)
                        {
                            t.add(s2);
                        }
                    }
                    catch (Exception exception7)
                    {
                        throw exception7;
                    }
                    j1++;
                } while (i2 == 0);
            }
        }
        if (i2 == 0) goto _L4; else goto _L18
_L18:
        try
        {
            flag = Y[76].equals(intent.getScheme());
        }
        catch (Exception exception8)
        {
            throw exception8;
        }
        if (!flag) goto _L20; else goto _L19
_L19:
        obj = intent.getData();
        if (obj == null) goto _L22; else goto _L21
_L21:
        flag = Y[65].equals(((Uri) (obj)).getHost());
        if (!flag) goto _L22; else goto _L23
_L23:
        Exception exception9;
        try
        {
            q = 0;
            n = ((Uri) (obj)).getQueryParameter(Y[49]);
            flag = TextUtils.isEmpty(n);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception9)
        {
            try
            {
                throw exception9;
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception9)
            {
                throw exception9;
            }
        }
        if (!flag) goto _L25; else goto _L24
_L24:
        com.whatsapp.App.b(getBaseContext(), 0x7f0e03d4, 0);
        finish();
_L47:
        return;
        exception;
        throw exception;
        exception;
        throw exception;
        exception;
        throw exception;
        exception;
        throw exception;
        exception;
        throw exception;
        exception;
        throw exception;
        exception;
        throw exception;
        exception;
        throw exception;
        exception4;
        throw exception4;
        exception4;
        throw exception4;
        exception4;
        throw exception4;
        exception4;
        throw exception4;
        exception9;
        throw exception9;
_L25:
        try
        {
            m = false;
            r = true;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception9)
        {
            throw exception9;
        }
        if (i2 == 0) goto _L26; else goto _L22
_L22:
        com.whatsapp.App.b(getBaseContext(), 0x7f0e03d4, 0);
        finish();
        return;
_L26:
        if (i2 == 0) goto _L4; else goto _L20
_L20:
        Object obj1 = intent.getExtras();
        if (obj1 == null) goto _L4; else goto _L27
_L27:
        try
        {
            obj1 = L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (obj1 != null) goto _L4; else goto _L28
_L28:
        m = true;
        r = true;
        if (getIntent().getType() != null)
        {
            break MISSING_BLOCK_LABEL_825;
        }
        Log.i((new StringBuilder()).append(Y[53]).append(intent.toString()).toString());
        flag = getIntent().hasExtra(Y[74]);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_781;
        }
        flag = getIntent().hasExtra(Y[92]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_791;
        }
        q = 0;
        if (i2 == 0)
        {
            break MISSING_BLOCK_LABEL_837;
        }
        try
        {
            com.whatsapp.App.b(getBaseContext(), 0x7f0e03d5, 0);
            finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        h(getIntent().getType());
        if (q == 0) goto _L30; else goto _L29
_L29:
        obj1 = App.a.getRecentTasks(4, 1).iterator();
_L48:
        if (!((Iterator) (obj1)).hasNext()) goto _L30; else goto _L31
_L31:
        Object obj2 = ((android.app.ActivityManager.RecentTaskInfo)((Iterator) (obj1)).next()).baseIntent;
        if (obj2 == null) goto _L33; else goto _L32
_L32:
        obj2 = ((Intent) (obj2)).getComponent();
        if (obj2 == null) goto _L33; else goto _L34
_L34:
        obj2 = ((ComponentName) (obj2)).getPackageName();
        if (Y[57].equals(obj2)) goto _L36; else goto _L35
_L35:
        flag = Y[50].equals(obj2);
        if (!flag) goto _L33; else goto _L36
_L36:
        try
        {
            Log.e(Y[66]);
            com.whatsapp.App.b(getBaseContext(), 0x7f0e0080, 0);
            finish();
            return;
        }
        catch (Exception exception10) { }
_L30:
        if (q != 0) goto _L38; else goto _L37
_L37:
        Object obj4;
        Object obj6;
        Object obj7;
        int k1;
        exception10 = getIntent().getStringExtra(Y[91]);
        long l2;
        try
        {
            if (!TextUtils.isEmpty(exception10))
            {
                n = (new StringBuilder()).append(n).append(exception10).append(Y[85]).toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception10)
        {
            throw exception10;
        }
        exception10 = getIntent().getStringExtra(Y[81]);
        if (exception10 != null)
        {
            byte abyte0[] = exception10.getBytes();
            if (abyte0.length > 4096)
            {
                exception10 = new String(abyte0, 0, 4096);
            }
            n = (new StringBuilder()).append(n).append(exception10).toString();
        }
        if (i2 == 0) goto _L4; else goto _L38
_L38:
        try
        {
            k1 = q;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception10)
        {
            throw exception10;
        }
        if (k1 != 4) goto _L40; else goto _L39
_L39:
        obj4 = Uri.parse(intent.getParcelableExtra(Y[70]).toString());
        Log.i((new StringBuilder()).append(Y[67]).append(((Uri) (obj4)).toString()).toString());
        k1 = -1;
        if (!((Uri) (obj4)).getScheme().equals(Y[89])) goto _L42; else goto _L41
_L41:
        abyte0 = new File(((Uri) (obj4)).getSchemeSpecificPart().substring(2));
        if (!abyte0.exists()) goto _L44; else goto _L43
_L43:
        exception10 = new FileInputStream(abyte0.getAbsolutePath());
        l2 = abyte0.length();
        k1 = (int)l2;
_L49:
        abyte0 = null;
        obj4 = exception10;
        exception10 = abyte0;
_L50:
        if (k1 > 0) goto _L46; else goto _L45
_L45:
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        com.whatsapp.App.b(getBaseContext(), 0x7f0e0080, 0);
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        finish();
        if (exception10 != null)
        {
            try
            {
                exception10.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception10)
            {
                Log.w((new StringBuilder()).append(Y[68]).append(exception10.toString()).toString());
            }
            return;
        }
          goto _L47
        exception10;
        throw exception10;
_L33:
        if (i2 == 0) goto _L48; else goto _L30
_L44:
        Log.e((new StringBuilder()).append(Y[61]).append(abyte0.getPath()).toString());
        exception10 = null;
          goto _L49
_L42:
        exception10 = App.d.openAssetFileDescriptor(((Uri) (obj4)), "r");
        if (exception10 != null)
        {
            break MISSING_BLOCK_LABEL_1449;
        }
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        App.f(this, (new StringBuilder()).append(Y[54]).append(obj4).toString());
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        finish();
        if (exception10 != null)
        {
            try
            {
                exception10.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception10)
            {
                Log.w((new StringBuilder()).append(Y[51]).append(exception10.toString()).toString());
            }
            return;
        }
          goto _L47
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        obj4 = exception10.createInputStream();
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        k1 = (int)exception10.getDeclaredLength();
          goto _L50
_L46:
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        byte abyte1[] = new byte[k1];
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        if (((FileInputStream) (obj4)).read(abyte1) <= 0)
        {
            break MISSING_BLOCK_LABEL_1778;
        }
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        obj4 = new String(abyte1);
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        Log.e((new StringBuilder()).append(Y[86]).append(((String) (obj4))).toString());
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        h h1 = new h();
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        e e1 = new e();
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        if (h1.a(((String) (obj4)), Y[48], e1))
        {
            break MISSING_BLOCK_LABEL_1715;
        }
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        Log.w((new StringBuilder()).append(Y[52]).append(((String) (obj4))).toString());
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        com.whatsapp.App.b(getBaseContext(), 0x7f0e045f, 0);
        if (exception10 != null)
        {
            try
            {
                exception10.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception10)
            {
                Log.w((new StringBuilder()).append(Y[69]).append(exception10.toString()).toString());
            }
            return;
        }
          goto _L47
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        q = 4;
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        X = ((String) (obj4));
        abyte0 = exception10;
        obj6 = exception10;
        obj7 = exception10;
        U = g.a((f)e1.f.get(0), 0, ((String) (obj4))).f.a;
        if (exception10 != null)
        {
            try
            {
                exception10.close();
            }
            catch (IOException ioexception)
            {
                Log.w((new StringBuilder()).append(Y[59]).append(ioexception.toString()).toString());
            }
            catch (l l1)
            {
                throw l1;
            }
        }
_L54:
        if (i2 == 0) goto _L4; else goto _L40
_L40:
        Object obj5;
        Exception exception11;
        IOException ioexception1;
        boolean flag1;
        try
        {
            G = intent.getParcelableArrayListExtra(Y[72]);
            exception10 = G;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            throw ioexception;
        }
        if (exception10 != null)
        {
            break MISSING_BLOCK_LABEL_1888;
        }
        exception10 = (Uri)intent.getExtras().getParcelable(Y[78]);
        try
        {
            Log.i((new StringBuilder()).append(Y[63]).append(exception10).toString());
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            throw ioexception;
        }
        if (exception10 == null)
        {
            break MISSING_BLOCK_LABEL_1883;
        }
        G = new ArrayList();
        G.add(exception10);
        if (i2 == 0)
        {
            break MISSING_BLOCK_LABEL_1978;
        }
        Log.i((new StringBuilder()).append(Y[79]).append(G.size()).toString());
        exception10 = G.iterator();
        do
        {
            if (!exception10.hasNext())
            {
                break;
            }
            abyte0 = (Uri)exception10.next();
            Log.i((new StringBuilder()).append(Y[93]).append(abyte0).toString());
        } while (i2 == 0);
        if (G == null) goto _L52; else goto _L51
_L51:
        flag1 = G.isEmpty();
        if (!flag1) goto _L53; else goto _L52
_L52:
        try
        {
            Log.e((new StringBuilder()).append(Y[77]).append(intent.toString()).toString());
            com.whatsapp.App.b(getBaseContext(), 0x7f0e03d4, 0);
            finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception11)
        {
            throw exception11;
        }
        obj5;
        ioexception = null;
_L57:
        abyte0 = ioexception;
        Log.c(((Throwable) (obj5)));
        if (ioexception != null)
        {
            try
            {
                ioexception.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                Log.w((new StringBuilder()).append(Y[87]).append(ioexception.toString()).toString());
            }
        }
          goto _L54
        ioexception;
        abyte0 = null;
_L56:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception1)
            {
                Log.w((new StringBuilder()).append(Y[47]).append(ioexception1.toString()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                throw ioexception;
            }
        }
        throw ioexception;
        ioexception;
        throw ioexception;
_L53:
        try
        {
            if (G.size() > 10)
            {
                com.whatsapp.App.b(getBaseContext(), 0x7f0e03d6, 0);
                finish();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            throw ioexception;
        }
        ioexception = G.iterator();
        do
        {
            if (!ioexception.hasNext())
            {
                break;
            }
            Uri uri = (Uri)ioexception.next();
            try
            {
                if (uri.toString().contains(Y[55]))
                {
                    Log.e((new StringBuilder()).append(Y[88]).append(uri.toString()).toString());
                    com.whatsapp.App.b(getBaseContext(), 0x7f0e03d5, 0);
                    G = null;
                    finish();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                throw ioexception;
            }
        } while (i2 == 0);
        ioexception = G.iterator();
        do
        {
            if (!ioexception.hasNext())
            {
                break;
            }
            Object obj3 = (Uri)ioexception.next();
            Iterator iterator;
            boolean flag2;
            try
            {
                grantUriPermission(Y[75], ((Uri) (obj3)), 1);
            }
            catch (SecurityException securityexception)
            {
                Log.w((new StringBuilder()).append(Y[58]).append(securityexception).toString());
            }
        } while (i2 == 0);
        ioexception = getIntent().getStringExtra(Y[71]);
        if (!TextUtils.isEmpty(ioexception))
        {
            obj3 = new ArrayList(G.size());
            iterator = G.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ((ArrayList) (obj3)).add(((Uri)iterator.next()).buildUpon().appendQueryParameter(Y[56], ioexception).build());
            } while (i2 == 0);
            G = ((ArrayList) (obj3));
        }
_L4:
        try
        {
            flag2 = V;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            try
            {
                throw ioexception;
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                throw ioexception;
            }
        }
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_2493;
        }
        if (A)
        {
            break MISSING_BLOCK_LABEL_2493;
        }
        flag2 = r;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_2581;
        }
        ioexception = getSupportActionBar();
        ioexception.setNavigationMode(2);
        ioexception.addTab(ioexception.newTab().setIcon(0x7f020615).setTabListener(new alj(this, 0)));
        ioexception.addTab(ioexception.newTab().setIcon(0x7f0204f9).setTabListener(new alj(this, 1)));
        ioexception.addTab(ioexception.newTab().setIcon(0x7f0205e2).setTabListener(new alj(this, 2)));
        o();
        ioexception = new w2(this, null);
        O = (ViewPager)findViewById(0x7f0b012d);
        O.setOffscreenPageLimit(3);
        O.setAdapter(ioexception);
        O.setOnPageChangeListener(new abx(this));
        u = new ab8(this, this, z);
        J = new abs(this, this, B);
        x = new abs(this, this, R);
        l = App.u(this);
        com.whatsapp.App.b(this);
        return;
        ioexception;
        if (true) goto _L56; else goto _L55
_L55:
        iterator;
        ioexception = ((IOException) (obj6));
          goto _L57
        iterator;
        ioexception = null;
          goto _L57
        iterator;
        ioexception = ((IOException) (obj7));
          goto _L57
    }

    public void b(String s1)
    {
    }

    public void c(String s1)
    {
        s1 = App.az.e(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        s1 = new zz(s1);
        if (og.a(P, s1))
        {
            i();
        }
        return;
        s1;
        throw s1;
    }

    protected void d()
    {
        try
        {
            i();
            W = false;
            if (App.u(this) != l)
            {
                l = App.u(this);
                a();
            }
            return;
        }
        catch (SecurityException securityexception)
        {
            throw securityexception;
        }
    }

    public void d(String s1)
    {
        s1 = App.az.e(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        s1 = new z7(s1);
        if (og.a(P, s1))
        {
            i();
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

    public boolean j()
    {
        ActionMode actionmode;
        try
        {
            actionmode = S;
        }
        catch (SecurityException securityexception)
        {
            throw securityexception;
        }
        if (actionmode != null)
        {
            return false;
        }
        try
        {
            if (C == null)
            {
                C = new a9(this);
            }
        }
        catch (SecurityException securityexception1)
        {
            throw securityexception1;
        }
        i();
        S = startActionMode(C);
        return true;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 1 1: default 20
    //                   1 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        c(false);
        if (App.am == 0) goto _L1; else goto _L3
_L3:
        Log.i(Y[16]);
        return;
        intent;
        throw intent;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        obj = (og)((ListView)O.findViewWithTag(Integer.valueOf(O.getCurrentItem()))).getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
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
            break MISSING_BLOCK_LABEL_99;
        }
        com.whatsapp.App.b(getBaseContext(), 0x7f0e02ad, 0);
        i1 = App.am;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        showDialog(107);
        com.whatsapp.util.x.a(new a1d(this, ((og) (obj))));
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        ActionBar actionbar;
        int i1;
        i1 = App.am;
        super.onCreate(bundle);
        requestWindowFeature(5L);
        actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setTitle(0x7f0e04ae);
        setContentView(0x7f030034);
        Log.i(Y[5]);
        if (WhatsAppLibLoader.a(null)) goto _L2; else goto _L1
_L1:
        Log.i(Y[7]);
        finish();
_L4:
        return;
        bundle;
        throw bundle;
_L2:
label0:
        {
            int j1;
            try
            {
                if (App.Z == null)
                {
                    break label0;
                }
                j1 = App.f(this);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (j1 == 3)
            {
                break MISSING_BLOCK_LABEL_121;
            }
        }
        com.whatsapp.App.b(this, 0x7f0e0191, 1);
        startActivity(new Intent(this, com/whatsapp/Main));
        finish();
        return;
        boolean flag;
        try
        {
            setSupportProgressBarIndeterminateVisibility(com.whatsapp.contact.b.b());
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        L = getIntent().getStringExtra(Y[4]);
        if (App.ah.y())
        {
            break; /* Loop/switch isn't completed */
        }
        W = true;
        bundle = Environment.getExternalStorageState();
        flag = bundle.equals(Y[8]);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        flag = bundle.equals(Y[6]);
        if (!flag)
        {
            try
            {
                showDialog(107);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        e();
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        try
        {
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        bundle;
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        throw bundle;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        obj = (og)((ListView)view).getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        boolean flag;
        try
        {
            flag = App.C(((og) (obj)).a);
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        if (!flag)
        {
            return;
        } else
        {
            contextmenu.add(0, 0, 0, String.format(getString(0x7f0e005f), new Object[] {
                ((og) (obj)).n
            }));
            super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
            return;
        }
    }

    protected Dialog onCreateDialog(int i1)
    {
        int j1 = App.am;
        i1;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 70
    //                   1: 176
    //                   2: 459
    //                   3: 585
    //                   4: 674
    //                   107: 742;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return super.onCreateDialog(i1);
_L2:
        String s1 = getString(0x7f0e02e3, new Object[] {
            I.a(this), App.az.c(K).a(this)
        });
        return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s1, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new akn(this)).setPositiveButton(0x7f0e02ba, new i5(this)).setOnCancelListener(new afd(this)).create();
_L3:
        String s2;
        boolean flag;
        try
        {
            flag = I.k();
        }
        catch (SecurityException securityexception)
        {
            try
            {
                throw securityexception;
            }
            catch (SecurityException securityexception1)
            {
                throw securityexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        if (G == null) goto _L9; else goto _L8
_L8:
        i1 = G.size();
        if (i1 > 1)
        {
            s2 = String.format(App.j.a(0x7f0d000e, G.size()), new Object[] {
                Integer.valueOf(G.size()), I.a(this)
            });
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_384;
            }
        }
_L9:
        s2 = getString(0x7f0e01ae, new Object[] {
            I.a(this)
        });
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        if (G == null) goto _L11; else goto _L10
_L10:
        i1 = G.size();
        if (i1 > 1)
        {
            s2 = String.format(App.j.a(0x7f0d0008, G.size()), new Object[] {
                Integer.valueOf(G.size()), I.a(this)
            });
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_384;
            }
        }
_L11:
        s2 = getString(0x7f0e00c3, new Object[] {
            I.a(this)
        });
        return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s2, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new ale(this)).setPositiveButton(0x7f0e02ba, new r9(this)).setOnCancelListener(new a9f(this)).create();
        SecurityException securityexception2;
        securityexception2;
        throw securityexception2;
_L4:
        if (!I.k()) goto _L13; else goto _L12
_L12:
        String s3 = getString(0x7f0e01ac, new Object[] {
            I.a(this)
        });
        if (j1 == 0) goto _L14; else goto _L13
_L13:
        s3 = getString(0x7f0e00c2, new Object[] {
            I.a(this)
        });
_L14:
        return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s3, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new zq(this)).setPositiveButton(0x7f0e02ba, new alo(this)).setOnCancelListener(new rs(this)).create();
_L5:
        String s4 = getString(0x7f0e01ad, new Object[] {
            I.a(this)
        });
        return (new android.app.AlertDialog.Builder(this)).setMessage(com.whatsapp.util.c.b(s4, getBaseContext())).setCancelable(true).setNegativeButton(0x7f0e007b, new aff(this)).setPositiveButton(0x7f0e02ba, new a_x(this)).setOnCancelListener(new ay(this)).create();
_L6:
        return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e009d, new Object[] {
            getString(0x7f0e03c5)
        })).setCancelable(true).setNegativeButton(0x7f0e007b, new asl(this)).setPositiveButton(0x7f0e03c5, new ul(this)).create();
_L7:
        ProgressDialog progressdialog = new ProgressDialog(this);
        progressdialog.setMessage(getString(0x7f0e0353));
        progressdialog.setIndeterminate(true);
        progressdialog.setCancelable(false);
        return progressdialog;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        Resources resources = getResources();
        String s1 = getString(0x7f0e0247);
        if (!P.isEmpty())
        {
            View view = al8.a(this, getSherlock(), new a8t(this));
            try
            {
                N = menu.add(0, 4, 0, 0x7f0e0366).setActionView(view).setIcon(0x7f020517);
                N.setShowAsAction(10);
                N.setOnActionExpandListener(new lr(this));
                if (!TextUtils.isEmpty(L))
                {
                    N.expandActionView();
                    al8.a(view, L, true);
                    L = null;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        menu.add(0, 1, 0, 0x7f0e043f).setIcon(0x7f020550);
        menu.add(0, 2, 0, 0x7f0e023e).setIcon(0x7f02053d);
        menu.add(0, 0, 0, s1).setIcon(resources.getDrawable(0x7f02054b));
        menu.add(0, 3, 0, 0x7f0e03af).setIcon(0x7f020542);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        Log.i(Y[18]);
        super.onDestroy();
        App.a(this);
        E.a();
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        int i1 = App.am;
        menuitem.getItemId();
        JVM INSTR lookupswitch 6: default 214
    //                   0: 68
    //                   1: 180
    //                   2: 78
    //                   3: 202
    //                   4: 195
    //                   16908332: 208;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break MISSING_BLOCK_LABEL_214;
_L2:
        c(true);
        return true;
        menuitem;
        throw menuitem;
_L4:
label0:
        {
            menuitem = new Intent(Y[23], android.provider.ContactsContract.Contacts.CONTENT_URI);
            try
            {
                menuitem.setComponent(menuitem.resolveActivity(getPackageManager()));
                if (menuitem.getComponent() == null)
                {
                    break label0;
                }
                startActivity(menuitem);
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                throw menuitem;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_214;
            }
        }
        menuitem = getPackageManager().getLaunchIntentForPackage(Y[22]);
        if (menuitem != null) goto _L9; else goto _L8
_L8:
        App.aO();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_214;
        }
_L9:
        try
        {
            startActivity(menuitem);
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.MenuItem menuitem)
        {
            try
            {
                throw menuitem;
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.MenuItem menuitem)
            {
                Log.w(Y[21]);
            }
            App.aO();
            return true;
        }
        return true;
        menuitem;
        throw menuitem;
_L3:
        ft.a(o.TELL_A_FRIEND, l.CONTACTPICKER_MENU);
        com.whatsapp.App.c(this);
        return true;
_L6:
        onSearchRequested();
        return true;
_L5:
        l();
        return true;
_L7:
        finish();
        return true;
        return true;
    }

    public void onPause()
    {
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        String s1 = bundle.getString(Y[10]);
        if (s1 != null)
        {
            try
            {
                I = App.az.e(s1);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        v = (Intent)bundle.getParcelable(Y[9]);
    }

    public void onResume()
    {
        try
        {
            super.onResume();
            if (!W)
            {
                d();
            }
            return;
        }
        catch (SecurityException securityexception)
        {
            throw securityexception;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            super.onSaveInstanceState(bundle);
            if (I != null)
            {
                bundle.putCharSequence(Y[20], I.a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (v != null)
            {
                bundle.putParcelable(Y[19], v);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    public boolean onSearchRequested()
    {
        try
        {
            if (N != null)
            {
                N.expandActionView();
            }
        }
        catch (SecurityException securityexception)
        {
            throw securityexception;
        }
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[94];
        obj = "HJ\025\031\036RFP\021\f";
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
                obj = "HJ\025\031\036RFP\021\f";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "HJ\025\031\036RFP\021\f";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "fV\026\003\027GQK\025\017V\013V\021\013";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "U@Y\006\034N";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "EJV\000\036EQH\035\034M@J[\034T@Y\000\032";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "KJM\032\013CAg\006\020";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "GGW\006\013OK_T\033S@\030\000\020\006KY\000\026P@\030\030\026DWY\006\026CV\030\031\026UVQ\032\030";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "KJM\032\013CA";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "OKL\021\021R";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "LL\\";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "GP\\\035\020";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "OHY\023\032";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "R@@\0";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "R@@\000P^\bN\027\036TA";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "PL\\\021\020";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "EJV\000\036EQH\035\034M@J[\rCVM\030\013\006FW\032\013GFLT\021IQ\030\025\033B@\\";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "HJ\025\031\036RFP\021\f";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "EJV\000\036EQH\035\034M@J[\033CVL\006\020_";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "OKL\021\021R";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "LL\\";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "EJV\000\036EQg\004\026EN]\006PIUL\035\020HV\027\007\006UQ]\031_EJV\000\036EQKT\036VU\030\027\020SI\\T\021IQ\030\022\020SK\\";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "EJUZ\036HAJ\033\026B\013[\033\021RD[\000\f";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "GK\\\006\020OA\026\035\021R@V\000QGFL\035\020H\013n=:q";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "LL\\";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "NDK+\fNDJ\021";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "UNQ\004 VW]\002\026CR";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "T@L\001\rH\005Q\032\013CKL";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "NDK+\fNDJ\021";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "EJV\000\036EQH\035\034M@J[\017OFS\021\033\006";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "QDg\000\006V@";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "UNQ\004 VW]\002\026CR";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "EJV\000\036EQ";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "PFY\006\033yVL\006";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "NDK+\fNDJ\021";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "UMY\006\032yHK\023";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "EJV\000\036EQ";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                obj = "LL\\";
                byte0 = 36;
                i1 = 37;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                obj = "PFY\006\033yKY\031\032";
                i1 = 38;
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "GK\\\006\020OA\026\035\021R@V\000QC]L\006\036\bvl&:gh";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "LL\\";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "QDg\000\006V@";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "EJV\000\036EQ";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "UNQ\004 VW]\002\026CR";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "EJV\022\026TH";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "QDg\000\006V@";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "GK\\\006\020OA\026\035\021R@V\000QGFL\035\020H\013{&:gq}+,njj <sq";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PEJV\000\036EQ\027\021\rTJJT";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "sq~YG";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "R@@\0";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "EJUZ\bNDL\007\032HA";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PEJV\000\036EQ\027\021\rTJJT";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "eJM\030\033\006KW\000_VDJ\007\032\006S{\025\rB\005^\035\023C\037\030";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "EJV\000\036EQH\035\034M@J[\013_U][\021SITT";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "EJV\000\036EQg\004\026EN]\006PUMY\006\032\tVL\006\032GH\027\022\033\033KM\030\023";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i1] = ((String) (obj));
                i1 = 55;
                obj = "IFL\021\013\013VL\006\032GH";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i1] = ((String) (obj));
                obj = "EDH\000\026IK";
                byte0 = 55;
                i1 = 56;
                break;

            case 55: // '7'
                as1[i1] = ((String) (obj));
                i1 = 57;
                obj = "EJUZ\025SB_\021\rUJ^\000QQMY\000\fGUH\022\026J@K\021\021B@J";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[i1] = ((String) (obj));
                i1 = 58;
                obj = "EJV\000\036EQH\035\034M@J[\017CWU\035\fULW\032_";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[i1] = ((String) (obj));
                i1 = 59;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PEJV\000\036EQ\027\021\rTJJT";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[i1] = ((String) (obj));
                i1 = 60;
                obj = "VDg\030\026UQ";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[i1] = ((String) (obj));
                i1 = 61;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PEJV\000\036EQ\027\022\026J@\030\020\020CVVS\013\006@@\035\fR\005";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[i1] = ((String) (obj));
                i1 = 62;
                obj = "EW]\025\013Cz_\006\020SU";
                byte0 = 61;
                break;

            case 61: // '='
                as1[i1] = ((String) (obj));
                i1 = 63;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PSWQT";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[i1] = ((String) (obj));
                i1 = 64;
                obj = "U@L+\030TJM\004 OFW\032";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[i1] = ((String) (obj));
                i1 = 65;
                obj = "U@V\020";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[i1] = ((String) (obj));
                i1 = 66;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PDD\\\022\026J@";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[i1] = ((String) (obj));
                i1 = 67;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PUQJ\021\036K\n";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[i1] = ((String) (obj));
                i1 = 68;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PEJV\000\036EQ\027\021\rTJJT";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[i1] = ((String) (obj));
                i1 = 69;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PEJV\000\036EQ\027\021\rTJJT";
                byte0 = 68;
                break;

            case 68: // 'D'
                as1[i1] = ((String) (obj));
                i1 = 70;
                obj = "GK\\\006\020OA\026\035\021R@V\000QC]L\006\036\bvl&:gh";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[i1] = ((String) (obj));
                i1 = 71;
                obj = "GK\\\006\020OA\026\035\021R@V\000QC]L\006\036\bq},+";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[i1] = ((String) (obj));
                i1 = 72;
                obj = "GK\\\006\020OA\026\035\021R@V\000QC]L\006\036\bvl&:gh";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[i1] = ((String) (obj));
                i1 = 73;
                obj = "@JJ\003\036TA";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[i1] = ((String) (obj));
                i1 = 74;
                obj = "GK\\\006\020OA\026\035\021R@V\000QC]L\006\036\bvm65cfl";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[i1] = ((String) (obj));
                i1 = 75;
                obj = "EJUZ\bNDL\007\036VU";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[i1] = ((String) (obj));
                i1 = 76;
                obj = "QMY\000\fGUH";
                byte0 = 75;
                break;

            case 75: // 'K'
                as1[i1] = ((String) (obj));
                i1 = 77;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021 SWQ\007PHPT\030_";
                byte0 = 76;
                break;

            case 76: // 'L'
                as1[i1] = ((String) (obj));
                i1 = 78;
                obj = "GK\\\006\020OA\026\035\021R@V\000QC]L\006\036\bvl&:gh";
                byte0 = 77;
                break;

            case 77: // 'M'
                as1[i1] = ((String) (obj));
                i1 = 79;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PSWQ\007_";
                byte0 = 78;
                break;

            case 78: // 'N'
                as1[i1] = ((String) (obj));
                i1 = 80;
                obj = "AL\\";
                byte0 = 79;
                break;

            case 79: // 'O'
                as1[i1] = ((String) (obj));
                i1 = 81;
                obj = "GK\\\006\020OA\026\035\021R@V\000QC]L\006\036\bq},+";
                byte0 = 80;
                break;

            case 80: // 'P'
                as1[i1] = ((String) (obj));
                i1 = 82;
                obj = "DIW\027\024yFW\032\013GFL";
                byte0 = 81;
                break;

            case 81: // 'Q'
                as1[i1] = ((String) (obj));
                i1 = 83;
                obj = "DIW\027\024CAg\030\026UQ";
                byte0 = 82;
                break;

            case 82: // 'R'
                as1[i1] = ((String) (obj));
                i1 = 84;
                obj = "EDT\030/OFS\021\r";
                byte0 = 83;
                break;

            case 83: // 'S'
                as1[i1] = ((String) (obj));
                i1 = 85;
                obj = "\006\b\030";
                byte0 = 84;
                break;

            case 84: // 'T'
                as1[i1] = ((String) (obj));
                i1 = 86;
                obj = "PFY\006\033\034";
                byte0 = 85;
                break;

            case 85: // 'U'
                as1[i1] = ((String) (obj));
                i1 = 87;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PEJV\000\036EQ\027\021\rTJJT";
                byte0 = 86;
                break;

            case 86: // 'V'
                as1[i1] = ((String) (obj));
                i1 = 88;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PIFL\021\013\013VL\006\032GH\030";
                byte0 = 87;
                break;

            case 87: // 'W'
                as1[i1] = ((String) (obj));
                i1 = 89;
                obj = "@LT\021";
                byte0 = 88;
                break;

            case 88: // 'X'
                as1[i1] = ((String) (obj));
                i1 = 90;
                obj = "CHY\035\023yMQ\007\013IWA";
                byte0 = 89;
                break;

            case 89: // 'Y'
                as1[i1] = ((String) (obj));
                i1 = 91;
                obj = "GK\\\006\020OA\026\035\021R@V\000QC]L\006\036\bvm65cfl";
                byte0 = 90;
                break;

            case 90: // 'Z'
                as1[i1] = ((String) (obj));
                i1 = 92;
                obj = "GK\\\006\020OA\026\035\021R@V\000QC]L\006\036\bq},+";
                byte0 = 91;
                break;

            case 91: // '['
                as1[i1] = ((String) (obj));
                i1 = 93;
                obj = "EJV\000\036EQH\035\034M@J[\fNDJ\021PSWQT";
                byte0 = 92;
                break;

            case 92: // '\\'
                as1[i1] = ((String) (obj));
                Y = as;
                Q = new og("");
                F = new og("");
                s = new og("");
                W = false;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 2188
    //                   0 2211
    //                   1 2218
    //                   2 2225
    //                   3 2232;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_2232;
_L3:
        byte byte1 = 127;
_L9:
        obj[j1] = (char)(byte1 ^ c2);
        j1++;
          goto _L8
_L4:
        byte1 = 38;
          goto _L9
_L5:
        byte1 = 37;
          goto _L9
_L6:
        byte1 = 56;
          goto _L9
        byte1 = 116;
          goto _L9
    }
}
