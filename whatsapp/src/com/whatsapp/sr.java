// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.SeekBar;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.b7;

// Referenced classes of package com.whatsapp:
//            ConversationRowVoiceNote, akr

class sr
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final ConversationRowVoiceNote a;
    boolean b;

    sr(ConversationRowVoiceNote conversationrowvoicenote)
    {
        a = conversationrowvoicenote;
        super();
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        b = false;
        if (akr.a(a.i) && akr.s())
        {
            ConversationRowVoiceNote.b(a).p();
            b = true;
        }
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        if (akr.a(a.i) && !akr.s() && b)
        {
            b = false;
            ConversationRowVoiceNote.b(a).a(ConversationRowVoiceNote.c(a).getProgress());
            ConversationRowVoiceNote.b(a).l();
        }
        ConversationRowVoiceNote.a().put(a.i.y, Integer.valueOf(ConversationRowVoiceNote.c(a).getProgress()));
    }
}
