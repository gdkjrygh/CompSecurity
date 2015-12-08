// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package com.jiubang.pla.a:
//            a, c

public class b extends a
{

    public b(LayoutInflater layoutinflater, c c1)
    {
        super(layoutinflater, c1);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = a.get(i);
        viewgroup = view;
        if (view == null)
        {
            viewgroup = c.a(b, obj);
        }
        c.a(viewgroup, i, obj);
        return viewgroup;
    }
}
