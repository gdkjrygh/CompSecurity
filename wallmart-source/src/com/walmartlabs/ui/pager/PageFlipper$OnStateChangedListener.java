// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.pager;


// Referenced classes of package com.walmartlabs.ui.pager:
//            PageFlipper

public static interface A
{

    public static final int FLIPPING = 1;
    public static final int FLIP_ENDED = 2;
    public static final int FLIP_STARTED = 0;

    public abstract void onPageMoved(float f, int i);
}
