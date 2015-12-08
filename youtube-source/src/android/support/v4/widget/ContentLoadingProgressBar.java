// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

// Referenced classes of package android.support.v4.widget:
//            a, b

public class ContentLoadingProgressBar extends ProgressBar
{

    private long a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final Runnable e;
    private final Runnable f;

    public ContentLoadingProgressBar(Context context)
    {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        a = -1L;
        b = false;
        c = false;
        d = false;
        e = new a(this);
        f = new b(this);
    }

    static long a(ContentLoadingProgressBar contentloadingprogressbar, long l)
    {
        contentloadingprogressbar.a = l;
        return l;
    }

    private void a()
    {
        removeCallbacks(e);
        removeCallbacks(f);
    }

    static boolean a(ContentLoadingProgressBar contentloadingprogressbar)
    {
        return contentloadingprogressbar.d;
    }

    static boolean a(ContentLoadingProgressBar contentloadingprogressbar, boolean flag)
    {
        contentloadingprogressbar.b = false;
        return false;
    }

    static boolean b(ContentLoadingProgressBar contentloadingprogressbar, boolean flag)
    {
        contentloadingprogressbar.c = false;
        return false;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a();
    }
}
