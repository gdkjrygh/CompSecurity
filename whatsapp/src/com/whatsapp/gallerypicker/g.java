// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.widget.EditText;
import com.whatsapp.cq;
import com.whatsapp.util.c;
import com.whatsapp.za;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class g
    implements za
{

    private static final String z;
    final ImagePreview a;

    g(ImagePreview imagepreview)
    {
        a = imagepreview;
        super();
    }

    private EditText a()
    {
        if (ImagePreview.i(a) >= 0)
        {
            Uri uri = (Uri)ImagePreview.s(a).get(ImagePreview.i(a));
            return (EditText)ImagePreview.t(a).findViewWithTag((new StringBuilder()).append(uri.toString()).append(z).toString());
        } else
        {
            return null;
        }
    }

    public void a()
    {
        EditText edittext = a();
        if (edittext != null)
        {
            edittext.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    public void a(int i)
    {
        EditText edittext = a();
        if (edittext != null)
        {
            int j = edittext.getSelectionStart();
            int k = edittext.getSelectionEnd();
            StringBuilder stringbuilder;
            int l;
            if (j > k)
            {
                l = k;
                k = j;
            } else
            {
                l = j;
            }
            stringbuilder = new StringBuilder(edittext.getText().toString());
            stringbuilder.replace(l, k, c.a(i));
            if (stringbuilder.codePointCount(0, stringbuilder.length()) > 160)
            {
                return;
            }
            edittext.setText(stringbuilder);
            edittext.setSelection(c.h(i) + l);
        }
        ImagePreview.d(a).dismiss();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "h|L/".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
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
        byte byte0 = 98;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 13;
          goto _L8
_L3:
        byte0 = 24;
          goto _L8
_L4:
        byte0 = 37;
          goto _L8
        byte0 = 91;
          goto _L8
    }
}
