// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.b.a;
import android.support.v7.internal.widget.ba;
import android.support.v7.internal.widget.bc;
import android.support.v7.internal.widget.bd;
import android.support.v7.internal.widget.bf;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class q extends Button
    implements TintableBackgroundView
{

    private static final int a[] = {
        0x10100d4
    };
    private bc b;
    private bc c;
    private bd d;

    public q(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.buttonStyle);
    }

    public q(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (bd.a)
        {
            bf bf1 = bf.a(getContext(), attributeset, a, i, 0);
            if (bf1.e(0))
            {
                ColorStateList colorstatelist = bf1.c().c(bf1.f(0, -1));
                if (colorstatelist != null)
                {
                    setInternalBackgroundTint(colorstatelist);
                }
            }
            d = bf1.c();
            bf1.b();
        }
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, l.AppCompatTextView, i, 0);
        int j = typedarray.getResourceId(l.AppCompatTextView_android_textAppearance, -1);
        typedarray.recycle();
        if (j != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(j, l.TextAppearance);
            if (typedarray1.hasValue(l.TextAppearance_textAllCaps))
            {
                setAllCaps(typedarray1.getBoolean(l.TextAppearance_textAllCaps, false));
            }
            typedarray1.recycle();
        }
        attributeset = context.obtainStyledAttributes(attributeset, l.AppCompatTextView, i, 0);
        if (attributeset.hasValue(l.AppCompatTextView_textAllCaps))
        {
            setAllCaps(attributeset.getBoolean(l.AppCompatTextView_textAllCaps, false));
        }
        attributeset.recycle();
        attributeset = getTextColors();
        if (attributeset != null && !attributeset.isStateful())
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                i = ba.c(context, 0x1010038);
            } else
            {
                i = ba.a(context, 0x1010038);
            }
            setTextColor(ba.a(attributeset.getDefaultColor(), i));
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/widget/Button.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(android/widget/Button.getName());
    }

    public void setAllCaps(boolean flag)
    {
        a a1;
        if (flag)
        {
            a1 = new a(getContext());
        } else
        {
            a1 = null;
        }
        setTransformationMethod(a1);
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

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        context = context.obtainStyledAttributes(i, l.TextAppearance);
        if (context.hasValue(l.TextAppearance_textAllCaps))
        {
            setAllCaps(context.getBoolean(l.TextAppearance_textAllCaps, false));
        }
        context.recycle();
    }

}
