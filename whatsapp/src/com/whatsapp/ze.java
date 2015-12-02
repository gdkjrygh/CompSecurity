// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ate

class ze
    implements Runnable
{

    final VoiceService.VoiceServiceEventCallback a;

    ze(VoiceService.VoiceServiceEventCallback voiceserviceeventcallback)
    {
        a = voiceserviceeventcallback;
        super();
    }

    public void run()
    {
        a.bufferQueue.a();
    }
}
