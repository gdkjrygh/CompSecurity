// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.uilib.innertube.q;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.r;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bt, bs

public class LoadingFrameLayout extends FrameLayout
{

    private final Context a;
    private TextView b;
    private TextView c;
    private View d;
    private View e;
    private View f;
    private Button g;
    private State h;
    private bt i;

    public LoadingFrameLayout(Context context)
    {
        super(context);
        h = State.NEW;
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        a(context, l.al);
        b(context, l.ai);
        c(context, l.ak);
    }

    public LoadingFrameLayout(Context context, int k, int i1)
    {
        super(context);
        h = State.NEW;
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        a(context, i1);
        c(context, k);
    }

    public LoadingFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LoadingFrameLayout(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        h = State.NEW;
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        attributeset = context.obtainStyledAttributes(attributeset, r.p, k, 0);
        a(context, attributeset.getResourceId(1, l.al));
        b(context, attributeset.getResourceId(0, l.ai));
        c(context, attributeset.getResourceId(2, l.ak));
        attributeset.recycle();
        a(State.LOADING);
    }

    private void a(Context context, int k)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        f = LayoutInflater.from(context).inflate(k, this, false);
        addView(f);
    }

    private void a(State state)
    {
        boolean flag = false;
        if (h != state)
        {
            int k;
            int j1;
            if (state == State.CONTENT)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                getChildAt(i1).setVisibility(k);
            }

            View view = f;
            if (state == State.LOADING)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            view.setVisibility(k);
            view = e;
            if (state == State.ERROR)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            view.setVisibility(k);
            if (d != null)
            {
                View view1 = d;
                if (state == State.EMPTY)
                {
                    k = ((flag) ? 1 : 0);
                } else
                {
                    k = 8;
                }
                view1.setVisibility(k);
            }
            h = state;
            if (i != null)
            {
                i.a(state);
            }
        }
    }

    private void b(Context context, int k)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        d = LayoutInflater.from(context).inflate(k, this, false);
        b = (TextView)d.findViewById(j.aS);
        addView(d);
    }

    private void c(Context context, int k)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        e = LayoutInflater.from(context).inflate(k, this, false);
        c = (TextView)e.findViewById(j.aW);
        g = (Button)e.findViewById(j.aX);
        addView(e);
    }

    public final void a()
    {
        a(State.LOADING);
    }

    public final void a(int k)
    {
        a(a.getResources().getText(k));
    }

    public final void a(CharSequence charsequence)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(d);
        b.setText(charsequence);
        b.setMovementMethod(LinkMovementMethod.getInstance());
        a(State.EMPTY);
    }

    public final void a(CharSequence charsequence, boolean flag)
    {
        c.setText(charsequence);
        charsequence = g;
        int k;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        charsequence.setVisibility(k);
        a(State.ERROR);
    }

    public final void b()
    {
        a(State.CONTENT);
    }

    public final void c()
    {
        a(State.NEW);
    }

    public void setOnRetryClickListener(q q)
    {
        g.setOnClickListener(new bs(this, q));
    }

    public void setOnStateChangeListener(bt bt1)
    {
        i = bt1;
    }

    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State CONTENT;
        public static final State EMPTY;
        public static final State ERROR;
        public static final State LOADING;
        public static final State NEW;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/android/apps/youtube/app/ui/LoadingFrameLayout$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            NEW = new State("NEW", 0);
            LOADING = new State("LOADING", 1);
            CONTENT = new State("CONTENT", 2);
            ERROR = new State("ERROR", 3);
            EMPTY = new State("EMPTY", 4);
            $VALUES = (new State[] {
                NEW, LOADING, CONTENT, ERROR, EMPTY
            });
        }

        private State(String s, int k)
        {
            super(s, k);
        }
    }

}
