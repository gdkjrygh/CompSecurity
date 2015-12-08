// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.SharedPreferences;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, AnalyticsTrackInternal

final class AnalyticsTrackLifetimeValueIncrease
{

    private static final String LOCAL_STORAGE_LIFETIME_VALUE_KEY = "ADB_LIFETIME_VALUE";
    private static final String LTV_ACTION_NAME = "LifetimeValueIncrease";
    protected static final String LTV_AMOUNT_KEY = "a.ltv.amount";
    private static final String LTV_INCREASE_KEY = "a.ltv.increase";
    private static final Object _lifetimeValueMutex = new Object();

    AnalyticsTrackLifetimeValueIncrease()
    {
    }

    protected static BigDecimal getLifetimeValue()
    {
        Object obj1 = _lifetimeValueMutex;
        obj1;
        JVM INSTR monitorenter ;
        BigDecimal bigdecimal = new BigDecimal(StaticMethods.getSharedPreferences().getString("ADB_LIFETIME_VALUE", "0"));
_L2:
        return bigdecimal;
        Object obj;
        obj;
        obj = new BigDecimal("0");
        continue; /* Loop/switch isn't completed */
        obj;
        StaticMethods.logErrorFormat("Analytics - Error getting current lifetime value:(%s).", new Object[] {
            ((StaticMethods.NullContextException) (obj)).getMessage()
        });
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private static void incrementLifetimeValue(BigDecimal bigdecimal)
    {
        Object obj = _lifetimeValueMutex;
        obj;
        JVM INSTR monitorenter ;
        BigDecimal bigdecimal1 = getLifetimeValue();
        if (bigdecimal == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        if (bigdecimal.signum() != -1 && bigdecimal1 != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        setLifetimeValue(bigdecimal1.add(bigdecimal));
        obj;
        JVM INSTR monitorexit ;
        return;
        bigdecimal;
        obj;
        JVM INSTR monitorexit ;
        throw bigdecimal;
    }

    protected static void setLifetimeValue(BigDecimal bigdecimal)
    {
        Object obj = _lifetimeValueMutex;
        obj;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = StaticMethods.getSharedPreferencesEditor();
        if (bigdecimal == null) goto _L2; else goto _L1
_L1:
        if (bigdecimal.signum() != -1) goto _L3; else goto _L2
_L2:
        editor.putString("ADB_LIFETIME_VALUE", "0.00");
_L4:
        editor.commit();
_L5:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        editor.putString("ADB_LIFETIME_VALUE", bigdecimal.toString());
          goto _L4
        bigdecimal;
        StaticMethods.logErrorFormat("Analytics - Error updating lifetime value: (%s).", new Object[] {
            bigdecimal.getMessage()
        });
          goto _L5
        bigdecimal;
        obj;
        JVM INSTR monitorexit ;
        throw bigdecimal;
          goto _L4
    }

    public static void trackLifetimeValueIncrease(BigDecimal bigdecimal, Map map)
    {
        if (bigdecimal == null || bigdecimal.signum() == -1)
        {
            StaticMethods.logWarningFormat("Analytics - trackLifetimeValueIncrease failed, invalid amount specified '%f'", new Object[] {
                bigdecimal
            });
        } else
        {
            incrementLifetimeValue(bigdecimal);
            HashMap hashmap = new HashMap();
            if (map != null)
            {
                hashmap.putAll(map);
            }
            if (getLifetimeValue() != null)
            {
                hashmap.put("a.ltv.amount", getLifetimeValue());
                hashmap.put("a.ltv.increase", bigdecimal);
                AnalyticsTrackInternal.trackInternal("LifetimeValueIncrease", hashmap, StaticMethods.getTimeSince1970());
                return;
            }
        }
    }

}
