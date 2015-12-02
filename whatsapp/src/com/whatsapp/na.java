// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.b7;

// Referenced classes of package com.whatsapp:
//            asv, ConversationRowVoiceNote, akr, App

class na
    implements asv
{

    final ConversationRowVoiceNote a;
    int b;

    na(ConversationRowVoiceNote conversationrowvoicenote)
    {
        a = conversationrowvoicenote;
        super();
        b = -1;
    }

    public void a()
    {
        ConversationRowVoiceNote.a().put(a.i.y, Integer.valueOf(ConversationRowVoiceNote.b(a).g()));
        ConversationRowVoiceNote.a(a).setImageResource(0x7f020587);
        b = ConversationRowVoiceNote.b(a).g() / 1000;
        ConversationRowVoiceNote.d(a).setText(DateUtils.formatElapsedTime(b));
        ConversationRowVoiceNote.c(a).setProgress(ConversationRowVoiceNote.b(a).g());
    }

    public void a(int i)
    {
        if (b != i / 1000)
        {
            b = i / 1000;
            ConversationRowVoiceNote.d(a).setText(DateUtils.formatElapsedTime(b));
        }
        ConversationRowVoiceNote.c(a).setProgress(i);
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
        ConversationRowVoiceNote.a(a).setImageResource(0x7f020584);
        ConversationRowVoiceNote.a().remove(a.i.y);
    }

    public void c()
    {
label0:
        {
            ConversationRowVoiceNote.a(a).setImageResource(0x7f020587);
            if (a.i.H != 0)
            {
                ConversationRowVoiceNote.d(a).setText(DateUtils.formatElapsedTime(a.i.H));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ConversationRowVoiceNote.d(a).setText(DateUtils.formatElapsedTime(ConversationRowVoiceNote.b(a).q() / 1000));
        }
        if (!ConversationRowVoiceNote.a().containsKey(a.i.y))
        {
            ConversationRowVoiceNote.c(a).setProgress(0);
            ConversationRowVoiceNote.a().remove(a.i.y);
        }
    }

    public void d()
    {
        ConversationRowVoiceNote.a(a).setImageResource(0x7f020584);
        ConversationRowVoiceNote.c(a).setMax(ConversationRowVoiceNote.b(a).q());
        ConversationRowVoiceNote.a().remove(a.i.y);
        b = -1;
    }
}
