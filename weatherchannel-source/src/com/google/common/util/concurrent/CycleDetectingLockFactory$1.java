// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.collect.Lists;
import java.util.ArrayList;

// Referenced classes of package com.google.common.util.concurrent:
//            CycleDetectingLockFactory

static final class  extends ThreadLocal
{

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    protected ArrayList initialValue()
    {
        return Lists.newArrayListWithCapacity(3);
    }

    ()
    {
    }
}
