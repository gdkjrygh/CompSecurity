// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.a.c;
import android.support.v7.app.ActionBar;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ActionBarOverlayLayout extends FrameLayout
{

    static final int a[];
    private int b;
    private ActionBar c;
    private final Rect d;

    public ActionBarOverlayLayout(Context context)
    {
        super(context);
        d = new Rect(0, 0, 0, 0);
        a();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new Rect(0, 0, 0, 0);
        a();
    }

    private void a()
    {
        TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(a);
        b = typedarray.getDimensionPixelSize(0, 0);
        typedarray.recycle();
    }

    public void setActionBar(ActionBar actionbar)
    {
        c = actionbar;
    }

    static 
    {
        a = (new int[] {
            c.a
        });
    }
}
