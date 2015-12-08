// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import android.content.Context;

// Referenced classes of package com.walmartlabs.android.photo.util:
//            StoredPreferences

public class PhotoSettings
{

    private static final String SETTING_FIRST_START_MESSAGE_DISPLAYED = "setting_first_start_message_displayed";
    private static PhotoSettings sInstance;
    private Context mContext;
    private boolean mPhotoDisabled;

    private PhotoSettings(Context context)
    {
        mContext = context;
    }

    public static PhotoSettings get(Context context)
    {
        com/walmartlabs/android/photo/util/PhotoSettings;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new PhotoSettings(context.getApplicationContext());
        }
        context = sInstance;
        com/walmartlabs/android/photo/util/PhotoSettings;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public boolean firstStartMessageDisplayed()
    {
        return StoredPreferences.get(mContext).getBoolean("setting_first_start_message_displayed");
    }

    public boolean photoEnabled()
    {
        return !mPhotoDisabled;
    }

    public void setFirstStartMessageDisplayed(boolean flag)
    {
        StoredPreferences.get(mContext).putBoolean("setting_first_start_message_displayed", flag);
    }

    public void setPhotoEnabled(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mPhotoDisabled = flag;
    }
}
