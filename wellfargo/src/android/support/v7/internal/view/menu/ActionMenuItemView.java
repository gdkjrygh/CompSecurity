// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.a.c;
import android.support.v7.a.l;
import android.support.v7.widget.ag;
import android.support.v7.widget.k;
import android.support.v7.widget.y;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package android.support.v7.internal.view.menu:
//            aa, m, b, k, 
//            c

public class ActionMenuItemView extends y
    implements aa, k, android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private m a;
    private CharSequence b;
    private Drawable c;
    private android.support.v7.internal.view.menu.k d;
    private ag e;
    private android.support.v7.internal.view.menu.c f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context)
    {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        Resources resources = context.getResources();
        g = resources.getBoolean(c.abc_config_allowActionMenuItemTextWithIcon);
        context = context.obtainStyledAttributes(attributeset, l.ActionMenuItemView, i1, 0);
        i = context.getDimensionPixelSize(l.ActionMenuItemView_android_minWidth, 0);
        context.recycle();
        k = (int)(resources.getDisplayMetrics().density * 32F + 0.5F);
        setOnClickListener(this);
        setOnLongClickListener(this);
        j = -1;
    }

    static android.support.v7.internal.view.menu.c a(ActionMenuItemView actionmenuitemview)
    {
        return actionmenuitemview.f;
    }

    static android.support.v7.internal.view.menu.k b(ActionMenuItemView actionmenuitemview)
    {
        return actionmenuitemview.d;
    }

    static m c(ActionMenuItemView actionmenuitemview)
    {
        return actionmenuitemview.a;
    }

    private void e()
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
                if (!a.m())
                {
                    break label0;
                }
                if (!g)
                {
                    flag1 = flag2;
                    if (!h)
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

    public void a(m m1, int i1)
    {
        a = m1;
        setIcon(m1.getIcon());
        setTitle(m1.a(this));
        setId(m1.getItemId());
        if (m1.isVisible())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        setVisibility(i1);
        setEnabled(m1.isEnabled());
        if (m1.hasSubMenu() && e == null)
        {
            e = new b(this);
        }
    }

    public boolean a()
    {
        return true;
    }

    public boolean b()
    {
        return !TextUtils.isEmpty(getText());
    }

    public boolean c()
    {
        return b() && a.getIcon() == null;
    }

    public boolean d()
    {
        return b();
    }

    public m getItemData()
    {
        return a;
    }

    public void onClick(View view)
    {
        if (d != null)
        {
            d.a(a);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        g = getContext().getResources().getBoolean(c.abc_config_allowActionMenuItemTextWithIcon);
        e();
    }

    public boolean onLongClick(View view)
    {
        if (b())
        {
            return false;
        }
        int ai[] = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(ai);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int i1 = getWidth();
        int k1 = getHeight();
        int l1 = ai[1];
        int i2 = k1 / 2;
        int j1 = ai[0] + i1 / 2;
        i1 = j1;
        if (ViewCompat.getLayoutDirection(view) == 0)
        {
            i1 = context.getResources().getDisplayMetrics().widthPixels - j1;
        }
        view = Toast.makeText(context, a.getTitle(), 0);
        if (l1 + i2 < rect.height())
        {
            view.setGravity(0x800035, i1, k1);
        } else
        {
            view.setGravity(81, 0, k1);
        }
        view.show();
        return true;
    }

    protected void onMeasure(int i1, int j1)
    {
        boolean flag = b();
        if (flag && j >= 0)
        {
            super.setPadding(j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i1, j1);
        int k1 = android.view.View.MeasureSpec.getMode(i1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        int l1 = getMeasuredWidth();
        if (k1 == 0x80000000)
        {
            i1 = Math.min(i1, i);
        } else
        {
            i1 = i;
        }
        if (k1 != 0x40000000 && i > 0 && l1 < i1)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), j1);
        }
        if (!flag && c != null)
        {
            super.setPadding((getMeasuredWidth() - c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a.hasSubMenu() && e != null && e.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
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
        if (h != flag)
        {
            h = flag;
            if (a != null)
            {
                a.h();
            }
        }
    }

    public void setIcon(Drawable drawable)
    {
        c = drawable;
        if (drawable != null)
        {
            int l1 = drawable.getIntrinsicWidth();
            int k1 = drawable.getIntrinsicHeight();
            int j1 = k1;
            int i1 = l1;
            if (l1 > k)
            {
                float f1 = (float)k / (float)l1;
                i1 = k;
                j1 = (int)((float)k1 * f1);
            }
            l1 = j1;
            k1 = i1;
            if (j1 > k)
            {
                float f2 = (float)k / (float)j1;
                l1 = k;
                k1 = (int)((float)i1 * f2);
            }
            drawable.setBounds(0, 0, k1, l1);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(android.support.v7.internal.view.menu.k k1)
    {
        d = k1;
    }

    public void setPadding(int i1, int j1, int k1, int l1)
    {
        j = i1;
        super.setPadding(i1, j1, k1, l1);
    }

    public void setPopupCallback(android.support.v7.internal.view.menu.c c1)
    {
        f = c1;
    }

    public void setTitle(CharSequence charsequence)
    {
        b = charsequence;
        setContentDescription(b);
        e();
    }
}
