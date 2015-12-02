// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.a6;

// Referenced classes of package com.whatsapp:
//            VoiceService, App

class p9
    implements a6
{

    final VoiceService a;

    p9(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
    }

    public void a(boolean flag)
    {
label0:
        {
            if (flag)
            {
                VoiceService.k(a);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            VoiceService.m(a);
        }
    }
}
