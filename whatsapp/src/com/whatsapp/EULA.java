// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.a;
import com.whatsapp.util.an;
import com.whatsapp.util.c8;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.whatsapp:
//            UserFeedbackActivity, n1, App, RegisterPhone, 
//            InsufficientStorageSpaceActivity, Main, o4, of, 
//            a32, Conversations, c2, y3, 
//            aol, yv, l6, dd, 
//            akg, dn, ab, asm, 
//            az

public class EULA extends UserFeedbackActivity
{

    private static final String z[];
    private n1 j;

    public EULA()
    {
        j = n1.AGREE_NONE;
    }

    static n1 a(EULA eula, n1 n1_1)
    {
        eula.j = n1_1;
        return n1_1;
    }

    private void a()
    {
        b();
        findViewById(0x7f0b01dc).setBackgroundResource(0);
        findViewById(0x7f0b01dc).setBackgroundResource(0x7f02009a);
    }

    static void a(EULA eula)
    {
        eula.d();
    }

    private void b()
    {
label0:
        {
            if (getResources().getConfiguration().orientation == 1)
            {
                findViewById(0x7f0b0033).setVisibility(0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            findViewById(0x7f0b0033).setVisibility(8);
        }
    }

    private void d()
    {
        Log.i(z[2]);
        App.d(this, 1);
        Intent intent = new Intent(this, com/whatsapp/RegisterPhone);
        intent.putExtra(z[3], true);
        startActivity(intent);
        finish();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        a();
    }

    public void onCreate(Bundle bundle)
    {
        Log.i(z[10]);
        super.onCreate(bundle);
        setContentView(0x7f030066);
        try
        {
            if (App.aY() < 0x100000L)
            {
                startActivity((new Intent(this, com/whatsapp/InsufficientStorageSpaceActivity)).setFlags(0x10000000).putExtra(z[11], 0x100000L));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        a();
        if (App.f(this) == 0) goto _L2; else goto _L1
_L1:
        Log.e(z[8]);
        startActivity(new Intent(this, com/whatsapp/Main));
        finish();
_L4:
        return;
_L2:
        b();
        Object obj;
        int i;
        try
        {
            bundle = App.ar.a(10L, TimeUnit.SECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.w((new StringBuilder()).append(z[9]).append(bundle).toString());
            bundle = null;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        bundle = ((a) (bundle)).b;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        showDialog(6);
        i = App.am;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        try
        {
            if (com.whatsapp.o4.a() != null)
            {
                showDialog(8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        bundle = (Button)findViewById(0x7f0b01de);
        obj = new SpannableString(getText(0x7f0e0173));
        ((SpannableString) (obj)).setSpan(new UnderlineSpan(), 0, ((SpannableString) (obj)).length(), 0);
        bundle.setText(((CharSequence) (obj)));
        obj = (Button)findViewById(0x7f0b01df);
        try
        {
            bundle.setOnClickListener(new of(this));
            ((Button) (obj)).setOnClickListener(new a32(this));
            if (getIntent().getBooleanExtra(z[7], false))
            {
                showDialog(1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            App.d(this, 0);
            if (App.au.aa())
            {
                Log.w(z[6]);
                com.whatsapp.Conversations.a(this, 113);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (true) goto _L4; else goto _L3
_L3:
        bundle;
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        throw bundle;
    }

    public Dialog onCreateDialog(int i)
    {
        int k = App.am;
        i;
        JVM INSTR tableswitch 1 9: default 56
    //                   1 105
    //                   2 137
    //                   3 175
    //                   4 56
    //                   5 217
    //                   6 433
    //                   7 496
    //                   8 525
    //                   9 62;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6 _L7 _L8 _L9
_L1:
        return super.onCreateDialog(i);
_L9:
        android.app.AlertDialog alertdialog;
        try
        {
            alertdialog = (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0033).setMessage(0x7f0e0096).setPositiveButton(0x7f0e02ba, new c2(this)).create();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return alertdialog;
_L2:
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e031f).setPositiveButton(0x7f0e02ba, new y3(this)).create();
_L3:
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0033).setMessage(0x7f0e0355).setNeutralButton(0x7f0e02ba, new aol(this)).create();
_L4:
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0033).setMessage(getString(0x7f0e0172)).setNeutralButton(0x7f0e02ba, new yv(this)).create();
_L5:
        Object obj;
        boolean flag;
        try
        {
            obj = App.ar.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w((new StringBuilder()).append(z[5]).append(obj).toString());
            obj = null;
        }
        if (obj == null) goto _L11; else goto _L10
_L10:
        if (((a) (obj)).b == null) goto _L11; else goto _L12
_L12:
        flag = ((a) (obj)).b.isEmpty();
        if (!flag) goto _L13; else goto _L11
_L11:
        if (k == 0) goto _L14; else goto _L13
_L13:
        StringBuilder stringbuilder = new StringBuilder();
        obj = ((a) (obj)).b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            an an1 = (an)((Iterator) (obj)).next();
            stringbuilder.append('\t').append(an1.a).append('\n');
        } while (k == 0);
        stringbuilder.setLength(stringbuilder.length() - 1);
        obj = stringbuilder.toString();
_L16:
        android.app.AlertDialog.Builder builder;
        try
        {
            builder = new android.app.AlertDialog.Builder(this);
            i = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i <= 7)
        {
            i = 0x7f0e043e;
        } else
        {
            i = 0x7f0e043d;
        }
        return builder.setMessage(getString(i, new Object[] {
            obj
        })).setOnCancelListener(new l6(this)).create();
        obj;
        throw obj;
_L6:
        j = n1.AGREE_1;
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0033).setMessage(0x7f0e043c).setCancelable(false).setPositiveButton(0x7f0e0136, new dd(this)).setNegativeButton(0x7f0e02ba, new akg(this)).create();
_L7:
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e010c).setOnCancelListener(new dn(this)).create();
_L8:
        j = n1.AGREE_2;
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0033).setMessage(0x7f0e010b).setCancelable(false).setPositiveButton(0x7f0e0136, new ab(this)).setNegativeButton(0x7f0e02ba, new asm(this)).create();
_L14:
        obj = "";
        if (true) goto _L16; else goto _L15
_L15:
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, 0x7f0e031b).setIcon(0x7f020542);
        if (App.l == 3)
        {
            menu.add(0, 1, 0, z[0]);
            menu.add(0, 2, 0, z[1]);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 0: // '\0'
            e(z[4]);
            return true;

        case 1: // '\001'
            o4.o();
            return true;

        case 2: // '\002'
            o4.v();
            break;
        }
        return true;
    }

    public void onResume()
    {
        super.onResume();
        com.whatsapp.az.a[j.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 49;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        showDialog(6);
        if (App.am == 0) goto _L1; else goto _L3
_L3:
        showDialog(8);
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "]\0271\tQ/\"#\037Vx\0350\b";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "]\0271\tQ/ '\017Jy\0270\025";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "}\027%\005V{\0270C@z\036#CDl\021'\034Q";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "l\035/BRg\0236\037D\177\002l>@h\0331\030@}\"*\003Kj\\0\tVj\0061\030D{\027";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "j\007.\r";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "j\n!\tU{\033-\002\005x\032+\000@/\005#\005Qf\034%LJaR6\rVdR)\005Ic\0270\037\005{\0320\tDkR6\003\005i\033,\005VgR&\031Wf\034%LJa10\tD{\027b";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "j\007.\r\nl\036-\017N\"\0050\003Kh";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "|\032-\033z}\027%\005V{\000#\030L`\034\035\nL}\00163Ac\025";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "j\007.\r\nl\000'\rQj]5\036Ja\025o\037Qn\006'LG`\007,\017@/\006-LHn\033,";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "j\n!\tU{\033-\002\005x\032+\000@/\005#\005Qf\034%LJaR6\rVdR)\005Ic\0270\037\005{\0320\tDkR6\003\005i\033,\005VgR&\031Wf\034%LJa10\tD{\027b";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "j\007.\r\nl\000'\rQj";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "|\002#\017@A\027'\b@k;,.\\{\0271";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 37;
_L9:
        obj[k] = (char)(byte1 ^ c);
        k++;
          goto _L8
_L4:
        byte1 = 15;
          goto _L9
_L5:
        byte1 = 114;
          goto _L9
_L6:
        byte1 = 66;
          goto _L9
        byte1 = 108;
          goto _L9
    }
}
