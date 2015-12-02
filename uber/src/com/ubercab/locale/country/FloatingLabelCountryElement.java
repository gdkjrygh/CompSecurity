// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.country;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.ubercab.ui.FloatingLabelElement;
import com.ubercab.ui.TextView;
import gog;
import hop;
import hsk;

// Referenced classes of package com.ubercab.locale.country:
//            CountryButton

public class FloatingLabelCountryElement extends FloatingLabelElement
{

    private CountryButton c;

    public FloatingLabelCountryElement(Context context)
    {
        this(context, null);
    }

    public FloatingLabelCountryElement(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, gog.floatingLabelStyle);
    }

    public FloatingLabelCountryElement(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = (android.widget.LinearLayout.LayoutParams)c.getLayoutParams();
        context.width = -2;
        c.setLayoutParams(context);
        i = c.getPaddingBottom();
        int j = c.getPaddingTop();
        context = new Rect();
        c.getBackground().getPadding(context);
        c.setPadding(0, 0, ((Rect) (context)).right, 0);
        context = c.d();
        context.setPadding(context.getPaddingLeft(), j, context.getPaddingRight(), i);
    }

    protected final hop a(Context context)
    {
        c = new CountryButton(context);
        c.c();
        return new hop(c, c.d(), new hsk() {

            final FloatingLabelCountryElement a;

            public final void a_(boolean flag)
            {
            }

            
            {
                a = FloatingLabelCountryElement.this;
                super();
            }
        });
    }

    protected final void a(Parcelable parcelable)
    {
        c.onRestoreInstanceState(parcelable);
    }

    protected final Parcelable c()
    {
        return c.onSaveInstanceState();
    }

    public final CountryButton d()
    {
        return c;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        j = android.view.View.MeasureSpec.makeMeasureSpec(c.getMeasuredHeight(), 0x40000000);
        c.measure(i, j);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        c.setEnabled(flag);
    }
}
