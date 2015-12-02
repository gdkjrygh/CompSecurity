// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import gcq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToolbarTutorialOverlayView extends LinearLayout
    implements android.view.View.OnClickListener
{

    private final List a;

    public ToolbarTutorialOverlayView(Context context)
    {
        this(context, null);
    }

    public ToolbarTutorialOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ToolbarTutorialOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ArrayList();
    }

    private void b()
    {
        setVisibility(8);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gcq)iterator.next()).a()) { }
    }

    public final void a()
    {
        setVisibility(0);
    }

    public final void a(gcq gcq1)
    {
        a.add(gcq1);
    }

    public final void b(gcq gcq1)
    {
        a.remove(gcq1);
    }

    public void onClick(View view)
    {
        b();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            setOnClickListener(this);
            return;
        }
    }
}
