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

public class hex extends hbr
{

    chp a;
    private hez b;

    public hex()
    {
    }

    public static hex a(RdsActivity rdsactivity)
    {
        hex hex1 = new hex();
        hex1.show(rdsactivity.getSupportFragmentManager(), hex.getName());
        return hex1;
    }

    private void a(hey hey1)
    {
        hey1.a(this);
    }

    private hey b()
    {
        return her.a().a(new hbt(getActivity().getApplication())).a();
    }

    protected final Object a()
    {
        return b();
    }

    public final void a(hez hez1)
    {
        b = hez1;
    }

    protected final volatile void a(Object obj)
    {
        a((hey)obj);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, hbp.Theme_Uber_Dialog);
        a.a(h.d);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getDialog().setCanceledOnTouchOutside(false);
        layoutinflater = layoutinflater.inflate(hbm.ub__password_email_dialog, viewgroup, false);
        ((Button)layoutinflater.findViewById(hbk.ub__password_forgot_email_button_ok)).setOnClickListener(new _cls1());
        return layoutinflater;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (b != null)
        {
            b.f();
        }
    }

    /* member class not found */
    class _cls1 {}

}
