// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.actionbarsherlock.internal.app:
//            ActionBarImpl

public class ActionBarWrapper extends ActionBar
    implements android.app.ActionBar.OnNavigationListener, android.app.ActionBar.OnMenuVisibilityListener
{

    private final android.app.ActionBar mActionBar;
    private final Activity mActivity;
    private FragmentTransaction mFragmentTransaction;
    private Set mMenuVisibilityListeners;
    private com.actionbarsherlock.app.ActionBar.OnNavigationListener mNavigationListener;

    public ActionBarWrapper(Activity activity)
    {
        mMenuVisibilityListeners = new HashSet(1);
        mActivity = activity;
        mActionBar = activity.getActionBar();
        if (mActionBar != null)
        {
            mActionBar.addOnMenuVisibilityListener(this);
        }
    }

    public void addOnMenuVisibilityListener(com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.add(onmenuvisibilitylistener);
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab)
    {
        mActionBar.addTab(((TabWrapper)tab).mNativeTab);
    }

    public Context getThemedContext()
    {
        return mActionBar.getThemedContext();
    }

    public void hide()
    {
        mActionBar.hide();
    }

    public com.actionbarsherlock.app.ActionBar.Tab newTab()
    {
        return new TabWrapper(mActionBar.newTab());
    }

    public void onMenuVisibilityChanged(boolean flag)
    {
        int i = ActionBarImpl.a;
        Iterator iterator = mMenuVisibilityListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener)iterator.next()).onMenuVisibilityChanged(flag);
        } while (i == 0);
    }

    public boolean onNavigationItemSelected(int i, long l)
    {
        return mNavigationListener.onNavigationItemSelected(i, l);
    }

    public void removeOnMenuVisibilityListener(com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.remove(onmenuvisibilitylistener);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mActionBar.setBackgroundDrawable(drawable);
    }

    public void setCustomView(View view)
    {
        mActionBar.setCustomView(view);
    }

    public void setCustomView(View view, com.actionbarsherlock.app.ActionBar.LayoutParams layoutparams)
    {
        int i = ActionBarImpl.a;
        android.app.ActionBar.LayoutParams layoutparams1 = new android.app.ActionBar.LayoutParams(layoutparams);
        layoutparams1.gravity = layoutparams.gravity;
        layoutparams1.bottomMargin = layoutparams.bottomMargin;
        layoutparams1.topMargin = layoutparams.topMargin;
        layoutparams1.leftMargin = layoutparams.leftMargin;
        layoutparams1.rightMargin = layoutparams.rightMargin;
        mActionBar.setCustomView(view, layoutparams1);
        if (SherlockActivity.a)
        {
            ActionBarImpl.a = i + 1;
        }
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
    {
        mActionBar.setDisplayHomeAsUpEnabled(flag);
    }

    public void setDisplayOptions(int i)
    {
        mActionBar.setDisplayOptions(i);
    }

    public void setDisplayShowCustomEnabled(boolean flag)
    {
        mActionBar.setDisplayShowCustomEnabled(flag);
    }

    public void setDisplayShowHomeEnabled(boolean flag)
    {
        mActionBar.setDisplayShowHomeEnabled(flag);
    }

    public void setDisplayShowTitleEnabled(boolean flag)
    {
        mActionBar.setDisplayShowTitleEnabled(flag);
    }

    public void setIcon(int i)
    {
        mActionBar.setIcon(i);
    }

    public void setIcon(Drawable drawable)
    {
        mActionBar.setIcon(drawable);
    }

    public void setNavigationMode(int i)
    {
        mActionBar.setNavigationMode(i);
    }

    public void setSelectedNavigationItem(int i)
    {
        mActionBar.setSelectedNavigationItem(i);
    }

    public void setSubtitle(int i)
    {
        mActionBar.setSubtitle(i);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mActionBar.setSubtitle(charsequence);
    }

    public void setTitle(int i)
    {
        mActionBar.setTitle(i);
    }

    public void setTitle(CharSequence charsequence)
    {
        mActionBar.setTitle(charsequence);
    }

    public void show()
    {
        mActionBar.show();
    }




/*
    static FragmentTransaction access$102(ActionBarWrapper actionbarwrapper, FragmentTransaction fragmenttransaction)
    {
        actionbarwrapper.mFragmentTransaction = fragmenttransaction;
        return fragmenttransaction;
    }

*/

    private class TabWrapper extends com.actionbarsherlock.app.ActionBar.Tab
        implements android.app.ActionBar.TabListener
    {

        private com.actionbarsherlock.app.ActionBar.TabListener mListener;
        final android.app.ActionBar.Tab mNativeTab;
        final ActionBarWrapper this$0;

        public CharSequence getContentDescription()
        {
            return mNativeTab.getContentDescription();
        }

        public View getCustomView()
        {
            return mNativeTab.getCustomView();
        }

        public Drawable getIcon()
        {
            return mNativeTab.getIcon();
        }

        public int getPosition()
        {
            return mNativeTab.getPosition();
        }

        public CharSequence getText()
        {
            return mNativeTab.getText();
        }

        public void onTabReselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
            if (mListener != null)
            {
                tab = null;
                if (mActivity instanceof FragmentActivity)
                {
                    tab = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
                }
                mListener.onTabReselected(this, tab);
                if (tab != null && !tab.isEmpty())
                {
                    tab.commit();
                }
            }
        }

        public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
            if (mListener != null)
            {
                if (mFragmentTransaction == null && (mActivity instanceof FragmentActivity))
                {
                    mFragmentTransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
                }
                mListener.onTabSelected(this, mFragmentTransaction);
                if (mFragmentTransaction != null)
                {
                    if (!mFragmentTransaction.isEmpty())
                    {
                        mFragmentTransaction.commit();
                    }
                    mFragmentTransaction = null;
                }
            }
        }

        public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
            if (mListener != null)
            {
                tab = null;
                if (mActivity instanceof FragmentActivity)
                {
                    tab = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
                    mFragmentTransaction = tab;
                }
                mListener.onTabUnselected(this, tab);
            }
        }

        public void select()
        {
            mNativeTab.select();
        }

        public com.actionbarsherlock.app.ActionBar.Tab setIcon(int i)
        {
            mNativeTab.setIcon(i);
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setTabListener(com.actionbarsherlock.app.ActionBar.TabListener tablistener)
        {
            android.app.ActionBar.Tab tab = mNativeTab;
            TabWrapper tabwrapper;
            if (tablistener != null)
            {
                tabwrapper = this;
            } else
            {
                tabwrapper = null;
            }
            tab.setTabListener(tabwrapper);
            mListener = tablistener;
            return this;
        }

        public TabWrapper(android.app.ActionBar.Tab tab)
        {
            this$0 = ActionBarWrapper.this;
            super();
            mNativeTab = tab;
            mNativeTab.setTag(this);
        }
    }

}
