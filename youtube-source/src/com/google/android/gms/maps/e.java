// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.internal.gi;
import com.google.android.gms.maps.a.m;
import com.google.android.gms.maps.model.RuntimeRemoteException;

final class e
    implements a
{

    private final ViewGroup a;
    private final m b;
    private View c;

    public e(ViewGroup viewgroup, m m1)
    {
        b = (m)gi.a(m1);
        a = (ViewGroup)gi.a(viewgroup);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    public final void a()
    {
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    public final void a(Bundle bundle)
    {
        try
        {
            b.a(bundle);
            c = (View)n.a(b.f());
            a.removeAllViews();
            a.addView(c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeRemoteException(bundle);
        }
    }

    public final void b()
    {
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void b(Bundle bundle)
    {
        try
        {
            b.b(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeRemoteException(bundle);
        }
    }

    public final void c()
    {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    public final void d()
    {
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void e()
    {
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
