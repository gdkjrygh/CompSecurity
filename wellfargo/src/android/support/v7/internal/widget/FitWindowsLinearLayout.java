// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ah, ai

public class FitWindowsLinearLayout extends LinearLayout
    implements ah
{

    private ai a;

    public FitWindowsLinearLayout(Context context)
    {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        if (a != null)
        {
            a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(ai ai1)
    {
        a = ai1;
    }
}
