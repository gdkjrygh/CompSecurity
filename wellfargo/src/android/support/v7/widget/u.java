// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v7.a.b;
import android.support.v7.internal.widget.TintContextWrapper;
import android.support.v7.internal.widget.bc;
import android.support.v7.internal.widget.bd;
import android.support.v7.internal.widget.bf;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

public class u extends MultiAutoCompleteTextView
    implements TintableBackgroundView
{

    private static final int a[] = {
        0x10100d4, 0x1010176
    };
    private bc b;
    private bc c;
    private bd d;

    public u(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.autoCompleteTextViewStyle);
    }

    public u(Context context, AttributeSet attributeset, int i)
    {
        super(TintContextWrapper.a(context), attributeset, i);
        if (bd.a)
        {
            context = bf.a(getContext(), attributeset, a, i, 0);
            d = context.c();
            if (context.e(0))
            {
                attributeset = context.c().c(context.f(0, -1));
                if (attributeset != null)
                {
                    setInternalBackgroundTint(attributeset);
                }
            }
            if (context.e(1))
            {
                setDropDownBackgroundDrawable(context.a(1));
            }
            context.b();
        }
    }

    private void a()
    {
        if (getBackground() != null)
        {
            if (c != null)
            {
                bd.a(this, c);
            } else
            if (b != null)
            {
                bd.a(this, b);
                return;
            }
        }
    }

    private void setInternalBackgroundTint(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (b == null)
            {
                b = new bc();
            }
            b.a = colorstatelist;
            b.d = true;
        } else
        {
            b = null;
        }
        a();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        a();
    }

    public ColorStateList getSupportBackgroundTintList()
    {
        if (c != null)
        {
            return c.a;
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        if (c != null)
        {
            return c.b;
        } else
        {
            return null;
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        setInternalBackgroundTint(null);
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        ColorStateList colorstatelist;
        if (d != null)
        {
            colorstatelist = d.c(i);
        } else
        {
            colorstatelist = null;
        }
        setInternalBackgroundTint(colorstatelist);
    }

    public void setDropDownBackgroundResource(int i)
    {
        if (d != null)
        {
            setDropDownBackgroundDrawable(d.a(i));
            return;
        } else
        {
            super.setDropDownBackgroundResource(i);
            return;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (c == null)
        {
            c = new bc();
        }
        c.a = colorstatelist;
        c.d = true;
        a();
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (c == null)
        {
            c = new bc();
        }
        c.b = mode;
        c.c = true;
        a();
    }

}
