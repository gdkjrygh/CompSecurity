// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.realtime.client;

import com.ubercab.rds.realtime.request.body.ForgotPasswordBody;
import com.ubercab.rds.realtime.request.body.UpdatePasswordBody;
import ica;

public interface UsersApi
{

    public abstract ica putForgotPassword(ForgotPasswordBody forgotpasswordbody);

    public abstract ica putUpdatePassword(UpdatePasswordBody updatepasswordbody);
}
