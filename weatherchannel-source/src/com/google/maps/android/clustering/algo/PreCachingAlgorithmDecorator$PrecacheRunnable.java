// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.algo;


// Referenced classes of package com.google.maps.android.clustering.algo:
//            PreCachingAlgorithmDecorator

private class mZoom
    implements Runnable
{

    private final int mZoom;
    final PreCachingAlgorithmDecorator this$0;

    public void run()
    {
        try
        {
            Thread.sleep((long)(Math.random() * 500D + 500D));
        }
        catch (InterruptedException interruptedexception) { }
        PreCachingAlgorithmDecorator.access$000(PreCachingAlgorithmDecorator.this, mZoom);
    }

    public (int i)
    {
        this$0 = PreCachingAlgorithmDecorator.this;
        super();
        mZoom = i;
    }
}
