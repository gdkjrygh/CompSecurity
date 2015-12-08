// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.c;

// Referenced classes of package com.google.android.gms.internal:
//            as, af, ac, dn, 
//            g, do, kb, c

public final class m
{

    private final as a;
    private a b;
    private g c;
    private c d[];
    private String e;
    private ViewGroup f;
    private com.google.android.gms.ads.doubleclick.a g;

    public m(ViewGroup viewgroup)
    {
        a = new as();
        f = viewgroup;
    }

    public m(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        a = new as();
        f = viewgroup;
        android.content.Context context = viewgroup.getContext();
        try
        {
            attributeset = new af(context, attributeset);
            d = attributeset.a(flag);
            e = attributeset.a();
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            com.google.android.gms.internal.dn.a(viewgroup, new ac(context, c.a), attributeset.getMessage(), attributeset.getMessage());
            return;
        }
        if (viewgroup.isInEditMode())
        {
            com.google.android.gms.internal.dn.a(viewgroup, new ac(context, d[0]), "Ads by Google");
        }
    }

    public final c a()
    {
        c c1;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        c1 = c.a().P();
        return c1;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.do.a("Failed to get the current AdSize.", remoteexception);
        if (d != null)
        {
            return d[0];
        } else
        {
            return null;
        }
    }

    public final void a(a a1)
    {
        try
        {
            b = a1;
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            g g1 = c;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            com.google.android.gms.internal.do.a("Failed to set the AdListener.", a1);
            return;
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        new kb(a1);
    }

    public final void a(com.google.android.gms.ads.doubleclick.a a1)
    {
        try
        {
            g = a1;
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            g g1 = c;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.ads.doubleclick.a a1)
        {
            com.google.android.gms.internal.do.a("Failed to set the AppEventListener.", a1);
            return;
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        new com.google.android.gms.internal.c(a1);
    }

    public final void a(String s)
    {
        if (e != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            e = s;
            return;
        }
    }

    public final transient void a(c ac1[])
    {
        if (d != null)
        {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        } else
        {
            b(ac1);
            return;
        }
    }

    public final transient void b(c ac1[])
    {
        d = ac1;
        try
        {
            if (c != null)
            {
                ac1 = c;
                new ac(f.getContext(), d);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c ac1[])
        {
            com.google.android.gms.internal.do.a("Failed to set the ad size.", ac1);
        }
        f.requestLayout();
    }
}
