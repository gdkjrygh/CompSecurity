// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaPreferences, IKahunaUserCredentials, KahunaUtils, 
//            Event, KahunaUserCredentials

class entials
    implements Runnable
{

    final KahunaCommon this$0;
    final IKahunaUserCredentials val$credentials;

    public void run()
    {
        Object obj;
        Object obj1;
        java.util.Credentials credentials1;
        boolean flag1;
        obj1 = KahunaPreferences.getUserCredentialsNew(KahunaCommon.access$000(KahunaCommon.this));
        if (val$credentials != null)
        {
            obj = val$credentials.getCredentialsAsMap();
        } else
        {
            obj = new HashMap();
        }
        credentials1 = null;
        flag1 = false;
        if (!((Map) (obj1)).isEmpty()) goto _L2; else goto _L1
_L1:
        if (!KahunaUtils.isNullOrEmpty(val$credentials)) goto _L4; else goto _L3
_L3:
        return;
_L4:
        boolean flag;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("login() called and no previous credentials found. Storing new credentials: ").append(obj).toString());
        }
        KahunaPreferences.saveUserCredentialsNew(((Map) (obj)), KahunaCommon.access$000(KahunaCommon.this));
        flag = true;
_L7:
        if (flag)
        {
            obj1 = new Event("k_user_login");
            ((Event) (obj1)).setUserCredentials(((Map) (obj)));
            KahunaCommon.access$1500(KahunaCommon.this, ((Event) (obj1)));
            return;
        }
          goto _L5
_L2:
        if (KahunaUtils.isNullOrEmpty(val$credentials))
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", "login() called with previous credentials but new credentials are empty. Triggering empty k_user_login.");
            }
            KahunaCommon.access$2100(KahunaCommon.this);
            flag = true;
            obj = credentials1;
        } else
        if (!val$credentials.areCredentialsEqual(new KahunaUserCredentials(((Map) (obj1)))))
        {
            if (KahunaUtils.doMapsOverlap(((Map) (obj1)), ((Map) (obj))))
            {
                for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext();)
                {
                    credentials1 = (java.util.t)((Iterator) (obj)).next();
                    if (((Map) (obj1)).containsKey(credentials1.y()))
                    {
                        ((Set)((Map) (obj1)).get(credentials1.y())).addAll((Collection)credentials1.lue());
                    } else
                    {
                        ((Map) (obj1)).put(credentials1.y(), credentials1.lue());
                    }
                }

                if (KahunaCommon.mDebugEnabled)
                {
                    Log.d("Kahuna", (new StringBuilder()).append("login() called with overlapping credentials. Merging all credentials: ").append(obj1).toString());
                }
                KahunaPreferences.saveUserCredentialsNew(((Map) (obj1)), KahunaCommon.access$000(KahunaCommon.this));
                obj = obj1;
                flag = true;
            } else
            {
                if (KahunaCommon.mDebugEnabled)
                {
                    Log.d("Kahuna", "login() called with no overlapping credentials. Sending up only new credentials.");
                }
                KahunaCommon.access$2100(KahunaCommon.this);
                KahunaPreferences.saveUserCredentialsNew(((Map) (obj)), KahunaCommon.access$000(KahunaCommon.this));
                flag = true;
            }
        } else
        {
            obj = credentials1;
            flag = flag1;
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", "login() called with no change in credentials.");
                obj = credentials1;
                flag = flag1;
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
_L5:
        if (true) goto _L3; else goto _L8
_L8:
    }

    entials()
    {
        this$0 = final_kahunacommon;
        val$credentials = IKahunaUserCredentials.this;
        super();
    }
}
