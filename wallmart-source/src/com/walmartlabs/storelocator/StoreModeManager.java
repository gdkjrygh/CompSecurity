// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.msco.service.StoreModeEvent;
import java.io.IOException;

// Referenced classes of package com.walmartlabs.storelocator:
//            ClosestStoreEvent

public class StoreModeManager
{

    private static final String PREF_EVENT = "store_mode_event";
    private static final String SHARED_PREF = "store_mode_manager";
    private static final String TAG = com/walmartlabs/storelocator/StoreModeManager.getSimpleName();
    private static StoreModeManager sInstance;
    private Context mContext;
    private StoreModeEvent mEvent;
    private boolean mForced;
    private boolean mSaveStoreEventEnabled;

    private StoreModeManager(Context context)
    {
        mContext = context;
        mSaveStoreEventEnabled = true;
    }

    public static StoreModeManager create(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new StoreModeManager(context);
            sInstance.init();
        }
        return sInstance;
    }

    public static void destroy()
    {
        if (sInstance != null)
        {
            MessageBus.getBus().unregister(sInstance);
            sInstance = null;
        }
    }

    private StoreModeEvent getSavedEvent()
    {
        StoreModeEvent storemodeevent = null;
        String s = mContext.getSharedPreferences("store_mode_manager", 0).getString("store_mode_event", "");
        JsonMapper jsonmapper = new JsonMapper();
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                storemodeevent = (StoreModeEvent)jsonmapper.readValue(s, com/walmartlabs/msco/service/StoreModeEvent);
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                return null;
            }
        }
        return storemodeevent;
    }

    private void postEvent(StoreModeEvent storemodeevent)
    {
        mEvent = storemodeevent;
        if (mSaveStoreEventEnabled)
        {
            saveEvent(mEvent);
        }
        MessageBus.getBus().post(mEvent);
    }

    private void saveEvent(StoreModeEvent storemodeevent)
    {
        SharedPreferences sharedpreferences = mContext.getSharedPreferences("store_mode_manager", 0);
        JsonMapper jsonmapper = new JsonMapper();
        try
        {
            storemodeevent = jsonmapper.writeValueAsString(storemodeevent);
        }
        // Misplaced declaration of an exception variable
        catch (StoreModeEvent storemodeevent)
        {
            storemodeevent.printStackTrace();
            storemodeevent = "";
        }
        sharedpreferences.edit().putString("store_mode_event", storemodeevent).apply();
    }

    public StoreModeEvent getStoreModeEvent()
    {
        StoreModeEvent storemodeevent1 = mEvent;
        StoreModeEvent storemodeevent = storemodeevent1;
        if (storemodeevent1 == null)
        {
            storemodeevent = storemodeevent1;
            if (mSaveStoreEventEnabled)
            {
                storemodeevent = getSavedEvent();
            }
        }
        storemodeevent1 = storemodeevent;
        if (storemodeevent == null)
        {
            storemodeevent1 = new StoreModeEvent();
        }
        return storemodeevent1;
    }

    public void init()
    {
        MessageBus.getBus().register(this);
    }

    public void onClosestStoreEvent(ClosestStoreEvent closeststoreevent)
    {
        StoreModeEvent storemodeevent1;
        storemodeevent1 = null;
        if (mEvent == null)
        {
            storemodeevent1 = new StoreModeEvent();
        }
        if (mEvent != null && mEvent.isInStore()) goto _L2; else goto _L1
_L1:
        StoreModeEvent storemodeevent;
        storemodeevent = storemodeevent1;
        if (closeststoreevent.mStoreId != null)
        {
            boolean flag1 = closeststoreevent.mForced;
            boolean flag = flag1;
            if (!flag1)
            {
                flag = flag1;
                if (closeststoreevent.mDistanceFromStore <= closeststoreevent.mAccuracy + 500F)
                {
                    flag = true;
                }
            }
            storemodeevent = storemodeevent1;
            if (flag)
            {
                mForced = closeststoreevent.mForced;
                if (closeststoreevent.mStoreData != null)
                {
                    storemodeevent = new StoreModeEvent(closeststoreevent.mStoreData);
                } else
                {
                    storemodeevent = new StoreModeEvent(closeststoreevent.mStoreId, closeststoreevent.mStoreName);
                }
            }
        }
_L4:
        if (storemodeevent != null)
        {
            postEvent(storemodeevent);
        }
        return;
_L2:
        storemodeevent = storemodeevent1;
        if (mForced)
        {
            mForced = closeststoreevent.mForced;
            if (mForced)
            {
                if (closeststoreevent.mStoreData != null)
                {
                    storemodeevent = new StoreModeEvent(closeststoreevent.mStoreData);
                } else
                {
                    storemodeevent = new StoreModeEvent(closeststoreevent.mStoreId, closeststoreevent.mStoreName);
                }
            } else
            {
                storemodeevent = new StoreModeEvent();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSaveStoreEventEnabled(boolean flag)
    {
        mSaveStoreEventEnabled = flag;
    }

}
