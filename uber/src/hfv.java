// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;

public class hfv extends hbr
{

    chp a;
    private hfx b;

    public hfv()
    {
    }

    public static hfv a(RdsActivity rdsactivity, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.ubercab.rds.EXTRA_SUCCESS_MESSAGE", s);
        s = new hfv();
        s.setArguments(bundle);
        s.show(rdsactivity.getSupportFragmentManager(), hfv.getName());
        return s;
    }

    private void a(hfw hfw1)
    {
        hfw1.a(this);
    }

    private hfw b()
    {
        return hff.a().a(new hbt(getActivity().getApplication())).a();
    }

    protected final Object a()
    {
        return b();
    }

    public final void a(hfx hfx1)
    {
        b = hfx1;
    }

    protected final volatile void a(Object obj)
    {
        a((hfw)obj);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, hbp.Theme_Uber_Dialog);
        a.a(h.g);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = getArguments().getString("com.ubercab.rds.EXTRA_SUCCESS_MESSAGE");
        getDialog().setCanceledOnTouchOutside(false);
        layoutinflater = layoutinflater.inflate(hbm.ub__support_form_success_dialog, viewgroup, false);
        ((TextView)layoutinflater.findViewById(hbk.ub__support_form_success_message)).setText(bundle);
        ((Button)layoutinflater.findViewById(hbk.ub__support_form_button_ok)).setOnClickListener(new _cls1());
        return layoutinflater;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (b != null)
        {
            b.g();
        }
    }

    /* member class not found */
    class _cls1 {}

}
