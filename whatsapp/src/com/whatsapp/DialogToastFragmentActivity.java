// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;

// Referenced classes of package com.whatsapp:
//            dx, App, ao_, iz

public class DialogToastFragmentActivity extends SherlockFragmentActivity
    implements dx
{

    private static final String z;
    private boolean c;
    private ao_ d;
    private boolean e;

    public DialogToastFragmentActivity()
    {
        c = true;
        e = true;
    }

    private void a(DialogFragment dialogfragment)
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

    public void a(int i)
    {
        try
        {
            if (!isFinishing())
            {
                MessageDialogFragment.b(i).show(getSupportFragmentManager(), null);
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    public void a(int i, int j)
    {
        a(ProgressDialogFragment.a(i, j));
    }

    public void a(boolean flag)
    {
        c = flag;
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
            App.P = true;
            App.au.ac();
            a(((DialogFragment) (new SoftwareExpiredDialogFragment())));
            return true;
        }
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
            App.P = true;
            App.au.ac();
            a(new ClockWrongDialogFragment());
            return true;
        }
    }

    public void c()
    {
        ProgressDialogFragment progressdialogfragment;
        progressdialogfragment = (ProgressDialogFragment)getSupportFragmentManager().findFragmentByTag(com/whatsapp/DialogToastFragmentActivity$ProgressDialogFragment.getName());
        if (progressdialogfragment == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        progressdialogfragment.dismiss();
        return;
        NullPointerException nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
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
            a(new LoginFailedDialogFragment());
            return true;
        }
    }

    public void f(String s)
    {
        try
        {
            if (!isFinishing())
            {
                MessageDialogFragment.b(s).show(getSupportFragmentManager(), null);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void onBackPressed()
    {
        boolean flag;
        try
        {
            flag = e;
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
            break MISSING_BLOCK_LABEL_19;
        }
        super.onBackPressed();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        Log.e(z);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = new ao_();
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

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        int j;
        try
        {
            j = App.u;
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw keyevent;
        }
        if (j != 3) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   24: 54
    //                   25: 71
    //                   84: 64;
           goto _L2 _L3 _L4 _L5
_L2:
        return super.onKeyDown(i, keyevent);
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

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i;
        try
        {
            i = menuitem.getItemId();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        switch (i)
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
            if (d.hasMessages(0))
            {
                d.removeMessages(0);
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        App.aL();
        e = false;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        try
        {
            super.onRestoreInstanceState(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.c(bundle);
        }
    }

    protected void onResume()
    {
        try
        {
            App.b(this);
            super.onResume();
            if (c)
            {
                d.sendEmptyMessageDelayed(0, 3000L);
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        e = true;
    }

    public void setContentView(int i)
    {
        setContentView(iz.a(getLayoutInflater(), i, null, false));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "&\032O<\004%\007A1\0306\025\\1\f/\026@$\n!\007G&\0026\n\001?\005 \022M;\0330\026]#\016&\\O3\037+\005G$\022b\035Ap\n!\007G&\016".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 107;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 66;
          goto _L8
_L3:
        byte0 = 115;
          goto _L8
_L4:
        byte0 = 46;
          goto _L8
        byte0 = 80;
          goto _L8
    }

    private class MessageDialogFragment extends DialogFragment
    {

        private static final String z[];

        private static DialogFragment a(int i)
        {
            MessageDialogFragment messagedialogfragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(z[2], i);
            messagedialogfragment.setArguments(bundle);
            return messagedialogfragment;
        }

        private static DialogFragment a(String s)
        {
            MessageDialogFragment messagedialogfragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[3], s);
            messagedialogfragment.setArguments(bundle);
            return messagedialogfragment;
        }

        static DialogFragment b(int i)
        {
            return a(i);
        }

        static DialogFragment b(String s)
        {
            return a(s);
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
label0:
            {
                int i = getArguments().getInt(z[1]);
                if (i == 0)
                {
                    bundle = getArguments().getString(z[0]);
                    if (App.am == 0)
                    {
                        break label0;
                    }
                }
                bundle = getString(i);
            }
            return (new android.app.AlertDialog.Builder(getActivity())).setMessage(bundle).setCancelable(true).setNeutralButton(0x7f0e02ba, new qd(this)).create();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[4];
            obj = "e\005!\031\000o\005";
            byte1 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as1[i] = ((String) (obj));
                    obj = "a\004";
                    i = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "a\004";
                    i = 2;
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    i = 3;
                    obj = "e\005!\031\000o\005";
                    byte1 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 176
        //                       0 197
        //                       1 203
        //                       2 209
        //                       3 215;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_215;
_L3:
            byte byte0 = 97;
_L9:
            obj[j] = (char)(byte0 ^ c1);
            j++;
              goto _L8
_L4:
            byte0 = 8;
              goto _L9
_L5:
            byte0 = 96;
              goto _L9
_L6:
            byte0 = 82;
              goto _L9
            byte0 = 106;
              goto _L9
        }

        public MessageDialogFragment()
        {
        }
    }


    private class ProgressDialogFragment extends DialogFragment
    {

        private static final String z[];
        private boolean b;

        static DialogFragment a(int i, int j)
        {
            return b(i, j);
        }

        private static DialogFragment b(int i, int j)
        {
            ProgressDialogFragment progressdialogfragment = new ProgressDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(z[5], i);
            bundle.putInt(z[4], j);
            progressdialogfragment.setArguments(bundle);
            return progressdialogfragment;
        }

        public void a()
        {
label0:
            {
                if (isResumed())
                {
                    dismiss();
                    if (App.am == 0)
                    {
                        break label0;
                    }
                }
                b = true;
            }
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            int i = getArguments().getInt(z[3]);
            int j = getArguments().getInt(z[2]);
            bundle = new ProgressDialog(getActivity());
            if (i != 0)
            {
                bundle.setTitle(getString(i));
            }
            bundle.setMessage(getString(j));
            bundle.setIndeterminate(true);
            bundle.setCancelable(false);
            return bundle;
        }

        public void onStart()
        {
            super.onStart();
            if (b)
            {
                dismiss();
                b = false;
            }
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[6];
            obj = "7oi\f~\034oy";
            byte0 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte0)
                {
                default:
                    as1[i] = ((String) (obj));
                    obj = ".cn\023z$cB\t\177";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = ".cn\023z$cB\t\177";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "7oi\f~\034oy";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    obj = ".cn\023z$cB\t\177";
                    i = 4;
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    i = 5;
                    obj = "7oi\f~\034oy";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 216
        //                       0 239
        //                       1 246
        //                       2 253
        //                       3 260;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_260;
_L3:
            byte byte1 = 27;
_L9:
            obj[j] = (char)(byte1 ^ c1);
            j++;
              goto _L8
_L4:
            byte1 = 67;
              goto _L9
_L5:
            byte1 = 6;
              goto _L9
_L6:
            byte1 = 29;
              goto _L9
            byte1 = 96;
              goto _L9
        }

        public ProgressDialogFragment()
        {
            b = false;
            Bundle bundle = new Bundle();
            bundle.putInt(z[0], 0x7f0e02f8);
            bundle.putInt(z[1], 0x7f0e0353);
            setArguments(bundle);
        }
    }


    private class SoftwareExpiredDialogFragment extends DialogFragment
    {

        private static final String z;

        public Dialog onCreateDialog(Bundle bundle)
        {
            Log.w(z);
            return all.b(getActivity());
        }

        public void onDismiss(DialogInterface dialoginterface)
        {
            dialoginterface = getActivity();
            if (dialoginterface != null)
            {
                dialoginterface.finish();
            }
        }

        static 
        {
            char ac[];
            int i;
            int j;
            ac = "qT8\034f}R4\025&~\033&\026/mL4\013,4^-\t k^1".toCharArray();
            j = ac.length;
            i = 0;
_L7:
            char c1;
            if (j <= i)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[i];
            i % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 104;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_104;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 73;
_L8:
            ac[i] = (char)(byte0 ^ c1);
            i++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 25;
              goto _L8
_L3:
            byte0 = 59;
              goto _L8
_L4:
            byte0 = 85;
              goto _L8
            byte0 = 121;
              goto _L8
        }

        public SoftwareExpiredDialogFragment()
        {
        }
    }


    private class ClockWrongDialogFragment extends DialogFragment
    {

        private static final String z;
        boolean b;

        public void onConfigurationChanged(Configuration configuration)
        {
            b = false;
            dismiss();
            (new ClockWrongDialogFragment()).show(getActivity().getSupportFragmentManager(), getClass().getName());
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            Log.w(z);
            return all.d(getActivity());
        }

        public void onDismiss(DialogInterface dialoginterface)
        {
            if (b && getActivity() != null)
            {
                getActivity().finish();
            }
        }

        static 
        {
            char ac[];
            int i;
            int j;
            ac = "n\035SL6b\033_EvaR]Eve\031\023^ki\034Y".toCharArray();
            j = ac.length;
            i = 0;
_L7:
            char c1;
            if (j <= i)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[i];
            i % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 104;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_104;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 25;
_L8:
            ac[i] = (char)(byte0 ^ c1);
            i++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 6;
              goto _L8
_L3:
            byte0 = 114;
              goto _L8
_L4:
            byte0 = 62;
              goto _L8
            byte0 = 41;
              goto _L8
        }

        public ClockWrongDialogFragment()
        {
            b = true;
        }
    }


    private class LoginFailedDialogFragment extends DialogFragment
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            return (new android.app.AlertDialog.Builder(getActivity())).setMessage(0x7f0e022f).setCancelable(false).setNeutralButton(0x7f0e02be, new sy(this)).create();
        }

        public void onDismiss(DialogInterface dialoginterface)
        {
            dialoginterface = getActivity();
            if (dialoginterface != null)
            {
                dialoginterface.finish();
            }
        }

        public LoginFailedDialogFragment()
        {
        }
    }

}
