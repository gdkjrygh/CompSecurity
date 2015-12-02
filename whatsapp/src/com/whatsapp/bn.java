// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, VoiceService

class bn
    implements Runnable
{

    final VoiceService a;
    final int b;

    bn(VoiceService voiceservice, int i)
    {
        a = voiceservice;
        b = i;
        super();
    }

    public void run()
    {
        if (App.l == 3)
        {
            App.b(a.getApplicationContext(), b, 1);
        }
    }
}
