// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.trip.overlay.CoachMarkPathView;
import com.ubercab.ui.TextView;
import dbf;
import dfp;
import ekl;
import gmg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddMusicOverlayView extends LinearLayout
{

    public gmg a;
    private final List b;
    TextView mFirstLineTextView;
    TextView mHeadingTextView;
    TextView mSecondLineTextView;
    CoachMarkPathView mViewCoachMark;

    public AddMusicOverlayView(Context context)
    {
        this(context, null);
    }

    public AddMusicOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AddMusicOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new ArrayList();
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
    }

    public final void a(ekl ekl1)
    {
        b.add(ekl1);
    }

    public final void b(ekl ekl1)
    {
        b.remove(ekl1);
    }

    void onClickMusicOverlay()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ekl)iterator.next()).a()) { }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        if (a.a(dbf.bo) && a.a(dbf.bp))
        {
            mHeadingTextView.setText(0x7f0702c2);
            mSecondLineTextView.setVisibility(0);
        } else
        {
            mHeadingTextView.setText(0x7f0702c3);
            mSecondLineTextView.setVisibility(8);
        }
        mViewCoachMark.a();
    }
}
