// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.util.Log;
import com.whatsapp.util.bv;
import de.greenrobot.event.g;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            ChangeNumber, a8z, asy, App, 
//            fv

class atf extends bv
{

    private static final String z[];
    final ChangeNumber b;

    atf(ChangeNumber changenumber)
    {
        b = changenumber;
        super();
    }

    public void a(View view)
    {
        String s1;
        s1 = ChangeNumber.a(b).b.getText().toString().trim();
        view = ChangeNumber.a(b).c.getText().toString();
        boolean flag;
        try
        {
            flag = ChangeNumber.a(b, s1, view, ChangeNumber.a(b));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s = b.u.b.getText().toString().trim();
        String s2 = b.u.c.getText().toString();
        int i;
        boolean flag1;
        try
        {
            flag1 = ChangeNumber.a(b, s, s2, b.u);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (!flag1) goto _L1; else goto _L3
_L3:
        i = Integer.parseInt(s1);
        view = view.replaceAll(z[3], "");
        s = asy.a(i, view);
        view = s;
_L5:
        Log.i((new StringBuilder()).append(z[8]).append(s1).append(z[5]).append(view).toString());
        ChangeNumber.b(s1);
        ChangeNumber.d(view);
        Log.w((new StringBuilder()).append(z[0]).append(ChangeNumber.a()).append(z[1]).append(ChangeNumber.d()).append(z[2]).append(App.Z.jabber_id).toString());
        view = (fv)g.a().a(com/whatsapp/fv);
        flag1 = view.a();
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.w(z[6]);
        b.f((new StringBuilder()).append(b.getString(0x7f0e0082)).append(" ").append(b.getString(0x7f0e00c5)).append(z[7]).append(b.getString(0x7f0e00c6)).toString());
        i = App.am;
        if (i == 0) goto _L1; else goto _L4
_L4:
        try
        {
            b.showDialog(1);
            ChangeNumber.d(b).sendEmptyMessageDelayed(4, 30000L);
            if (!App.a(ChangeNumber.a(), ChangeNumber.d(), ChangeNumber.c(b), ChangeNumber.e(b)))
            {
                ChangeNumber.d(b).removeMessages(4);
                b.removeDialog(1);
                b.f(b.getString(0x7f0e0317, new Object[] {
                    b.getString(0x7f0e00c6)
                }));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
          goto _L1
        IOException ioexception;
        ioexception;
        Log.a(z[4], ioexception);
          goto _L5
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
          goto _L1
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "kY\024V7m_\000U2mCZK%j\\\034L\177kRU";
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
                obj = "(A\035\005";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "([\034\\m";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Tu";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "kY\024V7m_\000U2mCZH8g_\020\0306iX\031]4(E\007Q=DT\024\\9fV/]\"g\021\023J?e\0216W%fE\007A\000`^\033]\031fW\032";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "'_\000U2mCH";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "kY\024V7m_\000U2mCZK%j\\\034L\177f^X[?f_\020[$aG\034L)";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\002;";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "kY\024V7m_\000U2mCZH8g_\020\0273k\f";
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
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 80;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 8;
          goto _L9
_L5:
        byte1 = 49;
          goto _L9
_L6:
        byte1 = 117;
          goto _L9
        byte1 = 56;
          goto _L9
    }
}
