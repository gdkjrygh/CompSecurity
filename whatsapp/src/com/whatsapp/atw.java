// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.bv;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            App, RegisterPhone, a8z, EnterPhoneNumber, 
//            asy, o4, xi, asw, 
//            bd

class atw extends bv
{

    private static final String z[];
    final RegisterPhone b;

    atw(RegisterPhone registerphone)
    {
        b = registerphone;
        super();
    }

    public void a(View view)
    {
        int i;
        i = App.am;
        boolean flag;
        try
        {
            flag = RegisterPhone.g(b);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        s1 = b.u.b.getText().toString().replaceAll(z[8], "");
        view = b.u.c.getText().toString();
        EnterPhoneNumber.a(s1, view);
        JVM INSTR tableswitch 1 7: default 116
    //                   1 361
    //                   2 366
    //                   3 393
    //                   4 432
    //                   5 456
    //                   6 507
    //                   7 558;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
        int j;
        j = Integer.parseInt(s1);
        view = view.replaceAll(z[0], "");
        String s = asy.a(j, view);
        view = s;
_L14:
        boolean flag1;
        try
        {
            Log.i((new StringBuilder()).append(z[6]).append(s1).append(z[9]).append(view).toString());
            flag1 = s1.equals(RegisterPhone.d(b));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        if (!flag1) goto _L12; else goto _L11
_L11:
        if (view.equals(RegisterPhone.b(b))) goto _L13; else goto _L12
_L12:
        Log.i(z[3]);
        EnterPhoneNumber.y = 7;
          goto _L13
_L4:
        if (i == 0) goto _L3; else goto _L5
_L5:
        try
        {
            b.d(0x7f0e0310);
            b.u.b.requestFocus();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
_L6:
        b.d(0x7f0e0311);
        b.u.b.setText("");
        b.u.b.requestFocus();
        return;
_L7:
        b.d(0x7f0e031d);
        b.u.c.requestFocus();
        return;
_L8:
        b.d(b.getString(0x7f0e0315, new Object[] {
            b.u.d.getText()
        }));
        b.u.c.requestFocus();
        return;
_L9:
        b.d(b.getString(0x7f0e0314, new Object[] {
            b.u.d.getText()
        }));
        b.u.c.requestFocus();
        return;
_L10:
        b.d(b.getString(0x7f0e0313, new Object[] {
            b.u.d.getText()
        }));
        b.u.c.requestFocus();
        return;
        ioexception;
        Log.a(z[1], ioexception);
          goto _L14
_L13:
        EnterPhoneNumber.t = s1;
        EnterPhoneNumber.z = view;
        RegisterPhone.c(b);
        RegisterPhone.i(b);
        view = b.getPreferences(0).edit();
        IOException ioexception;
        try
        {
            view.putString(z[4], EnterPhoneNumber.t);
            view.putString(z[5], EnterPhoneNumber.z);
            if (!view.commit())
            {
                Log.w(z[2]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        try
        {
            if (!App.i())
            {
                Log.i(z[7]);
                b.d(b.getString(0x7f0e0317, new Object[] {
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
        if (EnterPhoneNumber.y != 7)
        {
            break; /* Loop/switch isn't completed */
        }
        RegisterPhone.h(b);
        s1 = App.r((new StringBuilder()).append(EnterPhoneNumber.t).append(EnterPhoneNumber.z).toString());
        byte abyte0[] = o4.a(s1);
        view = abyte0;
        if (abyte0 == null)
        {
            view = o4.i();
            o4.a(view, s1);
        }
        asw.a(new xi(b, null, RegisterPhone.e(b)), new byte[][] {
            EnterPhoneNumber.t.getBytes(), EnterPhoneNumber.z.getBytes(), view
        });
        if (i == 0) goto _L1; else goto _L15
_L15:
        j = EnterPhoneNumber.y;
        if (j != 14)
        {
            break; /* Loop/switch isn't completed */
        }
        asw.a(new bd(b, null, RegisterPhone.e(b)), new String[0]);
        if (i == 0) goto _L1; else goto _L16
_L16:
        EnterPhoneNumber.y = 15;
        b.f();
        flag1 = b.j;
        if (flag1) goto _L1; else goto _L17
_L17:
        if (b.isFinishing()) goto _L1; else goto _L18
_L18:
        b.showDialog(21);
        return;
        view;
        throw view;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "r\017";
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
                obj = "\\.?,\027Z.*5\fA%=j\007Mk>$\rB.<e\020\\\"5\t\001O/1+\003t.**DH97(Dm$-+\020\\2\b-\013@.\021+\002A";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\\.?,\027Z.*j\024F$6 K].,+\021C)=7\027\001(7(\tG?x#\005G'=!";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\\.?,\027Z.*j\024F$6 KM#=&\017H$*7\001G%+1\005B'";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "M$5k\023F*,6\005^;v\027\001I\"+1\001\\\0330*\nKe;*\021@?*<;M$< ";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "M$5k\023F*,6\005^;v\027\001I\"+1\001\\\0330*\nKe(-\013@.\007+\021C)=7";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\\.?,\027Z.*j\024F$6 KM(e";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\\.?,\027Z.*j\024F$6 KM#=&\017\\.1+\027Z*4)K@$u&\013@%=&\020G=11\035";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "r\017";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\001%-(\006K9e";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 100;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 46;
          goto _L9
_L5:
        byte1 = 75;
          goto _L9
_L6:
        byte1 = 88;
          goto _L9
        byte1 = 69;
          goto _L9
    }
}
