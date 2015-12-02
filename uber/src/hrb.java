// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class hrb extends BaseAdapter
{

    private final Context a;
    private final int b;
    private int c;
    private int d;

    public hrb(Context context, int i)
    {
        c = -1;
        a = context;
        b = i;
        switch (_cls1.a[b - 1])
        {
        default:
            throw new RuntimeException("Unknown list type.");

        case 1: // '\001'
            d = context.getResources().getDimensionPixelSize(hqx.ub__padding_top_list_header);
            return;

        case 2: // '\002'
            d = context.getResources().getDimensionPixelSize(hqx.ub__padding_top_list_header_contained);
            break;
        }
    }

    private int a(int i)
    {
        if (i == 0 && getCount() == 1)
        {
            return hqy.ub__container;
        }
        if (i == 0)
        {
            return hqy.ub__list_container_top;
        }
        if (i == getCount() - 1)
        {
            return hqy.ub__container_bottom;
        } else
        {
            return hqy.ub__list_container_middle;
        }
    }

    private static int b(int i)
    {
        return i;
    }

    public abstract int a();

    public abstract View a(int i, View view, ViewGroup viewgroup);

    public final int getCount()
    {
        return a() + 0;
    }

    public final int getItemViewType(int i)
    {
        if (c <= 0)
        {
            throw new RuntimeException("getItemType must return a value between 0 and getItemTypeCount() - 1");
        } else
        {
            return 0;
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        i = b(i);
        view = a(i, view, viewgroup);
        if (b == hrc.b)
        {
            view.setBackgroundResource(a(i));
        }
        return view;
    }

    public final int getViewTypeCount()
    {
        c = 1;
        return c;
    }

    /* member class not found */
    class _cls1 {}

}
