// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.LogWriter;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            FragmentManager, FragmentActivity, Fragment, BackStackRecord, 
//            LoaderManagerImpl, SuperNotCalledException, FragmentContainer, FragmentManagerState, 
//            BackStackState, FragmentState, FragmentTransaction

final class FragmentManagerImpl extends FragmentManager
{

    static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5F);
    static final Interpolator ACCELERATE_QUINT = new AccelerateInterpolator(2.5F);
    static final int ANIM_DUR = 220;
    public static final int ANIM_STYLE_CLOSE_ENTER = 3;
    public static final int ANIM_STYLE_CLOSE_EXIT = 4;
    public static final int ANIM_STYLE_FADE_ENTER = 5;
    public static final int ANIM_STYLE_FADE_EXIT = 6;
    public static final int ANIM_STYLE_OPEN_ENTER = 1;
    public static final int ANIM_STYLE_OPEN_EXIT = 2;
    static boolean DEBUG = false;
    static final Interpolator DECELERATE_CUBIC = new DecelerateInterpolator(1.5F);
    static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5F);
    static final boolean HONEYCOMB;
    static final String TAG = "FragmentManager";
    static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    static final String TARGET_STATE_TAG = "android:target_state";
    static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    static final String VIEW_STATE_TAG = "android:view_state";
    ArrayList mActive;
    FragmentActivity mActivity;
    ArrayList mAdded;
    ArrayList mAvailBackStackIndices;
    ArrayList mAvailIndices;
    ArrayList mBackStack;
    ArrayList mBackStackChangeListeners;
    ArrayList mBackStackIndices;
    FragmentContainer mContainer;
    ArrayList mCreatedMenus;
    int mCurState;
    boolean mDestroyed;
    Runnable mExecCommit;
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    boolean mNeedMenuInvalidate;
    String mNoTransactionsBecause;
    Fragment mParent;
    ArrayList mPendingActions;
    SparseArray mStateArray;
    Bundle mStateBundle;
    boolean mStateSaved;
    Runnable mTmpActions[];

    FragmentManagerImpl()
    {
        mCurState = 0;
        mStateBundle = null;
        mStateArray = null;
        mExecCommit = new Runnable() {

            final FragmentManagerImpl this$0;

            public void run()
            {
                execPendingActions();
            }

            
            {
                this$0 = FragmentManagerImpl.this;
                super();
            }
        };
    }

    private void checkStateLoss()
    {
        if (mStateSaved)
        {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (mNoTransactionsBecause != null)
        {
            throw new IllegalStateException((new StringBuilder("Can not perform this action inside of ")).append(mNoTransactionsBecause).toString());
        } else
        {
            return;
        }
    }

    static Animation makeFadeAnimation(Context context, float f, float f1)
    {
        context = new AlphaAnimation(f, f1);
        context.setInterpolator(DECELERATE_CUBIC);
        context.setDuration(220L);
        return context;
    }

    static Animation makeOpenCloseAnimation(Context context, float f, float f1, float f2, float f3)
    {
        context = new AnimationSet(false);
        Object obj = new ScaleAnimation(f, f1, f, f1, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setInterpolator(DECELERATE_QUINT);
        ((ScaleAnimation) (obj)).setDuration(220L);
        context.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(f2, f3);
        ((AlphaAnimation) (obj)).setInterpolator(DECELERATE_CUBIC);
        ((AlphaAnimation) (obj)).setDuration(220L);
        context.addAnimation(((Animation) (obj)));
        return context;
    }

    public static int reverseTransit(int i)
    {
        switch (i)
        {
        default:
            return 0;

        case 4097: 
            return 8194;

        case 8194: 
            return 4097;

        case 4099: 
            return 4099;
        }
    }

    private void throwException(RuntimeException runtimeexception)
    {
        Log.e("FragmentManager", runtimeexception.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Object obj = new PrintWriter(new LogWriter("FragmentManager"));
        if (mActivity != null)
        {
            try
            {
                mActivity.dump("  ", null, ((PrintWriter) (obj)), new String[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
            }
        } else
        {
            try
            {
                dump("  ", null, ((PrintWriter) (obj)), new String[0]);
            }
            catch (Exception exception)
            {
                Log.e("FragmentManager", "Failed dumping state", exception);
            }
        }
        throw runtimeexception;
    }

    public static int transitToStyleIndex(int i, boolean flag)
    {
        switch (i)
        {
        default:
            return -1;

        case 4097: 
            return !flag ? 2 : 1;

        case 8194: 
            return !flag ? 4 : 3;

        case 4099: 
            break;
        }
        return !flag ? 6 : 5;
    }

    void addBackStackState(BackStackRecord backstackrecord)
    {
        if (mBackStack == null)
        {
            mBackStack = new ArrayList();
        }
        mBackStack.add(backstackrecord);
        reportBackStackChanged();
    }

    public void addFragment(Fragment fragment, boolean flag)
    {
        if (mAdded == null)
        {
            mAdded = new ArrayList();
        }
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("add: ")).append(fragment).toString());
        }
        makeActive(fragment);
        if (!fragment.mDetached)
        {
            if (mAdded.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
            }
            mAdded.add(fragment);
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mHasMenu && fragment.mMenuVisible)
            {
                mNeedMenuInvalidate = true;
            }
            if (flag)
            {
                moveToState(fragment);
            }
        }
    }

    public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
    {
        if (mBackStackChangeListeners == null)
        {
            mBackStackChangeListeners = new ArrayList();
        }
        mBackStackChangeListeners.add(onbackstackchangedlistener);
    }

    public int allocBackStackIndex(BackStackRecord backstackrecord)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        if (mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (mBackStackIndices == null)
        {
            mBackStackIndices = new ArrayList();
        }
        i = mBackStackIndices.size();
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Setting back stack index ")).append(i).append(" to ").append(backstackrecord).toString());
        }
        mBackStackIndices.add(backstackrecord);
        this;
        JVM INSTR monitorexit ;
        return i;
        i = ((Integer)mAvailBackStackIndices.remove(mAvailBackStackIndices.size() - 1)).intValue();
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Adding back stack index ")).append(i).append(" with ").append(backstackrecord).toString());
        }
        mBackStackIndices.set(i, backstackrecord);
        this;
        JVM INSTR monitorexit ;
        return i;
        backstackrecord;
        this;
        JVM INSTR monitorexit ;
        throw backstackrecord;
    }

    public void attachActivity(FragmentActivity fragmentactivity, FragmentContainer fragmentcontainer, Fragment fragment)
    {
        if (mActivity != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            mActivity = fragmentactivity;
            mContainer = fragmentcontainer;
            mParent = fragment;
            return;
        }
    }

    public void attachFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("attach: ")).append(fragment).toString());
        }
        if (fragment.mDetached)
        {
            fragment.mDetached = false;
            if (!fragment.mAdded)
            {
                if (mAdded == null)
                {
                    mAdded = new ArrayList();
                }
                if (mAdded.contains(fragment))
                {
                    throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
                }
                if (DEBUG)
                {
                    Log.v("FragmentManager", (new StringBuilder("add from attach: ")).append(fragment).toString());
                }
                mAdded.add(fragment);
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
                moveToState(fragment, mCurState, i, j, false);
            }
        }
    }

    public FragmentTransaction beginTransaction()
    {
        return new BackStackRecord(this);
    }

    public void detachFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("detach: ")).append(fragment).toString());
        }
        if (!fragment.mDetached)
        {
            fragment.mDetached = true;
            if (fragment.mAdded)
            {
                if (mAdded != null)
                {
                    if (DEBUG)
                    {
                        Log.v("FragmentManager", (new StringBuilder("remove from detach: ")).append(fragment).toString());
                    }
                    mAdded.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
                fragment.mAdded = false;
                moveToState(fragment, 1, i, j, false);
            }
        }
    }

    public void dispatchActivityCreated()
    {
        mStateSaved = false;
        moveToState(2, false);
    }

    public void dispatchConfigurationChanged(Configuration configuration)
    {
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < mAdded.size()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment != null)
        {
            fragment.performConfigurationChanged(configuration);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean dispatchContextItemSelected(MenuItem menuitem)
    {
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < mAdded.size()) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment != null && fragment.performContextItemSelected(menuitem))
        {
            return true;
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void dispatchCreate()
    {
        mStateSaved = false;
        moveToState(1, false);
    }

    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        ArrayList arraylist;
        Object obj;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        arraylist = null;
        obj = null;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i;
        i = 0;
        flag = flag1;
        arraylist = obj;
_L6:
        if (i < mAdded.size()) goto _L3; else goto _L2
_L2:
        if (mCreatedMenus == null) goto _L5; else goto _L4
_L4:
        i = 0;
_L7:
        if (i < mCreatedMenus.size())
        {
            break MISSING_BLOCK_LABEL_156;
        }
_L5:
        mCreatedMenus = arraylist;
        return flag;
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        ArrayList arraylist1 = arraylist;
        boolean flag2 = flag;
        if (fragment != null)
        {
            arraylist1 = arraylist;
            flag2 = flag;
            if (fragment.performCreateOptionsMenu(menu, menuinflater))
            {
                flag2 = true;
                arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList();
                }
                arraylist1.add(fragment);
            }
        }
        i++;
        arraylist = arraylist1;
        flag = flag2;
          goto _L6
        menu = (Fragment)mCreatedMenus.get(i);
        if (arraylist == null || !arraylist.contains(menu))
        {
            menu.onDestroyOptionsMenu();
        }
        i++;
          goto _L7
    }

    public void dispatchDestroy()
    {
        mDestroyed = true;
        execPendingActions();
        moveToState(0, false);
        mActivity = null;
        mContainer = null;
        mParent = null;
    }

    public void dispatchDestroyView()
    {
        moveToState(1, false);
    }

    public void dispatchLowMemory()
    {
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < mAdded.size()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment != null)
        {
            fragment.performLowMemory();
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuitem)
    {
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < mAdded.size()) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment != null && fragment.performOptionsItemSelected(menuitem))
        {
            return true;
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void dispatchOptionsMenuClosed(Menu menu)
    {
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < mAdded.size()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment != null)
        {
            fragment.performOptionsMenuClosed(menu);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void dispatchPause()
    {
        moveToState(4, false);
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i;
        i = 0;
        flag = flag1;
_L5:
        if (i < mAdded.size()) goto _L3; else goto _L2
_L2:
        return flag;
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        boolean flag2 = flag;
        if (fragment != null)
        {
            flag2 = flag;
            if (fragment.performPrepareOptionsMenu(menu))
            {
                flag2 = true;
            }
        }
        i++;
        flag = flag2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void dispatchReallyStop()
    {
        moveToState(2, false);
    }

    public void dispatchResume()
    {
        mStateSaved = false;
        moveToState(5, false);
    }

    public void dispatchStart()
    {
        mStateSaved = false;
        moveToState(4, false);
    }

    public void dispatchStop()
    {
        mStateSaved = true;
        moveToState(3, false);
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        String s1 = (new StringBuilder(String.valueOf(s))).append("    ").toString();
        if (mActive == null) goto _L2; else goto _L1
_L1:
        int j = mActive.size();
        if (j <= 0) goto _L2; else goto _L3
_L3:
        int i;
        printwriter.print(s);
        printwriter.print("Active Fragments in ");
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(":");
        i = 0;
_L25:
        if (i < j) goto _L4; else goto _L2
_L2:
        if (mAdded == null) goto _L6; else goto _L5
_L5:
        j = mAdded.size();
        if (j <= 0) goto _L6; else goto _L7
_L7:
        printwriter.print(s);
        printwriter.println("Added Fragments:");
        i = 0;
_L26:
        if (i < j) goto _L8; else goto _L6
_L6:
        if (mCreatedMenus == null) goto _L10; else goto _L9
_L9:
        j = mCreatedMenus.size();
        if (j <= 0) goto _L10; else goto _L11
_L11:
        printwriter.print(s);
        printwriter.println("Fragments Created Menus:");
        i = 0;
_L27:
        if (i < j) goto _L12; else goto _L10
_L10:
        if (mBackStack == null) goto _L14; else goto _L13
_L13:
        j = mBackStack.size();
        if (j <= 0) goto _L14; else goto _L15
_L15:
        printwriter.print(s);
        printwriter.println("Back Stack:");
        i = 0;
_L28:
        if (i < j) goto _L16; else goto _L14
_L14:
        this;
        JVM INSTR monitorenter ;
        if (mBackStackIndices == null) goto _L18; else goto _L17
_L17:
        j = mBackStackIndices.size();
        if (j <= 0) goto _L18; else goto _L19
_L19:
        printwriter.print(s);
        printwriter.println("Back Stack Indices:");
        i = 0;
          goto _L20
_L18:
        if (mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
        {
            printwriter.print(s);
            printwriter.print("mAvailBackStackIndices: ");
            printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
        }
        this;
        JVM INSTR monitorexit ;
        if (mPendingActions == null) goto _L22; else goto _L21
_L21:
        j = mPendingActions.size();
        if (j <= 0) goto _L22; else goto _L23
_L23:
        printwriter.print(s);
        printwriter.println("Pending Actions:");
        i = 0;
_L29:
        if (i < j) goto _L24; else goto _L22
_L22:
        printwriter.print(s);
        printwriter.println("FragmentManager misc state:");
        printwriter.print(s);
        printwriter.print("  mActivity=");
        printwriter.println(mActivity);
        printwriter.print(s);
        printwriter.print("  mContainer=");
        printwriter.println(mContainer);
        if (mParent != null)
        {
            printwriter.print(s);
            printwriter.print("  mParent=");
            printwriter.println(mParent);
        }
        printwriter.print(s);
        printwriter.print("  mCurState=");
        printwriter.print(mCurState);
        printwriter.print(" mStateSaved=");
        printwriter.print(mStateSaved);
        printwriter.print(" mDestroyed=");
        printwriter.println(mDestroyed);
        if (mNeedMenuInvalidate)
        {
            printwriter.print(s);
            printwriter.print("  mNeedMenuInvalidate=");
            printwriter.println(mNeedMenuInvalidate);
        }
        if (mNoTransactionsBecause != null)
        {
            printwriter.print(s);
            printwriter.print("  mNoTransactionsBecause=");
            printwriter.println(mNoTransactionsBecause);
        }
        if (mAvailIndices != null && mAvailIndices.size() > 0)
        {
            printwriter.print(s);
            printwriter.print("  mAvailIndices: ");
            printwriter.println(Arrays.toString(mAvailIndices.toArray()));
        }
        return;
_L4:
        Fragment fragment = (Fragment)mActive.get(i);
        printwriter.print(s);
        printwriter.print("  #");
        printwriter.print(i);
        printwriter.print(": ");
        printwriter.println(fragment);
        if (fragment != null)
        {
            fragment.dump(s1, filedescriptor, printwriter, as);
        }
        i++;
          goto _L25
_L8:
        Fragment fragment1 = (Fragment)mAdded.get(i);
        printwriter.print(s);
        printwriter.print("  #");
        printwriter.print(i);
        printwriter.print(": ");
        printwriter.println(fragment1.toString());
        i++;
          goto _L26
_L12:
        Fragment fragment2 = (Fragment)mCreatedMenus.get(i);
        printwriter.print(s);
        printwriter.print("  #");
        printwriter.print(i);
        printwriter.print(": ");
        printwriter.println(fragment2.toString());
        i++;
          goto _L27
_L16:
        BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(i);
        printwriter.print(s);
        printwriter.print("  #");
        printwriter.print(i);
        printwriter.print(": ");
        printwriter.println(backstackrecord.toString());
        backstackrecord.dump(s1, filedescriptor, printwriter, as);
        i++;
          goto _L28
_L30:
        filedescriptor = (BackStackRecord)mBackStackIndices.get(i);
        printwriter.print(s);
        printwriter.print("  #");
        printwriter.print(i);
        printwriter.print(": ");
        printwriter.println(filedescriptor);
        i++;
        continue; /* Loop/switch isn't completed */
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L24:
        filedescriptor = (Runnable)mPendingActions.get(i);
        printwriter.print(s);
        printwriter.print("  #");
        printwriter.print(i);
        printwriter.print(": ");
        printwriter.println(filedescriptor);
        i++;
          goto _L29
_L20:
        if (i < j) goto _L30; else goto _L18
    }

    public void enqueueAction(Runnable runnable, boolean flag)
    {
        if (!flag)
        {
            checkStateLoss();
        }
        this;
        JVM INSTR monitorenter ;
        if (mDestroyed || mActivity == null)
        {
            throw new IllegalStateException("Activity has been destroyed");
        }
        break MISSING_BLOCK_LABEL_40;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
        if (mPendingActions == null)
        {
            mPendingActions = new ArrayList();
        }
        mPendingActions.add(runnable);
        if (mPendingActions.size() == 1)
        {
            mActivity.mHandler.removeCallbacks(mExecCommit);
            mActivity.mHandler.post(mExecCommit);
        }
        this;
        JVM INSTR monitorexit ;
    }

    public boolean execPendingActions()
    {
        if (mExecutingActions)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != mActivity.mHandler.getLooper())
        {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean flag = false;
_L5:
        this;
        JVM INSTR monitorenter ;
        if (mPendingActions != null && mPendingActions.size() != 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        if (!mHavePendingDeferredStart) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = 0;
        i = 0;
_L7:
        if (i < mActive.size())
        {
            break MISSING_BLOCK_LABEL_227;
        }
        if (j == 0)
        {
            mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
_L4:
        return flag;
_L2:
        j = mPendingActions.size();
        if (mTmpActions == null || mTmpActions.length < j)
        {
            mTmpActions = new Runnable[j];
        }
        mPendingActions.toArray(mTmpActions);
        mPendingActions.clear();
        mActivity.mHandler.removeCallbacks(mExecCommit);
        this;
        JVM INSTR monitorexit ;
        mExecutingActions = true;
        i = 0;
_L6:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        mExecutingActions = false;
        flag = true;
          goto _L5
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        mTmpActions[i].run();
        mTmpActions[i] = null;
        i++;
          goto _L6
        Fragment fragment = (Fragment)mActive.get(i);
        int k = j;
        if (fragment != null)
        {
            k = j;
            if (fragment.mLoaderManager != null)
            {
                k = j | fragment.mLoaderManager.hasRunningLoaders();
            }
        }
        i++;
        j = k;
          goto _L7
    }

    public boolean executePendingTransactions()
    {
        return execPendingActions();
    }

    public Fragment findFragmentById(int i)
    {
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int j = mAdded.size() - 1;
_L9:
        if (j >= 0) goto _L3; else goto _L2
_L2:
        if (mActive == null) goto _L5; else goto _L4
_L4:
        j = mActive.size() - 1;
_L11:
        if (j >= 0) goto _L6; else goto _L5
_L5:
        Fragment fragment = null;
_L8:
        return fragment;
_L3:
        Fragment fragment1;
        fragment1 = (Fragment)mAdded.get(j);
        if (fragment1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (fragment1.mFragmentId == i) goto _L8; else goto _L7
_L7:
        j--;
          goto _L9
_L6:
        fragment1 = (Fragment)mActive.get(j);
        if (fragment1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (fragment1.mFragmentId == i) goto _L8; else goto _L10
_L10:
        j--;
          goto _L11
    }

    public Fragment findFragmentByTag(String s)
    {
        if (mAdded == null || s == null) goto _L2; else goto _L1
_L1:
        int i = mAdded.size() - 1;
_L9:
        if (i >= 0) goto _L3; else goto _L2
_L2:
        if (mActive == null || s == null) goto _L5; else goto _L4
_L4:
        i = mActive.size() - 1;
_L11:
        if (i >= 0) goto _L6; else goto _L5
_L5:
        Fragment fragment = null;
_L8:
        return fragment;
_L3:
        Fragment fragment1;
        fragment1 = (Fragment)mAdded.get(i);
        if (fragment1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (s.equals(fragment1.mTag)) goto _L8; else goto _L7
_L7:
        i--;
          goto _L9
_L6:
        fragment1 = (Fragment)mActive.get(i);
        if (fragment1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (s.equals(fragment1.mTag)) goto _L8; else goto _L10
_L10:
        i--;
          goto _L11
    }

    public Fragment findFragmentByWho(String s)
    {
        if (mActive == null || s == null) goto _L2; else goto _L1
_L1:
        int i = mActive.size() - 1;
_L7:
        if (i >= 0) goto _L3; else goto _L2
_L2:
        Fragment fragment = null;
_L5:
        return fragment;
_L3:
        Fragment fragment1;
        fragment = (Fragment)mActive.get(i);
        if (fragment == null)
        {
            break; /* Loop/switch isn't completed */
        }
        fragment1 = fragment.findFragmentByWho(s);
        fragment = fragment1;
        if (fragment1 != null) goto _L5; else goto _L4
_L4:
        i--;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void freeBackStackIndex(int i)
    {
        this;
        JVM INSTR monitorenter ;
        mBackStackIndices.set(i, null);
        if (mAvailBackStackIndices == null)
        {
            mAvailBackStackIndices = new ArrayList();
        }
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Freeing back stack index ")).append(i).toString());
        }
        mAvailBackStackIndices.add(Integer.valueOf(i));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public FragmentManager.BackStackEntry getBackStackEntryAt(int i)
    {
        return (FragmentManager.BackStackEntry)mBackStack.get(i);
    }

    public int getBackStackEntryCount()
    {
        if (mBackStack != null)
        {
            return mBackStack.size();
        } else
        {
            return 0;
        }
    }

    public Fragment getFragment(Bundle bundle, String s)
    {
        int i = bundle.getInt(s, -1);
        if (i == -1)
        {
            bundle = null;
        } else
        {
            if (i >= mActive.size())
            {
                throwException(new IllegalStateException((new StringBuilder("Fragement no longer exists for key ")).append(s).append(": index ").append(i).toString()));
            }
            Fragment fragment = (Fragment)mActive.get(i);
            bundle = fragment;
            if (fragment == null)
            {
                throwException(new IllegalStateException((new StringBuilder("Fragement no longer exists for key ")).append(s).append(": index ").append(i).toString()));
                return fragment;
            }
        }
        return bundle;
    }

    public List getFragments()
    {
        return mActive;
    }

    public void hideFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("hide: ")).append(fragment).toString());
        }
        if (!fragment.mHidden)
        {
            fragment.mHidden = true;
            if (fragment.mView != null)
            {
                Animation animation = loadAnimation(fragment, i, false, j);
                if (animation != null)
                {
                    fragment.mView.startAnimation(animation);
                }
                fragment.mView.setVisibility(8);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
            {
                mNeedMenuInvalidate = true;
            }
            fragment.onHiddenChanged(true);
        }
    }

    public boolean isDestroyed()
    {
        return mDestroyed;
    }

    Animation loadAnimation(Fragment fragment, int i, boolean flag, int j)
    {
        Animation animation = fragment.onCreateAnimation(i, flag, fragment.mNextAnim);
        if (animation != null)
        {
            return animation;
        }
        if (fragment.mNextAnim != 0)
        {
            fragment = AnimationUtils.loadAnimation(mActivity, fragment.mNextAnim);
            if (fragment != null)
            {
                return fragment;
            }
        }
        if (i == 0)
        {
            return null;
        }
        i = transitToStyleIndex(i, flag);
        if (i < 0)
        {
            return null;
        }
        switch (i)
        {
        default:
            i = j;
            if (j == 0)
            {
                i = j;
                if (mActivity.getWindow() != null)
                {
                    i = mActivity.getWindow().getAttributes().windowAnimations;
                }
            }
            if (i == 0)
            {
                return null;
            } else
            {
                return null;
            }

        case 1: // '\001'
            return makeOpenCloseAnimation(mActivity, 1.125F, 1.0F, 0.0F, 1.0F);

        case 2: // '\002'
            return makeOpenCloseAnimation(mActivity, 1.0F, 0.975F, 1.0F, 0.0F);

        case 3: // '\003'
            return makeOpenCloseAnimation(mActivity, 0.975F, 1.0F, 0.0F, 1.0F);

        case 4: // '\004'
            return makeOpenCloseAnimation(mActivity, 1.0F, 1.075F, 1.0F, 0.0F);

        case 5: // '\005'
            return makeFadeAnimation(mActivity, 0.0F, 1.0F);

        case 6: // '\006'
            return makeFadeAnimation(mActivity, 1.0F, 0.0F);
        }
    }

    void makeActive(Fragment fragment)
    {
        if (fragment.mIndex < 0)
        {
            if (mAvailIndices == null || mAvailIndices.size() <= 0)
            {
                if (mActive == null)
                {
                    mActive = new ArrayList();
                }
                fragment.setIndex(mActive.size(), mParent);
                mActive.add(fragment);
            } else
            {
                fragment.setIndex(((Integer)mAvailIndices.remove(mAvailIndices.size() - 1)).intValue(), mParent);
                mActive.set(fragment.mIndex, fragment);
            }
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("Allocated fragment index ")).append(fragment).toString());
                return;
            }
        }
    }

    void makeInactive(Fragment fragment)
    {
        if (fragment.mIndex < 0)
        {
            return;
        }
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Freeing fragment index ")).append(fragment).toString());
        }
        mActive.set(fragment.mIndex, null);
        if (mAvailIndices == null)
        {
            mAvailIndices = new ArrayList();
        }
        mAvailIndices.add(Integer.valueOf(fragment.mIndex));
        mActivity.invalidateSupportFragment(fragment.mWho);
        fragment.initState();
    }

    void moveToState(int i, int j, int k, boolean flag)
    {
        if (mActivity == null && i != 0)
        {
            throw new IllegalStateException("No activity");
        }
        if (flag || mCurState != i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l;
        boolean flag1;
        mCurState = i;
        if (mActive == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = false;
        l = 0;
_L4:
label0:
        {
            if (l < mActive.size())
            {
                break label0;
            }
            if (!flag1)
            {
                startPendingDeferredFragments();
            }
            if (mNeedMenuInvalidate && mActivity != null && mCurState == 5)
            {
                mActivity.supportInvalidateOptionsMenu();
                mNeedMenuInvalidate = false;
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        Fragment fragment = (Fragment)mActive.get(l);
        boolean flag2 = flag1;
        if (fragment != null)
        {
            moveToState(fragment, i, j, k, false);
            flag2 = flag1;
            if (fragment.mLoaderManager != null)
            {
                flag2 = flag1 | fragment.mLoaderManager.hasRunningLoaders();
            }
        }
        l++;
        flag1 = flag2;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    void moveToState(int i, boolean flag)
    {
        moveToState(i, 0, 0, flag);
    }

    void moveToState(Fragment fragment)
    {
        moveToState(fragment, mCurState, 0, 0, false);
    }

    void moveToState(final Fragment fragment, int i, int j, int k, boolean flag)
    {
        int l;
label0:
        {
            if (fragment.mAdded)
            {
                l = i;
                if (!fragment.mDetached)
                {
                    break label0;
                }
            }
            l = i;
            if (i > 1)
            {
                l = 1;
            }
        }
        int j1 = l;
        if (fragment.mRemoving)
        {
            j1 = l;
            if (l > fragment.mState)
            {
                j1 = fragment.mState;
            }
        }
        i = j1;
        if (fragment.mDeferStart)
        {
            i = j1;
            if (fragment.mState < 4)
            {
                i = j1;
                if (j1 > 3)
                {
                    i = 3;
                }
            }
        }
        if (fragment.mState >= i) goto _L2; else goto _L1
_L1:
        int i1;
        int k1;
        int l1;
        if (fragment.mFromLayout && !fragment.mInLayout)
        {
            return;
        }
        if (fragment.mAnimatingAway != null)
        {
            fragment.mAnimatingAway = null;
            moveToState(fragment, fragment.mStateAfterAnimating, 0, 0, true);
        }
        i1 = i;
        l1 = i;
        k1 = i;
        fragment.mState;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 536
    //                   2 840
    //                   3 840
    //                   4 887;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i1 = i;
_L16:
        fragment.mState = i1;
        return;
_L4:
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("moveto CREATED: ")).append(fragment).toString());
        }
        k1 = i;
        if (fragment.mSavedFragmentState != null)
        {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            fragment.mTarget = getFragment(fragment.mSavedFragmentState, "android:target_state");
            if (fragment.mTarget != null)
            {
                fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            k1 = i;
            if (!fragment.mUserVisibleHint)
            {
                fragment.mDeferStart = true;
                k1 = i;
                if (i > 3)
                {
                    k1 = 3;
                }
            }
        }
        fragment.mActivity = mActivity;
        fragment.mParentFragment = mParent;
        FragmentManagerImpl fragmentmanagerimpl;
        if (mParent != null)
        {
            fragmentmanagerimpl = mParent.mChildFragmentManager;
        } else
        {
            fragmentmanagerimpl = mActivity.mFragments;
        }
        fragment.mFragmentManager = fragmentmanagerimpl;
        fragment.mCalled = false;
        fragment.onAttach(mActivity);
        if (!fragment.mCalled)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onAttach()").toString());
        }
        if (fragment.mParentFragment == null)
        {
            mActivity.onAttachFragment(fragment);
        }
        if (!fragment.mRetaining)
        {
            fragment.performCreate(fragment.mSavedFragmentState);
        }
        fragment.mRetaining = false;
        i1 = k1;
        if (fragment.mFromLayout)
        {
            fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            ViewGroup viewgroup;
            Object obj;
            if (fragment.mView != null)
            {
                fragment.mInnerView = fragment.mView;
                if (fragment.mHidden)
                {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                i1 = k1;
            } else
            {
                fragment.mInnerView = null;
                i1 = k1;
            }
        }
_L5:
        l1 = i1;
        if (i1 > 1)
        {
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("moveto ACTIVITY_CREATED: ")).append(fragment).toString());
            }
            if (!fragment.mFromLayout)
            {
                viewgroup = null;
                if (fragment.mContainerId != 0)
                {
                    obj = (ViewGroup)mContainer.findViewById(fragment.mContainerId);
                    viewgroup = ((ViewGroup) (obj));
                    if (obj == null)
                    {
                        viewgroup = ((ViewGroup) (obj));
                        if (!fragment.mRestored)
                        {
                            throwException(new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(fragment.mContainerId)).append(" (").append(fragment.getResources().getResourceName(fragment.mContainerId)).append(") for fragment ").append(fragment).toString()));
                            viewgroup = ((ViewGroup) (obj));
                        }
                    }
                }
                fragment.mContainer = viewgroup;
                fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), viewgroup, fragment.mSavedFragmentState);
                if (fragment.mView != null)
                {
                    fragment.mInnerView = fragment.mView;
                    if (viewgroup != null)
                    {
                        obj = loadAnimation(fragment, j, true, k);
                        if (obj != null)
                        {
                            fragment.mView.startAnimation(((Animation) (obj)));
                        }
                        viewgroup.addView(fragment.mView);
                    }
                    if (fragment.mHidden)
                    {
                        fragment.mView.setVisibility(8);
                    }
                    fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                } else
                {
                    fragment.mInnerView = null;
                }
            }
            fragment.performActivityCreated(fragment.mSavedFragmentState);
            if (fragment.mView != null)
            {
                fragment.restoreViewState(fragment.mSavedFragmentState);
            }
            fragment.mSavedFragmentState = null;
            l1 = i1;
        }
_L6:
        k1 = l1;
        if (l1 > 3)
        {
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("moveto STARTED: ")).append(fragment).toString());
            }
            fragment.performStart();
            k1 = l1;
        }
_L7:
        i1 = k1;
        if (k1 > 4)
        {
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("moveto RESUMED: ")).append(fragment).toString());
            }
            fragment.mResumed = true;
            fragment.performResume();
            fragment.mSavedFragmentState = null;
            fragment.mSavedViewState = null;
            i1 = k1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = i;
        if (fragment.mState <= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment.mState;
        JVM INSTR tableswitch 1 5: default 1020
    //                   1 1026
    //                   2 1201
    //                   3 1163
    //                   4 1125
    //                   5 1082;
           goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        i1 = i;
        break; /* Loop/switch isn't completed */
_L9:
        i1 = i;
        if (i >= 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mDestroyed && fragment.mAnimatingAway != null)
        {
            View view = fragment.mAnimatingAway;
            fragment.mAnimatingAway = null;
            view.clearAnimation();
        }
        if (fragment.mAnimatingAway != null)
        {
            fragment.mStateAfterAnimating = i;
            i1 = 1;
            break; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
_L13:
        if (i < 5)
        {
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom RESUMED: ")).append(fragment).toString());
            }
            fragment.performPause();
            fragment.mResumed = false;
        }
_L12:
        if (i < 4)
        {
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom STARTED: ")).append(fragment).toString());
            }
            fragment.performStop();
        }
_L11:
        if (i < 3)
        {
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom STOPPED: ")).append(fragment).toString());
            }
            fragment.performReallyStop();
        }
_L10:
        if (i < 2)
        {
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom ACTIVITY_CREATED: ")).append(fragment).toString());
            }
            if (fragment.mView != null && !mActivity.isFinishing() && fragment.mSavedViewState == null)
            {
                saveFragmentViewState(fragment);
            }
            fragment.performDestroyView();
            if (fragment.mView != null && fragment.mContainer != null)
            {
                Object obj1 = null;
                Animation animation = obj1;
                if (mCurState > 0)
                {
                    animation = obj1;
                    if (!mDestroyed)
                    {
                        animation = loadAnimation(fragment, j, false, k);
                    }
                }
                if (animation != null)
                {
                    fragment.mAnimatingAway = fragment.mView;
                    fragment.mStateAfterAnimating = i;
                    animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                        final FragmentManagerImpl this$0;
                        private final Fragment val$fragment;

                        public void onAnimationEnd(Animation animation1)
                        {
                            if (fragment.mAnimatingAway != null)
                            {
                                fragment.mAnimatingAway = null;
                                moveToState(fragment, fragment.mStateAfterAnimating, 0, 0, false);
                            }
                        }

                        public void onAnimationRepeat(Animation animation1)
                        {
                        }

                        public void onAnimationStart(Animation animation1)
                        {
                        }

            
            {
                this$0 = FragmentManagerImpl.this;
                fragment = fragment1;
                super();
            }
                    });
                    fragment.mView.startAnimation(animation);
                }
                fragment.mContainer.removeView(fragment.mView);
            }
            fragment.mContainer = null;
            fragment.mView = null;
            fragment.mInnerView = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("movefrom CREATED: ")).append(fragment).toString());
        }
        if (!fragment.mRetaining)
        {
            fragment.performDestroy();
        }
        fragment.mCalled = false;
        fragment.onDetach();
        if (!fragment.mCalled)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDetach()").toString());
        }
        i1 = i;
        if (!flag)
        {
            if (!fragment.mRetaining)
            {
                makeInactive(fragment);
                i1 = i;
            } else
            {
                fragment.mActivity = null;
                fragment.mFragmentManager = null;
                i1 = i;
            }
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void noteStateNotSaved()
    {
        mStateSaved = false;
    }

    public void performPendingDeferredStart(Fragment fragment)
    {
label0:
        {
            if (fragment.mDeferStart)
            {
                if (!mExecutingActions)
                {
                    break label0;
                }
                mHavePendingDeferredStart = true;
            }
            return;
        }
        fragment.mDeferStart = false;
        moveToState(fragment, mCurState, 0, 0, false);
    }

    public void popBackStack()
    {
        enqueueAction(new Runnable() {

            final FragmentManagerImpl this$0;

            public void run()
            {
                popBackStackState(mActivity.mHandler, null, -1, 0);
            }

            
            {
                this$0 = FragmentManagerImpl.this;
                super();
            }
        }, false);
    }

    public void popBackStack(final int id, final int flags)
    {
        if (id < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(id).toString());
        } else
        {
            enqueueAction(new Runnable() {

                final FragmentManagerImpl this$0;
                private final int val$flags;
                private final int val$id;

                public void run()
                {
                    popBackStackState(mActivity.mHandler, null, id, flags);
                }

            
            {
                this$0 = FragmentManagerImpl.this;
                id = i;
                flags = j;
                super();
            }
            }, false);
            return;
        }
    }

    public void popBackStack(final String name, final int flags)
    {
        enqueueAction(new Runnable() {

            final FragmentManagerImpl this$0;
            private final int val$flags;
            private final String val$name;

            public void run()
            {
                popBackStackState(mActivity.mHandler, name, -1, flags);
            }

            
            {
                this$0 = FragmentManagerImpl.this;
                name = s;
                flags = i;
                super();
            }
        }, false);
    }

    public boolean popBackStackImmediate()
    {
        checkStateLoss();
        executePendingTransactions();
        return popBackStackState(mActivity.mHandler, null, -1, 0);
    }

    public boolean popBackStackImmediate(int i, int j)
    {
        checkStateLoss();
        executePendingTransactions();
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(i).toString());
        } else
        {
            return popBackStackState(mActivity.mHandler, null, i, j);
        }
    }

    public boolean popBackStackImmediate(String s, int i)
    {
        checkStateLoss();
        executePendingTransactions();
        return popBackStackState(mActivity.mHandler, s, -1, i);
    }

    boolean popBackStackState(Handler handler, String s, int i, int j)
    {
        if (mBackStack != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (s != null || i >= 0 || (j & 1) != 0) goto _L4; else goto _L3
_L3:
        if ((i = mBackStack.size() - 1) < 0) goto _L1; else goto _L5
_L5:
        ((BackStackRecord)mBackStack.remove(i)).popFromBackStack(true);
        reportBackStackChanged();
_L17:
        return true;
_L4:
        int k = -1;
        if (s == null && i < 0) goto _L7; else goto _L6
_L6:
        int l = mBackStack.size() - 1;
_L19:
        if (l >= 0) goto _L9; else goto _L8
_L8:
        if (l < 0) goto _L1; else goto _L10
_L10:
        k = l;
        if ((j & 1) == 0) goto _L7; else goto _L11
_L11:
        j = l - 1;
_L22:
        if (j >= 0) goto _L13; else goto _L12
_L12:
        k = j;
_L7:
        if (k == mBackStack.size() - 1) goto _L1; else goto _L14
_L14:
        handler = new ArrayList();
        i = mBackStack.size() - 1;
_L23:
        if (i > k) goto _L16; else goto _L15
_L15:
        j = handler.size() - 1;
        i = 0;
_L24:
        if (i <= j)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        reportBackStackChanged();
          goto _L17
_L9:
        handler = (BackStackRecord)mBackStack.get(l);
        if (s != null && s.equals(handler.getName()) || i >= 0 && i == ((BackStackRecord) (handler)).mIndex) goto _L8; else goto _L18
_L18:
        l--;
          goto _L19
_L13:
        handler = (BackStackRecord)mBackStack.get(j);
        if (s != null && s.equals(handler.getName()))
        {
            break; /* Loop/switch isn't completed */
        }
        k = j;
        if (i < 0) goto _L7; else goto _L20
_L20:
        k = j;
        if (i != ((BackStackRecord) (handler)).mIndex) goto _L7; else goto _L21
_L21:
        j--;
          goto _L22
_L16:
        handler.add((BackStackRecord)mBackStack.remove(i));
        i--;
          goto _L23
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Popping back stack state: ")).append(handler.get(i)).toString());
        }
        s = (BackStackRecord)handler.get(i);
        boolean flag;
        if (i == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s.popFromBackStack(flag);
        i++;
          goto _L24
    }

    public void putFragment(Bundle bundle, String s, Fragment fragment)
    {
        if (fragment.mIndex < 0)
        {
            throwException(new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()));
        }
        bundle.putInt(s, fragment.mIndex);
    }

    public void removeFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("remove: ")).append(fragment).append(" nesting=").append(fragment.mBackStackNesting).toString());
        }
        int k;
        if (fragment.isInBackStack())
        {
            k = 0;
        } else
        {
            k = 1;
        }
        if (!fragment.mDetached || k != 0)
        {
            if (mAdded != null)
            {
                mAdded.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible)
            {
                mNeedMenuInvalidate = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
            if (k != 0)
            {
                k = 0;
            } else
            {
                k = 1;
            }
            moveToState(fragment, k, i, j, false);
        }
    }

    public void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
    {
        if (mBackStackChangeListeners != null)
        {
            mBackStackChangeListeners.remove(onbackstackchangedlistener);
        }
    }

    void reportBackStackChanged()
    {
        if (mBackStackChangeListeners == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < mBackStackChangeListeners.size()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((FragmentManager.OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    void restoreAllState(Parcelable parcelable, ArrayList arraylist)
    {
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (((FragmentManagerState) (parcelable = (FragmentManagerState)parcelable)).mActive == null) goto _L1; else goto _L3
_L3:
        if (arraylist == null) goto _L5; else goto _L4
_L4:
        int i = 0;
_L14:
        if (i < arraylist.size()) goto _L6; else goto _L5
_L5:
        mActive = new ArrayList(((FragmentManagerState) (parcelable)).mActive.length);
        if (mAvailIndices != null)
        {
            mAvailIndices.clear();
        }
        i = 0;
_L15:
        if (i < ((FragmentManagerState) (parcelable)).mActive.length) goto _L8; else goto _L7
_L7:
        if (arraylist == null) goto _L10; else goto _L9
_L9:
        i = 0;
_L16:
        if (i < arraylist.size()) goto _L11; else goto _L10
_L10:
        if (((FragmentManagerState) (parcelable)).mAdded == null)
        {
            break MISSING_BLOCK_LABEL_820;
        }
        mAdded = new ArrayList(((FragmentManagerState) (parcelable)).mAdded.length);
        i = 0;
_L17:
        if (i < ((FragmentManagerState) (parcelable)).mAdded.length) goto _L13; else goto _L12
_L12:
        Fragment fragment;
        FragmentState fragmentstate1;
        if (((FragmentManagerState) (parcelable)).mBackStack != null)
        {
            mBackStack = new ArrayList(((FragmentManagerState) (parcelable)).mBackStack.length);
            i = 0;
            while (i < ((FragmentManagerState) (parcelable)).mBackStack.length) 
            {
                arraylist = ((FragmentManagerState) (parcelable)).mBackStack[i].instantiate(this);
                if (DEBUG)
                {
                    Log.v("FragmentManager", (new StringBuilder("restoreAllState: back stack #")).append(i).append(" (index ").append(((BackStackRecord) (arraylist)).mIndex).append("): ").append(arraylist).toString());
                    arraylist.dump("  ", new PrintWriter(new LogWriter("FragmentManager")), false);
                }
                mBackStack.add(arraylist);
                if (((BackStackRecord) (arraylist)).mIndex >= 0)
                {
                    setBackStackIndex(((BackStackRecord) (arraylist)).mIndex, arraylist);
                }
                i++;
            }
        } else
        {
            mBackStack = null;
            return;
        }
          goto _L1
_L6:
        fragment = (Fragment)arraylist.get(i);
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("restoreAllState: re-attaching retained ")).append(fragment).toString());
        }
        fragmentstate1 = ((FragmentManagerState) (parcelable)).mActive[fragment.mIndex];
        fragmentstate1.mInstance = fragment;
        fragment.mSavedViewState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        fragment.mTarget = null;
        if (fragmentstate1.mSavedFragmentState != null)
        {
            fragmentstate1.mSavedFragmentState.setClassLoader(mActivity.getClassLoader());
            fragment.mSavedViewState = fragmentstate1.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        }
        i++;
          goto _L14
_L8:
        FragmentState fragmentstate = ((FragmentManagerState) (parcelable)).mActive[i];
        if (fragmentstate != null)
        {
            Fragment fragment2 = fragmentstate.instantiate(mActivity, mParent);
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("restoreAllState: active #")).append(i).append(": ").append(fragment2).toString());
            }
            mActive.add(fragment2);
            fragmentstate.mInstance = null;
        } else
        {
            mActive.add(null);
            if (mAvailIndices == null)
            {
                mAvailIndices = new ArrayList();
            }
            if (DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("restoreAllState: avail #")).append(i).toString());
            }
            mAvailIndices.add(Integer.valueOf(i));
        }
        i++;
          goto _L15
_L11:
        Fragment fragment1 = (Fragment)arraylist.get(i);
        if (fragment1.mTargetIndex >= 0)
        {
            if (fragment1.mTargetIndex < mActive.size())
            {
                fragment1.mTarget = (Fragment)mActive.get(fragment1.mTargetIndex);
            } else
            {
                Log.w("FragmentManager", (new StringBuilder("Re-attaching retained fragment ")).append(fragment1).append(" target no longer exists: ").append(fragment1.mTargetIndex).toString());
                fragment1.mTarget = null;
            }
        }
        i++;
          goto _L16
_L13:
        arraylist = (Fragment)mActive.get(((FragmentManagerState) (parcelable)).mAdded[i]);
        if (arraylist == null)
        {
            throwException(new IllegalStateException((new StringBuilder("No instantiated fragment for index #")).append(((FragmentManagerState) (parcelable)).mAdded[i]).toString()));
        }
        arraylist.mAdded = true;
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("restoreAllState: added #")).append(i).append(": ").append(arraylist).toString());
        }
        if (mAdded.contains(arraylist))
        {
            throw new IllegalStateException("Already added!");
        }
        mAdded.add(arraylist);
        i++;
          goto _L17
        mAdded = null;
          goto _L12
    }

    ArrayList retainNonConfig()
    {
        ArrayList arraylist;
        Object obj;
        arraylist = null;
        obj = null;
        if (mActive == null) goto _L2; else goto _L1
_L1:
        int i;
        i = 0;
        arraylist = obj;
_L5:
        if (i < mActive.size()) goto _L3; else goto _L2
_L2:
        return arraylist;
_L3:
        Fragment fragment = (Fragment)mActive.get(i);
        ArrayList arraylist2 = arraylist;
        if (fragment != null)
        {
            arraylist2 = arraylist;
            if (fragment.mRetainInstance)
            {
                ArrayList arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList();
                }
                arraylist1.add(fragment);
                fragment.mRetaining = true;
                int j;
                if (fragment.mTarget != null)
                {
                    j = fragment.mTarget.mIndex;
                } else
                {
                    j = -1;
                }
                fragment.mTargetIndex = j;
                arraylist2 = arraylist1;
                if (DEBUG)
                {
                    Log.v("FragmentManager", (new StringBuilder("retainNonConfig: keeping retained ")).append(fragment).toString());
                    arraylist2 = arraylist1;
                }
            }
        }
        i++;
        arraylist = arraylist2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    Parcelable saveAllState()
    {
        execPendingActions();
        if (HONEYCOMB)
        {
            mStateSaved = true;
        }
        if (mActive != null && mActive.size() > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        FragmentState afragmentstate[];
        int l = mActive.size();
        afragmentstate = new FragmentState[l];
        boolean flag = false;
        int i = 0;
label0:
        do
        {
label1:
            {
label2:
                {
                    if (i < l)
                    {
                        break label2;
                    }
                    if (flag)
                    {
                        break label1;
                    }
                    if (DEBUG)
                    {
                        Log.v("FragmentManager", "saveAllState: no fragments!");
                        return null;
                    }
                }
                if (true)
                {
                    break label0;
                }
                Fragment fragment = (Fragment)mActive.get(i);
                if (fragment != null)
                {
                    if (fragment.mIndex < 0)
                    {
                        throwException(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(fragment).append(" has cleared index: ").append(fragment.mIndex).toString()));
                    }
                    boolean flag1 = true;
                    FragmentState fragmentstate = new FragmentState(fragment);
                    afragmentstate[i] = fragmentstate;
                    if (fragment.mState > 0 && fragmentstate.mSavedFragmentState == null)
                    {
                        fragmentstate.mSavedFragmentState = saveFragmentBasicState(fragment);
                        if (fragment.mTarget != null)
                        {
                            if (fragment.mTarget.mIndex < 0)
                            {
                                throwException(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(fragment).append(" has target not in fragment manager: ").append(fragment.mTarget).toString()));
                            }
                            if (fragmentstate.mSavedFragmentState == null)
                            {
                                fragmentstate.mSavedFragmentState = new Bundle();
                            }
                            putFragment(fragmentstate.mSavedFragmentState, "android:target_state", fragment.mTarget);
                            if (fragment.mTargetRequestCode != 0)
                            {
                                fragmentstate.mSavedFragmentState.putInt("android:target_req_state", fragment.mTargetRequestCode);
                            }
                        }
                    } else
                    {
                        fragmentstate.mSavedFragmentState = fragment.mSavedFragmentState;
                    }
                    flag = flag1;
                    if (DEBUG)
                    {
                        Log.v("FragmentManager", (new StringBuilder("Saved state of ")).append(fragment).append(": ").append(fragmentstate.mSavedFragmentState).toString());
                        flag = flag1;
                    }
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        int ai[];
        BackStackState abackstackstate[];
        Object obj;
        abackstackstate = null;
        obj = null;
        ai = abackstackstate;
        if (mAdded == null) goto _L5; else goto _L4
_L4:
        int k;
        k = mAdded.size();
        ai = abackstackstate;
        if (k <= 0) goto _L5; else goto _L6
_L6:
        int j;
        ai = new int[k];
        j = 0;
_L11:
        if (j < k) goto _L7; else goto _L5
_L5:
        abackstackstate = obj;
        if (mBackStack == null) goto _L9; else goto _L8
_L8:
        k = mBackStack.size();
        abackstackstate = obj;
        if (k <= 0) goto _L9; else goto _L10
_L10:
        abackstackstate = new BackStackState[k];
        j = 0;
_L12:
        if (j < k)
        {
            break MISSING_BLOCK_LABEL_615;
        }
_L9:
        FragmentManagerState fragmentmanagerstate = new FragmentManagerState();
        fragmentmanagerstate.mActive = afragmentstate;
        fragmentmanagerstate.mAdded = ai;
        fragmentmanagerstate.mBackStack = abackstackstate;
        return fragmentmanagerstate;
_L7:
        ai[j] = ((Fragment)mAdded.get(j)).mIndex;
        if (ai[j] < 0)
        {
            throwException(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(mAdded.get(j)).append(" has cleared index: ").append(ai[j]).toString()));
        }
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("saveAllState: adding fragment #")).append(j).append(": ").append(mAdded.get(j)).toString());
        }
        j++;
          goto _L11
        abackstackstate[j] = new BackStackState(this, (BackStackRecord)mBackStack.get(j));
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("saveAllState: adding back stack #")).append(j).append(": ").append(mBackStack.get(j)).toString());
        }
        j++;
          goto _L12
    }

    Bundle saveFragmentBasicState(Fragment fragment)
    {
        Bundle bundle1 = null;
        if (mStateBundle == null)
        {
            mStateBundle = new Bundle();
        }
        fragment.performSaveInstanceState(mStateBundle);
        if (!mStateBundle.isEmpty())
        {
            bundle1 = mStateBundle;
            mStateBundle = null;
        }
        if (fragment.mView != null)
        {
            saveFragmentViewState(fragment);
        }
        Bundle bundle = bundle1;
        if (fragment.mSavedViewState != null)
        {
            bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        bundle1 = bundle;
        if (!fragment.mUserVisibleHint)
        {
            bundle1 = bundle;
            if (bundle == null)
            {
                bundle1 = new Bundle();
            }
            bundle1.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle1;
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
    {
        Object obj = null;
        if (fragment.mIndex < 0)
        {
            throwException(new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()));
        }
        Fragment.SavedState savedstate = obj;
        if (fragment.mState > 0)
        {
            fragment = saveFragmentBasicState(fragment);
            savedstate = obj;
            if (fragment != null)
            {
                savedstate = new Fragment.SavedState(fragment);
            }
        }
        return savedstate;
    }

    void saveFragmentViewState(Fragment fragment)
    {
        if (fragment.mInnerView != null)
        {
            if (mStateArray == null)
            {
                mStateArray = new SparseArray();
            } else
            {
                mStateArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(mStateArray);
            if (mStateArray.size() > 0)
            {
                fragment.mSavedViewState = mStateArray;
                mStateArray = null;
                return;
            }
        }
    }

    public void setBackStackIndex(int i, BackStackRecord backstackrecord)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        if (mBackStackIndices == null)
        {
            mBackStackIndices = new ArrayList();
        }
        k = mBackStackIndices.size();
        int j = k;
        if (i >= k) goto _L2; else goto _L1
_L1:
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Setting back stack index ")).append(i).append(" to ").append(backstackrecord).toString());
        }
        mBackStackIndices.set(i, backstackrecord);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        mBackStackIndices.add(null);
        if (mAvailBackStackIndices == null)
        {
            mAvailBackStackIndices = new ArrayList();
        }
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Adding available back stack index ")).append(j).toString());
        }
        mAvailBackStackIndices.add(Integer.valueOf(j));
        j++;
_L2:
        if (j < i) goto _L4; else goto _L3
_L3:
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Adding back stack index ")).append(i).append(" with ").append(backstackrecord).toString());
        }
        mBackStackIndices.add(backstackrecord);
          goto _L5
        backstackrecord;
        this;
        JVM INSTR monitorexit ;
        throw backstackrecord;
    }

    public void showFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("show: ")).append(fragment).toString());
        }
        if (fragment.mHidden)
        {
            fragment.mHidden = false;
            if (fragment.mView != null)
            {
                Animation animation = loadAnimation(fragment, i, true, j);
                if (animation != null)
                {
                    fragment.mView.startAnimation(animation);
                }
                fragment.mView.setVisibility(0);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
            {
                mNeedMenuInvalidate = true;
            }
            fragment.onHiddenChanged(false);
        }
    }

    void startPendingDeferredFragments()
    {
        if (mActive != null)
        {
            int i = 0;
            while (i < mActive.size()) 
            {
                Fragment fragment = (Fragment)mActive.get(i);
                if (fragment != null)
                {
                    performPendingDeferredStart(fragment);
                }
                i++;
            }
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("FragmentManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        if (mParent != null)
        {
            DebugUtils.buildShortClassTag(mParent, stringbuilder);
        } else
        {
            DebugUtils.buildShortClassTag(mActivity, stringbuilder);
        }
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag = false;
        DEBUG = false;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        }
        HONEYCOMB = flag;
    }
}
