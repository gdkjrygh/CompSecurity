// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.fieldstats.o;
import com.whatsapp.protocol.ci;
import com.whatsapp.protocol.cj;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, a_9, mt, kj, 
//            asy, a_3, ft, iz, 
//            App, af, zt, RegisterPhone, 
//            hc, jp, m7, sl, 
//            auq

public class DeleteAccount extends DialogToastActivity
{

    private static String l;
    private static String u;
    private static final String z[];
    private int j;
    private cj k;
    private int m;
    private Handler n;
    private ci o;
    private TextWatcher p;
    EditText q;
    private String r;
    EditText s;
    boolean t;
    EditText v;
    private TextWatcher w;

    public DeleteAccount()
    {
        t = false;
        n = new a_9(this);
        k = new mt(this);
        o = new kj(this);
    }

    static Handler a(DeleteAccount deleteaccount)
    {
        return deleteaccount.n;
    }

    static String a()
    {
        return l;
    }

    static String a(String s1)
    {
        u = s1;
        return s1;
    }

    static void a(DeleteAccount deleteaccount, String s1)
    {
        deleteaccount.c(s1);
    }

    static ci b(DeleteAccount deleteaccount)
    {
        return deleteaccount.o;
    }

    static String b()
    {
        return u;
    }

    static String b(String s1)
    {
        l = s1;
        return s1;
    }

    static String c(DeleteAccount deleteaccount)
    {
        return deleteaccount.r;
    }

    private void c(String s1)
    {
        try
        {
            Log.i((new StringBuilder()).append(z[0]).append(s1).append(z[1]).append(asy.f(s1)).toString());
        }
        catch (IOException ioexception)
        {
            Log.e((new StringBuilder()).append(z[3]).append(s1).append(z[4]).append(ioexception.toString()).toString());
        }
        if (p != null)
        {
            v.removeTextChangedListener(p);
        }
        IOException ioexception1;
        try
        {
            p = new a_3(asy.f(s1));
            v.addTextChangedListener(p);
            return;
        }
        catch (IOException ioexception2)
        {
            Log.a((new StringBuilder()).append(z[6]).append(s1).append(z[2]).toString(), ioexception2);
        }
        break MISSING_BLOCK_LABEL_179;
        ioexception1;
        throw ioexception1;
        s1;
        Log.a(z[5], s1);
        return;
    }

    static TextWatcher d(DeleteAccount deleteaccount)
    {
        return deleteaccount.w;
    }

    static cj e(DeleteAccount deleteaccount)
    {
        return deleteaccount.k;
    }

    protected void onActivityResult(int i, int i1, Intent intent)
    {
        if (i == 0 && i1 == -1)
        {
            try
            {
                l = intent.getStringExtra(z[10]);
                r = intent.getStringExtra(z[11]);
                q.setText(l);
                s.setText(r);
                c(r);
                if (m == -1)
                {
                    m = 0x7fffffff;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            j = -1;
        }
        q.addTextChangedListener(w);
    }

    protected void onCreate(Bundle bundle)
    {
        Log.i(z[12]);
        super.onCreate(bundle);
        ft.a(o.DELETE_ACCOUNT);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(iz.a(getLayoutInflater(), 0x7f03005c, null, false, new int[] {
            0x7f0b00fc
        }));
        q = (EditText)findViewById(0x7f0b00fd);
        s = (EditText)findViewById(0x7f0b01b1);
        v = (EditText)findViewById(0x7f0b00fe);
        ((TextView)findViewById(0x7f0b01b0)).setText(getString(0x7f0e0326).toUpperCase());
        ((TextView)findViewById(0x7f0b01b2)).setText(getString(0x7f0e0327).toUpperCase());
        ((TextView)findViewById(0x7f0b01af)).setText(getString(0x7f0e0113, new Object[] {
            getString(0x7f0e03a6)
        }));
        bundle = new android.text.InputFilter.LengthFilter(3);
        q.setFilters(new InputFilter[] {
            bundle
        });
        bundle = new android.text.InputFilter.LengthFilter(17);
        v.setFilters(new InputFilter[] {
            bundle
        });
        bundle = App.z.getNetworkCountryIso();
        int i;
        int i1;
        if (bundle != null)
        {
            try
            {
                l = asy.a(bundle);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.e(z[14]);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        w = new af(this);
        q.addTextChangedListener(w);
        bundle = new zt(this);
        s.setOnClickListener(bundle);
        v.requestFocus();
        m = RegisterPhone.a(v);
        j = RegisterPhone.a(q);
        findViewById(0x7f0b01ae).setOnClickListener(new hc(this));
        bundle = (Button)findViewById(0x7f0b01b3);
        try
        {
            bundle.setOnClickListener(new jp(this));
            if (l != null)
            {
                q.setText(l);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        bundle = s.getText().toString();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        i = bundle.length();
        if (i > 0)
        {
            try
            {
                Log.i((new StringBuilder()).append(z[13]).append(bundle).append(z[16]).append(asy.f(bundle)).toString());
            }
            catch (IOException ioexception)
            {
                Log.a((new StringBuilder()).append(z[15]).append(bundle).append(z[17]).toString(), ioexception);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            c(bundle);
        }
        i1 = m7.e;
        i = i1;
        if (i1 == -1)
        {
            i = m7.c();
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        findViewById(0x7f0b01ad).setVisibility(0);
        return;
        bundle;
        throw bundle;
        bundle;
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
            progressdialog.setMessage(getString(0x7f0e031a));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 109: // 'm'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e033d).setPositiveButton(0x7f0e008f, new sl(this)).setNeutralButton(0x7f0e007b, new auq(this)).create();
        }
    }

    protected void onDestroy()
    {
        Log.i(z[7]);
        n.removeMessages(4);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 33
    //                   16908332 24;
           goto _L1 _L2
_L2:
        finish();
        return true;
        menuitem;
        throw menuitem;
_L1:
        return false;
    }

    public void onPause()
    {
        super.onPause();
        m = RegisterPhone.a(v);
        j = RegisterPhone.a(q);
        Log.i(z[8]);
    }

    public void onResume()
    {
        try
        {
            super.onResume();
            if (l != null)
            {
                q.setText(l);
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        try
        {
            if (r != null)
            {
                s.setText(r);
            }
        }
        catch (NullPointerException nullpointerexception1)
        {
            throw nullpointerexception1;
        }
        RegisterPhone.b(q, j);
        RegisterPhone.b(v, m);
        Log.i(z[9]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[18];
        obj = "?*x,#>bu*44:z=x8 a'#)6.";
        byte0 = -1;
        i = 0;
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
                as1[i] = ((String) (obj));
                obj = "{34";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "{,u<$>+4(9{\006[\f/8*d=>4!";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "?*x,#>bu*44:z=x8 a'#)6.i";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "=.}%2?o`&w7 {\"\"+\f{<9/=m\b59=V0\031:\"qi1) yi\0244:z=%\"\037|&9>\006z/8{";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "?*x,#>bu*44:z=x= f$6/;q;z>7w,'/&{'";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "?*x,#>bu*44:z=x8 a'#)6.";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "?*x,#>bu*44:z=x?*g=%46";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "?*x,#>bu*44:z=x+.a:2{";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "?*x,#>bu*44:z=x+'{'2t=q:\"6*";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "8,";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "8 a'#)6K'66*";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "?*x,#>bu*44:z=x8=q(#>";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "?*x,#>bu*44:z=x8 a'#)6.";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "?*x,#>bu*44:z=x2<{f44+qi1:&x,3{;{i0>;4*8?*4/%4\"4\n8.!`;.\013'{'2\022!r&";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "?*x,#>bu*44:z=x8 a'#)6.";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "{34";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "{)u ;>+4\n8.!`;.\013'{'2\022!r&y7 {\"\"+\f{<9/=m\b59=V0\031:\"qa~";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                z = as;
                l = null;
                u = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 484
    //                   0 507
    //                   1 514
    //                   2 521
    //                   3 528;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_528;
_L3:
        byte byte1 = 87;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 91;
          goto _L9
_L5:
        byte1 = 79;
          goto _L9
_L6:
        byte1 = 20;
          goto _L9
        byte1 = 73;
          goto _L9
    }
}
