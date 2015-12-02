// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.dispatch;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import drv;
import fr.castorflex.android.smoothprogressbar.SmoothProgressBar;
import fxv;
import fxw;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DispatchingStatusToolbarOverlay extends FrameLayout
{

    private int a;
    private Animator b;
    private List c;
    SmoothProgressBar mProgressBarRequesting;
    TextView mTextViewStatus;

    public DispatchingStatusToolbarOverlay(Context context)
    {
        this(context, null);
    }

    public DispatchingStatusToolbarOverlay(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DispatchingStatusToolbarOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = fxw.a;
        c = new CopyOnWriteArrayList();
        if (!isInEditMode());
    }

    static int a(DispatchingStatusToolbarOverlay dispatchingstatustoolbaroverlay, int i)
    {
        dispatchingstatustoolbaroverlay.a = i;
        return i;
    }

    static void a(DispatchingStatusToolbarOverlay dispatchingstatustoolbaroverlay)
    {
        dispatchingstatustoolbaroverlay.d();
    }

    static int b(DispatchingStatusToolbarOverlay dispatchingstatustoolbaroverlay)
    {
        return dispatchingstatustoolbaroverlay.a;
    }

    static List c(DispatchingStatusToolbarOverlay dispatchingstatustoolbaroverlay)
    {
        return dispatchingstatustoolbaroverlay.c;
    }

    private void d()
    {
        Context context = getContext();
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[fxw.a().length];
                try
                {
                    a[fxw.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[fxw.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[fxw.c - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[a - 1])
        {
        default:
            return;

        case 1: // '\001'
            mTextViewStatus.setText(context.getString(0x7f07039e));
            mProgressBarRequesting.setIndeterminate(true);
            int i = getResources().getColor(0x7f0d0078);
            mProgressBarRequesting.a(i);
            return;

        case 2: // '\002'
            mTextViewStatus.setText(context.getString(0x7f07026a));
            mProgressBarRequesting.setIndeterminate(false);
            mProgressBarRequesting.a(getResources().getColor(0x7f0d006c));
            mProgressBarRequesting.setProgress(0);
            mProgressBarRequesting.setMax(800);
            return;

        case 3: // '\003'
            mTextViewStatus.setText(context.getString(0x7f070081));
            break;
        }
        mProgressBarRequesting.setIndeterminate(true);
        mProgressBarRequesting.a(getResources().getColor(0x7f0d006c));
    }

    public final void a()
    {
        a = fxw.a;
        d();
    }

    public final void a(fxv fxv)
    {
        c.add(fxv);
    }

    public final void b()
    {
        drv drv = new drv() {

            final DispatchingStatusToolbarOverlay a;

            public final void onAnimationEnd(Animator animator)
            {
                animator = a;
                int i;
                if (a())
                {
                    i = fxw.a;
                } else
                {
                    i = fxw.c;
                }
                DispatchingStatusToolbarOverlay.a(animator, i);
                DispatchingStatusToolbarOverlay.a(a);
                if (DispatchingStatusToolbarOverlay.b(a) == fxw.c)
                {
                    for (animator = DispatchingStatusToolbarOverlay.c(a).iterator(); animator.hasNext(); ((fxv)animator.next()).e()) { }
                }
            }

            public final void onAnimationStart(Animator animator)
            {
                DispatchingStatusToolbarOverlay.a(a, fxw.b);
                DispatchingStatusToolbarOverlay.a(a);
            }

            
            {
                a = DispatchingStatusToolbarOverlay.this;
                super();
            }
        };
        b = ObjectAnimator.ofInt(mProgressBarRequesting, "progress", new int[] {
            0, 800
        });
        b.setInterpolator(new LinearInterpolator());
        b.setDuration(800L);
        b.addListener(drv);
        b.start();
    }

    public final void c()
    {
        if (b != null && b.isRunning())
        {
            b.cancel();
            b = null;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        d();
    }
}
