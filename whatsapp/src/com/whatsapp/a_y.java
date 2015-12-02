// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            App, VideoPreviewActivity, ConversationTextEntry, iz

class a_y
    implements TextWatcher
{

    final VideoPreviewActivity a;
    private int b;
    final TextView c;

    a_y(VideoPreviewActivity videopreviewactivity, TextView textview)
    {
        a = videopreviewactivity;
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
            i = App.am;
            s = editable.toString();
            com.whatsapp.util.c.a(editable, VideoPreviewActivity.j(a).getContext());
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
            if (j >= 160 && b == 0)
            {
                b = VideoPreviewActivity.j(a).getInputType();
                if (b == 0)
                {
                    break label1;
                }
                VideoPreviewActivity.j(a).setInputType(b | 0x80000);
                VideoPreviewActivity.j(a).setText(s);
                VideoPreviewActivity.j(a).setSelection(s.length());
                if (i == 0)
                {
                    break label1;
                }
            }
            if (b != 0)
            {
                VideoPreviewActivity.j(a).setInputType(b);
                b = 0;
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(VideoPreviewActivity.j(a), charsequence);
    }
}
