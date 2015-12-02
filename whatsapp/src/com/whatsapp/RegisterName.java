// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            VerifyMessageStoreActivity, wd, r4, a3u, 
//            a8o, _4, App, aky, 
//            di, dq, dw, og, 
//            a9g, RegisterPhone, ProfilePhotoReminder, k, 
//            aoz, qk, fe, Main, 
//            t_, hb, ff, aoi, 
//            rf, iz, vr, Conversations, 
//            au7, ls, ww, q3, 
//            vt, za

public class RegisterName extends VerifyMessageStoreActivity
    implements wd
{

    private static final String A[];
    private static aky x;
    private static long y;
    private Bitmap k;
    private android.view.View.OnTouchListener l;
    private Handler m;
    private dw n;
    private ImageView o;
    private View p;
    private dq q;
    private View r;
    private TextView s;
    private og t;
    private fe u;
    private Handler v;
    private EditText w;
    private za z;

    public RegisterName()
    {
        m = new r4(this);
        v = new a3u(this);
        z = new a8o(this);
        l = new _4(this);
    }

    static View a(RegisterName registername, View view)
    {
        registername.p = view;
        return view;
    }

    static aky a(aky aky1)
    {
        x = aky1;
        return aky1;
    }

    private String a()
    {
        Object obj;
        int j1;
        obj = null;
        j1 = App.am;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        Cursor cursor = getContentResolver().query(android.provider.ContactsContract.Profile.CONTENT_URI, new String[] {
            A[0]
        }, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        boolean flag = cursor.moveToFirst();
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj1 = cursor.getString(0);
_L5:
        cursor.close();
_L3:
        obj = obj1;
        if (obj1 == null)
        {
            AccountManager accountmanager = AccountManager.get(App.au.getApplicationContext());
            obj = obj1;
            if (accountmanager != null)
            {
                Account aaccount[] = accountmanager.getAccounts();
                obj = obj1;
                if (aaccount != null)
                {
                    int k1 = aaccount.length;
                    int i1 = 0;
label0:
                    do
                    {
label1:
                        {
                            obj = obj1;
                            if (i1 >= k1)
                            {
                                break label0;
                            }
                            Account account = aaccount[i1];
                            obj = obj1;
                            boolean flag1;
                            try
                            {
                                if (!account.type.equals(A[2]))
                                {
                                    break label1;
                                }
                                flag1 = account.name.contains("@");
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                throw obj;
                            }
                            if (flag1)
                            {
                                obj = account.name.substring(0, account.name.indexOf("@")).replace('.', ' ');
                                if (j1 == 0)
                                {
                                    break label0;
                                }
                            }
                            obj1 = account.name.replace('.', ' ');
                            obj = obj1;
                            if (j1 == 0)
                            {
                                break label0;
                            }
                            obj = obj1;
                        }
                        i1++;
                        obj1 = obj;
                    } while (j1 == 0);
                }
            }
        }
        return ((String) (obj));
        obj1;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
_L4:
        Log.e((new StringBuilder()).append(A[1]).append(((Exception) (obj1)).toString()).toString());
        obj1 = obj;
          goto _L3
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
          goto _L4
_L2:
        obj1 = null;
          goto _L5
        obj1 = null;
          goto _L3
    }

    public static void a(Context context, String s1)
    {
        Intent intent = b();
        Intent intent1 = new Intent();
        intent1.putExtra(A[34], intent);
        intent1.putExtra(A[33], false);
        intent1.putExtra(A[35], s1);
        intent1.putExtra(A[32], android.content.Intent.ShortcutIconResource.fromContext(context, 0x7f020570));
        intent1.setAction(A[36]);
        context.sendBroadcast(intent1);
    }

    public static void a(Context context, String s1, int i1)
    {
        Intent intent;
label0:
        {
            if (i1 == 0)
            {
                intent = new Intent();
                intent.setClassName(A[16], A[18]);
                intent.addFlags(0x10000000);
                intent.addFlags(0x4000000);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            intent = b();
        }
        Intent intent1 = new Intent();
        try
        {
            intent1.putExtra(A[19], Intent.parseUri(intent.toUri(0), 0));
        }
        catch (URISyntaxException urisyntaxexception)
        {
            Log.e((new StringBuilder()).append(A[15]).append(urisyntaxexception.getMessage()).toString());
        }
        intent1.putExtra(A[20], s1);
        intent1.setAction(A[17]);
        context.sendBroadcast(intent1);
    }

    private void a(Bitmap bitmap)
    {
        o.setImageBitmap(bitmap);
    }

    static void a(RegisterName registername)
    {
        registername.f();
    }

    public static Intent b()
    {
        Intent intent = new Intent();
        intent.setClassName(A[29], A[28]);
        intent.setAction(A[30]);
        intent.addCategory(A[31]);
        intent.addFlags(0x10000000);
        intent.addFlags(0x200000);
        return intent;
    }

    static void b(RegisterName registername)
    {
        registername.g();
    }

    static dw c(RegisterName registername)
    {
        return registername.n;
    }

    static TextView d(RegisterName registername)
    {
        return registername.s;
    }

    static android.view.View.OnTouchListener e(RegisterName registername)
    {
        return registername.l;
    }

    static EditText f(RegisterName registername)
    {
        return registername.w;
    }

    private void f()
    {
        long l1 = m();
        if (l1 > 0L && System.currentTimeMillis() - l1 > y && p != null)
        {
            p.setVisibility(0);
        }
    }

    static Handler g(RegisterName registername)
    {
        return registername.v;
    }

    private void g()
    {
label0:
        {
            Log.i(A[41]);
            String s1 = com.whatsapp.util.c.a(((EditText)findViewById(0x7f0b0275)).getText().toString().trim());
            if (s1.length() == 0)
            {
                Log.w(A[40]);
                App.b(this, 0x7f0e031e, 0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (x == null || aky.a(x))
            {
                ((App)getApplication()).z(s1);
                App.t(s1);
                App.d(this, false);
                x = new aky(this, m);
                if (App.O())
                {
                    showDialog(0);
                }
                if (((CheckBox)findViewById(0x7f0b027b)).isChecked())
                {
                    a(this, getString(0x7f0e0047));
                }
                if (p != null)
                {
                    p.setVisibility(8);
                }
                k();
                v.sendEmptyMessageDelayed(0, y);
            }
        }
    }

    private Dialog h()
    {
        q = new di(this, this);
        q.setCancelable(false);
        return q;
    }

    static View h(RegisterName registername)
    {
        return registername.p;
    }

    private Dialog i()
    {
        n = new dw(this);
        n.setCancelable(false);
        return n;
    }

    static void i(RegisterName registername)
    {
        registername.n();
    }

    static aky j()
    {
        return x;
    }

    static og j(RegisterName registername)
    {
        return registername.t;
    }

    static fe k(RegisterName registername)
    {
        return registername.u;
    }

    private void k()
    {
        android.content.SharedPreferences.Editor editor = getSharedPreferences(A[26], 0).edit();
        editor.putLong(A[25], System.currentTimeMillis());
        if (!editor.commit())
        {
            Log.w(A[27]);
        }
    }

    private void l()
    {
        float f1;
        Bitmap bitmap1;
        int i1;
        i1 = getResources().getDimensionPixelSize(0x7f0a0054);
        f1 = getResources().getDimension(0x7f0a0053);
        bitmap1 = null;
        if (t != null && !a9g.a(t.a)) goto _L2; else goto _L1
_L1:
        Bitmap bitmap;
        o.setEnabled(false);
        r.setVisibility(0);
        if (k == null)
        {
            k = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ALPHA_8);
        }
        bitmap = k;
_L4:
        a(bitmap);
        return;
_L2:
        o.setEnabled(true);
        r.setVisibility(8);
        if (t.h().exists())
        {
            bitmap1 = t.a(i1, f1, false);
        }
        bitmap = bitmap1;
        if (bitmap1 == null)
        {
            bitmap = og.a(0x7f020096, i1, f1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private long m()
    {
        return getSharedPreferences(A[43], 0).getLong(A[42], -1L);
    }

    private void n()
    {
        android.content.SharedPreferences.Editor editor = getSharedPreferences(A[37], 0).edit();
        editor.remove(A[38]);
        if (!editor.commit())
        {
            Log.w(A[39]);
        }
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

    protected void b()
    {
        App.Me me;
        int i1;
label0:
        {
            i1 = App.am;
            if (getIntent().getExtras() != null && getIntent().getBooleanExtra(A[46], false))
            {
                me = App.Z;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            me = App.q(this);
        }
        me.jabber_id = App.b(App.au);
        if (me.jabber_id != null) goto _L2; else goto _L1
_L1:
        Log.e(A[47]);
        App.d(this, 1);
        startActivity(new Intent(this, com/whatsapp/RegisterPhone));
        finish();
_L4:
        return;
_L2:
        if (!App.a(me))
        {
            finish();
            return;
        }
        App.Z = me;
        ProfilePhotoReminder.j = true;
        Log.i(A[48]);
        App.q = false;
        App.m(getApplication());
        App.q();
        MessageService.b(App.au);
        Log.i(A[44]);
        App.j();
        t = App.az.f();
        App.a(t.a, 0, 2);
        l();
        r.setVisibility(0);
        if (q == null) goto _L4; else goto _L3
_L3:
        if (App.ah.n() == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(A[45]);
        q.a(2);
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        removeDialog(103);
        return;
    }

    public void b(String s1)
    {
    }

    protected void b(boolean flag)
    {
        super.b(flag);
        if (q != null && flag)
        {
            q.a(1);
        }
    }

    public void c(String s1)
    {
    }

    public void d(String s1)
    {
        if (t != null && s1.equals(t.a))
        {
            l();
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        int k1 = App.am;
        i1;
        JVM INSTR tableswitch 12 13: default 28
    //                   12 29
    //                   13 85;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (j1 != -1) goto _L1; else goto _L4
_L4:
        if (intent == null || !intent.getBooleanExtra(A[3], false))
        {
            break; /* Loop/switch isn't completed */
        }
        qk.a(t, this);
        l();
        if (k1 == 0) goto _L1; else goto _L5
_L5:
        qk.a(intent, t, this, 13, this);
        if (k1 == 0) goto _L1; else goto _L3
_L3:
        com.whatsapp.qk.c().delete();
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!qk.b(t, this)) goto _L1; else goto _L6
_L6:
        l();
        if (k1 == 0) goto _L1; else goto _L7
_L7:
        if (j1 != 0 || intent == null) goto _L1; else goto _L8
_L8:
        qk.a(intent, this);
        return;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (n != null)
        {
            n.a();
            n.b();
            f();
        }
        if (q != null)
        {
            q.a();
        }
        u.a(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        int i1;
label0:
        {
label1:
            {
                i1 = App.am;
                Log.i(A[6]);
                super.onCreate(bundle);
                getSupportActionBar().setDisplayShowCustomEnabled(true);
                setContentView(0x7f03009b);
                int j1 = App.f(this);
                if (j1 == 2)
                {
                    break label0;
                }
                if (j1 == 3)
                {
                    Log.i(A[4]);
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                Log.e(A[8]);
            }
            startActivity(new Intent(this, com/whatsapp/Main));
            finish();
            return;
        }
label2:
        {
            if (App.b(App.au) == null)
            {
                Log.e(A[7]);
                App.d(this, 1);
                startActivity(new Intent(this, com/whatsapp/RegisterPhone));
                finish();
                return;
            }
            hb.a(this, getSupportActionBar(), getString(0x7f0e02a2), new t_(this));
            if (App.u == 0 || Build.MANUFACTURER.startsWith(A[14]))
            {
                findViewById(0x7f0b0279).setVisibility(8);
                ((CheckBox)findViewById(0x7f0b027b)).setChecked(false);
                findViewById(0x7f0b0130).setVisibility(8);
                findViewById(0x7f0b0133).setVisibility(8);
                if (i1 == 0)
                {
                    break label2;
                }
            }
            ((CheckBox)findViewById(0x7f0b027b)).setChecked(true);
            findViewById(0x7f0b0279).setOnClickListener(new ff(this));
        }
label3:
        {
label4:
            {
label5:
                {
                    s = (TextView)findViewById(0x7f0b0278);
                    s.setText(Integer.toString(25));
                    findViewById(0x7f0b01bf).setOnClickListener(new aoi(this));
                    u = new fe(this);
                    u.a(z);
                    o = (ImageView)findViewById(0x7f0b0256);
                    o.setOnClickListener(new rf(this));
                    r = findViewById(0x7f0b0152);
                    if (x != null)
                    {
                        t = App.az.f();
                        l();
                        showDialog(0);
                        if (i1 == 0)
                        {
                            break label3;
                        }
                    }
                    if (App.ah.i())
                    {
                        break label4;
                    }
                    bundle = Environment.getExternalStorageState();
                    Log.i((new StringBuilder()).append(A[9]).append(bundle).toString());
                    if (!bundle.equals(A[11]) && !bundle.equals(A[12]))
                    {
                        showDialog(102);
                        if (i1 == 0)
                        {
                            break label5;
                        }
                    }
                    e();
                }
                if (i1 == 0)
                {
                    break label3;
                }
            }
            Log.i(A[5]);
            App.ah.u();
            App.aw();
            App.au.aK();
            b();
        }
label6:
        {
            w = (EditText)findViewById(0x7f0b0275);
            iz.a(w);
            w.addTextChangedListener(new vr(this));
            w.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(25)
            });
            bundle = a();
            if (!TextUtils.isEmpty(bundle))
            {
                w.setText(bundle);
                w.setSelection(w.length());
            }
            if (App.au.aa())
            {
                Log.w(A[13]);
                Conversations.a(this, 113);
                if (i1 == 0)
                {
                    break label6;
                }
            }
            if (App.aU())
            {
                Log.w(A[10]);
                Conversations.a(this, 114);
            }
        }
        App.d(this, 2);
        App.b(this);
    }

    protected Dialog onCreateDialog(int i1)
    {
        i1;
        JVM INSTR lookupswitch 4: default 44
    //                   0: 52
    //                   1: 121
    //                   103: 107
    //                   109: 186;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Dialog dialog = super.onCreateDialog(i1);
_L7:
        return dialog;
_L2:
        Dialog dialog1;
        Log.i(A[49]);
        dialog1 = i();
        dialog = dialog1;
        if (x != null) goto _L7; else goto _L6
_L6:
        Log.w(A[50]);
        (new Handler()).postDelayed(new au7(this), 3L);
        return dialog1;
_L4:
        Log.i(A[51]);
        return h();
_L3:
        Log.w(A[52]);
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0208).setMessage(getString(0x7f0e0206, new Object[] {
            getString(0x7f0e00c6)
        })).setPositiveButton(0x7f0e0207, new ls(this)).create();
_L5:
        Log.w(A[53]);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e033d).setPositiveButton(0x7f0e008f, new ww(this)).setNeutralButton(0x7f0e007b, new q3(this)).setOnCancelListener(new vt(this)).create();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i(A[24]);
        App.a(true, false);
        App.a(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 0: // '\0'
            e(A[23]);
            return true;

        case 1: // '\001'
            App.g(this);
            break;
        }
        finish();
        return true;
    }

    public void onPause()
    {
        super.onPause();
        if (x != null)
        {
            x.a();
        }
    }

    public void onResume()
    {
        Log.i(A[22]);
        super.onResume();
        a(true);
        if (x != null)
        {
            showDialog(0);
            x.a(m);
            f();
        }
        if (App.f(this) == 3 && n == null)
        {
            showDialog(0);
            Log.i(A[21]);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[54];
        obj = "A{2?aDk\036!lHw";
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
                obj = "Ww&&~Qw3!lHwn(hQ\177$!lHwa";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "F},ajJ}&#h";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "La\036=hVw5";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "Ww&&~Qw3!lHwn,\177@s5*\"Ww&&~Q` ;dJ|a.aWw +t\005d$=dC{$+-G}4!n@25 -Hs(!";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "Ww&&~Qw3!lHwn\"~Ba5 \177@=)*lIf)6";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "Ww&&~Qw3!lHwn,\177@s5*";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "Ww&&~Qw3!lHwn,\177@s5*\"H{2<dKul?lWs,<-G}4!n@25 -Ww&?eJ|$";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "Ww&&~Qw3!lHwn,\177@s5*\"Gs%b~Qs5*-G}4!n@25 -Hs(!";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "Ww&&~Qw3!lHwn,aLq**i\na%,lWv2;lQwa";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "Ww&&~Qw3!lHwn<z\bw9?dWw%";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "H}4!y@v";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "H}4!y@v\036=b";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                obj = "Ww&&~Qw3!lHwn,aJq*bzW}/(";
                byte0 = 12;
                i1 = 13;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "v}/6";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "Fs/!bQ21.\177Vwa<eJ`5,xQ24=d\005";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "F},azMs5<lUb";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "F},alKv3 dA<-.xKq)*\177\013s\";dJ|o\032Cl\\\022\033Li^\036\034Ej@\025\fXq";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                obj = "F},azMs5<lUbo\002lL|";
                byte0 = 17;
                i1 = 18;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "D|%=bLvo&cQw/;#@j5=l\013a) \177Qq4;#l\\\025\nCq";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "D|%=bLvo&cQw/;#@j5=l\013a) \177Qq4;#kS\f\n";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "Ww&&~Qw3!lHwn=hVg,*-Ww&o{@`()d@vzoh]b-&nLf-6-A{2?aDka,bKf(!x@22,\177@w/";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "Ww&&~Qw3!lHwn=hVg,*";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "Ww&&~Qw3bcD\177$";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "Ww&&~Qw3!lHwn+hVf3 t";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "F},azMs5<lUbo=hB{2;hW| \"h\013{/&yLs-&w@`\036<yD`5\020yL\177$";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "F},azMs5<lUb\036?\177@t$=hKq$<";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "Ww&&~Qw3!lHwn<hQ{/&yLs-&w@`5&`@=$=\177J`";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "F},azMs5<lUbo\002lL|";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "F},azMs5<lUb";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "D|%=bLvo&cQw/;#Dq5&bK<\f\016Dk";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "D|%=bLvo&cQw/;#Fs5*jJ`8aAdG\017\fE`@";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "D|%=bLvo&cQw/;#@j5=l\013a) \177Qq4;#lQ\016\001RwW\022\000XwQ\004";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "Ag1#dFs5*";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "D|%=bLvo&cQw/;#@j5=l\013a) \177Qq4;#l\\\025\nCq";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "D|%=bLvo&cQw/;#@j5=l\013a) \177Qq4;#kS\f\n";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "F},alKv3 dA<-.xKq)*\177\013s\";dJ|o\006CvF\000\003AzA\t\000_qQ\024\033";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                obj = "F},azMs5<lUb\036?\177@t$=hKq$<";
                byte0 = 36;
                i1 = 37;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "F},azMs5<lUbo=hB{2;hW| \"h\013{/&yLs-&w@`\036<yD`5\020yL\177$";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "Ww&&~Qw3!lHwn,a@s3;dK{5&lI{;*\177Q{,*\"@`3 \177";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "Ww&&~Qw3!lHwn!b\bb4<eKs,*";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "Ww&&~Qw3!lHwn<yD`5";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "F},azMs5<lUbo=hB{2;hW| \"h\013{/&yLs-&w@`\036<yD`5\020yL\177$";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "F},azMs5<lUb\036?\177@t$=hKq$<";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "Ww&!lHwn\"~Ba5 \177@d$=dC{$+\"B`.:}za8!nz`$>xL`$+";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "Ww&&~Qw3!lHwn=hVf.=hA{ #bB=\" cB` ;~";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "Aw#:j";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "Ww&&~Qw3!lHwn\"hVa (hVf.=hSw3&kLw%``La2&cB?1.\177D\1772ooJg/,h\005f.o\177@u1'bKw";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "Ww&&~Qw3!lHwn<hQM%&\177Qk";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "Ww&&~Qw3!lHwn+dD~.(\"L|(;}W}&=hVa";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "Ww&&~Qw3!lHwn+dD~.(\"L|(;}W}&=hVan&cLfl!xI~n=hH}7*";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "Ww&&~Qw3!lHwn+dD~.(\"Ww2;bWw";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "Ww&&~Qw3!lHwn+dD~.(\"Cs(#hA?/*y";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "Ww&&~Qw3!lHwn+dD~.(\"Fs/; F}/!hFf";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i1] = ((String) (obj));
                A = as;
                y = 0x927c0L;
                x = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1280
    //                   0 1303
    //                   1 1310
    //                   2 1317
    //                   3 1324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1324;
_L3:
        byte byte1 = 13;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 37;
          goto _L9
_L5:
        byte1 = 18;
          goto _L9
_L6:
        byte1 = 65;
          goto _L9
        byte1 = 79;
          goto _L9
    }
}
