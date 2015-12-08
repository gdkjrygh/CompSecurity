// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public interface Service
{
    public static abstract class Listener
    {

        public void failed(State state1, Throwable throwable)
        {
        }

        public void running()
        {
        }

        public void starting()
        {
        }

        public void stopping(State state1)
        {
        }

        public void terminated(State state1)
        {
        }

        public Listener()
        {
        }
    }

    public static abstract class State extends Enum
    {

        private static final State $VALUES[];
        public static final State FAILED;
        public static final State NEW;
        public static final State RUNNING;
        public static final State STARTING;
        public static final State STOPPING;
        public static final State TERMINATED;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/common/util/concurrent/Service$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        abstract boolean isTerminal();

        static 
        {
            NEW = new State("NEW", 0) {

                boolean isTerminal()
                {
                    return false;
                }

            };
            STARTING = new State("STARTING", 1) {

                boolean isTerminal()
                {
                    return false;
                }

            };
            RUNNING = new State("RUNNING", 2) {

                boolean isTerminal()
                {
                    return false;
                }

            };
            STOPPING = new State("STOPPING", 3) {

                boolean isTerminal()
                {
                    return false;
                }

            };
            TERMINATED = new State("TERMINATED", 4) {

                boolean isTerminal()
                {
                    return true;
                }

            };
            FAILED = new State("FAILED", 5) {

                boolean isTerminal()
                {
                    return true;
                }

            };
            $VALUES = (new State[] {
                NEW, STARTING, RUNNING, STOPPING, TERMINATED, FAILED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }

    }


    public abstract void addListener(Listener listener, Executor executor);

    public abstract void awaitRunning();

    public abstract void awaitRunning(long l, TimeUnit timeunit)
        throws TimeoutException;

    public abstract void awaitTerminated();

    public abstract void awaitTerminated(long l, TimeUnit timeunit)
        throws TimeoutException;

    public abstract Throwable failureCause();

    public abstract boolean isRunning();

    public abstract Service startAsync();

    public abstract State state();

    public abstract Service stopAsync();
}
