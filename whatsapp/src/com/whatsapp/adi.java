// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import com.whatsapp.protocol.c4;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            adk, App, VideoTranscodeService

final class adi extends adk
{

    adi()
    {
    }

    public void a(c4 c4_1, int i)
    {
        i = App.am;
        HashMap hashmap = VideoTranscodeService.b();
        hashmap;
        JVM INSTR monitorenter ;
        if (c4_1.w != 3)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (c4_1.M != 1)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        VideoTranscodeService.b().put(c4_1.y, c4_1);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        VideoTranscodeService.b().remove(c4_1.y);
        if (!VideoTranscodeService.b().isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        App.au.stopService(new Intent(App.au, com/whatsapp/VideoTranscodeService));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        c4_1 = new Intent(App.au, com/whatsapp/VideoTranscodeService);
        App.au.startService(c4_1);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        c4_1;
        hashmap;
        JVM INSTR monitorexit ;
        throw c4_1;
    }
}
