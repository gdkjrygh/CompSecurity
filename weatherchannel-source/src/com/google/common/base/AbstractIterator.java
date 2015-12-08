// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.base:
//            Preconditions

abstract class AbstractIterator
    implements Iterator
{
    private static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State DONE;
        public static final State FAILED;
        public static final State NOT_READY;
        public static final State READY;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/common/base/AbstractIterator$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            READY = new State("READY", 0);
            NOT_READY = new State("NOT_READY", 1);
            DONE = new State("DONE", 2);
            FAILED = new State("FAILED", 3);
            $VALUES = (new State[] {
                READY, NOT_READY, DONE, FAILED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private Object next;
    private State state;

    protected AbstractIterator()
    {
        state = State.NOT_READY;
    }

    private boolean tryToComputeNext()
    {
        state = State.FAILED;
        next = computeNext();
        if (state != State.DONE)
        {
            state = State.READY;
            return true;
        } else
        {
            return false;
        }
    }

    protected abstract Object computeNext();

    protected final Object endOfData()
    {
        state = State.DONE;
        return null;
    }

    public final boolean hasNext()
    {
        boolean flag1 = false;
        static class _cls1
        {

            static final int $SwitchMap$com$google$common$base$AbstractIterator$State[];

            static 
            {
                $SwitchMap$com$google$common$base$AbstractIterator$State = new int[State.values().length];
                try
                {
                    $SwitchMap$com$google$common$base$AbstractIterator$State[State.DONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$common$base$AbstractIterator$State[State.READY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        boolean flag;
        if (state != State.FAILED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        flag = flag1;
        switch (_cls1..SwitchMap.com.google.common.base.AbstractIterator.State[state.ordinal()])
        {
        default:
            flag = tryToComputeNext();
            // fall through

        case 1: // '\001'
            return flag;

        case 2: // '\002'
            return true;
        }
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            state = State.NOT_READY;
            Object obj = next;
            next = null;
            return obj;
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
