// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;


public class State.CAN_LOAD_MORE
{

    private State a;

    static State a(State.CAN_LOAD_MORE can_load_more)
    {
        return can_load_more.a;
    }

    public final void a(State state)
    {
        a = state;
    }

    public State()
    {
        class State extends Enum
        {

            private static final State $VALUES[];
            public static final State CAN_LOAD_MORE;
            public static final State LOADING;
            public static final State NO_COMMENTS;
            public static final State NO_MORE_COMMENTS;

            public static State valueOf(String s)
            {
                return (State)Enum.valueOf(com/google/android/apps/youtube/app/ui/presenter/CommentFooterPresenter$Model$State, s);
            }

            public static State[] values()
            {
                return (State[])$VALUES.clone();
            }

            static 
            {
                CAN_LOAD_MORE = new State("CAN_LOAD_MORE", 0);
                NO_MORE_COMMENTS = new State("NO_MORE_COMMENTS", 1);
                NO_COMMENTS = new State("NO_COMMENTS", 2);
                LOADING = new State("LOADING", 3);
                $VALUES = (new State[] {
                    CAN_LOAD_MORE, NO_MORE_COMMENTS, NO_COMMENTS, LOADING
                });
            }

            private State(String s, int i)
            {
                super(s, i);
            }
        }

        a = State.CAN_LOAD_MORE;
    }
}
