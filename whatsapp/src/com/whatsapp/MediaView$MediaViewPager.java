// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.whatsapp:
//            PhotoViewPager, a_0, b_, MediaView

class setOnInterceptTouchListener extends PhotoViewPager
{

    final MediaView g;

    public geChangeListener(MediaView mediaview, Context context, AttributeSet attributeset)
    {
        g = mediaview;
        super(context, attributeset);
        setOnPageChangeListener(new a_0(this, mediaview));
        setOnInterceptTouchListener(new b_(this, mediaview));
    }
}
