// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;


// Referenced classes of package com.sessionm.api:
//            SessionM, AchievementData, User

public interface SessionListener
{

    public static final int ACCESS_NETWORK_STATE_UNAVAILABLE = 6;
    public static final int INVALID_APP_ID = 5;
    public static final int NETWORK_ERROR = 0;
    public static final int SERVICE_UNAVAILABLE = 4;
    public static final int SESSION_REFUSED = 2;
    public static final int UNSUPPORTED_PLATFORM = 5;

    public abstract void onSessionFailed(SessionM sessionm, int i);

    public abstract void onSessionStateChanged(SessionM sessionm, SessionM.State state);

    public abstract void onUnclaimedAchievement(SessionM sessionm, AchievementData achievementdata);

    public abstract void onUserUpdated(SessionM sessionm, User user);
}
