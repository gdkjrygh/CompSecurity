// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            e

public class ShuffleButton extends Button
{

    private e a;

    public ShuffleButton(Context context)
    {
        super(context);
    }

    public ShuffleButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(e e1)
    {
        a = e1;
    }

    public boolean performClick()
    {
        boolean flag = super.performClick();
        if (a != null)
        {
            a.a();
        }
        return flag;
    }
}
