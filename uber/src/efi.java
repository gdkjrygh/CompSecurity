// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class efi extends PagerAdapter
{

    private final List a;

    public efi(List list)
    {
        a = list;
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = (View)a.get(i);
        viewgroup.addView(view, new android.view.ViewGroup.LayoutParams(-1, -2));
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
