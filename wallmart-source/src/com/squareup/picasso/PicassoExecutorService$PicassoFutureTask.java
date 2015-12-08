// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.util.concurrent.FutureTask;

// Referenced classes of package com.squareup.picasso:
//            PicassoExecutorService, BitmapHunter

private static final class hunter extends FutureTask
    implements Comparable
{

    private final BitmapHunter hunter;

    public int compareTo(hunter hunter1)
    {
        hunter hunter2 = hunter.getPriority();
        hunter hunter3 = hunter1.hunter.getPriority();
        if (hunter2 == hunter3)
        {
            return hunter.sequence - hunter1.hunter.sequence;
        } else
        {
            return hunter3.hunter() - hunter2.hunter();
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public (BitmapHunter bitmaphunter)
    {
        super(bitmaphunter, null);
        hunter = bitmaphunter;
    }
}
