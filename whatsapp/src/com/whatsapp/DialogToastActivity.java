// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.Spanned;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;

// Referenced classes of package com.whatsapp:
//            dx, App, ao_, ez, 
//            all, aug, iz, c9

public class DialogToastActivity extends SherlockActivity
    implements dx
{

    public static int g;
    private static final String z[];
    private ao_ b;
    private String c;
    private int d;
    private c9 e;
    private boolean f;
    private int h;
    private int i;

    public DialogToastActivity()
    {
        f = true;
    }

    static c9 a(DialogToastActivity dialogtoastactivity)
    {
        return dialogtoastactivity.e;
    }

    public static void a(MenuItem menuitem)
    {
        if (menuitem == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        int j = menuitem.getItemId();
        if (j == 0x102002c)
        {
            try
            {
                if (menuitem.getTitleCondensed() instanceof Spanned)
                {
                    menuitem.setTitleCondensed(menuitem.getTitle().toString());
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
        }
        break MISSING_BLOCK_LABEL_54;
        menuitem;
        throw menuitem;
    }

    private void a(c9 c9, String s, int j)
    {
        try
        {
            e = c9;
            c = s;
            h = j;
            if (!isFinishing())
            {
                showDialog(500);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c9 c9)
        {
            throw c9;
        }
    }

    public void a(int j)
    {
        a(null, getString(j), j);
    }

    public void a(int j, int k)
    {
        try
        {
            d = j;
            i = k;
            if (!isFinishing())
            {
                showDialog(501);
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    public void a(int j, c9 c9)
    {
        a(c9, getString(j), j);
    }

    public void a(String s, c9 c9)
    {
        a(c9, s, 0);
    }

    public boolean a()
    {
        boolean flag;
        try
        {
            flag = isFinishing();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (flag)
        {
            return false;
        } else
        {
            showDialog(114);
            return true;
        }
    }

    public void b(int j)
    {
        a(0, j);
    }

    public boolean b()
    {
        boolean flag;
        try
        {
            flag = isFinishing();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (flag)
        {
            return false;
        } else
        {
            showDialog(113);
            return true;
        }
    }

    public void c()
    {
        removeDialog(501);
    }

    public boolean d()
    {
        boolean flag;
        try
        {
            flag = isFinishing();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (flag)
        {
            return false;
        } else
        {
            showDialog(110);
            return true;
        }
    }

    public void f(String s)
    {
        a(null, s, 0);
    }

    public void onBackPressed()
    {
        boolean flag = f;
        if (!flag)
        {
            NullPointerException nullpointerexception;
            int j;
            try
            {
                j = android.os.Build.VERSION.SDK_INT;
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
            if (j >= 11)
            {
                break MISSING_BLOCK_LABEL_29;
            }
        }
        super.onBackPressed();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        Log.e(z[4]);
        return;
        nullpointerexception;
        throw nullpointerexception;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = new ao_();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        try
        {
            if (App.u == 3)
            {
                a5.b(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    protected Dialog onCreateDialog(int j)
    {
        switch (j)
        {
        default:
            return super.onCreateDialog(j);

        case 500: 
            AlertDialog alertdialog;
            try
            {
                alertdialog = (new android.app.AlertDialog.Builder(this)).setMessage(c).setNeutralButton(0x7f0e02ba, new ez(this)).create();
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return alertdialog;

        case 501: 
            ProgressDialog progressdialog = new ProgressDialog(this);
            try
            {
                if (d != 0)
                {
                    progressdialog.setTitle(d);
                }
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
            progressdialog.setMessage(getString(i));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 114: // 'r'
            Log.w(z[7]);
            return all.b(this);

        case 110: // 'n'
            Log.w(z[5]);
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e022f).setCancelable(false).setNeutralButton(0x7f0e02be, new aug(this)).create();

        case 113: // 'q'
            Log.w(z[6]);
            return all.d(this);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        try
        {
            if (App.u == 3)
            {
                a5.b(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        int k;
        try
        {
            k = App.u;
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw keyevent;
        }
        if (k != 3) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR lookupswitch 3: default 44
    //                   24: 54
    //                   25: 71
    //                   84: 64;
           goto _L2 _L3 _L4 _L5
_L2:
        return super.onKeyDown(j, keyevent);
_L3:
        a5.a(this).show();
        return true;
_L5:
        a5.a(this, false);
        return true;
_L4:
        a5.c();
        return true;
    }

    public boolean onMenuItemSelected(int j, MenuItem menuitem)
    {
        a(menuitem);
        return super.onMenuItemSelected(j, menuitem);
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        int j;
        try
        {
            j = menuitem.getItemId();
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.MenuItem menuitem)
        {
            throw menuitem;
        }
        switch (j)
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            break;
        }
        finish();
        return true;
    }

    protected void onPause()
    {
        try
        {
            App.a(this);
            super.onPause();
            if (b.hasMessages(0))
            {
                b.removeMessages(0);
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        App.aL();
        f = false;
    }

    protected void onPrepareDialog(int j, Dialog dialog)
    {
        j;
        JVM INSTR tableswitch 500 500: default 20
    //                   500 27;
           goto _L1 _L2
_L1:
        super.onPrepareDialog(j, dialog);
_L3:
        return;
_L2:
        AlertDialog alertdialog = (AlertDialog)dialog;
        int k;
        try
        {
            alertdialog.setMessage(c);
            k = App.am;
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            throw dialog;
        }
        if (k == 0) goto _L3; else goto _L1
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        try
        {
            super.onRestoreInstanceState(bundle);
        }
        catch (NullPointerException nullpointerexception)
        {
            Log.c(nullpointerexception);
        }
        try
        {
            c = bundle.getString(z[3]);
            h = bundle.getInt(z[1], 0);
            if (h != 0)
            {
                c = getString(h);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        d = bundle.getInt(z[0], 0);
        i = bundle.getInt(z[2], 0);
    }

    protected void onResume()
    {
        App.b(this);
        super.onResume();
        b.sendEmptyMessageDelayed(0, 3000L);
        f = true;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(z[9], c);
        bundle.putInt(z[10], h);
        bundle.putInt(z[8], d);
        bundle.putInt(z[11], i);
    }

    public void setContentView(int j)
    {
        setContentView(iz.a(getLayoutInflater(), j, null, false));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[12];
        obj = "^]U?~AhT#JCdI>|AYN$uVDC";
        byte0 = -1;
        j = 0;
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
                as1[j] = ((String) (obj));
                obj = "^IN1u\\js?x@yt$kZc@\031}";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "^]U?~AhT#JCdI>|A@B#jRjB\031}";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "^IN1u\\js?x@yt$kZc@";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "WdF<vTyH1jGlD$pEdS)6\\cE1zX}U5j@hC\177xPyN&pGt\007>v\023lD$pEh";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "WdF<vT\"K?~Zc\n6xZaB4";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "WdF<vT\"D<vPf\n'k\\c@";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "WdF<vT\"T?\177GzF\"|\036h_ pAhC";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "^]U?~AhT#JCdI>|AYN$uVDC";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "^IN1u\\js?x@yt$kZc@";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "^IN1u\\js?x@yt$kZc@\031}";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 11;
                obj = "^]U?~AhT#JCdI>|A@B#jRjB\031}";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
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
        byte byte1 = 25;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 51;
          goto _L9
_L5:
        byte1 = 13;
          goto _L9
_L6:
        byte1 = 39;
          goto _L9
        byte1 = 80;
          goto _L9
    }
}
