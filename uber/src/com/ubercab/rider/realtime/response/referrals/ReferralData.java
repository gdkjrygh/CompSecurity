// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response.referrals;

import gke;
import gkf;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.response.referrals:
//            Invite, ReferralMessaging

public abstract class ReferralData
{

    public ReferralData()
    {
    }

    public gke getCompletedInvites()
    {
        gkf gkf1 = new gkf();
        Iterator iterator = getInvites().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Invite invite = (Invite)iterator.next();
            if (invite.isStatusCompleted())
            {
                gkf1.a(invite);
            }
        } while (true);
        return gkf1.a();
    }

    public abstract String getCurrencyCode();

    public abstract List getInvites();

    public abstract ReferralMessaging getMessaging();

    public gke getPendingInvites()
    {
        gkf gkf1 = new gkf();
        Iterator iterator = getInvites().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Invite invite = (Invite)iterator.next();
            if (invite.isStatusPending())
            {
                gkf1.a(invite);
            }
        } while (true);
        return gkf1.a();
    }

    public abstract Integer getPendingTotalReferralAmount();

    public abstract String getReferralCode();

    public abstract Integer getReferralInviteeAmount();

    public abstract Integer getReferralInviterAmount();

    public abstract Integer getReferralTripsRequired();

    public abstract String getReferralUrl();

    public gke getRejectedInvites()
    {
        gkf gkf1 = new gkf();
        Iterator iterator = getInvites().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Invite invite = (Invite)iterator.next();
            if (invite.isStatusRejected())
            {
                gkf1.a(invite);
            }
        } while (true);
        return gkf1.a();
    }

    public int getTotalCompletedBonusAmount()
    {
        gkn gkn = getCompletedInvites().a();
        int i = 0;
        do
        {
            if (!gkn.hasNext())
            {
                break;
            }
            Invite invite = (Invite)gkn.next();
            if (invite.getInviterBonusAmount() != null)
            {
                i = invite.getInviterBonusAmount().intValue() + i;
            }
        } while (true);
        return i;
    }

    public int getTotalPendingBonusAmount()
    {
        gkn gkn = getPendingInvites().a();
        int i = 0;
        do
        {
            if (!gkn.hasNext())
            {
                break;
            }
            Invite invite = (Invite)gkn.next();
            if (invite.getInviterBonusAmountPostSignup() != null)
            {
                i = invite.getInviterBonusAmountPostSignup().intValue() + i;
            }
        } while (true);
        return i;
    }

    abstract void setCurrencyCode(String s);

    abstract void setInvites(List list);

    abstract void setMessaging(ReferralMessaging referralmessaging);

    abstract void setPendingTotalReferralAmount(Integer integer);

    abstract void setReferralCode(String s);

    abstract void setReferralInviteeAmount(Integer integer);

    abstract void setReferralInviterAmount(Integer integer);

    abstract void setReferralTripsRequired(Integer integer);

    abstract void setReferralUrl(String s);
}
