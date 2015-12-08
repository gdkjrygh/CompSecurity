// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.app:
//            FragmentManager, Fragment, FragmentTransaction

public abstract class FragmentPagerAdapter extends PagerAdapter
{

    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;

    public FragmentPagerAdapter(FragmentManager fragmentmanager)
    {
        mCurTransaction = null;
        mCurrentPrimaryItem = null;
        mFragmentManager = fragmentmanager;
    }

    private static String makeFragmentName(int i, long l)
    {
        return (new StringBuilder()).append("android:switcher:").append(i).append(":").append(l).toString();
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        mCurTransaction.detach((Fragment)obj);
    }

    public void finishUpdate(ViewGroup viewgroup)
    {
        if (mCurTransaction != null)
        {
            mCurTransaction.commitAllowingStateLoss();
            mCurTransaction = null;
            mFragmentManager.executePendingTransactions();
        }
    }

    public abstract Fragment getItem(int i);

    public long getItemId(int i)
    {
        return (long)i;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        long l = getItemId(i);
        Object obj = makeFragmentName(viewgroup.getId(), l);
        obj = mFragmentManager.findFragmentByTag(((String) (obj)));
        if (obj != null)
        {
            mCurTransaction.attach(((Fragment) (obj)));
            viewgroup = ((ViewGroup) (obj));
        } else
        {
            Fragment fragment = getItem(i);
            mCurTransaction.add(viewgroup.getId(), fragment, makeFragmentName(viewgroup.getId(), l));
            viewgroup = fragment;
        }
        if (viewgroup != mCurrentPrimaryItem)
        {
            viewgroup.setMenuVisibility(false);
            viewgroup.setUserVisibleHint(false);
        }
        return viewgroup;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return ((Fragment)obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (Fragment)obj;
        if (viewgroup != mCurrentPrimaryItem)
        {
            if (mCurrentPrimaryItem != null)
            {
                mCurrentPrimaryItem.setMenuVisibility(false);
                mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            if (viewgroup != null)
            {
                viewgroup.setMenuVisibility(true);
                viewgroup.setUserVisibleHint(true);
            }
            mCurrentPrimaryItem = viewgroup;
        }
    }

    public void startUpdate(ViewGroup viewgroup)
    {
    }
}
