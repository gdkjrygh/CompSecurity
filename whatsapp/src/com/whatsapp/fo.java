// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.PendingIntent;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.whatsapp:
//            nr, AccountInfoActivity, App, j0, 
//            k, ov, fw, og

class fo
    implements nr
{

    private static final String z[];
    final AccountInfoActivity a;

    fo(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void a()
    {
        AccountInfoActivity.j(a).sendEmptyMessage(3);
    }

    public void a(int i)
    {
        android.os.Message message = AccountInfoActivity.j(a).obtainMessage(7, i, 0);
        AccountInfoActivity.j(a).sendMessage(message);
    }

    public void a(PendingIntent pendingintent)
    {
        pendingintent = AccountInfoActivity.j(a).obtainMessage(6, 0, 0, pendingintent);
        AccountInfoActivity.j(a).sendMessage(pendingintent);
    }

    public void a(j0 j0_1)
    {
        String s;
        int i;
        boolean flag;
        flag = true;
        i = App.am;
        s = j0_1.a();
        if (!"1".equals(s)) goto _L2; else goto _L1
_L1:
        if (i == 0) goto _L4; else goto _L3
_L3:
        byte byte0 = 1;
_L7:
label0:
        {
            if ("3".equals(s))
            {
                byte byte1 = 3;
                byte0 = byte1;
                if (i == 0)
                {
                    break label0;
                }
                byte0 = byte1;
            }
            if ("5".equals(s))
            {
                byte0 = 5;
            }
        }
_L5:
        j0_1 = j0_1.e();
        if (j0_1 != null)
        {
            Matcher matcher = Pattern.compile(z[0]).matcher(j0_1);
            if (matcher.find())
            {
                j0_1 = matcher.group(1).split(",");
                if (j0_1.length != 1)
                {
                    flag = false;
                }
                Log.b(flag);
                j0_1 = j0_1[0];
            }
        } else
        {
            j0_1 = null;
        }
        j0_1 = AccountInfoActivity.j(a).obtainMessage(4, byte0, 0, j0_1);
        AccountInfoActivity.j(a).sendMessage(j0_1);
        return;
_L4:
        byte0 = 1;
        if (true) goto _L5; else goto _L2
_L2:
        byte0 = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(Integer integer, String as[])
    {
label0:
        {
            int i = App.am;
            AccountInfoActivity.j(a).removeMessages(10);
            a.c();
            if (integer != null)
            {
                Log.e((new StringBuilder()).append(z[3]).append(integer).toString());
                a.a(0x7f0e0141);
                AccountInfoActivity.a(a, null);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (as.length > 0 && !TextUtils.isEmpty(as[0]))
            {
                integer = as[0];
                AccountInfoActivity.a(a, integer.substring(0, integer.length() - z[4].length()));
                AccountInfoActivity.b(a, AccountInfoActivity.c(a));
                if (AccountInfoActivity.g(a) != null)
                {
                    AccountInfoActivity.g(a).run();
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[1]).append(AccountInfoActivity.c(a)).toString());
            integer = App.az.e((new StringBuilder()).append(AccountInfoActivity.c(a)).append(z[2]).toString());
            if (integer == null)
            {
                integer = ov.a(AccountInfoActivity.c(a));
            } else
            {
                integer = integer.a(a);
            }
            a.a(a.getString(0x7f0e0142, new Object[] {
                integer
            }), new fw(this));
            AccountInfoActivity.a(a, null);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "!CXRYeq\033\013]aw\000\017";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = ",IHI\021#^\006O\n+E\004V\0054GNH\020`EIU\001?\\NTK(FBA\r/CGO\0204\005BH\001!CLO\006!O\013";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\rY\005Q\f,^XG\024=\004EC\020";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ",IHI\021#^\006O\n+E\004V\0054GNH\020`EIU\001?\\NTK(FBA\r/CGO\0204\005NT\026\"X\013";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\rY\005Q\f,^XG\024=\004EC\020";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 100;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 77;
          goto _L9
_L5:
        byte1 = 42;
          goto _L9
_L6:
        byte1 = 43;
          goto _L9
        byte1 = 38;
          goto _L9
    }
}
