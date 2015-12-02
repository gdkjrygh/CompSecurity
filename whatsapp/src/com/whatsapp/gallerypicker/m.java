// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.iz;
import com.whatsapp.util.c;
import java.util.HashMap;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, a5

class m
    implements TextWatcher
{

    final ConversationTextEntry a;
    final Uri b;
    final TextView c;
    final a5 d;
    private int e;

    m(a5 a5_1, ConversationTextEntry conversationtextentry, TextView textview, Uri uri)
    {
        d = a5_1;
        a = conversationtextentry;
        c = textview;
        b = uri;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        String s;
        int i;
        int j;
label0:
        {
            i = ImagePreview.B;
            s = editable.toString();
            com.whatsapp.util.c.a(editable, a.getContext());
            j = s.codePointCount(0, s.length());
            if (160 - j < 30)
            {
                c.setVisibility(0);
                c.setText(Integer.toString(160 - j));
                if (i == 0)
                {
                    break label0;
                }
            }
            c.setVisibility(8);
        }
label1:
        {
            if (j >= 160 && e == 0)
            {
                e = a.getInputType();
                if (e == 0)
                {
                    break label1;
                }
                a.setInputType(e | 0x80000);
                a.setText(s);
                a.setSelection(s.length());
                if (i == 0)
                {
                    break label1;
                }
            }
            if (e != 0)
            {
                a.setInputType(e);
                e = 0;
            }
        }
label2:
        {
            if (TextUtils.isEmpty(s))
            {
                ImagePreview.k(d.a).remove(b);
                if (i == 0)
                {
                    break label2;
                }
            }
            ImagePreview.k(d.a).put(b, s.toString());
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(a, charsequence);
    }
}
