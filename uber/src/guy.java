// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.ui.EditText;

public class guy extends gsr
{

    public static final String a = guy.getSimpleName();
    chp b;
    private EditText c;
    private gva d;

    public guy()
    {
    }

    static void a(guy guy1)
    {
        guy1.d();
    }

    private void a(guz guz1)
    {
        guz1.a(this);
    }

    public static guy b()
    {
        return new guy();
    }

    static void b(guy guy1)
    {
        guy1.e();
    }

    private guz c()
    {
        return gwk.a().a(gss.a(getActivity().getApplication())).a();
    }

    private void d()
    {
        b.a(f.j);
        dismiss();
    }

    private void e()
    {
        String s = c.getText().toString();
        if (s == null || s.isEmpty())
        {
            c.setError(getString(gsg.ub__payment_add_custom_amount_error));
            return;
        }
        double d1 = cxb.a(s, 0.0D);
        if (d1 < 0.0001D)
        {
            c.setError(getString(gsg.ub__payment_add_custom_amount_error));
            return;
        }
        b.a(AnalyticsEvent.create("tap").setName(f.i).setCustomValues(gkg.a("amount", Double.valueOf(d1))));
        if (d != null)
        {
            d.b(d1);
        }
        dismiss();
    }

    protected final Object a()
    {
        return c();
    }

    protected final volatile void a(Object obj)
    {
        a((guz)obj);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d = (gva)activity;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(gse.ub__payment_dialog_fragment_airtel_custom_amount_dialog, viewgroup, false);
        c = (EditText)layoutinflater.findViewById(gsd.ub__payment_airtel_custom_amount_input);
        layoutinflater.findViewById(gsd.ub__payment_airtel_custom_amount_button_cancel).setOnClickListener(new _cls1());
        layoutinflater.findViewById(gsd.ub__payment_airtel_custom_amount_button_ok).setOnClickListener(new _cls2());
        return layoutinflater;
    }

    public void onDetach()
    {
        super.onDetach();
        d = null;
    }

    public void onResume()
    {
        super.onResume();
        b.a(e.m);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = getDialog();
        if (view != null)
        {
            view.requestWindowFeature(1);
        }
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
