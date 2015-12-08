// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.util.Log;
import com.sessionm.api.AchievementData;
import com.sessionm.b.a;
import java.util.Locale;

public class AchievementImpl
    implements AchievementData
{
    public static final class AchievementState extends Enum
    {

        public static final AchievementState S;
        public static final AchievementState T;
        public static final AchievementState U;
        public static final AchievementState V;
        private static final AchievementState W[];

        public static AchievementState valueOf(String s)
        {
            return (AchievementState)Enum.valueOf(com/sessionm/core/AchievementImpl$AchievementState, s);
        }

        public static AchievementState[] values()
        {
            return (AchievementState[])W.clone();
        }

        static 
        {
            S = new AchievementState("UNEARNED", 0);
            T = new AchievementState("UNCLAIMED", 1);
            U = new AchievementState("PRESENTED", 2);
            V = new AchievementState("CLAIMED", 3);
            W = (new AchievementState[] {
                S, T, U, V
            });
        }

        private AchievementState(String s, int i1)
        {
            super(s, i1);
        }
    }


    static final boolean $assertionsDisabled;
    public static final String A = "achievement_icon_url";
    public static final String B = "display";
    public static final String C = "next_ad_url";
    public static final String D = "claim_url";
    public static final String E = "unclaimed_count";
    public static final String F = "custom";
    public static final String G = "nodisplay";
    public static final String H = "event_name";
    public static final String I = "preload_url";
    public static final String J = "last_earned_at";
    public static final String K = "times_earned";
    public static final String L = "state";
    public static final String M = "import_id";
    public static final String N = "instructions";
    public static final String O = "limit_text";
    public static final int P = -1;
    public static final int Q = -1;
    public static String u;
    public static String v;
    public static final String w = "ad";
    public static final String x = "unlocked_message";
    public static final String y = "points";
    public static final String z = "distance";
    private a a;
    private String b;
    private String c;
    private int d;
    private String e;
    private String f;
    private String g;
    private int h;
    private int i;
    private boolean j;
    private AchievementState k;
    private boolean l;
    private String m;
    private String message;
    private boolean n;
    private String name;
    private String o;
    private int p;
    private String q;
    private String r;
    private String t;

    AchievementImpl(a a1, String s)
    {
        if (s.equals("list"))
        {
            u = "id";
            v = "name";
            b = a1.getString(u);
            name = a1.getString(v);
            d = a1.getInt("points");
            i = a1.getInt("unclaimed_count");
            m = a1.getString("last_earned_at");
            p = a1.getInt("times_earned");
            c = a1.getString("event_name");
            o = a1.getString("import_id");
            q = a1.getString("state");
            t = a1.getString("instructions");
            r = a1.getString("limit_text");
            a = a1;
            return;
        }
        u = "achievement_id";
        v = "achievement_name";
        b = a1.getString(u);
        s = a1.B("ad");
        if (s != null)
        {
            name = s.getString(v);
            message = s.getString("unlocked_message");
            if (message == null || message.equals("null"))
            {
                message = "Achievement Unlocked!";
            }
            d = s.getInt("points");
            e = s.getString("achievement_icon_url");
        }
        j = "custom".equals(a1.getString("display"));
        n = "nodisplay".equals(a1.getString("display"));
        int i1;
        boolean flag;
        if (a1.has("distance"))
        {
            i1 = a1.getInt("distance");
        } else
        {
            i1 = -1;
        }
        h = i1;
        i = a1.getInt("unclaimed_count");
        c = a1.getString("event_name");
        f = a1.getString("preload_url");
        if (a1.has("last_earned_at"))
        {
            m = a1.getString("last_earned_at");
        }
        a = a1;
        k = AchievementState.S;
        if (h == 0 || i > 0)
        {
            a1 = AchievementState.T;
        } else
        {
            a1 = AchievementState.S;
        }
        if (h == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        a(a1);
    }

    private void a(boolean flag)
    {
        l = flag;
    }

    public AchievementState a()
    {
        this;
        JVM INSTR monitorenter ;
        AchievementState achievementstate = k;
        this;
        JVM INSTR monitorexit ;
        return achievementstate;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(AchievementData achievementdata)
    {
        if (e == null)
        {
            e = achievementdata.getAchievementIconURL();
        }
        if (message == null)
        {
            message = achievementdata.getMessage();
        }
        h = achievementdata.getDistance();
    }

    public void a(AchievementState achievementstate)
    {
        if (achievementstate != null && achievementstate.equals(k))
        {
            return;
        }
        if (!$assertionsDisabled && achievementstate == null)
        {
            throw new AssertionError();
        }
        static class _cls1
        {

            static final int R[];

            static 
            {
                R = new int[AchievementState.values().length];
                try
                {
                    R[AchievementState.V.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    R[AchievementState.T.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    R[AchievementState.U.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    R[AchievementState.S.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.R[achievementstate.ordinal()];
        JVM INSTR tableswitch 1 4: default 72
    //                   1 78
    //                   2 112
    //                   3 191
    //                   4 244;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        k = achievementstate;
        return;
_L2:
        if (!AchievementState.U.equals(k) && Log.isLoggable("SessionM.CA", 6))
        {
            Log.e("SessionM.CA", "Incorrect state transition. Cannot claim unpresented achievement.");
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if ((k == AchievementState.S && h > 0 && i <= 0 || (k == AchievementState.V || k == AchievementState.U) && h > 0 && !l) && Log.isLoggable("SessionM.CA", 6))
        {
            Log.e("SessionM.CA", "Incorrect state transition. Unclaimed achievements must be earned first.");
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!AchievementState.T.equals(k) && Log.isLoggable("SessionM.CA", 6))
        {
            Log.e("SessionM.CA", "Incorrect state transition. Presented achievements must be earned before being presented.");
        }
        if (i > 0 && h > 0)
        {
            i = -1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (Log.isLoggable("SessionM.CA", 6))
        {
            Log.e("SessionM.CA", "Incorrect state transition. Should never go back to unearned.");
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void a(String s)
    {
        p = p + 1;
        i = i + 1;
        m = s;
    }

    boolean a(int i1)
    {
        if (h > 0)
        {
            int j1 = i1;
            if (i1 > h)
            {
                j1 = h;
            }
            h = h - j1;
            if (h == 0)
            {
                a(true);
                a(AchievementState.T);
                return true;
            }
        }
        return false;
    }

    boolean b()
    {
        return l;
    }

    boolean c()
    {
        return n;
    }

    a d()
    {
        return a;
    }

    public String getAchievementIconURL()
    {
        return e;
    }

    public String getAchievementId()
    {
        return b;
    }

    public String getAction()
    {
        return c;
    }

    public int getDistance()
    {
        return h;
    }

    public String getImportId()
    {
        return o;
    }

    public String getInstructions()
    {
        return t;
    }

    public String getLimitTimes()
    {
        return r;
    }

    public String getMessage()
    {
        return message;
    }

    public int getMpointValue()
    {
        return d;
    }

    public String getName()
    {
        return name;
    }

    public int getTimesEarned()
    {
        return p;
    }

    public int getUnclaimedCount()
    {
        return i;
    }

    public boolean isCustom()
    {
        return j;
    }

    boolean isValid()
    {
        return b != null && (n || j || f != null);
    }

    public String lastEarnedDate()
    {
        return m;
    }

    public String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = String.format(Locale.US, "<Achievement id: %s name: %s distance: %d count: %d>", new Object[] {
            b, name, Integer.valueOf(h), Integer.valueOf(i)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!com/sessionm/core/AchievementImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
