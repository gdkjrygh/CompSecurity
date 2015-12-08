// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.a.d;
import android.support.v7.a.k;
import android.support.v7.internal.widget.CompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ag, i, b, s, 
//            q

public class ActionMenuItemView extends CompatTextView
    implements ag, i, android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private s a;
    private CharSequence b;
    private Drawable c;
    private q d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;

    public ActionMenuItemView(Context context)
    {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        e = context.getResources().getBoolean(d.c);
        context = context.obtainStyledAttributes(attributeset, k.e, 0, 0);
        g = context.getDimensionPixelSize(0, 0);
        context.recycle();
        setOnClickListener(this);
        setOnLongClickListener(this);
        setTransformationMethod(new b(this));
        h = -1;
    }

    private void f()
    {
        CharSequence charsequence;
label0:
        {
            boolean flag2 = false;
            boolean flag;
            boolean flag1;
            if (!TextUtils.isEmpty(b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (c != null)
            {
                flag1 = flag2;
                if (!a.l())
                {
                    break label0;
                }
                if (!e)
                {
                    flag1 = flag2;
                    if (!f)
                    {
                        break label0;
                    }
                }
            }
            flag1 = true;
        }
        if (flag & flag1)
        {
            charsequence = b;
        } else
        {
            charsequence = null;
        }
        setText(charsequence);
    }

    public final s a()
    {
        return a;
    }

    public final void a(s s1, int j)
    {
        a = s1;
        setIcon(s1.getIcon());
        setTitle(s1.a(this));
        setId(s1.getItemId());
        if (s1.isVisible())
        {
            j = 0;
        } else
        {
            j = 8;
        }
        setVisibility(j);
        setEnabled(s1.isEnabled());
    }

    public final boolean b()
    {
        return true;
    }

    public final boolean c()
    {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean d()
    {
        return c() && a.getIcon() == null;
    }

    public final boolean e()
    {
        return c();
    }

    public void onClick(View view)
    {
        if (d != null)
        {
            d.a(a);
        }
    }

    public boolean onLongClick(View view)
    {
        if (c())
        {
            return false;
        }
        view = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(view);
        getWindowVisibleDisplayFrame(rect);
        Object obj = getContext();
        int j = getWidth();
        int l = getHeight();
        int i1 = view[1];
        int j1 = l / 2;
        int k1 = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(((Context) (obj)), a.getTitle(), 0);
        if (i1 + j1 < rect.height())
        {
            ((Toast) (obj)).setGravity(53, k1 - view[0] - j / 2, l);
        } else
        {
            ((Toast) (obj)).setGravity(81, 0, l);
        }
        ((Toast) (obj)).show();
        return true;
    }

    protected void onMeasure(int j, int l)
    {
        boolean flag = c();
        if (flag && h >= 0)
        {
            super.setPadding(h, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(j, l);
        int i1 = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        int j1 = getMeasuredWidth();
        if (i1 == 0x80000000)
        {
            j = Math.min(j, g);
        } else
        {
            j = g;
        }
        if (i1 != 0x40000000 && g > 0 && j1 < j)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), l);
        }
        if (!flag && c != null)
        {
            super.setPadding((getMeasuredWidth() - c.getIntrinsicWidth()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void setCheckable(boolean flag)
    {
    }

    public void setChecked(boolean flag)
    {
    }

    public void setExpandedFormat(boolean flag)
    {
        if (f != flag)
        {
            f = flag;
            if (a != null)
            {
                a.g();
            }
        }
    }

    public void setIcon(Drawable drawable)
    {
        c = drawable;
        setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(q q1)
    {
        d = q1;
    }

    public void setPadding(int j, int l, int i1, int j1)
    {
        h = j;
        super.setPadding(j, l, i1, j1);
    }

    public void setShortcut(boolean flag, char c1)
    {
    }

    public void setTitle(CharSequence charsequence)
    {
        b = charsequence;
        setContentDescription(b);
        f();
    }
}
