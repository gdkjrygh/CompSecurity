// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            at4, ConversationRowAudio, WaveformVisualizerView

class af6
    implements at4
{

    final ConversationRowAudio a;

    af6(ConversationRowAudio conversationrowaudio)
    {
        a = conversationrowaudio;
        super();
    }

    public void a(byte abyte0[])
    {
        if (ConversationRowAudio.c(a) != null)
        {
            ConversationRowAudio.c(a).a(abyte0);
        }
    }
}
