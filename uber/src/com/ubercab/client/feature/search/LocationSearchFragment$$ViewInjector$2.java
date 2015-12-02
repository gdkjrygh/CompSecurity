// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchFragment

final class a
    implements android.view.ment..ViewInjector._cls2
{

    final LocationSearchFragment a;
    final ocations b;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.onTouchListViewLocations();
    }

    ( , LocationSearchFragment locationsearchfragment)
    {
        b = ;
        a = locationsearchfragment;
        super();
    }
}
