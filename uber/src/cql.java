// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import java.util.Collection;
import java.util.Iterator;

public abstract class cql extends gkw
    implements cre
{

    public static final cic a = new _cls1();
    Collection b;
    private cre c;
    private crf d;

    public cql()
    {
    }

    public final crf a()
    {
        crt.a();
        return b();
    }

    public final void a(String s)
    {
        PartnerFunnelActivity partnerfunnelactivity = c();
        if (partnerfunnelactivity != null)
        {
            partnerfunnelactivity.b(s);
        }
    }

    protected abstract crf b();

    public final PartnerFunnelActivity c()
    {
        return (PartnerFunnelActivity)getActivity();
    }

    public final void d()
    {
        PartnerFunnelActivity partnerfunnelactivity = c();
        if (partnerfunnelactivity != null)
        {
            partnerfunnelactivity.c();
        }
    }

    public void onCreate(Bundle bundle)
    {
        if (c == null)
        {
            crt.a();
            d = b();
            a(d);
        } else
        {
            d = c.a();
            c.a(d);
        }
        super.onCreate(bundle);
        for (bundle = b.iterator(); bundle.hasNext(); bundle.next()) { }
    }

    public void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public void onPause()
    {
        super.onPause();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public void onResume()
    {
        super.onResume();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
    }


    /* member class not found */
    class _cls1 {}

}
