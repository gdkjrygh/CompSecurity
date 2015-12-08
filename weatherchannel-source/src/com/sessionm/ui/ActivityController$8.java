// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;
import com.sessionm.b.a;
import com.sessionm.core.Session;
import java.lang.reflect.Method;
import java.util.Locale;

// Referenced classes of package com.sessionm.ui:
//            ActivityController, JSInterfaceListener

class val.action
    implements Runnable
{

    final ActivityController this$0;
    final String val$action;

    public void run()
    {
        if (getState() != ate.DISMISSED) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", "Not executing JavaScriptInterface command since controller was dismissed.");
        }
_L4:
        return;
_L2:
        Object obj1;
        String s;
        obj1 = a.A(val$action);
        if (obj1 == null)
        {
            Log.e("SessionM.Activity", (new StringBuilder()).append("Unable to parse JS JSON message for action ").append(val$action).toString());
            return;
        }
        s = ((a) (obj1)).getString("handler");
        if (s == null)
        {
            Log.e("SessionM.Activity", "JavaScriptInterface command handler not specified");
            ActivityController.access$000(ActivityController.this).a("jsinterface-message-error", "JS command handler not specified", null);
            return;
        }
        if (ActivityController.access$800(ActivityController.this) != null)
        {
            ActivityController.access$800(ActivityController.this).receivedJSInterfaceCommand(s);
        }
        Object obj;
        String s1;
        s1 = (new StringBuilder()).append("handle").append(s.substring(0, 1).toUpperCase(Locale.US)).append(s.substring(1)).append("Message").toString();
        obj = ActivityController.access$900(ActivityController.this, s1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        obj = (new StringBuilder()).append(s1).append("Async").toString();
        obj = ActivityController.access$900(ActivityController.this, ((String) (obj)));
        boolean flag = true;
_L5:
        if (obj == null)
        {
            try
            {
                Log.e("SessionM.Activity", (new StringBuilder()).append("JS command handler method not found: ").append(s).toString());
                obj = String.format(Locale.US, "invalid JavaScriptInterface action: %s", new Object[] {
                    val$action
                });
                ActivityController.access$000(ActivityController.this).a("jsinterface-message-error", ((String) (obj)), null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("SessionM.Activity", (new StringBuilder()).append("Exception processing JavaScriptInterface command ").append(val$action).toString(), ((Throwable) (obj)));
            }
            obj1 = String.format(Locale.US, "exception executing js interface message: %s", new Object[] {
                ((a) (obj1)).toString()
            });
            ActivityController.access$000(ActivityController.this).a("jsinterface-message-exception", ((String) (obj1)), ((Throwable) (obj)));
            return;
        }
        ((Method) (obj)).setAccessible(true);
        obj = ((Method) (obj)).invoke(ActivityController.this, new Object[] {
            obj1
        });
        if (flag) goto _L4; else goto _L3
_L3:
        finishMessageHandling(((a) (obj1)), (a)obj);
        return;
        flag = false;
          goto _L5
    }

    ate()
    {
        this$0 = final_activitycontroller;
        val$action = String.this;
        super();
    }
}
