// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.debug;

import android.content.Context;
import android.content.SharedPreferences;
import com.walmartlabs.android.photo.util.PhotoLogger;

public class PhotoDebugSettings
{

    public static final int DEBUG_SERVER_TYPE_MOCK = 0;
    public static final int DEBUG_SERVER_TYPE_STAGING = 1;
    public static final int DEBUG_SERVER_TYPE_STAGING_2 = 2;
    private static final String SETTING_ALWAYS_REUPLOAD = "always_reupload";
    private static final String SETTING_DEBUG_SERVER_TYPE = "server_type";
    private static final String SETTING_DISPLAY_UPLOAD_SPEED = "display_upload_speed";
    private static final String TAG = com/walmartlabs/android/photo/util/debug/PhotoDebugSettings.getSimpleName();
    private static PhotoDebugSettings sInstance;
    private SharedPreferences mPrefs;

    private PhotoDebugSettings(Context context)
    {
        mPrefs = context.getSharedPreferences("photo_debug_settings", 0);
    }

    private void clear(String s)
    {
        mPrefs.edit().remove(s).commit();
    }

    public static PhotoDebugSettings get(Context context)
    {
        com/walmartlabs/android/photo/util/debug/PhotoDebugSettings;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new PhotoDebugSettings(context.getApplicationContext());
        }
        context = sInstance;
        com/walmartlabs/android/photo/util/debug/PhotoDebugSettings;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private boolean getBoolean(String s)
    {
        return "true".equalsIgnoreCase(getSetting(s));
    }

    private int getInt(String s, int i)
    {
        int j;
        try
        {
            j = Integer.valueOf(getSetting(s)).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        return j;
    }

    private String getSetting(String s)
    {
        return mPrefs.getString(s, null);
    }

    private void putBoolean(String s, boolean flag)
    {
        putSetting(s, String.valueOf(flag));
    }

    private void putInt(String s, int i)
    {
        putSetting(s, String.valueOf(i));
    }

    private void putSetting(String s, String s1)
    {
        mPrefs.edit().putString(s, s1).commit();
    }

    public boolean alwaysReupload()
    {
        return getBoolean("always_reupload");
    }

    public void clearAll()
    {
        mPrefs.edit().clear().commit();
    }

    public boolean displayUploadSpeed()
    {
        return getBoolean("display_upload_speed");
    }

    public int getDebugServerType()
    {
        return getInt("server_type", -1);
    }

    public void setAlwaysReupload(boolean flag)
    {
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("setAlwaysReupload(): ").append(flag).toString());
        putBoolean("always_reupload", flag);
    }

    public void setDebugServerType(int i)
    {
        if (i == 0 || i == 1 || i == 2)
        {
            putInt("server_type", i);
            return;
        } else
        {
            PhotoLogger.get().d(TAG, "Clearing debug server settings");
            clear("server_type");
            return;
        }
    }

    public void setDisplayUploadSpeed(boolean flag)
    {
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("setDisplayUploadSpeed(): ").append(flag).toString());
        putBoolean("display_upload_speed", flag);
    }

}
