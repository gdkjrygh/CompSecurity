// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, ae

public class LoadingFragment extends PaneFragment
{

    public LoadingFragment()
    {
    }

    public final PaneDescriptor E()
    {
        return null;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.bh, viewgroup, false);
        viewgroup = layoutinflater.findViewById(j.dU);
        viewgroup.postDelayed(new ae(this, viewgroup), 1000L);
        return layoutinflater;
    }
}
