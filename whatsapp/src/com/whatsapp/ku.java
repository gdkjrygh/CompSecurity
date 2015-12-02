// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            App, RegisterPhone, asy, a8z

class ku
    implements TextWatcher
{

    private static final String z[];
    final RegisterPhone a;

    ku(RegisterPhone registerphone)
    {
        a = registerphone;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        int i = App.am;
        if (RegisterPhone.f(a) == null) goto _L2; else goto _L1
_L1:
        boolean flag = asy.g(RegisterPhone.f(a)).equalsIgnoreCase(editable.toString());
        if (!flag) goto _L2; else goto _L3
_L3:
        editable = RegisterPhone.f(a);
_L5:
        flag = a.u.b.getText().toString().equals("");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        a.u.d.setText(a.getString(0x7f0e0318));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        if (editable == null)
        {
            String s;
            int j;
            try
            {
                a.u.d.setText(a.getString(0x7f0e0320));
            }
            // Misplaced declaration of an exception variable
            catch (Editable editable)
            {
                throw editable;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_193;
            }
        }
        a.u.d.setText(editable);
        RegisterPhone.a(a, editable);
        editable = a.u.c.getText().toString().replaceAll(z[1], "");
        a.u.c.setText(editable);
        return;
        editable;
        try
        {
            throw editable;
        }
        // Misplaced declaration of an exception variable
        catch (Editable editable)
        {
            Log.a(z[0], editable);
        }
        editable = null;
        continue; /* Loop/switch isn't completed */
_L2:
        s = RegisterPhone.f(a);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (editable == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        j = editable.length();
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        editable = asy.d(editable.toString());
        continue; /* Loop/switch isn't completed */
        editable;
        try
        {
            throw editable;
        }
        // Misplaced declaration of an exception variable
        catch (Editable editable) { }
        throw editable;
        editable = RegisterPhone.f(a);
        if (true) goto _L5; else goto _L4
_L4:
        editable;
        try
        {
            throw editable;
        }
        // Misplaced declaration of an exception variable
        catch (Editable editable) { }
        throw editable;
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "^-'g\tX-2!\nD'.kUO'5`\016^17o\016O %|UM.4k\bX-8z\031D).i\037Hh,a\025G=0M\025Y&4|\003o'$kZJ:/cZo'5`\016^1\020f\025B-\t`\034Ch&o\023@-$";
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
                i = 1;
                obj = "p\f";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 122;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 44;
          goto _L9
_L5:
        byte0 = 72;
          goto _L9
_L6:
        byte0 = 64;
          goto _L9
        byte0 = 14;
          goto _L9
    }
}
