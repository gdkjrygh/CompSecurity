// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;

import com.sessionm.core.AchievementImpl;
import com.sessionm.core.Session;

// Referenced classes of package com.sessionm.api:
//            Activity, AchievementActivityIllegalStateException, AchievementData

public class AchievementActivity extends Activity
{
    private static final class AchievementActivityState extends Enum
    {

        private static final AchievementActivityState $VALUES[];
        public static final AchievementActivityState CANCELLED;
        public static final AchievementActivityState CLAIMED;
        public static final AchievementActivityState PRESENTED;
        public static final AchievementActivityState UNPRESENTED;

        public static AchievementActivityState valueOf(String s)
        {
            return (AchievementActivityState)Enum.valueOf(com/sessionm/api/AchievementActivity$AchievementActivityState, s);
        }

        public static AchievementActivityState[] values()
        {
            return (AchievementActivityState[])$VALUES.clone();
        }

        static 
        {
            UNPRESENTED = new AchievementActivityState("UNPRESENTED", 0);
            PRESENTED = new AchievementActivityState("PRESENTED", 1);
            CLAIMED = new AchievementActivityState("CLAIMED", 2);
            CANCELLED = new AchievementActivityState("CANCELLED", 3);
            $VALUES = (new AchievementActivityState[] {
                UNPRESENTED, PRESENTED, CLAIMED, CANCELLED
            });
        }

        private AchievementActivityState(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class AchievementDismissType extends Enum
    {

        private static final AchievementDismissType $VALUES[];
        public static final AchievementDismissType CANCELLED;
        public static final AchievementDismissType CLAIMED;

        public static AchievementDismissType valueOf(String s)
        {
            return (AchievementDismissType)Enum.valueOf(com/sessionm/api/AchievementActivity$AchievementDismissType, s);
        }

        public static AchievementDismissType[] values()
        {
            return (AchievementDismissType[])$VALUES.clone();
        }

        static 
        {
            CLAIMED = new AchievementDismissType("CLAIMED", 0);
            CANCELLED = new AchievementDismissType("CANCELLED", 1);
            $VALUES = (new AchievementDismissType[] {
                CLAIMED, CANCELLED
            });
        }

        private AchievementDismissType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String TAG = "SessionM.CA";
    private AchievementImpl achievement;
    private AchievementActivityState state;

    public AchievementActivity(AchievementData achievementdata)
    {
        super(SessionM.ActivityType.ACHIEVEMENT);
        state = AchievementActivityState.UNPRESENTED;
        if (achievementdata == null)
        {
            throw new NullPointerException("null achievement used to initialize AchievementActivity");
        } else
        {
            achievement = (AchievementImpl)achievementdata;
            state = AchievementActivityState.UNPRESENTED;
            return;
        }
    }

    private AchievementImpl getAchievementImpl()
    {
        return achievement;
    }

    private void notifyCancelled()
    {
        if (state.equals(AchievementActivityState.CANCELLED))
        {
            return;
        } else
        {
            Session.D().dismissActivity();
            state = AchievementActivityState.CANCELLED;
            return;
        }
    }

    private void notifyClaimed()
        throws AchievementActivityIllegalStateException
    {
        Session session = Session.D();
        if (!state.equals(AchievementActivityState.PRESENTED))
        {
            throw new AchievementActivityIllegalStateException("Invalid claim call on custom activity - not in presented state.");
        }
        Activity activity = session.getCurrentActivity();
        if (!equals(activity))
        {
            throw new AchievementActivityIllegalStateException(String.format("A different activity is already presented or current activity has been dismissed: %s", new Object[] {
                activity
            }));
        } else
        {
            state = AchievementActivityState.CLAIMED;
            achievement.a(com.sessionm.core.AchievementImpl.AchievementState.V);
            session.b(this);
            return;
        }
    }

    public final AchievementData getAchievement()
    {
        return achievement;
    }

    public final boolean isAndroidActivity()
    {
        this;
        JVM INSTR monitorenter ;
        AchievementActivityState achievementactivitystate;
        AchievementActivityState achievementactivitystate1;
        achievementactivitystate = state;
        achievementactivitystate1 = AchievementActivityState.CLAIMED;
        boolean flag;
        if (achievementactivitystate == achievementactivitystate1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void notifyDismissed(AchievementDismissType achievementdismisstype)
        throws AchievementActivityIllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        if (!achievementdismisstype.equals(AchievementDismissType.CLAIMED)) goto _L2; else goto _L1
_L1:
        notifyClaimed();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        notifyCancelled();
        if (true) goto _L4; else goto _L3
_L3:
        achievementdismisstype;
        throw achievementdismisstype;
    }

    public final void notifyPresented()
        throws AchievementActivityIllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        if (!state.equals(AchievementActivityState.UNPRESENTED) || !getAchievementImpl().a().equals(com.sessionm.core.AchievementImpl.AchievementState.T))
        {
            throw new AchievementActivityIllegalStateException("Activity was presented but was not in unpresented state.");
        }
        break MISSING_BLOCK_LABEL_46;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        state = AchievementActivityState.PRESENTED;
        Session session = Session.D();
        if (session.getCurrentActivity() != null)
        {
            throw new AchievementActivityIllegalStateException("A different activity is already presented");
        }
        if (!session.a(this))
        {
            throw new AchievementActivityIllegalStateException("Cannot present achievement on current Android activity.");
        }
        achievement.a(com.sessionm.core.AchievementImpl.AchievementState.U);
        session.at();
        this;
        JVM INSTR monitorexit ;
    }
}
