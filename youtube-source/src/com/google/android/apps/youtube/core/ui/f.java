// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            k

public final class f
    implements k
{

    private final View a;
    private final View b;
    private final View c;
    private final TextView d;
    private final Button e;

    public f(View view)
    {
        a = view;
        b = view.findViewWithTag("progressbar");
        c = view.findViewWithTag("error");
        d = (TextView)view.findViewWithTag("error_message");
        e = (Button)view.findViewWithTag("retry_button");
    }

    public final View a()
    {
        return a;
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        e.setOnClickListener(onclicklistener);
    }

    public final void a(String s)
    {
        b.setVisibility(8);
        c.setVisibility(0);
        d.setText(s);
    }

    public final void b()
    {
        b.setVisibility(0);
        c.setVisibility(4);
    }

    public final void c()
    {
        b.setVisibility(8);
    }

    public final void d()
    {
        a.requestLayout();
    }
}
