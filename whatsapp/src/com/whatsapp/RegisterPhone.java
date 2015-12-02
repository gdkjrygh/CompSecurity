// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            EnterPhoneNumber, App, asy, a8z, 
//            a_3, RegisterName, iz, Main, 
//            ku, atq, sc, atw, 
//            Conversations, rd, ll, r, 
//            VerifyNumber, adc, u4, abq, 
//            o4, u5

public class RegisterPhone extends EnterPhoneNumber
{

    private static final String G[];
    private Dialog A;
    private String B;
    private Runnable C;
    private boolean D;
    private boolean E;
    private boolean F;

    public RegisterPhone()
    {
        D = false;
        F = false;
    }

    public static int a(EditText edittext)
    {
        int i1;
        int j1;
        int l1;
        i1 = 0;
        l1 = App.am;
        boolean flag;
        try
        {
            flag = edittext.isFocused();
        }
        // Misplaced declaration of an exception variable
        catch (EditText edittext)
        {
            throw edittext;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        j1 = -1;
_L4:
        return j1;
_L2:
        String s;
        int l;
        s = edittext.getText().toString();
        l = 0;
_L6:
        j1 = l;
        if (i1 >= edittext.getSelectionEnd()) goto _L4; else goto _L3
_L3:
        j1 = s.length();
        if (i1 <= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = l;
        if (l1 == 0) goto _L4; else goto _L5
_L5:
        char c1 = s.charAt(i1);
        int k1 = l;
        if (c1 <= '9')
        {
            char c2;
            try
            {
                c2 = s.charAt(i1);
            }
            // Misplaced declaration of an exception variable
            catch (EditText edittext)
            {
                throw edittext;
            }
            k1 = l;
            if (c2 >= '0')
            {
                k1 = l + 1;
            }
        }
        i1++;
        l = k1;
        if (l1 != 0)
        {
            return k1;
        }
          goto _L6
        edittext;
        try
        {
            throw edittext;
        }
        // Misplaced declaration of an exception variable
        catch (EditText edittext) { }
        try
        {
            throw edittext;
        }
        // Misplaced declaration of an exception variable
        catch (EditText edittext) { }
        throw edittext;
    }

    static Dialog a(RegisterPhone registerphone)
    {
        return registerphone.A;
    }

    static Dialog a(RegisterPhone registerphone, Dialog dialog)
    {
        registerphone.A = dialog;
        return dialog;
    }

    private static String a(byte abyte0[])
    {
        int i1 = App.am;
        if (abyte0 == null)
        {
            try
            {
                abyte0 = G[50];
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            return abyte0;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = abyte0.length;
        int l = 0;
        do
        {
            if (l >= j1)
            {
                break;
            }
            byte byte0 = abyte0[l];
            stringbuilder.append(String.format(G[49], new Object[] {
                Byte.valueOf(byte0)
            }));
            l++;
        } while (i1 == 0);
        return stringbuilder.toString();
    }

    private void a()
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.putString(G[36], z);
            if (!editor.commit())
            {
                Log.w(G[37]);
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    private static void a(EditText edittext, int l)
    {
        String s;
        int i1;
        int j1;
        int i2;
        j1 = 0;
        i2 = App.am;
        s = edittext.getText().toString();
        boolean flag = false;
        i1 = l;
        l = ((flag) ? 1 : 0);
_L2:
        int l1;
        l1 = l;
        if (j1 >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = l;
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = s.charAt(j1);
        int k1 = i1;
        if (l1 <= 57)
        {
            try
            {
                l1 = s.charAt(j1);
            }
            // Misplaced declaration of an exception variable
            catch (EditText edittext)
            {
                throw edittext;
            }
            k1 = i1;
            if (l1 >= 48)
            {
                k1 = i1 - 1;
            }
        }
        l1 = l + 1;
        j1++;
        l = l1;
        i1 = k1;
        if (i2 == 0) goto _L2; else goto _L1
_L1:
        edittext.setSelection(l1);
        return;
        edittext;
        throw edittext;
    }

    static void a(RegisterPhone registerphone, String s)
    {
        registerphone.a(s);
    }

    private void a(String s)
    {
        try
        {
            Log.i((new StringBuilder()).append(G[52]).append(s).append(G[53]).append(asy.f(s)).toString());
        }
        catch (IOException ioexception)
        {
            Log.a((new StringBuilder()).append(G[51]).append(s).append(G[54]).toString(), ioexception);
        }
        if (u.e != null)
        {
            u.c.removeTextChangedListener(u.e);
        }
        try
        {
            u.e = new a_3(asy.f(s));
            u.c.addTextChangedListener(u.e);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.a(G[55], s);
        }
        break MISSING_BLOCK_LABEL_171;
        s;
        throw s;
        s;
        Log.a(G[56], s);
        return;
    }

    static boolean a(RegisterPhone registerphone, boolean flag)
    {
        registerphone.E = flag;
        return flag;
    }

    static String b(RegisterPhone registerphone)
    {
        return registerphone.i();
    }

    private void b()
    {
        Log.i(G[38]);
        y = 7;
        f();
        g("");
        w = null;
        s = 0L;
        a(false);
        App.b(App.au, c(w));
        App.e(App.au, null);
    }

    public static void b(EditText edittext, int l)
    {
        int i1;
        int j1;
        i1 = App.am;
        j1 = edittext.getText().length();
        if (l <= -1 || l > j1)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        edittext.requestFocus();
        a(edittext, l);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (l > j1)
        {
            try
            {
                edittext.requestFocus();
                edittext.setSelection(j1);
            }
            // Misplaced declaration of an exception variable
            catch (EditText edittext)
            {
                throw edittext;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_62;
            }
        }
        edittext.setSelection(j1);
        return;
        edittext;
        try
        {
            throw edittext;
        }
        // Misplaced declaration of an exception variable
        catch (EditText edittext) { }
        throw edittext;
    }

    static void c(RegisterPhone registerphone)
    {
        registerphone.a();
    }

    static String d(RegisterPhone registerphone)
    {
        return registerphone.j();
    }

    static Runnable e(RegisterPhone registerphone)
    {
        return registerphone.C;
    }

    static String f(RegisterPhone registerphone)
    {
        return registerphone.B;
    }

    static boolean g(RegisterPhone registerphone)
    {
        return registerphone.E;
    }

    private void h()
    {
        boolean flag;
        try
        {
            flag = v;
        }
        catch (NullPointerException nullpointerexception)
        {
            try
            {
                throw nullpointerexception;
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        super.b(G[14]);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        super.b(G[15]);
        return;
    }

    static void h(RegisterPhone registerphone)
    {
        registerphone.b();
    }

    private String i()
    {
        return getPreferences(0).getString(G[13], "");
    }

    static void i(RegisterPhone registerphone)
    {
        registerphone.k();
    }

    private String j()
    {
        return getPreferences(0).getString(G[57], "");
    }

    private void k()
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.putString(G[33], t);
            if (!editor.commit())
            {
                Log.w(G[34]);
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    protected void b(boolean flag)
    {
        App.a(this, t, z);
        y = 7;
        f();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        NullPointerException nullpointerexception;
        try
        {
            flag = j;
        }
        catch (NullPointerException nullpointerexception1)
        {
            try
            {
                throw nullpointerexception1;
            }
            catch (NullPointerException nullpointerexception2)
            {
                throw nullpointerexception2;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        e();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        App.d(this, 2);
        startActivity(new Intent(this, com/whatsapp/RegisterName));
        finish();
        return;
        nullpointerexception;
        throw nullpointerexception;
    }

    protected void f()
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.putInt(G[4], y);
            if (!editor.commit())
            {
                Log.w(G[5]);
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        if (l == 0)
        {
            if (i1 == -1)
            {
                t = intent.getStringExtra(G[20]);
                B = intent.getStringExtra(G[19]);
                u.b.setText(t);
                u.d.setText(B);
                a(B);
                intent = getPreferences(0);
                android.content.SharedPreferences.Editor editor = intent.edit();
                try
                {
                    editor.putString(G[22], t);
                    editor.putString(G[23], t);
                    if (intent.getInt(G[21], -1) == -1)
                    {
                        editor.putInt(G[17], 0x7fffffff);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    throw intent;
                }
                try
                {
                    editor.putInt(G[16], -1);
                    if (!editor.commit())
                    {
                        Log.w(G[18]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    throw intent;
                }
            }
            E = false;
        }
        u.b.addTextChangedListener(u.h);
    }

    protected void onCreate(Bundle bundle)
    {
        int l;
        l = App.am;
        Log.i(G[59]);
        super.onCreate(bundle);
        setContentView(iz.a(getLayoutInflater(), 0x7f03009c, null, false, new int[] {
            0x7f0b00fc
        }));
        if (App.f(this) == 1) goto _L2; else goto _L1
_L1:
        Log.e(G[65]);
        startActivity(new Intent(this, com/whatsapp/Main));
        finish();
_L4:
        return;
_L2:
        boolean flag;
        if (getIntent().getExtras() == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        flag = getIntent().getBooleanExtra(G[70], false);
        if (flag)
        {
            try
            {
                b();
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (!getIntent().getBooleanExtra(G[58], false))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        F = true;
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        try
        {
            F = false;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (!getIntent().getBooleanExtra(G[69], false))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        Log.i(G[67]);
        f(getString(0x7f0e0339, new Object[] {
            getString(0x7f0e02ba)
        }));
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        try
        {
            F = false;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        App.z.listen(this.l, 1535);
        u = new a8z();
        u.b = (EditText)findViewById(0x7f0b00fd);
        u.d = (TextView)findViewById(0x7f0b01b1);
        u.c = (EditText)findViewById(0x7f0b00fe);
        ((TextView)findViewById(0x7f0b01b0)).setText(getString(0x7f0e0326).toUpperCase());
        ((TextView)findViewById(0x7f0b01b2)).setText(getString(0x7f0e0327).toUpperCase());
        bundle = new android.text.InputFilter.LengthFilter(3);
        u.b.setFilters(new InputFilter[] {
            bundle
        });
        bundle = new android.text.InputFilter.LengthFilter(17);
        u.c.setFilters(new InputFilter[] {
            bundle
        });
        if (getPreferences(0).getString(G[62], null) == null)
        {
            Object obj = App.z.getNetworkCountryIso();
            if (obj != null)
            {
                try
                {
                    bundle = asy.a(((String) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.e((new StringBuilder()).append(G[64]).append(((String) (obj))).append(G[68]).toString());
                    bundle = null;
                }
                if (bundle != null)
                {
                    obj = getPreferences(0).edit();
                    boolean flag1;
                    try
                    {
                        ((android.content.SharedPreferences.Editor) (obj)).putString(G[60], bundle);
                        if (!((android.content.SharedPreferences.Editor) (obj)).commit())
                        {
                            Log.w(G[63]);
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bundle bundle)
                    {
                        throw bundle;
                    }
                }
            }
        }
        u.h = new ku(this);
        u.b.addTextChangedListener(u.h);
        bundle = new atq(this);
        u.d.setOnClickListener(bundle);
        u.c.requestFocus();
        u.c.setCursorVisible(true);
        C = new sc(this);
        bundle = (Button)findViewById(0x7f0b01b3);
        try
        {
            bundle.setOnClickListener(new atw(this));
            if (t != null)
            {
                u.b.setText(t);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        bundle = u.d.getText().toString();
        if (bundle != null)
        {
            try
            {
                if (bundle.length() > 0)
                {
                    a(bundle);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        try
        {
            x = e();
            if (getWindowManager().getDefaultDisplay().getHeight() <= 480)
            {
                getWindow().setSoftInputMode(3);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        flag1 = App.au.aa();
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.w(G[61]);
        Conversations.a(this, 113);
        if (l == 0) goto _L4; else goto _L3
_L3:
        if (!App.aU()) goto _L4; else goto _L5
_L5:
        Log.w(G[66]);
        Conversations.a(this, 114);
        return;
        bundle;
        throw bundle;
        bundle;
        throw bundle;
        bundle;
        throw bundle;
        bundle;
        throw bundle;
        bundle;
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        throw bundle;
    }

    protected Dialog onCreateDialog(int l)
    {
        l;
        JVM INSTR tableswitch 21 23: default 28
    //                   21 34
    //                   22 201
    //                   23 375;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onCreateDialog(l);
_L2:
        Log.i(G[27]);
        Object obj = getString(0x7f0e032a, new Object[] {
            iz.a(a(t, z))
        });
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(((CharSequence) (obj)));
        spannablestringbuilder.setSpan(new StyleSpan(1), 0, ((String) (obj)).length(), 33);
        obj = new SpannableStringBuilder(getString(0x7f0e02ba));
        ((SpannableStringBuilder) (obj)).setSpan(new StyleSpan(1), 0, ((SpannableStringBuilder) (obj)).length(), 33);
        A = (new android.app.AlertDialog.Builder(this)).setMessage(spannablestringbuilder).setCancelable(false).setPositiveButton(((CharSequence) (obj)), new rd(this)).setNeutralButton(0x7f0e031c, new ll(this)).create();
        A.setOnDismissListener(new r(this));
        return A;
_L3:
        String s;
        String s2;
        String s3;
        String s4;
        Log.w(G[30]);
        s3 = getString(0x7f0e0340);
        s4 = G[29];
        s2 = s4;
        s = s3;
        if (!G[26].equals(VerifyNumber.f())) goto _L6; else goto _L5
_L5:
        boolean flag = G[31].equals(App.z.getSubscriberId());
        s2 = s4;
        s = s3;
        if (flag)
        {
            s = (new StringBuilder()).append(s3).append(G[32]).append(getString(0x7f0e0172)).toString();
            Log.i(G[28]);
            s2 = G[25];
        }
_L6:
        return (new android.app.AlertDialog.Builder(this)).setMessage(s).setPositiveButton(0x7f0e031b, new adc(this, s2)).setNeutralButton(0x7f0e007b, new u4(this)).create();
        NullPointerException nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
_L4:
        Log.w(G[24]);
        String s1 = iz.a(VerifyNumber.a(t, z));
        s1 = (new StringBuilder()).append(getString(0x7f0e0343)).append("\n").append(s1).append("\n").append(getString(0x7f0e0342)).toString();
        return (new android.app.AlertDialog.Builder(this)).setMessage(s1).setNeutralButton(0x7f0e02ba, new abq(this)).create();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, 0x7f0e031b).setIcon(0x7f020542);
        if (App.l == 3)
        {
            menu.add(0, 1, 0, G[1]);
            menu.add(0, 2, 0, G[0]);
            menu.add(0, 3, 0, G[3]);
            menu.add(0, 4, 0, G[2]);
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        Log.i(G[35]);
        App.z.listen(l, 0);
        D = true;
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        try
        {
            super.onNewIntent(intent);
            if (intent.getBooleanExtra(G[11], false))
            {
                Log.i(G[12]);
                f(getString(0x7f0e0339, new Object[] {
                    getString(0x7f0e02ba)
                }));
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
        menuitem.getItemId();
        JVM INSTR tableswitch 0 4: default 254
    //                   0 40
    //                   1 49
    //                   2 59
    //                   3 141
    //                   4 146;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        h();
        return true;
        menuitem;
        throw menuitem;
_L3:
        App.g(this);
        finish();
        return true;
_L4:
        menuitem = u.b.getText().toString().replaceAll(G[7], "");
        String s = u.c.getText().toString().replaceAll(G[8], "");
        o4.a(o4.i(), App.r((new StringBuilder()).append(menuitem).append(s).toString()));
        return true;
_L5:
        o4.v();
        return true;
_L6:
        menuitem = u.b.getText().toString().replaceAll(G[10], "");
        String s1 = u.c.getText().toString().replaceAll(G[6], "");
        menuitem = o4.g(App.r((new StringBuilder()).append(menuitem).append(s1).toString()));
        Log.i((new StringBuilder()).append(G[9]).append(a(menuitem)).toString());
        return true;
_L1:
        return false;
    }

    public void onPause()
    {
        super.onPause();
        Log.i((new StringBuilder()).append(G[79]).append(y).toString());
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.putString(G[77], t);
            editor.putString(G[76], z);
            editor.putInt(G[78], y);
            editor.putString(G[72], u.c.getText().toString());
            editor.putString(G[74], u.b.getText().toString());
            editor.putBoolean(G[75], x);
            editor.putInt(G[71], a(u.b));
            editor.putInt(G[80], a(u.c));
            if (!editor.commit())
            {
                Log.w(G[73]);
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        App.b(App.au, c(w));
    }

    public void onResume()
    {
        Object obj;
        int l;
        l = App.am;
        super.onResume();
        obj = getPreferences(0);
        boolean flag;
        t = ((SharedPreferences) (obj)).getString(G[46], null);
        z = ((SharedPreferences) (obj)).getString(G[41], null);
        y = ((SharedPreferences) (obj)).getInt(G[45], 7);
        w = a(App.i(App.au));
        x = ((SharedPreferences) (obj)).getBoolean(G[43], false);
        flag = F;
        if (flag)
        {
            NullPointerException nullpointerexception;
            int i1;
            try
            {
                F = false;
                u.c.setText("");
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_148;
            }
        }
        u.c.setText(((SharedPreferences) (obj)).getString(G[47], null));
        u.b.setText(((SharedPreferences) (obj)).getString(G[44], null));
        b(u.c, ((SharedPreferences) (obj)).getInt(G[39], -1));
        b(u.b, ((SharedPreferences) (obj)).getInt(G[40], -1));
        Log.i((new StringBuilder()).append(G[48]).append(y).toString());
        i1 = y;
        i1;
        JVM INSTR tableswitch 15 15: default 268
    //                   15 291;
           goto _L1 _L2
_L1:
        NotificationManagerCompat.from(this).cancel(1);
        App.d(this, 1);
        u5.h();
        return;
        nullpointerexception;
        throw nullpointerexception;
_L2:
        nullpointerexception1 = t;
        if (nullpointerexception1 == null) goto _L4; else goto _L3
_L3:
        nullpointerexception1 = z;
        if (nullpointerexception1 != null)
        {
            break MISSING_BLOCK_LABEL_329;
        }
_L4:
        try
        {
            Log.i(G[42]);
            y = 7;
            f();
        }
        catch (NullPointerException nullpointerexception2)
        {
            throw nullpointerexception2;
        }
        if (l == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        showDialog(21);
        if (true) goto _L1; else goto _L5
_L5:
        NullPointerException nullpointerexception3;
        nullpointerexception3;
        throw nullpointerexception3;
        nullpointerexception3;
        throw nullpointerexception3;
        nullpointerexception3;
        throw nullpointerexception3;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int l;
        as = new String[81];
        obj = "~\000>\030QXR\t\034FR\004>\013\\";
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
                obj = "o\027(\034Q";
                l = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                obj = "q\035<YwX\0214\017@O\013";
                l = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[l] = ((String) (obj));
                l = 3;
                obj = "y\0277\034QXR\t\034FR\004>\013\\";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[l] = ((String) (obj));
                l = 4;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\-\034WT\0242\032DI\0334\027zN\006:\r@";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[l] = ((String) (obj));
                l = 5;
                obj = "O\027<\020VI\027)\tMR\034>VV\\\004>\nQ\\\006>VFR\0376\020Q\035\024:\020IX\026";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[l] = ((String) (obj));
                l = 6;
                obj = "a6";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[l] = ((String) (obj));
                l = 7;
                obj = "a6";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[l] = ((String) (obj));
                l = 8;
                obj = "a6";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[l] = ((String) (obj));
                l = 9;
                obj = "O\027<\020VI\027)TUU\0355\034\005O\021f";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[l] = ((String) (obj));
                l = 10;
                obj = "a6";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[l] = ((String) (obj));
                l = 11;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\/\030UM\027?&VP\001\004\025LS\031";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[l] = ((String) (obj));
                l = 12;
                obj = "O\027<\020VI\027)VUU\0355\034\nS\027,\020KI\0275\r\nQ\0335\022\nT\034(\rWH\021/\020JS\001t\035L\\\0364\036";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[l] = ((String) (obj));
                l = 13;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\013@K-+\021JS\027\004\027PP\020>\013";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[l] = ((String) (obj));
                l = 14;
                obj = "O\027<\020VI\027)TUU\0355\034\021";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[l] = ((String) (obj));
                l = 15;
                obj = "O\027<\020VI\027)TUU\0355\034";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[l] = ((String) (obj));
                l = 16;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\8\026PS\006)\000z^\035?\034zM\035(\020QT\0355";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[l] = ((String) (obj));
                l = 17;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\021JS\027\004\027PP\020>\013zM\035(\020QT\0355";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[l] = ((String) (obj));
                l = 18;
                obj = "O\027<\020VI\027)\tMR\034>VD^\006)\034VH\036/VFR\0376\020Q\035\024:\020IX\026";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[l] = ((String) (obj));
                l = 19;
                obj = "^\035.\027QO\013\004\027DP\027";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[l] = ((String) (obj));
                l = 20;
                obj = "^\021";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[l] = ((String) (obj));
                l = 21;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\021JS\027\004\027PP\020>\013zM\035(\020QT\0355";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[l] = ((String) (obj));
                l = 22;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\2\027UH\006\004\032JH\034/\013\\b\0214\035@";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[l] = ((String) (obj));
                l = 23;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\8\026PS\006)\000z^\035?\034";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[l] = ((String) (obj));
                l = 24;
                obj = "O\027<\020VI\027)VUU\0355\034\nY\033:\025JZ]9\030K";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[l] = ((String) (obj));
                l = 25;
                obj = "O\027<\020VI\027)TUU\0355\034\026";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[l] = ((String) (obj));
                l = 26;
                obj = "\fGnL\020\017CcH\026\b";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[l] = ((String) (obj));
                l = 27;
                obj = "O\027<\020VI\027)VUU\0355\034\nY\033:\025JZ]5\fHb\0214\027CT\0006";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[l] = ((String) (obj));
                l = 28;
                obj = "O\027<\020VI\027)VUU\0355\034\nH\034)\034FR\004>\013D_\036>VUR\001(\020GQ\027v\rD_\036>\r";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[l] = ((String) (obj));
                l = 29;
                obj = "O\027<\020VI\027)TUU\0355\034\027";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[l] = ((String) (obj));
                l = 30;
                obj = "O\027<\020VI\027)VUU\0355\034\nY\033:\025JZ].\027WX\0214\017@O\0239\025@\020\027)\013JO";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[l] = ((String) (obj));
                l = 31;
                obj = "\016Ck@\034\bBkI\025\rBkI\025";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[l] = ((String) (obj));
                l = 32;
                obj = "7x";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[l] = ((String) (obj));
                l = 33;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\013@K-8\026PS\006)\000z^\035?\034";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[l] = ((String) (obj));
                l = 34;
                obj = "O\027<\020VI\027)\tMR\034>VV\\\004>\tWX\0048\032\n^\0356\024LIR=\030LQ\027?";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[l] = ((String) (obj));
                l = 35;
                obj = "O\027<\020VI\027)VUU\0355\034\nY\027(\rWR\013";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[l] = ((String) (obj));
                l = 36;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\013@K-+\021JS\027\004\027PP\020>\013";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[l] = ((String) (obj));
                obj = "O\027<\020VI\027)\tMR\034>VV\\\004>\tWX\004+\021JS\0275\fH\022\0214\024HT\006{\037DT\036>\035";
                byte0 = 36;
                l = 37;
                break;

            case 36: // '$'
                as1[l] = ((String) (obj));
                l = 38;
                obj = "O\027<\020VI\027)VUU\0355\034\nO\027(\034Q\020\001/\030QX";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[l] = ((String) (obj));
                l = 39;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\021JS\027\004\027PP\020>\013zM\035(\020QT\0355";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[l] = ((String) (obj));
                l = 40;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\8\026PS\006)\000z^\035?\034zM\035(\020QT\0355";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[l] = ((String) (obj));
                l = 41;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\021JS\027\004\027PP\020>\013";
                byte0 = 40;
                break;

            case 40: // '('
                as1[l] = ((String) (obj));
                l = 42;
                obj = "O\027<\020VI\027)VUU\0355\034\nO\027(\034Q\020\001/\030QX";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[l] = ((String) (obj));
                l = 43;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\5\026zN\0277\037zN\0275\035";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[l] = ((String) (obj));
                l = 44;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\2\027UH\006\004\032JH\034/\013\\b\0214\035@";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[l] = ((String) (obj));
                l = 45;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\-\034WT\0242\032DI\0334\027zN\006:\r@";
                byte0 = 44;
                break;

            case 44: // ','
                as1[l] = ((String) (obj));
                l = 46;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\8\026PS\006)\000z^\035?\034";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[l] = ((String) (obj));
                l = 47;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\2\027UH\006\004\tMR\034>&KH\0379\034W";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[l] = ((String) (obj));
                l = 48;
                obj = "O\027<\020VI\027)VUU\0355\034\nO\027(\fHXR";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[l] = ((String) (obj));
                l = 49;
                obj = "\030Bi!";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[l] = ((String) (obj));
                l = 50;
                obj = "\025\034.\025I\024";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[l] = ((String) (obj));
                l = 51;
                obj = "O\027<\020VI\027)VUU\0355\034\n^\035.\027QO\013a";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[l] = ((String) (obj));
                l = 52;
                obj = "O\027<\020VI\027)VUU\0355\034\n^\035.\027QO\013a";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[l] = ((String) (obj));
                l = 53;
                obj = "\035\016{";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[l] = ((String) (obj));
                l = 54;
                obj = "\035\024:\020IX\026{\rJ\035\0364\026NH\002\030\026PS\006)\000d_\020);\\s\0236\034\005[\0004\024\005~\035.\027QO\013\013\021JS\027\022\027CR";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[l] = ((String) (obj));
                l = 55;
                obj = "O\027<\020VI\027)VUU\0355\034\n[\035)\024DI\006>\013\bX\n8\034UI\0334\027";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[l] = ((String) (obj));
                l = 56;
                obj = "O\027<\020VI\027)VUU\0355\034\n[\035)\024DI\006>\013\bX\n8\034UI\0334\027";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[l] = ((String) (obj));
                l = 57;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\013@K-8\026PS\006)\000z^\035?\034";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[l] = ((String) (obj));
                l = 58;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\8\025@\\\000\004\tMR\034>&KH\0379\034W";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[l] = ((String) (obj));
                l = 59;
                obj = "O\027<\020VI\027)VUU\0355\034\n^\000>\030QX";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[l] = ((String) (obj));
                l = 60;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\2\027UH\006\004\032JH\034/\013\\b\0214\035@";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[l] = ((String) (obj));
                obj = "O\027<\020VI\027)VUU\0355\034\n^\0364\032N\020\005)\026KZ";
                byte0 = 60;
                l = 61;
                break;

            case 60: // '<'
                as1[l] = ((String) (obj));
                l = 62;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\2\027UH\006\004\032JH\034/\013\\b\0214\035@";
                byte0 = 61;
                break;

            case 61: // '='
                as1[l] = ((String) (obj));
                l = 63;
                obj = "O\027<\020VI\027)VUU\0355\034\nT\034+\fQb\0218VFR\0376\020Q\035\024:\020IX\026";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[l] = ((String) (obj));
                l = 64;
                obj = "O\027<\020VI\027)VUU\0355\034\nT\0014C\005";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[l] = ((String) (obj));
                l = 65;
                obj = "O\027<\020VI\027)VUU\0355\034\n^\000>\030QX],\013JS\025v\nQ\\\006>YGR\0075\032@\035\0064YH\\\0335";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[l] = ((String) (obj));
                l = 66;
                obj = "O\027<\020VI\027)VUU\0355\034\nN\005v\034]M\033)\034A";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[l] = ((String) (obj));
                l = 67;
                obj = "O\027<\020VI\027)VUU\0355\034\nQ\0335\022\nT\034(\rWH\021/\020JS\001t\035L\\\0364\036";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[l] = ((String) (obj));
                l = 68;
                obj = "\035\024:\020IX\026{\rJ\035\0364\026NH\002\030\030IQ\0335\036fR\026>YCO\0356YfR\0075\rWD\"3\026KX;5\037J";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[l] = ((String) (obj));
                l = 69;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\/\030UM\027?&VP\001\004\025LS\031";
                byte0 = 68;
                break;

            case 68: // 'D'
                as1[l] = ((String) (obj));
                l = 70;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\)\034VX\006(\rDI\027";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[l] = ((String) (obj));
                l = 71;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\8\026PS\006)\000z^\035?\034zM\035(\020QT\0355";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[l] = ((String) (obj));
                l = 72;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\2\027UH\006\004\tMR\034>&KH\0379\034W";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[l] = ((String) (obj));
                l = 73;
                obj = "O\027<\020VI\027)VUU\0355\034\nM\023.\n@\022\0214\024HT\006{\037DT\036>\035";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[l] = ((String) (obj));
                l = 74;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\2\027UH\006\004\032JH\034/\013\\b\0214\035@";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[l] = ((String) (obj));
                l = 75;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\5\026zN\0277\037zN\0275\035";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[l] = ((String) (obj));
                l = 76;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\021JS\027\004\027PP\020>\013";
                byte0 = 75;
                break;

            case 75: // 'K'
                as1[l] = ((String) (obj));
                l = 77;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\8\026PS\006)\000z^\035?\034";
                byte0 = 76;
                break;

            case 76: // 'L'
                as1[l] = ((String) (obj));
                l = 78;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\-\034WT\0242\032DI\0334\027zN\006:\r@";
                byte0 = 77;
                break;

            case 77: // 'M'
                as1[l] = ((String) (obj));
                l = 79;
                obj = "O\027<\020VI\027)VUU\0355\034\nM\023.\n@\035";
                byte0 = 78;
                break;

            case 78: // 'N'
                as1[l] = ((String) (obj));
                l = 80;
                obj = "^\0356WRU\023/\nDM\002u+@Z\033(\r@O\"3\026KX\\+\021JS\027\004\027PP\020>\013zM\035(\020QT\0355";
                byte0 = 79;
                break;

            case 79: // 'O'
                as1[l] = ((String) (obj));
                G = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 1864
    //                   0 1887
    //                   1 1894
    //                   2 1901
    //                   3 1908;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1908;
_L3:
        byte byte1 = 37;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 61;
          goto _L9
_L5:
        byte1 = 114;
          goto _L9
_L6:
        byte1 = 91;
          goto _L9
        byte1 = 121;
          goto _L9
    }
}
