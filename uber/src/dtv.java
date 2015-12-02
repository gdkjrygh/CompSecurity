// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.CreditBalance;
import java.util.Iterator;
import java.util.List;

public final class dtv
{

    public static CreditBalance a(String s, List list)
    {
        if (list == null || TextUtils.isEmpty(s))
        {
            return null;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            CreditBalance creditbalance = (CreditBalance)list.next();
            if (s.equals(creditbalance.getDisplayName()))
            {
                return creditbalance;
            }
        }

        return null;
    }

    public static boolean a(Client client, City city)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (city != null)
        {
            flag = flag1;
            if (client != null)
            {
                client = client.getCreditBalances();
                flag = flag1;
                if (a(city.getCurrencyCode(), ((List) (client))) != null)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
