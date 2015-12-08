// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            q

public final class CommentFooterPresenter
    implements g
{

    private final android.view.View.OnClickListener a;
    private final View b;
    private final View c;
    private final TextView d;
    private final View e;

    public CommentFooterPresenter(Activity activity, android.view.View.OnClickListener onclicklistener)
    {
        a = (android.view.View.OnClickListener)com.google.android.apps.youtube.common.fromguava.c.a(onclicklistener);
        b = View.inflate((Context)com.google.android.apps.youtube.common.fromguava.c.a(activity), l.T, null);
        c = b.findViewById(j.az);
        d = (TextView)b.findViewById(j.fw);
        e = b.findViewById(j.cl);
    }

    public final View a(f f, Object obj)
    {
        f = (Model)obj;
        q.a[Model.a(f).ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 53
    //                   2 112
    //                   3 150
    //                   4 186;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return b;
_L2:
        c.setVisibility(0);
        d.setVisibility(0);
        e.setVisibility(8);
        d.setText(p.cv);
        b.setOnClickListener(a);
        d.setBackgroundResource(h.k);
        continue; /* Loop/switch isn't completed */
_L3:
        c.setVisibility(8);
        d.setVisibility(8);
        e.setVisibility(8);
        b.setOnClickListener(null);
        continue; /* Loop/switch isn't completed */
_L4:
        c.setVisibility(0);
        d.setVisibility(8);
        e.setVisibility(0);
        b.setOnClickListener(null);
        continue; /* Loop/switch isn't completed */
_L5:
        c.setVisibility(0);
        d.setVisibility(0);
        e.setVisibility(8);
        d.setText(p.cM);
        b.setOnClickListener(null);
        d.setBackgroundResource(h.j);
        if (true) goto _L1; else goto _L6
_L6:
    }

    private class Model
    {

        private State a;

        static State a(Model model)
        {
            return model.a;
        }

        public final void a(State state)
        {
            a = state;
        }

        public Model()
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

}
