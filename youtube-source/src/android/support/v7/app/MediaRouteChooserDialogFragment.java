// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.media.s;

// Referenced classes of package android.support.v7.app:
//            q

public class MediaRouteChooserDialogFragment extends DialogFragment
{

    private final String Y = "selector";
    private s Z;

    public MediaRouteChooserDialogFragment()
    {
        a(true);
    }

    private void E()
    {
        if (Z == null)
        {
            Bundle bundle = h();
            if (bundle != null)
            {
                Z = s.a(bundle.getBundle("selector"));
            }
            if (Z == null)
            {
                Z = s.a;
            }
        }
    }

    public final void a(s s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        E();
        if (!Z.equals(s1))
        {
            Z = s1;
            Bundle bundle = h();
            Object obj = bundle;
            if (bundle == null)
            {
                obj = new Bundle();
            }
            ((Bundle) (obj)).putBundle("selector", s1.d());
            g(((Bundle) (obj)));
            obj = (q)b();
            if (obj != null)
            {
                ((q) (obj)).a(s1);
            }
        }
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new q(i());
        E();
        bundle.a(Z);
        return bundle;
    }
}
