// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AsyncPlayer;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.notification.l;
import com.whatsapp.notification.p;
import com.whatsapp.qrcode.QrCodeActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.bz;
import com.whatsapp.util.undobar.UndoBarController;
import com.whatsapp.util.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            DialogToastFragmentActivity, a_, ChangeNumber, m7, 
//            App, ConversationsFragment, a3n, k, 
//            oh, ProfilePhotoReminder, sf, qq, 
//            asw, Conversation, aoz, Main, 
//            hj, all, a1z, u5, 
//            xw, al8, i4, mk, 
//            u6, oj, ContactPicker, SetStatus, 
//            Settings, Advanced, ListMembersSelector, og, 
//            au2, NewGroup, my, WebSessionsActivity, 
//            as

public class Conversations extends DialogToastFragmentActivity
{

    private static final String z[];
    private as f;
    private MenuItem g;
    String h;

    public Conversations()
    {
        f = new a_(this);
        h = null;
    }

    static a3n a(Conversations conversations)
    {
        return conversations.b();
    }

    private void a()
    {
        boolean flag = ChangeNumber.f();
        IllegalArgumentException illegalargumentexception;
        if (!flag)
        {
            try
            {
                h = m7.a(this, false);
                if (h != null)
                {
                    showDialog(116);
                    return;
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        break MISSING_BLOCK_LABEL_37;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public static void a(Activity activity, int i)
    {
        App.P = true;
        App.au.ac();
        activity.showDialog(i);
    }

    static void a(Conversations conversations, boolean flag)
    {
        conversations.b(flag);
    }

    private a3n b()
    {
        int i = App.am;
        Object obj = getSupportFragmentManager().getFragments();
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Fragment fragment = (Fragment)((Iterator) (obj)).next();
                try
                {
                    if (!(fragment instanceof ConversationsFragment))
                    {
                        continue;
                    }
                    obj = (a3n)fragment;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                return ((a3n) (obj));
            } while (i == 0);
        }
        return null;
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

    static void b(Conversations conversations)
    {
        conversations.e();
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
        int i = App.aP;
        if (i == 0) goto _L4; else goto _L5
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

    private void c(DialogFragment dialogfragment)
    {
        App.P = true;
        App.au.ac();
        b(dialogfragment);
    }

    private void d()
    {
        int i;
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
        asw.a(new qq(this, null), new Void[0]);
        i = App.am;
        if (i == 0)
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

    private void e()
    {
        sf.h();
        asw.a(new qq(this, null), new Void[0]);
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

    protected void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR tableswitch 1 1: default 20
    //                   1 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(i, j, intent);
_L4:
        return;
_L2:
        if (j != -1) goto _L4; else goto _L3
_L3:
        Object obj = intent.getStringExtra(z[9]);
        obj = App.az.e(((String) (obj)));
        int i1;
        try
        {
            startActivity(Conversation.a(((og) (obj))));
            i1 = App.am;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (i1 == 0) goto _L4; else goto _L1
    }

    public void onCreate(Bundle bundle)
    {
        bz bz1;
        int i;
        i = App.am;
        bz1 = new bz(z[15]);
        App.Me me;
        int j;
        try
        {
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
            me = App.Z;
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
        if (me == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (!App.ah.y())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        j = App.f(this);
        if (j == 3)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        Log.i(z[19]);
        App.q(z[14]);
        startActivity(new Intent(this, com/whatsapp/Main));
        finish();
        return;
        boolean flag;
        try
        {
            App.k.stop();
            Log.i(z[18]);
            App.aT();
            setContentView(0x7f03001f);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        getSupportFragmentManager().beginTransaction().add(0x7f0b00ac, new ConversationsFragment()).commit();
        flag = App.au.aa();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        Log.w(z[16]);
        c(new DialogToastFragmentActivity.ClockWrongDialogFragment());
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        flag = App.aU();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        Log.w(z[20]);
        c(new DialogToastFragmentActivity.SoftwareExpiredDialogFragment());
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        try
        {
            if (App.a3())
            {
                b(new HomeActivity.SoftwareAboutToExpireDialogFragment());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            a();
            if (z[17].equals(getIntent().getAction()))
            {
                l.d().c();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        d();
        bz1.a();
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
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setTitle(getString(0x7f0e0354));
            progressdialog.setMessage(getString(0x7f0e0353));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 0: // '\0'
            hj hj1 = new hj(this);
            return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0208).setMessage(getString(0x7f0e0206, new Object[] {
                getString(0x7f0e00c6)
            })).setCancelable(false).setPositiveButton(0x7f0e0207, hj1).create();

        case 116: // 't'
            return all.a(this, h);

        case 11: // '\013'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e047e).setNeutralButton(0x7f0e02ba, new a1z(this)).create();

        case 115: // 's'
            Log.i(z[27]);
            return m7.a(this);

        case 121: // 'y'
            Log.w(z[23]);
            return all.a(this);

        case 120: // 'x'
            Log.w(z[28]);
            return all.e(this);

        case 119: // 'w'
            Log.w(z[26]);
            return all.a(this, false);

        case 117: // 'u'
            Log.w(z[25]);
            return all.c(this);

        case 118: // 'v'
            Log.w(z[24]);
            return all.f(this);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
label0:
        {
            int i = App.am;
            Resources resources = getResources();
            if (u5.b() != 0)
            {
                android.view.View view = al8.a(this, getSherlock(), new xw(this));
                g = menu.add(0, 7, 0, 0x7f0e0366).setActionView(view).setIcon(0x7f020517);
                g.setShowAsAction(10);
                g.setOnActionExpandListener(new i4(this));
            }
            menu.add(0, 0, 0, 0x7f0e0244).setIcon(0x7f020505).setAlphabeticShortcut('n').setShowAsAction(2);
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                flag = ViewConfiguration.get(this).hasPermanentMenuKey();
                if (i == 0)
                {
                    break label0;
                }
            }
            int j;
            try
            {
                j = android.os.Build.VERSION.SDK_INT;
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (j < 11 || i != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (flag)
        {
            try
            {
                menu.add(0, 0, 0, 0x7f0e0244).setIcon(0x7f020549).setAlphabeticShortcut('n').setShowAsAction(0);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        try
        {
            menu.add(0, 10, 0, 0x7f0e0240).setIcon(0x7f020541).setAlphabeticShortcut('g');
            menu.add(0, 9, 0, 0x7f0e0241).setIcon(0x7f020538).setAlphabeticShortcut('b');
            menu.add(0, 11, 0, 0x7f0e024b).setIcon(0x7f020553).setAlphabeticShortcut('q');
            menu.add(0, 4, 0, 0x7f0e023e).setIcon(0x7f02053d).setAlphabeticShortcut('c');
            menu.add(0, 2, 0, 0x7f0e0249).setIcon(0x7f02054f).setAlphabeticShortcut('o');
            menu.add(0, 1, 0, 0x7f0e024a).setIcon(0x7f020552).setAlphabeticShortcut('s');
            if (com.whatsapp.App.l == 3)
            {
                menu.add(0, 3, 0, 0x7f0e023f).setIcon(resources.getDrawable(0x7f0205b0));
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
        Log.i(z[8]);
        super.onDestroy();
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        String s = intent.getStringExtra(z[5]);
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
            break MISSING_BLOCK_LABEL_60;
        }
        flag = mk.c(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        App.k(s);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        App.d(s, true);
        x.a(new u6(this, s));
        s = intent.getStringExtra(z[6]);
        try
        {
            if (!TextUtils.isEmpty(s))
            {
                App.d(s, true);
                x.a(new oj(this, s));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        try
        {
            if (z[7].equals(intent.getAction()))
            {
                l.d().c();
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
        int j = App.am;
        menuitem.getItemId();
        JVM INSTR tableswitch 0 11: default 72
    //                   0 74
    //                   1 92
    //                   2 109
    //                   3 126
    //                   4 147
    //                   5 72
    //                   6 72
    //                   7 267
    //                   8 72
    //                   9 274
    //                   10 291
    //                   11 426;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L1 _L7 _L1 _L8 _L9 _L10
_L1:
        return false;
_L2:
        startActivityForResult(new Intent(this, com/whatsapp/ContactPicker), 1);
        return true;
_L3:
        startActivity(new Intent(this, com/whatsapp/SetStatus));
        return true;
_L4:
        startActivity(new Intent(this, com/whatsapp/Settings));
        return true;
_L5:
        finish();
        startActivity(new Intent(this, com/whatsapp/Advanced));
        return true;
_L6:
label0:
        {
            menuitem = new Intent(z[12], android.provider.ContactsContract.Contacts.CONTENT_URI);
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
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_237;
            }
        }
        menuitem = getPackageManager().getLaunchIntentForPackage(z[11]);
        if (menuitem != null)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        Log.w(z[13]);
        showDialog(11);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        startActivity(menuitem);
_L11:
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
        catch (MenuItem menuitem)
        {
            Log.w(z[10]);
        }
        showDialog(11);
          goto _L11
_L7:
        onSearchRequested();
        return true;
_L8:
        startActivity(new Intent(this, com/whatsapp/ListMembersSelector));
        return true;
_L9:
        int i;
        menuitem = u5.d().iterator();
        i = 0;
_L13:
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
                flag = og.c(s);
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
            if (!flag)
            {
                i++;
            }
        }
        if (j == 0) goto _L13; else goto _L12
_L12:
        if (i < au2.r) goto _L15; else goto _L14
_L14:
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
        catch (MenuItem menuitem) { }
        throw menuitem;
        menuitem;
        throw menuitem;
_L15:
        startActivity(new Intent(this, com/whatsapp/NewGroup));
        return true;
_L10:
        flag = my.t();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_456;
        }
        startActivity(new Intent(this, com/whatsapp/WebSessionsActivity));
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_497;
        }
        flag = App.i();
        if (flag)
        {
            try
            {
                startActivity(new Intent(this, com/whatsapp/qrcode/QrCodeActivity));
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_497;
            }
        }
        App.b(getBaseContext(), 0x7f0e0289, 0);
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
        throw menuitem;
    }

    public void onPause()
    {
        Log.i(z[22]);
        bz bz1 = new bz(z[21]);
        super.onPause();
        UndoBarController.b(this);
        bz1.a();
    }

    protected void onPrepareDialog(int i, Dialog dialog)
    {
        int j = App.am;
        i;
        JVM INSTR tableswitch 117 121: default 40
    //                   117 62
    //                   118 77
    //                   119 92
    //                   120 40
    //                   121 47;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        super.onPrepareDialog(i, dialog);
_L6:
        return;
_L5:
        ((AlertDialog)dialog).setMessage(all.d());
        if (j == 0) goto _L6; else goto _L2
_L2:
        ((AlertDialog)dialog).setMessage(all.a());
        if (j == 0) goto _L6; else goto _L3
_L3:
        ((AlertDialog)dialog).setMessage(all.c());
        if (j == 0) goto _L6; else goto _L4
_L4:
        AlertDialog alertdialog = (AlertDialog)dialog;
        try
        {
            alertdialog.setMessage(all.b());
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            throw dialog;
        }
        if (j == 0) goto _L6; else goto _L1
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        Object obj;
        int i;
        i = App.am;
        Log.i(z[2]);
        obj = new bz(z[1]);
        App.Me me;
        int j;
        try
        {
            super.onResume();
            me = App.Z;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (me == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (!App.ah.y())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        j = App.f(this);
        if (j == 3)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        Log.i(z[3]);
        App.q(z[4]);
        startActivity(new Intent(this, com/whatsapp/Main));
        finish();
        return;
        try
        {
            if (App.aq())
            {
                Log.i(z[0]);
                startActivity(new Intent(this, com/whatsapp/Main));
                finish();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        boolean flag;
        p.a();
        App.k.stop();
        flag = com.whatsapp.App.x();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        d();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        java.util.Date date = App.J;
        if (date == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        c(new DialogToastFragmentActivity.ClockWrongDialogFragment());
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        flag = App.O;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        c(new DialogToastFragmentActivity.SoftwareExpiredDialogFragment());
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        IllegalArgumentException illegalargumentexception;
        try
        {
            if (App.a3())
            {
                b(new HomeActivity.SoftwareAboutToExpireDialogFragment());
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        ((bz) (obj)).a();
        return;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public boolean onSearchRequested()
    {
        try
        {
            if (g != null)
            {
                g.expandActionView();
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return false;
    }

    protected void onStart()
    {
        super.onStart();
        m7.a(f);
    }

    protected void onStop()
    {
        super.onStop();
        m7.b(f);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[29];
        obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6b_\032/: HP* $]R9!,O\0239+";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        j = 0;
_L8:
label0:
        {
            if (i1 > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6b_\032/: H";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6b_\032/: H";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6b_\032/: HP2 `@\032q ?\000\022/(>Y\020.*`I\035";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = ",\"C\t9=>L\0135 #^_> 8C\0349o9B_1.$C";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "*5D\013\003(?B\n,\020'D\033";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "*#I ;=\"X\017\003%$I";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = ",\"@Q+',Y\f=?=\003\0262;(C\013r..Y\0263!cn>\020\003\036";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bI\032/;?B\006";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ",\"C\013=,9";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bB\017(&\"C\fs<4^\0139\"`N\0202;,N\013/b,]\017q!\"YR: 8C\033";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = ",\"@Q=!)_\0205+cN\0202;,N\013/";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = ".#I\r3&)\003\0262;(C\013r..Y\0263!c{6\031\030";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bB\017(&\"C\fs!\"D\021(*#YP/6>Y\0321b.B\021(..Y\fq.=]R2 9\000\0313:#I";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = ",\"C\t9=>L\0135 #^_> 8C\0349o9B_1.$C";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bN\r9.9H";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bN\0233,&\000\b. #J";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = ",\"@Q+',Y\f=?=\003\0262;(C\013r..Y\0263!cn>\020\003\036";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bN\r9.9H";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bN\r9.9HP2 `@\032q ?\000\022/(>Y\020.*`I\035";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6b^\bq*5]\026.*)";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6b]\036)<(";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6b]\036)<(";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bI\026=#\"J_/*?[\026?*`H\007(*#^\0263!`_\0200#/L\0347";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bI\026=#\"J_/*?[\026?*`H\007(*#^\0263!`H\007,&?H\033";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bI\026=#\"J_/*?[\026?*`H\007(*#^\0263!`L\034(&;H";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bI\026=#\"J_/*?[\026?*`H\007(*#^\0263!`]\036%\"(C\013";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bI\026=#\"J_/ +Y\b==(\000\036> 8YR( `H\007,&?H";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = ",\"C\t9=>L\0135 #^\036?;$[\026(6bI\026=#\"J_/*?[\026?*`H\007(*#^\0263!`A\026:*9D\0229";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 720
    //                   0 743
    //                   1 750
    //                   2 757
    //                   3 764;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_764;
_L3:
        byte byte1 = 92;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 79;
          goto _L9
_L5:
        byte1 = 77;
          goto _L9
_L6:
        byte1 = 45;
          goto _L9
        byte1 = 127;
          goto _L9
    }
}
