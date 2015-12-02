// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.accountsync;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.Arrays;

// Referenced classes of package com.whatsapp.accountsync:
//            LoginActivity

class b extends AbstractAccountAuthenticator
{

    private static final String z[];
    private final Context a;

    public b(Context context)
    {
        super(context);
        a = context;
    }

    public Bundle addAccount(AccountAuthenticatorResponse accountauthenticatorresponse, String s, String s1, String as[], Bundle bundle)
    {
        Log.i(z[4]);
        s = new Bundle();
        s1 = new Intent(a, com/whatsapp/accountsync/LoginActivity);
        s1.putExtra(z[5], accountauthenticatorresponse);
        s.putParcelable(z[3], s1);
        return s;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, Bundle bundle)
    {
        Log.i(z[2]);
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountauthenticatorresponse, String s)
    {
        Log.i(z[6]);
        return null;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, String s, Bundle bundle)
    {
        Log.i(z[7]);
        return null;
    }

    public String getAuthTokenLabel(String s)
    {
        Log.i(z[0]);
        return null;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, String as[])
    {
        Log.i((new StringBuilder()).append(z[1]).append(Arrays.toString(as)).toString());
        return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, String s, Bundle bundle)
    {
        Log.i(z[8]);
        return null;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "'gf@\t(p*\\\005(g*H\0312Ep[\024\022knJ\022\negJ\020";
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
                obj = "'gf@\t(p*\\\005(g*G\0355B`N\b3v`\\Ff";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "'gf@\t(p*\\\005(g*L\023(bl]\021\005v`K\031(plN\0205";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "/jqJ\0222";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "'gf@\t(p*\\\005(g*N\030\"EfL\0233jq";
                byte0 = 3;
                i = 4;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "'gf@\t(pDZ\b.ak[\025%eq@\016\024av_\023(w`";
                i = 5;
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "'gf@\t(p*\\\005(g*J\030/pU]\0236aw[\025#w";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "'gf@\t(p*\\\005(g*H\0312Ep[\024\022knJ\022";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "'gf@\t(p*\\\005(g*Z\f\"eqJ?4aaJ\0222mdC\017";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 316
    //                   3 322;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_322;
_L3:
        byte byte1 = 124;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 70;
          goto _L9
_L5:
        byte1 = 4;
          goto _L9
_L6:
        byte1 = 5;
          goto _L9
        byte1 = 47;
          goto _L9
    }
}
