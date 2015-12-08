// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.go.weatherex.framework.fragment.a;

public class z extends a
{

    public z()
    {
    }

    public Animation onCreateAnimation(int i, boolean flag, int j)
    {
        if (flag)
        {
            return AnimationUtils.loadAnimation(getActivity(), 0x7f04000b);
        } else
        {
            return AnimationUtils.loadAnimation(getActivity(), 0x7f04000d);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03007b, viewgroup, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view.setBackgroundColor(Color.argb(64, 0, 0, 0));
    }
}
