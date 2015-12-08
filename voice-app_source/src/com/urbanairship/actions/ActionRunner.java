// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.os.Handler;
import com.android.internal.util.Predicate;
import com.urbanairship.Logger;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.urbanairship.actions:
//            ActionRegistry, ActionCompletionCallback, Action, ActionResult, 
//            ActionArguments

public class ActionRunner
{

    private static ActionRunner instance = new ActionRunner(ActionRegistry.shared(), Executors.newCachedThreadPool());
    private ActionRegistry actionRegistry;
    private Executor executor;

    ActionRunner(ActionRegistry actionregistry, Executor executor1)
    {
        actionRegistry = actionregistry;
        executor = executor1;
    }

    private Handler getHandler()
    {
        Handler handler;
        try
        {
            handler = new Handler();
        }
        catch (Exception exception)
        {
            return null;
        }
        return handler;
    }

    private void postResult(Handler handler, final ActionCompletionCallback callback, final ActionResult result)
    {
        if (callback == null)
        {
            return;
        }
        if (handler != null)
        {
            handler.post(new Runnable() {

                final ActionRunner this$0;
                final ActionCompletionCallback val$callback;
                final ActionResult val$result;

                public void run()
                {
                    callback.onFinish(result);
                }

            
            {
                this$0 = ActionRunner.this;
                callback = actioncompletioncallback;
                result = actionresult;
                super();
            }
            });
            return;
        } else
        {
            callback.onFinish(result);
            return;
        }
    }

    public static ActionRunner shared()
    {
        return instance;
    }

    public void runAction(Action action, ActionArguments actionarguments)
    {
        runAction(action, actionarguments, null);
    }

    public void runAction(final Action action, final ActionArguments arguments, final ActionCompletionCallback completionCallback)
    {
        if (action == null)
        {
            throw new IllegalArgumentException("Unable to run null action");
        } else
        {
            Logger.info((new StringBuilder()).append("Running action: ").append(action).toString());
            final Handler handler = getHandler();
            executor.execute(new Runnable() {

                final ActionRunner this$0;
                final Action val$action;
                final ActionArguments val$arguments;
                final ActionCompletionCallback val$completionCallback;
                final Handler val$handler;

                public void run()
                {
                    ActionResult actionresult = action.run(null, arguments);
                    postResult(handler, completionCallback, actionresult);
                }

            
            {
                this$0 = ActionRunner.this;
                action = action1;
                arguments = actionarguments;
                handler = handler1;
                completionCallback = actioncompletioncallback;
                super();
            }
            });
            return;
        }
    }

    public void runAction(String s, ActionArguments actionarguments)
    {
        runAction(s, actionarguments, null);
    }

    public void runAction(final String actionName, final ActionArguments arguments, final ActionCompletionCallback completionCallback)
    {
        final Handler handler = getHandler();
        executor.execute(new Runnable() {

            final ActionRunner this$0;
            final String val$actionName;
            final ActionArguments val$arguments;
            final ActionCompletionCallback val$completionCallback;
            final Handler val$handler;

            public void run()
            {
                ActionResult actionresult = runActionSync(actionName, arguments);
                postResult(handler, completionCallback, actionresult);
            }

            
            {
                this$0 = ActionRunner.this;
                actionName = s;
                arguments = actionarguments;
                handler = handler1;
                completionCallback = actioncompletioncallback;
                super();
            }
        });
    }

    public ActionResult runActionSync(Action action, ActionArguments actionarguments)
    {
        if (action == null)
        {
            throw new IllegalArgumentException("Unable to run null action");
        } else
        {
            Logger.info((new StringBuilder()).append("Running action: ").append(action).toString());
            return action.run(null, actionarguments);
        }
    }

    public ActionResult runActionSync(String s, ActionArguments actionarguments)
    {
        ActionRegistry.Entry entry = actionRegistry.getEntry(s);
        if (entry == null)
        {
            return ActionResult.newEmptyResultWithStatus(ActionResult.Status.ACTION_NOT_FOUND);
        }
        if (entry.getPredicate() != null && !entry.getPredicate().apply(actionarguments))
        {
            Logger.info("Action will not be run. Registry predicate returned false.");
            return ActionResult.newEmptyResultWithStatus(ActionResult.Status.REJECTED_ARGUMENTS);
        }
        Situation situation;
        if (actionarguments == null)
        {
            situation = null;
        } else
        {
            situation = actionarguments.getSituation();
        }
        return entry.getActionForSituation(situation).run(s, actionarguments);
    }


}
