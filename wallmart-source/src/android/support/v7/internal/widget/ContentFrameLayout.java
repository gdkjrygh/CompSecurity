// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{

    private final Rect mDecorPadding;
    private TypedValue mFixedHeightMajor;
    private TypedValue mFixedHeightMinor;
    private TypedValue mFixedWidthMajor;
    private TypedValue mFixedWidthMinor;
    private TypedValue mMinWidthMajor;
    private TypedValue mMinWidthMinor;

    public ContentFrameLayout(Context context)
    {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mDecorPadding = new Rect();
    }

    public void dispatchFitSystemWindows(Rect rect)
    {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor()
    {
        if (mFixedHeightMajor == null)
        {
            mFixedHeightMajor = new TypedValue();
        }
        return mFixedHeightMajor;
    }

    public TypedValue getFixedHeightMinor()
    {
        if (mFixedHeightMinor == null)
        {
            mFixedHeightMinor = new TypedValue();
        }
        return mFixedHeightMinor;
    }

    public TypedValue getFixedWidthMajor()
    {
        if (mFixedWidthMajor == null)
        {
            mFixedWidthMajor = new TypedValue();
        }
        return mFixedWidthMajor;
    }

    public TypedValue getFixedWidthMinor()
    {
        if (mFixedWidthMinor == null)
        {
            mFixedWidthMinor = new TypedValue();
        }
        return mFixedWidthMinor;
    }

    public TypedValue getMinWidthMajor()
    {
        if (mMinWidthMajor == null)
        {
            mMinWidthMajor = new TypedValue();
        }
        return mMinWidthMajor;
    }

    public TypedValue getMinWidthMinor()
    {
        if (mMinWidthMinor == null)
        {
            mMinWidthMinor = new TypedValue();
        }
        return mMinWidthMinor;
    }

    protected void onMeasure(int i, int j)
    {
        DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
        TypedValue typedvalue;
        int l;
        boolean flag;
        int i1;
        int j1;
        int k1;
        int l1;
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k1 = android.view.View.MeasureSpec.getMode(i);
        l1 = android.view.View.MeasureSpec.getMode(j);
        j1 = 0;
        flag = j1;
        i1 = i;
        if (k1 == 0x80000000)
        {
            if (l != 0)
            {
                typedvalue = mFixedWidthMinor;
            } else
            {
                typedvalue = mFixedWidthMajor;
            }
            flag = j1;
            i1 = i;
            if (typedvalue != null)
            {
                flag = j1;
                i1 = i;
                if (typedvalue.type != 0)
                {
                    int k = 0;
                    if (typedvalue.type == 5)
                    {
                        k = (int)typedvalue.getDimension(displaymetrics);
                    } else
                    if (typedvalue.type == 6)
                    {
                        k = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
                    }
                    flag = j1;
                    i1 = i;
                    if (k > 0)
                    {
                        i1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k - (mDecorPadding.left + mDecorPadding.right), android.view.View.MeasureSpec.getSize(i)), 0x40000000);
                        flag = true;
                    }
                }
            }
        }
        k = j;
        if (l1 == 0x80000000)
        {
            if (l != 0)
            {
                typedvalue = mFixedHeightMajor;
            } else
            {
                typedvalue = mFixedHeightMinor;
            }
            k = j;
            if (typedvalue != null)
            {
                k = j;
                if (typedvalue.type != 0)
                {
                    i = 0;
                    if (typedvalue.type == 5)
                    {
                        i = (int)typedvalue.getDimension(displaymetrics);
                    } else
                    if (typedvalue.type == 6)
                    {
                        i = (int)typedvalue.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
                    }
                    k = j;
                    if (i > 0)
                    {
                        k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i - (mDecorPadding.top + mDecorPadding.bottom), android.view.View.MeasureSpec.getSize(j)), 0x40000000);
                    }
                }
            }
        }
        super.onMeasure(i1, k);
        l1 = getMeasuredWidth();
        i1 = 0;
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000);
        j = i1;
        i = j1;
        if (!flag)
        {
            j = i1;
            i = j1;
            if (k1 == 0x80000000)
            {
                if (l != 0)
                {
                    typedvalue = mMinWidthMinor;
                } else
                {
                    typedvalue = mMinWidthMajor;
                }
                j = i1;
                i = j1;
                if (typedvalue != null)
                {
                    j = i1;
                    i = j1;
                    if (typedvalue.type != 0)
                    {
                        i = 0;
                        if (typedvalue.type == 5)
                        {
                            i = (int)typedvalue.getDimension(displaymetrics);
                        } else
                        if (typedvalue.type == 6)
                        {
                            i = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
                        }
                        l = i;
                        if (i > 0)
                        {
                            l = i - (mDecorPadding.left + mDecorPadding.right);
                        }
                        j = i1;
                        i = j1;
                        if (l1 < l)
                        {
                            i = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
                            j = 1;
                        }
                    }
                }
            }
        }
        if (j != 0)
        {
            super.onMeasure(i, k);
        }
    }

    public void setDecorPadding(int i, int j, int k, int l)
    {
        mDecorPadding.set(i, j, k, l);
        if (ViewCompat.isLaidOut(this))
        {
            requestLayout();
        }
    }
}
