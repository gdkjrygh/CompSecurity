// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.payment.internal.ui.SecurityCodeEditText;
import com.ubercab.ui.TextView;

public final class gvc extends gsr
    implements android.view.View.OnClickListener, gth
{

    public static final String a = gvc.getSimpleName();
    chp b;
    private String c;
    private String d;
    private SecurityCodeEditText e;
    private gve f;
    private TextView g;

    public gvc()
    {
    }

    public static gvc a(String s, String s1)
    {
        gvc gvc1 = new gvc();
        Bundle bundle = new Bundle();
        bundle.putString("card_first_digits", s);
        bundle.putString("card_last_digits", s1);
        gvc1.setArguments(bundle);
        return gvc1;
    }

    private void a(gvd gvd1)
    {
        gvd1.a(this);
    }

    private gvd c()
    {
        return gwm.a().a(gss.a(getActivity().getApplication())).a();
    }

    private void d()
    {
        c = getArguments().getString("card_first_digits");
        d = getArguments().getString("card_last_digits");
        gjz.a(d);
    }

    private void e()
    {
        b.a(f.l);
        if (!e.B_())
        {
            e.setError(getString(gsg.ub__payment_invalid_card_code));
            return;
        }
        e.setError(null);
        if (f != null)
        {
            f.a(e.getText().toString());
        }
        dismiss();
    }

    private void f()
    {
        b.a(f.k);
        if (f != null)
        {
            f.e();
        }
        dismiss();
    }

    protected final Object a()
    {
        return c();
    }

    protected final volatile void a(Object obj)
    {
        a((gvd)obj);
    }

    public final void b()
    {
        e.setError(null);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        f = (gve)activity;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        f();
    }

    public final void onClick(View view)
    {
        if (view.getId() == gsd.ub__payment_button_cancel)
        {
            f();
        } else
        if (view.getId() == gsd.ub__payment_button_ok)
        {
            e();
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(gse.ub__payment_fragment_airtel_cvv_dialog, viewgroup, false);
        bundle = gti.a(c);
        if (TextUtils.isEmpty(bundle))
        {
            layoutinflater = d;
        } else
        {
            layoutinflater = String.format("[%1$s] %2$s", new Object[] {
                bundle, d
            });
        }
        g = (TextView)viewgroup.findViewById(gsd.ub__payment_textview_title);
        g.setText(String.format(getString(gsg.ub__payment_airtel_cvv_title), new Object[] {
            layoutinflater
        }));
        e = (SecurityCodeEditText)viewgroup.findViewById(gsd.ub__payment_edittext_cvv);
        e.a(bundle);
        e.a(this);
        viewgroup.findViewById(gsd.ub__payment_button_cancel).setOnClickListener(this);
        viewgroup.findViewById(gsd.ub__payment_button_ok).setOnClickListener(this);
        return viewgroup;
    }

    public final void onDetach()
    {
        super.onDetach();
        f = null;
    }

    public final void onResume()
    {
        super.onResume();
        b.a(e.n);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = getDialog();
        if (view != null)
        {
            view.requestWindowFeature(1);
        }
    }

}
