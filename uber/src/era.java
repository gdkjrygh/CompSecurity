// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import java.util.Iterator;
import java.util.List;

public final class era
{

    public static boolean a(Client client)
    {
label0:
        {
            if (client == null)
            {
                break label0;
            }
            client = client.getPaymentProfiles();
            if (client == null)
            {
                break label0;
            }
            client = client.iterator();
            do
            {
                if (!client.hasNext())
                {
                    break label0;
                }
                RewardInfo rewardinfo = ((PaymentProfile)client.next()).getRewardInfo();
                boolean flag;
                if (rewardinfo != null && rewardinfo.isEnrolled())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } while (!flag);
            return true;
        }
        return false;
    }

    public static boolean a(String s)
    {
        return "US".equalsIgnoreCase(s);
    }
}
