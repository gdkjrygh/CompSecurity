// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsStorageListener, EventsFilesManager, EventsStrategy

public abstract class EventsHandler
    implements EventsStorageListener
{

    protected final Context context;
    protected final ScheduledExecutorService executor;
    protected EventsStrategy strategy;

    public EventsHandler(Context context1, EventsStrategy eventsstrategy, EventsFilesManager eventsfilesmanager, ScheduledExecutorService scheduledexecutorservice)
    {
        context = context1.getApplicationContext();
        executor = scheduledexecutorservice;
        strategy = eventsstrategy;
        eventsfilesmanager.registerRollOverListener(this);
    }

    public void disable()
    {
        executeAsync(new Runnable() {

            final EventsHandler this$0;

            public void run()
            {
                try
                {
                    EventsStrategy eventsstrategy = strategy;
                    strategy = getDisabledEventsStrategy();
                    eventsstrategy.deleteAllEvents();
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.logControlledError(context, "Failed to disable events.", exception);
                }
            }

            
            {
                this$0 = EventsHandler.this;
                super();
            }
        });
    }

    protected void executeAsync(Runnable runnable)
    {
        try
        {
            executor.submit(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            CommonUtils.logControlledError(context, "Failed to submit events task", runnable);
        }
    }

    protected void executeSync(Runnable runnable)
    {
        try
        {
            executor.submit(runnable).get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            CommonUtils.logControlledError(context, "Failed to run events task", runnable);
        }
    }

    protected abstract EventsStrategy getDisabledEventsStrategy();

    public void onRollOver(String s)
    {
        executeAsync(new Runnable() {

            final EventsHandler this$0;

            public void run()
            {
                try
                {
                    strategy.sendEvents();
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.logControlledError(context, "Failed to send events files.", exception);
                }
            }

            
            {
                this$0 = EventsHandler.this;
                super();
            }
        });
    }

    public void recordEventAsync(final Object event, final boolean sendImmediately)
    {
        executeAsync(new Runnable() {

            final EventsHandler this$0;
            final Object val$event;
            final boolean val$sendImmediately;

            public void run()
            {
                try
                {
                    strategy.recordEvent(event);
                    if (sendImmediately)
                    {
                        strategy.rollFileOver();
                    }
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.logControlledError(context, "Failed to record event.", exception);
                }
            }

            
            {
                this$0 = EventsHandler.this;
                event = obj;
                sendImmediately = flag;
                super();
            }
        });
    }

    public void recordEventSync(final Object event)
    {
        executeSync(new Runnable() {

            final EventsHandler this$0;
            final Object val$event;

            public void run()
            {
                try
                {
                    strategy.recordEvent(event);
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.logControlledError(context, "Crashlytics failed to record event", exception);
                }
            }

            
            {
                this$0 = EventsHandler.this;
                event = obj;
                super();
            }
        });
    }
}
