// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.a.c;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            aj, ai, ah, af, 
//            ag, ae, ac, ad

public class ListPopupWindow
{

    private boolean A;
    int a;
    private Context b;
    private PopupWindow c;
    private ListAdapter d;
    private ae e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private View m;
    private int n;
    private DataSetObserver o;
    private View p;
    private Drawable q;
    private android.widget.AdapterView.OnItemClickListener r;
    private android.widget.AdapterView.OnItemSelectedListener s;
    private final aj t;
    private final ai u;
    private final ah v;
    private final af w;
    private Runnable x;
    private Handler y;
    private Rect z;

    public ListPopupWindow(Context context)
    {
        this(context, null, c.j);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, c.j);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i1)
    {
        f = -2;
        g = -2;
        k = false;
        l = false;
        a = 0x7fffffff;
        n = 0;
        t = new aj(this, (byte)0);
        u = new ai(this, (byte)0);
        v = new ah(this, (byte)0);
        w = new af(this, (byte)0);
        y = new Handler();
        z = new Rect();
        b = context;
        c = new PopupWindow(context, attributeset, i1);
        c.setInputMethodMode(1);
        context = b.getResources().getConfiguration().locale;
    }

    static ae a(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.e;
    }

    static PopupWindow b(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.c;
    }

    static aj c(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.t;
    }

    static Handler d(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.y;
    }

    public final Drawable a()
    {
        return c.getBackground();
    }

    public final void a(int i1)
    {
        n = 0;
    }

    public final void a(Drawable drawable)
    {
        c.setBackgroundDrawable(drawable);
    }

    public final void a(View view)
    {
        p = view;
    }

    public final void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        r = onitemclicklistener;
    }

    public void a(ListAdapter listadapter)
    {
        if (o != null) goto _L2; else goto _L1
_L1:
        o = new ag(this, (byte)0);
_L4:
        d = listadapter;
        if (d != null)
        {
            listadapter.registerDataSetObserver(o);
        }
        if (e != null)
        {
            e.setAdapter(d);
        }
        return;
_L2:
        if (d != null)
        {
            d.unregisterDataSetObserver(o);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        c.setOnDismissListener(ondismisslistener);
    }

    public final void a(boolean flag)
    {
        A = true;
        c.setFocusable(true);
    }

    public final View b()
    {
        return p;
    }

    public final void b(int i1)
    {
        h = i1;
    }

    public void c()
    {
        byte byte0;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        byte0 = -1;
        if (e != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        View view;
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i1;
        boolean flag;
        obj1 = b;
        x = new ac(this);
        int j1;
        int j2;
        if (!A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = new ae(((Context) (obj1)), flag);
        if (q != null)
        {
            e.setSelector(q);
        }
        e.setAdapter(d);
        e.setOnItemClickListener(r);
        e.setFocusable(true);
        e.setFocusableInTouchMode(true);
        e.setOnItemSelectedListener(new ad(this));
        e.setOnScrollListener(v);
        if (s != null)
        {
            e.setOnItemSelectedListener(s);
        }
        obj = e;
        view = m;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_1283;
        }
        obj1 = new LinearLayout(((Context) (obj1)));
        ((LinearLayout) (obj1)).setOrientation(1);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        n;
        JVM INSTR tableswitch 0 1: default 224
    //                   0 688
    //                   1 673;
           goto _L3 _L4 _L5
_L3:
        Log.e("ListPopupWindow", (new StringBuilder("Invalid hint position ")).append(n).toString());
_L10:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(g, 0x80000000), 0);
        obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i1 = view.getMeasuredHeight();
        j1 = ((android.widget.LinearLayout.LayoutParams) (obj)).topMargin;
        i1 = ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin + (i1 + j1);
        obj = obj1;
_L19:
        c.setContentView(((View) (obj)));
_L11:
        obj = c.getBackground();
        int k1;
        int l1;
        int i2;
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(z);
            j1 = z.top + z.bottom;
            l1 = j1;
            if (!j)
            {
                i = -z.top;
                l1 = j1;
            }
        } else
        {
            z.setEmpty();
            l1 = 0;
        }
        if (c.getInputMethodMode() == 2)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        obj = p;
        j2 = i;
        obj1 = new Rect();
        ((View) (obj)).getWindowVisibleDisplayFrame(((Rect) (obj1)));
        view = new int[2];
        ((View) (obj)).getLocationOnScreen(view);
        i2 = ((Rect) (obj1)).bottom;
        if (k1 != 0)
        {
            k1 = ((View) (obj)).getContext().getResources().getDisplayMetrics().heightPixels;
        } else
        {
            k1 = i2;
        }
        k1 = Math.max(k1 - (view[1] + ((View) (obj)).getHeight()) - j2, (view[1] - ((Rect) (obj1)).top) + j2);
        i2 = k1;
        if (c.getBackground() != null)
        {
            c.getBackground().getPadding(z);
            i2 = k1 - (z.top + z.bottom);
        }
        if (!k && f != -1) goto _L7; else goto _L6
_L6:
        i1 = i2 + l1;
_L15:
        flag = g();
        if (!c.isShowing()) goto _L9; else goto _L8
_L8:
        if (g == -1)
        {
            k1 = -1;
        } else
        if (g == -2)
        {
            k1 = p.getWidth();
        } else
        {
            k1 = g;
        }
        if (f == -1)
        {
            if (!flag)
            {
                i1 = -1;
            }
            if (flag)
            {
                obj = c;
                if (g == -1)
                {
                    l1 = byte0;
                } else
                {
                    l1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(l1, 0);
            } else
            {
                obj = c;
                if (g == -1)
                {
                    l1 = -1;
                } else
                {
                    l1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(l1, -1);
            }
        } else
        if (f != -2)
        {
            i1 = f;
        }
        obj = c;
        if (!l && !k)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        c.update(p, h, i, k1, i1);
_L18:
        return;
_L5:
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
        ((LinearLayout) (obj1)).addView(view);
          goto _L10
_L4:
        ((LinearLayout) (obj1)).addView(view);
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
          goto _L10
_L2:
        c.getContentView();
        obj = m;
        if (obj != null)
        {
            obj1 = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            i1 = ((View) (obj)).getMeasuredHeight();
            k1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin;
            i1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin + (i1 + k1);
        } else
        {
            i1 = 0;
        }
          goto _L11
_L7:
        g;
        JVM INSTR tableswitch -2 -1: default 800
    //                   -2 855
    //                   -1 895;
           goto _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_895;
_L12:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(g, 0x40000000);
_L16:
        i2 = e.a(k1, i2 - i1, -1);
        k1 = i1;
        if (i2 > 0)
        {
            k1 = i1 + l1;
        }
        i1 = k1 + i2;
          goto _L15
_L13:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (z.left + z.right), 0x80000000);
          goto _L16
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (z.left + z.right), 0x40000000);
          goto _L16
_L9:
        if (g == -1)
        {
            k1 = -1;
        } else
        if (g == -2)
        {
            c.setWidth(p.getWidth());
            k1 = 0;
        } else
        {
            c.setWidth(g);
            k1 = 0;
        }
        if (f == -1)
        {
            i1 = -1;
        } else
        if (f == -2)
        {
            c.setHeight(i1);
            i1 = 0;
        } else
        {
            c.setHeight(f);
            i1 = 0;
        }
        c.setWindowLayoutMode(k1, i1);
        obj = c;
        if (!l && !k)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        c.setTouchInterceptor(u);
        c.showAsDropDown(p, h, i);
        e.setSelection(-1);
        if (!A || e.isInTouchMode())
        {
            e();
        }
        if (A) goto _L18; else goto _L17
_L17:
        y.post(w);
        return;
        i1 = 0;
          goto _L19
    }

    public final void c(int i1)
    {
        i = i1;
        j = true;
    }

    public final void d()
    {
        c.dismiss();
        if (m != null)
        {
            android.view.ViewParent viewparent = m.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(m);
            }
        }
        c.setContentView(null);
        e = null;
        y.removeCallbacks(t);
    }

    public final void d(int i1)
    {
        Drawable drawable = c.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(z);
            g = z.left + z.right + i1;
            return;
        } else
        {
            g = i1;
            return;
        }
    }

    public final void e()
    {
        ae ae1 = e;
        if (ae1 != null)
        {
            ae.a(ae1, true);
            ae1.requestLayout();
        }
    }

    public final void e(int i1)
    {
        c.setInputMethodMode(2);
    }

    public final void f(int i1)
    {
        ae ae1 = e;
        if (c.isShowing() && ae1 != null)
        {
            ae.a(ae1, false);
            ae1.setSelection(i1);
            if (ae1.getChoiceMode() != 0)
            {
                ae1.setItemChecked(i1, true);
            }
        }
    }

    public final boolean f()
    {
        return c.isShowing();
    }

    public final boolean g()
    {
        return c.getInputMethodMode() == 2;
    }

    public final ListView h()
    {
        return e;
    }
}
