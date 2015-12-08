// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk:
//            KahunaPreferences, KahunaCommon, KahunaSDKConfiguration, ArchiveContainerObject, 
//            Event, KahunaUtils

public class KahunaSDKUpgradeManager
{

    private static final String EVENT_AUTO_LOGOUT = "k_auto_logout";
    protected static final String PREFS_PREV_SDK_VERSION_KEY = "prev_sdk_version";
    private static final int SDK_CONFIG_BUCKETING_ADDED = 514;
    private static final int SDK_CONFIG_BUG_VERSION = 459;
    private static final int SDK_EVENT_CHECKSUM_REFACTOR = 556;
    private static final int SDK_MAP_STORAGE_REFACTOR = 550;
    private static final int SDK_REGION_MONITORING_IMPROVEMENT = 516;
    private static final String SDK_REMOVE_AUTO_LOGOUT = "2.0.3";
    private static final String SDK_USER_ATTRIBUTES_COLLATING = "2.0.2";
    private static final String SDK_V2_WITH_LOGIN = "2.0.0";
    private static long expireTimeToIgnoreFirstRegionEnter = -1L;

    public KahunaSDKUpgradeManager()
    {
    }

    protected static void checkIfSDKUpgraded(KahunaCommon kahunacommon, Context context)
    {
        String s = KahunaPreferences.getPreviousSDKVersion(context);
        if (!s.equalsIgnoreCase(kahunacommon.getSDKVersion()))
        {
            onSDKUpgrade(kahunacommon, context, s, kahunacommon.getSDKVersion());
            KahunaPreferences.savePreviousSDKVersion(kahunacommon.getSDKVersion(), context);
        }
_L1:
        return;
        kahunacommon;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception checking SDK upgrade: ").append(kahunacommon).toString());
            return;
        }
          goto _L1
    }

    private static long getLongSDKVersionFromString(String s)
    {
        long l;
        long l1;
        long l2;
        if (!s.contains("."))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        List list = Arrays.asList(s.split("\\."));
        if (list.size() <= 2)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        l = Long.parseLong((String)list.get(0));
        l1 = Long.parseLong((String)list.get(1));
        l2 = Long.parseLong((String)list.get(2));
        return 0x186a0L * l + l1 * 1000L + l2;
        NumberFormatException numberformatexception;
        numberformatexception;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.w("Kahuna", (new StringBuilder()).append("Version code was not a well formated versioning string + ").append(numberformatexception).toString());
        }
        StringBuilder stringbuilder = new StringBuilder();
        int j = s.length();
        for (int i = 0; i < j; i++)
        {
            char c = s.charAt(i);
            if (Character.isDigit(c))
            {
                stringbuilder.append(c);
            }
        }

        return Long.parseLong(stringbuilder.toString());
    }

    protected static boolean getShouldIgnoreFirstGeofenceEnter(boolean flag)
    {
        long l = System.currentTimeMillis() / 1000L;
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (expireTimeToIgnoreFirstRegionEnter > 0L)
        {
            flag1 = flag2;
            if (expireTimeToIgnoreFirstRegionEnter > l)
            {
                flag1 = true;
            }
        }
        if (flag)
        {
            expireTimeToIgnoreFirstRegionEnter = -1L;
        }
        return flag1;
    }

    private static void onSDKUpgrade(KahunaCommon kahunacommon, Context context, String s, String s1)
    {
        long l = getLongSDKVersionFromString(s);
        if (l >= 459L)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Upgrading from SDK version ").append(s).append(" deleting old SDK Config.").toString());
        }
        KahunaSDKConfiguration.saveSDKConfiguration(context, new KahunaSDKConfiguration());
        if (l >= 514L)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Upgrading from SDK version ").append(s).append(" Setting old config version to 0.").toString());
        }
        s1 = KahunaSDKConfiguration.getSavedSDKConfiguration(context);
        s1.setVersion(0L);
        KahunaSDKConfiguration.saveSDKConfiguration(context, s1);
        if (l == 0L || l >= 516L)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        if (!KahunaPreferences.getSavedRegionIds(kahunacommon, context).isEmpty())
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Upgrading from SDK version ").append(s).append(" with actively monitored regions. Wiping out regions, and setting delay to ignore first enter geofence.").toString());
            }
            KahunaPreferences.saveRegionIds(kahunacommon, null, context);
            expireTimeToIgnoreFirstRegionEnter = System.currentTimeMillis() / 1000L + 0x15180L;
        }
        if (l >= 550L)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Upgrading from SDK version ").append(s).append(" Migrating user credentials and attributes to new storage format.").toString());
        }
        kahunacommon = KahunaPreferences.getOldPrimitivesMapInternal(context, "user_credentials", java/lang/String);
        s1 = KahunaPreferences.getOldPrimitivesMapInternal(context, "user_attributes", java/lang/String);
        KahunaPreferences.saveUserCredentialsOld(kahunacommon, context);
        KahunaPreferences.saveUserAttributes(s1, context);
        if (l >= 556L)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Upgrading from SDK version ").append(s).append(" re-calculating the event object checksums.").toString());
        }
        KahunaPreferences.saveEvents(KahunaPreferences.getSavedEvents(context, true).getArchivedEvents(), context);
        if (l >= getLongSDKVersionFromString("2.0.0")) goto _L2; else goto _L1
_L1:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Upgrading from SDK version ").append(s).append(" migrating credentials to new storage.").toString());
        }
        s1 = KahunaPreferences.getUserCredentialsOld(context);
        if (s1.isEmpty()) goto _L4; else goto _L3
_L3:
        kahunacommon = KahunaPreferences.getUserCredentialsNew(context);
        java.util.Map.Entry entry;
        for (s1 = s1.entrySet().iterator(); s1.hasNext(); ((Set)kahunacommon.get(entry.getKey())).add(entry.getValue()))
        {
            entry = (java.util.Map.Entry)s1.next();
            if (!kahunacommon.containsKey(entry.getKey()))
            {
                kahunacommon.put(entry.getKey(), new HashSet());
            }
        }

          goto _L5
_L35:
        return;
_L5:
        KahunaPreferences.saveUserCredentialsOld(null, context);
        KahunaPreferences.saveUserCredentialsNew(kahunacommon, context);
_L4:
        kahunacommon = KahunaPreferences.getSavedEvents(context, true).getArchivedEvents();
        if (kahunacommon.isEmpty()) goto _L2; else goto _L6
_L6:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", "Adding event numbers to all previous events.");
        }
          goto _L7
_L20:
        int i;
        if (i >= kahunacommon.size()) goto _L9; else goto _L8
_L8:
        boolean flag;
        s1 = (Event)kahunacommon.get(i);
        s1.setEventNumber(i + 1);
        flag = KahunaUtils.isNullOrEmpty(s1.getUserCredentialsString());
        if (flag) goto _L11; else goto _L10
_L10:
        Object obj;
        Object obj1;
        Object obj2;
        obj = new HashMap();
        obj1 = new JSONObject(s1.getUserCredentialsString());
        obj2 = ((JSONObject) (obj1)).keys();
_L19:
        if (!((Iterator) (obj2)).hasNext()) goto _L13; else goto _L12
_L12:
        HashSet hashset;
        String s2;
        hashset = new HashSet();
        s2 = (String)((Iterator) (obj2)).next();
        if (((JSONObject) (obj1)).optJSONArray(s2) == null) goto _L15; else goto _L14
_L14:
        JSONArray jsonarray;
        int k;
        jsonarray = ((JSONObject) (obj1)).optJSONArray(s2);
        k = jsonarray.length();
        int j = 0;
_L45:
        if (j >= k) goto _L17; else goto _L16
_L16:
        String s3 = jsonarray.optString(j);
        if (!KahunaUtils.isNullOrEmpty(s3))
        {
            hashset.add(s3);
        }
          goto _L18
_L15:
        hashset.add(((JSONObject) (obj1)).optString(s2));
_L17:
        ((Map) (obj)).put(s2, hashset);
          goto _L19
        s1;
        Log.e("Kahuna", (new StringBuilder()).append("Caught exception migrating old event credentials from Archive: ").append(s1).toString());
_L11:
        i++;
          goto _L20
_L13:
        s1.setUserCredentials(((Map) (obj)));
          goto _L11
_L9:
        KahunaPreferences.saveEvents(kahunacommon, context);
_L2:
        if (l >= getLongSDKVersionFromString("2.0.2"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Upgrading from SDK version ").append(s).append(" k_user_attributes event reording.").toString());
        }
        obj = KahunaPreferences.getDirtyAttributesKeys(context);
        if (KahunaUtils.isNullOrEmpty(((Set) (obj)))) goto _L22; else goto _L21
_L21:
        s1 = KahunaPreferences.getUserAttributes(context);
        if (KahunaUtils.isNullOrEmpty(s1.keySet())) goto _L22; else goto _L23
_L23:
        kahunacommon = new HashMap();
        obj = ((Set) (obj)).iterator();
_L27:
        if (!((Iterator) (obj)).hasNext()) goto _L25; else goto _L24
_L24:
        obj1 = (String)((Iterator) (obj)).next();
        obj2 = (String)s1.get(obj1);
        if (obj2 == null) goto _L27; else goto _L26
_L26:
        kahunacommon.put(obj1, obj2);
          goto _L27
_L25:
        if (kahunacommon.size() <= 0) goto _L22; else goto _L28
_L28:
        s1 = KahunaPreferences.getSavedEvents(context, true).getArchivedEvents();
        obj = new Event("k_user_attributes");
        ((Event) (obj)).setUserAttributes(kahunacommon);
        if (s1.isEmpty()) goto _L30; else goto _L29
_L29:
        kahunacommon = (Event)s1.get(s1.size() - 1);
_L47:
        if (kahunacommon == null) goto _L32; else goto _L31
_L31:
        if (kahunacommon.getEventNumber() <= 0L) goto _L32; else goto _L33
_L33:
        ((Event) (obj)).setEventNumber(kahunacommon.getEventNumber() + 1L);
_L44:
        s1.add(obj);
        KahunaPreferences.saveEvents(s1, context);
_L22:
        KahunaPreferences.saveDirtyAttributesKeys(null, context);
        if (l >= getLongSDKVersionFromString("2.0.3")) goto _L35; else goto _L34
_L34:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Upgrading from SDK version ").append(s).append(" remove k_auto_logout.").toString());
        }
        s = KahunaPreferences.getSavedEvents(context, true).getArchivedEvents();
        if (KahunaUtils.isNullOrEmpty(s)) goto _L35; else goto _L36
_L36:
        long l1;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", "Migrating k_auto_logout events and re-adding event numbers.");
        }
        l1 = ((Event)s.get(0)).getEventNumber();
        l = l1;
        if (l1 < 1L)
        {
            l = 1L;
        }
        s1 = new ArrayList();
        i = 0;
_L46:
        if (i >= s.size()) goto _L38; else goto _L37
_L37:
        obj = (Event)s.get(i);
        if (!"k_auto_logout".equals(((Event) (obj)).getName())) goto _L40; else goto _L39
_L39:
        if (i + 1 >= s.size())
        {
            break MISSING_BLOCK_LABEL_1382;
        }
        kahunacommon = (Event)s.get(i + 1);
_L48:
        if (kahunacommon == null) goto _L42; else goto _L41
_L41:
        if (!"k_user_login".equals(kahunacommon.getName())) goto _L42; else goto _L43
_L32:
        ((Event) (obj)).setEventNumber(KahunaPreferences.getSavedEventNumber(context));
          goto _L44
_L42:
        ((Event) (obj)).setName("k_user_login");
_L40:
        ((Event) (obj)).setEventNumber(l);
        s1.add(obj);
        l++;
          goto _L43
_L38:
        try
        {
            KahunaPreferences.saveEvents(s1, context);
            KahunaPreferences.saveEventNumber(l, context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (KahunaCommon kahunacommon)
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Exception performing upgrade script: ").append(kahunacommon).toString());
            }
        }
          goto _L35
_L7:
        i = 0;
          goto _L20
_L18:
        j++;
          goto _L45
_L43:
        i++;
          goto _L46
_L30:
        kahunacommon = null;
          goto _L47
        kahunacommon = null;
          goto _L48
    }

}
