// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.city;

import android.widget.HorizontalScrollView;

// Referenced classes of package com.go.weatherex.city:
//            EditCityScrollComponent

class f
    implements Runnable
{

    final int a;
    final EditCityScrollComponent b;

    f(EditCityScrollComponent editcityscrollcomponent, int i)
    {
        b = editcityscrollcomponent;
        a = i;
        super();
    }

    public void run()
    {
        EditCityScrollComponent.a(b).smoothScrollTo(a, 0);
    }
}
