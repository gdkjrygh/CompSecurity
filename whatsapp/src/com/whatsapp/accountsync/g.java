// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.accountsync:
//            LoginActivity, c

class g extends AsyncTask
{

    private static final String z[];
    final LoginActivity a;
    final ProgressDialog b;

    private g(LoginActivity loginactivity, Context context)
    {
        a = loginactivity;
        super();
        b = ProgressDialog.show(context, "", loginactivity.getString(0x7f0e0020), true, false);
        b.setCancelable(true);
    }

    g(LoginActivity loginactivity, Context context, c c)
    {
        this(loginactivity, context);
    }

    public Boolean a(Void avoid[])
    {
        try
        {
            Thread.sleep(2000L);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.a(z[2], avoid);
        }
        avoid = new Account(a.getString(0x7f0e0047), z[3]);
        if (AccountManager.get(a).addAccountExplicitly(avoid, null, null))
        {
            Bundle bundle = new Bundle();
            bundle.putString(z[1], ((Account) (avoid)).name);
            bundle.putString(z[0], ((Account) (avoid)).type);
            a.setAccountAuthenticatorResult(bundle);
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public void a(Boolean boolean1)
    {
        b.dismiss();
        if (boolean1.booleanValue())
        {
            a.finish();
        }
    }

    public Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "##\fa?,4;w:'";
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
                obj = "#5\033f\013!#\000{$6";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "./\bg$##\033g<+4\026!.-\t\001L+!+\b|%7.\013";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "!/\002 =*!\033}+20";
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
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 74;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 66;
          goto _L9
_L5:
        byte0 = 64;
          goto _L9
_L6:
        byte0 = 111;
          goto _L9
        byte0 = 14;
          goto _L9
    }
}
