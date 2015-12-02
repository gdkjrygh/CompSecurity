// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.telephony.PhoneStateListener;

// Referenced classes of package com.whatsapp:
//            VoiceService

class h6 extends PhoneStateListener
{

    final VoiceService a;

    h6(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
    }

    public void onCallStateChanged(int i, String s)
    {
        boolean flag1 = VoiceService.o(a);
        s = a;
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        VoiceService.b(s, flag);
        if (flag1 != VoiceService.o(a))
        {
            VoiceService.h(a);
        }
    }
}
