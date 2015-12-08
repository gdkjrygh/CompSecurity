// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.widget.m;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            bq, br, cb, bu, 
//            bs, aj, aw, bx, 
//            af, bg, bv, bt, 
//            u, as, bz, bw, 
//            by

public class ViewPager extends ViewGroup
{

    private static final int a[] = {
        0x10100b3
    };
    private static final cb af = new cb();
    private static final Comparator c = new bq();
    private static final Interpolator d = new br();
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private m Q;
    private m R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private bx W;
    private bx Z;
    private bw aa;
    private by ab;
    private Method ac;
    private int ad;
    private ArrayList ae;
    private final Runnable ag;
    private int ah;
    private int b;
    private final ArrayList e;
    private final bu f;
    private final Rect g;
    private aj h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private bz n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public ViewPager(Context context)
    {
        super(context);
        e = new ArrayList();
        f = new bu();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ag = new bs(this);
        ah = 0;
        f();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new ArrayList();
        f = new bu();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ag = new bs(this);
        ah = 0;
        f();
    }

    private Rect a(Rect rect, View view)
    {
        if (rect == null)
        {
            rect = new Rect();
        }
        if (view == null)
        {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        for (view = view.getParent(); (view instanceof ViewGroup) && view != this; view = view.getParent())
        {
            view = (ViewGroup)view;
            rect.left = rect.left + view.getLeft();
            rect.right = rect.right + view.getRight();
            rect.top = rect.top + view.getTop();
            rect.bottom = rect.bottom + view.getBottom();
        }

        return rect;
    }

    static aj a(ViewPager viewpager)
    {
        return viewpager.h;
    }

    private bu a(int i1, int j1)
    {
        bu bu1 = new bu();
        bu1.b = i1;
        bu1.a = h.a(this, i1);
        aj aj1 = h;
        bu1.d = 1.0F;
        if (j1 < 0 || j1 >= e.size())
        {
            e.add(bu1);
            return bu1;
        } else
        {
            e.add(j1, bu1);
            return bu1;
        }
    }

    private bu a(View view)
    {
        for (int i1 = 0; i1 < e.size(); i1++)
        {
            bu bu1 = (bu)e.get(i1);
            if (h.a(view, bu1.a))
            {
                return bu1;
            }
        }

        return null;
    }

    private void a(int i1)
    {
        if (ah != i1)
        {
            ah = i1;
            if (ab != null)
            {
                boolean flag;
                int j1;
                int k1;
                if (i1 != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k1 = getChildCount();
                j1 = 0;
                while (j1 < k1) 
                {
                    byte byte0;
                    if (flag)
                    {
                        byte0 = 2;
                    } else
                    {
                        byte0 = 0;
                    }
                    aw.a(getChildAt(j1), byte0, null);
                    j1++;
                }
            }
            if (W != null)
            {
                W.b(i1);
                return;
            }
        }
    }

    private void a(int i1, float f1, int j1)
    {
        if (V <= 0) goto _L2; else goto _L1
_L1:
        int k1;
        int k2;
        int l2;
        int i3;
        int j3;
        l2 = getScrollX();
        j1 = getPaddingLeft();
        k1 = getPaddingRight();
        i3 = getWidth();
        j3 = getChildCount();
        k2 = 0;
_L8:
        if (k2 >= j3) goto _L2; else goto _L3
_L3:
        View view;
        LayoutParams layoutparams;
        view = getChildAt(k2);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        layoutparams.b & 7;
        JVM INSTR tableswitch 1 5: default 116
    //                   1 210
    //                   2 116
    //                   3 184
    //                   4 116
    //                   5 239;
           goto _L4 _L5 _L4 _L6 _L4 _L7
_L4:
        int l1;
        l1 = j1;
        int i2 = k1;
        k1 = j1;
        j1 = i2;
_L9:
        int j2;
        int k3 = (l1 + l2) - view.getLeft();
        l1 = j1;
        j2 = k1;
        if (k3 != 0)
        {
            view.offsetLeftAndRight(k3);
            j2 = k1;
            l1 = j1;
        }
_L10:
        k2++;
        j1 = j2;
        k1 = l1;
          goto _L8
_L6:
        l1 = view.getWidth();
        j2 = l1 + j1;
        l1 = j1;
        j1 = k1;
        k1 = j2;
          goto _L9
_L5:
        l1 = Math.max((i3 - view.getMeasuredWidth()) / 2, j1);
        j2 = j1;
        j1 = k1;
        k1 = j2;
          goto _L9
_L7:
        l1 = i3 - k1 - view.getMeasuredWidth();
        int l3 = view.getMeasuredWidth();
        j2 = j1;
        j1 = k1 + l3;
        k1 = j2;
          goto _L9
_L2:
        if (W != null)
        {
            W.a(i1, f1);
        }
        if (Z != null)
        {
            Z.a(i1, f1);
        }
        if (ab != null)
        {
            getScrollX();
            j1 = getChildCount();
            for (i1 = 0; i1 < j1; i1++)
            {
                Object obj = getChildAt(i1);
                if (!((LayoutParams)((View) (obj)).getLayoutParams()).a)
                {
                    ((View) (obj)).getLeft();
                    g();
                    obj = ab;
                }
            }

        }
        U = true;
        return;
        l1 = k1;
        j2 = j1;
          goto _L10
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        if (j1 > 0 && !e.isEmpty())
        {
            int i2 = getPaddingLeft();
            int j2 = getPaddingRight();
            int k2 = getPaddingLeft();
            int l2 = getPaddingRight();
            float f1 = (float)getScrollX() / (float)((j1 - k2 - l2) + l1);
            j1 = (int)((float)((i1 - i2 - j2) + k1) * f1);
            scrollTo(j1, getScrollY());
            if (!m.isFinished())
            {
                k1 = m.getDuration();
                l1 = m.timePassed();
                bu bu1 = c(i);
                m.startScroll(j1, 0, (int)(bu1.e * (float)i1), 0, k1 - l1);
            }
        } else
        {
            bu bu2 = c(i);
            float f2;
            if (bu2 != null)
            {
                f2 = Math.min(bu2.e, t);
            } else
            {
                f2 = 0.0F;
            }
            i1 = (int)(f2 * (float)(i1 - getPaddingLeft() - getPaddingRight()));
            if (i1 != getScrollX())
            {
                a(false);
                scrollTo(i1, getScrollY());
                return;
            }
        }
    }

    private void a(int i1, boolean flag, int j1, boolean flag1)
    {
        bu bu1 = c(i1);
        int k1 = 0;
        if (bu1 != null)
        {
            k1 = (int)((float)g() * Math.max(s, Math.min(bu1.e, t)));
        }
        if (flag)
        {
            if (getChildCount() == 0)
            {
                c(false);
            } else
            {
                int l1 = getScrollX();
                int i2 = getScrollY();
                k1 -= l1;
                int j2 = 0 - i2;
                if (k1 == 0 && j2 == 0)
                {
                    a(false);
                    d();
                    a(0);
                } else
                {
                    c(true);
                    a(2);
                    int k2 = g();
                    int l2 = k2 / 2;
                    float f4 = Math.min(1.0F, (1.0F * (float)Math.abs(k1)) / (float)k2);
                    float f1 = l2;
                    float f3 = l2;
                    f4 = (float)Math.sin((float)((double)(f4 - 0.5F) * 0.4712389167638204D));
                    j1 = Math.abs(j1);
                    if (j1 > 0)
                    {
                        j1 = Math.round(1000F * Math.abs((f3 * f4 + f1) / (float)j1)) * 4;
                    } else
                    {
                        float f2 = k2;
                        aj aj1 = h;
                        j1 = i;
                        j1 = (int)(((float)Math.abs(k1) / (f2 * 1.0F + (float)o) + 1.0F) * 100F);
                    }
                    j1 = Math.min(j1, 600);
                    m.startScroll(l1, i2, k1, j2, j1);
                    aw.b(this);
                }
            }
        } else
        {
            if (flag1 && W != null)
            {
                W.a(i1);
            }
            if (flag1 && Z != null)
            {
                Z.a(i1);
            }
            a(false);
            scrollTo(k1, 0);
            d(k1);
            return;
        }
        if (flag1 && W != null)
        {
            W.a(i1);
        }
        if (flag1 && Z != null)
        {
            Z.a(i1);
        }
    }

    private void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    private void a(int i1, boolean flag, boolean flag1, int j1)
    {
        boolean flag2;
        flag2 = false;
        if (h == null || h.a() <= 0)
        {
            c(false);
            return;
        }
        if (!flag1 && i == i1 && e.size() != 0)
        {
            c(false);
            return;
        }
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        i1 = z;
        if (k1 > i + i1 || k1 < i - i1)
        {
            for (i1 = 0; i1 < e.size(); i1++)
            {
                ((bu)e.get(i1)).c = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        k1 = i1;
        if (i1 >= h.a())
        {
            k1 = h.a() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (i != k1)
        {
            flag1 = true;
        }
        if (S)
        {
            i = k1;
            if (flag1 && W != null)
            {
                W.a(k1);
            }
            if (flag1 && Z != null)
            {
                Z.a(k1);
            }
            requestLayout();
            return;
        } else
        {
            b(k1);
            a(k1, flag, j1, flag1);
            return;
        }
    }

    static void a(ViewPager viewpager, int i1)
    {
        viewpager.a(0);
    }

    private void a(bu bu1, int i1, bu bu2)
    {
        int j2 = h.a();
        int j1 = g();
        float f4;
        if (j1 > 0)
        {
            f4 = (float)o / (float)j1;
        } else
        {
            f4 = 0.0F;
        }
        if (bu2 != null)
        {
            j1 = bu2.b;
            if (j1 < bu1.b)
            {
                float f1 = bu2.e + bu2.d + f4;
                int k1 = 0;
                for (j1++; j1 <= bu1.b && k1 < e.size(); j1++)
                {
                    for (bu2 = (bu)e.get(k1); j1 > bu2.b && k1 < e.size() - 1; bu2 = (bu)e.get(k1))
                    {
                        k1++;
                    }

                    while (j1 < bu2.b) 
                    {
                        aj aj1 = h;
                        j1++;
                        f1 = 1.0F + f4 + f1;
                    }
                    bu2.e = f1;
                    f1 += bu2.d + f4;
                }

            } else
            if (j1 > bu1.b)
            {
                int l1 = e.size();
                float f2 = bu2.e;
                l1--;
                for (j1--; j1 >= bu1.b && l1 >= 0; j1--)
                {
                    for (bu2 = (bu)e.get(l1); j1 < bu2.b && l1 > 0; bu2 = (bu)e.get(l1))
                    {
                        l1--;
                    }

                    while (j1 > bu2.b) 
                    {
                        aj aj2 = h;
                        j1--;
                        f2 -= 1.0F + f4;
                    }
                    f2 -= bu2.d + f4;
                    bu2.e = f2;
                }

            }
        }
        int k2 = e.size();
        float f5 = bu1.e;
        j1 = bu1.b - 1;
        float f3;
        int i2;
        if (bu1.b == 0)
        {
            f3 = bu1.e;
        } else
        {
            f3 = -3.402823E+38F;
        }
        s = f3;
        if (bu1.b == j2 - 1)
        {
            f3 = (bu1.e + bu1.d) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        t = f3;
        i2 = i1 - 1;
        f3 = f5;
        for (; i2 >= 0; i2--)
        {
            for (bu2 = (bu)e.get(i2); j1 > bu2.b;)
            {
                aj aj3 = h;
                j1--;
                f3 -= 1.0F + f4;
            }

            f3 -= bu2.d + f4;
            bu2.e = f3;
            if (bu2.b == 0)
            {
                s = f3;
            }
            j1--;
        }

        f3 = bu1.e + bu1.d + f4;
        i2 = bu1.b + 1;
        j1 = i1 + 1;
        i1 = i2;
        for (; j1 < k2; j1++)
        {
            for (bu1 = (bu)e.get(j1); i1 < bu1.b;)
            {
                bu2 = h;
                i1++;
                f3 += 1.0F + f4;
            }

            if (bu1.b == j2 - 1)
            {
                t = (bu1.d + f3) - 1.0F;
            }
            bu1.e = f3;
            f3 += bu1.d + f4;
            i1++;
        }

        T = false;
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.af.b(motionevent);
        if (android.support.v4.view.af.b(motionevent, i1) == J)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            F = android.support.v4.view.af.c(motionevent, i1);
            J = android.support.v4.view.af.b(motionevent, i1);
            if (K != null)
            {
                K.clear();
            }
        }
    }

    private void a(boolean flag)
    {
label0:
        {
            int i1;
            boolean flag1;
            boolean flag2;
            if (ah == 2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                c(false);
                m.abortAnimation();
                int j1 = getScrollX();
                int k1 = getScrollY();
                int l1 = m.getCurrX();
                int i2 = m.getCurrY();
                if (j1 != l1 || k1 != i2)
                {
                    scrollTo(l1, i2);
                }
            }
            y = false;
            flag2 = false;
            flag1 = i1;
            for (i1 = ((flag2) ? 1 : 0); i1 < e.size(); i1++)
            {
                bu bu1 = (bu)e.get(i1);
                if (bu1.c)
                {
                    bu1.c = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                aw.a(this, ag);
            }
            return;
        }
        ag.run();
    }

    private boolean a(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = F;
        F = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int i1 = g();
        f1 = (float)i1 * s;
        f2 = i1;
        float f4 = t;
        bu bu1 = (bu)e.get(0);
        bu bu2 = (bu)e.get(e.size() - 1);
        boolean flag;
        if (bu1.b != 0)
        {
            f1 = bu1.e * (float)i1;
            flag = false;
        } else
        {
            flag = true;
        }
        if (bu2.b != h.a() - 1)
        {
            f2 = bu2.e * (float)i1;
            flag1 = false;
        } else
        {
            f2 *= f4;
        }
        if (f3 >= f1) goto _L2; else goto _L1
_L1:
        f2 = f1;
        if (flag)
        {
            flag2 = Q.a(Math.abs(f1 - f3) / (float)i1);
            f2 = f1;
        }
_L4:
        F = F + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        d((int)f2);
        return flag2;
_L2:
        if (f3 > f2)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = R.a(Math.abs(f3 - f2) / (float)i1);
            }
        } else
        {
            f2 = f3;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(View view, boolean flag, int i1, int j1, int k1)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int l1;
        int i2;
        int j2;
        viewgroup = (ViewGroup)view;
        i2 = view.getScrollX();
        j2 = view.getScrollY();
        l1 = viewgroup.getChildCount() - 1;
_L8:
        if (l1 < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(l1);
        if (j1 + i2 < view1.getLeft() || j1 + i2 >= view1.getRight() || k1 + j2 < view1.getTop() || k1 + j2 >= view1.getBottom() || !a(view1, true, i1, (j1 + i2) - view1.getLeft(), (k1 + j2) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        l1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag && aw.a(view, -i1)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static int b(ViewPager viewpager)
    {
        return viewpager.i;
    }

    private bu b(View view)
    {
        do
        {
            ViewParent viewparent = view.getParent();
            if (viewparent != this)
            {
                if (viewparent == null || !(viewparent instanceof View))
                {
                    return null;
                }
                view = (View)viewparent;
            } else
            {
                return a(view);
            }
        } while (true);
    }

    private void b(int i1)
    {
        float f1;
        float f5;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j1;
        byte byte1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        if (i != i1)
        {
            byte byte0;
            if (i < i1)
            {
                byte0 = 66;
            } else
            {
                byte0 = 17;
            }
            obj1 = c(i);
            i = i1;
            byte1 = byte0;
        } else
        {
            obj1 = null;
            byte1 = 2;
        }
        if (h != null) goto _L2; else goto _L1
_L1:
        h();
_L4:
        return;
_L2:
        if (y)
        {
            h();
            return;
        }
        if (getWindowToken() == null) goto _L4; else goto _L3
_L3:
        aj aj1 = h;
        i1 = z;
        j3 = Math.max(0, i - i1);
        l2 = h.a();
        i3 = Math.min(l2 - 1, i1 + i);
        if (l2 != b)
        {
            String s1;
            try
            {
                s1 = getResources().getResourceName(getId());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = Integer.toHexString(getId());
            }
            throw new IllegalStateException((new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ")).append(b).append(", found: ").append(l2).append(" Pager id: ").append(s1).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(h.getClass()).toString());
        }
        i1 = 0;
_L14:
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_1251;
        }
        obj = (bu)e.get(i1);
        if (((bu) (obj)).b < i) goto _L6; else goto _L5
_L5:
        if (((bu) (obj)).b != i)
        {
            break MISSING_BLOCK_LABEL_1251;
        }
_L21:
        if (obj == null && l2 > 0)
        {
            obj2 = a(i, i1);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        k2 = i1 - 1;
        float f3;
        if (k2 >= 0)
        {
            obj = (bu)e.get(k2);
        } else
        {
            obj = null;
        }
        k3 = g();
        if (k3 <= 0)
        {
            f3 = 0.0F;
        } else
        {
            f3 = (2.0F - ((bu) (obj2)).d) + (float)getPaddingLeft() / (float)k3;
        }
        j1 = i;
        f5 = 0.0F;
        j2 = j1 - 1;
        i2 = i1;
        obj3 = obj;
        if (j2 < 0) goto _L10; else goto _L9
_L9:
        if (f5 < f3 || j2 >= j3) goto _L12; else goto _L11
_L11:
        if (obj3 == null) goto _L10; else goto _L13
_L13:
        obj = obj3;
        i1 = k2;
        f1 = f5;
        j1 = i2;
        if (j2 == ((bu) (obj3)).b)
        {
            obj = obj3;
            i1 = k2;
            f1 = f5;
            j1 = i2;
            if (!((bu) (obj3)).c)
            {
                e.remove(k2);
                h.a(this, j2, ((bu) (obj3)).a);
                i1 = k2 - 1;
                j1 = i2 - 1;
                if (i1 >= 0)
                {
                    obj = (bu)e.get(i1);
                    f1 = f5;
                } else
                {
                    obj = null;
                    f1 = f5;
                }
            }
        }
_L15:
        j2--;
        obj3 = obj;
        k2 = i1;
        f5 = f1;
        i2 = j1;
        break MISSING_BLOCK_LABEL_374;
_L6:
        i1++;
          goto _L14
_L12:
        if (obj3 != null && j2 == ((bu) (obj3)).b)
        {
            f1 = f5 + ((bu) (obj3)).d;
            i1 = k2 - 1;
            if (i1 >= 0)
            {
                obj = (bu)e.get(i1);
                j1 = i2;
            } else
            {
                obj = null;
                j1 = i2;
            }
        } else
        {
            f1 = f5 + a(j2, k2 + 1).d;
            j1 = i2 + 1;
            if (k2 >= 0)
            {
                obj = (bu)e.get(k2);
                i1 = k2;
            } else
            {
                obj = null;
                i1 = k2;
            }
        }
          goto _L15
_L10:
label0:
        {
            float f2 = ((bu) (obj2)).d;
            i1 = i2 + 1;
            if (f2 >= 2.0F)
            {
                break label0;
            }
            float f4;
            int k1;
            if (i1 < e.size())
            {
                obj = (bu)e.get(i1);
            } else
            {
                obj = null;
            }
            if (k3 <= 0)
            {
                f4 = 0.0F;
            } else
            {
                f4 = (float)getPaddingRight() / (float)k3 + 2.0F;
            }
            k1 = i;
            k1++;
            do
            {
                if (k1 >= l2)
                {
                    break label0;
                }
                if (f2 >= f4 && k1 > i3)
                {
                    if (obj == null)
                    {
                        break label0;
                    }
                    if (k1 == ((bu) (obj)).b && !((bu) (obj)).c)
                    {
                        e.remove(i1);
                        h.a(this, k1, ((bu) (obj)).a);
                        if (i1 < e.size())
                        {
                            obj = (bu)e.get(i1);
                        } else
                        {
                            obj = null;
                        }
                    }
                } else
                if (obj != null && k1 == ((bu) (obj)).b)
                {
                    float f6 = ((bu) (obj)).d;
                    i1++;
                    if (i1 < e.size())
                    {
                        obj = (bu)e.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f6;
                } else
                {
                    obj = a(k1, i1);
                    i1++;
                    float f7 = ((bu) (obj)).d;
                    if (i1 < e.size())
                    {
                        obj = (bu)e.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f7;
                }
                k1++;
            } while (true);
        }
        a(((bu) (obj2)), i2, ((bu) (obj1)));
_L8:
        obj = h;
        i1 = i;
        if (obj2 != null)
        {
            obj = ((bu) (obj2)).a;
        }
        obj = h;
        int l1 = getChildCount();
        for (i1 = 0; i1 < l1; i1++)
        {
            obj1 = getChildAt(i1);
            obj = (LayoutParams)((View) (obj1)).getLayoutParams();
            obj.f = i1;
            if (((LayoutParams) (obj)).a || ((LayoutParams) (obj)).c != 0.0F)
            {
                continue;
            }
            obj1 = a(((View) (obj1)));
            if (obj1 != null)
            {
                obj.c = ((bu) (obj1)).d;
                obj.e = ((bu) (obj1)).b;
            }
        }

        h();
        if (!hasFocus()) goto _L4; else goto _L16
_L16:
        obj = findFocus();
        if (obj != null)
        {
            obj = b(((View) (obj)));
        } else
        {
            obj = null;
        }
        if (obj != null && ((bu) (obj)).b == i) goto _L4; else goto _L17
_L17:
        i1 = 0;
_L20:
        if (i1 >= getChildCount()) goto _L4; else goto _L18
_L18:
        obj = getChildAt(i1);
        obj1 = a(((View) (obj)));
        if (obj1 != null && ((bu) (obj1)).b == i && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L19
_L19:
        i1++;
          goto _L20
        obj = null;
          goto _L21
    }

    private void b(boolean flag)
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private bu c(int i1)
    {
        for (int j1 = 0; j1 < e.size(); j1++)
        {
            bu bu1 = (bu)e.get(j1);
            if (bu1.b == i1)
            {
                return bu1;
            }
        }

        return null;
    }

    private void c(boolean flag)
    {
        if (x != flag)
        {
            x = flag;
        }
    }

    private boolean d(int i1)
    {
        boolean flag = false;
        if (e.size() == 0)
        {
            U = false;
            a(0, 0.0F, 0);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            bu bu1 = i();
            int k1 = g();
            int l1 = o;
            float f1 = (float)o / (float)k1;
            int j1 = bu1.b;
            f1 = ((float)i1 / (float)k1 - bu1.e) / (bu1.d + f1);
            i1 = (int)((float)(l1 + k1) * f1);
            U = false;
            a(j1, f1, i1);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    private boolean e(int i1)
    {
        View view = findFocus();
        if (view != this) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L13:
        view = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), i1);
        if (view == null || view == obj) goto _L4; else goto _L3
_L3:
        if (i1 != 17) goto _L6; else goto _L5
_L5:
        int j1;
        boolean flag;
        j1 = a(g, view).left;
        int k1 = a(g, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && j1 >= k1)
        {
            flag = k();
        } else
        {
            flag = view.requestFocus();
        }
_L16:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        }
        return flag;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        obj = view.getParent();
_L12:
        if (!(obj instanceof ViewGroup))
        {
            break MISSING_BLOCK_LABEL_356;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        j1 = 1;
_L18:
        if (j1 != 0) goto _L8; else goto _L11
_L10:
        obj = ((ViewParent) (obj)).getParent();
          goto _L12
_L11:
        stringbuilder = new StringBuilder();
        stringbuilder.append(view.getClass().getSimpleName());
        for (obj = view.getParent(); obj instanceof ViewGroup; obj = ((ViewParent) (obj)).getParent())
        {
            stringbuilder.append(" => ").append(obj.getClass().getSimpleName());
        }

        Log.e("ViewPager", (new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ")).append(stringbuilder.toString()).toString());
        obj = null;
          goto _L13
_L6:
        if (i1 != 66) goto _L15; else goto _L14
_L14:
        j1 = a(g, view).left;
        int l1 = a(g, ((View) (obj))).left;
        if (obj != null && j1 <= l1)
        {
            flag = l();
        } else
        {
            flag = view.requestFocus();
        }
          goto _L16
_L4:
label0:
        {
            if (i1 != 17 && i1 != 1)
            {
                break label0;
            }
            flag = k();
        }
          goto _L16
        if (i1 != 66 && i1 != 2) goto _L15; else goto _L17
_L17:
        flag = l();
          goto _L16
_L15:
        flag = false;
          goto _L16
_L8:
        obj = view;
          goto _L13
        j1 = 0;
          goto _L18
    }

    static int[] e()
    {
        return a;
    }

    private void f()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        m = new Scroller(context, d);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        E = bg.a(viewconfiguration);
        L = (int)(400F * f1);
        M = viewconfiguration.getScaledMaximumFlingVelocity();
        Q = new m(context);
        R = new m(context);
        N = (int)(25F * f1);
        O = (int)(2.0F * f1);
        C = (int)(16F * f1);
        aw.a(this, new bv(this));
        if (aw.c(this) == 0)
        {
            aw.b(this, 1);
        }
    }

    private int g()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private void h()
    {
        if (ad != 0)
        {
            int j1;
            if (ae == null)
            {
                ae = new ArrayList();
            } else
            {
                ae.clear();
            }
            j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                ae.add(view);
            }

            Collections.sort(ae, af);
        }
    }

    private bu i()
    {
        int i1 = g();
        float f1;
        float f2;
        float f3;
        float f4;
        bu bu2;
        boolean flag;
        int j1;
        if (i1 > 0)
        {
            f1 = (float)getScrollX() / (float)i1;
        } else
        {
            f1 = 0.0F;
        }
        if (i1 > 0)
        {
            f2 = (float)o / (float)i1;
        } else
        {
            f2 = 0.0F;
        }
        f4 = 0.0F;
        f3 = 0.0F;
        j1 = -1;
        i1 = 0;
        flag = true;
        bu2 = null;
        do
        {
            bu bu1;
label0:
            {
                Object obj;
label1:
                {
                    obj = bu2;
                    if (i1 >= e.size())
                    {
                        break label1;
                    }
                    bu1 = (bu)e.get(i1);
                    if (!flag && bu1.b != j1 + 1)
                    {
                        bu1 = f;
                        bu1.e = f4 + f3 + f2;
                        bu1.b = j1 + 1;
                        obj = h;
                        j1 = bu1.b;
                        bu1.d = 1.0F;
                        i1--;
                    }
                    f3 = bu1.e;
                    f4 = bu1.d;
                    if (!flag)
                    {
                        obj = bu2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && i1 != e.size() - 1)
                    {
                        break label0;
                    }
                    obj = bu1;
                }
                return ((bu) (obj));
            }
            j1 = bu1.b;
            f4 = bu1.d;
            flag = false;
            i1++;
            bu2 = bu1;
        } while (true);
    }

    private void j()
    {
        A = false;
        B = false;
        if (K != null)
        {
            K.recycle();
            K = null;
        }
    }

    private boolean k()
    {
        if (i > 0)
        {
            setCurrentItem(i - 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean l()
    {
        if (h != null && i < h.a() - 1)
        {
            setCurrentItem(i + 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    public final aj a()
    {
        return h;
    }

    final bx a(bx bx1)
    {
        bx bx2 = Z;
        Z = bx1;
        return bx2;
    }

    final void a(bw bw1)
    {
        aa = bw1;
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        int l1 = arraylist.size();
        int i2 = getDescendantFocusability();
        if (i2 != 0x60000)
        {
            for (int k1 = 0; k1 < getChildCount(); k1++)
            {
                View view = getChildAt(k1);
                if (view.getVisibility() == 0)
                {
                    bu bu1 = a(view);
                    if (bu1 != null && bu1.b == i)
                    {
                        view.addFocusables(arraylist, i1, j1);
                    }
                }
            }

        }
        while (i2 == 0x40000 && l1 != arraylist.size() || !isFocusable() || (j1 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode() || arraylist == null) 
        {
            return;
        }
        arraylist.add(this);
    }

    public void addTouchables(ArrayList arraylist)
    {
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            bu bu1 = a(view);
            if (bu1 != null && bu1.b == i)
            {
                view.addTouchables(arraylist);
            }
        }

    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams = generateLayoutParams(layoutparams);
        }
        LayoutParams layoutparams1 = (LayoutParams)layoutparams;
        layoutparams1.a = layoutparams1.a | (view instanceof bt);
        if (w)
        {
            if (layoutparams1 != null && layoutparams1.a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                layoutparams1.d = true;
                addViewInLayout(view, i1, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    public final int b()
    {
        return i;
    }

    final void c()
    {
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2 = h.a();
        b = l2;
        aj aj1;
        int j2;
        if (e.size() < z * 2 + 1 && e.size() < l2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = i;
        k1 = 0;
        i2 = 0;
        l1 = i1;
        i1 = j1;
        j1 = k1;
        k1 = i2;
        if (k1 >= e.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (bu)e.get(k1);
        i2 = h.a(((bu) (obj)).a);
        if (i2 == -1)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        if (i2 == -2)
        {
            e.remove(k1);
            l1 = k1 - 1;
            k1 = j1;
            if (j1 == 0)
            {
                aj1 = h;
                k1 = 1;
            }
            h.a(this, ((bu) (obj)).b, ((bu) (obj)).a);
            int k2;
            if (i == ((bu) (obj)).b)
            {
                j1 = Math.max(0, Math.min(i, l2 - 1));
                i1 = k1;
                k1 = 1;
            } else
            {
                j1 = i1;
                boolean flag = true;
                i1 = k1;
                k1 = ((flag) ? 1 : 0);
            }
        } else
        {
            if (((bu) (obj)).b == i2)
            {
                break MISSING_BLOCK_LABEL_379;
            }
            if (((bu) (obj)).b == i)
            {
                i1 = i2;
            }
            obj.b = i2;
            i2 = i1;
            k2 = 1;
            l1 = k1;
            i1 = j1;
            j1 = i2;
            k1 = k2;
        }
        i2 = k1;
        j2 = j1;
        k1 = l1 + 1;
        j1 = i1;
        i1 = j2;
        l1 = i2;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_73;
_L1:
        if (j1 != 0)
        {
            obj = h;
        }
        Collections.sort(e, c);
        if (l1 != 0)
        {
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                obj = (LayoutParams)getChildAt(j1).getLayoutParams();
                if (!((LayoutParams) (obj)).a)
                {
                    obj.c = 0.0F;
                }
            }

            a(i1, false, true);
            requestLayout();
        }
        return;
        i2 = i1;
        k2 = l1;
        l1 = k1;
        i1 = j1;
        j1 = i2;
        k1 = k2;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_207;
        }
    }

    public boolean canScrollHorizontally(int i1)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1;
        int k1;
        j1 = g();
        k1 = getScrollX();
        if (i1 >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 <= (int)((float)j1 * s)) goto _L1; else goto _L3
_L3:
        return true;
        if (i1 <= 0 || k1 >= (int)((float)j1 * t)) goto _L1; else goto _L4
_L4:
        return true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        if (!m.isFinished() && m.computeScrollOffset())
        {
            int i1 = getScrollX();
            int j1 = getScrollY();
            int k1 = m.getCurrX();
            int l1 = m.getCurrY();
            if (i1 != k1 || j1 != l1)
            {
                scrollTo(k1, l1);
                if (!d(k1))
                {
                    m.abortAnimation();
                    scrollTo(0, l1);
                }
            }
            aw.b(this);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    final void d()
    {
        b(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag1 = false;
        if (super.dispatchKeyEvent(keyevent)) goto _L2; else goto _L1
_L1:
        if (keyevent.getAction() != 0) goto _L4; else goto _L3
_L3:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 56
    //                   21: 66
    //                   22: 76
    //                   61: 86;
           goto _L4 _L5 _L6 _L7
_L4:
        boolean flag = false;
_L9:
        if (!flag) goto _L8; else goto _L2
_L2:
        flag1 = true;
_L8:
        return flag1;
_L5:
        flag = e(17);
          goto _L9
_L6:
        flag = e(66);
          goto _L9
_L7:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L10
_L10:
        if (!android.support.v4.view.u.a(keyevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = e(2);
          goto _L9
        if (!android.support.v4.view.u.a(keyevent, 1)) goto _L4; else goto _L11
_L11:
        flag = e(1);
          goto _L9
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        if (accessibilityevent.getEventType() != 4096) goto _L2; else goto _L1
_L1:
        boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
_L4:
        return flag;
_L2:
        int j1 = getChildCount();
        int i1 = 0;
        do
        {
            flag = flag1;
            if (i1 >= j1)
            {
                continue;
            }
            View view = getChildAt(i1);
            if (view.getVisibility() == 0)
            {
                bu bu1 = a(view);
                if (bu1 != null && bu1.b == i && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
                {
                    return true;
                }
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int j1 = 0;
        int i1 = 0;
        int k1 = aw.a(this);
        if (k1 == 0 || k1 == 1 && h != null && h.a() > 1)
        {
            if (!Q.a())
            {
                j1 = canvas.save();
                i1 = getHeight() - getPaddingTop() - getPaddingBottom();
                int l1 = getWidth();
                canvas.rotate(270F);
                canvas.translate(-i1 + getPaddingTop(), s * (float)l1);
                Q.a(i1, l1);
                i1 = Q.a(canvas) | false;
                canvas.restoreToCount(j1);
            }
            j1 = i1;
            if (!R.a())
            {
                int i2 = canvas.save();
                j1 = getWidth();
                int j2 = getHeight();
                int k2 = getPaddingTop();
                int l2 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(t + 1.0F) * (float)j1);
                R.a(j2 - k2 - l2, j1);
                j1 = i1 | R.a(canvas);
                canvas.restoreToCount(i2);
            }
        } else
        {
            Q.b();
            R.b();
        }
        if (j1 != 0)
        {
            aw.b(this);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = p;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        int k1 = j1;
        if (ad == 2)
        {
            k1 = i1 - 1 - j1;
        }
        return ((LayoutParams)((View)ae.get(k1)).getLayoutParams()).f;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        S = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(ag);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (o > 0 && p != null && e.size() > 0 && h != null)
        {
            int k1 = getScrollX();
            int l1 = getWidth();
            float f3 = (float)o / (float)l1;
            Object obj = (bu)e.get(0);
            float f1 = ((bu) (obj)).e;
            int i2 = e.size();
            int i1 = ((bu) (obj)).b;
            int j2 = ((bu)e.get(i2 - 1)).b;
            int j1 = 0;
            do
            {
                if (i1 >= j2)
                {
                    break;
                }
                for (; i1 > ((bu) (obj)).b && j1 < i2; obj = (bu)((ArrayList) (obj)).get(j1))
                {
                    obj = e;
                    j1++;
                }

                float f2;
                if (i1 == ((bu) (obj)).b)
                {
                    f2 = (((bu) (obj)).e + ((bu) (obj)).d) * (float)l1;
                    f1 = ((bu) (obj)).e + ((bu) (obj)).d + f3;
                } else
                {
                    aj aj1 = h;
                    f2 = (1.0F + f1) * (float)l1;
                    f1 += 1.0F + f3;
                }
                if ((float)o + f2 > (float)k1)
                {
                    p.setBounds((int)f2, q, (int)((float)o + f2 + 0.5F), r);
                    p.draw(canvas);
                }
                if (f2 > (float)(k1 + l1))
                {
                    break;
                }
                i1++;
            } while (true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction() & 0xff;
        if (i1 != 3 && i1 != 1) goto _L2; else goto _L1
_L1:
        A = false;
        B = false;
        J = -1;
        if (K != null)
        {
            K.recycle();
            K = null;
        }
_L4:
        return false;
_L2:
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (A)
        {
            return true;
        }
        if (B) goto _L4; else goto _L3
_L3:
        i1;
        JVM INSTR lookupswitch 3: default 116
    //                   0: 428
    //                   2: 143
    //                   6: 560;
           goto _L5 _L6 _L7 _L8
_L5:
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        return A;
_L7:
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        int j1 = J;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = android.support.v4.view.af.a(motionevent, j1);
        f3 = android.support.v4.view.af.c(motionevent, j1);
        f1 = f3 - F;
        f5 = Math.abs(f1);
        f4 = android.support.v4.view.af.d(motionevent, j1);
        f6 = Math.abs(f4 - I);
        if (f1 != 0.0F)
        {
            float f7 = F;
            boolean flag;
            if (f7 < (float)D && f1 > 0.0F || f7 > (float)(getWidth() - D) && f1 < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && a(this, false, (int)f1, (int)f3, (int)f4))
            {
                F = f3;
                G = f4;
                B = true;
                return false;
            }
        }
        if (f5 <= (float)E || 0.5F * f5 <= f6) goto _L10; else goto _L9
_L9:
        A = true;
        b(true);
        a(1);
        if (f1 > 0.0F)
        {
            f1 = H + (float)E;
        } else
        {
            f1 = H - (float)E;
        }
        F = f1;
        G = f4;
        c(true);
_L11:
        if (A && a(f3))
        {
            aw.b(this);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (f6 > (float)E)
        {
            B = true;
        }
        if (true) goto _L11; else goto _L6
_L6:
        float f2 = motionevent.getX();
        H = f2;
        F = f2;
        f2 = motionevent.getY();
        I = f2;
        G = f2;
        J = android.support.v4.view.af.b(motionevent, 0);
        B = false;
        m.computeScrollOffset();
        if (ah == 2 && Math.abs(m.getFinalX() - m.getCurrX()) > O)
        {
            m.abortAnimation();
            y = false;
            d();
            A = true;
            b(true);
            a(1);
        } else
        {
            a(false);
            A = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        if (true) goto _L5; else goto _L12
_L12:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        int j3;
        int l4;
        int i5;
        int j5;
        int k5;
        l4 = getChildCount();
        j5 = k1 - i1;
        i5 = l1 - j1;
        j1 = getPaddingLeft();
        i1 = getPaddingTop();
        i2 = getPaddingRight();
        k1 = getPaddingBottom();
        k5 = getScrollX();
        j2 = 0;
        j3 = 0;
_L14:
        if (j3 >= l4) goto _L2; else goto _L1
_L1:
        View view = getChildAt(j3);
        if (view.getVisibility() == 8) goto _L4; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a) goto _L4; else goto _L5
_L5:
        int l5;
        l1 = layoutparams.b;
        l5 = layoutparams.b;
        l1 & 7;
        JVM INSTR tableswitch 1 5: default 148
    //                   1 304
    //                   2 148
    //                   3 285
    //                   4 148
    //                   5 326;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        int k2;
        l1 = j1;
        k2 = j1;
_L15:
        l5 & 0x70;
        JVM INSTR lookupswitch 3: default 192
    //                   16: 394
    //                   48: 367
    //                   80: 422;
           goto _L10 _L11 _L12 _L13
_L10:
        int k3 = i1;
        j1 = i1;
        i1 = k1;
        k1 = k3;
_L16:
        l1 += k5;
        view.layout(l1, k1, view.getMeasuredWidth() + l1, view.getMeasuredHeight() + k1);
        j2++;
        l1 = i2;
        k1 = k2;
        i2 = i1;
        i1 = j2;
_L17:
        j3++;
        k2 = k1;
        j2 = i1;
        i1 = j1;
        k1 = i2;
        i2 = l1;
        j1 = k2;
          goto _L14
_L8:
        k2 = view.getMeasuredWidth();
        l1 = j1;
        k2 += j1;
          goto _L15
_L7:
        l1 = Math.max((j5 - view.getMeasuredWidth()) / 2, j1);
        k2 = j1;
          goto _L15
_L9:
        k2 = view.getMeasuredWidth();
        l1 = i2 + view.getMeasuredWidth();
        int l3 = j5 - i2 - k2;
        i2 = l1;
        k2 = j1;
        l1 = l3;
          goto _L15
_L12:
        int i4 = view.getMeasuredHeight();
        j1 = k1;
        i4 += i1;
        k1 = i1;
        i1 = j1;
        j1 = i4;
          goto _L16
_L11:
        int j4 = Math.max((i5 - view.getMeasuredHeight()) / 2, i1);
        j1 = i1;
        i1 = k1;
        k1 = j4;
          goto _L16
_L13:
        int k4 = i5 - k1 - view.getMeasuredHeight();
        int i6 = view.getMeasuredHeight();
        j1 = i1;
        i1 = k1 + i6;
        k1 = k4;
          goto _L16
_L2:
        i2 = j5 - j1 - i2;
        for (l1 = 0; l1 < l4; l1++)
        {
            View view1 = getChildAt(l1);
            if (view1.getVisibility() == 8)
            {
                continue;
            }
            LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
            if (layoutparams1.a)
            {
                continue;
            }
            bu bu1 = a(view1);
            if (bu1 == null)
            {
                continue;
            }
            float f1 = i2;
            int l2 = (int)(bu1.e * f1) + j1;
            if (layoutparams1.d)
            {
                layoutparams1.d = false;
                float f2 = i2;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams1.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i5 - i1 - k1, 0x40000000));
            }
            view1.layout(l2, i1, view1.getMeasuredWidth() + l2, view1.getMeasuredHeight() + i1);
        }

        q = i1;
        r = i5 - k1;
        V = j2;
        if (S)
        {
            a(i, false, 0, false);
        }
        S = false;
        return;
_L4:
        l1 = j2;
        j2 = i1;
        int i3 = j1;
        i1 = l1;
        l1 = i2;
        i2 = k1;
        j1 = j2;
        k1 = i3;
          goto _L17
    }

    protected void onMeasure(int i1, int j1)
    {
label0:
        {
            setMeasuredDimension(getDefaultSize(0, i1), getDefaultSize(0, j1));
            i1 = getMeasuredWidth();
            D = Math.min(i1 / 10, C);
            i1 = i1 - getPaddingLeft() - getPaddingRight();
            j1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
            int j3 = getChildCount();
            int i2 = 0;
            while (i2 < j3) 
            {
label1:
                {
                    {
                        View view = getChildAt(i2);
                        int k1 = i1;
                        int l1 = j1;
                        if (view.getVisibility() == 8)
                        {
                            break label1;
                        }
                        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                        k1 = i1;
                        l1 = j1;
                        if (layoutparams == null)
                        {
                            break label1;
                        }
                        k1 = i1;
                        l1 = j1;
                        if (!layoutparams.a)
                        {
                            break label1;
                        }
                        k1 = layoutparams.b & 7;
                        int j2 = layoutparams.b & 0x70;
                        int k2 = 0x80000000;
                        l1 = 0x80000000;
                        boolean flag;
                        boolean flag1;
                        if (j2 == 48 || j2 == 80)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (k1 == 3 || k1 == 5)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag)
                        {
                            k1 = 0x40000000;
                        } else
                        {
                            k1 = k2;
                            if (flag1)
                            {
                                l1 = 0x40000000;
                                k1 = k2;
                            }
                        }
                        if (layoutparams.width != -2)
                        {
                            k2 = 0x40000000;
                            float f1;
                            int l2;
                            int i3;
                            if (layoutparams.width != -1)
                            {
                                k1 = layoutparams.width;
                            } else
                            {
                                k1 = i1;
                            }
                        } else
                        {
                            k2 = k1;
                            k1 = i1;
                        }
                        if (layoutparams.height == -2)
                        {
                            break label0;
                        }
                        l2 = 0x40000000;
                        l1 = l2;
                        if (layoutparams.height == -1)
                        {
                            break label0;
                        }
                        i3 = layoutparams.height;
                        l1 = l2;
                        l2 = i3;
                    }
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, k2), android.view.View.MeasureSpec.makeMeasureSpec(l2, l1));
                    if (flag)
                    {
                        l1 = j1 - view.getMeasuredHeight();
                        k1 = i1;
                    } else
                    {
                        k1 = i1;
                        l1 = j1;
                        if (flag1)
                        {
                            k1 = i1 - view.getMeasuredWidth();
                            l1 = j1;
                        }
                    }
                }
                i2++;
                i1 = k1;
                j1 = l1;
            }
            u = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            v = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
            w = true;
            d();
            w = false;
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                view = getChildAt(j1);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams == null || !layoutparams.a)
                {
                    f1 = i1;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams.c * f1), 0x40000000), v);
                }
            }

            return;
        }
        l2 = j1;
        break MISSING_BLOCK_LABEL_282;
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        byte byte0 = -1;
        int k1 = getChildCount();
        int j1;
        if ((i1 & 2) != 0)
        {
            byte0 = 1;
            j1 = 0;
        } else
        {
            j1 = k1 - 1;
            k1 = -1;
        }
        for (; j1 != k1; j1 += byte0)
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            bu bu1 = a(view);
            if (bu1 != null && bu1.b == i && view.requestFocus(i1, rect))
            {
                return true;
            }
        }

        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (h != null)
        {
            Object obj = h;
            obj = ((SavedState) (parcelable)).adapterState;
            obj = ((SavedState) (parcelable)).loader;
            a(((SavedState) (parcelable)).position, false, true);
            return;
        } else
        {
            j = ((SavedState) (parcelable)).position;
            k = ((SavedState) (parcelable)).adapterState;
            l = ((SavedState) (parcelable)).loader;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.position = i;
        if (h != null)
        {
            aj aj1 = h;
            savedstate.adapterState = null;
        }
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            a(i1, k1, o, o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        j1 = 0;
        if (P)
        {
            return true;
        }
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (h == null || h.a() == 0)
        {
            return false;
        }
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        i1 = j1;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 139
    //                   1 392
    //                   2 201
    //                   3 676
    //                   4 128
    //                   5 727
    //                   6 760;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        i1 = j1;
_L10:
        if (i1 != 0)
        {
            aw.b(this);
        }
        return true;
_L2:
        m.abortAnimation();
        y = false;
        d();
        float f1 = motionevent.getX();
        H = f1;
        F = f1;
        f1 = motionevent.getY();
        I = f1;
        G = f1;
        J = android.support.v4.view.af.b(motionevent, 0);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!A)
        {
            i1 = android.support.v4.view.af.a(motionevent, J);
            float f2 = android.support.v4.view.af.c(motionevent, i1);
            float f6 = Math.abs(f2 - F);
            float f4 = android.support.v4.view.af.d(motionevent, i1);
            float f7 = Math.abs(f4 - G);
            if (f6 > (float)E && f6 > f7)
            {
                A = true;
                b(true);
                ViewParent viewparent;
                if (f2 - H > 0.0F)
                {
                    f2 = H + (float)E;
                } else
                {
                    f2 = H - (float)E;
                }
                F = f2;
                G = f4;
                a(1);
                c(true);
                viewparent = getParent();
                if (viewparent != null)
                {
                    viewparent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        i1 = j1;
        if (A)
        {
            i1 = a(android.support.v4.view.af.c(motionevent, android.support.v4.view.af.a(motionevent, J))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = j1;
        if (A)
        {
            Object obj = K;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, M);
            int k1 = (int)android.support.v4.view.as.a(((VelocityTracker) (obj)), J);
            y = true;
            j1 = g();
            int l1 = getScrollX();
            obj = i();
            i1 = ((bu) (obj)).b;
            float f5 = ((float)l1 / (float)j1 - ((bu) (obj)).e) / ((bu) (obj)).d;
            if (Math.abs((int)(android.support.v4.view.af.c(motionevent, android.support.v4.view.af.a(motionevent, J)) - H)) > N && Math.abs(k1) > L)
            {
                if (k1 <= 0)
                {
                    i1++;
                }
            } else
            {
                float f3;
                if (i1 >= i)
                {
                    f3 = 0.4F;
                } else
                {
                    f3 = 0.6F;
                }
                i1 = (int)((float)i1 + f5 + f3);
            }
            j1 = i1;
            if (e.size() > 0)
            {
                motionevent = (bu)e.get(0);
                bu bu1 = (bu)e.get(e.size() - 1);
                j1 = Math.max(((bu) (motionevent)).b, Math.min(i1, bu1.b));
            }
            a(j1, true, true, k1);
            J = -1;
            j();
            i1 = Q.c() | R.c();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
        if (A)
        {
            a(i, true, 0, false);
            J = -1;
            j();
            i1 = Q.c() | R.c();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = android.support.v4.view.af.b(motionevent);
        F = android.support.v4.view.af.c(motionevent, i1);
        J = android.support.v4.view.af.b(motionevent, i1);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        F = android.support.v4.view.af.c(motionevent, android.support.v4.view.af.a(motionevent, J));
        i1 = j1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void removeView(View view)
    {
        if (w)
        {
            removeViewInLayout(view);
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    public void setAdapter(aj aj1)
    {
        if (h != null)
        {
            h.b(n);
            Object obj = h;
            for (int i1 = 0; i1 < e.size(); i1++)
            {
                obj = (bu)e.get(i1);
                h.a(this, ((bu) (obj)).b, ((bu) (obj)).a);
            }

            obj = h;
            e.clear();
            int k1;
            for (int j1 = 0; j1 < getChildCount(); j1 = k1 + 1)
            {
                k1 = j1;
                if (!((LayoutParams)getChildAt(j1).getLayoutParams()).a)
                {
                    removeViewAt(j1);
                    k1 = j1 - 1;
                }
            }

            i = 0;
            scrollTo(0, 0);
        }
        aj aj2 = h;
        h = aj1;
        b = 0;
        if (h != null)
        {
            if (n == null)
            {
                n = new bz(this, (byte)0);
            }
            h.a(n);
            y = false;
            boolean flag = S;
            S = true;
            b = h.a();
            if (j >= 0)
            {
                Object obj1 = h;
                obj1 = k;
                obj1 = l;
                a(j, false, true);
                j = -1;
                k = null;
                l = null;
            } else
            if (!flag)
            {
                d();
            } else
            {
                requestLayout();
            }
        }
        if (aa != null && aj2 != aj1)
        {
            aa.a(aj2, aj1);
        }
    }

    public void setCurrentItem(int i1)
    {
        y = false;
        boolean flag;
        if (!S)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, flag, false);
    }

    public void setCurrentItem(int i1, boolean flag)
    {
        y = false;
        a(i1, flag, false);
    }

    public void setOffscreenPageLimit(int i1)
    {
        int j1 = i1;
        if (i1 <= 0)
        {
            Log.w("ViewPager", (new StringBuilder("Requested offscreen page limit ")).append(i1).append(" too small; defaulting to 1").toString());
            j1 = 1;
        }
        if (j1 != z)
        {
            z = j1;
            d();
        }
    }

    public void setOnPageChangeListener(bx bx1)
    {
        W = bx1;
    }

    public void setPageMargin(int i1)
    {
        int j1 = o;
        o = i1;
        int k1 = getWidth();
        a(k1, k1, i1, j1);
        requestLayout();
    }

    public void setPageMarginDrawable(int i1)
    {
        setPageMarginDrawable(getContext().getResources().getDrawable(i1));
    }

    public void setPageMarginDrawable(Drawable drawable)
    {
        p = drawable;
        if (drawable != null)
        {
            refreshDrawableState();
        }
        boolean flag;
        if (drawable == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        invalidate();
    }

    public void setPageTransformer(boolean flag, by by)
    {
        int i1 = 1;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (by != null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (ab != null)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (flag2 != flag3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ab = by;
            if (android.os.Build.VERSION.SDK_INT >= 7)
            {
                if (ac == null)
                {
                    try
                    {
                        ac = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                            Boolean.TYPE
                        });
                    }
                    // Misplaced declaration of an exception variable
                    catch (by by)
                    {
                        Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", by);
                    }
                }
                try
                {
                    ac.invoke(this, new Object[] {
                        Boolean.valueOf(flag2)
                    });
                }
                // Misplaced declaration of an exception variable
                catch (by by)
                {
                    Log.e("ViewPager", "Error changing children drawing order", by);
                }
            }
            if (flag2)
            {
                if (flag)
                {
                    i1 = 2;
                }
                ad = i1;
            } else
            {
                ad = 0;
            }
            if (flag1)
            {
                d();
            }
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == p;
    }


    private class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public LayoutParams()
        {
            super(-1, -1);
            c = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            c = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ViewPager.e());
            b = context.getInteger(0, 48);
            context.recycle();
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = android.support.v4.e.a.a(new ca());
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public String toString()
        {
            return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(position).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(position);
            parcel.writeParcelable(adapterState, i1);
        }


        SavedState(Parcel parcel, ClassLoader classloader)
        {
            super(parcel);
            ClassLoader classloader1 = classloader;
            if (classloader == null)
            {
                classloader1 = getClass().getClassLoader();
            }
            position = parcel.readInt();
            adapterState = parcel.readParcelable(classloader1);
            loader = classloader1;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
