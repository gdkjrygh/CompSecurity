// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.EditText;
import com.whatsapp.util.Log;
import com.whatsapp.util.ak;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            App, Advanced

class a_1
    implements android.view.View.OnClickListener
{

    private static final String z;
    final EditText a;
    final Advanced b;

    a_1(Advanced advanced, EditText edittext)
    {
        b = advanced;
        a = edittext;
        super();
    }

    public void onClick(View view)
    {
        App.q(z);
        try
        {
            Advanced.a(b, App.ab.f(), Integer.parseInt(a.getText().toString()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.a(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.c(view);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "K[Q9bQ@Q$iVQ\003#fN".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 7;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 34;
          goto _L8
_L3:
        byte0 = 52;
          goto _L8
_L4:
        byte0 = 113;
          goto _L8
        byte0 = 77;
          goto _L8
    }
}
