// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.contextlogic.wish.ui.components.text:
//            UnifiedFontTextView

public class RedBadgeTextView extends UnifiedFontTextView
{

    public RedBadgeTextView(Context context)
    {
        super(context);
        init();
    }

    public RedBadgeTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public RedBadgeTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        useNavigationBarMode(false);
    }

    public void useNavigationBarMode(boolean flag)
    {
        if (flag)
        {
            setBackgroundResource(0x7f0c00be);
            return;
        } else
        {
            setBackgroundResource(0x7f02003f);
            return;
        }
    }
}
