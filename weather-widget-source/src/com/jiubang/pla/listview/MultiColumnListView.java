// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.listview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ListAdapter;
import com.jiubang.pla.internal.PLA_ListView;

// Referenced classes of package com.jiubang.pla.listview:
//            b, c, a, d

public class MultiColumnListView extends PLA_ListView
{

    private int V;
    private b W[];
    private b Z;
    private SparseIntArray aa;
    private int ab;
    private int ac;
    private Rect ad;
    private boolean ae;

    public MultiColumnListView(Context context)
    {
        super(context);
        V = 2;
        W = null;
        Z = null;
        aa = new SparseIntArray();
        ab = 0;
        ac = 0;
        ad = new Rect();
        ae = true;
        b(null);
    }

    public MultiColumnListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        V = 2;
        W = null;
        Z = null;
        aa = new SparseIntArray();
        ab = 0;
        ac = 0;
        ad = new Rect();
        ae = true;
        b(attributeset);
    }

    public MultiColumnListView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        V = 2;
        W = null;
        Z = null;
        aa = new SparseIntArray();
        ab = 0;
        ac = 0;
        ad = new Rect();
        ae = true;
        b(attributeset);
    }

    private b D()
    {
        b b1 = W[0];
        b ab1[] = W;
        int i1 = ab1.length;
        for (int l = 0; l < i1; l++)
        {
            b b2 = ab1[l];
            if (b1.e() > b2.e())
            {
                b1 = b2;
            }
        }

        return b1;
    }

    private b E()
    {
        b b1 = W[0];
        b ab1[] = W;
        int i1 = ab1.length;
        for (int l = 0; l < i1; l++)
        {
            b b2 = ab1[l];
            if (b1.d() > b2.d())
            {
                b1 = b2;
            }
        }

        return b1;
    }

    private b a(boolean flag, int l)
    {
        int i1 = aa.get(l, -1);
        if (i1 != -1)
        {
            return W[i1];
        }
        l = Math.max(0, l);
        if (l < V)
        {
            return W[l];
        }
        if (flag)
        {
            return E();
        } else
        {
            return D();
        }
    }

    static boolean a(MultiColumnListView multicolumnlistview)
    {
        return multicolumnlistview.ae;
    }

    static boolean a(MultiColumnListView multicolumnlistview, boolean flag)
    {
        multicolumnlistview.ae = flag;
        return flag;
    }

    private void b(AttributeSet attributeset)
    {
        int l;
        l = 0;
        getWindowVisibleDisplayFrame(ad);
        if (attributeset != null) goto _L2; else goto _L1
_L1:
        V = 2;
_L4:
        W = new b[V];
        for (; l < V; l++)
        {
            W[l] = new b(this, l);
        }

        break MISSING_BLOCK_LABEL_164;
_L2:
        int j1;
        attributeset = getContext().obtainStyledAttributes(attributeset, com.gau.go.launcherex.gowidget.weatherwidget.R.styleable.PinterestLikeAdapterView);
        int i1 = attributeset.getInteger(1, -1);
        j1 = attributeset.getInteger(0, -1);
        if (ad.width() <= ad.height() || i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        V = i1;
_L5:
        ab = attributeset.getDimensionPixelSize(2, 0);
        ac = attributeset.getDimensionPixelSize(3, 0);
        attributeset.recycle();
        if (true) goto _L4; else goto _L3
_L3:
        if (j1 != -1)
        {
            V = j1;
        } else
        {
            V = 2;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        Z = new c(this);
        return;
    }

    private boolean n(int l)
    {
        return c.getItemViewType(l) == -2;
    }

    private int o(int l)
    {
        l = aa.get(l, -1);
        if (l == -1)
        {
            return 0;
        } else
        {
            return W[l].a();
        }
    }

    private int p(int l)
    {
        l = aa.get(l, -1);
        if (l == -1)
        {
            return 0;
        } else
        {
            return W[l].b();
        }
    }

    public void C()
    {
        ae = true;
    }

    public void a(d d1)
    {
        if (d1 != null)
        {
            a(((com.jiubang.pla.internal.e) (new a(this, d1))));
        }
    }

    protected void b(int l, boolean flag)
    {
        super.b(l, flag);
        if (!n(l))
        {
            b b1 = a(flag, l);
            aa.append(l, b1.c());
        }
    }

    protected void b(View view, int l, int i1, int j1)
    {
        if (d(view))
        {
            view.measure(i1, j1);
            return;
        } else
        {
            view.measure(0x40000000 | p(l), j1);
            return;
        }
    }

    protected void d(int l)
    {
        b ab1[] = W;
        int i1 = ab1.length;
        for (l = 0; l < i1; l++)
        {
            ab1[l].f();
        }

    }

    protected void e(int l)
    {
        b ab1[] = W;
        int i1 = ab1.length;
        for (l = 0; l < i1; l++)
        {
            ab1[l].g();
        }

    }

    protected void e(boolean flag)
    {
        int l = 0;
        int i1 = v();
        if (!flag && i1 == 0)
        {
            int j1 = W[0].e();
            b ab1[] = W;
            for (int k1 = ab1.length; l < k1; l++)
            {
                b b1 = ab1[l];
                b1.a(j1 - b1.e());
            }

        }
        super.e(flag);
    }

    protected int h(int l)
    {
        return l / V;
    }

    protected int i(int l)
    {
        if (n(l))
        {
            return Z.a();
        } else
        {
            return o(l);
        }
    }

    protected int j(int l)
    {
        if (n(l))
        {
            return Z.d();
        }
        l = aa.get(l, -1);
        if (l == -1)
        {
            return q();
        } else
        {
            return W[l].d();
        }
    }

    protected int k(int l)
    {
        if (n(l))
        {
            return Z.e();
        }
        l = aa.get(l, -1);
        if (l == -1)
        {
            return p();
        } else
        {
            return W[l].e();
        }
    }

    protected int o()
    {
        int l = 0x7fffffff;
        b ab1[] = W;
        int k1 = ab1.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            int j1 = ab1[i1].e();
            if (l > j1)
            {
                l = j1;
            }
        }

        return l;
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        super.onLayout(flag, l, i1, j1, k1);
    }

    protected void onMeasure(int l, int i1)
    {
        super.onMeasure(l, i1);
        i1 = (getMeasuredWidth() - this.l.left - this.l.right - ab - ac) / V;
        for (l = 0; l < V; l++)
        {
            com.jiubang.pla.listview.b.a(W[l], i1);
            com.jiubang.pla.listview.b.b(W[l], this.l.left + ab + i1 * l);
        }

        com.jiubang.pla.listview.b.b(Z, this.l.left);
        com.jiubang.pla.listview.b.a(Z, getMeasuredWidth());
    }

    protected int p()
    {
        int l = 0x80000000;
        b ab1[] = W;
        int k1 = ab1.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            int j1 = ab1[i1].e();
            if (l < j1)
            {
                l = j1;
            }
        }

        return l;
    }

    protected int q()
    {
        int l = 0x7fffffff;
        b ab1[] = W;
        int k1 = ab1.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            int j1 = ab1[i1].d();
            if (l > j1)
            {
                l = j1;
            }
        }

        return l;
    }

    protected int r()
    {
        int l = 0x80000000;
        b ab1[] = W;
        int k1 = ab1.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            int j1 = ab1[i1].d();
            if (l < j1)
            {
                l = j1;
            }
        }

        return l;
    }
}
