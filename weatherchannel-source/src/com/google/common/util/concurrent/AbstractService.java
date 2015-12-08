// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.common.util.concurrent:
//            Service, Monitor, ListenerCallQueue

public abstract class AbstractService
    implements Service
{
    private static final class StateSnapshot
    {

        final Throwable failure;
        final boolean shutdownWhenStartupFinishes;
        final Service.State state;

        Service.State externalState()
        {
            if (shutdownWhenStartupFinishes && state == Service.State.STARTING)
            {
                return Service.State.STOPPING;
            } else
            {
                return state;
            }
        }

        Throwable failureCause()
        {
            boolean flag;
            if (state == Service.State.FAILED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "failureCause() is only valid if the service has failed, service is %s", new Object[] {
                state
            });
            return failure;
        }

        StateSnapshot(Service.State state1)
        {
            this(state1, false, null);
        }

        StateSnapshot(Service.State state1, boolean flag, Throwable throwable)
        {
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (!flag || state1 == Service.State.STARTING)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            Preconditions.checkArgument(flag3, "shudownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", new Object[] {
                state1
            });
            if (throwable != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (state1 == Service.State.FAILED)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (!(flag1 ^ flag2))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            Preconditions.checkArgument(flag3, "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", new Object[] {
                state1, throwable
            });
            state = state1;
            shutdownWhenStartupFinishes = flag;
            failure = throwable;
        }
    }


    private static final ListenerCallQueue.Callback RUNNING_CALLBACK = new ListenerCallQueue.Callback("running()") {

        void call(Service.Listener listener)
        {
            listener.running();
        }

        volatile void call(Object obj)
        {
            call((Service.Listener)obj);
        }

    };
    private static final ListenerCallQueue.Callback STARTING_CALLBACK = new ListenerCallQueue.Callback("starting()") {

        void call(Service.Listener listener)
        {
            listener.starting();
        }

        volatile void call(Object obj)
        {
            call((Service.Listener)obj);
        }

    };
    private static final ListenerCallQueue.Callback STOPPING_FROM_RUNNING_CALLBACK;
    private static final ListenerCallQueue.Callback STOPPING_FROM_STARTING_CALLBACK;
    private static final ListenerCallQueue.Callback TERMINATED_FROM_NEW_CALLBACK;
    private static final ListenerCallQueue.Callback TERMINATED_FROM_RUNNING_CALLBACK;
    private static final ListenerCallQueue.Callback TERMINATED_FROM_STOPPING_CALLBACK;
    private final Monitor.Guard hasReachedRunning;
    private final Monitor.Guard isStartable;
    private final Monitor.Guard isStoppable;
    private final Monitor.Guard isStopped;
    private final List listeners = Collections.synchronizedList(new ArrayList());
    private final Monitor monitor = new Monitor();
    private volatile StateSnapshot snapshot;

    protected AbstractService()
    {
        isStartable = new Monitor.Guard(monitor) {

            final AbstractService this$0;

            public boolean isSatisfied()
            {
                return state() == Service.State.NEW;
            }

            
            {
                this$0 = AbstractService.this;
                super(monitor1);
            }
        };
        isStoppable = new Monitor.Guard(monitor) {

            final AbstractService this$0;

            public boolean isSatisfied()
            {
                return state().compareTo(Service.State.RUNNING) <= 0;
            }

            
            {
                this$0 = AbstractService.this;
                super(monitor1);
            }
        };
        hasReachedRunning = new Monitor.Guard(monitor) {

            final AbstractService this$0;

            public boolean isSatisfied()
            {
                return state().compareTo(Service.State.RUNNING) >= 0;
            }

            
            {
                this$0 = AbstractService.this;
                super(monitor1);
            }
        };
        isStopped = new Monitor.Guard(monitor) {

            final AbstractService this$0;

            public boolean isSatisfied()
            {
                return state().isTerminal();
            }

            
            {
                this$0 = AbstractService.this;
                super(monitor1);
            }
        };
        snapshot = new StateSnapshot(Service.State.NEW);
    }

    private void checkCurrentState(Service.State state1)
    {
        Object obj = state();
        if (obj != state1)
        {
            if (obj == Service.State.FAILED)
            {
                state1 = String.valueOf(String.valueOf(state1));
                throw new IllegalStateException((new StringBuilder(state1.length() + 55)).append("Expected the service to be ").append(state1).append(", but the service has FAILED").toString(), failureCause());
            } else
            {
                state1 = String.valueOf(String.valueOf(state1));
                obj = String.valueOf(String.valueOf(obj));
                throw new IllegalStateException((new StringBuilder(state1.length() + 37 + ((String) (obj)).length())).append("Expected the service to be ").append(state1).append(", but was ").append(((String) (obj))).toString());
            }
        } else
        {
            return;
        }
    }

    private void executeListeners()
    {
        if (!monitor.isOccupiedByCurrentThread())
        {
            for (int i = 0; i < listeners.size(); i++)
            {
                ((ListenerCallQueue)listeners.get(i)).execute();
            }

        }
    }

    private void failed(Service.State state1, Throwable throwable)
    {
        String s = String.valueOf(String.valueOf(state1));
        String s1 = String.valueOf(String.valueOf(throwable));
        (new ListenerCallQueue.Callback(throwable) {

            final AbstractService this$0;
            final Throwable val$cause;
            final Service.State val$from;

            void call(Service.Listener listener)
            {
                listener.failed(from, cause);
            }

            volatile void call(Object obj)
            {
                call((Service.Listener)obj);
            }

            
            {
                this$0 = AbstractService.this;
                from = state1;
                cause = throwable;
                super(final_s);
            }
        }).enqueueOn(listeners);
    }

    private void running()
    {
        RUNNING_CALLBACK.enqueueOn(listeners);
    }

    private void starting()
    {
        STARTING_CALLBACK.enqueueOn(listeners);
    }

    private void stopping(Service.State state1)
    {
        if (state1 == Service.State.STARTING)
        {
            STOPPING_FROM_STARTING_CALLBACK.enqueueOn(listeners);
            return;
        }
        if (state1 == Service.State.RUNNING)
        {
            STOPPING_FROM_RUNNING_CALLBACK.enqueueOn(listeners);
            return;
        } else
        {
            throw new AssertionError();
        }
    }

    private static ListenerCallQueue.Callback stoppingCallback(Service.State state1)
    {
        String s = String.valueOf(String.valueOf(state1));
        return new ListenerCallQueue.Callback((new StringBuilder(s.length() + 19)).append("stopping({from = ").append(s).append("})").toString(), state1) {

            final Service.State val$from;

            void call(Service.Listener listener)
            {
                listener.stopping(from);
            }

            volatile void call(Object obj)
            {
                call((Service.Listener)obj);
            }

            
            {
                from = state1;
                super(s);
            }
        };
    }

    private void terminated(Service.State state1)
    {
        static class _cls10
        {

            static final int $SwitchMap$com$google$common$util$concurrent$Service$State[];

            static 
            {
                $SwitchMap$com$google$common$util$concurrent$Service$State = new int[Service.State.values().length];
                try
                {
                    $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.NEW.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.STARTING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.RUNNING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.STOPPING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.TERMINATED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.FAILED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls10..SwitchMap.com.google.common.util.concurrent.Service.State[state1.ordinal()])
        {
        case 2: // '\002'
        default:
            throw new AssertionError();

        case 1: // '\001'
            TERMINATED_FROM_NEW_CALLBACK.enqueueOn(listeners);
            return;

        case 3: // '\003'
            TERMINATED_FROM_RUNNING_CALLBACK.enqueueOn(listeners);
            return;

        case 4: // '\004'
            TERMINATED_FROM_STOPPING_CALLBACK.enqueueOn(listeners);
            break;
        }
    }

    private static ListenerCallQueue.Callback terminatedCallback(Service.State state1)
    {
        String s = String.valueOf(String.valueOf(state1));
        return new ListenerCallQueue.Callback((new StringBuilder(s.length() + 21)).append("terminated({from = ").append(s).append("})").toString(), state1) {

            final Service.State val$from;

            void call(Service.Listener listener)
            {
                listener.terminated(from);
            }

            volatile void call(Object obj)
            {
                call((Service.Listener)obj);
            }

            
            {
                from = state1;
                super(s);
            }
        };
    }

    public final void addListener(Service.Listener listener, Executor executor)
    {
        Preconditions.checkNotNull(listener, "listener");
        Preconditions.checkNotNull(executor, "executor");
        monitor.enter();
        if (!state().isTerminal())
        {
            listeners.add(new ListenerCallQueue(listener, executor));
        }
        monitor.leave();
        return;
        listener;
        monitor.leave();
        throw listener;
    }

    public final void awaitRunning()
    {
        monitor.enterWhenUninterruptibly(hasReachedRunning);
        checkCurrentState(Service.State.RUNNING);
        monitor.leave();
        return;
        Exception exception;
        exception;
        monitor.leave();
        throw exception;
    }

    public final void awaitRunning(long l, TimeUnit timeunit)
        throws TimeoutException
    {
        if (!monitor.enterWhenUninterruptibly(hasReachedRunning, l, timeunit))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        checkCurrentState(Service.State.RUNNING);
        monitor.leave();
        return;
        timeunit;
        monitor.leave();
        throw timeunit;
        timeunit = String.valueOf(String.valueOf(this));
        String s = String.valueOf(String.valueOf(state()));
        throw new TimeoutException((new StringBuilder(timeunit.length() + 66 + s.length())).append("Timed out waiting for ").append(timeunit).append(" to reach the RUNNING state. ").append("Current state: ").append(s).toString());
    }

    public final void awaitTerminated()
    {
        monitor.enterWhenUninterruptibly(isStopped);
        checkCurrentState(Service.State.TERMINATED);
        monitor.leave();
        return;
        Exception exception;
        exception;
        monitor.leave();
        throw exception;
    }

    public final void awaitTerminated(long l, TimeUnit timeunit)
        throws TimeoutException
    {
        if (!monitor.enterWhenUninterruptibly(isStopped, l, timeunit))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        checkCurrentState(Service.State.TERMINATED);
        monitor.leave();
        return;
        timeunit;
        monitor.leave();
        throw timeunit;
        timeunit = String.valueOf(String.valueOf(this));
        String s = String.valueOf(String.valueOf(state()));
        throw new TimeoutException((new StringBuilder(timeunit.length() + 65 + s.length())).append("Timed out waiting for ").append(timeunit).append(" to reach a terminal state. ").append("Current state: ").append(s).toString());
    }

    protected abstract void doStart();

    protected abstract void doStop();

    public final Throwable failureCause()
    {
        return snapshot.failureCause();
    }

    public final boolean isRunning()
    {
        return state() == Service.State.RUNNING;
    }

    protected final void notifyFailed(Throwable throwable)
    {
        Preconditions.checkNotNull(throwable);
        monitor.enter();
        Object obj = state();
        _cls10..SwitchMap.com.google.common.util.concurrent.Service.State[((Service.State) (obj)).ordinal()];
        JVM INSTR tableswitch 1 6: default 199
    //                   1 121
    //                   2 165
    //                   3 165
    //                   4 165
    //                   5 121
    //                   6 187;
           goto _L1 _L2 _L3 _L3 _L3 _L2 _L4
_L1:
        throwable = String.valueOf(String.valueOf(obj));
        throw new AssertionError((new StringBuilder(throwable.length() + 18)).append("Unexpected state: ").append(throwable).toString());
        throwable;
        monitor.leave();
        executeListeners();
        throw throwable;
_L2:
        obj = String.valueOf(String.valueOf(obj));
        throw new IllegalStateException((new StringBuilder(((String) (obj)).length() + 22)).append("Failed while in state:").append(((String) (obj))).toString(), throwable);
_L3:
        snapshot = new StateSnapshot(Service.State.FAILED, false, throwable);
        failed(((Service.State) (obj)), throwable);
_L4:
        monitor.leave();
        executeListeners();
        return;
    }

    protected final void notifyStarted()
    {
        monitor.enter();
        if (snapshot.state != Service.State.STARTING)
        {
            Object obj = String.valueOf(String.valueOf(snapshot.state));
            obj = new IllegalStateException((new StringBuilder(((String) (obj)).length() + 43)).append("Cannot notifyStarted() when the service is ").append(((String) (obj))).toString());
            notifyFailed(((Throwable) (obj)));
            throw obj;
        }
        break MISSING_BLOCK_LABEL_90;
        Exception exception;
        exception;
        monitor.leave();
        executeListeners();
        throw exception;
        if (!snapshot.shutdownWhenStartupFinishes)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        snapshot = new StateSnapshot(Service.State.STOPPING);
        doStop();
_L1:
        monitor.leave();
        executeListeners();
        return;
        snapshot = new StateSnapshot(Service.State.RUNNING);
        running();
          goto _L1
    }

    protected final void notifyStopped()
    {
        monitor.enter();
        Object obj;
        obj = snapshot.state;
        if (obj != Service.State.STOPPING && obj != Service.State.RUNNING)
        {
            obj = String.valueOf(String.valueOf(obj));
            obj = new IllegalStateException((new StringBuilder(((String) (obj)).length() + 43)).append("Cannot notifyStopped() when the service is ").append(((String) (obj))).toString());
            notifyFailed(((Throwable) (obj)));
            throw obj;
        }
        break MISSING_BLOCK_LABEL_93;
        obj;
        monitor.leave();
        executeListeners();
        throw obj;
        snapshot = new StateSnapshot(Service.State.TERMINATED);
        terminated(((Service.State) (obj)));
        monitor.leave();
        executeListeners();
        return;
    }

    public final Service startAsync()
    {
        if (!monitor.enterIf(isStartable))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        snapshot = new StateSnapshot(Service.State.STARTING);
        starting();
        doStart();
        monitor.leave();
        executeListeners();
        return this;
        Object obj;
        obj;
        notifyFailed(((Throwable) (obj)));
        monitor.leave();
        executeListeners();
        return this;
        obj;
        monitor.leave();
        executeListeners();
        throw obj;
        String s = String.valueOf(String.valueOf(this));
        throw new IllegalStateException((new StringBuilder(s.length() + 33)).append("Service ").append(s).append(" has already been started").toString());
    }

    public final Service.State state()
    {
        return snapshot.externalState();
    }

    public final Service stopAsync()
    {
        if (!monitor.enterIf(isStoppable)) goto _L2; else goto _L1
_L1:
        Object obj = state();
        _cls10..SwitchMap.com.google.common.util.concurrent.Service.State[((Service.State) (obj)).ordinal()];
        JVM INSTR tableswitch 1 6: default 271
    //                   1 126
    //                   2 160
    //                   3 200
    //                   4 228
    //                   5 228
    //                   6 228;
           goto _L3 _L4 _L5 _L6 _L7 _L7 _L7
_L3:
        obj = String.valueOf(String.valueOf(obj));
        throw new AssertionError((new StringBuilder(((String) (obj)).length() + 18)).append("Unexpected state: ").append(((String) (obj))).toString());
_L10:
        notifyFailed(((Throwable) (obj)));
        monitor.leave();
        executeListeners();
_L2:
        return this;
_L4:
        snapshot = new StateSnapshot(Service.State.TERMINATED);
        terminated(Service.State.NEW);
_L8:
        monitor.leave();
        executeListeners();
        return this;
_L5:
        snapshot = new StateSnapshot(Service.State.STARTING, true, null);
        stopping(Service.State.STARTING);
          goto _L8
_L6:
        snapshot = new StateSnapshot(Service.State.STOPPING);
        stopping(Service.State.RUNNING);
        doStop();
          goto _L8
_L7:
        try
        {
            obj = String.valueOf(String.valueOf(obj));
            throw new AssertionError((new StringBuilder(((String) (obj)).length() + 45)).append("isStoppable is incorrectly implemented, saw: ").append(((String) (obj))).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            monitor.leave();
            executeListeners();
            throw obj;
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(getClass().getSimpleName()));
        String s1 = String.valueOf(String.valueOf(state()));
        return (new StringBuilder(s.length() + 3 + s1.length())).append(s).append(" [").append(s1).append("]").toString();
    }

    static 
    {
        STOPPING_FROM_STARTING_CALLBACK = stoppingCallback(Service.State.STARTING);
        STOPPING_FROM_RUNNING_CALLBACK = stoppingCallback(Service.State.RUNNING);
        TERMINATED_FROM_NEW_CALLBACK = terminatedCallback(Service.State.NEW);
        TERMINATED_FROM_RUNNING_CALLBACK = terminatedCallback(Service.State.RUNNING);
        TERMINATED_FROM_STOPPING_CALLBACK = terminatedCallback(Service.State.STOPPING);
    }
}
