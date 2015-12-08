// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

// Referenced classes of package com.urbanairship:
//            Preferences, UrbanAirshipProvider, PreferencesResolver, Logger

private static class registerObserver
{

    private volatile boolean isUpdated;
    private final String key;
    private final PreferencesResolver resolver;
    private volatile String value;

    private void registerObserver()
    {
        ContentObserver contentobserver = new ContentObserver(null) {

            final Preferences.Preference this$0;

            public void onChange(boolean flag)
            {
                super.onChange(flag);
                Logger.verbose((new StringBuilder()).append("Preference updated:").append(key).toString());
                isUpdated = false;
            }

            
            {
                this$0 = Preferences.Preference.this;
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
    static boolean access$102(_cls1 _pcls1, boolean flag)
    {
        _pcls1.isUpdated = flag;
        return flag;
    }

*/

    _cls1.this._cls0(String s, PreferencesResolver preferencesresolver)
    {
        isUpdated = false;
        key = s;
        resolver = preferencesresolver;
        registerObserver();
    }
}
