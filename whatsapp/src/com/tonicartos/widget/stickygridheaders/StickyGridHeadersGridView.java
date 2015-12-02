// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.whatsapp.DialogToastActivity;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            t, p, h, i, 
//            u, n, e, s, 
//            a, d, g, l, 
//            j, r

public class StickyGridHeadersGridView extends GridView
    implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemSelectedListener, android.widget.AdapterView.OnItemLongClickListener
{

    public static int s;
    private android.widget.AdapterView.OnItemSelectedListener A;
    private DataSetObserver B;
    protected boolean C;
    private int D;
    private Runnable E;
    private int F;
    private long G;
    private float a;
    private android.widget.AdapterView.OnItemLongClickListener b;
    private int c;
    private boolean d;
    private i e;
    private int f;
    private boolean g;
    protected int h;
    private boolean i;
    protected int j;
    protected p k;
    private int l;
    private boolean m;
    private android.widget.AdapterView.OnItemClickListener n;
    private int o;
    private int p;
    private final Rect q;
    public e r;
    private h t;
    private int u;
    private boolean v;
    private s w;
    private View x;
    public r y;
    private android.widget.AbsListView.OnScrollListener z;

    public StickyGridHeadersGridView(Context context)
    {
        this(context, null);
    }

    public StickyGridHeadersGridView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010071);
    }

    public StickyGridHeadersGridView(Context context, AttributeSet attributeset, int i1)
    {
        int j1 = s;
        super(context, attributeset, i1);
        m = true;
        q = new Rect();
        G = -1L;
        B = new t(this);
        l = 1;
        c = 0;
        d = true;
        super.setOnScrollListener(this);
        setVerticalFadingEdgeEnabled(false);
        if (!i)
        {
            D = -1;
        }
        f = ViewConfiguration.get(context).getScaledTouchSlop();
        if (DialogToastActivity.g != 0)
        {
            s = j1 + 1;
        }
    }

    private int a(float f1)
    {
        int l1 = s;
        if (x == null || f1 > (float)x.getBottom()) goto _L2; else goto _L1
_L1:
        int k1 = -2;
_L4:
        return k1;
_L2:
        int i1;
        int j1;
        i1 = 0;
        j1 = getFirstVisiblePosition();
_L6:
        int i2;
        if (j1 > getLastVisiblePosition())
        {
            break; /* Loop/switch isn't completed */
        }
        if (getItemIdAtPosition(j1) != -1L)
        {
            break; /* Loop/switch isn't completed */
        }
        View view = getChildAt(i1);
        k1 = view.getBottom();
        i2 = view.getTop();
        if (f1 > (float)k1)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = i1;
        if (f1 >= (float)i2) goto _L4; else goto _L3
_L3:
        j1 += l;
        i1 += l;
        if (l1 == 0) goto _L6; else goto _L5
_L5:
        return -1;
    }

    static int a(StickyGridHeadersGridView stickygridheadersgridview)
    {
        return stickygridheadersgridview.getWindowAttachCount();
    }

    static long a(StickyGridHeadersGridView stickygridheadersgridview, int i1)
    {
        return stickygridheadersgridview.c(i1);
    }

    private void a()
    {
        u = 0;
        x = null;
        G = 0x8000000000000000L;
    }

    private int b()
    {
        if (x != null)
        {
            return x.getMeasuredHeight();
        } else
        {
            return 0;
        }
    }

    private void b(int i1)
    {
        int j2;
        j2 = s;
        break MISSING_BLOCK_LABEL_5;
_L15:
        int j1;
        int k1;
        long l2;
        do
        {
            return;
        } while (k == null || k.getCount() == 0 || !m || (StickyGridHeadersBaseAdapterWrapper.ReferenceView)getChildAt(0) == null);
        k1 = i1 - l;
        j1 = k1;
        if (k1 < 0)
        {
            j1 = i1;
        }
        int l1 = l + i1;
        k1 = l1;
        if (l1 >= k.getCount())
        {
            k1 = i1;
        }
        if (o == 0)
        {
            l2 = k.b(i1);
            if (j2 == 0)
            {
                break MISSING_BLOCK_LABEL_600;
            }
        }
        if (o >= 0) goto _L2; else goto _L1
_L1:
        k.b(i1);
        if (getChildAt(l).getTop() > 0) goto _L4; else goto _L3
_L3:
        int i2;
        l2 = k.b(k1);
        i2 = k1;
        if (j2 == 0) goto _L6; else goto _L5
_L5:
        l2 = k.b(i1);
        i2 = k1;
_L6:
        k1 = i2;
        if (j2 == 0) goto _L8; else goto _L7
_L7:
        int k2;
        k2 = getChildAt(0).getTop();
        k1 = i2;
        if (k2 <= 0) goto _L10; else goto _L9
_L9:
        k1 = i2;
        if (k2 >= o) goto _L10; else goto _L11
_L11:
        l2 = k.b(j1);
        if (j2 == 0) goto _L13; else goto _L12
_L12:
        k1 = j1;
_L10:
        l2 = k.b(i1);
_L8:
        if (G != l2)
        {
            x = k.a(k1, x, this);
            c();
            G = l2;
        }
        k2 = getChildCount();
        if (k2 == 0) goto _L15; else goto _L14
_L14:
label0:
        {
label1:
            {
                StickyGridHeadersBaseAdapterWrapper.ReferenceView referenceview = null;
                j1 = 0x1869f;
                StickyGridHeadersBaseAdapterWrapper.ReferenceView referenceview1;
                for (i2 = 0; i2 >= k2; i2 = k1 + i2)
                {
                    break label0;
                }

                referenceview1 = (StickyGridHeadersBaseAdapterWrapper.ReferenceView)super.getChildAt(i2);
                if (g)
                {
                    k1 = referenceview1.getTop() - getPaddingTop();
                    if (j2 == 0)
                    {
                        break label1;
                    }
                }
                k1 = referenceview1.getTop();
            }
            if ((k1 >= 0 || j2 != 0) && (referenceview1.a() instanceof StickyGridHeadersBaseAdapterWrapper.HeaderFillerView) && k1 < j1)
            {
                referenceview = referenceview1;
                j1 = k1;
            }
            k1 = l;
            if (j2 == 0)
            {
                break MISSING_BLOCK_LABEL_571;
            }
        }
        j1 = b();
        if (referenceview == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 != 0 || super.getChildAt(0).getTop() <= 0 || g)
        {
            break; /* Loop/switch isn't completed */
        }
        u = 0;
        if (j2 == 0) goto _L15; else goto _L16
_L16:
        if (!g)
        {
            break; /* Loop/switch isn't completed */
        }
        u = Math.min(referenceview.getTop(), getPaddingTop() + j1);
        if (u < getPaddingTop())
        {
            i1 = getPaddingTop() + j1;
        } else
        {
            i1 = u;
        }
        u = i1;
        if (j2 == 0) goto _L15; else goto _L17
_L17:
        u = Math.min(referenceview.getTop(), j1);
        if (u < 0)
        {
            i1 = j1;
        } else
        {
            i1 = u;
        }
        u = i1;
        if (j2 == 0) goto _L15; else goto _L18
_L18:
        u = j1;
        if (g)
        {
            u = u + getPaddingTop();
            return;
        }
          goto _L15
_L13:
        k1 = j1;
          goto _L8
_L4:
        k1 = i1;
          goto _L5
_L2:
        i2 = i1;
          goto _L7
        k1 = i1;
          goto _L8
    }

    static void b(StickyGridHeadersGridView stickygridheadersgridview)
    {
        stickygridheadersgridview.a();
    }

    static int c(StickyGridHeadersGridView stickygridheadersgridview)
    {
        return stickygridheadersgridview.getWindowAttachCount();
    }

    private long c(int i1)
    {
        if (i1 == -2)
        {
            return G;
        } else
        {
            return k.b(getFirstVisiblePosition() + i1);
        }
    }

    private void c()
    {
        int i1;
        int j1;
label0:
        {
            if (x == null)
            {
                return;
            }
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000);
            android.view.ViewGroup.LayoutParams layoutparams = x.getLayoutParams();
            if (layoutparams != null && layoutparams.height > 0)
            {
                i1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                if (s == 0)
                {
                    break label0;
                }
            }
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        x.measure(j1, i1);
        x.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), x.getMeasuredHeight());
    }

    public View a(int i1)
    {
        if (i1 == -2)
        {
            View view;
            try
            {
                view = x;
            }
            catch (Exception exception)
            {
                throw exception;
            }
            return view;
        }
        View view1;
        try
        {
            view1 = (View)getChildAt(i1).getTag();
        }
        catch (Exception exception1)
        {
            return null;
        }
        return view1;
    }

    public boolean a(View view, long l1)
    {
        boolean flag;
        if (t != null)
        {
            flag = t.a(this, view, l1);
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (view != null)
            {
                view.sendAccessibilityEvent(2);
            }
            performHapticFeedback(0);
        }
        return flag;
    }

    public boolean b(View view, long l1)
    {
        if (e != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
            e.a(this, view, l1);
            return true;
        } else
        {
            return false;
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        boolean flag;
        int k1;
        int i2;
        int j2;
        int k2;
        i2 = s;
        ArrayList arraylist;
        StickyGridHeadersBaseAdapterWrapper.ReferenceView referenceview;
        View view;
        int i1;
        int l1;
        int l2;
        long l3;
        long l4;
        boolean flag2;
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 8)
            {
                b(getFirstVisiblePosition());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (x == null) goto _L2; else goto _L1
_L1:
        flag2 = m;
        if (!flag2) goto _L2; else goto _L3
_L3:
        i1 = x.getVisibility();
        if (i1 != 0) goto _L2; else goto _L4
_L4:
        flag = true;
_L15:
        j2 = b();
        k2 = u - j2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        flag2 = d;
        if (flag2)
        {
            try
            {
                q.left = getPaddingLeft();
                q.right = getWidth() - getPaddingRight();
                q.top = u;
                q.bottom = getHeight();
                canvas.save();
                canvas.clipRect(q);
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        super.dispatchDraw(canvas);
        arraylist = new ArrayList();
        k1 = 0;
        l1 = getFirstVisiblePosition();
        do
        {
            if (l1 > getLastVisiblePosition())
            {
                break;
            }
            if (getItemIdAtPosition(l1) == -1L)
            {
                try
                {
                    arraylist.add(Integer.valueOf(k1));
                }
                // Misplaced declaration of an exception variable
                catch (Canvas canvas)
                {
                    throw canvas;
                }
            }
            l1 += l;
            k1 += l;
        } while (i2 == 0);
        k1 = 0;
_L17:
        if (k1 >= arraylist.size()) goto _L6; else goto _L5
_L5:
        referenceview = (StickyGridHeadersBaseAdapterWrapper.ReferenceView)getChildAt(((Integer)arraylist.get(k1)).intValue());
        int j1;
        boolean flag1;
        boolean flag3;
        try
        {
            view = (View)referenceview.getTag();
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            return;
        }
        l3 = ((StickyGridHeadersBaseAdapterWrapper.HeaderFillerView)referenceview.getChildAt(0)).a();
        l4 = G;
        if (l3 != l4) goto _L8; else goto _L7
_L7:
        l1 = referenceview.getTop();
        if (l1 >= 0) goto _L8; else goto _L9
_L9:
        try
        {
            flag2 = m;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (!flag2) goto _L8; else goto _L10
_L10:
        flag1 = true;
_L16:
        try
        {
            l2 = view.getVisibility();
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (l2 == 0 && (!flag1 || i2 != 0))
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x40000000 - getPaddingLeft() - getPaddingRight()), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), referenceview.getHeight());
            q.left = getPaddingLeft();
            q.right = getWidth() - getPaddingRight();
            q.bottom = referenceview.getBottom();
            q.top = referenceview.getTop();
            canvas.save();
            canvas.clipRect(q);
            canvas.translate(getPaddingLeft(), referenceview.getTop());
            view.draw(canvas);
            canvas.restore();
        }
        if (i2 == 0)
        {
            break MISSING_BLOCK_LABEL_839;
        }
_L6:
        if (!flag) goto _L12; else goto _L11
_L11:
        try
        {
            flag2 = d;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas) { }
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (!flag2) goto _L12; else goto _L13
_L13:
        canvas.restore();
        if (i2 == 0) goto _L14; else goto _L12
_L12:
        if (!flag)
        {
            return;
        }
          goto _L14
        canvas;
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
_L2:
        flag = false;
          goto _L15
        canvas;
        throw canvas;
        canvas;
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        throw canvas;
_L8:
        flag1 = false;
          goto _L16
_L14:
        if (x.getWidth() != getWidth() - getPaddingLeft() - getPaddingRight())
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x40000000 - getPaddingLeft() - getPaddingRight());
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            x.measure(j1, k1);
            x.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), x.getHeight());
        }
        q.left = getPaddingLeft();
        q.right = getWidth() - getPaddingRight();
        q.bottom = k2 + j2;
        flag3 = g;
        if (flag3)
        {
            try
            {
                q.top = getPaddingTop();
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
            if (i2 == 0)
            {
                break MISSING_BLOCK_LABEL_756;
            }
        }
        q.top = 0;
        canvas.save();
        canvas.clipRect(q);
        canvas.translate(getPaddingLeft(), k2);
        canvas.saveLayerAlpha(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight(), (int)((255F * (float)u) / (float)j2), 4);
        x.draw(canvas);
        canvas.restore();
        canvas.restore();
        return;
        canvas;
        throw canvas;
        k1++;
          goto _L17
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        n.onItemClick(adapterview, view, k.e(i1).b, l1);
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i1, long l1)
    {
        return b.onItemLongClick(adapterview, view, k.e(i1).b, l1);
    }

    public void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
    {
        A.onItemSelected(adapterview, view, k.e(i1).b, l1);
    }

    protected void onMeasure(int i1, int j1)
    {
label0:
        {
label1:
            {
                int k1;
                int i2;
label2:
                {
label3:
                    {
label4:
                        {
                            boolean flag = true;
                            i2 = s;
                            if (D != -1)
                            {
                                break label1;
                            }
                            if (p <= 0)
                            {
                                break label3;
                            }
                            int j2 = Math.max(android.view.View.MeasureSpec.getSize(i1) - getPaddingLeft() - getPaddingRight(), 0);
                            int l1 = j2 / p;
                            k1 = ((flag) ? 1 : 0);
                            if (l1 <= 0)
                            {
                                break label4;
                            }
                            k1 = l1;
                            do
                            {
                                if (k1 == 1 || p * k1 + (k1 - 1) * F <= j2)
                                {
                                    break label4;
                                }
                                k1--;
                            } while (i2 == 0);
                            k1 = ((flag) ? 1 : 0);
                        }
                        if (i2 == 0)
                        {
                            break label2;
                        }
                    }
                    k1 = 2;
                }
                l = k1;
                if (i2 == 0)
                {
                    break label0;
                }
            }
            l = D;
        }
        if (k != null)
        {
            k.d(l);
        }
        c();
        super.onMeasure(i1, j1);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        A.onNothingSelected(adapterview);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (n)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        m = ((n) (parcelable)).a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        n n1 = new n(super.onSaveInstanceState());
        n1.a = m;
        return n1;
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        if (z != null)
        {
            z.onScroll(abslistview, i1, j1, k1);
        }
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            b(i1);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (z != null)
        {
            z.onScrollStateChanged(abslistview, i1);
        }
        c = i1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = s;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 46
    //                   1 210
    //                   2 131;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        if (r == null)
        {
            r = new e(this);
        }
        postDelayed(r, ViewConfiguration.getTapTimeout());
        int j1 = (int)motionevent.getY();
        a = j1;
        h = a(j1);
        if (h == -1 || c == 2 && i1 == 0) goto _L1; else goto _L5
_L5:
        j = 0;
        return true;
_L4:
        if (h == -1 || Math.abs(motionevent.getY() - a) <= (float)f) goto _L1; else goto _L6
_L6:
        j = -1;
        Object obj = a(h);
        if (obj != null)
        {
            ((View) (obj)).setPressed(false);
        }
        obj = getHandler();
        if (obj != null)
        {
            ((Handler) (obj)).removeCallbacks(y);
        }
        h = -1;
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        if (j == -2)
        {
            return true;
        }
        if (j == -1 || h == -1 && i1 == 0) goto _L1; else goto _L7
_L7:
        View view;
        s s1;
        view = a(h);
        if (view == null || view.hasFocusable())
        {
            break MISSING_BLOCK_LABEL_446;
        }
        if (j != 0)
        {
            view.setPressed(false);
        }
        if (w == null)
        {
            w = new s(this, null);
        }
        s1 = w;
        s1.d = h;
        s1.b();
        if (j == 0 && j == 1) goto _L9; else goto _L8
_L8:
        Handler handler = getHandler();
        if (handler != null)
        {
            if (j == 0)
            {
                motionevent = r;
            } else
            {
                motionevent = y;
            }
            handler.removeCallbacks(motionevent);
        }
        if (C) goto _L11; else goto _L10
_L10:
        j = 1;
        view.setPressed(true);
        setPressed(true);
        if (E != null)
        {
            removeCallbacks(E);
        }
        E = new a(this, view, s1);
        postDelayed(E, ViewConfiguration.getPressedStateDuration());
        if (i1 == 0) goto _L12; else goto _L11
_L11:
        j = -1;
_L12:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_446;
        }
_L9:
        if (!C)
        {
            s1.run();
        }
        j = -1;
        return true;
    }

    public void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        Object obj;
label0:
        {
            int i1 = s;
            if (k != null && B != null)
            {
                k.unregisterDataSetObserver(B);
            }
            if (!v)
            {
                g = true;
            }
            if (listadapter instanceof d)
            {
                obj = (d)listadapter;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (listadapter instanceof g)
            {
                obj = new l((g)listadapter);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            obj = new j(listadapter);
        }
        k = new p(getContext(), this, ((d) (obj)));
        k.registerDataSetObserver(B);
        a();
        super.setAdapter(k);
    }

    public void setClipToPadding(boolean flag)
    {
        super.setClipToPadding(flag);
        g = flag;
        v = true;
    }

    public void setColumnWidth(int i1)
    {
        super.setColumnWidth(i1);
        p = i1;
    }

    public void setHorizontalSpacing(int i1)
    {
        super.setHorizontalSpacing(i1);
        F = i1;
    }

    public void setNumColumns(int i1)
    {
        super.setNumColumns(i1);
        i = true;
        D = i1;
        if (i1 != -1 && k != null)
        {
            k.d(i1);
        }
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        n = onitemclicklistener;
        super.setOnItemClickListener(this);
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        b = onitemlongclicklistener;
        super.setOnItemLongClickListener(this);
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        A = onitemselectedlistener;
        super.setOnItemSelectedListener(this);
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        z = onscrolllistener;
    }

    public void setVerticalSpacing(int i1)
    {
        super.setVerticalSpacing(i1);
        o = i1;
    }
}
