// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appinvite;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface AppInviteApi
{

    public abstract PendingResult convertInvitation(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult updateInvitationOnInstall(GoogleApiClient googleapiclient, String s);
}
