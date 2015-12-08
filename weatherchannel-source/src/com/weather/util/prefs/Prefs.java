// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.time.TimeOfDay;
import java.util.concurrent.TimeUnit;

public class Prefs
{

    private static final String TAG = "Prefs";
    private volatile android.content.SharedPreferences.Editor editor;
    private final Object lock = new Object();
    private final String name;
    private final SharedPreferences prefs;

    public Prefs(String s)
    {
        name = s;
        prefs = AbstractTwcApplication.getRootContext().getSharedPreferences(s, 0);
    }

    public void clear()
    {
        LogUtil.d("Prefs", LoggingMetaTags.TWC_GENERAL, "clear name=%s", new Object[] {
            name
        });
        getEditor().clear().apply();
    }

    public boolean contains(Enum enum)
    {
        return prefs.contains(enum.toString());
    }

    public boolean getBoolean(Enum enum, boolean flag)
    {
        boolean flag1;
        try
        {
            flag1 = prefs.getBoolean(enum.toString(), flag);
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            return flag;
        }
        return flag1;
    }

    public double getDouble(Enum enum, double d)
    {
        double d1;
        try
        {
            d1 = Double.longBitsToDouble(prefs.getLong(enum.toString(), Double.doubleToRawLongBits(d)));
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            return d;
        }
        return d1;
    }

    public android.content.SharedPreferences.Editor getEditor()
    {
        Object obj;
        obj = editor;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        Object obj1 = lock;
        obj1;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor1 = editor;
        obj = editor1;
        if (editor1 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj = prefs.edit();
        editor = ((android.content.SharedPreferences.Editor) (obj));
        obj1;
        JVM INSTR monitorexit ;
        return ((android.content.SharedPreferences.Editor) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        return ((android.content.SharedPreferences.Editor) (obj));
    }

    public float getFloat(Enum enum, float f)
    {
        float f1;
        try
        {
            f1 = prefs.getFloat(enum.toString(), f);
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            return f;
        }
        return f1;
    }

    public int getInt(Enum enum, int i)
    {
        int j;
        try
        {
            j = prefs.getInt(enum.toString(), i);
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            return i;
        }
        return j;
    }

    public long getLong(Enum enum, long l)
    {
        long l1;
        try
        {
            l1 = prefs.getLong(enum.toString(), l);
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            return l;
        }
        return l1;
    }

    public String getString(Enum enum, String s)
    {
        try
        {
            enum = prefs.getString(enum.toString(), s);
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            return s;
        }
        return enum;
    }

    public TimeOfDay getTimeOfDay(Enum enum, TimeOfDay timeofday)
    {
        int i = getInt(enum, timeofday.getTime());
        try
        {
            enum = TimeOfDay.valueOf(i, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            return timeofday;
        }
        return enum;
    }

    public void putBoolean(Enum enum, boolean flag)
    {
        LogUtil.d("Prefs", LoggingMetaTags.TWC_GENERAL, "putBoolean name=%s, key=%s, value=%s", new Object[] {
            name, enum, Boolean.valueOf(flag)
        });
        getEditor().putBoolean(enum.toString(), flag).apply();
    }

    public void putDouble(Enum enum, double d)
    {
        LogUtil.d("Prefs", LoggingMetaTags.TWC_GENERAL, "putDouble name=%s, key=%s, value=%s", new Object[] {
            name, enum, Double.valueOf(d)
        });
        getEditor().putLong(enum.toString(), Double.doubleToRawLongBits(d)).apply();
    }

    public void putFloat(Enum enum, float f)
    {
        LogUtil.d("Prefs", LoggingMetaTags.TWC_GENERAL, "putFloat name=%s, key=%s, value=%s", new Object[] {
            name, enum, Float.valueOf(f)
        });
        getEditor().putFloat(enum.toString(), f).apply();
    }

    public void putInt(Enum enum, int i)
    {
        LogUtil.d("Prefs", LoggingMetaTags.TWC_GENERAL, "putInt name=%s, key=%s, value=%s", new Object[] {
            name, enum, Integer.valueOf(i)
        });
        getEditor().putInt(enum.toString(), i).apply();
    }

    public void putLong(Enum enum, long l)
    {
        LogUtil.d("Prefs", LoggingMetaTags.TWC_GENERAL, "putLong name=%s, key=%s, value=%s", new Object[] {
            name, enum, Long.valueOf(l)
        });
        getEditor().putLong(enum.toString(), l).apply();
    }

    public void putString(Enum enum, String s)
    {
        LogUtil.d("Prefs", LoggingMetaTags.TWC_GENERAL, "putString name=%s, key=%s, value=%s", new Object[] {
            name, enum, s
        });
        getEditor().putString(enum.toString(), s).apply();
    }

    public void putTimeOfDay(Enum enum, TimeOfDay timeofday)
    {
        if (timeofday == null)
        {
            getEditor().remove(enum.toString()).apply();
            return;
        } else
        {
            getEditor().putInt(enum.toString(), timeofday.getTime()).apply();
            return;
        }
    }

    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        prefs.registerOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
    }

    public void remove(Enum enum)
    {
        LogUtil.d("Prefs", LoggingMetaTags.TWC_GENERAL, "remove name=%s, key=%s", new Object[] {
            name, enum
        });
        getEditor().remove(enum.toString()).apply();
    }

    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        prefs.unregisterOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
    }
}
