// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.urbanairship:
//            PreferencesResolver, Logger, UAirship, UrbanAirshipProvider

public class Preferences
{
    private static class Preference
    {

        private volatile boolean isUpdated;
        private final String key;
        private final PreferencesResolver resolver;
        private volatile String value;

        private void registerObserver()
        {
            ContentObserver contentobserver = new ContentObserver(null) {

                final Preference this$0;

                public void onChange(boolean flag)
                {
                    super.onChange(flag);
                    Logger.verbose((new StringBuilder()).append("Preference updated:").append(key).toString());
                    isUpdated = false;
                }

            
            {
                this$0 = Preference.this;
                super(handler);
            }
            };
            Uri uri = Uri.withAppendedPath(UrbanAirshipProvider.getPreferencesContentUri(), key);
            resolver.registerContentObserver(uri, true, contentobserver);
        }

        String getValue()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = isUpdated;
            if (flag) goto _L2; else goto _L1
_L1:
            Object obj = null;
            Cursor cursor = resolver.get(key);
            if (cursor == null) goto _L4; else goto _L3
_L3:
            obj = cursor;
            if (!cursor.moveToFirst()) goto _L6; else goto _L5
_L5:
            obj = cursor;
            String s = cursor.getString(0);
_L11:
            obj = cursor;
            value = s;
            obj = cursor;
            isUpdated = true;
_L9:
            if (cursor == null) goto _L2; else goto _L7
_L7:
            cursor.close();
_L2:
            obj = value;
            this;
            JVM INSTR monitorexit ;
            return ((String) (obj));
_L6:
            s = null;
            continue; /* Loop/switch isn't completed */
_L4:
            obj = cursor;
            Logger.warn((new StringBuilder()).append("Unable to get preference ").append(key).append(" from").append(" database. Falling back to cached value.").toString());
            if (true) goto _L9; else goto _L8
_L8:
            Exception exception1;
            exception1;
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            ((Cursor) (obj)).close();
            throw exception1;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            if (true) goto _L11; else goto _L10
_L10:
        }

        boolean setValue(String s)
        {
            boolean flag = true;
            this;
            JVM INSTR monitorenter ;
            if (!isUpdated) goto _L2; else goto _L1
_L1:
            if (s != null) goto _L4; else goto _L3
_L3:
            if (value != null) goto _L2; else goto _L5
_L5:
            Logger.verbose("Preference already up to date");
_L6:
            this;
            JVM INSTR monitorexit ;
            return flag;
_L4:
            if (s.equals(value)) goto _L5; else goto _L2
_L2:
            value = s;
            isUpdated = false;
            if (s != null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            Logger.verbose((new StringBuilder()).append("Removing preference: ").append(key).toString());
            if (resolver.remove(key) < 0)
            {
                flag = false;
            }
              goto _L6
            Logger.verbose((new StringBuilder()).append("Saving preference: ").append(key).append(" value: ").append(s).toString());
            s = resolver.put(key, s);
            if (s == null)
            {
                flag = false;
            }
              goto _L6
            s;
            throw s;
        }



/*
        static boolean access$102(Preference preference, boolean flag)
        {
            preference.isUpdated = flag;
            return flag;
        }

*/

        Preference(String s, PreferencesResolver preferencesresolver)
        {
            isUpdated = false;
            key = s;
            resolver = preferencesresolver;
            registerObserver();
        }
    }


    private final Map preferences;
    private PreferencesResolver resolver;

    public Preferences(Context context)
    {
        this(new PreferencesResolver(context));
    }

    Preferences(PreferencesResolver preferencesresolver)
    {
        preferences = new HashMap();
        resolver = preferencesresolver;
    }

    private Preference getPreference(String s)
    {
        Map map = preferences;
        map;
        JVM INSTR monitorenter ;
        if (!preferences.containsKey(s)) goto _L2; else goto _L1
_L1:
        s = (Preference)preferences.get(s);
_L4:
        return s;
_L2:
        Preference preference;
        preference = new Preference(s, resolver);
        preferences.put(s, preference);
        s = preference;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean getBoolean(String s, boolean flag)
    {
        s = getPreference(s).getValue();
        if (s == null)
        {
            return flag;
        } else
        {
            return Boolean.valueOf(s).booleanValue();
        }
    }

    public float getFloat(String s, float f)
    {
        s = getPreference(s).getValue();
        if (s == null)
        {
            return f;
        }
        float f1;
        try
        {
            f1 = Float.parseFloat(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return f;
        }
        return f1;
    }

    public int getInt(String s, int i)
    {
        s = getPreference(s).getValue();
        if (s == null)
        {
            return i;
        }
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        return j;
    }

    public long getLong(String s, long l)
    {
        s = getPreference(s).getValue();
        if (s == null)
        {
            return l;
        }
        long l1;
        try
        {
            l1 = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public String getString(String s, String s1)
    {
        s = getPreference(s).getValue();
        if (s == null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    protected void migratePreferencesFromFileToDb(String s)
    {
        Logger.verbose((new StringBuilder()).append("Migrating ").append(s).toString());
        SharedPreferences sharedpreferences = UAirship.shared().getApplicationContext().getSharedPreferences(s, 4);
        Object obj = sharedpreferences.getAll();
        int j = ((Map) (obj)).size();
        Logger.verbose((new StringBuilder()).append("Found ").append(j).append(" preferences to migrate.").toString());
        if (j > 0)
        {
            ContentValues acontentvalues[] = new ContentValues[j];
            int i = 0;
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                Logger.verbose((new StringBuilder()).append("Adding ").append((String)entry.getKey()).append(":").append(entry.getValue()).append(" to the insert.").toString());
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("_id", (String)entry.getKey());
                contentvalues.put("value", String.valueOf(entry.getValue()));
                acontentvalues[i] = contentvalues;
                i++;
            }

            Logger.verbose("Inserting in bulk");
            i = resolver.bulkInsert(UrbanAirshipProvider.getPreferencesContentUri(), acontentvalues);
            Logger.verbose((new StringBuilder()).append(i).append(" rows inserted successfully.").toString());
            if (i == j)
            {
                Logger.verbose((new StringBuilder()).append("Migration was a success, wiping ").append(s).toString());
                sharedpreferences.edit().clear().commit();
            }
        }
    }

    public boolean put(String s, Object obj)
    {
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = String.valueOf(obj);
        }
        return getPreference(s).setValue(((String) (obj)));
    }

    public boolean remove(String s)
    {
        return put(s, null);
    }
}
