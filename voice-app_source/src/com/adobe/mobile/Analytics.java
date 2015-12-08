// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, AnalyticsTrackTimedAction, AnalyticsTrackState, ReferrerHandler, 
//            AnalyticsWorker, AnalyticsTrackAction, AnalyticsTrackLocation, AnalyticsTrackBeacon, 
//            AnalyticsTrackLifetimeValueIncrease

public final class Analytics
{
    public static final class BEACON_PROXIMITY extends Enum
    {

        private static final BEACON_PROXIMITY $VALUES[];
        public static final BEACON_PROXIMITY PROXIMITY_FAR;
        public static final BEACON_PROXIMITY PROXIMITY_IMMEDIATE;
        public static final BEACON_PROXIMITY PROXIMITY_NEAR;
        public static final BEACON_PROXIMITY PROXIMITY_UNKNOWN;
        private final int value;

        public static BEACON_PROXIMITY valueOf(String s)
        {
            return (BEACON_PROXIMITY)Enum.valueOf(com/adobe/mobile/Analytics$BEACON_PROXIMITY, s);
        }

        public static BEACON_PROXIMITY[] values()
        {
            return (BEACON_PROXIMITY[])$VALUES.clone();
        }

        protected int getValue()
        {
            return value;
        }

        public String toString()
        {
            static class _cls15
            {

                static final int $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[];

                static 
                {
                    $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY = new int[BEACON_PROXIMITY.values().length];
                    try
                    {
                        $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[BEACON_PROXIMITY.PROXIMITY_IMMEDIATE.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[BEACON_PROXIMITY.PROXIMITY_NEAR.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[BEACON_PROXIMITY.PROXIMITY_FAR.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[BEACON_PROXIMITY.PROXIMITY_UNKNOWN.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls15..SwitchMap.com.adobe.mobile.Analytics.BEACON_PROXIMITY[ordinal()])
            {
            default:
                return "0";

            case 1: // '\001'
                return "1";

            case 2: // '\002'
                return "2";

            case 3: // '\003'
                return "3";
            }
        }

        static 
        {
            PROXIMITY_IMMEDIATE = new BEACON_PROXIMITY("PROXIMITY_IMMEDIATE", 0, 1);
            PROXIMITY_NEAR = new BEACON_PROXIMITY("PROXIMITY_NEAR", 1, 2);
            PROXIMITY_FAR = new BEACON_PROXIMITY("PROXIMITY_FAR", 2, 3);
            PROXIMITY_UNKNOWN = new BEACON_PROXIMITY("PROXIMITY_UNKNOWN", 3, 0);
            $VALUES = (new BEACON_PROXIMITY[] {
                PROXIMITY_IMMEDIATE, PROXIMITY_NEAR, PROXIMITY_FAR, PROXIMITY_UNKNOWN
            });
        }

        private BEACON_PROXIMITY(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }

    public static interface TimedActionBlock
    {

        public abstract Object call(long l, long l1, Map map);
    }


    private static final String NO_ANALYTICS_MESSAGE = "Analytics - ADBMobile is not configured correctly to use Analytics.";

    public Analytics()
    {
    }

    public static void clearBeacon()
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

            public void run()
            {
                AnalyticsTrackBeacon.clearBeacon();
            }

        });
    }

    public static void clearQueue()
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

            public void run()
            {
                AnalyticsWorker.sharedInstance().clearTrackingQueue();
            }

        });
    }

    public static long getQueueSize()
    {
        FutureTask futuretask = new FutureTask(new Callable() {

            public Long call()
                throws Exception
            {
                return Long.valueOf(AnalyticsWorker.sharedInstance().getTrackingQueueSize());
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

        });
        StaticMethods.getAnalyticsExecutor().execute(futuretask);
        long l;
        try
        {
            l = ((Long)futuretask.get()).longValue();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to get QueueSize (%s)", new Object[] {
                exception.getMessage()
            });
            return 0L;
        }
        return l;
    }

    public static String getTrackingIdentifier()
    {
        Object obj = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public String call()
                throws Exception
            {
                return StaticMethods.getAID();
            }

        });
        StaticMethods.getAnalyticsExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (String)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to get TrackingIdentifier (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((String) (obj));
    }

    public static void processReferrer(Context context, Intent intent)
    {
        StaticMethods.setSharedContext(context);
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(intent) {

            final Intent val$intent;

            public void run()
            {
                ReferrerHandler.processIntent(intent);
            }

            
            {
                intent = intent1;
                super();
            }
        });
    }

    public static void sendQueuedHits()
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

            public void run()
            {
                AnalyticsWorker.sharedInstance().forceKick();
            }

        });
    }

    public static void trackAction(String s, Map map)
    {
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = null;
        }
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(s, map) {

            final String val$action;
            final Map val$cdata;

            public void run()
            {
                AnalyticsTrackAction.trackAction(action, cdata);
            }

            
            {
                action = s;
                cdata = map;
                super();
            }
        });
    }

    public static void trackBeacon(String s, String s1, String s2, BEACON_PROXIMITY beacon_proximity, Map map)
    {
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = null;
        }
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(s, s1, s2, beacon_proximity, map) {

            final Map val$cdata;
            final String val$major;
            final String val$minor;
            final BEACON_PROXIMITY val$proximity;
            final String val$uuid;

            public void run()
            {
                AnalyticsTrackBeacon.trackBeacon(uuid, major, minor, proximity, cdata);
            }

            
            {
                uuid = s;
                major = s1;
                minor = s2;
                proximity = beacon_proximity;
                cdata = map;
                super();
            }
        });
    }

    public static void trackLifetimeValueIncrease(BigDecimal bigdecimal, HashMap hashmap)
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(bigdecimal, hashmap) {

            final BigDecimal val$amount;
            final HashMap val$contextData;

            public void run()
            {
                AnalyticsTrackLifetimeValueIncrease.trackLifetimeValueIncrease(amount, contextData);
            }

            
            {
                amount = bigdecimal;
                contextData = hashmap;
                super();
            }
        });
    }

    public static void trackLocation(Location location, Map map)
    {
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = null;
        }
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(location, map) {

            final Map val$cdata;
            final Location val$location;

            public void run()
            {
                AnalyticsTrackLocation.trackLocation(location, cdata);
            }

            
            {
                location = location1;
                cdata = map;
                super();
            }
        });
    }

    public static void trackState(String s, Map map)
    {
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = null;
        }
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(s, map) {

            final Map val$cdata;
            final String val$state;

            public void run()
            {
                AnalyticsTrackState.trackState(state, cdata);
            }

            
            {
                state = s;
                cdata = map;
                super();
            }
        });
    }

    public static void trackTimedActionEnd(String s, TimedActionBlock timedactionblock)
    {
        StaticMethods.getTimedActionsExecutor().execute(new Runnable(s, timedactionblock) {

            final String val$action;
            final TimedActionBlock val$logic;

            public void run()
            {
                AnalyticsTrackTimedAction.sharedInstance().trackTimedActionEnd(action, logic);
            }

            
            {
                action = s;
                logic = timedactionblock;
                super();
            }
        });
    }

    public static void trackTimedActionStart(String s, Map map)
    {
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = null;
        }
        StaticMethods.getTimedActionsExecutor().execute(new Runnable(s, map) {

            final String val$action;
            final Map val$cdata;

            public void run()
            {
                AnalyticsTrackTimedAction.sharedInstance().trackTimedActionStart(action, cdata);
            }

            
            {
                action = s;
                cdata = map;
                super();
            }
        });
    }

    public static void trackTimedActionUpdate(String s, Map map)
    {
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = null;
        }
        StaticMethods.getTimedActionsExecutor().execute(new Runnable(s, map) {

            final String val$action;
            final Map val$cdata;

            public void run()
            {
                AnalyticsTrackTimedAction.sharedInstance().trackTimedActionUpdate(action, cdata);
            }

            
            {
                action = s;
                cdata = map;
                super();
            }
        });
    }

    public static boolean trackingTimedActionExists(String s)
    {
        return AnalyticsTrackTimedAction.sharedInstance().trackTimedActionExists(s);
    }
}
