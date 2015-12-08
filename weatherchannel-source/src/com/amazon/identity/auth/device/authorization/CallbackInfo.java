// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.authorization;

import android.text.TextUtils;
import com.amazon.identity.auth.device.authorization.api.AuthorizationListener;
import com.amazon.identity.auth.device.utils.MAPLog;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class CallbackInfo
{

    private static final String LOG_TAG = com/amazon/identity/auth/device/authorization/CallbackInfo.getName();
    private static final int MAX_OUTSTANDING = 10;
    private static final Map browserCallbacks = new HashMap();
    private static final Object lock = new Object();
    public final String mClientId;
    public final Date mDateCreated;
    public final String mRequestId;
    public final String mRequestedScopes[];
    public final AuthorizationListener mlistener;

    CallbackInfo(Date date, String s, String s1, String as[], AuthorizationListener authorizationlistener)
    {
        mDateCreated = date;
        mClientId = s1;
        mRequestedScopes = as;
        mRequestId = s;
        mlistener = authorizationlistener;
        browserCallbacks.put(s, this);
    }

    static void addCallbackInfo(CallbackInfo callbackinfo)
    {
        synchronized (lock)
        {
            cleanUp();
            browserCallbacks.put(callbackinfo.mRequestId, callbackinfo);
        }
        return;
        callbackinfo;
        obj;
        JVM INSTR monitorexit ;
        throw callbackinfo;
    }

    static void cleanUp()
    {
        if (browserCallbacks.size() > 10)
        {
            long l = 0x7fffffffffffffffL;
            CallbackInfo callbackinfo = null;
            Iterator iterator = browserCallbacks.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (((CallbackInfo)entry.getValue()).mDateCreated != null)
                {
                    long l1 = ((CallbackInfo)entry.getValue()).mDateCreated.getTime();
                    if (l1 < l)
                    {
                        l = l1;
                        callbackinfo = (CallbackInfo)entry.getValue();
                    }
                } else
                {
                    browserCallbacks.remove(((CallbackInfo)entry.getValue()).mRequestId);
                }
            } while (true);
            if (callbackinfo != null)
            {
                MAPLog.i(LOG_TAG, (new StringBuilder()).append("Removing oldest request id=").append(callbackinfo.mRequestId).toString());
                browserCallbacks.remove(callbackinfo.mRequestId);
            }
        }
    }

    static void cleanUpAll()
    {
        browserCallbacks.clear();
    }

    static CallbackInfo getCallbackInfo(String s)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        s = (CallbackInfo)browserCallbacks.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        browserCallbacks.remove(((CallbackInfo) (s)).mRequestId);
        obj;
        JVM INSTR monitorexit ;
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static int getCallbackInfoCount()
    {
        return browserCallbacks.size();
    }

    public boolean equals(CallbackInfo callbackinfo)
    {
        while (callbackinfo == null || !mDateCreated.equals(callbackinfo.mDateCreated) || !TextUtils.equals(mRequestId, callbackinfo.mRequestId) || !TextUtils.equals(mClientId, callbackinfo.mClientId) || mlistener != callbackinfo.mlistener) 
        {
            return false;
        }
        return true;
    }

}
