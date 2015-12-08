// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v7.b.b;
import android.support.v7.b.g;
import android.support.v7.media.ad;
import android.support.v7.media.s;
import android.support.v7.media.u;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package android.support.v7.app:
//            ab, z, p, MediaRouteChooserDialogFragment, 
//            MediaRouteControllerDialogFragment

public class MediaRouteButton extends View
{

    private static final int l[] = {
        0x10100a0
    };
    private static final int m[] = {
        0x101009f
    };
    private final u a;
    private final p b;
    private s c;
    private z d;
    private boolean e;
    private Drawable f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;

    public MediaRouteButton(Context context)
    {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.b);
    }

    public MediaRouteButton(Context context, AttributeSet attributeset, int i1)
    {
        super(android.support.v7.app.ab.a(context, false), attributeset, i1);
        c = s.a;
        d = android.support.v7.app.z.a();
        context = getContext();
        a = u.a(context);
        b = new p(this, (byte)0);
        context = context.obtainStyledAttributes(attributeset, g.r, i1, 0);
        attributeset = context.getDrawable(2);
        if (f != null)
        {
            f.setCallback(null);
            unscheduleDrawable(f);
        }
        f = attributeset;
        if (attributeset != null)
        {
            attributeset.setCallback(this);
            attributeset.setState(getDrawableState());
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            attributeset.setVisible(flag, false);
        }
        refreshDrawableState();
        j = context.getDimensionPixelSize(0, 0);
        k = context.getDimensionPixelSize(1, 0);
        context.recycle();
        setClickable(true);
        setLongClickable(true);
    }

    private void a()
    {
        boolean flag = false;
        if (e)
        {
            Object obj = a;
            obj = u.c();
            boolean flag1;
            boolean flag2;
            if (!((ad) (obj)).f() && ((ad) (obj)).a(c))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 && ((ad) (obj)).d())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (g != flag1)
            {
                g = flag1;
                flag = true;
            }
            if (i != flag2)
            {
                i = flag2;
                flag = true;
            }
            if (flag)
            {
                refreshDrawableState();
            }
            obj = a;
            setEnabled(u.a(c, 1));
        }
    }

    static void a(MediaRouteButton mediaroutebutton)
    {
        mediaroutebutton.a();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (f != null)
        {
            int ai[] = getDrawableState();
            f.setState(ai);
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        if (getBackground() != null)
        {
            android.support.v4.a.a.a.a(getBackground());
        }
        if (f != null)
        {
            android.support.v4.a.a.a.a(f);
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        e = true;
        if (!c.b())
        {
            a.a(c, b);
        }
        a();
    }

    protected int[] onCreateDrawableState(int i1)
    {
        int ai[] = super.onCreateDrawableState(i1 + 1);
        if (i)
        {
            mergeDrawableStates(ai, m);
        } else
        if (g)
        {
            mergeDrawableStates(ai, l);
            return ai;
        }
        return ai;
    }

    public void onDetachedFromWindow()
    {
        e = false;
        if (!c.b())
        {
            a.a(b);
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (f != null)
        {
            int j2 = getPaddingLeft();
            int k2 = getWidth();
            int l2 = getPaddingRight();
            int k1 = getPaddingTop();
            int l1 = getHeight();
            int i2 = getPaddingBottom();
            int i1 = f.getIntrinsicWidth();
            int j1 = f.getIntrinsicHeight();
            j2 += (k2 - l2 - j2 - i1) / 2;
            k1 = (l1 - i2 - k1 - j1) / 2 + k1;
            f.setBounds(j2, k1, j2 + i1, k1 + j1);
            f.draw(canvas);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int k2;
        i2 = 0;
        l1 = android.view.View.MeasureSpec.getSize(i1);
        k1 = android.view.View.MeasureSpec.getSize(j1);
        int j2 = android.view.View.MeasureSpec.getMode(i1);
        j1 = android.view.View.MeasureSpec.getMode(j1);
        k2 = j;
        int l2;
        if (f != null)
        {
            i1 = f.getIntrinsicWidth();
        } else
        {
            i1 = 0;
        }
        k2 = Math.max(k2, i1);
        l2 = k;
        i1 = i2;
        if (f != null)
        {
            i1 = f.getIntrinsicHeight();
        }
        i2 = Math.max(l2, i1);
        j2;
        JVM INSTR lookupswitch 2: default 116
    //                   -2147483648: 187
    //                   1073741824: 181;
           goto _L1 _L2 _L3
_L1:
        i1 = k2 + getPaddingLeft() + getPaddingRight();
_L7:
        j1;
        JVM INSTR lookupswitch 2: default 156
    //                   -2147483648: 213
    //                   1073741824: 208;
           goto _L4 _L5 _L6
_L4:
        j1 = getPaddingTop() + i2 + getPaddingBottom();
_L8:
        setMeasuredDimension(i1, j1);
        return;
_L3:
        i1 = l1;
          goto _L7
_L2:
        i1 = Math.min(l1, k2 + getPaddingLeft() + getPaddingRight());
          goto _L7
_L6:
        j1 = k1;
          goto _L8
_L5:
        j1 = Math.min(k1, getPaddingTop() + i2 + getPaddingBottom());
          goto _L8
    }

    public boolean performClick()
    {
        Object obj2;
        boolean flag1;
        obj2 = null;
        flag1 = super.performClick();
        if (!flag1)
        {
            playSoundEffect(0);
        }
        if (e) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L7:
        Object obj;
        Activity activity;
        return flag || flag1;
_L2:
        obj = getContext();
_L5:
        if (!(obj instanceof ContextWrapper))
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (!(obj instanceof Activity)) goto _L4; else goto _L3
_L3:
        activity = (Activity)obj;
_L6:
        obj = obj2;
        if (activity instanceof FragmentActivity)
        {
            obj = ((FragmentActivity)activity).c();
        }
        if (obj == null)
        {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        break MISSING_BLOCK_LABEL_112;
_L4:
        obj = ((ContextWrapper)obj).getBaseContext();
          goto _L5
        activity = null;
          goto _L6
        Object obj1 = a;
        obj1 = u.c();
        if (((ad) (obj1)).f() || !((ad) (obj1)).a(c))
        {
label0:
            {
                if (((l) (obj)).a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null)
                {
                    break label0;
                }
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                flag = false;
            }
        } else
        {
label1:
            {
                if (((l) (obj)).a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null)
                {
                    break label1;
                }
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                flag = false;
            }
        }
          goto _L7
        obj1 = d;
        obj1 = android.support.v7.app.z.b();
        ((MediaRouteChooserDialogFragment) (obj1)).a(c);
        ((MediaRouteChooserDialogFragment) (obj1)).a(((l) (obj)), "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
_L8:
        flag = true;
          goto _L7
        z z1 = d;
        z.c().a(((l) (obj)), "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
          goto _L8
    }

    public boolean performLongClick()
    {
        if (super.performLongClick())
        {
            return true;
        }
        if (!h)
        {
            return false;
        }
        Object obj = getContentDescription();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return false;
        }
        int ai[] = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(ai);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int i1 = getWidth();
        int j1 = getHeight();
        int k1 = ai[1];
        int l1 = j1 / 2;
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(context, ((CharSequence) (obj)), 0);
        if (k1 + l1 < rect.height())
        {
            ((Toast) (obj)).setGravity(0x800035, i2 - ai[0] - i1 / 2, j1);
        } else
        {
            ((Toast) (obj)).setGravity(81, 0, j1);
        }
        ((Toast) (obj)).show();
        performHapticFeedback(0);
        return true;
    }

    public void setDialogFactory(z z1)
    {
        if (z1 == null)
        {
            throw new IllegalArgumentException("factory must not be null");
        } else
        {
            d = z1;
            return;
        }
    }

    public void setRouteSelector(s s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!c.equals(s1))
        {
            if (e)
            {
                if (!c.b())
                {
                    a.a(b);
                }
                if (!s1.b())
                {
                    a.a(s1, b);
                }
            }
            c = s1;
            a();
        }
    }

    public void setVisibility(int i1)
    {
        super.setVisibility(i1);
        if (f != null)
        {
            Drawable drawable = f;
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == f;
    }

}
