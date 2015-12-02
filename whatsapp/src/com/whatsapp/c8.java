// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Binder;

// Referenced classes of package com.whatsapp:
//            VoiceService

public class c8 extends Binder
{

    final VoiceService a;

    public c8(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
    }

    public VoiceService a()
    {
        return a;
    }
}
