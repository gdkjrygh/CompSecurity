// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import chp;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.rds.core.model.TripSummary;
import hbk;
import hbm;
import hbo;
import hbt;
import hcq;
import hhl;
import hhm;
import hie;
import hii;
import hik;
import i;

// Referenced classes of package com.ubercab.rds.feature.trip:
//            TripDetailsActivity, TripProblemActivity, TripReceiptActivity

public class TripHistoryActivity extends RdsActivity
    implements hik
{

    public chp c;

    public TripHistoryActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/ubercab/rds/feature/trip/TripHistoryActivity);
    }

    public static void a(RdsActivity rdsactivity)
    {
        rdsactivity.startActivity((new Intent(rdsactivity, com/ubercab/rds/feature/trip/TripHistoryActivity)).setAction("com.ubercab.rds.ACTION_FINISH_SELF").addFlags(0x4000000).putExtra("com.ubercab.rds.FINISH_SELF", true));
    }

    private void a(hie hie1)
    {
        hie1.a(this);
    }

    private hie f()
    {
        return hhl.a().a(new hbt(getApplication())).a();
    }

    private void g()
    {
        hii hii2 = (hii)a(hii);
        hii hii1 = hii2;
        if (hii2 == null)
        {
            hii1 = hii.c();
            a(hbk.ub__support_viewgroup_content, hii1);
        }
        hii1.a(this);
    }

    public final void a(TripSummary tripsummary)
    {
        String s;
        byte byte0;
        s = getIntent().getAction();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 48
    //                   -1421763056: 91
    //                   -185286651: 77
    //                   -29930071: 105;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_105;
_L5:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            c.a(i.C);
            startActivity(TripDetailsActivity.a(this, tripsummary));
            return;

        case 1: // '\001'
            c.a(i.w);
            startActivity(TripProblemActivity.a(this, tripsummary));
            return;

        case 2: // '\002'
            c.a(i.C);
            break;
        }
        break MISSING_BLOCK_LABEL_169;
_L3:
        if (s.equals("com.ubercab.rds.ACTION_TRIP_HISTORY"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("com.ubercab.rds.ACTION_TRIP_PROBLEM"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("com.ubercab.rds.ACTION_TRIP_RECEIPT"))
        {
            byte0 = 2;
        }
          goto _L5
        startActivity(TripReceiptActivity.a(this, tripsummary));
        return;
    }

    protected final volatile void a(Object obj)
    {
        a((hie)obj);
    }

    protected final Object c()
    {
        return f();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        hcq.a(getIntent().getAction());
        setContentView(hbm.ub__trip_history_activity);
        a(getString(hbo.ub__rds__select_trip));
        g();
    }
}
