// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.jiubang.playsdk.d.a;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import java.util.List;

// Referenced classes of package com.jiubang.playsdk.detail:
//            c, ThemePreviewLastItemView

class b extends BaseAdapter
{

    final ThemePreviewLastItemView a;
    private Context b;
    private List c;
    private int d;

    public b(ThemePreviewLastItemView themepreviewlastitemview, Context context, List list)
    {
        a = themepreviewlastitemview;
        super();
        b = context;
        c = list;
        d = b.getResources().getDimensionPixelOffset(0x7f0c004c);
    }

    public int getCount()
    {
        int i;
        if (c != null)
        {
            i = c.size();
        } else
        {
            i = 0;
        }
        if (i > 4)
        {
            return 4;
        } else
        {
            return i;
        }
    }

    public Object getItem(int i)
    {
        if (c != null)
        {
            return (e)c.get(i);
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
        viewgroup = view;
        if (view == null)
        {
            viewgroup = new KPNetworkImageView(b);
            viewgroup.setLayoutParams(new android.widget.LinearLayout.LayoutParams(d, d));
            view = new c(this, null);
            view.a = (KPNetworkImageView)viewgroup;
            viewgroup.setTag(view);
        }
        view = (c)viewgroup.getTag();
        Object obj = (e)getItem(i);
        if (obj != null && ((e) (obj)).f() != null)
        {
            obj = ((e) (obj)).f().e();
            ((c) (view)).a.a(0x7f020263);
            ((c) (view)).a.a(((String) (obj)));
        }
        return viewgroup;
    }
}
