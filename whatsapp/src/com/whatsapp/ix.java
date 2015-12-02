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
//            asy, a8z, ChangeNumber

class ix
    implements TextWatcher
{

    private static final String z[];
    final ChangeNumber a;
    private a8z b;

    public ix(ChangeNumber changenumber, a8z a8z1)
    {
        a = changenumber;
        super();
        b = a8z1;
    }

    public void afterTextChanged(Editable editable)
    {
        IOException ioexception = null;
        if (editable == null) goto _L2; else goto _L1
_L1:
        int i = editable.length();
        if (i <= 0) goto _L2; else goto _L3
_L3:
        editable = asy.d(editable.toString());
        b.a = editable;
_L4:
        boolean flag;
        try
        {
            flag = b.b.getText().toString().equals("");
        }
        // Misplaced declaration of an exception variable
        catch (Editable editable)
        {
            throw editable;
        }
        if (!flag && editable != null)
        {
            ChangeNumber.a(a, editable, b);
            editable = b.c.getText().toString().replaceAll(z[0], "");
            b.c.setText(editable);
        }
        return;
        editable;
        try
        {
            throw editable;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            editable = null;
        }
_L5:
        Log.a(z[1], ioexception);
          goto _L4
_L2:
        b.a = null;
        editable = ioexception;
          goto _L4
        ioexception;
          goto _L5
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
        obj = "q\n";
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
                obj = "N&,b|H 8ayH<b{zY-%ii\002/+x~_:(toN&,b|H*mjzD\"(h;A!\"gn]\r\"yuY<4OtI+mjiB#mOtX 9~b}&\"b~d +c";
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
        byte byte0 = 27;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 45;
          goto _L9
_L5:
        byte0 = 78;
          goto _L9
_L6:
        byte0 = 77;
          goto _L9
        byte0 = 12;
          goto _L9
    }
}
