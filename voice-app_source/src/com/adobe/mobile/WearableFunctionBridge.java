// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, MobileConfig

final class WearableFunctionBridge
{

    private static Class configSynchronizerClassLoader;
    private static Class wearableFunctionClassLoader;

    WearableFunctionBridge()
    {
    }

    private static Class getConfigSynchronizerClass()
    {
        if (configSynchronizerClassLoader != null)
        {
            return configSynchronizerClassLoader;
        }
        try
        {
            configSynchronizerClassLoader = com/adobe/mobile/WearableFunctionBridge.getClassLoader().loadClass("com.adobe.mobile.ConfigSynchronizer");
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Wearable - Failed to load class com.adobe.mobile.ConfigSynchronizer", new Object[] {
                exception.getLocalizedMessage()
            });
        }
        return configSynchronizerClassLoader;
    }

    private static Class getWearableFunctionClass()
    {
        if (wearableFunctionClassLoader != null)
        {
            return wearableFunctionClassLoader;
        }
        try
        {
            wearableFunctionClassLoader = com/adobe/mobile/WearableFunctionBridge.getClassLoader().loadClass("com.adobe.mobile.WearableFunction");
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Wearable - Failed to load class com.adobe.mobile.WearableFunction", new Object[] {
                exception.getLocalizedMessage()
            });
        }
        return wearableFunctionClassLoader;
    }

    protected static boolean isGooglePlayServicesEnabled()
    {
        Object obj;
        obj = com/adobe/mobile/WearableFunctionBridge.getClassLoader().loadClass("com.google.android.gms.common.GoogleApiAvailability");
        Object obj3 = ((Class) (obj)).getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        obj = ((Class) (obj)).getDeclaredMethod("isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        }).invoke(obj3, new Object[] {
            StaticMethods.getSharedContext()
        });
        if (!(obj instanceof Integer)) goto _L2; else goto _L1
_L1:
        int i = ((Integer)obj).intValue();
        if (i != 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
        Object obj1;
        obj1;
        StaticMethods.logDebugFormat("Wearable - Google Play Services is not enabled in your app's AndroidManifest.xml", new Object[] {
            ((IllegalStateException) (obj1)).getLocalizedMessage()
        });
_L2:
        Object obj2 = com/adobe/mobile/WearableFunctionBridge.getClassLoader().loadClass("com.google.android.gms.common.GooglePlayServicesUtil").getDeclaredMethod("isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        }).invoke(null, new Object[] {
            StaticMethods.getSharedContext()
        });
        if (!(obj2 instanceof Integer))
        {
            break MISSING_BLOCK_LABEL_177;
        }
        i = ((Integer)obj2).intValue();
        if (i != 0)
        {
            return false;
        }
          goto _L3
        obj2;
        StaticMethods.logDebugFormat("Wearable - Google Play Services is not enabled in your app's AndroidManifest.xml", new Object[] {
            ((IllegalStateException) (obj2)).getLocalizedMessage()
        });
_L6:
        return false;
        obj2;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
          goto _L2
    }

    protected static byte[] retrieveData(String s, Map map, int i, String s1)
    {
        s = ((String) (getWearableFunctionClass().getDeclaredMethod("retrieveData", new Class[] {
            java/lang/String, java/util/Map, Integer.TYPE, java/lang/String
        }).invoke(null, new Object[] {
            s, map, Integer.valueOf(i), s1
        })));
        if (!(s instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        s = (byte[])(byte[])s;
        return s;
        s;
        StaticMethods.logErrorFormat("Wearable - Error sending request (%s)", new Object[] {
            s.getLocalizedMessage()
        });
        return null;
    }

    protected static boolean sendAnalyticsRequest(String s, String s1, Map map, int i)
    {
        boolean flag = false;
        try
        {
            s = ((String) (getWearableFunctionClass().getDeclaredMethod("sendAnalyticsRequest", new Class[] {
                java/lang/String, java/lang/String, java/util/Map, Integer.TYPE
            }).invoke(null, new Object[] {
                s, s1, map, Integer.valueOf(i)
            })));
            if (s instanceof Boolean)
            {
                flag = ((Boolean)s).booleanValue();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Wearable - Error sending request (%s)", new Object[] {
                s.getLocalizedMessage()
            });
            return false;
        }
        return flag;
    }

    protected static void sendGenericRequest(String s, Map map, int i, String s1)
    {
        try
        {
            getWearableFunctionClass().getDeclaredMethod("sendGenericRequest", new Class[] {
                java/lang/String, java/util/Map, Integer.TYPE, java/lang/String
            }).invoke(null, new Object[] {
                s, map, Integer.valueOf(i), s1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Wearable - Error sending request (%s)", new Object[] {
                s.getLocalizedMessage()
            });
        }
    }

    protected static boolean shouldSendHit()
    {
        if (StaticMethods.isWearableApp()) goto _L2; else goto _L1
_L1:
        Object obj;
        return true;
_L2:
        if (!((obj = getWearableFunctionClass().getDeclaredMethod("shouldSendHit", new Class[0]).invoke(null, new Object[0])) instanceof Boolean)) goto _L1; else goto _L3
_L3:
        boolean flag = ((Boolean)obj).booleanValue();
        return flag;
        Exception exception;
        exception;
        StaticMethods.logErrorFormat("Wearable - Error checking status of handheld app (%s)", new Object[] {
            exception.getLocalizedMessage()
        });
        return true;
    }

    protected static void syncConfigFromHandheld()
    {
        if (!StaticMethods.isWearableApp())
        {
            return;
        }
        try
        {
            getConfigSynchronizerClass().getDeclaredMethod("syncConfigFromHandheld", new Class[0]).invoke(null, new Object[0]);
            return;
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Wearable - Error syncing config (%s)", new Object[] {
                exception.getLocalizedMessage()
            });
        }
    }

    protected static void syncPrivacyStatusToWearable(int i)
    {
        if (StaticMethods.isWearableApp() || !MobileConfig.getInstance().mobileUsingGooglePlayServices())
        {
            return;
        }
        try
        {
            getConfigSynchronizerClass().getDeclaredMethod("syncPrivacyStatus", new Class[] {
                Integer.TYPE
            }).invoke(null, new Object[] {
                Integer.valueOf(i)
            });
            return;
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Wearable - Error syncing privacy status (%s)", new Object[] {
                exception.getLocalizedMessage()
            });
        }
    }

    protected static void syncVidServiceToWearable(String s, String s1, String s2, long l, long l1)
    {
        if (StaticMethods.isWearableApp() || !MobileConfig.getInstance().mobileUsingGooglePlayServices())
        {
            return;
        }
        try
        {
            getConfigSynchronizerClass().getDeclaredMethod("syncVidService", new Class[] {
                java/lang/String, java/lang/String, java/lang/String, Long.TYPE, Long.TYPE
            }).invoke(null, new Object[] {
                s, s1, s2, Long.valueOf(l), Long.valueOf(l1)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Wearable - Error syncing vistor id service (%s)", new Object[] {
                s.getLocalizedMessage()
            });
        }
    }

    protected static void syncVisitorIDToWearable(String s)
    {
        if (StaticMethods.isWearableApp() || !MobileConfig.getInstance().mobileUsingGooglePlayServices())
        {
            return;
        }
        try
        {
            getConfigSynchronizerClass().getDeclaredMethod("syncVisitorID", new Class[] {
                java/lang/String
            }).invoke(null, new Object[] {
                s
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Wearable - Error syncing visitor id (%s)", new Object[] {
                s.getLocalizedMessage()
            });
        }
    }
}
