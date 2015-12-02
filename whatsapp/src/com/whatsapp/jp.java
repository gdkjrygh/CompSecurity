// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            DeleteAccount, RegisterPhone, asy, App

class jp
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final DeleteAccount a;

    jp(DeleteAccount deleteaccount)
    {
        a = deleteaccount;
        super();
    }

    public void onClick(View view)
    {
        String s1;
        s1 = a.q.getText().toString().trim();
        view = a.v.getText().toString();
        RegisterPhone.a(s1, view);
        JVM INSTR tableswitch 1 7: default 80
    //                   1 314
    //                   2 324
    //                   3 351
    //                   4 384
    //                   5 405
    //                   6 450
    //                   7 495;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        int i;
        i = Integer.parseInt(s1);
        view = view.replaceAll(z[6], "");
        String s = asy.a(i, view);
        view = s;
_L9:
        IOException ioexception;
        try
        {
            Log.i((new StringBuilder()).append(z[5]).append(s1).append(z[2]).append(view).toString());
            DeleteAccount.b(s1);
            DeleteAccount.a(view);
            Log.w((new StringBuilder()).append(z[3]).append(DeleteAccount.a()).append(z[4]).append(DeleteAccount.b()).append(z[0]).append(App.Z.jabber_id).toString());
            a.showDialog(1);
            DeleteAccount.a(a).sendEmptyMessageDelayed(4, 30000L);
            if (!App.a(DeleteAccount.a(), DeleteAccount.b(), DeleteAccount.e(a), DeleteAccount.b(a)))
            {
                DeleteAccount.a(a).removeMessages(4);
                a.removeDialog(1);
                a.f(a.getString(0x7f0e0317, new Object[] {
                    a.getString(0x7f0e00c6)
                }));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
_L2:
        if ((i = App.am) == 0) goto _L1; else goto _L3
_L3:
        try
        {
            a.a(0x7f0e0310);
            a.q.requestFocus();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        view;
        throw view;
_L4:
        a.a(0x7f0e0311);
        a.q.setText("");
        a.q.requestFocus();
        return;
_L5:
        a.a(0x7f0e031d);
        a.v.requestFocus();
        return;
_L6:
        a.f(a.getString(0x7f0e0315, new Object[] {
            a.s.getText()
        }));
        a.v.requestFocus();
        return;
_L7:
        a.f(a.getString(0x7f0e0314, new Object[] {
            a.s.getText()
        }));
        a.v.requestFocus();
        return;
_L8:
        a.f(a.getString(0x7f0e0313, new Object[] {
            a.s.getText()
        }));
        a.v.requestFocus();
        return;
        ioexception;
        Log.a(z[1], ioexception);
          goto _L9
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "\024~W+\007";
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
                obj = "PqR*NQ9_,Y[aP;\025D|Q!_\024r_&VQp\036;H]yr*[P}P(`QfQo\\F{Soy[aP;HMDV TQ]P)U";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\033zK\"XQf\003";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "PqR*NQ9_,Y[aP;\025Ga\\\"S@;],\032";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\024dVr";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "PqR*NQ9_,Y[aP;\025D|Q!_\033w]r";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "hP";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 58;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 52;
          goto _L9
_L5:
        byte1 = 20;
          goto _L9
_L6:
        byte1 = 62;
          goto _L9
        byte1 = 79;
          goto _L9
    }
}
