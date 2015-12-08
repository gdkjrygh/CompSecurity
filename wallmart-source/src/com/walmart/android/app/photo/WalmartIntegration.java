// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.photo;

import android.content.Context;
import android.content.Intent;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.app.main.MainActivity;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.android.photo.model.user.Contact;
import com.walmartlabs.android.photo.model.user.Store;
import com.walmartlabs.android.photo.net.exception.NotOnMainThreadException;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.util.integration.AppIntegration;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

// Referenced classes of package com.walmart.android.app.photo:
//            PhotoCenterStoresActivity

public class WalmartIntegration
    implements AppIntegration
{

    private static final String TAG = com/walmart/android/app/photo/WalmartIntegration.getSimpleName();
    private Context mContext;

    public WalmartIntegration(Context context)
    {
        mContext = context;
    }

    public static Store fromWalmartStore(WalmartStore walmartstore)
    {
        if (walmartstore == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        Store store;
        store = new Store();
        store.setName(walmartstore.getDescription());
        store.setStreet(walmartstore.getAddress().getStreet1());
        store.setCity(walmartstore.getAddress().getCity());
        store.setState(walmartstore.getAddress().getState());
        store.setZip(Integer.parseInt(walmartstore.getAddress().getZip()));
        store.setId(walmartstore.getStoreNumber());
        store.setPhone(walmartstore.getPhone());
        store.setLatitude(walmartstore.getLatitude());
        store.setLongitude(walmartstore.getLongitude());
        return store;
        walmartstore;
        WLog.w(TAG, (new StringBuilder()).append("Exception during store mapping: ").append(walmartstore).toString());
        WLog.w(TAG, "Failed to map between Walmart store and photo store domains");
        return null;
    }

    public String getCloudId()
    {
        return UAirship.shared().getPushManager().getGcmId();
    }

    public Contact getContact()
    {
        if (!PhotoUtils.onMainThread())
        {
            throw new NotOnMainThreadException("getContact() must be called on the main thread");
        }
        Authentication authentication = Services.get().getAuthentication();
        if (authentication.hasCredentials())
        {
            Contact contact = new Contact();
            contact.setId(authentication.getCustomerId());
            contact.setFirstName(authentication.getFirstName());
            contact.setLastName(authentication.getLastName());
            contact.setEmail(authentication.getUsername());
            return contact;
        } else
        {
            return null;
        }
    }

    public List getCookies()
    {
        Object obj = Services.get().getWalmartService().getCookies();
        ArrayList arraylist = new ArrayList();
        BasicClientCookie basicclientcookie;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(basicclientcookie))
        {
            Cookie cookie = (Cookie)((Iterator) (obj)).next();
            basicclientcookie = new BasicClientCookie(cookie.getName(), cookie.getValue());
            basicclientcookie.setComment(cookie.getComment());
            basicclientcookie.setDomain(cookie.getDomain());
            basicclientcookie.setExpiryDate(cookie.getExpiryDate());
            basicclientcookie.setPath(cookie.getPath());
            basicclientcookie.setSecure(cookie.isSecure());
            basicclientcookie.setVersion(cookie.getVersion());
        }

        return arraylist;
    }

    public long getLastLoginTime()
    {
        if (!PhotoUtils.onMainThread())
        {
            throw new NotOnMainThreadException("getLastLoginTime() must be called on the main thread");
        } else
        {
            return Services.get().getAuthentication().getLastLoginTime();
        }
    }

    public Intent getLoginActivityIntent(Context context)
    {
        if (!PhotoUtils.onMainThread())
        {
            throw new NotOnMainThreadException("getLoginActivityIntent() must be called on the main thread");
        }
        context = new Intent(context, com/walmart/android/app/account/AccountActivity);
        context.putExtra("from", "Photo");
        if (Services.get().getAuthentication().hasCredentials())
        {
            context.putExtra("mode", 2);
        }
        return context;
    }

    public Intent getNotificationReturnIntent()
    {
        Intent intent = new Intent(mContext, com/walmart/android/app/main/MainActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(0x20000);
        intent.setFlags(0x20000000);
        return intent;
    }

    public Store getStore()
    {
        WalmartStore walmartstore = SharedPreferencesUtil.getSavedLocalAdJsonStore(mContext);
        if (walmartstore != null)
        {
            if (walmartstore.hasService("Photo"))
            {
                return fromWalmartStore(walmartstore);
            }
            WLog.d(TAG, "Store found but does not have photo service");
        }
        return null;
    }

    public Intent getStoreSelectionActivityIntent(Context context)
    {
        return new Intent(context, com/walmart/android/app/photo/PhotoCenterStoresActivity);
    }

    public String getUsername()
    {
        if (!PhotoUtils.onMainThread())
        {
            throw new NotOnMainThreadException("getUsername() must be called on the main thread");
        }
        Authentication authentication = Services.get().getAuthentication();
        if (authentication.hasCredentials())
        {
            return authentication.getUsername();
        } else
        {
            return null;
        }
    }

    public boolean hasCredentials()
    {
        if (!PhotoUtils.onMainThread())
        {
            throw new NotOnMainThreadException("hasCredentials() must be called on the main thread");
        } else
        {
            return Services.get().getAuthentication().hasCredentials();
        }
    }

    public boolean isDebugMode()
    {
        return false;
    }

    public void refreshSession(final com.walmartlabs.android.photo.util.integration.AppIntegration.SessionRefreshCallback callback)
    {
        if (!PhotoUtils.onMainThread())
        {
            throw new NotOnMainThreadException("refreshSession() must be called on the main thread");
        } else
        {
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final WalmartIntegration this$0;
                final com.walmartlabs.android.photo.util.integration.AppIntegration.SessionRefreshCallback val$callback;

                public void onFailure(int i)
                {
                    if (callback != null)
                    {
                        boolean flag;
                        if (i == 4 || i == 2 || i == 3)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        callback.onFailure(flag);
                    }
                }

                public void onSuccess()
                {
                    if (callback != null)
                    {
                        callback.onSuccess();
                    }
                }

            
            {
                this$0 = WalmartIntegration.this;
                callback = sessionrefreshcallback;
                super();
            }
            });
            return;
        }
    }

}
