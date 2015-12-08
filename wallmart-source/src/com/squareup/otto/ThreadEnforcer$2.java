// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;

import android.os.Looper;

// Referenced classes of package com.squareup.otto:
//            ThreadEnforcer, Bus

static final class 
    implements ThreadEnforcer
{

    public void enforce(Bus bus)
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException((new StringBuilder()).append("Event bus ").append(bus).append(" accessed from non-main thread ").append(Looper.myLooper()).toString());
        } else
        {
            return;
        }
    }

    ()
    {
    }
}
