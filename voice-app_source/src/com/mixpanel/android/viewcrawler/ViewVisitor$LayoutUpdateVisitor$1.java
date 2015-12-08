// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewVisitor

class this._cls1
    implements Comparator
{

    final compare this$1;

    public int compare(View view, View view1)
    {
        if (view == view1)
        {
            return 0;
        }
        if (view == null)
        {
            return -1;
        }
        if (view1 == null)
        {
            return 1;
        } else
        {
            return view1.hashCode() - view.hashCode();
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((View)obj, (View)obj1);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
