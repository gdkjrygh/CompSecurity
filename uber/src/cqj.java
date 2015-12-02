// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.os.Bundle;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import java.util.Collection;
import java.util.Iterator;

public abstract class cqj extends gkv
    implements cre
{

    public static final cic a = new _cls1();
    Collection b;
    private crf c;
    private cre d;

    public cqj()
    {
    }

    private PartnerFunnelActivity b()
    {
        return (PartnerFunnelActivity)getActivity();
    }

    public final void a(int i)
    {
        PartnerFunnelActivity partnerfunnelactivity = b();
        if (partnerfunnelactivity != null)
        {
            Bundle bundle = getArguments();
            if (bundle != null)
            {
                partnerfunnelactivity.a(bundle.getInt("dialog.request_code"), i, bundle);
            }
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        for (dialoginterface = b.iterator(); dialoginterface.hasNext(); ((cqw)dialoginterface.next()).a()) { }
    }

    public void onCreate(Bundle bundle)
    {
        if (d == null)
        {
            c = a();
            a(c);
        } else
        {
            c = d.a();
            d.a(c);
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
