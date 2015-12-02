// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pins;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import dux;
import gbn;

public class DestinationPinView extends FrameLayout
{

    private gbn a;
    TextView mTextViewCapacity;
    TextView mTextViewFare;
    TextView mTextViewTagline;
    View mViewFareDivider;
    ViewGroup mViewGroupPopup;

    public DestinationPinView(Context context)
    {
        this(context, null);
    }

    public DestinationPinView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DestinationPinView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
    }

    private String e()
    {
        return mTextViewFare.getText().toString();
    }

    private boolean f()
    {
        return mTextViewTagline.getVisibility() == 0;
    }

    private String g()
    {
        return mTextViewCapacity.getText().toString();
    }

    private Rect h()
    {
        Rect rect = new Rect();
        mTextViewCapacity.getHitRect(rect);
        if (f())
        {
            rect.offset(0, i().height());
        }
        return rect;
    }

    private Rect i()
    {
        Rect rect = new Rect();
        mTextViewTagline.getHitRect(rect);
        return rect;
    }

    private Rect j()
    {
        Rect rect = new Rect();
        mViewGroupPopup.getHitRect(rect);
        return rect;
    }

    public final Point a()
    {
        Point point = new Point();
        point.set((int)(getX() + (float)(getWidth() / 2)), (int)(getY() + (float)getHeight()));
        return point;
    }

    public final void a(Point point)
    {
        if (a != null)
        {
            if (h().contains(point.x, point.y))
            {
                a.c();
                return;
            }
            if (j().contains(point.x, point.y))
            {
                a.z_();
                return;
            }
        }
    }

    public final void a(gbn gbn1)
    {
        a = gbn1;
    }

    public final void a(String s)
    {
        mTextViewFare.setText(s);
    }

    public final void a(boolean flag)
    {
        int k;
        if (flag)
        {
            k = 0x7f0201ec;
        } else
        {
            k = 0;
        }
        mTextViewFare.setCompoundDrawablesWithIntrinsicBounds(k, 0, 0, 0);
    }

    public final void a(boolean flag, boolean flag1)
    {
        boolean flag4 = false;
        boolean flag2;
        boolean flag3;
        if (flag && !TextUtils.isEmpty(e()))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1 && !TextUtils.isEmpty(g()))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag2 && !flag3)
        {
            mViewGroupPopup.setVisibility(8);
            return;
        }
        mViewGroupPopup.setVisibility(0);
        Object obj = mTextViewCapacity;
        int k;
        int l;
        if (flag3)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        ((TextView) (obj)).setVisibility(l);
        obj = mTextViewFare;
        if (flag2)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        ((TextView) (obj)).setVisibility(l);
        obj = mTextViewTagline;
        if (TextUtils.isEmpty(mTextViewTagline.getText()))
        {
            l = 8;
        } else
        {
            l = 0;
        }
        ((TextView) (obj)).setVisibility(l);
        obj = mViewFareDivider;
        if (flag3 && flag2)
        {
            k = ((flag4) ? 1 : 0);
        } else
        {
            k = 8;
        }
        ((View) (obj)).setVisibility(k);
    }

    public final void b(String s)
    {
        mTextViewTagline.setText(dux.a(s, getResources().getColor(0x7f0d0071)));
    }

    public final boolean b()
    {
        return mTextViewFare.getVisibility() == 0;
    }

    public final void c(String s)
    {
        mTextViewCapacity.setText(s);
    }

    public final boolean c()
    {
        return mTextViewCapacity.getVisibility() == 0;
    }

    public final Bitmap d()
    {
        measure(-2, -2);
        Bitmap bitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        draw(canvas);
        return bitmap;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }
}
