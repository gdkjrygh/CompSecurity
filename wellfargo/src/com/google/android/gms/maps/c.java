// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.f;

// Referenced classes of package com.google.android.gms.maps:
//            a, f, e, d, 
//            l, g, h, i

public final class c
{

    private final d a;

    protected c(d d1)
    {
        a = (d)au.a(d1);
    }

    d a()
    {
        return a;
    }

    public final e a(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = a.a(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch (MarkerOptions markeroptions)
        {
            throw new f(markeroptions);
        }
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        markeroptions = new e(markeroptions);
        return markeroptions;
        return null;
    }

    public final void a(a a1)
    {
        try
        {
            a.b(a1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new f(a1);
        }
    }

    public final void a(g g)
    {
        if (g == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (g g)
            {
                throw new f(g);
            }
        }
        a.a(new com.google.android.gms.maps.f(this, g));
        return;
    }

    public final void a(h h)
    {
        if (h == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (h h)
            {
                throw new f(h);
            }
        }
        a.a(new com.google.android.gms.maps.e(this, h));
        return;
    }

    public final void a(i i)
    {
        if (i == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (i i)
            {
                throw new f(i);
            }
        }
        a.a(new com.google.android.gms.maps.d(this, i));
        return;
    }

    public final CameraPosition b()
    {
        CameraPosition cameraposition;
        try
        {
            cameraposition = a.a();
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
        return cameraposition;
    }

    public final void c()
    {
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public final l d()
    {
        l l1;
        try
        {
            l1 = new l(a.l());
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
        return l1;
    }
}
