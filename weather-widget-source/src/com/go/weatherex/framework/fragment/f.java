// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.framework.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.go.weatherex.framework.fragment:
//            a

public class f
{

    a a;

    public f(a a1)
    {
        a = a1;
    }

    private LayoutInflater a()
    {
        if (a.getActivity() == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(a).append(" not attached to Activity").toString());
        } else
        {
            return a.getActivity().getLayoutInflater();
        }
    }

    public View a(int i, ViewGroup viewgroup)
    {
        viewgroup = a().inflate(i, viewgroup);
        a.a(viewgroup);
        return viewgroup;
    }

    public View a(int i, ViewGroup viewgroup, boolean flag)
    {
        viewgroup = a().inflate(i, viewgroup, flag);
        a.a(viewgroup);
        return viewgroup;
    }
}
