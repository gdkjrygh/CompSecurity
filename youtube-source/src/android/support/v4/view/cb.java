// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

final class cb
    implements Comparator
{

    cb()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        obj = (ViewPager.LayoutParams)((View) (obj)).getLayoutParams();
        obj1 = (ViewPager.LayoutParams)((View) (obj1)).getLayoutParams();
        if (((ViewPager.LayoutParams) (obj)).a != ((ViewPager.LayoutParams) (obj1)).a)
        {
            return !((ViewPager.LayoutParams) (obj)).a ? -1 : 1;
        } else
        {
            return ((ViewPager.LayoutParams) (obj)).e - ((ViewPager.LayoutParams) (obj1)).e;
        }
    }
}
