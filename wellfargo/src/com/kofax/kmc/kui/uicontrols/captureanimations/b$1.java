// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.os.Handler;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            b

class a
    implements Runnable
{

    final b a;

    public void run()
    {
        a.invalidate();
        b.a(a).postDelayed(this, 50L);
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
