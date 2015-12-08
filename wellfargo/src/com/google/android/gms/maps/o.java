// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.a.b;
import com.google.android.gms.a.m;
import com.google.android.gms.a.n;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.a.aj;
import com.google.android.gms.maps.a.cv;
import com.google.android.gms.maps.model.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            j, m, k

class o extends b
{

    protected n a;
    private final Fragment b;
    private Activity c;
    private final List d = new ArrayList();

    o(Fragment fragment)
    {
        b = fragment;
    }

    private void a(Activity activity)
    {
        c = activity;
        g();
    }

    static void a(o o1, Activity activity)
    {
        o1.a(activity);
    }

    protected void a(n n1)
    {
        a = n1;
        g();
    }

    public void g()
    {
        if (c == null || a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        com.google.android.gms.maps.a.j j1;
        j.a(c);
        j1 = cv.a(c).b(m.a(c));
        if (j1 == null)
        {
            return;
        }
        RemoteException remoteexception;
        a.a(new com.google.android.gms.maps.m(b, j1));
        k k1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((com.google.android.gms.maps.m)a()).a(k1))
        {
            k1 = (k)iterator.next();
        }

        try
        {
            d.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
        catch (c c1) { }
    }
}
