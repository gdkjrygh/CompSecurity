// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.a.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.a.a.a;

// Referenced classes of package com.jiubang.a.a:
//            a

public abstract class d extends com.jiubang.a.a.a
{

    public d(BaseAdapter baseadapter)
    {
        super(baseadapter);
    }

    public a[] a(ViewGroup viewgroup, View view)
    {
        return (new a[] {
            b(viewgroup, view)
        });
    }

    protected abstract a b(ViewGroup viewgroup, View view);
}
