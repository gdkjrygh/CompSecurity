// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import java.util.HashSet;

// Referenced classes of package com.walmartlabs.ui:
//            FragmentSwitchedEvent, PresenterFragment

public class FragmentSwitcher
{
    public static interface OnSwitchedToListener
    {

        public abstract void onSwitchedToFragment(String s);
    }


    private static final String TAG = com/walmartlabs/ui/FragmentSwitcher.getSimpleName();
    private int mAnimationIn;
    private int mAnimationOut;
    private int mContainerId;
    private FragmentManager mFragmentManager;
    private final HashSet mFragmentsCreated = new HashSet();
    private String mHomeTag;
    private OnSwitchedToListener mOnSwitchedToListener;
    private String mTopFragmentTag;
    private boolean mUseAnimations;

    public FragmentSwitcher(FragmentManager fragmentmanager, int i)
    {
        mFragmentManager = fragmentmanager;
        mContainerId = i;
    }

    private void notifySwitchedTo(String s)
    {
        if (mOnSwitchedToListener != null)
        {
            mOnSwitchedToListener.onSwitchedToFragment(s);
        }
        MessageBus.getBus().post(new FragmentSwitchedEvent(s));
    }

    public void addFragment(String s, PresenterFragment presenterfragment)
    {
        addFragment(s, presenterfragment, false);
    }

    public void addFragment(String s, PresenterFragment presenterfragment, boolean flag)
    {
        FragmentTransaction fragmenttransaction;
        if (mFragmentsCreated.contains(s))
        {
            return;
        }
        fragmenttransaction = mFragmentManager.beginTransaction();
        if (mHomeTag != null) goto _L2; else goto _L1
_L1:
        mHomeTag = s;
_L4:
        fragmenttransaction.add(mContainerId, presenterfragment, s);
        fragmenttransaction.commit();
        mTopFragmentTag = s;
        mFragmentsCreated.add(s);
        notifySwitchedTo(s);
        return;
_L2:
        android.support.v4.app.Fragment fragment = mFragmentManager.findFragmentByTag(mTopFragmentTag);
        if (mUseAnimations)
        {
            fragmenttransaction.setCustomAnimations(mAnimationIn, mAnimationOut);
        }
        if (fragment != null)
        {
            if (flag)
            {
                fragmenttransaction.remove(fragment);
            } else
            {
                fragmenttransaction.detach(fragment);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public PresenterFragment getFragment(String s)
    {
        return (PresenterFragment)mFragmentManager.findFragmentByTag(s);
    }

    public PresenterFragment getTopFragment()
    {
        return getFragment(mTopFragmentTag);
    }

    public boolean hasFragment(String s)
    {
        return mFragmentManager.findFragmentByTag(s) != null;
    }

    public boolean onBackPressed()
    {
        return onBackPressed(mHomeTag);
    }

    public boolean onBackPressed(String s)
    {
        if (mTopFragmentTag != null)
        {
            PresenterFragment presenterfragment = (PresenterFragment)mFragmentManager.findFragmentByTag(mTopFragmentTag);
            if (presenterfragment != null && presenterfragment.onBackPressed())
            {
                return true;
            }
            if (!mTopFragmentTag.equals(mHomeTag))
            {
                android.support.v4.app.Fragment fragment = mFragmentManager.findFragmentByTag(s);
                FragmentTransaction fragmenttransaction = mFragmentManager.beginTransaction();
                if (mUseAnimations)
                {
                    fragmenttransaction.setCustomAnimations(mAnimationIn, mAnimationOut);
                }
                if (presenterfragment != null)
                {
                    fragmenttransaction.detach(presenterfragment);
                }
                if (fragment != null)
                {
                    fragmenttransaction.attach(fragment);
                    fragmenttransaction.commit();
                    mTopFragmentTag = s;
                    notifySwitchedTo(s);
                }
                return true;
            }
        }
        return false;
    }

    public void setAnimations(int i, int j)
    {
        mAnimationIn = i;
        mAnimationOut = j;
        boolean flag;
        if (i != 0 || j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mUseAnimations = flag;
    }

    public void setOnSwitchedToListener(OnSwitchedToListener onswitchedtolistener)
    {
        mOnSwitchedToListener = onswitchedtolistener;
    }

    public void switchToFragment(String s, boolean flag, boolean flag1)
    {
        PresenterFragment presenterfragment = (PresenterFragment)mFragmentManager.findFragmentByTag(mTopFragmentTag);
        if (s.equals(mTopFragmentTag))
        {
            if (presenterfragment != null)
            {
                presenterfragment.onRestart();
            }
        } else
        {
            android.support.v4.app.Fragment fragment = mFragmentManager.findFragmentByTag(s);
            if (fragment != null)
            {
                if (flag1)
                {
                    ((PresenterFragment)fragment).popToRoot();
                }
                FragmentTransaction fragmenttransaction = mFragmentManager.beginTransaction();
                if (mUseAnimations)
                {
                    fragmenttransaction.setCustomAnimations(mAnimationIn, mAnimationOut);
                }
                if (presenterfragment != null)
                {
                    if (flag)
                    {
                        fragmenttransaction.remove(presenterfragment);
                    } else
                    {
                        fragmenttransaction.detach(presenterfragment);
                    }
                }
                fragmenttransaction.attach(fragment);
                try
                {
                    fragmenttransaction.commit();
                    mTopFragmentTag = s;
                    notifySwitchedTo(s);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    Log.e(TAG, "Caught IllegalStateException while switching fragments probably due to switching ocurring after activity getting paused.", s);
                }
                return;
            }
        }
    }

}
