// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.ApplyClientPromotionsBody;
import com.ubercab.rider.realtime.request.body.AuthenticateThirdPartyBody;
import com.ubercab.rider.realtime.request.body.ConfirmMobileBody;
import com.ubercab.rider.realtime.request.body.ForgotPasswordBody;
import com.ubercab.rider.realtime.request.body.LoginBody;
import com.ubercab.rider.realtime.request.body.TagUserBody;
import com.ubercab.rider.realtime.request.body.ThirdPartyIdentitiesBody;
import com.ubercab.rider.realtime.request.body.UpdatePasswordBody;
import com.ubercab.rider.realtime.request.body.ValidatePromotionBody;
import ica;

public interface UsersApi
{

    public abstract ica deleteThirdPartyIdentity(String s);

    public abstract ica postApplyClientsPromotions(ApplyClientPromotionsBody applyclientpromotionsbody);

    public abstract ica postAuthenticateThirdParty(AuthenticateThirdPartyBody authenticatethirdpartybody);

    public abstract ica postConfirmMobile(ConfirmMobileBody confirmmobilebody);

    public abstract ica postLogin(LoginBody loginbody);

    public abstract ica postTagUser(TagUserBody taguserbody);

    public abstract ica postThirdPartyIdentities(ThirdPartyIdentitiesBody thirdpartyidentitiesbody);

    public abstract ica postValidatePromotion(ValidatePromotionBody validatepromotionbody);

    public abstract ica putForgotPassword(ForgotPasswordBody forgotpasswordbody);

    public abstract ica putUpdatePassword(UpdatePasswordBody updatepasswordbody);
}
