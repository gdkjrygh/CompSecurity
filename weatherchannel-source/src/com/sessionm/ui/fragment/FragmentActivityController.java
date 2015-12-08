// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import com.sessionm.core.Session;
import com.sessionm.ui.ActivityController;
import com.sessionm.ui.SessionMViewContainer;

// Referenced classes of package com.sessionm.ui.fragment:
//            ActivityFragment

public class FragmentActivityController extends ActivityController
{

    private Activity activityContext;
    private ActivityFragment fragment;
    private int fragmentFrameLayoutId;

    FragmentActivityController(ActivityFragment activityfragment, Activity activity, String s)
    {
        super(activity, s);
        fragmentFrameLayoutId = -1;
        activityContext = activity;
        fragment = activityfragment;
    }

    public void dismiss()
    {
        if (fragmentFrameLayoutId == -1)
        {
            return;
        } else
        {
            super.dismiss();
            return;
        }
    }

    public Activity getActivityContext()
    {
        return activityContext;
    }

    ActivityFragment getFragment()
    {
        return fragment;
    }

    protected void launchDisplayContainer()
    {
        if (fragment.isAdded())
        {
            return;
        }
        FragmentTransaction fragmenttransaction = getActivityContext().getFragmentManager().beginTransaction();
        fragmenttransaction.add(fragmentFrameLayoutId, fragment);
        if (isFullScreenActivity())
        {
            fragmenttransaction.addToBackStack(null);
        }
        fragmenttransaction.commit();
    }

    public void present(boolean flag)
    {
        if (fragmentFrameLayoutId == -1)
        {
            throw new IllegalStateException("Application managed Fragment cannot be explicitly presented with present() method.");
        } else
        {
            super.present(flag);
            return;
        }
    }

    protected void removeView(SessionMViewContainer sessionmviewcontainer)
    {
        if (!fragment.isAdded() || !fragment.isResumed())
        {
            return;
        } else
        {
            sessionmviewcontainer = fragment.getActivity().getFragmentManager().beginTransaction();
            sessionmviewcontainer.remove(fragment);
            sessionmviewcontainer.commit();
            return;
        }
    }

    protected void replaceDisplayContainer(ActivityController activitycontroller)
    {
        FragmentActivityController fragmentactivitycontroller = (FragmentActivityController)activitycontroller;
        fragment.replaceWithFragment(fragmentactivitycontroller.getFragment());
        dismiss(false);
        Session.D().a(activitycontroller);
    }

    protected void resizeView(android.view.ViewGroup.LayoutParams layoutparams)
    {
        View view = fragment.getView();
        if (view != null)
        {
            view.setLayoutParams(layoutparams);
        }
    }

    public void setActivityContext(Activity activity)
    {
        activityContext = activity;
    }

    public void setFragmentFrameLayoutId(int i)
    {
        if (i == -1)
        {
            throw new IllegalArgumentException("Fragment frame layout id  cannot be NO_ID");
        }
        View view = getActivityContext().findViewById(i);
        if (!(view instanceof FrameLayout))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Fragment parent must be instance of FrameLayout, ").append(view).toString());
        } else
        {
            fragmentFrameLayoutId = i;
            return;
        }
    }
}
