// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.ui.utils.Navigator;
import com.wsi.android.weather.ui.MapAppFragment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractNavigator
    implements Navigator
{

    private static final String KEY_ACTIVE_FRAGMENT = "active";
    private static final String KEY_NAVIGATOR_STATE = "nav_state";
    protected final String TAG = getClass().getSimpleName();
    protected MapAppFragment activeFragment;
    protected Activity context;
    protected int current;
    private boolean destroyed;
    private HashSet navigationListeners;
    private Set notAnimatedDestinations;
    protected int parent;
    protected int previous;

    public AbstractNavigator(Activity activity)
    {
        previous = -1;
        current = -1;
        parent = -1;
        notAnimatedDestinations = new HashSet();
        notAnimatedDestinations.add(Integer.valueOf(-2));
        Set set = getNavigatorNotAnimatedDestinations();
        if (set != null && set.size() != 0)
        {
            notAnimatedDestinations.addAll(set);
        }
        navigationListeners = new HashSet(1);
        context = activity;
    }

    private MapAppFragment getParent(MapAppFragment mapappfragment)
    {
        return (MapAppFragment)mapappfragment.getTargetFragment();
    }

    private void hideCurrentFragment(FragmentTransaction fragmenttransaction, MapAppFragment mapappfragment, MapAppFragment mapappfragment1, boolean flag)
    {
        MapAppFragment mapappfragment2 = getParent(mapappfragment);
        if (mapappfragment2 == null) goto _L2; else goto _L1
_L1:
        if (mapappfragment2 == mapappfragment1)
        {
            if (flag)
            {
                fragmenttransaction.setCustomAnimations(mapappfragment.getEnterAnimation(), mapappfragment.getExitAnimation());
            }
        } else
        {
            fragmenttransaction.detach(mapappfragment2);
        }
_L4:
        fragmenttransaction.detach(mapappfragment);
        return;
_L2:
        if (flag)
        {
            fragmenttransaction.setCustomAnimations(mapappfragment.getEnterAnimation(), mapappfragment.getExitAnimation());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void releaseInstances()
    {
        context = null;
        activeFragment = null;
    }

    protected abstract MapAppFragment chooseNext(int i, FragmentManager fragmentmanager, FragmentTransaction fragmenttransaction);

    public void destroy()
    {
        destroyed = true;
        releaseInstances();
    }

    protected int getDefaultDestination()
    {
        return -1;
    }

    protected Set getNavigatorNotAnimatedDestinations()
    {
        return new HashSet();
    }

    public boolean isDestinationActive(int i)
    {
        return current == i || parent == i;
    }

    public void navigateTo(int i)
    {
        navigateTo(i, null);
    }

    public void navigateTo(int i, Bundle bundle)
    {
        if (!destroyed) goto _L2; else goto _L1
_L1:
        if (ConfigInfo.DEBUG)
        {
            Log.w(TAG, "navigateTo: call after activity is destroyed");
        }
_L4:
        return;
_L2:
        int j;
        boolean flag1;
        flag1 = true;
        if (notAnimatedDestinations.contains(Integer.valueOf(i)))
        {
            flag1 = false;
        }
        j = i;
        if (-2 == i)
        {
            if (previous == -1)
            {
                j = getDefaultDestination();
            } else
            {
                j = previous;
            }
        }
        if (current != j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("next destination is the same as current: current = ").append(current).append("; next = ").append(j).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj = context.getFragmentManager();
        FragmentTransaction fragmenttransaction = ((FragmentManager) (obj)).beginTransaction();
        MapAppFragment mapappfragment = activeFragment;
        obj = chooseNext(j, ((FragmentManager) (obj)), fragmenttransaction);
        if (obj != null)
        {
            if (bundle != null)
            {
                ((MapAppFragment) (obj)).getArguments().putAll(bundle);
            }
            boolean flag;
            if (mapappfragment != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            bundle = getParent(((MapAppFragment) (obj)));
            if (bundle != null && bundle == mapappfragment)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (i != 0 && !flag)
            {
                hideCurrentFragment(fragmenttransaction, mapappfragment, ((MapAppFragment) (obj)), flag1);
            }
            if (bundle != null && bundle.isDetached())
            {
                fragmenttransaction.attach(bundle);
            }
            if (flag1)
            {
                fragmenttransaction.setCustomAnimations(((MapAppFragment) (obj)).getEnterAnimation(), ((MapAppFragment) (obj)).getExitAnimation());
            }
            if (((MapAppFragment) (obj)).isDetached())
            {
                fragmenttransaction.attach(((android.app.Fragment) (obj)));
            }
            fragmenttransaction.commitAllowingStateLoss();
            notifyNavigation(j, parent);
            activeFragment = ((MapAppFragment) (obj));
            current = j;
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void notifyNavigation(int i, int j)
    {
        com.wsi.android.framework.ui.utils.Navigator.OnNavigationListener onnavigationlistener;
        for (Iterator iterator = navigationListeners.iterator(); iterator.hasNext(); onnavigationlistener.onNavigation(i))
        {
            onnavigationlistener = (com.wsi.android.framework.ui.utils.Navigator.OnNavigationListener)iterator.next();
            if (j != -1)
            {
                onnavigationlistener.onNavigation(j);
            }
        }

    }

    public void onRestoreInstanceState(Bundle bundle)
    {
    /* block-local class not found */
    class SavedState {}

        bundle = (SavedState)bundle.getParcelable("nav_state");
        current = ((SavedState) (bundle)).current;
        parent = ((SavedState) (bundle)).parent;
        activeFragment = (MapAppFragment)context.getFragmentManager().getFragment(((SavedState) (bundle)).active, "active");
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("onRestoreInstanceState: ").append(bundle).toString());
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        SavedState savedstate = new SavedState();
        savedstate.current = current;
        savedstate.parent = parent;
        Bundle bundle1 = new Bundle(1);
        context.getFragmentManager().putFragment(bundle1, "active", activeFragment);
        savedstate.active = bundle1;
        bundle.putParcelable("nav_state", savedstate);
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("onSaveInstanceState: ").append(savedstate).toString());
        }
    }

    public boolean popBackStack()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "popBackStack");
        }
        if (activeFragment != null && activeFragment.hasInternalBackStack() && activeFragment.popInternalBackStack())
        {
            return true;
        }
        if (parent != -1)
        {
            navigateTo(parent, null);
            return true;
        } else
        {
            return false;
        }
    }

    public void registerNavigationListener(com.wsi.android.framework.ui.utils.Navigator.OnNavigationListener onnavigationlistener)
    {
        navigationListeners.add(onnavigationlistener);
    }

    public void resetCurrentDestination(int i)
    {
        previous = i;
    }

    public void unregisterNavigationListener(com.wsi.android.framework.ui.utils.Navigator.OnNavigationListener onnavigationlistener)
    {
        navigationListeners.remove(onnavigationlistener);
    }
}
