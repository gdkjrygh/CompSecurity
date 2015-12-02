// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, ao9, ak, fo, 
//            ql, adl, ab4, jb, 
//            hv, qw, atz, aft, 
//            alt, App, k, og, 
//            ov, alw, o4, m7, 
//            dc, abl, as6, xm, 
//            cl, nu, pz, pf, 
//            all, a37, a16, te, 
//            nx, nr, as

public class AccountInfoActivity extends DialogToastActivity
{

    private static final String A[];
    private RadioButton j;
    private boolean k;
    private nr l;
    private as m;
    private String n;
    private android.view.View.OnClickListener o;
    private final ao9 p = new ao9();
    private RadioButton q;
    private android.view.View.OnClickListener r;
    private Runnable s;
    private android.view.View.OnClickListener t;
    private boolean u;
    private Handler v;
    private android.view.View.OnClickListener w;
    private android.view.View.OnClickListener x;
    private android.view.View.OnClickListener y;
    private RadioButton z;

    public AccountInfoActivity()
    {
        k = false;
        m = new ak(this);
        l = new fo(this);
        y = new ql(this);
        r = new adl(this);
        x = new ab4(this);
        t = new jb(this);
        o = new hv(this);
        w = new qw(this);
        v = new atz(this);
    }

    private Dialog a(int i1, Runnable runnable)
    {
        return (new android.app.AlertDialog.Builder(this)).setMessage(i()).setPositiveButton(0x7f0e02fc, new aft(this, i1, runnable)).setNegativeButton(0x7f0e007b, new alt(this, i1)).create();
    }

    static Runnable a(AccountInfoActivity accountinfoactivity, Runnable runnable)
    {
        accountinfoactivity.s = runnable;
        return runnable;
    }

    static String a(AccountInfoActivity accountinfoactivity, String s1)
    {
        accountinfoactivity.n = s1;
        return s1;
    }

    private String a(String s1, String s2, boolean flag)
    {
        String s3;
        String s4;
        try
        {
            s4 = A[24];
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        s3 = A[25];
_L4:
        s1 = String.format(s4, new Object[] {
            s2, s1, s3
        });
        Log.i((new StringBuilder()).append(A[26]).append(s1).toString());
        return s1;
_L2:
        s3 = A[27];
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(AccountInfoActivity accountinfoactivity)
    {
        accountinfoactivity.l();
    }

    static void a(AccountInfoActivity accountinfoactivity, String s1, Runnable runnable)
    {
        accountinfoactivity.a(s1, runnable);
    }

    private void a(String s1)
    {
        boolean flag = false;
        findViewById(0x7f0b005d).setVisibility(8);
        findViewById(0x7f0b005f).setVisibility(0);
        og og1 = App.az.e((new StringBuilder()).append(s1).append(A[43]).toString());
        if (og1 != null)
        {
            flag = true;
        }
        Log.b(flag);
        ((TextView)findViewById(0x7f0b0062)).setText(og1.a(this));
        ((TextView)findViewById(0x7f0b0064)).setText(ov.a(s1));
        s1 = (ImageView)findViewById(0x7f0b0060);
        p.a(og1, s1);
    }

    private void a(String s1, Runnable runnable)
    {
        b(0x7f0e0011);
        v.sendEmptyMessageDelayed(10, 32000L);
        boolean flag;
        try
        {
            flag = App.a(new String[] {
                (new StringBuilder()).append(s1).append(A[0]).toString()
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        v.removeMessages(10);
        c();
        f(getString(0x7f0e0317, new Object[] {
            getString(0x7f0e00c6)
        }));
        s = null;
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        s = runnable;
        return;
    }

    private boolean a(long l1)
    {
        TextView textview = (TextView)findViewById(0x7f0b0064);
        textview.setTextColor(getResources().getColor(0x7f090033));
        boolean flag = false;
        String s1;
        if (l1 == 0L)
        {
            s1 = getString(0x7f0e001d);
        } else
        if (l1 >= 0x40acd884560L)
        {
            s1 = getString(0x7f0e0219);
            flag = true;
        } else
        if (l1 - System.currentTimeMillis() < 0L)
        {
            textview.setTextColor(getResources().getColor(0x7f09002f));
            s1 = getString(0x7f0e001c);
        } else
        {
            s1 = SimpleDateFormat.getDateInstance().format(new Date(l1));
        }
        textview.setText(s1);
        return flag;
    }

    private String b(String s1, String s2, boolean flag)
    {
        String s3 = (new StringBuilder()).append(n).append(A[52]).toString();
        String s4 = alw.a();
        String s5 = alw.b();
        try
        {
            s2 = (new StringBuilder()).append(s1).append(A[49]).append(n).append(A[51]).append(o4.b(s3)).append(A[50]).append(s2).append(A[48]).append(s4).append(A[54]).append(s5);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        s1 = (new StringBuilder()).append(A[53]).append(App.Z.jabber_id).toString();
_L4:
        return s2.append(s1).toString();
_L2:
        s1 = "";
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(AccountInfoActivity accountinfoactivity, String s1)
    {
        accountinfoactivity.a(s1);
    }

    static boolean b(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.c();
    }

    static String c(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.n;
    }

    private boolean c()
    {
        return a(m7.b(A[23]));
    }

    private void d()
    {
        String s1 = e();
        Log.i((new StringBuilder()).append(A[9]).append(s1).toString());
        b(0x7f0e030e);
        v.sendEmptyMessageDelayed(8, 32000L);
        String s2 = a(App.Z.jabber_id, n, u);
        App.as.a(s1, s2);
    }

    static boolean d(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.f();
    }

    private String e()
    {
        if (z.isChecked())
        {
            return "5";
        }
        break MISSING_BLOCK_LABEL_17;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        if (q.isChecked())
        {
            return "3";
        } else
        {
            return "1";
        }
        illegalstateexception;
        throw illegalstateexception;
    }

    static void e(AccountInfoActivity accountinfoactivity)
    {
        accountinfoactivity.g();
    }

    static RadioButton f(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.z;
    }

    private boolean f()
    {
label0:
        {
            long l1 = m7.e();
            if (l1 != 0L)
            {
                long l2;
                try
                {
                    l2 = System.currentTimeMillis();
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                if (l1 - l2 >= 0x73df16000L)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    static Runnable g(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.s;
    }

    private void g()
    {
        MessageService.a(this, true, true);
        String s1 = e();
        s1 = b(A[20], s1, u);
        Log.i((new StringBuilder()).append(A[22]).append(s1).toString());
        Intent intent = new Intent(A[21]);
        intent.setData(Uri.parse(s1));
        startActivity(intent);
    }

    private void h()
    {
        MessageService.a(this, true, true);
        String s1 = e();
        s1 = b(A[46], s1, u);
        Log.i((new StringBuilder()).append(A[45]).append(s1).toString());
        Intent intent = new Intent(A[44]);
        intent.setData(Uri.parse(s1));
        startActivity(intent);
    }

    static void h(AccountInfoActivity accountinfoactivity)
    {
        accountinfoactivity.k();
    }

    private String i()
    {
        long l2 = m7.e() - System.currentTimeMillis();
        long l1 = l2 % 0x757b12c00L;
        int i1 = (int)((double)l2 / 31536000000D);
        if (i1 == 0)
        {
            l1 = 0L;
            i1 = 1;
        }
        String s1;
        int j1;
        if (l1 < 0x5265c00L)
        {
            j1 = 0x7f0d0002;
        } else
        {
            j1 = 0x7f0d0001;
        }
        s1 = String.format(App.j.a(j1, i1), new Object[] {
            Integer.valueOf(i1)
        });
        return (new StringBuilder()).append(s1).append(" ").append(getString(0x7f0e0012)).toString();
    }

    static boolean i(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.u;
    }

    static Handler j(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.v;
    }

    private boolean j()
    {
        String s1;
        try
        {
            if (n == null)
            {
                f(getString(0x7f0e02c6, new Object[] {
                    getString(0x7f0e02c5)
                }));
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        try
        {
            s1 = n;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        return s1 == null;
    }

    static RadioButton k(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.j;
    }

    private void k()
    {
label0:
        {
            String s2 = e();
            String s1 = getString(0x7f0e001b);
            if (u)
            {
                Object obj = App.az.e((new StringBuilder()).append(n).append(A[7]).toString());
                boolean flag;
                if (obj != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Log.b(flag);
                obj = getString(0x7f0e02c8, new Object[] {
                    ((og) (obj)).a(this)
                });
                if (App.am == 0)
                {
                    break label0;
                }
            }
            obj = getString(0x7f0e001a);
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(" ").append(b(A[6], s2, false)).toString();
        as6.a((new Intent(A[4])).setType(A[5]).putExtra(A[3], s1).putExtra(A[8], ((String) (obj))), this, this, getString(0x7f0e0378));
    }

    private void l()
    {
        findViewById(0x7f0b005d).setVisibility(0);
        findViewById(0x7f0b005f).setVisibility(8);
        n = null;
    }

    static boolean l(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.j();
    }

    static RadioButton m(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.q;
    }

    static void n(AccountInfoActivity accountinfoactivity)
    {
        accountinfoactivity.h();
    }

    static void o(AccountInfoActivity accountinfoactivity)
    {
        accountinfoactivity.d();
    }

    static android.view.View.OnClickListener p(AccountInfoActivity accountinfoactivity)
    {
        return accountinfoactivity.t;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        int k1;
        k1 = App.am;
        Log.i((new StringBuilder()).append(A[36]).append(i1).append(A[39]).append(j1).append(A[42]).append(intent).toString());
        if (i1 != 10001) goto _L2; else goto _L1
_L1:
        App.as.a(j1, intent);
_L3:
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        try
        {
            Log.a(A[37], illegalstateexception);
            showDialog(6);
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
        if (k1 == 0) goto _L3; else goto _L2
_L2:
        if (i1 != 10002)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j1 != -1) goto _L3; else goto _L4
_L4:
        String s1 = intent.getStringExtra(A[38]);
        try
        {
            Log.b(s1.endsWith(A[40]));
            n = s1.substring(0, s1.length() - A[41].length());
            a(n, ((Runnable) (null)));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L3; else goto _L5
_L5:
        super.onActivityResult(i1, j1, intent);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        int i1;
        boolean flag;
        flag = false;
        i1 = App.am;
        Log.i((new StringBuilder()).append(A[19]).append(bundle).append(A[12]).append(getIntent()).toString());
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f030018);
        j = (RadioButton)findViewById(0x7f0b0068);
        q = (RadioButton)findViewById(0x7f0b0070);
        z = (RadioButton)findViewById(0x7f0b0075);
        j.setChecked(true);
        obj = new xm(this);
        j.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (obj)));
        q.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (obj)));
        z.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (obj)));
        obj = findViewById(0x7f0b0069);
        View view = findViewById(0x7f0b006d);
        View view1 = findViewById(0x7f0b0072);
        cl cl1 = new cl(this, ((View) (obj)), view, view1);
        ((View) (obj)).setOnClickListener(cl1);
        view.setOnClickListener(cl1);
        view1.setOnClickListener(cl1);
        ((TextView)findViewById(0x7f0b006a)).setText(String.format(App.j.a(0x7f0d002d, 1), new Object[] {
            Integer.valueOf(1)
        }));
        ((TextView)findViewById(0x7f0b006e)).setText(String.format(App.j.a(0x7f0d002d, 3), new Object[] {
            Integer.valueOf(3)
        }));
        ((TextView)findViewById(0x7f0b0073)).setText(String.format(App.j.a(0x7f0d002d, 5), new Object[] {
            Integer.valueOf(5)
        }));
        ((TextView)findViewById(0x7f0b006b)).setText(App.as.a("1"));
        ((TextView)findViewById(0x7f0b006f)).setText(App.as.a("3"));
        ((TextView)findViewById(0x7f0b0074)).setText(App.as.a("5"));
        obj = getIntent().getStringExtra(A[13]);
        u = getIntent().getBooleanExtra(A[10], false);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_500;
        }
        boolean flag1;
        u = true;
        flag1 = ((String) (obj)).endsWith(A[17]);
        if (flag1)
        {
            Object obj1;
            Button button;
            int j1;
            boolean flag2;
            try
            {
                n = ((String) (obj)).substring(0, ((String) (obj)).length() - A[16].length());
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_500;
            }
        }
        Log.e((new StringBuilder()).append(A[18]).append(((String) (obj))).toString());
        if (u)
        {
            getSupportActionBar().setTitle(0x7f0e02c4);
            ((TextView)findViewById(0x7f0b0061)).setText("");
            obj = (TextView)findViewById(0x7f0b0063);
            try
            {
                ((TextView) (obj)).setText("");
                findViewById(0x7f0b005f).setVisibility(8);
                findViewById(0x7f0b005d).setVisibility(0);
                if (n != null)
                {
                    a(n, ((Runnable) (null)));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            ((Button)findViewById(0x7f0b005e)).setOnClickListener(y);
            obj = (ImageButton)findViewById(0x7f0b0065);
            try
            {
                ((ImageButton) (obj)).setOnClickListener(r);
                findViewById(0x7f0b007b).setVisibility(8);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_697;
            }
        }
        n = App.Z.jabber_id;
        ((TextView)findViewById(0x7f0b0062)).setText(ov.a(n));
        findViewById(0x7f0b0060).setVisibility(8);
        findViewById(0x7f0b0065).setVisibility(8);
        obj1 = (Button)findViewById(0x7f0b0079);
        obj = (Button)findViewById(0x7f0b0077);
        button = (Button)findViewById(0x7f0b0078);
        try
        {
            if (!App.aR())
            {
                ((Button) (obj1)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f020665, 0);
                ((Button) (obj)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f020664, 0);
                button.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f020362, 0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (App.a())
            {
                ((Button) (obj)).setVisibility(8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (!u)
        {
            flag2 = c();
            flag = flag2;
            if (flag2)
            {
                try
                {
                    findViewById(0x7f0b0066).setVisibility(8);
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw bundle;
                }
                flag = flag2;
            }
        }
        flag2 = u;
        if (!flag2 && flag)
        {
            break MISSING_BLOCK_LABEL_930;
        }
        ((Button) (obj1)).setOnClickListener(w);
        button.setOnClickListener(o);
        flag2 = App.as.b();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_922;
        }
        j1 = App.u;
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_922;
        }
        j1 = android.os.Build.VERSION.SDK_INT;
        if (j1 < 8)
        {
            break MISSING_BLOCK_LABEL_922;
        }
        ((Button) (obj)).setOnClickListener(x);
        j1 = App.l;
        if (j1 != 3)
        {
            break MISSING_BLOCK_LABEL_930;
        }
        try
        {
            ((Button) (obj)).setOnLongClickListener(new nu(this));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_930;
        }
        ((Button) (obj)).setOnClickListener(t);
        obj1 = (TextView)findViewById(0x7f0b007a);
        try
        {
            ((TextView) (obj1)).setPaintFlags(((TextView) (obj1)).getPaintFlags() | 8);
            ((TextView) (obj1)).setOnClickListener(new pz(this));
            ((TextView) (obj1)).setOnTouchListener(new pf(this));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (flag || bundle != null)
        {
            break MISSING_BLOCK_LABEL_1040;
        }
        bundle = getIntent();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_1040;
        }
        flag = bundle.getBooleanExtra(A[15], false);
        if (flag && obj != null)
        {
            try
            {
                Log.i(A[14]);
                k = true;
                setIntent(null);
                ((Button) (obj)).performClick();
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        try
        {
            if (m7.d < System.currentTimeMillis())
            {
                Log.i(A[11]);
                MessageService.a(this, true, true, true, null, null, true);
            }
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
            return super.onCreateDialog(i1);

        case 6: // '\006'
            AlertDialog alertdialog;
            try
            {
                alertdialog = (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e01a6).setPositiveButton(0x7f0e02ba, null).create();
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return alertdialog;

        case 5: // '\005'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0217).setPositiveButton(0x7f0e02ba, null).create();

        case 4: // '\004'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e017f).setPositiveButton(0x7f0e02ba, null).create();

        case 121: // 'y'
            Log.w(A[31]);
            return all.a(this);

        case 120: // 'x'
            Log.w(A[30]);
            return all.e(this);

        case 117: // 'u'
            Log.w(A[32]);
            return all.c(this);

        case 118: // 'v'
            Log.w(A[29]);
            return all.f(this);

        case 119: // 'w'
            Log.w(A[28]);
            return all.a(this, k);

        case 2: // '\002'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0180).setPositiveButton(0x7f0e02ba, null).create();

        case 7: // '\007'
            a37 a37_1 = new a37(this);
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e02d1).setPositiveButton(0x7f0e04b5, a37_1).setNegativeButton(0x7f0e02a3, a37_1).create();

        case 8: // '\b'
            return a(8, new a16(this));

        case 9: // '\t'
            return a(9, new te(this));

        case 11: // '\013'
            return a(11, new nx(this));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        try
        {
            if (!u)
            {
                menu.add(0, 1, 0, 0x7f0e02c4).setIcon(0x7f02054a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(A[34]);
        v.removeMessages(0);
        v.removeMessages(8);
        p.a();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 1: // '\001'
            menuitem = new Intent(this, com/whatsapp/AccountInfoActivity);
            menuitem.putExtra(A[35], true);
            startActivity(menuitem);
            return true;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        Log.i((new StringBuilder()).append(A[47]).append(getIntent()).toString());
    }

    protected void onPrepareDialog(int i1, Dialog dialog)
    {
        int j1 = App.am;
        i1;
        JVM INSTR tableswitch 117 121: default 40
    //                   117 62
    //                   118 77
    //                   119 92
    //                   120 40
    //                   121 47;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        super.onPrepareDialog(i1, dialog);
_L6:
        return;
_L5:
        ((AlertDialog)dialog).setMessage(all.d());
        if (j1 == 0) goto _L6; else goto _L2
_L2:
        ((AlertDialog)dialog).setMessage(all.a());
        if (j1 == 0) goto _L6; else goto _L3
_L3:
        ((AlertDialog)dialog).setMessage(all.c());
        if (j1 == 0) goto _L6; else goto _L4
_L4:
        AlertDialog alertdialog = (AlertDialog)dialog;
        try
        {
            alertdialog.setMessage(all.b());
            all.a(this, alertdialog, k);
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            throw dialog;
        }
        if (j1 == 0) goto _L6; else goto _L1
    }

    protected void onResume()
    {
        super.onResume();
        Log.i((new StringBuilder()).append(A[2]).append(getIntent()).toString());
    }

    protected void onStart()
    {
        try
        {
            super.onStart();
            Log.i((new StringBuilder()).append(A[1]).append(getIntent()).toString());
            m7.a(m);
            App.as.a(l);
            if (App.Z.jabber_id.equals(n))
            {
                c();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    protected void onStop()
    {
        super.onStop();
        Log.i((new StringBuilder()).append(A[33]).append(getIntent()).toString());
        App.as.b(l);
        m7.b(m);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[55];
        obj = "`\025k\030$A\0226\016<PH+\n8";
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
                obj = "A\005&\0009N\022h\006\"F\tj\0348A\0241O";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "A\005&\0009N\022h\006\"F\tj\035)S\023(\nl";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "A\b!\035#I\002k\006\"T\003+\033bE\0361\035-\0165\020-\006e%\021";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "A\b!\035#I\002k\006\"T\003+\033bA\0051\006#NH\026*\002d";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "T\003=\033cP\n$\006\"";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "H\0221\037?\032Ij\030;WH2\007-T\025$\037<\016\005*\002cP\007<\002)N\0226@/K\0250\002\023P\007<A<H\026";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "`\025k\030$A\0226\016<PH+\n8";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "A\b!\035#I\002k\006\"T\003+\033bE\0361\035-\0162\0007\030";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "A\005&\0009N\022h\006\"F\tj\r%L\n,\001+\017\013$\035'E\022j\0379R\005-\016?EF6\0049\0";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "C\t+\033-C\022";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "A\005&\0009N\022h\006\"F\tj\f>E\0071\ncR\003&\000\"N\003&\033cO\020 \035>I\002 B)X\026,\035)D";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "\000\017+\033)N\022x";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "J\017!";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "A\005&\0009N\022h\006\"F\tj\000\"\r\0057\n-T\003j\037)R\000*\035!\r\005)\006/K";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "B\023<";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "`\025k\030$A\0226\016<PH+\n8";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "`\025k\030$A\0226\016<PH+\n8";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "A\005&\0009N\022h\006\"F\tj\f>E\0071\ncJ\017!O%N\005*\035>E\0051O*O\024(\0168\0";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "A\005&\0009N\022h\006\"F\tj\f>E\0071\nlB\023+\013 E[";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "H\0221\037?\032Ij\030;WH2\007-T\025$\037<\016\005*\002cP\007<\002)N\0226@-N\0027\000%DH5\007<";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "A\b!\035#I\002k\006\"T\003+\033bA\0051\006#NH\023&\tw";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "A\005&\0009N\022h\006\"F\tj\r%L\n,\001+\017\021 \r?I\022 @<U\024&\007-S\003e\032>LF";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "E\0365\006>A\022,\000\"\177\002$\033)";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "L\0176\033q\005\025c\0379R\005-\016?E\024xJ?\006\025 \003*\035C6";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "F\007)\034)";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "A\005&\0009N\022h\006\"F\tj\013-T\007e";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "T\0240\n";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "A\005&\0009N\022h\006\"F\tj\013%A\n*\blS\0037\031%C\003h\n4T\003+\034%O\bh\037-Y\013 \0018";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "A\005&\0009N\022h\006\"F\tj\013%A\n*\blS\0037\031%C\003h\n4T\003+\034%O\bh\n4P\0177\n(";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "A\005&\0009N\022h\006\"F\tj\013%A\n*\blS\0037\031%C\003h\n4T\003+\034%O\bh\003%F\0031\006!E";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "A\005&\0009N\022h\006\"F\tj\013%A\n*\blS\0037\031%C\003h\n4T\003+\034%O\bh\035#L\n'\016/K";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                obj = "A\005&\0009N\022h\006\"F\tj\013%A\n*\blS\0037\031%C\003h\n4T\003+\034%O\bh\016/T\0173\n";
                byte0 = 31;
                i1 = 32;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "A\005&\0009N\022h\006\"F\tj\0348O\026e";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "A\005&\0009N\022h\006\"F\tj\013)S\0227\0005";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "C\t+\033-C\022";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "A\005&\0009N\022h\006\"F\tj\016/T\0173\0068YK7\n?U\n1O>E\0270\n?T[";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "A\005&\0009N\022h\006\"F\tj\016/T\0173\0068YK7\n?U\n1@)X\005 \0378I\t+";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "C\t+\033-C\022";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "\000\024 \0349L\022x";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "`\025k\030$A\0226\016<PH+\n8";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "`\025k\030$A\0226\016<PH+\n8";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "\000\002$\033-\035";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "`\025k\030$A\0226\016<PH+\n8";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "A\b!\035#I\002k\006\"T\003+\033bA\0051\006#NH\023&\tw";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "A\005&\0009N\022h\006\"F\tj\r%L\n,\001+\017\021 \r?I\022 @<U\024&\007-S\003e\032>LF";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "H\0221\037?\032Ij\030;WH2\007-T\025$\037<\016\005*\002cP\007<\002)N\0226@+O\t\"\003)\016\026-\037";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "A\005&\0009N\022h\006\"F\tj\037-U\025 O";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "\006\n\"R";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "\037\026-\000\"E[";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "\006\025.\032q";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "\006\005.\0349M[";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "A\004&";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "\006\0007\000!\035";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "\006\n&R";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i1] = ((String) (obj));
                A = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1292
    //                   0 1315
    //                   1 1322
    //                   2 1329
    //                   3 1336;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1336;
_L3:
        byte byte1 = 76;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 32;
          goto _L9
_L5:
        byte1 = 102;
          goto _L9
_L6:
        byte1 = 69;
          goto _L9
        byte1 = 111;
          goto _L9
    }
}
