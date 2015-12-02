// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.realtime.RiderParcelableUnpaidBill;
import com.ubercab.client.feature.faresplit.minion.FareSplitInvitationFragment;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ecl
    implements icg
{

    final FareSplitInvitationFragment a;

    private ecl(FareSplitInvitationFragment faresplitinvitationfragment)
    {
        a = faresplitinvitationfragment;
        super();
    }

    public ecl(FareSplitInvitationFragment faresplitinvitationfragment, byte byte0)
    {
        this(faresplitinvitationfragment);
    }

    public final void a()
    {
        a.b.c(dky.a(true, null, null));
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        throwable = (Error)throwable;
        if (throwable.getRealtimeError() == null) goto _L2; else goto _L1
_L1:
        RealtimeError realtimeerror = throwable.getRealtimeError();
        if (!"rtapi.riders.fare_split_accept.arrears".equals(realtimeerror.getCode())) goto _L4; else goto _L3
_L3:
        throwable = realtimeerror.getData();
        if (throwable == null) goto _L4; else goto _L5
_L5:
        Object obj = (List)throwable.get("arrears");
        if (obj == null) goto _L4; else goto _L6
_L6:
        throwable = new ArrayList();
        Map map;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); throwable.add(RiderParcelableUnpaidBill.a((String)map.get("amount"), (String)map.get("amountString"), (String)map.get("createdAt"), (String)map.get("uuid"))))
        {
            map = (Map)((Iterator) (obj)).next();
        }

_L8:
        a.b.c(dky.a(false, realtimeerror.getMessage(), throwable));
_L2:
        return;
_L4:
        throwable = null;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
