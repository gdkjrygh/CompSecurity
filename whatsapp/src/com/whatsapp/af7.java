// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.cl;
import com.whatsapp.util.y;

// Referenced classes of package com.whatsapp:
//            asv, ConversationRowAudio, akr, App, 
//            WaveformVisualizerView, aob

class af7
    implements asv
{

    final ConversationRowAudio a;
    int b;
    final c4 c;

    af7(ConversationRowAudio conversationrowaudio, c4 c4_1)
    {
        a = conversationrowaudio;
        c = c4_1;
        super();
        b = -1;
    }

    public void a()
    {
        if (ConversationRowAudio.e(a) != null)
        {
            ConversationRowAudio.e(a).b();
        }
    }

    public void a(int i)
    {
        if (b != i / 1000)
        {
            b = i / 1000;
            com.whatsapp.ConversationRowAudio.a(a).setText(DateUtils.formatElapsedTime(b));
        }
    }

    public void a(boolean flag)
    {
        Object obj = a.d();
        if (obj != null)
        {
            obj = ((Activity) (obj)).findViewById(0x7f0b014c);
            if (obj != null)
            {
                int i;
                if (flag)
                {
                    i = 0;
                } else
                {
                    i = 4;
                }
                ((View) (obj)).setVisibility(i);
            }
        }
    }

    public void b()
    {
    }

    public void c()
    {
        int i;
label0:
        {
            i = App.am;
            ConversationRowAudio.b(a).setText(0x7f0e02eb);
            ConversationRowAudio.c(a).setVisibility(8);
            com.whatsapp.ConversationRowAudio.a(a).setTextColor(-1);
            com.whatsapp.ConversationRowAudio.a(a).setCompoundDrawablesWithIntrinsicBounds(0x7f02059d, 0, 0, 0);
            android.graphics.Bitmap bitmap = y.a(c);
            if (bitmap != null)
            {
                ConversationRowAudio.d(a).setImageDrawable(new aob(a.getContext(), bitmap, c.y.b));
                if (i == 0)
                {
                    break label0;
                }
            }
            ConversationRowAudio.d(a).setImageDrawable(new aob(a.getContext(), cl.e(a.getContext()), c.y.b));
        }
        String s;
label1:
        {
            if (c.H != 0)
            {
                s = DateUtils.formatElapsedTime(c.H);
                if (i == 0)
                {
                    break label1;
                }
            }
            s = Formatter.formatShortFileSize(App.au, c.t);
        }
        com.whatsapp.ConversationRowAudio.a(a).setText(s);
    }

    public void d()
    {
        ConversationRowAudio.b(a).setText(0x7f0e0309);
        ConversationRowAudio.b(a).setOnClickListener(ConversationRowAudio.f(a));
        ConversationRowAudio.c(a).setVisibility(0);
        ConversationRowAudio.d(a).setImageDrawable(new aob(a.getContext(), cl.a(a.getContext()), a.i.y.b));
        com.whatsapp.ConversationRowAudio.a(a).setTextColor(0xff6a6f73);
        com.whatsapp.ConversationRowAudio.a(a).setCompoundDrawablesWithIntrinsicBounds(0x7f02059e, 0, 0, 0);
        b = -1;
    }
}
