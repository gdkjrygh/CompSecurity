// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.iz;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class g
    implements TextWatcher
{

    private int a;
    final CameraActivity b;
    final TextView c;

    g(CameraActivity cameraactivity, TextView textview)
    {
        b = cameraactivity;
        c = textview;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        String s;
        int i;
        int j;
label0:
        {
            i = CameraActivity.n;
            s = editable.toString();
            com.whatsapp.util.c.a(editable, CameraActivity.q(b).getContext());
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
            if (j >= 160 && a == 0)
            {
                a = CameraActivity.q(b).getInputType();
                if (a == 0)
                {
                    break label1;
                }
                CameraActivity.q(b).setInputType(a | 0x80000);
                CameraActivity.q(b).setText(s);
                CameraActivity.q(b).setSelection(s.length());
                if (i == 0)
                {
                    break label1;
                }
            }
            if (a != 0)
            {
                CameraActivity.q(b).setInputType(a);
                a = 0;
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(CameraActivity.q(b), charsequence);
    }
}
