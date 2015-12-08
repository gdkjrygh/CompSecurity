// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import java.nio.ByteBuffer;

final class a
{

    private ByteBuffer a;
    private Exception b;
    private State c;

    public final ByteBuffer a()
    {
        if (!State.DATA.equals(c))
        {
            throw new IllegalStateException("data accessed when state was not DATA");
        } else
        {
            return a;
        }
    }

    public final Exception b()
    {
        if (!State.ERROR.equals(c))
        {
            throw new IllegalStateException("data accessed when state was not ERROR");
        } else
        {
            return b;
        }
    }

    public final boolean c()
    {
        return State.CLOSED.equals(c);
    }

    public final boolean d()
    {
        return State.ERROR.equals(c);
    }

    public State()
    {
        class State extends Enum
        {

            private static final State $VALUES[];
            public static final State CLOSED;
            public static final State DATA;
            public static final State ERROR;

            public static State valueOf(String s)
            {
                return (State)Enum.valueOf(com/google/android/apps/ytremote/backend/browserchannel/HttpClientConnection$IncomingItem$State, s);
            }

            public static State[] values()
            {
                return (State[])$VALUES.clone();
            }

            static 
            {
                CLOSED = new State("CLOSED", 0);
                DATA = new State("DATA", 1);
                ERROR = new State("ERROR", 2);
                $VALUES = (new State[] {
                    CLOSED, DATA, ERROR
                });
            }

            private State(String s, int i)
            {
                super(s, i);
            }
        }

        c = State.CLOSED;
    }

    public State.CLOSED(Exception exception)
    {
        c = State.ERROR;
        b = exception;
    }

    public b(ByteBuffer bytebuffer)
    {
        c = State.DATA;
        a = bytebuffer;
    }
}
