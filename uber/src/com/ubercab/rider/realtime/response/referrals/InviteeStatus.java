// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response.referrals;


public abstract class InviteeStatus
{

    public static final String INVITEE_STATUS_NOT_A_USER = "no_user";

    public InviteeStatus()
    {
    }

    private static boolean isEmpty(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public abstract String getContactinfo();

    public abstract String getRole();

    public boolean isValidInvitee()
    {
        return !isEmpty(getRole()) && getRole().equals("no_user");
    }

    abstract void setContactinfo(String s);

    abstract void setRole(String s);
}
