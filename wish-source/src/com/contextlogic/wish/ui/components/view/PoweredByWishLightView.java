// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

// Referenced classes of package com.contextlogic.wish.ui.components.view:
//            PoweredByWishDarkView

public class PoweredByWishLightView extends PoweredByWishDarkView
{

    public PoweredByWishLightView(Context context)
    {
        super(context);
    }

    public PoweredByWishLightView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PoweredByWishLightView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected int getPoweredByLogoResource()
    {
        return 0x7f02015e;
    }

    protected int getPoweredByTextColor()
    {
        return getResources().getColor(0x7f0c00d1);
    }
}
