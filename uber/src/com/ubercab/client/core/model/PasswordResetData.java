// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_PasswordResetData, Shape_PasswordResetTokenVerifyData, PasswordResetTokenVerifyData, Shape_PasswordResetNameVerifyData, 
//            PasswordResetNameVerifyData, Shape_PasswordResetNewPasswordData, PasswordResetNewPasswordData, Shape_PasswordResetTripVerifyData, 
//            PasswordResetTripVerifyData, PasswordResetCommonData

public abstract class PasswordResetData
{

    public PasswordResetData()
    {
    }

    public static PasswordResetData createForMobileVerification(String s, String s1)
    {
        s = (new Shape_PasswordResetData()).setPhoneNumberE164(s).setState("PasswordResetState.MOBILE_VERIFY");
        Shape_PasswordResetTokenVerifyData shape_passwordresettokenverifydata = new Shape_PasswordResetTokenVerifyData();
        shape_passwordresettokenverifydata.setMobileToken(s1);
        s.setTokenVerifyData(shape_passwordresettokenverifydata);
        return s;
    }

    public static PasswordResetData createForNameVerification(String s, String s1, String s2)
    {
        s = (new Shape_PasswordResetData()).setPhoneNumberE164(s).setState("PasswordResetState.NOT_STARTED");
        Shape_PasswordResetNameVerifyData shape_passwordresetnameverifydata = new Shape_PasswordResetNameVerifyData();
        shape_passwordresetnameverifydata.setFirstName(s1);
        shape_passwordresetnameverifydata.setLastName(s2);
        s.setNameVerifyData(shape_passwordresetnameverifydata);
        return s;
    }

    public static PasswordResetData createForNewPassword(String s, String s1)
    {
        s = (new Shape_PasswordResetData()).setPhoneNumberE164(s).setState("PasswordResetState.CREATE_NEW_PASSWORD");
        Shape_PasswordResetNewPasswordData shape_passwordresetnewpassworddata = new Shape_PasswordResetNewPasswordData();
        shape_passwordresetnewpassworddata.setNewPassword(s1);
        s.setNewPasswordData(shape_passwordresetnewpassworddata);
        return s;
    }

    public static PasswordResetData createForResendMobileToken(String s)
    {
        s = (new Shape_PasswordResetData()).setPhoneNumberE164(s).setState("PasswordResetState.MOBILE_VERIFY");
        Shape_PasswordResetTokenVerifyData shape_passwordresettokenverifydata = new Shape_PasswordResetTokenVerifyData();
        shape_passwordresettokenverifydata.setSendToken(Boolean.valueOf(true));
        s.setTokenVerifyData(shape_passwordresettokenverifydata);
        return s;
    }

    public static PasswordResetData createForResetAccount(String s)
    {
        return (new Shape_PasswordResetData()).setPhoneNumberE164(s).setState("PasswordResetState.RESET_ACCOUNT");
    }

    public static PasswordResetData createForRestoreAccount(String s)
    {
        return (new Shape_PasswordResetData()).setPhoneNumberE164(s).setState("PasswordResetState.REQUEST_RESTORE");
    }

    public static PasswordResetData createForTripChallenge(String s, String s1, String s2, Boolean boolean1)
    {
        s = (new Shape_PasswordResetData()).setPhoneNumberE164(s).setState("PasswordResetState.TRIP_VERIFY");
        Shape_PasswordResetTripVerifyData shape_passwordresettripverifydata = new Shape_PasswordResetTripVerifyData();
        shape_passwordresettripverifydata.setTripChallengeId(s1);
        shape_passwordresettripverifydata.setTripId(s2);
        shape_passwordresettripverifydata.setTripChallengeAnswer(boolean1);
        s.setTripVerifyData(shape_passwordresettripverifydata);
        return s;
    }

    public abstract PasswordResetCommonData getCommonData();

    public abstract PasswordResetNameVerifyData getNameVerifyData();

    public abstract PasswordResetNewPasswordData getNewPasswordData();

    public abstract String getPhoneNumberE164();

    public abstract String getState();

    public abstract PasswordResetTokenVerifyData getTokenVerifyData();

    public abstract PasswordResetTripVerifyData getTripVerifyData();

    public abstract PasswordResetData setCommonData(PasswordResetCommonData passwordresetcommondata);

    abstract PasswordResetData setNameVerifyData(PasswordResetNameVerifyData passwordresetnameverifydata);

    abstract PasswordResetData setNewPasswordData(PasswordResetNewPasswordData passwordresetnewpassworddata);

    abstract PasswordResetData setPhoneNumberE164(String s);

    abstract PasswordResetData setState(String s);

    abstract PasswordResetData setTokenVerifyData(PasswordResetTokenVerifyData passwordresettokenverifydata);

    abstract PasswordResetData setTripVerifyData(PasswordResetTripVerifyData passwordresettripverifydata);
}
