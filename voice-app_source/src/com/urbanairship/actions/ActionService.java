// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.JSONUtils;
import com.urbanairship.util.UAStringUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.actions:
//            ActionRunner, ActionArguments, Situation, ActionCompletionCallback, 
//            ActionResult

public class ActionService extends Service
{

    public static final String ACTIONS_PAYLOAD_EXTRA = "com.urbanairship.actionservice.ACTIONS_PAYLOAD_EXTRA";
    public static final String RUN_ACTIONS_ACTION = "com.urbanairship.actionservice.RUN_ACTIONS_ACTION";
    public static final String SITUATION_EXTRA = "com.urbanairship.actionservice.SITUATION_EXTRA";
    private int lastStartId;
    private ActionRunner runner;
    private int runningActions;

    public ActionService()
    {
        this(ActionRunner.shared());
    }

    ActionService(ActionRunner actionrunner)
    {
        lastStartId = 0;
        runningActions = 0;
        runner = actionrunner;
    }

    private void runActions(String s, Situation situation)
    {
        if (situation != null) goto _L2; else goto _L1
_L1:
        Logger.error("Unable to run actions with a null situation");
_L4:
        return;
_L2:
        if (UAStringUtil.isEmpty(s))
        {
            Logger.info("No actions to run.");
            return;
        }
        Object obj;
        try
        {
            obj = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (Situation situation)
        {
            Logger.info((new StringBuilder()).append("Invalid actions payload: ").append(s).toString());
            return;
        }
        s = JSONUtils.convertToMap(((JSONObject) (obj)));
        obj = s.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s1 = (String)((Iterator) (obj)).next();
            ActionArguments actionarguments = new ActionArguments(situation, s.get(s1));
            runningActions = runningActions + 1;
            runner.runAction(s1, actionarguments, new ActionCompletionCallback() {

                final ActionService this$0;

                public void onFinish(ActionResult actionresult)
                {
                    int i = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = ActionService.this;
                super();
            }
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void runActionsForPushBundle(Bundle bundle, Situation situation)
    {
        bundle = bundle.getString("com.urbanairship.actions");
        if (UAStringUtil.isEmpty(bundle))
        {
            Logger.info("No actions to run in payload.");
            return;
        } else
        {
            Context context = UAirship.shared().getApplicationContext();
            Intent intent = new Intent("com.urbanairship.actionservice.RUN_ACTIONS_ACTION");
            intent.setClass(context, com/urbanairship/actions/ActionService);
            intent.putExtra("com.urbanairship.actionservice.ACTIONS_PAYLOAD_EXTRA", bundle);
            intent.putExtra("com.urbanairship.actionservice.SITUATION_EXTRA", situation);
            context.startService(intent);
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Autopilot.automaticTakeOff((Application)getApplicationContext());
        lastStartId = j;
        if (intent != null && "com.urbanairship.actionservice.RUN_ACTIONS_ACTION".equals(intent.getAction()))
        {
            runActions(intent.getStringExtra("com.urbanairship.actionservice.ACTIONS_PAYLOAD_EXTRA"), (Situation)intent.getSerializableExtra("com.urbanairship.actionservice.SITUATION_EXTRA"));
        }
        if (runningActions == 0)
        {
            stopSelf(j);
        }
        return 2;
    }



/*
    static int access$010(ActionService actionservice)
    {
        int i = actionservice.runningActions;
        actionservice.runningActions = i - 1;
        return i;
    }

*/

}
