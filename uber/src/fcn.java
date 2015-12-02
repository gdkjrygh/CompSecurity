// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.receipt.EnhancedReceiptDialogFragment;
import com.ubercab.rider.realtime.response.RiderTripLocations;
import java.util.List;

public final class fcn
    implements icg
{

    final EnhancedReceiptDialogFragment a;

    private fcn(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        a = enhancedreceiptdialogfragment;
        super();
    }

    public fcn(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, byte byte0)
    {
        this(enhancedreceiptdialogfragment);
    }

    private void a(RiderTripLocations ridertriplocations)
    {
        if (ridertriplocations != null)
        {
            EnhancedReceiptDialogFragment.b(a, ridertriplocations.getLocations());
            if (EnhancedReceiptDialogFragment.e(a) != null && EnhancedReceiptDialogFragment.e(a).size() > 0)
            {
                EnhancedReceiptDialogFragment.h(a);
            }
        }
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((RiderTripLocations)obj);
    }

    public final void a(Throwable throwable)
    {
        ijg.a(dbf.F.name()).b(throwable, "Get Trip points failed : %s", new Object[] {
            throwable.toString()
        });
    }
}
