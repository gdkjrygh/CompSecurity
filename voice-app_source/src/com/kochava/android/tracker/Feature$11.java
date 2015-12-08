// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import java.util.TimerTask;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

class this._cls0 extends TimerTask
{

    final Feature this$0;

    public void run()
    {
        Feature.flush();
    }

    ()
    {
        this$0 = Feature.this;
        super();
    }
}
