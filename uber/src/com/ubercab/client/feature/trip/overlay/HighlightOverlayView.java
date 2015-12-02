// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import duz;
import gcm;
import gcn;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ubercab.client.feature.trip.overlay:
//            CoachMarkPathView, RectangleClipView

public class HighlightOverlayView extends RelativeLayout
{

    public List a;
    gcn b;
    private Rect c;
    private int d;
    private ObjectAnimator e;
    CoachMarkPathView mCoachPathView;
    LinearLayout mContainer;
    RectangleClipView mRectangleClipView;
    TextView mTextBody;
    LinearLayout mTextContainer;
    TextView mTextTitle;

    public HighlightOverlayView(Context context)
    {
        this(context, null);
    }

    public HighlightOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HighlightOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new CopyOnWriteArrayList();
        b = new gcn(this);
        a(context);
    }

    static Rect a(HighlightOverlayView highlightoverlayview, Rect rect)
    {
        highlightoverlayview.c = rect;
        return rect;
    }

    static android.widget.RelativeLayout.LayoutParams a(boolean flag, Rect rect, int i)
    {
        return b(flag, rect, i);
    }

    private void a(Context context)
    {
        setClickable(true);
        setOnTouchListener(new android.view.View.OnTouchListener(new GestureDetector(context, b)) {

            final GestureDetector a;
            final HighlightOverlayView b;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                return a.onTouchEvent(motionevent);
            }

            
            {
                b = HighlightOverlayView.this;
                a = gesturedetector;
                super();
            }
        });
    }

    private void a(Rect rect, LinearLayout linearlayout, boolean flag)
    {
        post(new Runnable(flag, rect, linearlayout) {

            final boolean a;
            final Rect b;
            final LinearLayout c;
            final HighlightOverlayView d;

            public final void run()
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = HighlightOverlayView.a(a, b, c.getHeight());
                d.mContainer.setLayoutParams(layoutparams);
            }

            
            {
                d = HighlightOverlayView.this;
                a = flag;
                b = rect;
                c = linearlayout;
                super();
            }
        });
    }

    static void a(HighlightOverlayView highlightoverlayview, Rect rect, LinearLayout linearlayout, boolean flag)
    {
        highlightoverlayview.a(rect, linearlayout, flag);
    }

    static void a(boolean flag, LinearLayout linearlayout, LinearLayout linearlayout1, CoachMarkPathView coachmarkpathview, Resources resources)
    {
        b(flag, linearlayout, linearlayout1, coachmarkpathview, resources);
    }

    static boolean a(Rect rect, int i)
    {
        return b(rect, i);
    }

    private int[] a()
    {
        int ai[] = new int[2];
        getLocationOnScreen(ai);
        return ai;
    }

    static int[] a(HighlightOverlayView highlightoverlayview)
    {
        return highlightoverlayview.a();
    }

    public static Rect b(HighlightOverlayView highlightoverlayview)
    {
        return highlightoverlayview.c;
    }

    private static android.widget.RelativeLayout.LayoutParams b(boolean flag, Rect rect, int i)
    {
        int k = rect.top - i;
        int l = rect.bottom;
        int i1 = rect.top;
        rect = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        int j = k;
        if (flag)
        {
            j = k + ((l + i) - i1);
        }
        rect.topMargin = j;
        return rect;
    }

    private void b()
    {
        setVisibility(0);
        e.start();
        mCoachPathView.b();
        mCoachPathView.a();
        mTextContainer.setAlpha(0.0F);
        mTextContainer.animate().alpha(1.0F).setDuration(d).setStartDelay(d).start();
    }

    private static void b(boolean flag, LinearLayout linearlayout, LinearLayout linearlayout1, CoachMarkPathView coachmarkpathview, Resources resources)
    {
        linearlayout.removeAllViews();
        int i;
        int j;
        if (flag)
        {
            linearlayout.addView(coachmarkpathview);
            linearlayout.addView(linearlayout1);
        } else
        {
            linearlayout.addView(linearlayout1);
            linearlayout.addView(coachmarkpathview);
        }
        if (flag)
        {
            i = 80;
        } else
        {
            i = 48;
        }
        coachmarkpathview.b(i);
        i = Math.round(duz.a(resources, Math.round(resources.getDimension(0x7f08005f))));
        if (flag)
        {
            j = 0;
        } else
        {
            j = i;
        }
        if (!flag)
        {
            i = 0;
        }
        coachmarkpathview.setPadding(0, j, 0, i);
    }

    private static boolean b(Rect rect, int i)
    {
        return rect.top <= i - rect.bottom;
    }

    static void c(HighlightOverlayView highlightoverlayview)
    {
        highlightoverlayview.b();
    }

    public final void a(int i, int j, int k, float f)
    {
        mTextTitle.setText(i);
        mTextBody.setText(j);
        mCoachPathView.a(k);
        mCoachPathView.a(f);
    }

    public final void a(Rect rect)
    {
        post(new Runnable(rect) {

            final Rect a;
            final HighlightOverlayView b;

            public final void run()
            {
                HighlightOverlayView.a(b, a);
                int i = HighlightOverlayView.a(b)[1];
                Rect rect1 = HighlightOverlayView.b(b);
                rect1.top = rect1.top - i;
                rect1 = HighlightOverlayView.b(b);
                rect1.bottom = rect1.bottom - i;
                boolean flag = HighlightOverlayView.a(HighlightOverlayView.b(b), b.getMeasuredHeight());
                HighlightOverlayView.a(flag, b.mContainer, b.mTextContainer, b.mCoachPathView, b.getResources());
                b.mRectangleClipView.a(HighlightOverlayView.b(b));
                HighlightOverlayView.c(b);
                HighlightOverlayView.a(b, HighlightOverlayView.b(b), b.mContainer, flag);
            }

            
            {
                b = HighlightOverlayView.this;
                a = rect;
                super();
            }
        });
    }

    public final void a(gcm gcm)
    {
        a.add(gcm);
    }

    public final void b(gcm gcm)
    {
        a.remove(gcm);
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
            e = ObjectAnimator.ofInt(this, "alpha", new int[] {
                0, 255
            });
            e.setDuration(getResources().getInteger(0x7f0b0009));
            d = getResources().getInteger(0x7f0b000a);
            return;
        }
    }
}
