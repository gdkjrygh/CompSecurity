// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.Main;
import com.whatsapp.asw;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.accountsync:
//            PerformSyncManager, g

public class LoginActivity extends AccountAuthenticatorActivity
{

    private static final String z[];

    public LoginActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
label1:
            {
                int j = PerformSyncManager.a;
                super.onCreate(bundle);
                setContentView(0x7f03007b);
                Log.i(z[1]);
                bundle = AccountManager.get(this).getAccounts();
                int k = bundle.length;
                int i = 0;
                boolean flag = false;
                boolean flag1;
                do
                {
                    flag1 = flag;
                    if (i >= k)
                    {
                        break;
                    }
                    Object obj = bundle[i];
                    flag1 = flag;
                    if (z[2].contains(((Account) (obj)).type))
                    {
                        flag1 = true;
                    }
                    i++;
                    flag = flag1;
                    if (j == 0)
                    {
                        continue;
                    }
                    DialogToastActivity.g++;
                    break;
                } while (true);
                if (flag1)
                {
                    Toast.makeText(getApplicationContext(), getString(0x7f0e001e), 1).show();
                    finish();
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                if (App.k() != null)
                {
                    break label0;
                }
                bundle = new Intent(this, com/whatsapp/Main);
                bundle.putExtra(z[0], true);
                startActivity(bundle);
                finish();
            }
            return;
        }
        asw.a(new g(this, this, null), new Void[0]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "=Dvr/<I~l\003:^xq\031!BFc\031<_mZ\024\"K";
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
                obj = "\"C~l\036/Oml\006'X`*\023<Ixq\025";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "-Ct+\007&Mmv\021>\\";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 112;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 78;
          goto _L9
_L5:
        byte0 = 44;
          goto _L9
_L6:
        byte0 = 25;
          goto _L9
        byte0 = 5;
          goto _L9
    }
}
