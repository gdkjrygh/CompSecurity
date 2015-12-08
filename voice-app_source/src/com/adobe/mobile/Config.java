// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.app.Activity;
import android.content.Context;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, MobilePrivacyStatus, MobileConfig, MessageAlert, 
//            WearableFunctionBridge, Lifecycle, Messages, AnalyticsTrackLifetimeValueIncrease

public final class Config
{
    public static final class ApplicationType extends Enum
    {

        private static final ApplicationType $VALUES[];
        public static final ApplicationType APPLICATION_TYPE_HANDHELD;
        public static final ApplicationType APPLICATION_TYPE_WEARABLE;
        private final int value;

        public static ApplicationType valueOf(String s)
        {
            return (ApplicationType)Enum.valueOf(com/adobe/mobile/Config$ApplicationType, s);
        }

        public static ApplicationType[] values()
        {
            return (ApplicationType[])$VALUES.clone();
        }

        protected int getValue()
        {
            return value;
        }

        static 
        {
            APPLICATION_TYPE_HANDHELD = new ApplicationType("APPLICATION_TYPE_HANDHELD", 0, 0);
            APPLICATION_TYPE_WEARABLE = new ApplicationType("APPLICATION_TYPE_WEARABLE", 1, 1);
            $VALUES = (new ApplicationType[] {
                APPLICATION_TYPE_HANDHELD, APPLICATION_TYPE_WEARABLE
            });
        }

        private ApplicationType(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }


    public Config()
    {
    }

    public static void collectLifecycleData()
    {
        if (StaticMethods.isWearableApp())
        {
            StaticMethods.logWarningFormat("Analytics - Method collectLifecycleData is not available for Wearable", new Object[0]);
            return;
        } else
        {
            StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

                public void run()
                {
                    Lifecycle.start(null, null);
                }

            });
            return;
        }
    }

    public static void collectLifecycleData(Activity activity)
    {
        if (StaticMethods.isWearableApp())
        {
            StaticMethods.logWarningFormat("Analytics - Method collectLifecycleData is not available for Wearable", new Object[0]);
            return;
        } else
        {
            StaticMethods.getAnalyticsExecutor().execute(new Runnable(activity) {

                final Activity val$activity;

                public void run()
                {
                    Lifecycle.start(activity, null);
                }

            
            {
                activity = activity1;
                super();
            }
            });
            return;
        }
    }

    public static void collectLifecycleData(Activity activity, Map map)
    {
        if (StaticMethods.isWearableApp())
        {
            StaticMethods.logWarningFormat("Analytics - Method collectLifecycleData is not available for Wearable", new Object[0]);
            return;
        } else
        {
            StaticMethods.getAnalyticsExecutor().execute(new Runnable(activity, map) {

                final Activity val$activity;
                final Map val$contextData;

                public void run()
                {
                    Lifecycle.start(activity, contextData);
                }

            
            {
                activity = activity1;
                contextData = map;
                super();
            }
            });
            return;
        }
    }

    public static ApplicationType getApplicationType()
    {
        return StaticMethods.getApplicaionType();
    }

    public static Boolean getDebugLogging()
    {
        return Boolean.valueOf(StaticMethods.getDebugLogging());
    }

    public static BigDecimal getLifetimeValue()
    {
        Object obj = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public BigDecimal call()
                throws Exception
            {
                return AnalyticsTrackLifetimeValueIncrease.getLifetimeValue();
            }

        });
        StaticMethods.getAnalyticsExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (BigDecimal)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to get lifetime value (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((BigDecimal) (obj));
    }

    public static MobilePrivacyStatus getPrivacyStatus()
    {
        Object obj = new FutureTask(new Callable() {

            public MobilePrivacyStatus call()
                throws Exception
            {
                return MobileConfig.getInstance().getPrivacyStatus();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

        });
        StaticMethods.getSharedExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (MobilePrivacyStatus)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to get PrivacyStatus (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((MobilePrivacyStatus) (obj));
    }

    public static String getUserIdentifier()
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
                return StaticMethods.getVisitorID();
            }

        });
        StaticMethods.getAnalyticsExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (String)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to get UserIdentifier (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((String) (obj));
    }

    public static String getVersion()
    {
        return "4.5.0-AN";
    }

    public static void overrideConfigStream(InputStream inputstream)
    {
        MobileConfig.setUserDefinedConfigPath(inputstream);
    }

    public static void pauseCollectingLifecycleData()
    {
        if (StaticMethods.isWearableApp())
        {
            StaticMethods.logWarningFormat("Analytics - Method pauseCollectingLifecycleData is not available for Wearable", new Object[0]);
            return;
        } else
        {
            MessageAlert.clearCurrentDialog();
            StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

                public void run()
                {
                    Lifecycle.stop();
                }

            });
            return;
        }
    }

    public static void setApplicationType(ApplicationType applicationtype)
    {
        StaticMethods.setApplicationType(applicationtype);
    }

    public static void setContext(Context context)
    {
        setContext(context, ApplicationType.APPLICATION_TYPE_HANDHELD);
    }

    public static void setContext(Context context, ApplicationType applicationtype)
    {
        StaticMethods.setSharedContext(context);
        setApplicationType(applicationtype);
        if (applicationtype == ApplicationType.APPLICATION_TYPE_WEARABLE)
        {
            StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

                public void run()
                {
                    WearableFunctionBridge.syncConfigFromHandheld();
                }

            });
        }
    }

    public static void setDebugLogging(Boolean boolean1)
    {
        StaticMethods.setDebugLogging(boolean1.booleanValue());
    }

    public static void setLargeIconResourceId(int i)
    {
        if (StaticMethods.isWearableApp())
        {
            StaticMethods.logWarningFormat("Analytics - Method setLargeIconResourceId is not available for Wearable", new Object[0]);
            return;
        } else
        {
            StaticMethods.getMessagesExecutor().execute(new Runnable(i) {

                final int val$resourceId;

                public void run()
                {
                    Messages.setLargeIconResourceId(resourceId);
                }

            
            {
                resourceId = i;
                super();
            }
            });
            return;
        }
    }

    public static void setPrivacyStatus(MobilePrivacyStatus mobileprivacystatus)
    {
        StaticMethods.getSharedExecutor().execute(new Runnable(mobileprivacystatus) {

            final MobilePrivacyStatus val$status;

            public void run()
            {
                MobileConfig.getInstance().setPrivacyStatus(status);
            }

            
            {
                status = mobileprivacystatus;
                super();
            }
        });
    }

    public static void setSmallIconResourceId(int i)
    {
        if (StaticMethods.isWearableApp())
        {
            StaticMethods.logWarningFormat("Analytics - Method setSmallIconResourceId is not available for Wearable", new Object[0]);
            return;
        } else
        {
            StaticMethods.getMessagesExecutor().execute(new Runnable(i) {

                final int val$resourceId;

                public void run()
                {
                    Messages.setSmallIconResourceId(resourceId);
                }

            
            {
                resourceId = i;
                super();
            }
            });
            return;
        }
    }

    public static void setUserIdentifier(String s)
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(s) {

            final String val$identifier;

            public void run()
            {
                StaticMethods.setVisitorID(identifier);
            }

            
            {
                identifier = s;
                super();
            }
        });
    }
}
