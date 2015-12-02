// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.PaymentProfile;
import gjy;
import gki;
import hkz;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectClient, ObjectPaymentProfile

abstract class ObjectClient
    implements hkz
{

    ObjectClient()
    {
    }

    public static ObjectClient create()
    {
        return new Shape_ObjectClient();
    }

    public PaymentProfile findPaymentProfileByUuid(String s)
    {
        if (s != null && !s.isEmpty())
        {
            if (ObjectPaymentProfile.GOOGLE_WALLET.getUuid().equals(s))
            {
                return ObjectPaymentProfile.GOOGLE_WALLET;
            }
            if (getPaymentProfiles() != null)
            {
                return (PaymentProfile)gki.d(getPaymentProfiles(), new _cls1(s)).d();
            }
        }
        return null;
    }

    public String getCurrentMobile()
    {
        if (getMobile() != null && !getMobile().isEmpty())
        {
            return getMobile();
        } else
        {
            return getClaimedMobile();
        }
    }

    public String getFormattedName()
    {
        String s;
        String s1;
        if (getFirstName() != null)
        {
            s = getFirstName();
        } else
        {
            s = "";
        }
        if (getLastName() != null)
        {
            s1 = getLastName();
        } else
        {
            s1 = "";
        }
        return String.format("%s %s", new Object[] {
            s, s1
        }).trim();
    }

    public PaymentProfile getLastSelectedPaymentProfile()
    {
        List list = getPaymentProfiles();
        boolean flag;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return null;
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            PaymentProfile paymentprofile = (PaymentProfile)iterator.next();
            String s = paymentprofile.getUuid();
            if (s != null && !s.equals("") && s.equals(getLastSelectedPaymentProfileUUID()))
            {
                return paymentprofile;
            }
        }

        return (PaymentProfile)list.get(0);
    }

    public Boolean isMobileRevoked()
    {
        boolean flag;
        if (!getHasConfirmedMobile() && (getCurrentMobile() == null || getCurrentMobile().isEmpty()) && (getMobileDigits() == null || getMobileDigits().isEmpty()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    /* member class not found */
    class _cls1 {}

}
