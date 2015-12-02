// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import aad;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ath;
import atp;
import atq;
import ats;
import aul;
import ayb;
import wn;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class MapView extends FrameLayout
{

    private final atq a;
    private ath b;

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new atq(this, context, GoogleMapOptions.a(context, attributeset));
        f();
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new atq(this, context, GoogleMapOptions.a(context, attributeset));
        f();
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        a = new atq(this, context, googlemapoptions);
        f();
    }

    private void f()
    {
        setClickable(true);
    }

    public final ath a()
    {
        if (b != null)
        {
            return b;
        }
        a.f();
        if (a.a() == null)
        {
            return null;
        }
        try
        {
            b = new ath(((atp)a.a()).e().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return b;
    }

    public final void a(Bundle bundle)
    {
        a.a(bundle);
        if (a.a() == null)
        {
            aad.a(this);
        }
    }

    public final void a(ats ats)
    {
        wn.b("getMapAsync() must be called on the main thread");
        a.a(ats);
    }

    public final void b()
    {
        a.b();
    }

    public final void b(Bundle bundle)
    {
        a.b(bundle);
    }

    public final void c()
    {
        a.c();
    }

    public final void d()
    {
        a.d();
    }

    public final void e()
    {
        a.e();
    }
}
