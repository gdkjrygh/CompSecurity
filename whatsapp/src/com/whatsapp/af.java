// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            App, DeleteAccount, asy

class af
    implements TextWatcher
{

    private static final String z[];
    final DeleteAccount a;

    af(DeleteAccount deleteaccount)
    {
        a = deleteaccount;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        int i = App.am;
        if (DeleteAccount.c(a) == null) goto _L2; else goto _L1
_L1:
        boolean flag = asy.g(DeleteAccount.c(a)).equalsIgnoreCase(editable.toString());
        if (!flag) goto _L2; else goto _L3
_L3:
        editable = DeleteAccount.c(a);
_L5:
        flag = a.q.getText().toString().equals("");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        a.s.setText(a.getString(0x7f0e0318));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        if (editable == null)
        {
            String s;
            int j;
            try
            {
                a.s.setText(a.getString(0x7f0e0320));
            }
            // Misplaced declaration of an exception variable
            catch (Editable editable)
            {
                throw editable;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_175;
            }
        }
        a.s.setText(editable);
        DeleteAccount.a(a, editable);
        editable = a.v.getText().toString().replaceAll(z[0], "");
        a.v.setText(editable);
        return;
        editable;
        try
        {
            throw editable;
        }
        // Misplaced declaration of an exception variable
        catch (Editable editable)
        {
            Log.a(z[1], editable);
        }
        editable = null;
        continue; /* Loop/switch isn't completed */
_L2:
        s = DeleteAccount.c(a);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        if (editable == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        j = editable.length();
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_240;
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
        editable = DeleteAccount.c(a);
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
        obj = "\034\f";
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
                obj = "$-\036V>%e\023P)/=\034Ge7)\006P\"%:]R,4-\000G/8<\021[+./\027Wj&)\033_/$h\036\\%+=\002p%5&\006A3\003'\026Vj&:\035^j\003'\007]>21\"[%.-;],/";
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
        byte byte0 = 74;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 64;
          goto _L9
_L5:
        byte0 = 72;
          goto _L9
_L6:
        byte0 = 114;
          goto _L9
        byte0 = 51;
          goto _L9
    }
}
