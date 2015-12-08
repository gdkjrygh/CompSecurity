// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.interactivemedia.v3.impl.data;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl.data:
//            e

public abstract class com.google.ads.interactivemedia.v3.impl.data.a
{
    public static abstract class a
    {

        public static a create(int i, int j, int k, int l)
        {
            return new e(i, j, k, l);
        }

        public abstract int height();

        public abstract int left();

        public abstract int top();

        public abstract int width();

        public a()
        {
        }
    }


    public com.google.ads.interactivemedia.v3.impl.data.a()
    {
    }

    public static b builder()
    {
        return new d.a();
    }

    public abstract String appState();

    public abstract String eventId();

    public abstract long nativeTime();

    public abstract a nativeViewBounds();

    public abstract boolean nativeViewHidden();

    public abstract a nativeViewVisibleBounds();

    public abstract double nativeVolume();

    public abstract String queryId();

    public abstract String vastEvent();

    // Unreferenced inner class com/google/ads/interactivemedia/v3/impl/data/a$b
    /* block-local class not found */
    class b {}

}
