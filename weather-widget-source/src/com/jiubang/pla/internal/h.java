// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.view.View;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AbsListView, i

class h
{

    final PLA_AbsListView a;
    private i b;
    private int c;
    private View d[];
    private ArrayList e[];
    private int f;
    private ArrayList g;

    h(PLA_AbsListView pla_abslistview)
    {
        a = pla_abslistview;
        super();
        d = new View[0];
    }

    private void d()
    {
        int i1 = d.length;
        int j1 = f;
        ArrayList aarraylist[] = e;
        for (int j = 0; j < j1; j++)
        {
            ArrayList arraylist = aarraylist[j];
            int k1 = arraylist.size();
            int k = k1 - 1;
            for (int l = 0; l < k1 - i1;)
            {
                PLA_AbsListView.e(a, (View)arraylist.remove(k), false);
                l++;
                k--;
            }

        }

    }

    public void a()
    {
        int j = 0;
        if (f == 1)
        {
            ArrayList arraylist = g;
            for (int l = arraylist.size(); j < l; j++)
            {
                ((View)arraylist.get(j)).forceLayout();
            }

        } else
        {
            int j1 = f;
            for (int k = 0; k < j1; k++)
            {
                ArrayList arraylist1 = e[k];
                int k1 = arraylist1.size();
                for (int i1 = 0; i1 < k1; i1++)
                {
                    ((View)arraylist1.get(i1)).forceLayout();
                }

            }

        }
    }

    public void a(int j)
    {
        if (j < 1)
        {
            throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
        }
        ArrayList aarraylist[] = new ArrayList[j];
        for (int k = 0; k < j; k++)
        {
            aarraylist[k] = new ArrayList();
        }

        f = j;
        g = aarraylist[0];
        e = aarraylist;
    }

    void a(int j, int k)
    {
        if (d.length < j)
        {
            d = new View[j];
        }
        c = k;
        View aview[] = d;
        for (k = 0; k < j; k++)
        {
            View view = a.getChildAt(k);
            PLA_AbsListView.LayoutParams layoutparams = (PLA_AbsListView.LayoutParams)view.getLayoutParams();
            if (layoutparams != null && layoutparams.a != -2)
            {
                aview[k] = view;
            }
        }

    }

    void a(View view)
    {
        PLA_AbsListView.LayoutParams layoutparams = (PLA_AbsListView.LayoutParams)view.getLayoutParams();
        if (layoutparams != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        j = layoutparams.a;
        if (b(j))
        {
            break; /* Loop/switch isn't completed */
        }
        if (j != -2)
        {
            PLA_AbsListView.c(a, view, false);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (f == 1)
        {
            PLA_AbsListView.a(a, view);
            g.add(view);
        } else
        {
            PLA_AbsListView.a(a, view);
            e[j].add(view);
        }
        if (b != null)
        {
            b.a(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void b()
    {
        if (f == 1)
        {
            ArrayList arraylist = g;
            int l = arraylist.size();
            for (int j = 0; j < l; j++)
            {
                PLA_AbsListView.a(a, (View)arraylist.remove(l - 1 - j), false);
            }

        } else
        {
            int j1 = f;
            for (int k = 0; k < j1; k++)
            {
                ArrayList arraylist1 = e[k];
                int k1 = arraylist1.size();
                for (int i1 = 0; i1 < k1; i1++)
                {
                    PLA_AbsListView.b(a, (View)arraylist1.remove(k1 - 1 - i1), false);
                }

            }

        }
    }

    public boolean b(int j)
    {
        return j >= 0;
    }

    View c(int j)
    {
        j -= c;
        View aview[] = d;
        if (j >= 0 && j < aview.length)
        {
            View view = aview[j];
            aview[j] = null;
            return view;
        } else
        {
            return null;
        }
    }

    void c()
    {
        View aview[] = d;
        ArrayList arraylist;
        boolean flag;
        boolean flag1;
        int j;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f > 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        arraylist = g;
        j = aview.length - 1;
        while (j >= 0) 
        {
            View view = aview[j];
            ArrayList arraylist1 = arraylist;
            if (view != null)
            {
                int k = ((PLA_AbsListView.LayoutParams)view.getLayoutParams()).a;
                aview[j] = null;
                if (!b(k))
                {
                    arraylist1 = arraylist;
                    if (k != -2)
                    {
                        PLA_AbsListView.d(a, view, false);
                        arraylist1 = arraylist;
                    }
                } else
                {
                    if (flag1)
                    {
                        arraylist = e[k];
                    }
                    PLA_AbsListView.a(a, view);
                    arraylist.add(view);
                    if (flag)
                    {
                        b.a(view);
                    }
                    arraylist1 = arraylist;
                }
            }
            j--;
            arraylist = arraylist1;
        }
        d();
    }

    View d(int j)
    {
        Object obj = null;
        View view;
        if (f == 1)
        {
            ArrayList arraylist = g;
            j = arraylist.size();
            view = obj;
            if (j > 0)
            {
                view = (View)arraylist.remove(j - 1);
            }
        } else
        {
            j = a.c.getItemViewType(j);
            view = obj;
            if (j >= 0)
            {
                view = obj;
                if (j < e.length)
                {
                    ArrayList arraylist1 = e[j];
                    j = arraylist1.size();
                    view = obj;
                    if (j > 0)
                    {
                        return (View)arraylist1.remove(j - 1);
                    }
                }
            }
        }
        return view;
    }

    void e(int j)
    {
        if (f == 1)
        {
            ArrayList arraylist = g;
            int j1 = arraylist.size();
            for (int k = 0; k < j1; k++)
            {
                ((View)arraylist.get(k)).setDrawingCacheBackgroundColor(j);
            }

        } else
        {
            int i2 = f;
            for (int l = 0; l < i2; l++)
            {
                ArrayList arraylist1 = e[l];
                int j2 = arraylist1.size();
                for (int k1 = 0; k1 < j2; k1++)
                {
                    ((View)arraylist1.get(l)).setDrawingCacheBackgroundColor(j);
                }

            }

        }
        View aview[] = d;
        int l1 = aview.length;
        for (int i1 = 0; i1 < l1; i1++)
        {
            View view = aview[i1];
            if (view != null)
            {
                view.setDrawingCacheBackgroundColor(j);
            }
        }

    }
}
