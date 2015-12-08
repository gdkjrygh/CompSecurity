// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

// Referenced classes of package com.go.weatherex.d:
//            g, a, k, f

class e extends BaseAdapter
{

    final a a;
    private g b[];
    private RadioButton c;

    public e(a a1, g ag[])
    {
        a = a1;
        super();
        c = null;
        b = ag;
    }

    static RadioButton a(e e1)
    {
        return e1.c;
    }

    static RadioButton a(e e1, RadioButton radiobutton)
    {
        e1.c = radiobutton;
        return radiobutton;
    }

    public void a()
    {
        int j = getCount();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (!b[i].f)
                    {
                        break label0;
                    }
                    b[i].f = false;
                }
                return;
            }
            i++;
        } while (true);
    }

    public void a(g g1)
    {
        a();
        g1.f = true;
        com.go.weatherex.d.a.j(a).setText(g1.a());
        com.go.weatherex.d.a.a(a, g1.a);
        com.go.weatherex.d.a.a(a, g1.e);
    }

    public g b()
    {
        Object obj = null;
        int j = getCount();
        int i = 0;
        do
        {
label0:
            {
                g g1 = obj;
                if (i < j)
                {
                    if (!b[i].f)
                    {
                        break label0;
                    }
                    g1 = b[i];
                }
                return g1;
            }
            i++;
        } while (true);
    }

    public int getCount()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.length;
        }
    }

    public Object getItem(int i)
    {
        if (b != null && b.length > i)
        {
            return b[i];
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        g g1;
        if (view == null)
        {
            viewgroup = new k(a);
            view = ((k) (viewgroup)).c;
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (k)view.getTag();
        }
        g1 = b[i];
        ((k) (viewgroup)).b.setText(g1.a());
        ((k) (viewgroup)).a.setId(i);
        if (g1.f)
        {
            c = ((k) (viewgroup)).a;
            ((k) (viewgroup)).a.setChecked(true);
        } else
        {
            ((k) (viewgroup)).a.setChecked(false);
        }
        ((k) (viewgroup)).c.setOnClickListener(new f(this, g1, viewgroup));
        return view;
    }
}
