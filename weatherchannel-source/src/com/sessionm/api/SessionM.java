// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.sessionm.core.Config;
import com.sessionm.core.Session;
import com.sessionm.core.f;
import com.sessionm.core.h;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.sessionm.api:
//            Activity, ActivityListener, SessionListener, AchievementData, 
//            User

public class SessionM
{
    public static final class ActivityType extends Enum
    {

        private static final ActivityType $VALUES[];
        public static final ActivityType ACHIEVEMENT;
        public static final ActivityType INTERSTITIAL;
        public static final ActivityType PORTAL;

        public static ActivityType valueOf(String s)
        {
            return (ActivityType)Enum.valueOf(com/sessionm/api/SessionM$ActivityType, s);
        }

        public static ActivityType[] values()
        {
            return (ActivityType[])$VALUES.clone();
        }

        static 
        {
            PORTAL = new ActivityType("PORTAL", 0);
            ACHIEVEMENT = new ActivityType("ACHIEVEMENT", 1);
            INTERSTITIAL = new ActivityType("INTERSTITIAL", 2);
            $VALUES = (new ActivityType[] {
                PORTAL, ACHIEVEMENT, INTERSTITIAL
            });
        }

        private ActivityType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class EnrollmentResultType extends Enum
    {

        private static final EnrollmentResultType $VALUES[];
        public static final EnrollmentResultType FAILURE;
        public static final EnrollmentResultType SUCCESS;
        public static final EnrollmentResultType UNAVAILABLE;

        public static EnrollmentResultType valueOf(String s)
        {
            return (EnrollmentResultType)Enum.valueOf(com/sessionm/api/SessionM$EnrollmentResultType, s);
        }

        public static EnrollmentResultType[] values()
        {
            return (EnrollmentResultType[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new EnrollmentResultType("SUCCESS", 0);
            FAILURE = new EnrollmentResultType("FAILURE", 1);
            UNAVAILABLE = new EnrollmentResultType("UNAVAILABLE", 2);
            $VALUES = (new EnrollmentResultType[] {
                SUCCESS, FAILURE, UNAVAILABLE
            });
        }

        private EnrollmentResultType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State STARTED_OFFLINE;
        public static final State STARTED_ONLINE;
        public static final State STARTING;
        public static final State STOPPED;
        public static final State STOPPING;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/sessionm/api/SessionM$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        public boolean isStarted()
        {
            return this == STARTED_ONLINE || this == STARTED_OFFLINE;
        }

        static 
        {
            STOPPED = new State("STOPPED", 0);
            STARTING = new State("STARTING", 1);
            STARTED_ONLINE = new State("STARTED_ONLINE", 2);
            STARTED_OFFLINE = new State("STARTED_OFFLINE", 3);
            STOPPING = new State("STOPPING", 4);
            $VALUES = (new State[] {
                STOPPED, STARTING, STARTED_ONLINE, STARTED_OFFLINE, STOPPING
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    public static com.sessionm.core.Config.ServerType SERVER_TYPE_CUSTOM;
    public static com.sessionm.core.Config.ServerType SERVER_TYPE_DEVELOPMENT;
    public static com.sessionm.core.Config.ServerType SERVER_TYPE_JAPAN;
    public static com.sessionm.core.Config.ServerType SERVER_TYPE_PRODUCTION;
    public static final String TAG = "SessionM";
    public static String USER_DATA_BIRTH_YEAR_KEY = "yob";
    public static String USER_DATA_EMAIL_KEY = "email";
    public static String USER_DATA_GENDER_KEY = "gender";
    public static String USER_DATA_PASSWORD_KEY = "password";
    public static String USER_DATA_ZIP_CODE_KEY = "zip";
    protected static SessionM instance;
    private ActivityListener activityListener;
    private SessionListener sessionListener;

    protected SessionM()
    {
    }

    public static SessionM getInstance()
    {
        com/sessionm/api/SessionM;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            if (!h.isSupportedPlatform())
            {
                break MISSING_BLOCK_LABEL_34;
            }
            instance = new SessionM();
        }
_L1:
        SessionM sessionm = instance;
        com/sessionm/api/SessionM;
        JVM INSTR monitorexit ;
        return sessionm;
        instance = new f();
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public boolean collectsLocation()
    {
        return Session.D().collectsLocation();
    }

    public void dismissActivity()
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", "dismiss activity called with activityType", new Throwable());
        }
        Session.D().dismissActivity();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean enrollWithData(Map map)
    {
        return Session.D().enrollWithData(map);
    }

    public boolean enrollWithEmail(String s, String s1)
    {
        return Session.D().enrollWithEmail(s, s1);
    }

    public ActivityListener getActivityListener()
    {
        return activityListener;
    }

    public JSONArray getAvailableRewards()
    {
        Object obj;
        Object obj1;
        obj = Session.D().G();
        obj1 = new JSONArray();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return ((JSONArray) (obj1));
_L2:
        obj = new JSONArray(((String) (obj)));
        obj1 = obj;
        if (!Log.isLoggable("SessionM", 2)) goto _L1; else goto _L3
_L3:
        Log.v("SessionM", String.format((new StringBuilder()).append("Available offers: \n").append(((JSONArray) (obj)).toString()).toString(), new Object[0]));
        return ((JSONArray) (obj));
        obj1;
_L5:
        ((JSONException) (obj1)).printStackTrace();
        return ((JSONArray) (obj));
        JSONException jsonexception;
        jsonexception;
        obj = obj1;
        obj1 = jsonexception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public Config getConfig()
    {
        return Config.f();
    }

    public com.sessionm.api.Activity getCurrentActivity()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.api.Activity activity;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("getCurrentActivityCalled", new Object[0]), new Throwable());
        }
        activity = Session.D().getCurrentActivity();
        this;
        JVM INSTR monitorexit ;
        return activity;
        Exception exception;
        exception;
        throw exception;
    }

    public EnrollmentResultType getEnrollmentResult()
    {
        return Session.D().J();
    }

    public Handler getListenerHandler()
    {
        return Session.D().getListenerHandler();
    }

    public String getPluginSDKName()
    {
        return Session.D().getPluginSDKName();
    }

    public String getPluginSDKVersion()
    {
        return Session.D().getPluginSDKVersion();
    }

    public String getResponseErrorMessage()
    {
        return Session.D().getResponseErrorMessage();
    }

    public String getSDKVersion()
    {
        return Session.D().getSDKVersion();
    }

    public com.sessionm.core.Config.ServerType getServerType()
    {
        return getConfig().getServerType();
    }

    public String getSessionID()
    {
        this;
        JVM INSTR monitorenter ;
        String s = Session.D().F();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public SessionListener getSessionListener()
    {
        return sessionListener;
    }

    public State getSessionState()
    {
        this;
        JVM INSTR monitorenter ;
        State state = Session.D().getSessionState();
        this;
        JVM INSTR monitorexit ;
        return state;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean getShouldAutoUpdateAchievementsList()
    {
        return Session.D().getShouldAutoUpdateAchievementsList();
    }

    public AchievementData getUnclaimedAchievement()
    {
        return Session.D().getUnclaimedAchievement();
    }

    public User getUser()
    {
        return Session.D().C();
    }

    public boolean isActivityPresented()
    {
        return Session.D().L() != null;
    }

    public boolean isAutopresentMode()
    {
        return Session.D().isAutopresentMode();
    }

    public boolean isExpandedPresentationMode()
    {
        return Session.D().isExpandedPresentationMode();
    }

    public boolean isSupportedPlatform()
    {
        return h.isSupportedPlatform();
    }

    public void logAction(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("log action called with action: %s", new Object[] {
                s
            }), new Throwable());
        }
        logAction(s, 1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void logAction(String s, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("log action called with action: %s count: %d", new Object[] {
                s, Integer.valueOf(i)
            }), new Throwable());
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (s.trim().length() != 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        throw new NullPointerException("Action is null or empty string");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", String.format("Provided count for action %s is zero. Ignoring action.", new Object[] {
                s
            }));
        }
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Session.D().logAction(s, i);
          goto _L1
    }

    public boolean logInUserWithEmail(String s, String s1)
    {
        return Session.D().a(s, s1);
    }

    public void logOutUser()
    {
        Session.D().logOutUser();
    }

    public void onActivityPause(Activity activity)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("onActivityPause called with activity %s", new Object[] {
                activity
            }), new Throwable());
        }
        if (activity == null)
        {
            throw new NullPointerException("Activity is null");
        } else
        {
            Session.D().onActivityPause(activity);
            return;
        }
    }

    public void onActivityResume(Activity activity)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("onActivityResume called with activity %s", new Object[] {
                activity
            }), new Throwable());
        }
        if (activity == null)
        {
            throw new NullPointerException("Activity is null");
        } else
        {
            Session.D().onActivityResume(activity);
            return;
        }
    }

    public void onActivityStart(Activity activity)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("onActivityStart called with activity %s", new Object[] {
                activity
            }), new Throwable());
        }
        if (activity == null)
        {
            throw new NullPointerException("Activity is null");
        } else
        {
            Session.D().onActivityStart(activity);
            return;
        }
    }

    public void onActivityStop(Activity activity)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("onActivityStop called with activity %s", new Object[] {
                activity
            }), new Throwable());
        }
        if (activity == null)
        {
            throw new NullPointerException("Activity is null");
        } else
        {
            Session.D().onActivityStop(activity);
            return;
        }
    }

    public boolean presentActivity(ActivityType activitytype)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Session session;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("present activity called with activityType %s", new Object[] {
                activitytype
            }), new Throwable());
        }
        session = Session.D();
        if (session.K() != null || session.isExpandedPresentationMode()) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (!Log.isLoggable("SessionM", 6))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        Log.e("SessionM", "SessionM activities must be presented on resumed (non-paused) activities. Activity cannot be presented because currently running Android activity is unknown. Ensure your activity properly calls SessionM.onActivityXXX() notification methods or extends com.sessionm.api.BaseActivity.");
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = session.b(new com.sessionm.api.Activity(activitytype), new Object[] {
            Boolean.valueOf(true)
        });
        if (true) goto _L4; else goto _L3
_L3:
        activitytype;
        throw activitytype;
    }

    public transient boolean presentActivity(ActivityType activitytype, Object aobj[])
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Session session;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("present activity called with activityType %s %s", new Object[] {
                activitytype, Arrays.toString(aobj)
            }), new Throwable());
        }
        session = Session.D();
        if (session.K() != null || session.isExpandedPresentationMode()) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (!Log.isLoggable("SessionM", 6))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Log.e("SessionM", "SessionM activities must be presented on resumed (non-paused) activities. Activity cannot be presented because currently running Android activity is unknown. Ensure your activity properly calls SessionM.onActivityXXX() notification methods or extends com.sessionm.api.BaseActivity.");
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = session.b(new com.sessionm.api.Activity(activitytype), aobj);
        if (true) goto _L4; else goto _L3
_L3:
        activitytype;
        throw activitytype;
    }

    public void setActivityListener(ActivityListener activitylistener)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set activity listener called with listener: %s", new Object[] {
                activitylistener
            }), new Throwable());
        }
        activityListener = activitylistener;
    }

    public void setApplicationContext(Context context)
    {
        Session.D().setApplicationContext(context);
    }

    public void setAutopresentMode(boolean flag)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set auto present mode called with value: %b", new Object[] {
                Boolean.valueOf(flag)
            }), new Throwable());
        }
        Session.D().setAutopresentMode(flag);
    }

    public void setCollectionLocation(boolean flag)
    {
        Session.D().setCollectionLocation(flag);
    }

    public void setExpandedPresentationMode(boolean flag)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set expanded presentation mode called with value: %b", new Object[] {
                Boolean.valueOf(flag)
            }), new Throwable());
        }
        Session.D().setExpandedPresentationMode(flag);
    }

    public void setListenerHandler(Handler handler)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set listener handler called with handler: %s", new Object[] {
                handler
            }), new Throwable());
        }
        Session.D().setListenerHandler(handler);
    }

    public void setMetaData(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set meta data called with meta data: %s %s", new Object[] {
                s, s1
            }), new Throwable());
        }
        Session.D().setMetaData(s, s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setMetaData(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set meta data called with meta data: %s", new Object[] {
                map
            }), new Throwable());
        }
        Session.D().setMetaData(map);
        this;
        JVM INSTR monitorexit ;
        return;
        map;
        throw map;
    }

    public void setPluginSDK(String s, String s1)
    {
        Session.D().setPluginSDK(s, s1);
    }

    public void setServerType(com.sessionm.core.Config.ServerType servertype)
    {
        getConfig().setServerType(servertype, new String[0]);
    }

    public transient void setServerType(com.sessionm.core.Config.ServerType servertype, String as[])
    {
        getConfig().setServerType(servertype, as);
    }

    public void setSessionListener(SessionListener sessionlistener)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set session listener called with listener: %s", new Object[] {
                sessionlistener
            }), new Throwable());
        }
        if (sessionListener != null)
        {
            Session.D().b(sessionListener);
        }
        sessionListener = sessionlistener;
        Session.D().a(sessionlistener);
    }

    public void setShouldAutoUpdateAchievementsList(boolean flag)
    {
        Session.D().setShouldAutoUpdateAchievementsList(flag);
    }

    public boolean signUpUserWithData(Map map)
    {
        return Session.D().signUpUserWithData(map);
    }

    public void startSession(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("Starting session with key: %s", new Object[] {
                s
            }), new Throwable());
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        throw new NullPointerException("Could not initialize SessionM SDK due to null application context");
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (s.length() != 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        throw new NullPointerException("Could not initialize SessionM SDK due to null or empty API key");
        Session.D().a(context, s);
        this;
        JVM INSTR monitorexit ;
    }

    public void stopSession()
    {
        Session.D().stopSession();
    }

    public boolean updateAchievementsList()
    {
        return Session.D().updateAchievementsList();
    }

    static 
    {
        SERVER_TYPE_DEVELOPMENT = com.sessionm.core.Config.ServerType.aD;
        SERVER_TYPE_PRODUCTION = com.sessionm.core.Config.ServerType.aB;
        SERVER_TYPE_JAPAN = com.sessionm.core.Config.ServerType.aE;
        SERVER_TYPE_CUSTOM = com.sessionm.core.Config.ServerType.aF;
    }
}
