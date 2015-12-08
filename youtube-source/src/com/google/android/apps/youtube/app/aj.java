// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.app.ui.SliderLayout;
import com.google.android.apps.youtube.common.fromguava.c;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.apps.youtube.app:
//            GuideActivity

final class aj extends Handler
{

    final WeakReference a;

    aj(GuideActivity guideactivity)
    {
        a = new WeakReference(c.a(guideactivity));
    }

    public final void handleMessage(Message message)
    {
        GuideActivity guideactivity = (GuideActivity)a.get();
        if (guideactivity == null) goto _L2; else goto _L1
_L1:
        message.what;
        JVM INSTR tableswitch 1 3: default 44
    //                   1 45
    //                   2 55
    //                   3 65;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        guideactivity.r.a(0, true);
        return;
_L4:
        guideactivity.r.a(1, true);
        return;
_L5:
        GuideActivity.a(guideactivity);
        return;
    }
}
