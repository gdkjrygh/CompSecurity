// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SimpleArrayMap;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity, LoaderManagerImpl, FragmentManagerImpl, SuperNotCalledException, 
//            SharedElementCallback, FragmentManager, LoaderManager

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    static final Object USE_DEFAULT_TRANSITION;
    public static int a;
    private static final SimpleArrayMap sClassMap;
    private static final String z[];
    FragmentActivity mActivity;
    boolean mAdded;
    Boolean mAllowEnterTransitionOverlap;
    Boolean mAllowReturnTransitionOverlap;
    View mAnimatingAway;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    boolean mCheckedForLoaderManager;
    FragmentManagerImpl mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    Object mEnterTransition;
    SharedElementCallback mEnterTransitionCallback;
    Object mExitTransition;
    SharedElementCallback mExitTransitionCallback;
    int mFragmentId;
    FragmentManagerImpl mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mInLayout;
    int mIndex;
    View mInnerView;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mMenuVisible;
    int mNextAnim;
    Fragment mParentFragment;
    Object mReenterTransition;
    boolean mRemoving;
    boolean mRestored;
    boolean mResumed;
    boolean mRetainInstance;
    boolean mRetaining;
    Object mReturnTransition;
    Bundle mSavedFragmentState;
    SparseArray mSavedViewState;
    Object mSharedElementEnterTransition;
    Object mSharedElementReturnTransition;
    int mState;
    int mStateAfterAnimating;
    String mTag;
    Fragment mTarget;
    int mTargetIndex;
    int mTargetRequestCode;
    boolean mUserVisibleHint;
    View mView;
    String mWho;

    public Fragment()
    {
        mState = 0;
        mIndex = -1;
        mTargetIndex = -1;
        mMenuVisible = true;
        mUserVisibleHint = true;
        mEnterTransition = null;
        mReturnTransition = USE_DEFAULT_TRANSITION;
        mExitTransition = null;
        mReenterTransition = USE_DEFAULT_TRANSITION;
        mSharedElementEnterTransition = null;
        mSharedElementReturnTransition = USE_DEFAULT_TRANSITION;
        mEnterTransitionCallback = null;
        mExitTransitionCallback = null;
    }

    public static Fragment instantiate(Context context, String s)
    {
        return instantiate(context, s, null);
    }

    public static Fragment instantiate(Context context, String s, Bundle bundle)
    {
        Class class1;
        Class class2;
        try
        {
            class2 = (Class)sClassMap.get(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder()).append(z[50]).append(s).append(z[55]).append(z[51]).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder()).append(z[58]).append(s).append(z[54]).append(z[53]).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder()).append(z[52]).append(s).append(z[57]).append(z[56]).toString(), context);
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = context.getClassLoader().loadClass(s);
        sClassMap.put(s, class1);
        context = (Fragment)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.mArguments = bundle;
        return context;
        context;
        throw context;
    }

    static boolean isSupportFragmentClass(Context context, String s)
    {
        Class class1;
        Class class2;
        boolean flag;
        try
        {
            class2 = (Class)sClassMap.get(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        class1 = context.getClassLoader().loadClass(s);
        sClassMap.put(s, class1);
        flag = android/support/v4/app/Fragment.isAssignableFrom(class1);
        return flag;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int i = FragmentActivity.a;
        try
        {
            printwriter.print(s);
            printwriter.print(z[26]);
            printwriter.print(Integer.toHexString(mFragmentId));
            printwriter.print(z[7]);
            printwriter.print(Integer.toHexString(mContainerId));
            printwriter.print(z[28]);
            printwriter.println(mTag);
            printwriter.print(s);
            printwriter.print(z[29]);
            printwriter.print(mState);
            printwriter.print(z[35]);
            printwriter.print(mIndex);
            printwriter.print(z[27]);
            printwriter.print(mWho);
            printwriter.print(z[31]);
            printwriter.println(mBackStackNesting);
            printwriter.print(s);
            printwriter.print(z[16]);
            printwriter.print(mAdded);
            printwriter.print(z[14]);
            printwriter.print(mRemoving);
            printwriter.print(z[12]);
            printwriter.print(mResumed);
            printwriter.print(z[36]);
            printwriter.print(mFromLayout);
            printwriter.print(z[30]);
            printwriter.println(mInLayout);
            printwriter.print(s);
            printwriter.print(z[37]);
            printwriter.print(mHidden);
            printwriter.print(z[19]);
            printwriter.print(mDetached);
            printwriter.print(z[21]);
            printwriter.print(mMenuVisible);
            printwriter.print(z[22]);
            printwriter.println(mHasMenu);
            printwriter.print(s);
            printwriter.print(z[15]);
            printwriter.print(mRetainInstance);
            printwriter.print(z[4]);
            printwriter.print(mRetaining);
            printwriter.print(z[24]);
            printwriter.println(mUserVisibleHint);
            if (mFragmentManager != null)
            {
                printwriter.print(s);
                printwriter.print(z[6]);
                printwriter.println(mFragmentManager);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mActivity != null)
            {
                printwriter.print(s);
                printwriter.print(z[3]);
                printwriter.println(mActivity);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mParentFragment != null)
            {
                printwriter.print(s);
                printwriter.print(z[8]);
                printwriter.println(mParentFragment);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mArguments != null)
            {
                printwriter.print(s);
                printwriter.print(z[38]);
                printwriter.println(mArguments);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mSavedFragmentState != null)
            {
                printwriter.print(s);
                printwriter.print(z[20]);
                printwriter.println(mSavedFragmentState);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mSavedViewState != null)
            {
                printwriter.print(s);
                printwriter.print(z[5]);
                printwriter.println(mSavedViewState);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mTarget != null)
            {
                printwriter.print(s);
                printwriter.print(z[9]);
                printwriter.print(mTarget);
                printwriter.print(z[33]);
                printwriter.println(mTargetRequestCode);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mNextAnim != 0)
            {
                printwriter.print(s);
                printwriter.print(z[39]);
                printwriter.println(mNextAnim);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mContainer != null)
            {
                printwriter.print(s);
                printwriter.print(z[13]);
                printwriter.println(mContainer);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mView != null)
            {
                printwriter.print(s);
                printwriter.print(z[10]);
                printwriter.println(mView);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mInnerView != null)
            {
                printwriter.print(s);
                printwriter.print(z[17]);
                printwriter.println(mView);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mAnimatingAway != null)
            {
                printwriter.print(s);
                printwriter.print(z[11]);
                printwriter.println(mAnimatingAway);
                printwriter.print(s);
                printwriter.print(z[23]);
                printwriter.println(mStateAfterAnimating);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mLoaderManager != null)
            {
                printwriter.print(s);
                printwriter.println(z[25]);
                mLoaderManager.dump((new StringBuilder()).append(s).append(z[34]).toString(), filedescriptor, printwriter, as);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mChildFragmentManager != null)
            {
                printwriter.print(s);
                printwriter.println((new StringBuilder()).append(z[18]).append(mChildFragmentManager).append(":").toString());
                mChildFragmentManager.dump((new StringBuilder()).append(s).append(z[32]).toString(), filedescriptor, printwriter, as);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (i != 0)
        {
            a++;
        }
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final FragmentActivity getActivity()
    {
        return mActivity;
    }

    public boolean getAllowEnterTransitionOverlap()
    {
        Boolean boolean1;
        try
        {
            boolean1 = mAllowEnterTransitionOverlap;
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        if (boolean1 == null)
        {
            return true;
        } else
        {
            return mAllowEnterTransitionOverlap.booleanValue();
        }
    }

    public boolean getAllowReturnTransitionOverlap()
    {
        Boolean boolean1;
        try
        {
            boolean1 = mAllowReturnTransitionOverlap;
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        if (boolean1 == null)
        {
            return true;
        } else
        {
            return mAllowReturnTransitionOverlap.booleanValue();
        }
    }

    public final Bundle getArguments()
    {
        return mArguments;
    }

    public final FragmentManager getChildFragmentManager()
    {
        int i = FragmentActivity.a;
        FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
        if (fragmentmanagerimpl != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        int j;
        instantiateChildFragmentManager();
        j = mState;
        if (j < 5)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        mChildFragmentManager.dispatchResume();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        j = mState;
        if (j < 4)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        mChildFragmentManager.dispatchStart();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        j = mState;
        if (j < 2)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        mChildFragmentManager.dispatchActivityCreated();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        InstantiationException instantiationexception;
        try
        {
            if (mState >= 1)
            {
                mChildFragmentManager.dispatchCreate();
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        return mChildFragmentManager;
        instantiationexception;
        throw instantiationexception;
        instantiationexception;
        throw instantiationexception;
        instantiationexception;
        throw instantiationexception;
        instantiationexception;
        throw instantiationexception;
        instantiationexception;
        throw instantiationexception;
        instantiationexception;
        throw instantiationexception;
        instantiationexception;
        throw instantiationexception;
    }

    public Object getEnterTransition()
    {
        return mEnterTransition;
    }

    public Object getExitTransition()
    {
        return mExitTransition;
    }

    public final FragmentManager getFragmentManager()
    {
        return mFragmentManager;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        bundle = mActivity.getLayoutInflater().cloneInContext(mActivity);
        getChildFragmentManager();
        bundle.setFactory(mChildFragmentManager.getLayoutInflaterFactory());
        return bundle;
    }

    public LoaderManager getLoaderManager()
    {
label0:
        {
            LoaderManagerImpl loadermanagerimpl;
            try
            {
                if (mLoaderManager == null)
                {
                    break label0;
                }
                loadermanagerimpl = mLoaderManager;
            }
            catch (InstantiationException instantiationexception)
            {
                throw instantiationexception;
            }
            return loadermanagerimpl;
        }
        try
        {
            if (mActivity == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(z[65]).append(this).append(z[64]).toString());
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        mCheckedForLoaderManager = true;
        mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, true);
        return mLoaderManager;
    }

    public Object getReenterTransition()
    {
label0:
        {
            Object obj;
            try
            {
                if (mReenterTransition != USE_DEFAULT_TRANSITION)
                {
                    break label0;
                }
                obj = getExitTransition();
            }
            catch (InstantiationException instantiationexception)
            {
                throw instantiationexception;
            }
            return obj;
        }
        return mReenterTransition;
    }

    public final Resources getResources()
    {
        try
        {
            if (mActivity == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(z[47]).append(this).append(z[46]).toString());
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        return mActivity.getResources();
    }

    public Object getReturnTransition()
    {
label0:
        {
            Object obj;
            try
            {
                if (mReturnTransition != USE_DEFAULT_TRANSITION)
                {
                    break label0;
                }
                obj = getEnterTransition();
            }
            catch (InstantiationException instantiationexception)
            {
                throw instantiationexception;
            }
            return obj;
        }
        return mReturnTransition;
    }

    public Object getSharedElementEnterTransition()
    {
        return mSharedElementEnterTransition;
    }

    public Object getSharedElementReturnTransition()
    {
label0:
        {
            Object obj;
            try
            {
                if (mSharedElementReturnTransition != USE_DEFAULT_TRANSITION)
                {
                    break label0;
                }
                obj = getSharedElementEnterTransition();
            }
            catch (InstantiationException instantiationexception)
            {
                throw instantiationexception;
            }
            return obj;
        }
        return mSharedElementReturnTransition;
    }

    public final String getString(int i)
    {
        return getResources().getString(i);
    }

    public final String getString(int i, Object aobj[])
    {
        return getResources().getString(i, aobj);
    }

    public View getView()
    {
        return mView;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    void initState()
    {
        mIndex = -1;
        mWho = null;
        mAdded = false;
        mRemoving = false;
        mResumed = false;
        mFromLayout = false;
        mInLayout = false;
        mRestored = false;
        mBackStackNesting = 0;
        mFragmentManager = null;
        mChildFragmentManager = null;
        mActivity = null;
        mFragmentId = 0;
        mContainerId = 0;
        mTag = null;
        mHidden = false;
        mDetached = false;
        mRetaining = false;
        mLoaderManager = null;
        mLoadersStarted = false;
        mCheckedForLoaderManager = false;
    }

    void instantiateChildFragmentManager()
    {
        mChildFragmentManager = new FragmentManagerImpl();
        mChildFragmentManager.attachActivity(mActivity, new _cls1(), this);
    }

    public final boolean isAdded()
    {
        FragmentActivity fragmentactivity;
        try
        {
            fragmentactivity = mActivity;
        }
        catch (InstantiationException instantiationexception)
        {
            try
            {
                throw instantiationexception;
            }
            catch (InstantiationException instantiationexception1)
            {
                throw instantiationexception1;
            }
        }
        if (fragmentactivity == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (mAdded)
        {
            return true;
        }
        return false;
    }

    public final boolean isDetached()
    {
        return mDetached;
    }

    public final boolean isHidden()
    {
        return mHidden;
    }

    final boolean isInBackStack()
    {
        int i;
        try
        {
            i = mBackStackNesting;
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        return i > 0;
    }

    public final boolean isRemoving()
    {
        return mRemoving;
    }

    public final boolean isResumed()
    {
        return mResumed;
    }

    public void onActivityCreated(Bundle bundle)
    {
        mCalled = true;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
    }

    public void onAttach(Activity activity)
    {
        mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        mCalled = true;
    }

    public Animation onCreateAnimation(int i, boolean flag, int j)
    {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        getActivity().onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public void onDestroy()
    {
        try
        {
            mCalled = true;
            if (!mCheckedForLoaderManager)
            {
                mCheckedForLoaderManager = true;
                mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, false);
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        try
        {
            if (mLoaderManager != null)
            {
                mLoaderManager.doDestroy();
            }
            return;
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
    }

    public void onDestroyOptionsMenu()
    {
    }

    public void onDestroyView()
    {
        mCalled = true;
    }

    public void onDetach()
    {
        mCalled = true;
    }

    public void onHiddenChanged(boolean flag)
    {
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        mCalled = true;
    }

    public void onLowMemory()
    {
        mCalled = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu)
    {
    }

    public void onPause()
    {
        mCalled = true;
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
    }

    public void onResume()
    {
        mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    }

    public void onStart()
    {
        boolean flag;
        mCalled = true;
        flag = mLoadersStarted;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        InstantiationException instantiationexception;
        try
        {
            mLoadersStarted = true;
            if (!mCheckedForLoaderManager)
            {
                mCheckedForLoaderManager = true;
                mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, false);
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        if (mLoaderManager != null)
        {
            mLoaderManager.doStart();
        }
        return;
        instantiationexception;
        throw instantiationexception;
        InstantiationException instantiationexception2;
        instantiationexception2;
        throw instantiationexception2;
    }

    public void onStop()
    {
        mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
    }

    public void onViewStateRestored(Bundle bundle)
    {
        mCalled = true;
    }

    void performActivityCreated(Bundle bundle)
    {
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.noteStateNotSaved();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            mCalled = false;
            onActivityCreated(bundle);
            if (!mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[67]).append(this).append(z[66]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchActivityCreated();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    void performConfigurationChanged(Configuration configuration)
    {
        try
        {
            onConfigurationChanged(configuration);
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchConfigurationChanged(configuration);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Configuration configuration)
        {
            throw configuration;
        }
    }

    boolean performContextItemSelected(MenuItem menuitem)
    {
        boolean flag;
        try
        {
            flag = mHidden;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            try
            {
                throw menuitem;
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (onContextItemSelected(menuitem))
        {
            return true;
        }
        FragmentManagerImpl fragmentmanagerimpl;
        try
        {
            fragmentmanagerimpl = mChildFragmentManager;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            try
            {
                throw menuitem;
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
        }
        if (fragmentmanagerimpl == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (mChildFragmentManager.dispatchContextItemSelected(menuitem))
        {
            return true;
        }
        return false;
    }

    void performCreate(Bundle bundle)
    {
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.noteStateNotSaved();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            mCalled = false;
            onCreate(bundle);
            if (!mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[59]).append(this).append(z[60]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (bundle != null)
        {
            bundle = bundle.getParcelable(z[61]);
            if (bundle != null)
            {
                try
                {
                    if (mChildFragmentManager == null)
                    {
                        instantiateChildFragmentManager();
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw bundle;
                }
                mChildFragmentManager.restoreAllState(bundle, null);
                mChildFragmentManager.dispatchCreate();
            }
        }
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag;
        try
        {
            flag = mHidden;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            try
            {
                throw menu;
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        flag = flag2;
        if (!mHasMenu)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        flag1 = mMenuVisible;
        flag = flag2;
        if (flag1)
        {
            flag = true;
            onCreateOptionsMenu(menu, menuinflater);
        }
        flag1 = flag;
        if (mChildFragmentManager != null)
        {
            flag1 = flag | mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuinflater);
        }
        return flag1;
    }

    View performCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.noteStateNotSaved();
            }
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw layoutinflater;
        }
        return onCreateView(layoutinflater, viewgroup, bundle);
    }

    void performDestroy()
    {
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchDestroy();
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        try
        {
            mCalled = false;
            onDestroy();
            if (!mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[73]).append(this).append(z[74]).toString());
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
    }

    void performDestroyView()
    {
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchDestroyView();
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        try
        {
            mCalled = false;
            onDestroyView();
            if (!mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[49]).append(this).append(z[48]).toString());
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        try
        {
            if (mLoaderManager != null)
            {
                mLoaderManager.doReportNextStart();
            }
            return;
        }
        catch (InstantiationException instantiationexception2)
        {
            throw instantiationexception2;
        }
    }

    void performLowMemory()
    {
        try
        {
            onLowMemory();
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchLowMemory();
            }
            return;
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
    }

    boolean performOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = mHidden;
        if (flag) goto _L2; else goto _L1
_L1:
        flag = mHasMenu;
        if (!flag) goto _L4; else goto _L3
_L3:
        flag = mMenuVisible;
        if (!flag) goto _L4; else goto _L5
_L5:
        try
        {
            flag = onOptionsItemSelected(menuitem);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (!flag) goto _L4; else goto _L6
_L6:
        return true;
        menuitem;
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        throw menuitem;
_L4:
        FragmentManagerImpl fragmentmanagerimpl;
        try
        {
            fragmentmanagerimpl = mChildFragmentManager;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            try
            {
                throw menuitem;
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
        }
        if (fragmentmanagerimpl == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mChildFragmentManager.dispatchOptionsItemSelected(menuitem)) goto _L6; else goto _L2
_L2:
        return false;
    }

    void performOptionsMenuClosed(Menu menu)
    {
        boolean flag = mHidden;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        flag = mHasMenu;
        if (flag)
        {
            try
            {
                if (mMenuVisible)
                {
                    onOptionsMenuClosed(menu);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        if (mChildFragmentManager != null)
        {
            mChildFragmentManager.dispatchOptionsMenuClosed(menu);
        }
        return;
        menu;
        try
        {
            throw menu;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu) { }
        throw menu;
        menu;
        throw menu;
    }

    void performPause()
    {
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchPause();
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        try
        {
            mCalled = false;
            onPause();
            if (!mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[62]).append(this).append(z[63]).toString());
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
    }

    boolean performPrepareOptionsMenu(Menu menu)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag;
        try
        {
            flag = mHidden;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            try
            {
                throw menu;
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        flag = flag2;
        if (!mHasMenu)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        flag1 = mMenuVisible;
        flag = flag2;
        if (flag1)
        {
            flag = true;
            onPrepareOptionsMenu(menu);
        }
        flag1 = flag;
        if (mChildFragmentManager != null)
        {
            flag1 = flag | mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
        }
        return flag1;
    }

    void performReallyStop()
    {
        boolean flag;
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchReallyStop();
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        flag = mLoadersStarted;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        LoaderManagerImpl loadermanagerimpl;
        InstantiationException instantiationexception1;
        try
        {
            mLoadersStarted = false;
            if (!mCheckedForLoaderManager)
            {
                mCheckedForLoaderManager = true;
                mLoaderManager = mActivity.getLoaderManager(mWho, mLoadersStarted, false);
            }
        }
        catch (InstantiationException instantiationexception2)
        {
            throw instantiationexception2;
        }
        loadermanagerimpl = mLoaderManager;
        if (loadermanagerimpl == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        InstantiationException instantiationexception3;
        try
        {
            flag = mActivity.mRetaining;
        }
        catch (InstantiationException instantiationexception4)
        {
            try
            {
                throw instantiationexception4;
            }
            catch (InstantiationException instantiationexception5)
            {
                throw instantiationexception5;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        mLoaderManager.doStop();
        if (FragmentActivity.a == 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        mLoaderManager.doRetain();
        return;
        instantiationexception1;
        throw instantiationexception1;
        instantiationexception3;
        throw instantiationexception3;
    }

    void performResume()
    {
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.noteStateNotSaved();
                mChildFragmentManager.execPendingActions();
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        try
        {
            mCalled = false;
            onResume();
            if (!mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[69]).append(this).append(z[68]).toString());
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchResume();
                mChildFragmentManager.execPendingActions();
            }
            return;
        }
        catch (InstantiationException instantiationexception2)
        {
            throw instantiationexception2;
        }
    }

    void performSaveInstanceState(Bundle bundle)
    {
        android.os.Parcelable parcelable;
        onSaveInstanceState(bundle);
        if (mChildFragmentManager == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        parcelable = mChildFragmentManager.saveAllState();
        if (parcelable == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        bundle.putParcelable(z[40], parcelable);
        return;
        bundle;
        throw bundle;
    }

    void performStart()
    {
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.noteStateNotSaved();
                mChildFragmentManager.execPendingActions();
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        try
        {
            mCalled = false;
            onStart();
            if (!mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[41]).append(this).append(z[42]).toString());
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchStart();
            }
        }
        catch (InstantiationException instantiationexception2)
        {
            throw instantiationexception2;
        }
        try
        {
            if (mLoaderManager != null)
            {
                mLoaderManager.doReportStart();
            }
            return;
        }
        catch (InstantiationException instantiationexception3)
        {
            throw instantiationexception3;
        }
    }

    void performStop()
    {
        try
        {
            if (mChildFragmentManager != null)
            {
                mChildFragmentManager.dispatchStop();
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        try
        {
            mCalled = false;
            onStop();
            if (!mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[71]).append(this).append(z[72]).toString());
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
    }

    public void registerForContextMenu(View view)
    {
        view.setOnCreateContextMenuListener(this);
    }

    final void restoreViewState(Bundle bundle)
    {
        try
        {
            if (mSavedViewState != null)
            {
                mInnerView.restoreHierarchyState(mSavedViewState);
                mSavedViewState = null;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            mCalled = false;
            onViewStateRestored(bundle);
            if (!mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[75]).append(this).append(z[76]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    public void setArguments(Bundle bundle)
    {
        try
        {
            if (mIndex >= 0)
            {
                throw new IllegalStateException(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        mArguments = bundle;
    }

    public void setHasOptionsMenu(boolean flag)
    {
        boolean flag1 = mHasMenu;
        if (flag1 == flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        InstantiationException instantiationexception;
        try
        {
            mHasMenu = flag;
            flag = isAdded();
        }
        catch (InstantiationException instantiationexception1)
        {
            try
            {
                throw instantiationexception1;
            }
            catch (InstantiationException instantiationexception2)
            {
                throw instantiationexception2;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (!isHidden())
        {
            mActivity.supportInvalidateOptionsMenu();
        }
        return;
        instantiationexception;
        throw instantiationexception;
    }

    final void setIndex(int i, Fragment fragment)
    {
        try
        {
            mIndex = i;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            try
            {
                throw fragment;
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        if (fragment == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        mWho = (new StringBuilder()).append(fragment.mWho).append(":").append(mIndex).toString();
        if (FragmentActivity.a == 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        mWho = (new StringBuilder()).append(z[45]).append(mIndex).toString();
        return;
    }

    public void setInitialSavedState(SavedState savedstate)
    {
        try
        {
            if (mIndex >= 0)
            {
                throw new IllegalStateException(z[70]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (SavedState savedstate)
        {
            throw savedstate;
        }
        if (savedstate == null) goto _L2; else goto _L1
_L1:
        if (savedstate.mState == null) goto _L2; else goto _L3
_L3:
        savedstate = savedstate.mState;
_L5:
        mSavedFragmentState = savedstate;
        return;
        savedstate;
        throw savedstate;
_L2:
        savedstate = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setMenuVisibility(boolean flag)
    {
        boolean flag1 = mMenuVisible;
        if (flag1 == flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        mMenuVisible = flag;
        flag = mHasMenu;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        InstantiationException instantiationexception;
        try
        {
            flag = isAdded();
        }
        catch (InstantiationException instantiationexception1)
        {
            try
            {
                throw instantiationexception1;
            }
            catch (InstantiationException instantiationexception2)
            {
                throw instantiationexception2;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (!isHidden())
        {
            mActivity.supportInvalidateOptionsMenu();
        }
        return;
        instantiationexception;
        throw instantiationexception;
        instantiationexception;
        throw instantiationexception;
    }

    public void setUserVisibleHint(boolean flag)
    {
        boolean flag1 = mUserVisibleHint;
        InstantiationException instantiationexception;
        if (!flag1 && flag)
        {
            try
            {
                if (mState < 4)
                {
                    mFragmentManager.performPendingDeferredStart(this);
                }
            }
            catch (InstantiationException instantiationexception1)
            {
                throw instantiationexception1;
            }
        }
        try
        {
            mUserVisibleHint = flag;
        }
        catch (InstantiationException instantiationexception2)
        {
            throw instantiationexception2;
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mDeferStart = flag;
        return;
        instantiationexception;
        throw instantiationexception;
        instantiationexception;
        throw instantiationexception;
    }

    public void startActivity(Intent intent)
    {
        try
        {
            if (mActivity == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(z[44]).append(this).append(z[43]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        mActivity.startActivityFromFragment(this, intent, -1);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        try
        {
            if (mActivity == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(z[1]).append(this).append(z[2]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        mActivity.startActivityFromFragment(this, intent, i);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        try
        {
            DebugUtils.buildShortClassTag(this, stringbuilder);
            if (mIndex >= 0)
            {
                stringbuilder.append(z[77]);
                stringbuilder.append(mIndex);
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw instantiationexception;
        }
        try
        {
            if (mFragmentId != 0)
            {
                stringbuilder.append(z[78]);
                stringbuilder.append(Integer.toHexString(mFragmentId));
            }
        }
        catch (InstantiationException instantiationexception1)
        {
            throw instantiationexception1;
        }
        try
        {
            if (mTag != null)
            {
                stringbuilder.append(" ");
                stringbuilder.append(mTag);
            }
        }
        catch (InstantiationException instantiationexception2)
        {
            throw instantiationexception2;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[79];
        obj = "a\016;2\031B\022.u\025K\016?4\020^\\;6\000N\n?";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "a\016;2\031B\022.u";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\007\0225!TF\b.4\027O\031>u\000H\\\0336\000N\n3!\r";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "J=9!\035Q\025.,I";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\007\021\b0\000F\0254<\032@A";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "J/;#\021C*30\003t\b;!\021\032";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "J:(4\023J\0314!9F\022;2\021UA";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\007\021\031:\032S\0353;\021U5>hW";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "J,;'\021I\b\034'\025@\021?;\000\032";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "J(;'\023B\bg";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "J*30\003\032";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "J=4<\031F\b3;\023f\013;,I";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\007\021\b0\007R\021?1I";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "J?5;\000F\02540\006\032";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\007\021\b0\031H\n3;\023\032";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "J.?!\025N\022\023;\007S\03546\021\032";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "J=>1\021CA";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "J54;\021U*30\003\032";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "d\02439\020\007";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\007\021\0360\000F\03720\020\032";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "J/;#\021C:(4\023J\0314!'S\035.0I";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\007\021\0270\032R*3&\035E\020?h";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\007\021\0224\007j\0314 I";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "J/.4\000B=<!\021U=4<\031F\b3;\023\032";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\007\021\017&\021U*3&\035E\020?\035\035I\bg";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "k\023;1\021U\\\0274\032F\033?'N";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "J:(4\023J\0314!=CAy";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "\007\021\r=\033\032";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\007\021\0164\023\032";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "J/.4\000BA";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "\007\021\023;8F\0055 \000\032";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "\007\021\0304\027L/.4\027L2?&\000N\022=h";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "\007\\";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "\007\021\0164\006@\031.\007\021V\t?&\000d\023>0I";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "\007\\";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "\007\021\023;\020B\004g";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "\007\021\034'\033J0;,\033R\bg";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "J431\020B\022g";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "J=(2\001J\0314!\007\032";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                obj = "J2?-\000f\02238I";
                byte0 = 38;
                i = 39;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "F\022>'\033N\030`&\001W\f5'\000\035\032(4\023J\0314!\007";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "a\016;2\031B\022.u";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "\007\03031TI\023.u\027F\0206u\000O\0165 \023O\\.:TT\t*0\006\t\0234\006\000F\016.}]";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "\007\0225!TF\b.4\027O\031>u\000H\\\0336\000N\n3!\r";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "a\016;2\031B\022.u";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "F\022>'\033N\030`3\006F\03370\032SF";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "\007\0225!TF\b.4\027O\031>u\000H\\\0336\000N\n3!\r";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "a\016;2\031B\022.u";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "\007\03031TI\023.u\027F\0206u\000O\0165 \023O\\.:TT\t*0\006\t\0234\021\021T\b(:\rq\025?\"\\\016";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 49;
                obj = "a\016;2\031B\022.u";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "r\022;7\030B\\.:TN\022)!\025I\b34\000B\\<'\025@\021?;\000\007";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i] = ((String) (obj));
                i = 51;
                obj = "\007\0317%\000^\\9:\032T\b( \027S\023(u\000O\035.u\035T\\* \026K\0259";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i] = ((String) (obj));
                i = 52;
                obj = "r\022;7\030B\\.:TN\022)!\025I\b34\000B\\<'\025@\021?;\000\007";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i] = ((String) (obj));
                i = 53;
                obj = "\007\0317%\000^\\9:\032T\b( \027S\023(u\000O\035.u\035T\\* \026K\0259";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i] = ((String) (obj));
                i = 54;
                obj = "\035\\74\037B\\) \006B\\99\025T\017z;\025J\031z0\fN\017.&X\007\025)u\004R\0366<\027\013\\;;\020\007\024;&TF\022";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i] = ((String) (obj));
                i = 55;
                obj = "\035\\74\037B\\) \006B\\99\025T\017z;\025J\031z0\fN\017.&X\007\025)u\004R\0366<\027\013\\;;\020\007\024;&TF\022";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i] = ((String) (obj));
                i = 56;
                obj = "\007\0317%\000^\\9:\032T\b( \027S\023(u\000O\035.u\035T\\* \026K\0259";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[i] = ((String) (obj));
                i = 57;
                obj = "\035\\74\037B\\) \006B\\99\025T\017z;\025J\031z0\fN\017.&X\007\025)u\004R\0366<\027\013\\;;\020\007\024;&TF\022";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[i] = ((String) (obj));
                i = 58;
                obj = "r\022;7\030B\\.:TN\022)!\025I\b34\000B\\<'\025@\021?;\000\007";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[i] = ((String) (obj));
                i = 59;
                obj = "a\016;2\031B\022.u";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[i] = ((String) (obj));
                i = 60;
                obj = "\007\03031TI\023.u\027F\0206u\000O\0165 \023O\\.:TT\t*0\006\t\0234\026\006B\035.0\\\016";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[i] = ((String) (obj));
                i = 61;
                obj = "F\022>'\033N\030`&\001W\f5'\000\035\032(4\023J\0314!\007";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[i] = ((String) (obj));
                i = 62;
                obj = "a\016;2\031B\022.u";
                byte0 = 61;
                break;

            case 61: // '='
                as1[i] = ((String) (obj));
                i = 63;
                obj = "\007\03031TI\023.u\027F\0206u\000O\0165 \023O\\.:TT\t*0\006\t\0234\005\025R\017?}]";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[i] = ((String) (obj));
                i = 64;
                obj = "\007\0225!TF\b.4\027O\031>u\000H\\\0336\000N\n3!\r";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[i] = ((String) (obj));
                i = 65;
                obj = "a\016;2\031B\022.u";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[i] = ((String) (obj));
                i = 66;
                obj = "\007\03031TI\023.u\027F\0206u\000O\0165 \023O\\.:TT\t*0\006\t\0234\024\027S\025,<\000^?(0\025S\031>}]";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[i] = ((String) (obj));
                i = 67;
                obj = "a\016;2\031B\022.u";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[i] = ((String) (obj));
                i = 68;
                obj = "\007\03031TI\023.u\027F\0206u\000O\0165 \023O\\.:TT\t*0\006\t\0234\007\021T\t70\\\016";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[i] = ((String) (obj));
                i = 69;
                obj = "a\016;2\031B\022.u";
                byte0 = 68;
                break;

            case 68: // 'D'
                as1[i] = ((String) (obj));
                i = 70;
                obj = "a\016;2\031B\022.u\025K\016?4\020^\\;6\000N\n?";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[i] = ((String) (obj));
                i = 71;
                obj = "a\016;2\031B\022.u";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[i] = ((String) (obj));
                i = 72;
                obj = "\007\03031TI\023.u\027F\0206u\000O\0165 \023O\\.:TT\t*0\006\t\0234\006\000H\fr|";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[i] = ((String) (obj));
                i = 73;
                obj = "a\016;2\031B\022.u";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[i] = ((String) (obj));
                i = 74;
                obj = "\007\03031TI\023.u\027F\0206u\000O\0165 \023O\\.:TT\t*0\006\t\0234\021\021T\b(:\r\017U";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[i] = ((String) (obj));
                i = 75;
                obj = "a\016;2\031B\022.u";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[i] = ((String) (obj));
                i = 76;
                obj = "\007\03031TI\023.u\027F\0206u\000O\0165 \023O\\.:TT\t*0\006\t\0234\003\035B\013\t!\025S\031\b0\007S\023(0\020\017U";
                byte0 = 75;
                break;

            case 75: // 'K'
                as1[i] = ((String) (obj));
                i = 77;
                obj = "\007_";
                byte0 = 76;
                break;

            case 76: // 'L'
                as1[i] = ((String) (obj));
                i = 78;
                obj = "\007\025>hD_";
                byte0 = 77;
                break;

            case 77: // 'M'
                as1[i] = ((String) (obj));
                z = as;
                sClassMap = new SimpleArrayMap();
                USE_DEFAULT_TRANSITION = new Object();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1840
    //                   0 1863
    //                   1 1870
    //                   2 1877
    //                   3 1884;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1884;
_L3:
        byte byte1 = 116;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 39;
          goto _L9
_L5:
        byte1 = 124;
          goto _L9
_L6:
        byte1 = 90;
          goto _L9
        byte1 = 85;
          goto _L9
    }

    private class InstantiationException extends RuntimeException
    {

        public InstantiationException(String s, Exception exception)
        {
            super(s, exception);
        }
    }


    private class _cls1
        implements FragmentContainer
    {

        private static final String z;
        final Fragment this$0;

        public View findViewById(int i)
        {
            try
            {
                if (mView == null)
                {
                    throw new IllegalStateException(z);
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return mView.findViewById(i);
        }

        public boolean hasView()
        {
            View view;
            try
            {
                view = mView;
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return view != null;
        }

        static 
        {
            char ac[];
            int i;
            int j;
            ac = "c/z7\037@3op\026J8hp\034J);8\023S8;1RS4~'".toCharArray();
            j = ac.length;
            i = 0;
_L7:
            char c;
            if (j <= i)
            {
                z = (new String(ac)).intern();
                return;
            }
            c = ac[i];
            i % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 104;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_104;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 114;
_L8:
            ac[i] = (char)(byte0 ^ c);
            i++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 37;
              goto _L8
_L3:
            byte0 = 93;
              goto _L8
_L4:
            byte0 = 27;
              goto _L8
            byte0 = 80;
              goto _L8
        }

        _cls1()
        {
            this$0 = Fragment.this;
            super();
        }
    }


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        final Bundle mState;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeBundle(mState);
        }


        SavedState(Bundle bundle)
        {
            mState = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classloader)
        {
            mState = parcel.readBundle();
            if (classloader != null && mState != null)
            {
                mState.setClassLoader(classloader);
            }
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }

}
