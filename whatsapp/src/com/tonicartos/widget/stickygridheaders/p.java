// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            m, d, StickyGridHeadersGridView, u

public class p extends BaseAdapter
{

    private static boolean e;
    private static final String z;
    private DataSetObserver a;
    private final List b = new ArrayList();
    private StickyGridHeadersGridView c;
    private final d d;
    private int f;
    private View g[];
    private int h;
    private final Context i;

    public p(Context context, StickyGridHeadersGridView stickygridheadersgridview, d d1)
    {
        a = new m(this);
        f = 1;
        i = context;
        d = d1;
        c = stickygridheadersgridview;
        d1.registerDataSetObserver(a);
    }

    private int a(int j)
    {
        j = d.a(j) % f;
        if (j == 0)
        {
            return 0;
        } else
        {
            return f - j;
        }
    }

    private StickyGridHeadersBaseAdapterWrapper.FillerView a(View view, ViewGroup viewgroup)
    {
        if (view != null && !(view instanceof StickyGridHeadersBaseAdapterWrapper.FillerView))
        {
            Log.e((new StringBuilder()).append(z).append(view).append(" ").append(view.getTag()).toString());
            view = null;
        }
        viewgroup = (StickyGridHeadersBaseAdapterWrapper.FillerView)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new StickyGridHeadersBaseAdapterWrapper.FillerView(this, i);
        }
        return view;
    }

    static View[] a(p p1)
    {
        return p1.g;
    }

    private View b(int j, View view, ViewGroup viewgroup)
    {
        view = (StickyGridHeadersBaseAdapterWrapper.HeaderFillerView)view;
        view = new StickyGridHeadersBaseAdapterWrapper.HeaderFillerView(this, i);
        view.setHeaderWidth(c.getWidth());
        return view;
    }

    static List b(p p1)
    {
        return p1.b;
    }

    private void c(int j)
    {
        g = new View[j];
        Arrays.fill(g, null);
    }

    protected View a(int j, View view, ViewGroup viewgroup)
    {
        if (d.a() == 0)
        {
            return null;
        } else
        {
            return d.a(e(j).c, view, viewgroup);
        }
    }

    protected void a()
    {
        int j;
        int k;
        int l;
        j = 0;
        k = StickyGridHeadersGridView.s;
        h = 0;
        l = d.a();
        if (l != 0) goto _L2; else goto _L1
_L1:
        h = d.getCount();
_L4:
        return;
_L2:
        do
        {
            if (j >= l)
            {
                continue; /* Loop/switch isn't completed */
            }
            h = h + (d.a(j) + f);
            j++;
        } while (k == 0);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    protected long b(int j)
    {
        return (long)e(j).c;
    }

    public void d(int j)
    {
        f = j;
        c(j);
    }

    protected u e(int j)
    {
        int j1 = StickyGridHeadersGridView.s;
        int k1 = d.a();
        if (k1 == 0)
        {
            if (j >= d.getCount())
            {
                return new u(this, -1, 0);
            } else
            {
                return new u(this, j, 0);
            }
        }
        int i1 = 0;
        int k = j;
        int l = j;
        j = i1;
        do
        {
            i1 = j;
            if (j >= k1)
            {
                break;
            }
            i1 = d.a(j);
            if (l == 0)
            {
                return new u(this, -2, j);
            }
            l -= f;
            if (l < 0)
            {
                return new u(this, -1, j);
            }
            k -= f;
            if (l < i1)
            {
                return new u(this, k, j);
            }
            int l1 = a(j);
            k -= l1;
            l -= i1 + l1;
            i1 = j + 1;
            j = i1;
        } while (j1 == 0);
        return new u(this, -1, i1);
    }

    public int getCount()
    {
        int j = 0;
        int k = StickyGridHeadersGridView.s;
        h = 0;
        int l = d.a();
        if (l == 0)
        {
            return d.getCount();
        }
        do
        {
            if (j >= l)
            {
                break;
            }
            h = h + (d.a(j) + a(j) + f);
            j++;
        } while (k == 0);
        return h;
    }

    public Object getItem(int j)
    {
        u u1 = e(j);
        if (u1.b == -1 || u1.b == -2)
        {
            return null;
        } else
        {
            return d.getItem(u1.b);
        }
    }

    public long getItemId(int j)
    {
        u u1 = e(j);
        if (u1.b == -2)
        {
            return -1L;
        }
        if (u1.b == -1)
        {
            return -2L;
        } else
        {
            return d.getItemId(u1.b);
        }
    }

    public int getItemViewType(int j)
    {
        u u1 = e(j);
        if (u1.b == -2)
        {
            j = 1;
        } else
        {
            if (u1.b == -1)
            {
                return 0;
            }
            int k = d.getItemViewType(u1.b);
            j = k;
            if (k != -1)
            {
                return k + 2;
            }
        }
        return j;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
label0:
        {
            int k = StickyGridHeadersGridView.s;
            Object obj;
            Object obj1;
            u u1;
            if (view instanceof StickyGridHeadersBaseAdapterWrapper.ReferenceView)
            {
                view = (StickyGridHeadersBaseAdapterWrapper.ReferenceView)view;
                obj = view.getChildAt(0);
            } else
            {
                Object obj2 = null;
                obj = view;
                view = obj2;
            }
            u1 = e(j);
            if (u1.b == -2)
            {
                View view1 = b(u1.c, ((View) (obj)), viewgroup);
                ((StickyGridHeadersBaseAdapterWrapper.HeaderFillerView)view1).setHeaderId(u1.c);
                obj = (View)view1.getTag();
                view1.setTag(d.a(u1.c, ((View) (obj)), viewgroup));
                obj = view1;
                if (k == 0)
                {
                    break label0;
                }
                DialogToastActivity.g++;
                obj = view1;
            }
            obj1 = obj;
            if (u1.b == -1)
            {
                obj1 = a(((View) (obj)), viewgroup);
                obj = obj1;
                if (k == 0)
                {
                    break label0;
                }
            }
            obj = d.getView(u1.b, ((View) (obj1)), viewgroup);
        }
        viewgroup = view;
        if (view == null)
        {
            viewgroup = new StickyGridHeadersBaseAdapterWrapper.ReferenceView(this, i);
        }
        viewgroup.removeAllViews();
        viewgroup.addView(((View) (obj)));
        viewgroup.setPosition(j);
        viewgroup.setNumColumns(f);
        g[j % f] = viewgroup;
        viewgroup.setRowSiblings(g);
        if (!e && (j % f == f - 1 || j == getCount() - 1))
        {
            c(f);
        }
        return viewgroup;
    }

    public int getViewTypeCount()
    {
        return d.getViewTypeCount() + 2;
    }

    public boolean hasStableIds()
    {
        return d.hasStableIds();
    }

    public boolean isEmpty()
    {
        return d.isEmpty();
    }

    public boolean isEnabled(int j)
    {
        u u1 = e(j);
        if (u1.b == -1 || u1.b == -2)
        {
            return false;
        } else
        {
            return d.isEnabled(u1.b);
        }
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        d.registerDataSetObserver(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        d.unregisterDataSetObserver(datasetobserver);
    }

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "][Z\006]WHA\fRFJR\001S\\\\Q\004EKNW\004FZJA\022DO_C\000D\001HV\021PGC_\000DXFV\022\026Y]\\\013Q\016[J\025S".toCharArray();
        k = ac.length;
        j = 0;
_L7:
        char c1;
        if (k <= j)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 54;
_L8:
        ac[j] = (char)(byte0 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 46;
          goto _L8
_L3:
        byte0 = 47;
          goto _L8
_L4:
        byte0 = 51;
          goto _L8
        byte0 = 101;
          goto _L8
    }
}
