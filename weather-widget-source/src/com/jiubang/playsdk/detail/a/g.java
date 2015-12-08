// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.jiubang.playsdk.d.a;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.playsdk.detail.a:
//            k, h, i, j

public class g extends BaseAdapter
{

    private Context a;
    private List b;
    private int c;
    private j d;

    public g(Context context, List list, int j)
    {
        a = context;
        b = list;
        c = j;
        a();
    }

    private int a(int j)
    {
        return 0x7f020271;
    }

    static j a(g g1)
    {
        return g1.d;
    }

    private void a(k k1, a a1)
    {
        k1.e.setText(0x7f0804f0);
        k1.e.setOnClickListener(new h(this, a1));
    }

    private void b(k k1, a a1)
    {
        k1.e.setText(0x7f0804ed);
        k1.e.setOnClickListener(new i(this, a1));
    }

    public void a()
    {
        if (b == null)
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            e e1 = (e)iterator.next();
            if (e1 != null && e1.f() != null)
            {
                String s = e1.f().c();
                if (com.jiubang.playsdk.f.a.a(a, s, null))
                {
                    arraylist.add(e1);
                    iterator.remove();
                }
            }
        } while (true);
        b.addAll(arraylist);
    }

    public void a(j j)
    {
        d = j;
    }

    public int getCount()
    {
        if (b != null)
        {
            return b.size();
        } else
        {
            return 0;
        }
    }

    public Object getItem(int j)
    {
        if (b != null)
        {
            return (e)b.get(j);
        } else
        {
            return null;
        }
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        Object obj;
label0:
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = View.inflate(a, 0x7f0300b2, null);
                viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
                view = new k(this, null);
                view.a = (ImageView)viewgroup.findViewById(0x7f0903ef);
                view.b = (TextView)viewgroup.findViewById(0x7f0903f0);
                view.c = (KPNetworkImageView)viewgroup.findViewById(0x7f0903ee);
                view.e = (Button)viewgroup.findViewById(0x7f0903f1);
                view.d = (KPNetworkImageView)viewgroup.findViewById(0x7f0903d3);
                viewgroup.findViewById(0x7f0903ed).getLayoutParams().width = c;
                viewgroup.setTag(view);
            }
            view = (k)viewgroup.getTag();
            obj = (e)getItem(j);
            if (obj != null)
            {
                ((k) (view)).b.setText(((e) (obj)).b());
                ((k) (view)).c.a(0x7f020263);
                ((k) (view)).c.a(((e) (obj)).a());
                obj = ((e) (obj)).f();
                if (obj != null)
                {
                    break label0;
                }
            }
            return viewgroup;
        }
        j = a(((a) (obj)).f());
        ((k) (view)).a.setBackgroundResource(j);
        String s = ((a) (obj)).c();
        if (com.jiubang.playsdk.f.a.a(a, s, null))
        {
            a(view, ((a) (obj)));
        } else
        {
            b(view, ((a) (obj)));
        }
        if (obj != null && !TextUtils.isEmpty(((a) (obj)).l()))
        {
            ((k) (view)).d.setVisibility(0);
            ((k) (view)).d.a(((a) (obj)).l());
            return viewgroup;
        } else
        {
            ((k) (view)).d.setVisibility(4);
            return viewgroup;
        }
    }
}
