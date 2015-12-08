// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;

import android.widget.FrameLayout;
import java.util.Map;

// Referenced classes of package com.sessionm.api:
//            SessionM, AchievementData

public interface ActivityListener
{
    public static final class UserAction extends Enum
    {

        private static final UserAction $VALUES[];
        public static final UserAction ACHIEVEMENT_DISMISSED;
        public static final UserAction ACHIEVEMENT_ENGAGED;
        public static final UserAction ACHIEVEMENT_VIEWED;
        public static final UserAction CHECKIN_COMPLETED;
        public static final UserAction OTHER;
        public static final UserAction PORTAL_DISMISSED;
        public static final UserAction PORTAL_VIEWED;
        public static final UserAction REDEEMED_REWARD;
        public static final UserAction REGISTERED;
        public static final UserAction SIGN_IN;
        public static final UserAction SIGN_OUT;
        public static final UserAction SPONSOR_CONTENT_DISMISSED;
        public static final UserAction SPONSOR_CONTENT_ENGAGED;
        public static final UserAction SPONSOR_CONTENT_VIEWED;
        private int code;

        public static UserAction valueOf(String s)
        {
            return (UserAction)Enum.valueOf(com/sessionm/api/ActivityListener$UserAction, s);
        }

        public static UserAction[] values()
        {
            return (UserAction[])$VALUES.clone();
        }

        public int getCode()
        {
            return code;
        }

        public void setCode(int i)
        {
            code = i;
        }

        static 
        {
            ACHIEVEMENT_VIEWED = new UserAction("ACHIEVEMENT_VIEWED", 0, 100);
            ACHIEVEMENT_ENGAGED = new UserAction("ACHIEVEMENT_ENGAGED", 1, 101);
            ACHIEVEMENT_DISMISSED = new UserAction("ACHIEVEMENT_DISMISSED", 2, 102);
            SPONSOR_CONTENT_VIEWED = new UserAction("SPONSOR_CONTENT_VIEWED", 3, 103);
            SPONSOR_CONTENT_ENGAGED = new UserAction("SPONSOR_CONTENT_ENGAGED", 4, 104);
            SPONSOR_CONTENT_DISMISSED = new UserAction("SPONSOR_CONTENT_DISMISSED", 5, 105);
            PORTAL_VIEWED = new UserAction("PORTAL_VIEWED", 6, 106);
            SIGN_IN = new UserAction("SIGN_IN", 7, 107);
            SIGN_OUT = new UserAction("SIGN_OUT", 8, 108);
            REGISTERED = new UserAction("REGISTERED", 9, 109);
            PORTAL_DISMISSED = new UserAction("PORTAL_DISMISSED", 10, 110);
            REDEEMED_REWARD = new UserAction("REDEEMED_REWARD", 11, 111);
            CHECKIN_COMPLETED = new UserAction("CHECKIN_COMPLETED", 12, 112);
            OTHER = new UserAction("OTHER", 13, -1);
            $VALUES = (new UserAction[] {
                ACHIEVEMENT_VIEWED, ACHIEVEMENT_ENGAGED, ACHIEVEMENT_DISMISSED, SPONSOR_CONTENT_VIEWED, SPONSOR_CONTENT_ENGAGED, SPONSOR_CONTENT_DISMISSED, PORTAL_VIEWED, SIGN_IN, SIGN_OUT, REGISTERED, 
                PORTAL_DISMISSED, REDEEMED_REWARD, CHECKIN_COMPLETED, OTHER
            });
        }

        private UserAction(String s, int i, int j)
        {
            super(s, i);
            code = j;
        }
    }


    public static final String UserActionAchievementNameKey = "achievement_name";
    public static final String UserActionCheckinDistanceKey = "distance";
    public static final String UserActionCheckinLatitudeKey = "lat";
    public static final String UserActionCheckinLongitudeKey = "lon";
    public static final String UserActionCheckinVenueKey = "venue";
    public static final String UserActionPageNameKey = "page_name";
    public static final String UserActionRewardNameKey = "reward_name";
    public static final String UserActionSponsorContentNameKey = "sponsor_content_name";

    public abstract void onDismissed(SessionM sessionm);

    public abstract void onPresented(SessionM sessionm);

    public abstract void onUserAction(SessionM sessionm, UserAction useraction, Map map);

    public abstract boolean shouldPresentAchievement(SessionM sessionm, AchievementData achievementdata);

    public abstract FrameLayout viewGroupForActivity(SessionM sessionm);
}
