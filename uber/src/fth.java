// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.realtime.RiderParcelableUnpaidBill;
import com.ubercab.realtime.error.RealtimeError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class fth
{

    public static ArrayList a(bjw bjw1, List list)
    {
        if (list != null)
        {
            return (ArrayList)bjw1.a(bjw1.a(list), (new bmj() {

            }).getType());
        } else
        {
            return new ArrayList();
        }
    }

    public static ArrayList a(RealtimeError realtimeerror)
    {
        Object obj = (List)realtimeerror.getData().get("arrears");
        if (obj == null)
        {
            return null;
        }
        realtimeerror = new ArrayList();
        Map map;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); realtimeerror.add(RiderParcelableUnpaidBill.a((String)map.get("amount"), (String)map.get("amountString"), (String)map.get("createdAt"), (String)map.get("uuid"))))
        {
            map = (Map)((Iterator) (obj)).next();
        }

        return realtimeerror;
    }
}
