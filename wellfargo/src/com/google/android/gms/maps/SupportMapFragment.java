// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.a.j;
import com.google.android.gms.maps.model.f;

// Referenced classes of package com.google.android.gms.maps:
//            o, m, c, GoogleMapOptions

public class SupportMapFragment extends Fragment
{

    private final o a = new o(this);
    private c b;

    public SupportMapFragment()
    {
    }

    protected j a()
    {
        a.g();
        if (a.a() == null)
        {
            return null;
        } else
        {
            return ((m)a.a()).f();
        }
    }

    public final c b()
    {
        Object obj = a();
        if (obj != null)
        {
            try
            {
                obj = ((j) (obj)).a();
            }
            catch (RemoteException remoteexception)
            {
                throw new f(remoteexception);
            }
            if (obj != null)
            {
                if (b == null || b.a().asBinder() != ((d) (obj)).asBinder())
                {
                    b = new c(((d) (obj)));
                }
                return b;
            }
        }
        return null;
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        o.a(a, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a.a(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = a.a(layoutinflater, viewgroup, bundle);
        layoutinflater.setClickable(true);
        return layoutinflater;
    }

    public void onDestroy()
    {
        a.e();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        a.d();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        o.a(a, activity);
        attributeset = GoogleMapOptions.a(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        a.a(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        a.f();
        super.onLowMemory();
    }

    public void onPause()
    {
        a.c();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        a.b();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        a.b(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }
}
