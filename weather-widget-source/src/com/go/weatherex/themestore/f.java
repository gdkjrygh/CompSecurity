// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.gtp.a.a.b.c;
import com.jiubang.playsdk.adapter.a;
import java.util.List;

// Referenced classes of package com.go.weatherex.themestore:
//            g

public abstract class f extends a
    implements android.view.View.OnClickListener
{

    protected ListView a;
    protected LayoutInflater b;
    private final SparseIntArray f = new SparseIntArray();
    private int g;
    private int h;
    private int i;
    private boolean j;
    private SparseArray k;

    public f(Context context, List list, ListView listview)
    {
        super(context, list);
        a = null;
        g = 2;
        h = 0;
        i = 0;
        j = false;
        k = new SparseArray();
        a = listview;
        a.setDividerHeight(0);
        int l = context.getResources().getDimensionPixelSize(0x7f0c0238);
        int i1 = context.getResources().getDimensionPixelSize(0x7f0c0239);
        b(l);
        c(i1);
        b = LayoutInflater.from(c);
    }

    private void a(LinearLayout linearlayout, View view, int l)
    {
        linearlayout.addView(view, l, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F));
    }

    private int d(int l)
    {
        boolean flag = false;
        int i1 = ((flag) ? 1 : 0);
        if (j)
        {
            i1 = ((flag) ? 1 : 0);
            if (l > 2)
            {
                int j1 = (l - 3) / 6 + 1;
                i1 = j1;
                if ((l - 3) % 6 == 0)
                {
                    i1 = j1 - 1;
                }
            }
        }
        return i1;
    }

    private boolean e(int l)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!j)
            {
                break label0;
            }
            flag = flag1;
            if (l == getCount() - 1)
            {
                break label0;
            }
            if (l - 2 != 0)
            {
                flag = flag1;
                if ((l - 2) % 6 != 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public int a()
    {
        if (e == null)
        {
            return 0;
        } else
        {
            return e.size();
        }
    }

    public abstract View a(int l, View view, ViewGroup viewgroup);

    public void a(int l)
    {
        if (g == l)
        {
            return;
        } else
        {
            g = l;
            a.setAdapter(this);
            return;
        }
    }

    protected void a(FrameLayout framelayout, android.widget.LinearLayout.LayoutParams layoutparams, int l, int i1)
    {
        framelayout.setPadding(0, i / 2, 0, i / 2);
        layoutparams.leftMargin = 0;
        layoutparams.rightMargin = 0;
        layoutparams.gravity = 16;
        if (l == 0)
        {
            framelayout.setPadding(0, 0, 0, i / 2);
        }
        if (l == getCount() - 1)
        {
            framelayout.setPadding(0, i / 2, 0, 0);
        }
        if (i1 < g - 1)
        {
            layoutparams.rightMargin = h;
        }
    }

    public void a(List list)
    {
        if (e != list)
        {
            if (e != null)
            {
                e.clear();
            }
            if (list != null && e != null)
            {
                e.addAll(list);
            }
        }
        notifyDataSetChanged();
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public int b()
    {
        return i;
    }

    public void b(int l)
    {
        h = l;
    }

    public void c()
    {
        int i1 = k.size();
        for (int l = 0; l < i1; l++)
        {
            ((com.go.weatherex.ad.nativead.a)k.valueAt(l)).a();
        }

        k.clear();
    }

    public void c(int l)
    {
        i = l;
    }

    public int getCount()
    {
        int j1 = a();
        int i1 = j1 / g;
        int l = i1;
        if (j1 % g != 0)
        {
            l = i1 + 1;
        }
        com.gtp.a.a.b.c.a("adapter", (new StringBuilder()).append("\u603B\u884C\u6570 - ").append(l).toString());
        l += d(l);
        com.gtp.a.a.b.c.a("adapter", (new StringBuilder()).append("\u52A0\u5165\u5E7F\u544A\u540E\u603B\u884C\u6570 - ").append(l).toString());
        return l;
    }

    public Object getItem(int l)
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.get(l);
        }
    }

    public final View getView(int l, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = (FrameLayout)b.inflate(0x7f030038, viewgroup, false);
            viewgroup = new g(this, view);
            for (int i1 = 0; i1 < g; i1++)
            {
                a(((g) (viewgroup)).b, new FrameLayout(c), i1);
            }

            view.setTag(viewgroup);
        } else
        {
            viewgroup = (g)view.getTag();
        }
        if (!e(l)) goto _L2; else goto _L1
_L1:
        com.gtp.a.a.b.c.a("adapter", (new StringBuilder()).append("\u884C - ").append(l).append("\u4E3A\u5E7F\u544A\u3002").toString());
        ((g) (viewgroup)).a.setVisibility(0);
        ((g) (viewgroup)).b.setVisibility(8);
        com.go.weatherex.ad.nativead.a a1 = (com.go.weatherex.ad.nativead.a)k.get(l);
        if (a1 == null)
        {
            a1 = new com.go.weatherex.ad.nativead.a(c);
            a1.a(c.getString(0x7f08003e));
            k.put(l, a1);
        }
        ViewGroup viewgroup1 = (ViewGroup)a1.getParent();
        if (viewgroup1 != null)
        {
            viewgroup1.removeView(a1);
        }
        ((g) (viewgroup)).a.removeAllViews();
        ((g) (viewgroup)).a.addView(a1);
_L4:
        return view;
_L2:
        int j1;
        int l1;
        ((g) (viewgroup)).a.setVisibility(8);
        ((g) (viewgroup)).b.setVisibility(0);
        l1 = a();
        j1 = 0;
_L7:
        if (j1 >= g) goto _L4; else goto _L3
_L3:
        View view1;
        FrameLayout framelayout;
        int k1;
        framelayout = (FrameLayout)((g) (viewgroup)).b.getChildAt(j1);
        framelayout.setVisibility(0);
        a(framelayout, (android.widget.LinearLayout.LayoutParams)framelayout.getLayoutParams(), l, j1);
        if (framelayout.getChildCount() > 1)
        {
            throw new IllegalStateException("convertViewContainer can't has more than 1 child...");
        }
        k1 = (l - d(l + 1)) * g + j1;
        com.gtp.a.a.b.c.a("adapter", (new StringBuilder()).append("\u884C-").append(l).append("|\u4F4D\u7F6E-").append(j1).append("|\u771F\u5B9E\u4F4D\u7F6E-").append(k1).toString());
        if (k1 >= l1)
        {
            break MISSING_BLOCK_LABEL_524;
        }
        if (framelayout.getChildCount() == 1)
        {
            view1 = framelayout.getChildAt(0);
        } else
        {
            view1 = null;
        }
        view1 = a(k1, view1, framelayout);
        if (view1 != null) goto _L6; else goto _L5
_L5:
        framelayout.removeAllViews();
_L10:
        j1++;
          goto _L7
_L6:
        view1.setOnClickListener(this);
        f.put(view1.hashCode(), k1);
        if (framelayout.getChildCount() != 1)
        {
            break MISSING_BLOCK_LABEL_518;
        }
        if (view1 != framelayout.getChildAt(0)) goto _L9; else goto _L8
_L8:
        boolean flag = false;
_L11:
        if (flag)
        {
            framelayout.addView(view1);
        }
          goto _L10
_L9:
        framelayout.removeAllViews();
        flag = true;
          goto _L11
        framelayout.setVisibility(4);
          goto _L10
    }

    public void onClick(View view)
    {
        int l = f.get(view.hashCode(), -1);
        if (a != null && l != -1)
        {
            android.widget.AdapterView.OnItemClickListener onitemclicklistener = a.getOnItemClickListener();
            if (onitemclicklistener != null)
            {
                onitemclicklistener.onItemClick(a, view, l, getItemId(l));
            }
        }
    }
}
