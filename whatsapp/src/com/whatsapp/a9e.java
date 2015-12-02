// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            MultipleContactsSelector, App, abl

class a9e
    implements android.view.View.OnClickListener
{

    private static final String z;
    final MultipleContactsSelector a;

    a9e(MultipleContactsSelector multiplecontactsselector)
    {
        a = multiplecontactsselector;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (a.j.size() < a.d())
            {
                App.b(a.getBaseContext(), String.format(App.j.a(0x7f0d001d, a.d()), new Object[] {
                    Integer.valueOf(a.d())
                }), 0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ((InputMethodManager)a.getSystemService(z)).hideSoftInputFromWindow(a.q.getWindowToken(), 0);
            a.j();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\016of\034\1778ls\035c\be".toCharArray();
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
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 11;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 103;
          goto _L8
_L3:
        byte0 = 1;
          goto _L8
_L4:
        byte0 = 22;
          goto _L8
        byte0 = 105;
          goto _L8
    }
}
