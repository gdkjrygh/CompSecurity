// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

// Referenced classes of package com.walmartlabs.android.photo.util:
//            PhotoCipherUtils, PhotoLogger

public class StoredPreferences
{

    private static final String TAG = com/walmartlabs/android/photo/util/StoredPreferences.getSimpleName();
    private static StoredPreferences sInstance;
    private SharedPreferences mSharedPreferences;

    private StoredPreferences(Context context)
    {
        mSharedPreferences = context.getSharedPreferences("photo_stored_preferences", 0);
    }

    public static StoredPreferences get(Context context)
    {
        com/walmartlabs/android/photo/util/StoredPreferences;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new StoredPreferences(context.getApplicationContext());
        }
        context = sInstance;
        com/walmartlabs/android/photo/util/StoredPreferences;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private String getString(String s, String s1)
    {
        String s3 = mSharedPreferences.getString(s, null);
        String s2 = s1;
        if (!TextUtils.isEmpty(s3))
        {
            try
            {
                s2 = PhotoCipherUtils.decrypt(s3);
            }
            catch (PhotoCipherUtils.CryptoException cryptoexception)
            {
                PhotoLogger.get().d(TAG, (new StringBuilder()).append("getString(): Failed to decrypt preference, removing entry for key '").append(s).append("' and returning defValue: ").append(cryptoexception).toString());
                mSharedPreferences.edit().remove(s).commit();
                return s1;
            }
        }
        return s2;
    }

    public void clearAll()
    {
        mSharedPreferences.edit().clear().commit();
    }

    public boolean getBoolean(String s)
    {
        return "true".equalsIgnoreCase(getString(s));
    }

    public int getInt(String s, int i)
    {
        int j;
        try
        {
            j = Integer.valueOf(getString(s)).intValue();
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
        long l1;
        try
        {
            l1 = Long.valueOf(getString(s)).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public String getString(String s)
    {
        return getString(s, null);
    }

    public void putBoolean(String s, boolean flag)
    {
        putString(s, String.valueOf(flag));
    }

    public void putInt(String s, int i)
    {
        putString(s, String.valueOf(i));
    }

    public void putLong(String s, long l)
    {
        putString(s, String.valueOf(l));
    }

    public void putString(String s, String s1)
    {
        Object obj = null;
        if (s1 != null)
        {
            try
            {
                s1 = PhotoCipherUtils.encrypt(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                PhotoLogger.get().d(TAG, (new StringBuilder()).append("getString(): Failed to encrypt preference for key '").append(s).append("', removing entry instead of saving: ").append(s1).toString());
                s1 = null;
            }
        } else
        {
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("putString(): Removing entry for key ").append(s).toString());
            s1 = obj;
        }
        mSharedPreferences.edit().putString(s, s1).commit();
    }

    public void remove(String s)
    {
        mSharedPreferences.edit().remove(s).commit();
    }

}
