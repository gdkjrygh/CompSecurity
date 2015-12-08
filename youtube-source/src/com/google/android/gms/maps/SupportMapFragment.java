// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.maps:
//            i, GoogleMapOptions

public class SupportMapFragment extends Fragment
{

    private final i a = new i(this);

    public SupportMapFragment()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return a.a(layoutinflater, viewgroup, bundle);
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        i.a(a, activity);
    }

    public final void a(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.a(activity, attributeset, bundle);
        i.a(a, activity);
        attributeset = GoogleMapOptions.createFromAttributes(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        a.a(activity, bundle1, bundle);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a.a(bundle);
    }

    public final void d(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.d(bundle);
    }

    public final void e(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.e(bundle);
        a.b(bundle);
    }

    public final void f()
    {
        a.d();
        super.f();
    }

    public final void g(Bundle bundle)
    {
        super.g(bundle);
    }

    public void onLowMemory()
    {
        a.f();
        super.onLowMemory();
    }

    public final void r()
    {
        super.r();
        a.b();
    }

    public final void s()
    {
        a.c();
        super.s();
    }

    public final void t()
    {
        a.e();
        super.t();
    }
}
