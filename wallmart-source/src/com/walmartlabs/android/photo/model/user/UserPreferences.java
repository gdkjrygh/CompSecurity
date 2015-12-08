// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.user;

import android.content.Context;
import android.text.TextUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.StoredPreferences;
import com.walmartlabs.android.photo.util.integration.AppIntegration;
import com.walmartlabs.android.photo.util.integration.AppIntegrationFactory;
import org.json.JSONException;

// Referenced classes of package com.walmartlabs.android.photo.model.user:
//            Contact, Store

public class UserPreferences
{

    private static final String SETTING_PHONE = "prefs_phone";
    private static final String SETTING_STORE = "prefs_store";
    private static final String TAG = com/walmartlabs/android/photo/model/user/UserPreferences.getSimpleName();
    private static UserPreferences sInstance;
    private AppIntegration mAppIntegration;
    private Context mContext;

    private UserPreferences(Context context)
    {
        mContext = context;
        mAppIntegration = AppIntegrationFactory.create(context);
    }

    public static UserPreferences get(Context context)
    {
        com/walmartlabs/android/photo/model/user/UserPreferences;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new UserPreferences(context.getApplicationContext());
        }
        context = sInstance;
        com/walmartlabs/android/photo/model/user/UserPreferences;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private String getPhone()
    {
        return StoredPreferences.get(mContext).getString("prefs_phone");
    }

    public void clearPreferences()
    {
        StoredPreferences.get(mContext).remove("prefs_store");
        StoredPreferences.get(mContext).remove("prefs_phone");
    }

    public Contact getContact()
    {
        Contact contact;
        Contact contact1;
        if (mAppIntegration != null)
        {
            contact = mAppIntegration.getContact();
        } else
        {
            contact = null;
        }
        contact1 = new Contact();
        if (contact != null)
        {
            contact1.setEmail(contact.getEmail());
            contact1.setId(contact.getId());
            contact1.setFirstName(contact.getFirstName());
            contact1.setLastName(contact.getLastName());
            contact1.setPhone(getPhone());
            return contact1;
        } else
        {
            contact1.setPhone(getPhone());
            return contact1;
        }
    }

    public Store getStore()
    {
        String s = StoredPreferences.get(mContext).getString("prefs_store");
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        Store store1 = Store.fromJson(s);
_L4:
        return store1;
        JSONException jsonexception;
        jsonexception;
        PhotoLogger.get().d(TAG, "getStore(): Failed to parse saved store");
_L2:
        Store store;
        if (mAppIntegration != null)
        {
            store = mAppIntegration.getStore();
        } else
        {
            store = null;
        }
        store1 = store;
        if (store == null)
        {
            return new Store();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setPhone(String s)
    {
        StoredPreferences.get(mContext).putString("prefs_phone", s);
    }

    public void setStore(Store store)
    {
        try
        {
            store = store.asJson();
            StoredPreferences.get(mContext).putString("prefs_store", store);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Store store)
        {
            PhotoLogger.get().d(TAG, "setStore(): Failed to parse selected store, nothing saved");
        }
    }

}
