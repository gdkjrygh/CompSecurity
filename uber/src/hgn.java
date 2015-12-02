// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;

public class hgn extends hbr
{

    chp a;
    hck b;

    public hgn()
    {
    }

    public static void a(RdsActivity rdsactivity, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.ubercab.rds.EXTRA_PHONE_NUMBER", s);
        s = new hgn();
        s.setArguments(bundle);
        s.show(rdsactivity.getSupportFragmentManager(), hgn.getName());
    }

    private void a(hgo hgo1)
    {
        hgo1.a(this);
    }

    private hgo b()
    {
        return hfn.a().a(new hbt(getActivity().getApplication())).a();
    }

    protected final Object a()
    {
        return b();
    }

    protected final volatile void a(Object obj)
    {
        a((hgo)obj);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, hbp.Theme_Uber_Dialog);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = getArguments().getString("com.ubercab.rds.EXTRA_PHONE_NUMBER");
        getDialog().setCanceledOnTouchOutside(true);
        layoutinflater = layoutinflater.inflate(hbm.ub__support_phone_dialog, viewgroup, false);
        viewgroup = (TextView)layoutinflater.findViewById(hbk.ub__support_phone_description);
        if ("driver".equals(b.y()) && bundle != null)
        {
            viewgroup.setText(getString(hbo.ub__rds__call_agent_driver, new Object[] {
                hcr.c(bundle)
            }));
        } else
        {
            viewgroup.setText(getString(hbo.ub__rds__call_agent_rider));
        }
        ((Button)layoutinflater.findViewById(hbk.ub__support_phone_button_call)).setOnClickListener(new _cls1(bundle));
        ((Button)layoutinflater.findViewById(hbk.ub__support_phone_button_cancel)).setOnClickListener(new _cls2());
        return layoutinflater;
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
