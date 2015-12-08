// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import java.util.TimerTask;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

static final class  extends TimerTask
{

    public void run()
    {
        Feature.flush();
    }

    ()
    {
    }
}
