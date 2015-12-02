// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.ProfileTheme;
import com.ubercab.ui.CircleImageView;
import dtu;
import ezc;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            BadgeView

public class AccountImageView extends FrameLayout
{

    private final Paint a;
    private final boolean b;
    private final Canvas c;
    private final Paint d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Bitmap i;
    private boolean j;
    BadgeView mBadgeView;
    CircleImageView mImageView;

    public AccountImageView(Context context)
    {
        this(context, null);
    }

    public AccountImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AccountImageView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        a = new Paint(1);
        d = new Paint(1);
        h = -1;
        b = true;
        c = new Canvas();
        d.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        c();
    }

    private void a(int k)
    {
        h = k;
        c();
    }

    private void c()
    {
        if (!b)
        {
            return;
        } else
        {
            a.setColor(h);
            a.setStyle(android.graphics.Paint.Style.STROKE);
            a.setStrokeWidth(3F);
            invalidate();
            return;
        }
    }

    public final BadgeView a()
    {
        return mBadgeView;
    }

    public final void a(Profile profile)
    {
        j = true;
        if (profile.getThemeFromChildAttributes() != null && !TextUtils.isEmpty(profile.getThemeFromChildAttributes().getColor()))
        {
            a(dtu.a(profile.getThemeFromChildAttributes().getColor()));
            return;
        } else
        {
            a(ezc.b(getContext(), profile));
            return;
        }
    }

    public final CircleImageView b()
    {
        return mImageView;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        int k = (getWidth() - 3 - g) / 2;
        if (j)
        {
            c.drawCircle(getWidth() / 2, getHeight() / 2, k, a);
        }
        super.dispatchDraw(canvas);
        if (j)
        {
            int l = f / 2;
            int i1 = getWidth();
            int j1 = getHeight();
            int k1 = e;
            c.drawCircle(i1 - l, j1 - l - k1, l + 5, d);
        }
        canvas.drawBitmap(i, 0.0F, 0.0F, null);
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        if (view.getId() == 0x7f0e0098)
        {
            return super.drawChild(canvas, view, l);
        } else
        {
            return super.drawChild(c, view, l);
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        g = ((android.view.ViewGroup.MarginLayoutParams)mImageView.getLayoutParams()).bottomMargin;
    }

    protected void onSizeChanged(int k, int l, int i1, int j1)
    {
        super.onSizeChanged(k, l, i1, j1);
        if (k != 0 && l != 0)
        {
            i = Bitmap.createBitmap(k, l, android.graphics.Bitmap.Config.ARGB_8888);
            c.setBitmap(i);
            e = ((android.widget.FrameLayout.LayoutParams)mBadgeView.getLayoutParams()).bottomMargin;
            f = mBadgeView.getMeasuredWidth();
        }
    }
}
