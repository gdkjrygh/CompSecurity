// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment
{
    public static abstract class Listener
    {

        public void onAttach()
        {
        }

        public void onCreate()
        {
        }

        public void onCreateView()
        {
        }

        public void onDestroy()
        {
        }

        public void onDestroyView()
        {
        }

        public void onDetach()
        {
        }

        public void onPause()
        {
        }

        public void onResume()
        {
        }

        public void onStart()
        {
        }

        public void onStop()
        {
        }

        public void onViewPreloadFailed()
        {
        }

        public void onViewPreloadSucceeded()
        {
        }

        public Listener()
        {
        }
    }

    static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ATTACHED;
        public static final State CREATED;
        public static final State CREATED_VIEW;
        public static final State DESTROYED;
        public static final State DESTROYED_VIEW;
        public static final State DETACHED;
        public static final State PAUSED;
        public static final State RESUMED;
        public static final State STARTED;
        public static final State STOPPED;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/sessionm/ui/fragment/BaseFragment$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        public boolean isViewAvailable()
        {
            return ordinal() > CREATED.ordinal() && ordinal() < DESTROYED_VIEW.ordinal();
        }

        static 
        {
            ATTACHED = new State("ATTACHED", 0);
            CREATED = new State("CREATED", 1);
            CREATED_VIEW = new State("CREATED_VIEW", 2);
            STARTED = new State("STARTED", 3);
            RESUMED = new State("RESUMED", 4);
            PAUSED = new State("PAUSED", 5);
            STOPPED = new State("STOPPED", 6);
            DESTROYED_VIEW = new State("DESTROYED_VIEW", 7);
            DESTROYED = new State("DESTROYED", 8);
            DETACHED = new State("DETACHED", 9);
            $VALUES = (new State[] {
                ATTACHED, CREATED, CREATED_VIEW, STARTED, RESUMED, PAUSED, STOPPED, DESTROYED_VIEW, DESTROYED, DETACHED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "SessionM.Fragment";
    private Listener listener;
    private State state;

    public BaseFragment()
    {
        state = State.DETACHED;
    }

    private void setState(State state1)
    {
        if (Log.isLoggable("SessionM.Fragment", 3))
        {
            Log.d("SessionM.Fragment", (new StringBuilder()).append("State: ").append(state1).toString());
        }
        state = state1;
    }

    public void addFragment(Fragment fragment)
    {
        FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
        fragmenttransaction.add(getId(), fragment);
        fragmenttransaction.addToBackStack(null);
        fragmenttransaction.commit();
    }

    public Listener getListener()
    {
        return listener;
    }

    public State getState()
    {
        return state;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        setState(State.ATTACHED);
        if (listener != null)
        {
            listener.onAttach();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setState(State.CREATED);
        if (listener != null)
        {
            listener.onCreate();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        setState(State.CREATED_VIEW);
        if (listener != null)
        {
            listener.onCreateView();
        }
        return null;
    }

    public void onDestroy()
    {
        super.onDestroy();
        setState(State.DESTROYED);
        if (listener != null)
        {
            listener.onDestroy();
        }
    }

    public void onDestroyView()
    {
        super.onDestroy();
        setState(State.DESTROYED_VIEW);
        if (listener != null)
        {
            listener.onDestroyView();
        }
    }

    public void onDetach()
    {
        super.onDetach();
        setState(State.DETACHED);
        if (listener != null)
        {
            listener.onDetach();
        }
    }

    public void onPause()
    {
        super.onPause();
        setState(State.PAUSED);
        if (listener != null)
        {
            listener.onPause();
        }
    }

    public void onResume()
    {
        super.onResume();
        setState(State.RESUMED);
        if (listener != null)
        {
            listener.onResume();
        }
    }

    public void onStart()
    {
        super.onStart();
        setState(State.STARTED);
        if (listener != null)
        {
            listener.onStart();
        }
    }

    public void onStop()
    {
        super.onStart();
        setState(State.STOPPED);
        if (listener != null)
        {
            listener.onStop();
        }
    }

    public abstract void preloadView(Activity activity);

    public void replaceWithFragment(Fragment fragment)
    {
        FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
        fragmenttransaction.replace(getId(), fragment);
        fragmenttransaction.commit();
    }

    public void setListener(Listener listener1)
    {
        listener = listener1;
    }
}
