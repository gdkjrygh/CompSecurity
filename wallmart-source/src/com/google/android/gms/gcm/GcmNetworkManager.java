// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.gcm:
//            GoogleCloudMessaging, Task

public class GcmNetworkManager
{

    public static final int RESULT_FAILURE = 2;
    public static final int RESULT_RESCHEDULE = 1;
    public static final int RESULT_SUCCESS = 0;
    private static GcmNetworkManager zzazG;
    private Context mContext;
    private final PendingIntent mPendingIntent;

    private GcmNetworkManager(Context context)
    {
        mContext = context;
        mPendingIntent = PendingIntent.getBroadcast(mContext, 0, new Intent(), 0);
    }

    public static GcmNetworkManager getInstance(Context context)
    {
        if (zzazG == null)
        {
            zzazG = new GcmNetworkManager(context.getApplicationContext());
        }
        return zzazG;
    }

    static void zzdi(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Must provide a valid tag.");
        }
        if (100 < s.length())
        {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        } else
        {
            return;
        }
    }

    private void zzdj(String s)
    {
        boolean flag;
        boolean flag1 = true;
        zzx.zzb(s, "GcmTaskService must not be null.");
        Object obj = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
        ((Intent) (obj)).setPackage(mContext.getPackageName());
        obj = mContext.getPackageManager().queryIntentServices(((Intent) (obj)), 0);
        if (obj != null && ((List) (obj)).size() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        obj = ((List) (obj)).iterator();
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        if (!((ResolveInfo)((Iterator) (obj)).next()).serviceInfo.name.equals(s))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        flag = flag1;
_L4:
        zzx.zzb(flag, (new StringBuilder()).append("The GcmTaskService class you provided ").append(s).append(" does not seem to support receiving").append(" com.google.android.gms.gcm.ACTION_TASK_READY.").toString());
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Intent zzvl()
    {
        int i = GoogleCloudMessaging.zzaA(mContext);
        if (i < GoogleCloudMessaging.zzazR)
        {
            Log.e("GcmNetworkManager", (new StringBuilder()).append("Google Play Services is not available, dropping GcmNetworkManager request. code=").append(i).toString());
            return null;
        } else
        {
            Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
            intent.setPackage(GoogleCloudMessaging.zzaz(mContext));
            intent.putExtra("app", mPendingIntent);
            return intent;
        }
    }

    public void cancelAllTasks(Class class1)
    {
        zzdj(class1.getName());
        Intent intent = zzvl();
        if (intent == null)
        {
            return;
        } else
        {
            intent.putExtra("scheduler_action", "CANCEL_ALL");
            intent.putExtra("component", new ComponentName(mContext, class1));
            mContext.sendBroadcast(intent);
            return;
        }
    }

    public void cancelTask(String s, Class class1)
    {
        zzdi(s);
        zzdj(class1.getName());
        Intent intent = zzvl();
        if (intent == null)
        {
            return;
        } else
        {
            intent.putExtra("scheduler_action", "CANCEL_TASK");
            intent.putExtra("tag", s);
            intent.putExtra("component", new ComponentName(mContext, class1));
            mContext.sendBroadcast(intent);
            return;
        }
    }

    public void schedule(Task task)
    {
        zzdj(task.getServiceName());
        Intent intent = zzvl();
        if (intent == null)
        {
            return;
        } else
        {
            Bundle bundle = intent.getExtras();
            bundle.putString("scheduler_action", "SCHEDULE_TASK");
            task.toBundle(bundle);
            intent.putExtras(bundle);
            mContext.sendBroadcast(intent);
            return;
        }
    }
}
