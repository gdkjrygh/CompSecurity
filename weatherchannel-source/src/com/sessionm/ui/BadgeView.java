// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TabWidget;
import android.widget.TextView;

public class BadgeView extends TextView
{

    private static final int DEFAULT_CORNER_RADIUS_DIP = 8;
    private static final int DEFAULT_LR_PADDING_DIP = 5;
    private static final int DEFAULT_MARGIN_DIP = 5;
    private static final int DEFAULT_POSITION = 2;
    private static final int DEFAULT_TEXT_COLOR = -1;
    public static final int POSITION_BOTTOM_LEFT = 3;
    public static final int POSITION_BOTTOM_RIGHT = 4;
    public static final int POSITION_CENTER = 5;
    public static final int POSITION_TOP_LEFT = 1;
    public static final int POSITION_TOP_RIGHT = 2;
    private final int DEFAULT_BADGE_COLOR;
    private ShapeDrawable badgeBg;
    private int badgeColor;
    private int badgeMarginH;
    private int badgeMarginV;
    private int badgePosition;
    private Context context;
    private boolean isShown;
    private View target;
    private int targetTabIndex;

    public BadgeView(Context context1, AttributeSet attributeset, int i, View view, int j)
    {
        super(context1, attributeset, i);
        DEFAULT_BADGE_COLOR = Color.parseColor("#CCFF0000");
        init(context1, view, j);
    }

    public BadgeView(Context context1, View view)
    {
        this(context1, null, 0x1010084, view, 0);
    }

    private void applyLayoutParams()
    {
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        badgePosition;
        JVM INSTR tableswitch 1 5: default 52
    //                   1 58
    //                   2 81
    //                   3 104
    //                   4 127
    //                   5 150;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        setLayoutParams(layoutparams);
        return;
_L2:
        layoutparams.gravity = 51;
        layoutparams.setMargins(badgeMarginH, badgeMarginV, 0, 0);
        continue; /* Loop/switch isn't completed */
_L3:
        layoutparams.gravity = 53;
        layoutparams.setMargins(0, badgeMarginV, badgeMarginH, 0);
        continue; /* Loop/switch isn't completed */
_L4:
        layoutparams.gravity = 83;
        layoutparams.setMargins(badgeMarginH, 0, 0, badgeMarginV);
        continue; /* Loop/switch isn't completed */
_L5:
        layoutparams.gravity = 85;
        layoutparams.setMargins(0, 0, badgeMarginH, badgeMarginV);
        continue; /* Loop/switch isn't completed */
_L6:
        layoutparams.gravity = 17;
        layoutparams.setMargins(0, 0, 0, 0);
        if (true) goto _L1; else goto _L7
_L7:
    }

    private void applyTo(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        Object obj = view.getParent();
        FrameLayout framelayout = new FrameLayout(context);
        if (view instanceof TabWidget)
        {
            view = ((TabWidget)view).getChildTabViewAt(targetTabIndex);
            target = view;
            ((ViewGroup)view).addView(framelayout, new android.view.ViewGroup.LayoutParams(-1, -1));
            setVisibility(8);
            framelayout.addView(this);
            return;
        } else
        {
            obj = (ViewGroup)obj;
            int i = ((ViewGroup) (obj)).indexOfChild(view);
            ((ViewGroup) (obj)).removeView(view);
            ((ViewGroup) (obj)).addView(framelayout, i, layoutparams);
            framelayout.addView(view);
            setVisibility(8);
            framelayout.addView(this);
            ((ViewGroup) (obj)).invalidate();
            return;
        }
    }

    private int dipToPixels(int i)
    {
        Resources resources = getResources();
        return (int)TypedValue.applyDimension(1, i, resources.getDisplayMetrics());
    }

    private ShapeDrawable getDefaultBackground()
    {
        int i = dipToPixels(8);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RoundRectShape(new float[] {
            (float)i, (float)i, (float)i, (float)i, (float)i, (float)i, (float)i, (float)i
        }, null, null));
        shapedrawable.getPaint().setColor(badgeColor);
        return shapedrawable;
    }

    private void hide(boolean flag, Animation animation)
    {
        setVisibility(4);
        badgeBg = null;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            setBackgroundDrawable(null);
        } else
        {
            setBackground(null);
        }
        if (flag)
        {
            startAnimation(animation);
        }
        isShown = false;
    }

    private void init(Context context1, View view, int i)
    {
        context = context1.getApplicationContext();
        target = view;
        targetTabIndex = i;
        badgePosition = 2;
        badgeMarginH = dipToPixels(5);
        badgeMarginV = badgeMarginH;
        badgeColor = DEFAULT_BADGE_COLOR;
        setTypeface(Typeface.DEFAULT_BOLD);
        i = dipToPixels(5);
        setPadding(i, 0, i, 0);
        setTextColor(-1);
        context1 = new AlphaAnimation(0.0F, 1.0F);
        context1.setInterpolator(new DecelerateInterpolator());
        context1.setDuration(200L);
        context1 = new AlphaAnimation(1.0F, 0.0F);
        context1.setInterpolator(new AccelerateInterpolator());
        context1.setDuration(200L);
        isShown = false;
        if (target != null)
        {
            applyTo(target);
            return;
        } else
        {
            show();
            return;
        }
    }

    private void show(boolean flag, Animation animation)
    {
        if (getBackground() == null)
        {
            if (badgeBg == null)
            {
                badgeBg = getDefaultBackground();
            }
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                setBackgroundDrawable(badgeBg);
            } else
            {
                setBackground(badgeBg);
            }
        }
        applyLayoutParams();
        if (flag)
        {
            startAnimation(animation);
        }
        setVisibility(0);
        isShown = true;
    }

    public void hide()
    {
        hide(false, null);
    }

    public boolean isShown()
    {
        return isShown;
    }

    public void setBadgeMargin(int i, int j)
    {
        badgeMarginH = i;
        badgeMarginV = j;
    }

    public void setBadgePosition(int i)
    {
        badgePosition = i;
    }

    public void show()
    {
        show(false, null);
    }

    public void show(Animation animation)
    {
        show(true, animation);
    }
}
