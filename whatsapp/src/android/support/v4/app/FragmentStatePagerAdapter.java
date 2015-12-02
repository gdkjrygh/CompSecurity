// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity, Fragment, FragmentManager, FragmentTransaction

public abstract class FragmentStatePagerAdapter extends PagerAdapter
{

    private static final String z[];
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;
    private ArrayList mFragments;
    private ArrayList mSavedState;

    public FragmentStatePagerAdapter(FragmentManager fragmentmanager)
    {
        mCurTransaction = null;
        mSavedState = new ArrayList();
        mFragments = new ArrayList();
        mCurrentPrimaryItem = null;
        mFragmentManager = fragmentmanager;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        int j = FragmentActivity.a;
        viewgroup = (Fragment)obj;
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        do
        {
            if (mSavedState.size() > i)
            {
                break;
            }
            mSavedState.add(null);
        } while (j == 0);
        mSavedState.set(i, mFragmentManager.saveFragmentInstanceState(viewgroup));
        mFragments.set(i, null);
        mCurTransaction.remove(viewgroup);
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

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        int j = FragmentActivity.a;
        if (mFragments.size() > i)
        {
            Fragment fragment = (Fragment)mFragments.get(i);
            if (fragment != null)
            {
                return fragment;
            }
        }
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        Fragment fragment1 = getItem(i);
        if (mSavedState.size() > i)
        {
            Fragment.SavedState savedstate = (Fragment.SavedState)mSavedState.get(i);
            if (savedstate != null)
            {
                fragment1.setInitialSavedState(savedstate);
            }
        }
        do
        {
            if (mFragments.size() > i)
            {
                break;
            }
            mFragments.add(null);
        } while (j == 0);
        fragment1.setMenuVisibility(false);
        fragment1.setUserVisibleHint(false);
        mFragments.set(i, fragment1);
        mCurTransaction.add(viewgroup.getId(), fragment1);
        return fragment1;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return ((Fragment)obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
        int j = FragmentActivity.a;
        if (parcelable == null) goto _L2; else goto _L1
_L1:
        parcelable = (Bundle)parcelable;
        parcelable.setClassLoader(classloader);
        classloader = parcelable.getParcelableArray(z[3]);
        mSavedState.clear();
        mFragments.clear();
        if (classloader == null) goto _L4; else goto _L3
_L3:
        int i = 0;
_L8:
        if (i >= classloader.length) goto _L4; else goto _L5
_L5:
        mSavedState.add((Fragment.SavedState)classloader[i]);
        if (j == 0) goto _L6; else goto _L4
_L4:
        classloader = parcelable.keySet().iterator();
        do
        {
            if (!classloader.hasNext())
            {
                break;
            }
            String s = (String)classloader.next();
            if (!s.startsWith("f"))
            {
                continue;
            }
            i = Integer.parseInt(s.substring(1));
            Fragment fragment = mFragmentManager.getFragment(parcelable, s);
            if (fragment != null)
            {
                do
                {
                    if (mFragments.size() > i)
                    {
                        break;
                    }
                    mFragments.add(null);
                } while (j == 0);
                fragment.setMenuVisibility(false);
                mFragments.set(i, fragment);
                if (j == 0)
                {
                    continue;
                }
            }
            Log.w(z[2], (new StringBuilder()).append(z[1]).append(s).toString());
        } while (j == 0);
_L2:
        return;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Parcelable saveState()
    {
        int i = 0;
        int j = FragmentActivity.a;
        Object obj = null;
        if (mSavedState.size() > 0)
        {
            obj = new Bundle();
            Fragment.SavedState asavedstate[] = new Fragment.SavedState[mSavedState.size()];
            mSavedState.toArray(asavedstate);
            ((Bundle) (obj)).putParcelableArray(z[0], asavedstate);
        }
        do
        {
            Bundle bundle;
label0:
            {
                bundle = ((Bundle) (obj));
                if (i < mFragments.size())
                {
                    Fragment fragment = (Fragment)mFragments.get(i);
                    bundle = ((Bundle) (obj));
                    if (fragment != null)
                    {
                        bundle = ((Bundle) (obj));
                        if (obj == null)
                        {
                            bundle = new Bundle();
                        }
                        obj = (new StringBuilder()).append("f").append(i).toString();
                        mFragmentManager.putFragment(bundle, ((String) (obj)), fragment);
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return bundle;
            }
            i++;
            obj = bundle;
        } while (true);
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

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\0323}\006B\032";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "+&xRA\033&{\037B\0073<\023SI,y\013\007";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "/5}\025J\f)h!S\b3y\"F\016\"n3C\b7h\027U";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\0323}\006B\032";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 39;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 105;
          goto _L9
_L5:
        byte0 = 71;
          goto _L9
_L6:
        byte0 = 28;
          goto _L9
        byte0 = 114;
          goto _L9
    }
}
