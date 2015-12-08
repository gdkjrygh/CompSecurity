// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.maps.a.ae;
import com.google.android.gms.maps.a.cu;
import com.google.android.gms.maps.a.j;
import com.google.android.gms.maps.model.f;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, n, k

class m
    implements ae
{

    private final Fragment a;
    private final j b;

    public m(Fragment fragment, j j1)
    {
        b = (j)au.a(j1);
        a = (Fragment)au.a(fragment);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = b.a(com.google.android.gms.a.m.a(layoutinflater), com.google.android.gms.a.m.a(viewgroup), bundle);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new f(layoutinflater);
        }
        return (View)com.google.android.gms.a.m.a(layoutinflater);
    }

    public void a()
    {
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
        try
        {
            b.a(com.google.android.gms.a.m.a(activity), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new f(activity);
        }
    }

    public void a(Bundle bundle)
    {
        Bundle bundle1;
        bundle1 = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        bundle1 = new Bundle();
        bundle = a.getArguments();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (bundle.containsKey("MapOptions"))
        {
            cu.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
        }
        b.a(bundle1);
        return;
        bundle;
        throw new f(bundle);
    }

    public void a(k k)
    {
        try
        {
            b.a(new n(this, k));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (k k)
        {
            throw new f(k);
        }
    }

    public void b()
    {
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public void b(Bundle bundle)
    {
        try
        {
            b.b(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new f(bundle);
        }
    }

    public void c()
    {
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public void d()
    {
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public void e()
    {
        try
        {
            b.f();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public j f()
    {
        return b;
    }
}
