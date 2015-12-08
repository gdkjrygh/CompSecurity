// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            x, z, aa, y, 
//            i, m, ad

public abstract class d
    implements x
{

    protected Context a;
    protected Context b;
    protected i c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    protected z f;
    private y g;
    private int h;
    private int i;
    private int j;

    public d(Context context, int k, int l)
    {
        a = context;
        d = LayoutInflater.from(context);
        h = k;
        i = l;
    }

    public y a()
    {
        return g;
    }

    public z a(ViewGroup viewgroup)
    {
        if (f == null)
        {
            f = (z)d.inflate(h, viewgroup, false);
            f.a(c);
            a(true);
        }
        return f;
    }

    public View a(m m1, View view, ViewGroup viewgroup)
    {
        if (view instanceof aa)
        {
            view = (aa)view;
        } else
        {
            view = b(viewgroup);
        }
        a(m1, ((aa) (view)));
        return (View)view;
    }

    public void a(int k)
    {
        j = k;
    }

    public void a(Context context, i k)
    {
        b = context;
        e = LayoutInflater.from(b);
        c = k;
    }

    public void a(i k, boolean flag)
    {
        if (g != null)
        {
            g.a(k, flag);
        }
    }

    public abstract void a(m m1, aa aa1);

    public void a(y y1)
    {
        g = y1;
    }

    protected void a(View view, int k)
    {
        ViewGroup viewgroup = (ViewGroup)view.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(view);
        }
        ((ViewGroup)f).addView(view, k);
    }

    public void a(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)f;
        if (viewgroup != null)
        {
            int l;
            if (c != null)
            {
                c.j();
                ArrayList arraylist = c.i();
                int j1 = arraylist.size();
                int i1 = 0;
                int k = 0;
                do
                {
                    l = k;
                    if (i1 >= j1)
                    {
                        break;
                    }
                    m m2 = (m)arraylist.get(i1);
                    if (a(k, m2))
                    {
                        View view = viewgroup.getChildAt(k);
                        m m1;
                        View view1;
                        if (view instanceof aa)
                        {
                            m1 = ((aa)view).getItemData();
                        } else
                        {
                            m1 = null;
                        }
                        view1 = a(m2, view, viewgroup);
                        if (m2 != m1)
                        {
                            view1.setPressed(false);
                            ViewCompat.jumpDrawablesToCurrentState(view1);
                        }
                        if (view1 != view)
                        {
                            a(view1, k);
                        }
                        k++;
                    }
                    i1++;
                } while (true);
            } else
            {
                l = 0;
            }
            while (l < viewgroup.getChildCount()) 
            {
                if (!a(viewgroup, l))
                {
                    l++;
                }
            }
        }
    }

    public boolean a(int k, m m1)
    {
        return true;
    }

    public boolean a(ad ad)
    {
        if (g != null)
        {
            return g.a(ad);
        } else
        {
            return false;
        }
    }

    public boolean a(i k, m m1)
    {
        return false;
    }

    protected boolean a(ViewGroup viewgroup, int k)
    {
        viewgroup.removeViewAt(k);
        return true;
    }

    public aa b(ViewGroup viewgroup)
    {
        return (aa)d.inflate(i, viewgroup, false);
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(i k, m m1)
    {
        return false;
    }
}
