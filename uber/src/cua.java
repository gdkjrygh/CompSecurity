// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import com.ubercab.android.location.UberLocation;

public abstract class cua extends cql
    implements ciw
{

    private cis c;

    public cua()
    {
    }

    private cis e()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity instanceof cub)
        {
            return ((cub)fragmentactivity).k();
        } else
        {
            return null;
        }
    }

    protected final String k()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity instanceof cub)
        {
            return ((cub)fragmentactivity).j();
        } else
        {
            return null;
        }
    }

    protected final UberLocation l()
    {
        if (c != null)
        {
            return c.a();
        } else
        {
            return null;
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (c != null)
        {
            c.b(this);
            c = null;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c = e();
        if (c != null)
        {
            c.a(this);
        }
    }
}
