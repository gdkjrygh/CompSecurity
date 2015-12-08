// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Util
{

    public Util()
    {
    }

    public static android.view.ViewGroup.LayoutParams getLayoutParamsBasedOnParent(View view, int i, int j)
        throws IllegalArgumentException
    {
        view = view.getParent();
        if (view instanceof FrameLayout)
        {
            return new android.widget.FrameLayout.LayoutParams(i, j);
        }
        if (view instanceof RelativeLayout)
        {
            return new android.widget.RelativeLayout.LayoutParams(i, j);
        }
        if (view instanceof LinearLayout)
        {
            return new android.widget.LinearLayout.LayoutParams(i, j);
        } else
        {
            throw new IllegalArgumentException("The PARENT of a FrameLayout container used by the GoogleMediaFramework must be a LinearLayout, FrameLayout, or RelativeLayout. Please ensure that the container is inside one of these three supported view groups.");
        }
    }
}
