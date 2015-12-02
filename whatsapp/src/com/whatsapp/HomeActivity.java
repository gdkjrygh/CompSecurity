// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AsyncPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.notification.l;
import com.whatsapp.notification.p;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            DialogToastFragmentActivity, lk, es, a83, 
//            at, al8, yd, App, 
//            ConversationsFragment, a3n, CallsFragment, ContactsFragment, 
//            sf, a_n, asw, k, 
//            oh, ProfilePhotoReminder, wy, akk, 
//            u5, og, ChangeNumber, m7, 
//            akr, tk, aoz, Main, 
//            PagerSlidingTabStrip, s7, a9x, all, 
//            mk, afz, yw, SetStatus, 
//            Settings, Advanced, a8, o3, 
//            Voip, as, aq

public class HomeActivity extends DialogToastFragmentActivity
    implements lk, es
{

    private static final String z[];
    private TabsPager f;
    private Menu g;
    private ActionBar h;
    private View i;
    private MenuItem j;
    private wy k;
    private TextView l;
    private as m;
    private MenuItem n;
    private int o;
    private android.support.v4.view.ViewPager.SimpleOnPageChangeListener p;

    public HomeActivity()
    {
        p = new a83(this);
        m = new at(this);
    }

    static int a(HomeActivity homeactivity, int i1)
    {
        homeactivity.o = i1;
        return i1;
    }

    static Menu a(HomeActivity homeactivity)
    {
        return homeactivity.g;
    }

    private MenuItem a(Menu menu, aq aq)
    {
        aq = al8.a(this, getSherlock(), aq);
        menu = menu.add(0, 0x7f0b0019, 0, 0x7f0e0366).setActionView(aq).setIcon(0x7f020517);
        menu.setShowAsAction(10);
        menu.setOnActionExpandListener(new yd(this, aq));
        return menu;
    }

    private a3n a(int i1)
    {
        int j1 = App.am;
        Object obj = getSupportFragmentManager().getFragments();
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
label0:
            do
            {
                Fragment fragment;
label1:
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    fragment = (Fragment)((Iterator) (obj)).next();
                    if (i1 != 1)
                    {
                        break label1;
                    }
                    try
                    {
                        if (!(fragment instanceof ConversationsFragment))
                        {
                            break label1;
                        }
                        obj = (a3n)fragment;
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        throw illegalargumentexception;
                    }
                    return ((a3n) (obj));
                }
label2:
                {
                    if (i1 != 0)
                    {
                        break label2;
                    }
                    try
                    {
                        if (!(fragment instanceof CallsFragment))
                        {
                            break label2;
                        }
                        illegalargumentexception = (a3n)fragment;
                    }
                    catch (IllegalArgumentException illegalargumentexception1)
                    {
                        throw illegalargumentexception1;
                    }
                    return illegalargumentexception;
                }
                if (i1 != 2)
                {
                    continue;
                }
                try
                {
                    if (!(fragment instanceof ContactsFragment))
                    {
                        continue;
                    }
                    illegalargumentexception1 = (a3n)fragment;
                }
                catch (IllegalArgumentException illegalargumentexception2)
                {
                    throw illegalargumentexception2;
                }
                return illegalargumentexception1;
            } while (j1 == 0);
        }
        return null;
    }

    private void a()
    {
        sf.h();
        asw.a(new a_n(this, null), new Void[0]);
    }

    static void a(HomeActivity homeactivity, boolean flag)
    {
        homeactivity.b(flag);
    }

    static a3n b(HomeActivity homeactivity, int i1)
    {
        return homeactivity.a(i1);
    }

    private void b(DialogFragment dialogfragment)
    {
        try
        {
            if (getSupportFragmentManager().findFragmentByTag(dialogfragment.getClass().getName()) == null)
            {
                dialogfragment.show(getSupportFragmentManager(), dialogfragment.getClass().getName());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogFragment dialogfragment)
        {
            throw dialogfragment;
        }
    }

    static void b(HomeActivity homeactivity)
    {
        homeactivity.d();
    }

    private void b(boolean flag)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        if (!isFinishing())
        {
            showDialog(0);
        }
_L4:
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
_L2:
        flag = App.az.f().h().exists();
        if (flag) goto _L4; else goto _L3
_L3:
        int i1 = App.aP;
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        flag = ProfilePhotoReminder.j;
        if (flag) goto _L4; else goto _L6
_L6:
        if (!App.i()) goto _L4; else goto _L7
_L7:
        ProfilePhotoReminder.j = true;
        startActivity(new Intent(this, com/whatsapp/ProfilePhotoReminder));
        return;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    static int c(HomeActivity homeactivity)
    {
        return homeactivity.o;
    }

    private void c(DialogFragment dialogfragment)
    {
        App.P = true;
        App.au.ac();
        b(dialogfragment);
    }

    private void d()
    {
        int i1;
        int j1;
        i1 = 0;
        j1 = App.am;
_L2:
        akk akk1;
        if (i1 >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        akk1 = wy.a(k, i1);
        int k1 = akk1.a;
        if (k1 > 0)
        {
            IllegalArgumentException illegalargumentexception;
            try
            {
                akk1.c.setVisibility(0);
                akk1.c.setText(Integer.toString(akk1.a));
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_75;
            }
        }
        akk1.c.setVisibility(8);
        break MISSING_BLOCK_LABEL_75;
        illegalargumentexception;
        throw illegalargumentexception;
        i1++;
        if (j1 == 0) goto _L2; else goto _L1
_L1:
    }

    static void d(HomeActivity homeactivity)
    {
        homeactivity.e();
    }

    private void e()
    {
        int j1 = App.am;
        Iterator iterator = u5.f().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = App.az.e(((String) (obj)));
            int k1;
            try
            {
                k1 = ((og) (obj)).c;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            if (k1 > 0)
            {
                i1++;
            }
        } while (j1 == 0);
        wy.a(k, 1).a = i1;
        wy.a(k, 0).a = com.whatsapp.notification.l.d().a().size();
        d();
    }

    static void e(HomeActivity homeactivity)
    {
        homeactivity.a();
    }

    private void f()
    {
        int i1;
        boolean flag;
        try
        {
            if (sf.c())
            {
                break MISSING_BLOCK_LABEL_39;
            }
            flag = sf.a();
        }
        catch (InterruptedException interruptedexception)
        {
            try
            {
                throw interruptedexception;
            }
            catch (InterruptedException interruptedexception1)
            {
                try
                {
                    throw interruptedexception1;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        asw.a(new a_n(this, null), new Void[0]);
        i1 = App.am;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        b(sf.i());
        return;
        InterruptedException interruptedexception2;
        interruptedexception2;
        Thread.currentThread().interrupt();
        b(false);
        return;
    }

    private void g()
    {
        i.setVisibility(0);
        l.setText("");
    }

    private void h()
    {
        if (!ChangeNumber.f() && m7.a(this, false) != null)
        {
            ServiceExpirationWarningDialogFragment serviceexpirationwarningdialogfragment = new ServiceExpirationWarningDialogFragment();
            serviceexpirationwarningdialogfragment.setCancelable(false);
            serviceexpirationwarningdialogfragment.show(getSupportFragmentManager(), null);
        }
    }

    public void a(c4 c4)
    {
        i.setVisibility(8);
    }

    public void a(String s, long l1)
    {
        try
        {
            if (i.getVisibility() != 0)
            {
                i.setVisibility(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        l.setText(DateUtils.formatElapsedTime(l1 / 1000L));
    }

    public void a(String s, boolean flag)
    {
    }

    public void b()
    {
        e();
    }

    public void b(c4 c4)
    {
    }

    public void c(c4 c4)
    {
        akr.t();
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

    public void e(String s)
    {
        runOnUiThread(new tk(this));
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        int i1;
        i1 = App.am;
        int j1;
        try
        {
            Log.i(z[14]);
            if (App.u == 3)
            {
                a5.c(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            super.onCreate(bundle);
            requestWindowFeature(5L);
            setContentView(0x7f030073);
            setSupportProgressBarIndeterminateVisibility(false);
            bundle = App.Z;
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
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (!App.ah.y())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        j1 = App.f(this);
        if (j1 == 3)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        Log.i(z[13]);
        App.q(z[15]);
        startActivity(new Intent(this, com/whatsapp/Main));
        finish();
        return;
        boolean flag;
        App.k.stop();
        flag = App.au.aa();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        Log.w(z[11]);
        c(new DialogToastFragmentActivity.ClockWrongDialogFragment());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        flag = App.aU();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        Log.w(z[12]);
        c(new DialogToastFragmentActivity.SoftwareExpiredDialogFragment());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        try
        {
            if (App.a3())
            {
                b(new SoftwareAboutToExpireDialogFragment());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        h();
        f = (TabsPager)findViewById(0x7f0b012d);
        k = new wy(this, getSupportFragmentManager());
        f.setAdapter(k);
        f.setOffscreenPageLimit(3);
        h = getSupportActionBar();
        flag = z[16].equals(getIntent().getAction());
        if (flag)
        {
            try
            {
                f.setCurrentItem(0, false);
                o = 0;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_332;
            }
        }
        f.setCurrentItem(1, false);
        o = 1;
        bundle = (PagerSlidingTabStrip)findViewById(0x7f0b020c);
        bundle.setViewPager(f);
        bundle.setOnPageChangeListener(p);
        e();
        App.a(this);
        App.a(this);
        i = findViewById(0x7f0b014d);
        i.setOnClickListener(new s7(this));
        l = (TextView)findViewById(0x7f0b014e);
        f();
        return;
        bundle;
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        throw bundle;
        bundle;
        throw bundle;
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setTitle(getString(0x7f0e0354));
            progressdialog.setMessage(getString(0x7f0e0353));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 0: // '\0'
            a9x a9x1 = new a9x(this);
            return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0208).setMessage(getString(0x7f0e0206, new Object[] {
                getString(0x7f0e00c6)
            })).setCancelable(false).setPositiveButton(0x7f0e0207, a9x1).create();

        case 107: // 'k'
            ProgressDialog progressdialog1 = new ProgressDialog(this);
            progressdialog1.setMessage(getString(0x7f0e0353));
            progressdialog1.setIndeterminate(true);
            progressdialog1.setCancelable(false);
            return progressdialog1;

        case 121: // 'y'
            Log.w(z[8]);
            return all.a(this);

        case 120: // 'x'
            Log.w(z[9]);
            return all.e(this);

        case 119: // 'w'
            Log.w(z[6]);
            return all.a(this, false);

        case 117: // 'u'
            Log.w(z[10]);
            return all.c(this);

        case 118: // 'v'
            Log.w(z[7]);
            return all.f(this);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        Log.i(z[1]);
        super.onDestroy();
        App.b(this);
        App.b(this);
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        Log.i(z[17]);
        String s = intent.getStringExtra(z[19]);
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(s);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
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
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        flag = mk.c(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        App.k(s);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        App.d(s, true);
        x.a(new afz(this, s));
        s = intent.getStringExtra(z[18]);
        try
        {
            if (!TextUtils.isEmpty(s))
            {
                App.d(s, true);
                x.a(new yw(this, s));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        try
        {
            if (z[20].equals(intent.getAction()))
            {
                f.setCurrentItem(0, false);
                o = 0;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        int i1;
        try
        {
            i1 = menuitem.getItemId();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        switch (i1)
        {
        default:
            flag = false;
            // fall through

        case 2131427353: 
            return flag;

        case 2131427355: 
            startActivity(new Intent(this, com/whatsapp/SetStatus));
            return true;

        case 2131427354: 
            startActivity(new Intent(this, com/whatsapp/Settings));
            return true;

        case 2131427345: 
            finish();
            startActivity(new Intent(this, com/whatsapp/Advanced));
            return true;
        }
    }

    public void onPause()
    {
        Log.i(z[0]);
        super.onPause();
    }

    protected void onPrepareDialog(int i1, Dialog dialog)
    {
        int j1 = App.am;
        i1;
        JVM INSTR tableswitch 117 121: default 40
    //                   117 55
    //                   118 69
    //                   119 83
    //                   120 40
    //                   121 41;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        return;
_L5:
        ((AlertDialog)dialog).setMessage(all.d());
        if (j1 == 0) goto _L1; else goto _L2
_L2:
        ((AlertDialog)dialog).setMessage(all.a());
        if (j1 == 0) goto _L1; else goto _L3
_L3:
        ((AlertDialog)dialog).setMessage(all.c());
        if (j1 == 0) goto _L1; else goto _L4
_L4:
        ((AlertDialog)dialog).setMessage(all.b());
        return;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        int i1 = App.am;
        int j1;
        super.onPrepareOptionsMenu(menu);
        g = menu;
        j1 = menu.size();
        if (j1 == 0)
        {
            try
            {
                n = a(menu, new a8(this));
                j = menu.add(1, 0x7f0b0013, 0, 0x7f0e0245).setIcon(0x7f020513).setAlphabeticShortcut('n');
                j.setShowAsAction(2);
                menu.add(1, 0x7f0b0006, 0, 0x7f0e0093);
                menu.add(2, 0x7f0b0015, 0, 0x7f0e0244).setIcon(0x7f020505).setAlphabeticShortcut('n').setShowAsAction(2);
                menu.add(2, 0x7f0b0016, 0, 0x7f0e0240).setIcon(0x7f020541).setAlphabeticShortcut('g');
                menu.add(2, 0x7f0b0012, 0, 0x7f0e0241).setIcon(0x7f020538).setAlphabeticShortcut('b');
                menu.add(2, 0x7f0b0018, 0, 0x7f0e024b).setIcon(0x7f020553).setAlphabeticShortcut('q');
                menu.add(3, 0x7f0b0014, 0, 0x7f0e0246).setIcon(0x7f0204fd).setAlphabeticShortcut('n').setShowAsAction(2);
                menu.add(3, 0x7f0b0017, 0, getString(0x7f0e0247)).setIcon(0x7f02054b);
                menu.add(4, 0x7f0b001b, 0, 0x7f0e024a).setIcon(0x7f020552).setAlphabeticShortcut('s');
                menu.add(4, 0x7f0b001a, 0, 0x7f0e0249).setIcon(0x7f02054f).setAlphabeticShortcut('o');
                if (com.whatsapp.App.l == 3)
                {
                    menu.add(4, 0x7f0b0011, 0, 0x7f0e023f).setIcon(getResources().getDrawable(0x7f0205b0));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        j1 = o;
        j1;
        JVM INSTR tableswitch 0 2: default 416
    //                   0 424
    //                   1 452
    //                   2 480;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
        menu;
        throw menu;
_L2:
        menu.setGroupVisible(1, true);
        menu.setGroupVisible(2, false);
        menu.setGroupVisible(3, false);
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        try
        {
            menu.setGroupVisible(1, false);
            menu.setGroupVisible(2, true);
            menu.setGroupVisible(3, false);
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        if (i1 == 0) goto _L1; else goto _L4
_L4:
        menu.setGroupVisible(1, false);
        menu.setGroupVisible(2, false);
        menu.setGroupVisible(3, true);
        return true;
        menu;
        try
        {
            throw menu;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu) { }
        throw menu;
    }

    public void onResume()
    {
        int i1;
        i1 = App.am;
        App.Me me;
        int j1;
        try
        {
            Log.i(z[5]);
            super.onResume();
            me = App.Z;
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
        if (me == null) goto _L2; else goto _L1
_L1:
        if (!App.ah.y()) goto _L2; else goto _L3
_L3:
        j1 = App.f(this);
        if (j1 == 3) goto _L4; else goto _L2
_L2:
        Log.i(z[4]);
        App.q(z[3]);
        startActivity(new Intent(this, com/whatsapp/Main));
        finish();
_L6:
        return;
_L4:
        try
        {
            if (!App.aq())
            {
                Log.i(z[2]);
                startActivity(new Intent(this, com/whatsapp/Main));
                finish();
                return;
            }
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        boolean flag;
        com.whatsapp.notification.p.a();
        App.k.stop();
        flag = com.whatsapp.App.x();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        d();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        java.util.Date date = App.J;
        if (date == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        c(new DialogToastFragmentActivity.ClockWrongDialogFragment());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        flag = App.O;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        c(new DialogToastFragmentActivity.SoftwareExpiredDialogFragment());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        IllegalArgumentException illegalargumentexception4;
        try
        {
            if (App.a3())
            {
                b(new SoftwareAboutToExpireDialogFragment());
            }
        }
        // Misplaced declaration of an exception variable
        catch (IllegalArgumentException illegalargumentexception4)
        {
            throw illegalargumentexception4;
        }
        try
        {
            if (o == 0)
            {
                App.au.ab().postDelayed(new o3(this), 2000L);
            }
        }
        // Misplaced declaration of an exception variable
        catch (IllegalArgumentException illegalargumentexception4)
        {
            throw illegalargumentexception4;
        }
        flag = Voip.h();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            g();
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            throw illegalargumentexception3;
        }
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        i.setVisibility(8);
        return;
        illegalargumentexception4;
        throw illegalargumentexception4;
        illegalargumentexception4;
        throw illegalargumentexception4;
        illegalargumentexception4;
        throw illegalargumentexception4;
        illegalargumentexception4;
        throw illegalargumentexception4;
        illegalargumentexception4;
        throw illegalargumentexception4;
        illegalargumentexception4;
        throw illegalargumentexception4;
        illegalargumentexception4;
        throw illegalargumentexception4;
    }

    public boolean onSearchRequested()
    {
        try
        {
            if (n != null)
            {
                n.expandActionView();
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return false;
    }

    public void onStart()
    {
        super.onStart();
        m7.a(m);
    }

    public void onStop()
    {
        super.onStop();
        m7.b(m);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i1)
    {
        MenuItem menuitem = n;
        if (menuitem != null)
        {
            try
            {
                if (n.isActionViewExpanded())
                {
                    n.collapseActionView();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        super.startActivityFromFragment(fragment, intent, i1);
        return;
        fragment;
        throw fragment;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[21];
        obj = "!JH}\0349DPkV";
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
                obj = "!JH}\034-@VlA&\\";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "!JH}\034;@Vm^,\nKwGdSJqCd@KyQ%@A";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "*JKnV;VDlZ&KV8Q&PK{ViQJ8^(LK";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "!JH}\034;@Vm^,\nKw\036$@\bwAdHV\177@=JW}\036-G";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "!JH}\034;@Vm^,";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "!JH}\034-LDt\\.\005V}A?LF}\036,]Q}]:LJv\0369D\\uV'Q";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "!JH}\034-LDt\\.\005V}A?LF}\036,]Q}]:LJv\036,]UqA,A";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "!JH}\034-LDt\\.\005V}A?LF}\036,]Q}]:LJv\036;JItQ(FN";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "!JH}\034-LDt\\.\005V}A?LF}\036,]Q}]:LJv\036%LC}G H@";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "!JH}\034-LDt\\.\005V}A?LF}\036,]Q}]:LJv\036(FQqE,";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "!JH}\034*IJ{XdRWw].";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "!JH}\034:R\b}K9LW}W";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "!JH}\034*W@yG,\nKw\036$@\bwAdHV\177@=JW}\036-G";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "!JH}\034*W@yG,";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "*JKnV;VDlZ&KV8Q&PK{ViQJ8^(LK";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "*JH6D!DQkR9U\013q]=@Kl\035(FQq\\'\013fY\177\005v";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "!JH}\034'@Rq]=@Kl";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = ",KAGT;JPhl#LA";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = ",]Lll.WJmC\026OL|";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "*JH6D!DQkR9U\013q]=@Kl\035(FQq\\'\013fY\177\005v";
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
    //                   3 588;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_588;
_L3:
        byte byte1 = 51;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 73;
          goto _L9
_L5:
        byte1 = 37;
          goto _L9
_L6:
        byte1 = 37;
          goto _L9
        byte1 = 24;
          goto _L9
    }

    private class ServiceExpirationWarningDialogFragment extends DialogFragment
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            return all.a(getActivity(), m7.a(getActivity(), false));
        }

        public ServiceExpirationWarningDialogFragment()
        {
        }
    }


    private class SoftwareAboutToExpireDialogFragment extends DialogFragment
    {

        private static final String z;

        public Dialog onCreateDialog(Bundle bundle)
        {
            Log.i(z);
            return m7.a(getActivity());
        }

        static 
        {
            char ac[];
            int i1;
            int j1;
            ac = "i<l)\016e:` Nfsr#Gu$`>D,2c#Tu~u#\fd+q%Sd".toCharArray();
            j1 = ac.length;
            i1 = 0;
_L7:
            char c1;
            if (j1 <= i1)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[i1];
            i1 % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 91
        //                       2 97
        //                       3 102;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_102;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 33;
_L8:
            ac[i1] = (char)(byte0 ^ c1);
            i1++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 1;
              goto _L8
_L3:
            byte0 = 83;
              goto _L8
_L4:
            byte0 = 1;
              goto _L8
            byte0 = 76;
              goto _L8
        }

        public SoftwareAboutToExpireDialogFragment()
        {
        }
    }


    private class TabsPager extends ViewPager
    {

        private boolean b;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            if (b)
            {
                return super.onInterceptTouchEvent(motionevent);
            } else
            {
                return false;
            }
        }

        public boolean onTouchEvent(MotionEvent motionevent)
        {
            if (b)
            {
                return super.onTouchEvent(motionevent);
            } else
            {
                return false;
            }
        }

        public void setCurrentItem(int i1)
        {
label0:
            {
                if (i1 != getCurrentItem())
                {
                    break label0;
                }
                Object obj = HomeActivity.b((HomeActivity)getContext(), i1);
                if (obj == null)
                {
                    break label0;
                }
                obj = (ListView)((Fragment)obj).getView().findViewById(0x102000a);
                if (obj == null)
                {
                    break label0;
                }
                if (android.os.Build.VERSION.SDK_INT >= 8 && ((ListView) (obj)).getFirstVisiblePosition() < 8)
                {
                    ((ListView) (obj)).smoothScrollToPosition(0);
                    if (App.am == 0)
                    {
                        break label0;
                    }
                }
                ((ListView) (obj)).setSelection(0);
            }
            super.setCurrentItem(i1);
        }

        public TabsPager(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            b = true;
        }
    }

}
