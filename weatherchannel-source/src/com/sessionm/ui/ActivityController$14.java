// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;
import com.sessionm.b.a;
import com.sessionm.core.Session;
import org.json.JSONArray;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class val.message
    implements Runnable
{

    final ActivityController this$0;
    final a val$message;

    public void run()
    {
        a aa[] = (a[])val$message.a("requestedIds", com/sessionm/b/a);
        JSONArray jsonarray = new JSONArray();
        if (aa != null)
        {
            int j = aa.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = aa[i];
                String s = ((a) (obj)).getString("algorithm");
                obj = ((a) (obj)).getString("type");
                String s1 = com.sessionm.a.a.c(((String) (obj)), s);
                a a2 = a.aJ();
                a2.put("value", s1);
                a2.put("type", ((String) (obj)));
                a2.put("algorithm", s);
                jsonarray.put(a2.aL());
            }

        } else
        if (Log.isLoggable("SessionM.Activity", 6))
        {
            Log.e("SessionM.Activity", "requestedIds not specified for getSystemIdentifiers call!");
        }
        a a1 = a.aJ();
        a1.put("ids", jsonarray);
        ActivityController.access$000(ActivityController.this).getApplicationContext();
        a1.put("limitadtracking", com.sessionm.a.a.aH());
        finishMessageHandling(val$message, a1);
    }

    ()
    {
        this$0 = final_activitycontroller;
        val$message = a.this;
        super();
    }
}
