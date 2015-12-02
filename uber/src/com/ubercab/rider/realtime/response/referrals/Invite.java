// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response.referrals;


// Referenced classes of package com.ubercab.rider.realtime.response.referrals:
//            Invitee, ReengagementCopy

public abstract class Invite
{

    public static final int STATUS_APPLIED = 2;
    public static final int STATUS_COMPLETED = 0;
    public static final int STATUS_DISABLED = 7;
    public static final int STATUS_MANUALLY_COMPLETED = 5;
    public static final int STATUS_NO_SIGNUP = 6;
    public static final int STATUS_POST_FIRST_TRIP = 4;
    public static final int STATUS_PRE_FIRST_TRIP = 3;
    public static final int STATUS_REJECTED = 1;

    public Invite()
    {
    }

    public abstract long getCompletedAt();

    public abstract long getCreatedAt();

    public abstract Invitee getInvitee();

    public abstract int getInviteeTripsRequired();

    public abstract Integer getInviterBonusAmount();

    public abstract Integer getInviterBonusAmountPostSignup();

    public abstract ReengagementCopy getReengagementCopies();

    public abstract int getStatus();

    public boolean isStatusCompleted()
    {
        return getStatus() == 0 || getStatus() == 5;
    }

    public boolean isStatusPending()
    {
        int i = getStatus();
        return i == 6 || i == 2 || i == 3 || i == 4;
    }

    public boolean isStatusRejected()
    {
        return getStatus() == 1;
    }

    abstract void setCompletedAt(long l);

    abstract void setCreatedAt(long l);

    abstract void setInvitee(Invitee invitee);

    abstract void setInviteeTripsRequired(int i);

    abstract void setInviterBonusAmount(Integer integer);

    abstract void setInviterBonusAmountPostSignup(Integer integer);

    abstract void setReengagementCopies(ReengagementCopy reengagementcopy);

    abstract void setStatus(int i);
}
