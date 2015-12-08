// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ad, af, ag, ae, 
//            o, s, aj

public abstract class j
    implements ad
{

    private ae a;
    private int b;
    protected Context c;
    protected Context d;
    protected o e;
    protected LayoutInflater f;
    protected LayoutInflater g;
    protected af h;
    private int i;
    private int j;

    public j(Context context, int k, int l)
    {
        c = context;
        f = LayoutInflater.from(context);
        b = k;
        i = l;
    }

    public af a(ViewGroup viewgroup)
    {
        if (h == null)
        {
            h = (af)f.inflate(b, viewgroup, false);
            h.a(e);
            c(true);
        }
        return h;
    }

    public View a(s s1, View view, ViewGroup viewgroup)
    {
        if (view instanceof ag)
        {
            view = (ag)view;
        } else
        {
            view = (ag)f.inflate(i, viewgroup, false);
        }
        a(s1, ((ag) (view)));
        return (View)view;
    }

    public void a(Context context, o o1)
    {
        d = context;
        g = LayoutInflater.from(d);
        e = o1;
    }

    public final void a(ae ae1)
    {
        a = ae1;
    }

    public void a(o o1, boolean flag)
    {
        if (a != null)
        {
            a.a(o1, flag);
        }
    }

    public abstract void a(s s1, ag ag1);

    public boolean a(aj aj)
    {
        if (a != null)
        {
            return a.b(aj);
        } else
        {
            return false;
        }
    }

    public boolean a(s s1)
    {
        return true;
    }

    protected boolean a(ViewGroup viewgroup, int k)
    {
        viewgroup.removeViewAt(k);
        return true;
    }

    public final void b(int k)
    {
        j = k;
    }

    public final boolean b(s s1)
    {
        return false;
    }

    public void c(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)h;
        if (viewgroup != null)
        {
            int l;
            if (e != null)
            {
                e.k();
                ArrayList arraylist = e.j();
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
                    s s1 = (s)arraylist.get(i1);
                    if (a(s1))
                    {
                        View view = viewgroup.getChildAt(k);
                        Object obj;
                        View view1;
                        if (view instanceof ag)
                        {
                            obj = ((ag)view).a();
                        } else
                        {
                            obj = null;
                        }
                        view1 = a(s1, view, viewgroup);
                        if (s1 != obj)
                        {
                            view1.setPressed(false);
                        }
                        if (view1 != view)
                        {
                            obj = (ViewGroup)view1.getParent();
                            if (obj != null)
                            {
                                ((ViewGroup) (obj)).removeView(view1);
                            }
                            ((ViewGroup)h).addView(view1, k);
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

    public final boolean c(s s1)
    {
        return false;
    }

    public boolean h()
    {
        return false;
    }
}
