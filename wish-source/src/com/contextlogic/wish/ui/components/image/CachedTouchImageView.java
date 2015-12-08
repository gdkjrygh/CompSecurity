// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.image;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.contextlogic.wish.ui.components.image:
//            CachedImageView

public class CachedTouchImageView extends CachedImageView
{

    public CachedTouchImageView(Context context)
    {
        super(context);
    }

    public CachedTouchImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CachedTouchImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected boolean shouldSupportTouch()
    {
        return true;
    }
}
