// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.facebook.ads:
//            VideoAdActivity

class a
    implements android.view.nGlobalLayoutListener
{

    final VideoAdActivity a;

    public void onGlobalLayout()
    {
        VideoAdActivity.access$000(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        VideoAdActivity.access$100(a);
    }

    balLayoutListener(VideoAdActivity videoadactivity)
    {
        a = videoadactivity;
        super();
    }
}
