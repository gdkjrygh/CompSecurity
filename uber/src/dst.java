// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public final class dst
    implements Filterable, WrapperListAdapter
{

    ArrayList a;
    ArrayList b;
    boolean c;
    private final DataSetObservable d = new DataSetObservable();
    private final ListAdapter e;
    private int f;
    private final boolean g;

    public dst(ArrayList arraylist, ArrayList arraylist1, ListAdapter listadapter)
    {
        f = 1;
        e = listadapter;
        g = listadapter instanceof Filterable;
        if (arraylist == null)
        {
            throw new IllegalArgumentException("headerViewInfos cannot be null");
        }
        a = arraylist;
        if (arraylist1 == null)
        {
            throw new IllegalArgumentException("footerViewInfos cannot be null");
        } else
        {
            b = arraylist1;
            c();
            return;
        }
    }

    private static boolean a(ArrayList arraylist)
    {
label0:
        {
            if (arraylist == null)
            {
                break label0;
            }
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break label0;
                }
            } while (((dsr)arraylist.next()).d);
            return false;
        }
        return true;
    }

    private int b()
    {
        int i;
        if (e() != 0)
        {
            if ((i = e.getCount() % f) != 0)
            {
                return f - i;
            }
        }
        return 0;
    }

    private int b(int i)
    {
        View view = e.getView(i, null, null);
        view.measure(0, 0);
        return android.view.View.MeasureSpec.getSize(view.getMeasuredHeight());
    }

    private void c()
    {
        boolean flag;
        if (a(a) && a(b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    private int d()
    {
        return a.size();
    }

    private int e()
    {
        return b.size();
    }

    public final void a()
    {
        d.notifyChanged();
    }

    public final void a(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("Number of columns must be 1 or more");
        }
        if (f != i)
        {
            f = i;
            a();
        }
    }

    public final boolean a(View view)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < a.size())
                {
                    if (((dsr)a.get(i)).a != view)
                    {
                        break label0;
                    }
                    a.remove(i);
                    c();
                    d.notifyChanged();
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public final boolean areAllItemsEnabled()
    {
        return e == null || c && e.areAllItemsEnabled();
    }

    public final boolean b(View view)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < b.size())
                {
                    if (((dsr)b.get(i)).a != view)
                    {
                        break label0;
                    }
                    b.remove(i);
                    c();
                    d.notifyChanged();
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public final int getCount()
    {
        int j = d() * f + e() * f;
        int i = j;
        if (e != null)
        {
            i = j + (e.getCount() + b());
        }
        return i;
    }

    public final Filter getFilter()
    {
        if (g)
        {
            return ((Filterable)e).getFilter();
        } else
        {
            return null;
        }
    }

    public final Object getItem(int i)
    {
        int j = d() * f;
        if (i < j)
        {
            if (i % f == 0)
            {
                return ((dsr)a.get(i / f)).c;
            } else
            {
                return null;
            }
        }
        int l = i - j;
        j = 0;
        if (e != null)
        {
            int k = e.getCount();
            j = k;
            if (l < k)
            {
                return e.getItem(l);
            }
        }
        j = l - j - b();
        if (b.size() > j)
        {
            return ((dsr)b.get(j)).c;
        } else
        {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public final long getItemId(int i)
    {
        int j = d() * f;
        if (e != null && i >= j)
        {
            i -= j;
            if (i < e.getCount())
            {
                return e.getItemId(i);
            }
        }
        return -1L;
    }

    public final int getItemViewType(int i)
    {
        int j = d() * f;
        if (i < j && i % f != 0)
        {
            if (e != null)
            {
                return e.getViewTypeCount();
            } else
            {
                return 1;
            }
        }
        if (e != null && i >= j)
        {
            i -= j;
            if (i < e.getCount())
            {
                return e.getItemViewType(i);
            }
        }
        return -2;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = d() * f;
        if (i < j)
        {
            ViewGroup viewgroup1 = ((dsr)a.get(i / f)).b;
            if (i % f == 0)
            {
                return viewgroup1;
            }
            View view1 = view;
            if (view == null)
            {
                view1 = new View(viewgroup.getContext());
            }
            view1.setVisibility(4);
            view1.setMinimumHeight(viewgroup1.getHeight());
            return view1;
        }
        int l = i - j;
        j = 0;
        if (e != null)
        {
            int k = e.getCount();
            j = k;
            if (l < k)
            {
                return e.getView(l, view, viewgroup);
            }
        }
        j = l - j - b();
        if (j < 0)
        {
            view = new View(viewgroup.getContext());
            view.setVisibility(4);
            view.setMinimumHeight(b(l + j));
            return view;
        }
        if (b.size() > j / f)
        {
            ViewGroup viewgroup2 = ((dsr)b.get(j / f)).b;
            if (j % f == 0)
            {
                return viewgroup2;
            }
            View view2 = view;
            if (view == null)
            {
                view2 = new View(viewgroup.getContext());
            }
            view2.setVisibility(4);
            view2.setMinimumHeight(viewgroup2.getHeight());
            return view2;
        } else
        {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public final int getViewTypeCount()
    {
        if (e != null)
        {
            return e.getViewTypeCount() + 1;
        } else
        {
            return 2;
        }
    }

    public final ListAdapter getWrappedAdapter()
    {
        return e;
    }

    public final boolean hasStableIds()
    {
        return e != null && e.hasStableIds();
    }

    public final boolean isEmpty()
    {
        return (e == null || e.isEmpty()) && d() == 0;
    }

    public final boolean isEnabled(int i)
    {
        boolean flag1 = false;
        int j = d() * f;
        if (i < j)
        {
            boolean flag = flag1;
            if (i % f == 0)
            {
                flag = flag1;
                if (((dsr)a.get(i / f)).d)
                {
                    flag = true;
                }
            }
            return flag;
        }
        int l = i - j;
        if (e != null)
        {
            int k = e.getCount();
            j = k;
            if (l < k)
            {
                return e.isEnabled(l);
            }
        } else
        {
            j = 0;
        }
        j = l - j - b();
        if (b.size() > j)
        {
            return ((dsr)b.get(j)).d;
        } else
        {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        d.registerObserver(datasetobserver);
        if (e != null)
        {
            e.registerDataSetObserver(datasetobserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        d.unregisterObserver(datasetobserver);
        if (e != null)
        {
            e.unregisterDataSetObserver(datasetobserver);
        }
    }
}
