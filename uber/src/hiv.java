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
import com.ubercab.rds.core.model.TripReceipt;
import com.ubercab.rds.feature.trip.TripReceiptView;
import com.ubercab.ui.Button;

public class hiv extends hbr
{

    chp a;

    public hiv()
    {
    }

    public static void a(RdsActivity rdsactivity, TripReceipt tripreceipt)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT", tripreceipt);
        tripreceipt = new hiv();
        tripreceipt.setArguments(bundle);
        tripreceipt.show(rdsactivity.getSupportFragmentManager(), hiv.getName());
    }

    private void a(hiw hiw1)
    {
        hiw1.a(this);
    }

    private hiw b()
    {
        return hhv.a().a(new hbt(getActivity().getApplication())).a();
    }

    protected final Object a()
    {
        return b();
    }

    protected final volatile void a(Object obj)
    {
        a((hiw)obj);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, hbp.Theme_Uber_Dialog);
        a.a(h.k);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getDialog().setCanceledOnTouchOutside(true);
        bundle = (TripReceipt)getArguments().getParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT");
        layoutinflater = layoutinflater.inflate(hbm.ub__trip_problem_receipt_dialog, viewgroup, false);
        ((TripReceiptView)layoutinflater.findViewById(hbk.ub__trip_receipt_view)).a(bundle);
        ((Button)layoutinflater.findViewById(hbk.ub__trip_problem_receipt_dialog_button)).setOnClickListener(new _cls1());
        return layoutinflater;
    }

    /* member class not found */
    class _cls1 {}

}
