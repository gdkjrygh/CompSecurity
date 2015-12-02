// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import axw;
import ayb;
import ayw;
import wn;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class Marker
{

    private final ayw a;

    public Marker(ayw ayw1)
    {
        a = (ayw)wn.a(ayw1);
    }

    public final void a()
    {
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void b()
    {
        try
        {
            a.g();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void c()
    {
        try
        {
            a.h();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof Marker))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((Marker)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ayb(((RemoteException) (obj)));
        }
        return flag;
    }

    public final float getAlpha()
    {
        float f;
        try
        {
            f = a.n();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return f;
    }

    public final String getId()
    {
        String s;
        try
        {
            s = a.b();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return s;
    }

    public final LatLng getPosition()
    {
        LatLng latlng;
        try
        {
            latlng = a.c();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return latlng;
    }

    public final float getRotation()
    {
        float f;
        try
        {
            f = a.m();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return f;
    }

    public final String getSnippet()
    {
        String s;
        try
        {
            s = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return s;
    }

    public final String getTitle()
    {
        String s;
        try
        {
            s = a.d();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return s;
    }

    public final int hashCode()
    {
        int i;
        try
        {
            i = a.k();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return i;
    }

    public final void setAlpha(float f)
    {
        try
        {
            a.b(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void setDraggable(boolean flag)
    {
        try
        {
            a.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void setFlat(boolean flag)
    {
        try
        {
            a.c(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void setIcon(axw axw1)
    {
        try
        {
            a.a(axw1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (axw axw1)
        {
            throw new ayb(axw1);
        }
    }

    public final void setInfoWindowAnchor$2548a35(float f)
    {
        try
        {
            a.b(0.5F, f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void setPosition(LatLng latlng)
    {
        try
        {
            a.a(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new ayb(latlng);
        }
    }

    public final void setRotation(float f)
    {
        try
        {
            a.a(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void setSnippet(String s)
    {
        try
        {
            a.b(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ayb(s);
        }
    }

    public final void setTitle(String s)
    {
        try
        {
            a.a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ayb(s);
        }
    }

    public final void setVisible(boolean flag)
    {
        try
        {
            a.b(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }
}
