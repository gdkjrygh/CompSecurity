// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.LogWriter;
import android.util.AttributeSet;
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
//            LoaderManagerImpl, SuperNotCalledException, NoSaveStateFrameLayout, FragmentContainer, 
//            FragmentManagerState, FragmentState, BackStackState, FragmentTransaction

final class FragmentManagerImpl extends FragmentManager
    implements android.view.LayoutInflater.Factory
{

    static final Interpolator ACCELERATE_CUBIC;
    static final Interpolator ACCELERATE_QUINT;
    static boolean DEBUG;
    static final Interpolator DECELERATE_CUBIC;
    static final Interpolator DECELERATE_QUINT;
    static final boolean HONEYCOMB;
    private static final String z[];
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
        mExecCommit = new _cls1();
    }

    private void checkStateLoss()
    {
        try
        {
            if (mStateSaved)
            {
                throw new IllegalStateException(z[122]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        try
        {
            if (mNoTransactionsBecause != null)
            {
                throw new IllegalStateException((new StringBuilder()).append(z[121]).append(mNoTransactionsBecause).toString());
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
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
        boolean flag;
        int j;
        j = FragmentActivity.a;
        flag = false;
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   4097: 44
    //                   4099: 60
    //                   8194: 52;
           goto _L1 _L2 _L3 _L4
_L1:
        i = ((flag) ? 1 : 0);
_L5:
        return i;
_L2:
        i = 8194;
        if (j == 0) goto _L5; else goto _L4
_L4:
        i = 4097;
        if (j == 0) goto _L5; else goto _L3
_L3:
        return 4099;
    }

    private void throwException(RuntimeException runtimeexception)
    {
        PrintWriter printwriter;
        Log.e(z[24], runtimeexception.getMessage());
        Log.e(z[17], z[18]);
        printwriter = new PrintWriter(new LogWriter(z[16]));
        if (mActivity == null) goto _L2; else goto _L1
_L1:
        mActivity.dump(z[22], null, printwriter, new String[0]);
_L4:
        throw runtimeexception;
        Exception exception1;
        exception1;
        Log.e(z[21], z[20], exception1);
        if (FragmentActivity.a == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        try
        {
            dump(z[19], null, printwriter, new String[0]);
        }
        catch (Exception exception)
        {
            Log.e(z[25], z[23], exception);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int transitToStyleIndex(int i, boolean flag)
    {
        byte byte0;
        int j;
        j = FragmentActivity.a;
        byte0 = -1;
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   4097: 44
    //                   4099: 64
    //                   8194: 54;
           goto _L1 _L2 _L3 _L4
_L1:
        i = byte0;
_L5:
        return i;
_L2:
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        if (j == 0) goto _L5; else goto _L4
_L4:
        if (flag)
        {
            i = 3;
        } else
        {
            i = 4;
        }
        if (j == 0) goto _L5; else goto _L3
_L3:
        return !flag ? 6 : 5;
    }

    void addBackStackState(BackStackRecord backstackrecord)
    {
        try
        {
            if (mBackStack == null)
            {
                mBackStack = new ArrayList();
            }
        }
        // Misplaced declaration of an exception variable
        catch (BackStackRecord backstackrecord)
        {
            throw backstackrecord;
        }
        mBackStack.add(backstackrecord);
        reportBackStackChanged();
    }

    public void addFragment(Fragment fragment, boolean flag)
    {
        boolean flag1;
        try
        {
            if (mAdded == null)
            {
                mAdded = new ArrayList();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            if (DEBUG)
            {
                Log.v(z[5], (new StringBuilder()).append(z[4]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        makeActive(fragment);
        flag1 = fragment.mDetached;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        try
        {
            if (mAdded.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder()).append(z[3]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        break MISSING_BLOCK_LABEL_122;
        fragment;
        throw fragment;
        boolean flag2;
        mAdded.add(fragment);
        fragment.mAdded = true;
        fragment.mRemoving = false;
        flag2 = fragment.mHasMenu;
        if (flag2)
        {
            try
            {
                if (fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        moveToState(fragment);
        return;
        fragment;
        throw fragment;
        fragment;
        throw fragment;
    }

    public int allocBackStackIndex(BackStackRecord backstackrecord)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = mAvailBackStackIndices;
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        if (mAvailBackStackIndices.size() > 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        arraylist = mBackStackIndices;
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        mBackStackIndices = new ArrayList();
        int i = mBackStackIndices.size();
        if (DEBUG)
        {
            Log.v(z[13], (new StringBuilder()).append(z[10]).append(i).append(z[11]).append(backstackrecord).toString());
        }
        mBackStackIndices.add(backstackrecord);
        this;
        JVM INSTR monitorexit ;
        return i;
        backstackrecord;
        try
        {
            throw backstackrecord;
        }
        // Misplaced declaration of an exception variable
        catch (BackStackRecord backstackrecord) { }
        finally { }
        throw backstackrecord;
        this;
        JVM INSTR monitorexit ;
        throw backstackrecord;
        backstackrecord;
        throw backstackrecord;
        i = ((Integer)mAvailBackStackIndices.remove(mAvailBackStackIndices.size() - 1)).intValue();
        if (DEBUG)
        {
            Log.v(z[9], (new StringBuilder()).append(z[12]).append(i).append(z[8]).append(backstackrecord).toString());
        }
        mBackStackIndices.set(i, backstackrecord);
        this;
        JVM INSTR monitorexit ;
        return i;
        backstackrecord;
        throw backstackrecord;
    }

    public void attachActivity(FragmentActivity fragmentactivity, FragmentContainer fragmentcontainer, Fragment fragment)
    {
        try
        {
            if (mActivity != null)
            {
                throw new IllegalStateException(z[57]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (FragmentActivity fragmentactivity)
        {
            throw fragmentactivity;
        }
        mActivity = fragmentactivity;
        mContainer = fragmentcontainer;
        mParent = fragment;
    }

    public void attachFragment(Fragment fragment, int i, int j)
    {
        boolean flag;
        try
        {
            if (DEBUG)
            {
                Log.v(z[66], (new StringBuilder()).append(z[65]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        flag = fragment.mDetached;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        fragment.mDetached = false;
        flag = fragment.mAdded;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        try
        {
            if (mAdded == null)
            {
                mAdded = new ArrayList();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            if (mAdded.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder()).append(z[62]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        break MISSING_BLOCK_LABEL_141;
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment) { }
        throw fragment;
        try
        {
            if (DEBUG)
            {
                Log.v(z[64], (new StringBuilder()).append(z[63]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        mAdded.add(fragment);
        fragment.mAdded = true;
        flag = fragment.mHasMenu;
        if (flag)
        {
            try
            {
                if (fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        moveToState(fragment, mCurState, i, j, false);
        return;
        fragment;
        throw fragment;
    }

    public FragmentTransaction beginTransaction()
    {
        return new BackStackRecord(this);
    }

    public void detachFragment(Fragment fragment, int i, int j)
    {
        ArrayList arraylist;
        boolean flag;
        try
        {
            if (DEBUG)
            {
                Log.v(z[118], (new StringBuilder()).append(z[117]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        flag = fragment.mDetached;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        fragment.mDetached = true;
        flag = fragment.mAdded;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        arraylist = mAdded;
        if (arraylist != null)
        {
            boolean flag1;
            try
            {
                if (DEBUG)
                {
                    Log.v(z[120], (new StringBuilder()).append(z[119]).append(fragment).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
            mAdded.remove(fragment);
        }
        flag1 = fragment.mHasMenu;
        if (flag1)
        {
            try
            {
                if (fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        fragment.mAdded = false;
        moveToState(fragment, 1, i, j, false);
        return;
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment) { }
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment) { }
        throw fragment;
        fragment;
        throw fragment;
    }

    public void dispatchActivityCreated()
    {
        mStateSaved = false;
        moveToState(2, false);
    }

    public void dispatchConfigurationChanged(Configuration configuration)
    {
        int j = FragmentActivity.a;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i >= mAdded.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment != null)
        {
            try
            {
                fragment.performConfigurationChanged(configuration);
            }
            // Misplaced declaration of an exception variable
            catch (Configuration configuration)
            {
                throw configuration;
            }
        }
        if (j == 0) goto _L4; else goto _L2
_L2:
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean dispatchContextItemSelected(MenuItem menuitem)
    {
        int j;
        boolean flag;
        boolean flag1;
        flag1 = false;
        j = FragmentActivity.a;
        flag = flag1;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L9:
        flag = flag1;
        if (i >= mAdded.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment == null) goto _L5; else goto _L4
_L4:
        try
        {
            flag = fragment.performContextItemSelected(menuitem);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (!flag) goto _L5; else goto _L6
_L6:
        flag = true;
_L2:
        return flag;
_L5:
        flag = flag1;
        if (j != 0) goto _L2; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void dispatchCreate()
    {
        mStateSaved = false;
        moveToState(1, false);
    }

    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        int i;
        boolean flag;
        int j;
        boolean flag1;
        flag = false;
        j = FragmentActivity.a;
        arraylist1 = null;
        arraylist = null;
        if (mAdded == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        i = 0;
        flag1 = false;
_L7:
        boolean flag2;
        arraylist1 = arraylist;
        flag2 = flag1;
        if (i >= mAdded.size()) goto _L2; else goto _L1
_L1:
        Fragment fragment = (Fragment)mAdded.get(i);
        arraylist1 = arraylist;
        flag2 = flag1;
        if (fragment != null)
        {
            boolean flag3;
            try
            {
                flag3 = fragment.performCreateOptionsMenu(menu, menuinflater);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            arraylist1 = arraylist;
            flag2 = flag1;
            if (flag3)
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
        if (j == 0) goto _L3; else goto _L2
_L2:
        if (mCreatedMenus == null) goto _L5; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
_L6:
        if (i >= mCreatedMenus.size())
        {
            break; /* Loop/switch isn't completed */
        }
        menu = (Fragment)mCreatedMenus.get(i);
        if (arraylist1 == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        if (arraylist1.contains(menu))
        {
            break MISSING_BLOCK_LABEL_178;
        }
        menu.onDestroyOptionsMenu();
        i++;
        if (j == 0) goto _L6; else goto _L5
_L5:
        mCreatedMenus = arraylist1;
        return flag2;
        menu;
        throw menu;
_L3:
        i++;
        arraylist = arraylist1;
        flag1 = flag2;
          goto _L7
        flag2 = false;
          goto _L2
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
        int j = FragmentActivity.a;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i >= mAdded.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment != null)
        {
            try
            {
                fragment.performLowMemory();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        if (j == 0) goto _L4; else goto _L2
_L2:
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuitem)
    {
        int j;
        boolean flag;
        boolean flag1;
        flag1 = false;
        j = FragmentActivity.a;
        flag = flag1;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L9:
        flag = flag1;
        if (i >= mAdded.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment == null) goto _L5; else goto _L4
_L4:
        try
        {
            flag = fragment.performOptionsItemSelected(menuitem);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (!flag) goto _L5; else goto _L6
_L6:
        flag = true;
_L2:
        return flag;
_L5:
        flag = flag1;
        if (j != 0) goto _L2; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void dispatchOptionsMenuClosed(Menu menu)
    {
        int j = FragmentActivity.a;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i >= mAdded.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment != null)
        {
            try
            {
                fragment.performOptionsMenuClosed(menu);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        if (j == 0) goto _L4; else goto _L2
_L2:
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void dispatchPause()
    {
        moveToState(4, false);
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu)
    {
        int j = FragmentActivity.a;
        if (mAdded != null)
        {
            int i = 0;
            boolean flag = false;
            do
            {
                boolean flag1;
label0:
                {
                    flag1 = flag;
                    if (i < mAdded.size())
                    {
                        Fragment fragment = (Fragment)mAdded.get(i);
                        flag1 = flag;
                        if (fragment != null)
                        {
                            boolean flag2;
                            try
                            {
                                flag2 = fragment.performPrepareOptionsMenu(menu);
                            }
                            // Misplaced declaration of an exception variable
                            catch (Menu menu)
                            {
                                throw menu;
                            }
                            flag1 = flag;
                            if (flag2)
                            {
                                flag1 = true;
                            }
                        }
                        if (j == 0)
                        {
                            break label0;
                        }
                    }
                    return flag1;
                }
                i++;
                flag = flag1;
            } while (true);
        } else
        {
            return false;
        }
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
        String s1;
        boolean flag;
        int j;
        flag = false;
        j = FragmentActivity.a;
        s1 = (new StringBuilder()).append(s).append(z[137]).toString();
        if (mActive == null) goto _L2; else goto _L1
_L1:
        int k = mActive.size();
        if (k <= 0) goto _L2; else goto _L3
_L3:
        int i;
        printwriter.print(s);
        printwriter.print(z[124]);
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(":");
        i = 0;
_L37:
        if (i >= k) goto _L2; else goto _L4
_L4:
        Object obj = (Fragment)mActive.get(i);
        int l;
        try
        {
            printwriter.print(s);
            printwriter.print(z[134]);
            printwriter.print(i);
            printwriter.print(z[140]);
            printwriter.println(obj);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        ((Fragment) (obj)).dump(s1, filedescriptor, printwriter, as);
        if (j == 0) goto _L5; else goto _L2
_L2:
        if (mAdded == null) goto _L7; else goto _L6
_L6:
        l = mAdded.size();
        if (l <= 0) goto _L7; else goto _L8
_L8:
        printwriter.print(s);
        printwriter.println(z[128]);
        i = 0;
_L35:
        if (i >= l) goto _L7; else goto _L9
_L9:
        obj = (Fragment)mAdded.get(i);
        printwriter.print(s);
        printwriter.print(z[125]);
        printwriter.print(i);
        printwriter.print(z[150]);
        printwriter.println(((Fragment) (obj)).toString());
        if (j == 0) goto _L10; else goto _L7
_L7:
        if (mCreatedMenus == null) goto _L12; else goto _L11
_L11:
        l = mCreatedMenus.size();
        if (l <= 0) goto _L12; else goto _L13
_L13:
        printwriter.print(s);
        printwriter.println(z[143]);
        i = 0;
_L34:
        if (i >= l) goto _L12; else goto _L14
_L14:
        obj = (Fragment)mCreatedMenus.get(i);
        printwriter.print(s);
        printwriter.print(z[127]);
        printwriter.print(i);
        printwriter.print(z[129]);
        printwriter.println(((Fragment) (obj)).toString());
        if (j == 0) goto _L15; else goto _L12
_L12:
        if (mBackStack == null) goto _L17; else goto _L16
_L16:
        l = mBackStack.size();
        if (l <= 0) goto _L17; else goto _L18
_L18:
        printwriter.print(s);
        printwriter.println(z[142]);
        i = 0;
_L33:
        if (i >= l) goto _L17; else goto _L19
_L19:
        obj = (BackStackRecord)mBackStack.get(i);
        printwriter.print(s);
        printwriter.print(z[141]);
        printwriter.print(i);
        printwriter.print(z[152]);
        printwriter.println(((BackStackRecord) (obj)).toString());
        ((BackStackRecord) (obj)).dump(s1, filedescriptor, printwriter, as);
        if (j == 0) goto _L20; else goto _L17
_L17:
        this;
        JVM INSTR monitorenter ;
        if (mBackStackIndices == null) goto _L22; else goto _L21
_L21:
        l = mBackStackIndices.size();
        if (l <= 0) goto _L22; else goto _L23
_L23:
        printwriter.print(s);
        printwriter.println(z[138]);
        i = 0;
_L32:
        if (i >= l) goto _L22; else goto _L24
_L24:
        filedescriptor = (BackStackRecord)mBackStackIndices.get(i);
        printwriter.print(s);
        printwriter.print(z[149]);
        printwriter.print(i);
        printwriter.print(z[132]);
        printwriter.println(filedescriptor);
        if (j == 0) goto _L25; else goto _L22
_L22:
        if (mAvailBackStackIndices == null)
        {
            break MISSING_BLOCK_LABEL_661;
        }
        i = mAvailBackStackIndices.size();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_661;
        }
        printwriter.print(s);
        printwriter.print(z[139]);
        printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
        this;
        JVM INSTR monitorexit ;
        if (mPendingActions == null) goto _L27; else goto _L26
_L26:
        l = mPendingActions.size();
        if (l <= 0) goto _L27; else goto _L28
_L28:
        printwriter.print(s);
        printwriter.println(z[151]);
        i = ((flag) ? 1 : 0);
_L31:
        if (i >= l) goto _L27; else goto _L29
_L29:
        filedescriptor = (Runnable)mPendingActions.get(i);
        printwriter.print(s);
        printwriter.print(z[147]);
        printwriter.print(i);
        printwriter.print(z[136]);
        printwriter.println(filedescriptor);
        if (j == 0) goto _L30; else goto _L27
_L27:
        try
        {
            printwriter.print(s);
            printwriter.println(z[144]);
            printwriter.print(s);
            printwriter.print(z[123]);
            printwriter.println(mActivity);
            printwriter.print(s);
            printwriter.print(z[135]);
            printwriter.println(mContainer);
            if (mParent != null)
            {
                printwriter.print(s);
                printwriter.print(z[145]);
                printwriter.println(mParent);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            printwriter.print(s);
            printwriter.print(z[146]);
            printwriter.print(mCurState);
            printwriter.print(z[131]);
            printwriter.print(mStateSaved);
            printwriter.print(z[126]);
            printwriter.println(mDestroyed);
            if (mNeedMenuInvalidate)
            {
                printwriter.print(s);
                printwriter.print(z[133]);
                printwriter.println(mNeedMenuInvalidate);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (mNoTransactionsBecause != null)
            {
                printwriter.print(s);
                printwriter.print(z[130]);
                printwriter.println(mNoTransactionsBecause);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            filedescriptor = mAvailIndices;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (filedescriptor == null)
        {
            break MISSING_BLOCK_LABEL_1033;
        }
        if (mAvailIndices.size() > 0)
        {
            printwriter.print(s);
            printwriter.print(z[148]);
            printwriter.println(Arrays.toString(mAvailIndices.toArray()));
        }
        return;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally { }
        throw s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L30:
        i++;
        if (true) goto _L31; else goto _L25
_L25:
        i++;
        if (true) goto _L32; else goto _L20
_L20:
        i++;
        if (true) goto _L33; else goto _L15
_L15:
        i++;
        if (true) goto _L34; else goto _L10
_L10:
        i++;
        if (true) goto _L35; else goto _L5
_L5:
        i++;
        if (true) goto _L37; else goto _L36
_L36:
    }

    public void enqueueAction(Runnable runnable, boolean flag)
    {
        if (!flag)
        {
            try
            {
                checkStateLoss();
            }
            // Misplaced declaration of an exception variable
            catch (Runnable runnable)
            {
                throw runnable;
            }
        }
        this;
        JVM INSTR monitorenter ;
        flag = mDestroyed;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        if (mActivity != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        throw new IllegalStateException(z[184]);
        runnable;
        throw runnable;
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
        return;
        runnable;
        throw runnable;
        runnable;
        throw runnable;
    }

    public boolean execPendingActions()
    {
        int l;
        l = FragmentActivity.a;
        try
        {
            if (mExecutingActions)
            {
                throw new IllegalStateException(z[156]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        try
        {
            if (Looper.myLooper() != mActivity.mHandler.getLooper())
            {
                throw new IllegalStateException(z[155]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        boolean flag1 = false;
_L2:
        this;
        JVM INSTR monitorenter ;
        if (mPendingActions != null && mPendingActions.size() != 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        this;
        JVM INSTR monitorexit ;
        if (l == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = mPendingActions.size();
        int i;
        if (mTmpActions == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        i = mTmpActions.length;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        mTmpActions = new Runnable[j];
        mPendingActions.toArray(mTmpActions);
        mPendingActions.clear();
        mActivity.mHandler.removeCallbacks(mExecCommit);
        this;
        JVM INSTR monitorexit ;
        mExecutingActions = true;
        i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            mTmpActions[i].run();
            mTmpActions[i] = null;
            i++;
        } while (l == 0);
        mExecutingActions = false;
        flag1 = true;
        if (true) goto _L2; else goto _L1
        Object obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L1:
        if (!mHavePendingDeferredStart) goto _L4; else goto _L3
_L3:
        int k;
        k = 0;
        i = 0;
_L9:
        boolean flag = i;
        if (k >= mActive.size()) goto _L6; else goto _L5
_L5:
        Fragment fragment = (Fragment)mActive.get(k);
        flag = i;
        if (fragment != null)
        {
            LoaderManagerImpl loadermanagerimpl;
            try
            {
                loadermanagerimpl = fragment.mLoaderManager;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
            flag = i;
            if (loadermanagerimpl != null)
            {
                flag = i | fragment.mLoaderManager.hasRunningLoaders();
            }
        }
        if (l == 0) goto _L7; else goto _L6
_L6:
        if (!flag)
        {
            try
            {
                mHavePendingDeferredStart = false;
                startPendingDeferredFragments();
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
        }
_L4:
        return flag1;
_L7:
        k++;
        i = ((flag) ? 1 : 0);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean executePendingTransactions()
    {
        return execPendingActions();
    }

    public Fragment findFragmentById(int i)
    {
        int k = FragmentActivity.a;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int j = mAdded.size() - 1;
_L14:
        if (j < 0) goto _L2; else goto _L3
_L3:
        Object obj = (Fragment)mAdded.get(j);
        if (obj == null) goto _L5; else goto _L4
_L4:
        int l;
        try
        {
            l = ((Fragment) (obj)).mFragmentId;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (l != i) goto _L5; else goto _L6
_L6:
        return ((Fragment) (obj));
_L5:
        if (k == 0) goto _L7; else goto _L2
_L2:
        if (mActive == null) goto _L9; else goto _L8
_L8:
        j = mActive.size() - 1;
_L12:
        if (j < 0) goto _L9; else goto _L10
_L10:
        obj = (Fragment)mActive.get(j);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1;
        try
        {
            i1 = ((Fragment) (obj)).mFragmentId;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (i1 == i) goto _L6; else goto _L11
_L11:
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
_L9:
        return null;
        j--;
          goto _L12
_L7:
        j--;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public Fragment findFragmentByTag(String s)
    {
        Object obj;
        int i;
        int j;
        j = FragmentActivity.a;
        boolean flag;
        try
        {
            obj = mAdded;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (obj == null || s == null) goto _L2; else goto _L1
_L1:
        i = mAdded.size() - 1;
_L14:
        if (i < 0) goto _L2; else goto _L3
_L3:
        obj = (Fragment)mAdded.get(i);
        if (obj == null) goto _L5; else goto _L4
_L4:
        try
        {
            flag = s.equals(((Fragment) (obj)).mTag);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (!flag) goto _L5; else goto _L6
_L6:
        return ((Fragment) (obj));
_L5:
        if (j == 0) goto _L7; else goto _L2
_L2:
        try
        {
            obj = mActive;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (obj == null || s == null) goto _L9; else goto _L8
_L8:
        i = mActive.size() - 1;
_L12:
        if (i < 0) goto _L9; else goto _L10
_L10:
        obj = (Fragment)mActive.get(i);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1;
        try
        {
            flag1 = s.equals(((Fragment) (obj)).mTag);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (flag1) goto _L6; else goto _L11
_L11:
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_147;
        }
_L9:
        return null;
        i--;
          goto _L12
_L7:
        i--;
        if (true) goto _L14; else goto _L13
_L13:
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
            Log.v(z[153], (new StringBuilder()).append(z[154]).append(i).toString());
        }
        mAvailBackStackIndices.add(Integer.valueOf(i));
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Fragment getFragment(Bundle bundle, String s)
    {
        int i = bundle.getInt(s, -1);
        if (i == -1)
        {
            bundle = null;
        } else
        {
            Fragment fragment;
            try
            {
                if (i >= mActive.size())
                {
                    throwException(new IllegalStateException((new StringBuilder()).append(z[59]).append(s).append(z[61]).append(i).toString()));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            fragment = (Fragment)mActive.get(i);
            bundle = fragment;
            if (fragment == null)
            {
                try
                {
                    throwException(new IllegalStateException((new StringBuilder()).append(z[58]).append(s).append(z[60]).append(i).toString()));
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw bundle;
                }
                return fragment;
            }
        }
        return bundle;
    }

    public List getFragments()
    {
        return mActive;
    }

    android.view.LayoutInflater.Factory getLayoutInflaterFactory()
    {
        return this;
    }

    public void hideFragment(Fragment fragment, int i, int j)
    {
        View view;
        try
        {
            if (DEBUG)
            {
                Log.v(z[7], (new StringBuilder()).append(z[6]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            if (fragment.mHidden)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            fragment.mHidden = true;
            view = fragment.mView;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        if (view != null)
        {
            Animation animation = loadAnimation(fragment, i, false, j);
            boolean flag;
            if (animation != null)
            {
                try
                {
                    fragment.mView.startAnimation(animation);
                }
                // Misplaced declaration of an exception variable
                catch (Fragment fragment)
                {
                    throw fragment;
                }
            }
            fragment.mView.setVisibility(8);
        }
        flag = fragment.mAdded;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        flag = fragment.mHasMenu;
        if (flag)
        {
            try
            {
                if (fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        fragment.onHiddenChanged(true);
        return;
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment) { }
        throw fragment;
    }

    Animation loadAnimation(Fragment fragment, int i, boolean flag, int j)
    {
        Animation animation = fragment.onCreateAnimation(i, flag, fragment.mNextAnim);
        if (animation == null) goto _L2; else goto _L1
_L1:
        fragment = animation;
_L4:
        return fragment;
_L2:
        if (fragment.mNextAnim == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        animation = AnimationUtils.loadAnimation(mActivity, fragment.mNextAnim);
        fragment = animation;
        if (animation != null) goto _L4; else goto _L3
_L3:
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
                try
                {
                    fragment = mActivity.getWindow();
                }
                // Misplaced declaration of an exception variable
                catch (Fragment fragment)
                {
                    throw fragment;
                }
                i = j;
                if (fragment != null)
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
            try
            {
                fragment = makeOpenCloseAnimation(mActivity, 1.125F, 1.0F, 0.0F, 1.0F);
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
            return fragment;

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
        int i;
        try
        {
            i = fragment.mIndex;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        if (i < 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist = mAvailIndices;
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i = mAvailIndices.size();
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        try
        {
            if (mActive == null)
            {
                mActive = new ArrayList();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        fragment.setIndex(mActive.size(), mParent);
        mActive.add(fragment);
        if (FragmentActivity.a == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment.setIndex(((Integer)mAvailIndices.remove(mAvailIndices.size() - 1)).intValue(), mParent);
        mActive.set(fragment.mIndex, fragment);
        if (!DEBUG) goto _L1; else goto _L3
_L3:
        Log.v(z[182], (new StringBuilder()).append(z[183]).append(fragment).toString());
        return;
        fragment;
        throw fragment;
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment) { }
        throw fragment;
        fragment;
        throw fragment;
    }

    void makeInactive(Fragment fragment)
    {
        int i;
        try
        {
            i = fragment.mIndex;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        if (i < 0)
        {
            return;
        }
        try
        {
            if (DEBUG)
            {
                Log.v(z[186], (new StringBuilder()).append(z[185]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            mActive.set(fragment.mIndex, null);
            if (mAvailIndices == null)
            {
                mAvailIndices = new ArrayList();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        mAvailIndices.add(Integer.valueOf(fragment.mIndex));
        mActivity.invalidateSupportFragment(fragment.mWho);
        fragment.initState();
    }

    void moveToState(int i, int j, int k, boolean flag)
    {
        int j1 = FragmentActivity.a;
        FragmentActivity fragmentactivity = mActivity;
        if (fragmentactivity == null && i != 0)
        {
            try
            {
                throw new IllegalStateException(z[0]);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        break MISSING_BLOCK_LABEL_43;
        IllegalArgumentException illegalargumentexception1;
        illegalargumentexception1;
        throw illegalargumentexception1;
        if (flag) goto _L2; else goto _L1
_L1:
        int l;
        try
        {
            l = mCurState;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (l != i) goto _L2; else goto _L3
_L3:
        return;
_L2:
        mCurState = i;
        if (mActive == null) goto _L3; else goto _L4
_L4:
        boolean flag1;
        int i1;
        i1 = 0;
        flag1 = false;
_L8:
        if (i1 < mActive.size())
        {
            Object obj = (Fragment)mActive.get(i1);
            if (obj != null)
            {
                LoaderManagerImpl loadermanagerimpl;
                try
                {
                    moveToState(((Fragment) (obj)), i, j, k, false);
                    loadermanagerimpl = ((Fragment) (obj)).mLoaderManager;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (loadermanagerimpl != null)
                {
                    flag1 |= ((Fragment) (obj)).mLoaderManager.hasRunningLoaders();
                }
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_232;
            }
        }
        if (!flag1)
        {
            try
            {
                startPendingDeferredFragments();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        flag = mNeedMenuInvalidate;
        if (!flag) goto _L3; else goto _L5
_L5:
        try
        {
            obj = mActivity;
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            try
            {
                throw illegalargumentexception2;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (obj == null) goto _L3; else goto _L6
_L6:
        if (mCurState != 5) goto _L3; else goto _L7
_L7:
        mActivity.supportInvalidateOptionsMenu();
        mNeedMenuInvalidate = false;
        return;
        obj;
        throw obj;
        i1++;
          goto _L8
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
        int l1 = FragmentActivity.a;
        boolean flag1 = fragment.mAdded;
label0:
        {
            if (flag1)
            {
                int l;
                int j1;
                boolean flag2;
                try
                {
                    flag2 = fragment.mDetached;
                }
                // Misplaced declaration of an exception variable
                catch (final Fragment fragment)
                {
                    throw fragment;
                }
                if (!flag2)
                {
                    break label0;
                }
            }
            if (i > 1)
            {
                i = 1;
            }
        }
label1:
        {
            l = i;
            try
            {
                if (!fragment.mRemoving)
                {
                    break label1;
                }
                j1 = fragment.mState;
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            l = i;
            if (i > j1)
            {
                l = fragment.mState;
            }
        }
        flag2 = fragment.mDeferStart;
        i = l;
        if (flag2)
        {
            try
            {
                j1 = fragment.mState;
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            i = l;
            if (j1 < 4)
            {
                i = l;
                if (l > 3)
                {
                    i = 3;
                }
            }
        }
        l = fragment.mState;
        if (l >= i)
        {
            break MISSING_BLOCK_LABEL_1934;
        }
        flag2 = fragment.mFromLayout;
        if (flag2)
        {
            try
            {
                flag2 = fragment.mInLayout;
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            if (!flag2)
            {
                return;
            }
        }
        break MISSING_BLOCK_LABEL_164;
        fragment;
        throw fragment;
        fragment;
        throw fragment;
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment) { }
        throw fragment;
        int i1;
        int k1;
        int i2;
        try
        {
            if (fragment.mAnimatingAway != null)
            {
                fragment.mAnimatingAway = null;
                moveToState(fragment, fragment.mStateAfterAnimating, 0, 0, true);
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        i2 = fragment.mState;
        i1 = i;
        k1 = i;
        i2;
        JVM INSTR tableswitch 0 4: default 236
    //                   0 316
    //                   1 765
    //                   2 1112
    //                   3 1112
    //                   4 1931;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        i1 = i;
_L23:
        i = i1;
        if (l1 == 0) goto _L7; else goto _L6
_L6:
        Object obj;
        Object obj2;
        boolean flag3;
        try
        {
            k1 = fragment.mState;
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            try
            {
                throw fragment;
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment) { }
            try
            {
                throw fragment;
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment) { }
            try
            {
                throw fragment;
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
        }
        i = i1;
        if (k1 <= i1) goto _L7; else goto _L8
_L8:
        i = fragment.mState;
        i;
        JVM INSTR tableswitch 1 5: default 304
    //                   1 1660
    //                   2 1448
    //                   3 1399
    //                   4 1350
    //                   5 1296;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L9:
        i = i1;
_L7:
        fragment.mState = i;
        return;
_L2:
        try
        {
            if (DEBUG)
            {
                Log.v(z[91], (new StringBuilder()).append(z[85]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        obj = fragment.mSavedFragmentState;
        k1 = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        try
        {
            fragment.mSavedFragmentState.setClassLoader(mActivity.getClassLoader());
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(z[94]);
            fragment.mTarget = getFragment(fragment.mSavedFragmentState, z[92]);
            if (fragment.mTarget != null)
            {
                fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt(z[93], 0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean(z[82], true);
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        k1 = i;
        if (fragment.mUserVisibleHint)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        fragment.mDeferStart = true;
        k1 = i;
        if (i > 3)
        {
            k1 = 3;
        }
        fragment.mActivity = mActivity;
        fragment.mParentFragment = mParent;
        if (mParent == null) goto _L16; else goto _L15
_L15:
        obj = mParent.mChildFragmentManager;
_L18:
        try
        {
            fragment.mFragmentManager = ((FragmentManagerImpl) (obj));
            fragment.mCalled = false;
            fragment.onAttach(mActivity);
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[73]).append(fragment).append(z[77]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        break; /* Loop/switch isn't completed */
        fragment;
        throw fragment;
        fragment;
        throw fragment;
        fragment;
        throw fragment;
_L16:
        obj = mActivity.mFragments;
        if (true) goto _L18; else goto _L17
_L17:
        try
        {
            if (fragment.mParentFragment == null)
            {
                mActivity.onAttachFragment(fragment);
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            if (!fragment.mRetaining)
            {
                fragment.performCreate(fragment.mSavedFragmentState);
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        fragment.mRetaining = false;
        flag3 = fragment.mFromLayout;
        i1 = k1;
        if (!flag3) goto _L3; else goto _L19
_L19:
        fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
        obj = fragment.mView;
        if (obj == null) goto _L21; else goto _L20
_L20:
        try
        {
            fragment.mInnerView = fragment.mView;
            fragment.mView = NoSaveStateFrameLayout.wrap(fragment.mView);
            if (fragment.mHidden)
            {
                fragment.mView.setVisibility(8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        i1 = k1;
        if (l1 == 0) goto _L3; else goto _L21
_L21:
        fragment.mInnerView = null;
        i1 = k1;
_L3:
        k1 = i1;
        if (i1 <= 1) goto _L4; else goto _L22
_L22:
label2:
        {
            try
            {
                if (DEBUG)
                {
                    Log.v(z[72], (new StringBuilder()).append(z[86]).append(fragment).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            if (fragment.mFromLayout)
            {
                break MISSING_BLOCK_LABEL_1080;
            }
            obj = null;
            if (fragment.mContainerId == 0)
            {
                break label2;
            }
            obj2 = (ViewGroup)mContainer.findViewById(fragment.mContainerId);
            obj = obj2;
            if (obj2 != null)
            {
                break label2;
            }
            obj = obj2;
            try
            {
                if (fragment.mRestored)
                {
                    break label2;
                }
                throwException(new IllegalArgumentException((new StringBuilder()).append(z[87]).append(Integer.toHexString(fragment.mContainerId)).append(z[74]).append(fragment.getResources().getResourceName(fragment.mContainerId)).append(z[90]).append(fragment).toString()));
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            obj = obj2;
        }
label3:
        {
            try
            {
                fragment.mContainer = ((ViewGroup) (obj));
                fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (obj)), fragment.mSavedFragmentState);
                if (fragment.mView == null)
                {
                    break label3;
                }
                fragment.mInnerView = fragment.mView;
                fragment.mView = NoSaveStateFrameLayout.wrap(fragment.mView);
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            if (obj != null)
            {
                obj2 = loadAnimation(fragment, j, true, k);
                if (obj2 != null)
                {
                    try
                    {
                        fragment.mView.startAnimation(((Animation) (obj2)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (final Fragment fragment)
                    {
                        throw fragment;
                    }
                }
                ((ViewGroup) (obj)).addView(fragment.mView);
            }
            try
            {
                if (fragment.mHidden)
                {
                    fragment.mView.setVisibility(8);
                }
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            try
            {
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_1080;
            }
        }
        fragment.mInnerView = null;
        try
        {
            fragment.performActivityCreated(fragment.mSavedFragmentState);
            if (fragment.mView != null)
            {
                fragment.restoreViewState(fragment.mSavedFragmentState);
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        fragment.mSavedFragmentState = null;
        k1 = i1;
_L4:
        i = k1;
        if (k1 > 3)
        {
            try
            {
                if (DEBUG)
                {
                    Log.v(z[76], (new StringBuilder()).append(z[89]).append(fragment).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            fragment.performStart();
            i = k1;
        }
_L5:
        i1 = i;
        if (i > 4)
        {
            try
            {
                if (DEBUG)
                {
                    Log.v(z[88], (new StringBuilder()).append(z[80]).append(fragment).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            fragment.mResumed = true;
            fragment.performResume();
            fragment.mSavedFragmentState = null;
            fragment.mSavedViewState = null;
            i1 = i;
        }
          goto _L23
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment) { }
        throw fragment;
_L14:
        if (i1 >= 5) goto _L13; else goto _L24
_L24:
        if (DEBUG)
        {
            Log.v(z[70], (new StringBuilder()).append(z[95]).append(fragment).toString());
        }
        fragment.performPause();
        fragment.mResumed = false;
_L13:
        if (i1 < 4)
        {
            Object obj1;
            Object obj3;
            boolean flag4;
            try
            {
                if (DEBUG)
                {
                    Log.v(z[83], (new StringBuilder()).append(z[97]).append(fragment).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            fragment.performStop();
        }
_L12:
        if (i1 < 3)
        {
            try
            {
                if (DEBUG)
                {
                    Log.v(z[75], (new StringBuilder()).append(z[78]).append(fragment).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            fragment.performReallyStop();
        }
_L11:
        if (i1 >= 2) goto _L10; else goto _L25
_L25:
        try
        {
            if (DEBUG)
            {
                Log.v(z[96], (new StringBuilder()).append(z[84]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        obj1 = fragment.mView;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1530;
        }
        flag4 = mActivity.isFinishing();
        if (!flag4)
        {
            try
            {
                if (fragment.mSavedViewState == null)
                {
                    saveFragmentViewState(fragment);
                }
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
        }
label4:
        {
label5:
            {
                try
                {
                    fragment.performDestroyView();
                    if (fragment.mView == null)
                    {
                        break label4;
                    }
                    obj1 = fragment.mContainer;
                }
                // Misplaced declaration of an exception variable
                catch (final Fragment fragment)
                {
                    throw fragment;
                }
                if (obj1 == null)
                {
                    break label4;
                }
                obj3 = null;
                obj1 = obj3;
                try
                {
                    if (mCurState <= 0)
                    {
                        break label5;
                    }
                    flag4 = mDestroyed;
                }
                // Misplaced declaration of an exception variable
                catch (final Fragment fragment)
                {
                    throw fragment;
                }
                obj1 = obj3;
                if (!flag4)
                {
                    obj1 = loadAnimation(fragment, j, false, k);
                }
            }
            if (obj1 != null)
            {
                fragment.mAnimatingAway = fragment.mView;
                fragment.mStateAfterAnimating = i1;
                ((Animation) (obj1)).setAnimationListener(new _cls5());
                fragment.mView.startAnimation(((Animation) (obj1)));
            }
            fragment.mContainer.removeView(fragment.mView);
        }
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mInnerView = null;
_L10:
        i = i1;
        if (i1 >= 1) goto _L7; else goto _L26
_L26:
label6:
        {
            try
            {
                if (!mDestroyed)
                {
                    break label6;
                }
                obj1 = fragment.mAnimatingAway;
            }
            // Misplaced declaration of an exception variable
            catch (final Fragment fragment)
            {
                throw fragment;
            }
            if (obj1 != null)
            {
                obj1 = fragment.mAnimatingAway;
                fragment.mAnimatingAway = null;
                ((View) (obj1)).clearAnimation();
            }
        }
        j = i1;
        if (fragment.mAnimatingAway == null) goto _L28; else goto _L27
_L27:
        fragment.mStateAfterAnimating = i1;
        j = 1;
        i = 1;
        if (l1 == 0) goto _L7; else goto _L28
_L28:
        try
        {
            if (DEBUG)
            {
                Log.v(z[81], (new StringBuilder()).append(z[79]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            if (!fragment.mRetaining)
            {
                fragment.performDestroy();
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            fragment.mCalled = false;
            fragment.onDetach();
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder()).append(z[69]).append(fragment).append(z[71]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        break MISSING_BLOCK_LABEL_1870;
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment) { }
        throw fragment;
        i = j;
        if (flag) goto _L7; else goto _L29
_L29:
        flag = fragment.mRetaining;
        if (flag) goto _L31; else goto _L30
_L30:
        try
        {
            makeInactive(fragment);
        }
        // Misplaced declaration of an exception variable
        catch (final Fragment fragment)
        {
            throw fragment;
        }
        i = j;
        if (l1 == 0) goto _L7; else goto _L31
_L31:
        fragment.mActivity = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        fragment.mChildFragmentManager = null;
        i = j;
          goto _L7
        fragment;
        throw fragment;
        i1 = i;
          goto _L6
    }

    public void noteStateNotSaved()
    {
        mStateSaved = false;
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        int l;
        l = FragmentActivity.a;
        boolean flag;
        try
        {
            flag = z[158].equals(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s1;
        String s2;
        int k;
        s1 = attributeset.getAttributeValue(null, z[168]);
        s = context.obtainStyledAttributes(attributeset, FragmentTag.Fragment);
        if (s1 == null)
        {
            s1 = s.getString(0);
        }
        k = s.getResourceId(1, -1);
        s2 = s.getString(2);
        boolean flag1;
        try
        {
            s.recycle();
            flag1 = Fragment.isSupportFragmentClass(mActivity, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (!flag1) goto _L1; else goto _L3
_L3:
        Object obj;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (-1 == 0 && k == -1 && s2 == null)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(z[160]).append(s1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        int i;
        if (k != -1)
        {
            try
            {
                s = findFragmentById(k);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        } else
        {
            s = null;
        }
        obj = s;
        if (s == null)
        {
            obj = s;
            if (s2 != null)
            {
                obj = findFragmentByTag(s2);
            }
        }
        s = ((String) (obj));
        if (obj == null)
        {
            s = ((String) (obj));
            if (-1 != 0)
            {
                s = findFragmentById(0);
            }
        }
        try
        {
            if (DEBUG)
            {
                Log.v(z[165], (new StringBuilder()).append(z[166]).append(Integer.toHexString(k)).append(z[157]).append(s1).append(z[164]).append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        obj = Fragment.instantiate(context, s1);
        try
        {
            obj.mFromLayout = true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (k != 0)
        {
            i = k;
        } else
        {
            i = 0;
        }
        obj.mFragmentId = i;
        obj.mContainerId = 0;
        obj.mTag = s2;
        obj.mInLayout = true;
        obj.mFragmentManager = this;
        ((Fragment) (obj)).onInflate(mActivity, attributeset, ((Fragment) (obj)).mSavedFragmentState);
        addFragment(((Fragment) (obj)), true);
        s = ((String) (obj));
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_565;
        }
        try
        {
            if (((Fragment) (obj)).mInLayout)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(z[161]).append(Integer.toHexString(k)).append(z[162]).append(s2).append(z[169]).append(Integer.toHexString(0)).append(z[159]).append(s1).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        break MISSING_BLOCK_LABEL_530;
        s;
        throw s;
        int j;
        boolean flag2;
        try
        {
            obj.mInLayout = true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s = ((String) (obj));
        if (((Fragment) (obj)).mRetaining)
        {
            break MISSING_BLOCK_LABEL_565;
        }
        ((Fragment) (obj)).onInflate(mActivity, attributeset, ((Fragment) (obj)).mSavedFragmentState);
        s = ((String) (obj));
        j = mCurState;
        if (j >= 1)
        {
            break MISSING_BLOCK_LABEL_602;
        }
        flag2 = ((Fragment) (s)).mFromLayout;
        if (flag2)
        {
            try
            {
                moveToState(s, 1, 0, 0, false);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_607;
            }
        }
        moveToState(s);
        try
        {
            if (((Fragment) (s)).mView == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(z[167]).append(s1).append(z[163]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        break MISSING_BLOCK_LABEL_672;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
        if (k != 0)
        {
            try
            {
                ((Fragment) (s)).mView.setId(k);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        try
        {
            if (((Fragment) (s)).mView.getTag() == null)
            {
                ((Fragment) (s)).mView.setTag(s2);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return ((Fragment) (s)).mView;
    }

    public void performPendingDeferredStart(Fragment fragment)
    {
        boolean flag = fragment.mDeferStart;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        try
        {
            if (mExecutingActions)
            {
                mHavePendingDeferredStart = true;
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        break MISSING_BLOCK_LABEL_28;
        fragment;
        throw fragment;
        fragment.mDeferStart = false;
        moveToState(fragment, mCurState, 0, 0, false);
    }

    public void popBackStack(final int id, final int flags)
    {
        if (id < 0)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[34]).append(id).toString());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            enqueueAction(new _cls4(), false);
            return;
        }
    }

    public boolean popBackStackImmediate()
    {
        checkStateLoss();
        executePendingTransactions();
        return popBackStackState(mActivity.mHandler, null, -1, 0);
    }

    boolean popBackStackState(Handler handler, String s, int i, int j)
    {
        int j1;
        j1 = FragmentActivity.a;
        try
        {
            handler = mBackStack;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            throw handler;
        }
        if (handler == null)
        {
            return false;
        }
        if (s != null || i >= 0 || (j & 1) != 0) goto _L2; else goto _L1
_L1:
        int k = mBackStack.size() - 1;
        if (k < 0)
        {
            return false;
        }
        handler = (BackStackRecord)mBackStack.remove(k);
        SparseArray sparsearray = new SparseArray();
        SparseArray sparsearray2 = new SparseArray();
        handler.calculateBackFragments(sparsearray, sparsearray2);
        handler.popFromBackStack(true, null, sparsearray, sparsearray2);
        reportBackStackChanged();
        if (j1 == 0) goto _L3; else goto _L2
_L2:
        int l;
        int i1;
        i1 = -1;
        if (s == null && i < 0)
        {
            break MISSING_BLOCK_LABEL_583;
        }
        l = mBackStack.size() - 1;
_L5:
        if (l < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        handler = (BackStackRecord)mBackStack.get(l);
        if (s != null)
        {
            boolean flag;
            try
            {
                flag = s.equals(handler.getName());
            }
            // Misplaced declaration of an exception variable
            catch (Handler handler)
            {
                try
                {
                    throw handler;
                }
                // Misplaced declaration of an exception variable
                catch (Handler handler) { }
                try
                {
                    throw handler;
                }
                // Misplaced declaration of an exception variable
                catch (Handler handler) { }
                try
                {
                    throw handler;
                }
                // Misplaced declaration of an exception variable
                catch (Handler handler) { }
                try
                {
                    throw handler;
                }
                // Misplaced declaration of an exception variable
                catch (Handler handler)
                {
                    throw handler;
                }
            }
            if (flag && j1 == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        i1 = ((BackStackRecord) (handler)).mIndex;
        if (i == i1 && j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l--;
        if (j1 == 0) goto _L5; else goto _L4
_L4:
        if (l < 0)
        {
            return false;
        }
        i1 = l;
        if ((j & 1) == 0)
        {
            break MISSING_BLOCK_LABEL_583;
        }
        l--;
_L21:
        j = l;
        if (l < 0) goto _L7; else goto _L6
_L6:
        handler = (BackStackRecord)mBackStack.get(l);
        if (s == null) goto _L9; else goto _L8
_L8:
        boolean flag1 = s.equals(handler.getName());
        if (flag1) goto _L10; else goto _L9
_L9:
        j = l;
        if (i < 0) goto _L7; else goto _L11
_L11:
        try
        {
            i1 = ((BackStackRecord) (handler)).mIndex;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            throw handler;
        }
        j = l;
        if (i != i1) goto _L7; else goto _L10
_L10:
        j = l - 1;
        if (j1 == 0) goto _L12; else goto _L7
_L7:
        try
        {
            i = mBackStack.size();
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            throw handler;
        }
        if (j == i - 1)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_352;
        handler;
        try
        {
            throw handler;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler) { }
        throw handler;
        SparseArray sparsearray1;
        SparseArray sparsearray3;
        s = new ArrayList();
        i = mBackStack.size() - 1;
        do
        {
            if (i <= j)
            {
                break;
            }
            s.add(mBackStack.remove(i));
            i--;
        } while (j1 == 0);
        j = s.size() - 1;
        sparsearray1 = new SparseArray();
        sparsearray3 = new SparseArray();
        i = 0;
_L20:
        if (i > j) goto _L14; else goto _L13
_L13:
        ((BackStackRecord)s.get(i)).calculateBackFragments(sparsearray1, sparsearray3);
        if (j1 == 0) goto _L15; else goto _L14
_L14:
        i = 0;
        handler = null;
_L19:
        if (i > j) goto _L17; else goto _L16
_L16:
        BackStackRecord backstackrecord;
        boolean flag2;
        try
        {
            if (DEBUG)
            {
                Log.v(z[170], (new StringBuilder()).append(z[171]).append(s.get(i)).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            throw handler;
        }
        try
        {
            backstackrecord = (BackStackRecord)s.get(i);
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            throw handler;
        }
        if (i == j)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        handler = backstackrecord.popFromBackStack(flag2, handler, sparsearray1, sparsearray3);
        if (j1 == 0) goto _L18; else goto _L17
_L17:
        reportBackStackChanged();
_L3:
        return true;
_L18:
        i++;
        if (true) goto _L19; else goto _L15
_L15:
        i++;
        if (true) goto _L20; else goto _L12
_L12:
        l = j;
          goto _L21
        j = i1;
          goto _L7
    }

    public void putFragment(Bundle bundle, String s, Fragment fragment)
    {
        try
        {
            if (fragment.mIndex < 0)
            {
                throwException(new IllegalStateException((new StringBuilder()).append(z[14]).append(fragment).append(z[15]).toString()));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        bundle.putInt(s, fragment.mIndex);
    }

    public void removeFragment(Fragment fragment, int i, int j)
    {
        int k;
        boolean flag;
        try
        {
            if (DEBUG)
            {
                Log.v(z[28], (new StringBuilder()).append(z[27]).append(fragment).append(z[26]).append(fragment.mBackStackNesting).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            flag = fragment.isInBackStack();
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        if (!flag)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        flag = fragment.mDetached;
        if (flag && k == 0)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        try
        {
            if (mAdded != null)
            {
                mAdded.remove(fragment);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        flag = fragment.mHasMenu;
        if (flag)
        {
            try
            {
                if (fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        try
        {
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        if (k != 0)
        {
            k = 0;
        } else
        {
            k = 1;
        }
        moveToState(fragment, k, i, j, false);
        return;
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment) { }
        throw fragment;
        fragment;
        throw fragment;
    }

    void reportBackStackChanged()
    {
        int j = FragmentActivity.a;
        if (mBackStackChangeListeners == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i >= mBackStackChangeListeners.size()) goto _L2; else goto _L3
_L3:
        ((FragmentManager.OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
        if (j == 0) goto _L4; else goto _L2
_L2:
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void restoreAllState(Parcelable parcelable, ArrayList arraylist)
    {
        int j = FragmentActivity.a;
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        parcelable = (FragmentManagerState)parcelable;
        FragmentState afragmentstate[];
        Object obj;
        Object obj1;
        int k;
        int l;
        try
        {
            afragmentstate = ((FragmentManagerState) (parcelable)).mActive;
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
        if (afragmentstate == null) goto _L1; else goto _L3
_L3:
        if (arraylist == null) goto _L5; else goto _L4
_L4:
        i = 0;
_L13:
        if (i < arraylist.size())
        {
            obj = (Fragment)arraylist.get(i);
            try
            {
                if (DEBUG)
                {
                    Log.v(z[50], (new StringBuilder()).append(z[52]).append(obj).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Parcelable parcelable)
            {
                throw parcelable;
            }
            obj1 = ((FragmentManagerState) (parcelable)).mActive[((Fragment) (obj)).mIndex];
            try
            {
                obj1.mInstance = ((Fragment) (obj));
                obj.mSavedViewState = null;
                obj.mBackStackNesting = 0;
                obj.mInLayout = false;
                obj.mAdded = false;
                obj.mTarget = null;
                if (((FragmentState) (obj1)).mSavedFragmentState != null)
                {
                    ((FragmentState) (obj1)).mSavedFragmentState.setClassLoader(mActivity.getClassLoader());
                    obj.mSavedViewState = ((FragmentState) (obj1)).mSavedFragmentState.getSparseParcelableArray(z[56]);
                    obj.mSavedFragmentState = ((FragmentState) (obj1)).mSavedFragmentState;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Parcelable parcelable)
            {
                throw parcelable;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_1032;
            }
        }
_L5:
        try
        {
            mActive = new ArrayList(((FragmentManagerState) (parcelable)).mActive.length);
            if (mAvailIndices != null)
            {
                mAvailIndices.clear();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
        i = 0;
        if (i >= ((FragmentManagerState) (parcelable)).mActive.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((FragmentManagerState) (parcelable)).mActive[i];
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        obj1 = ((FragmentState) (obj)).instantiate(mActivity, mParent);
        try
        {
            if (DEBUG)
            {
                Log.v(z[43], (new StringBuilder()).append(z[54]).append(i).append(z[47]).append(obj1).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
        mActive.add(obj1);
        obj.mInstance = null;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        try
        {
            mActive.add(null);
            if (mAvailIndices == null)
            {
                mAvailIndices = new ArrayList();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
        try
        {
            if (DEBUG)
            {
                Log.v(z[48], (new StringBuilder()).append(z[40]).append(i).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
        mAvailIndices.add(Integer.valueOf(i));
        i++;
        if (j == 0) goto _L7; else goto _L6
_L7:
        break MISSING_BLOCK_LABEL_219;
_L6:
        if (arraylist == null) goto _L9; else goto _L8
_L8:
        i = 0;
_L12:
        if (i >= arraylist.size()) goto _L9; else goto _L10
_L10:
        obj = (Fragment)arraylist.get(i);
        k = ((Fragment) (obj)).mTargetIndex;
        if (k < 0)
        {
            break MISSING_BLOCK_LABEL_556;
        }
        k = ((Fragment) (obj)).mTargetIndex;
        l = mActive.size();
        if (k < l)
        {
            try
            {
                obj.mTarget = (Fragment)mActive.get(((Fragment) (obj)).mTargetIndex);
            }
            // Misplaced declaration of an exception variable
            catch (Parcelable parcelable)
            {
                throw parcelable;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_556;
            }
        }
        Log.w(z[37], (new StringBuilder()).append(z[49]).append(obj).append(z[46]).append(((Fragment) (obj)).mTargetIndex).toString());
        obj.mTarget = null;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_1023;
        }
_L9:
        if (((FragmentManagerState) (parcelable)).mAdded == null)
        {
            break MISSING_BLOCK_LABEL_803;
        }
        mAdded = new ArrayList(((FragmentManagerState) (parcelable)).mAdded.length);
        PrintWriter printwriter;
        for (i = 0; i >= ((FragmentManagerState) (parcelable)).mAdded.length; i++)
        {
            break MISSING_BLOCK_LABEL_798;
        }

        arraylist = (Fragment)mActive.get(((FragmentManagerState) (parcelable)).mAdded[i]);
        if (arraylist == null)
        {
            try
            {
                throwException(new IllegalStateException((new StringBuilder()).append(z[44]).append(((FragmentManagerState) (parcelable)).mAdded[i]).toString()));
            }
            // Misplaced declaration of an exception variable
            catch (Parcelable parcelable)
            {
                throw parcelable;
            }
        }
        try
        {
            arraylist.mAdded = true;
            if (DEBUG)
            {
                Log.v(z[42], (new StringBuilder()).append(z[55]).append(i).append(z[38]).append(arraylist).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
        try
        {
            if (mAdded.contains(arraylist))
            {
                throw new IllegalStateException(z[51]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
        break MISSING_BLOCK_LABEL_784;
        parcelable;
        throw parcelable;
        parcelable;
        try
        {
            throw parcelable;
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable) { }
        throw parcelable;
        mAdded.add(arraylist);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_1014;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_808;
        }
        try
        {
            mAdded = null;
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
        if (((FragmentManagerState) (parcelable)).mBackStack == null)
        {
            break; /* Loop/switch isn't completed */
        }
        mBackStack = new ArrayList(((FragmentManagerState) (parcelable)).mBackStack.length);
        i = 0;
        do
        {
            if (i >= ((FragmentManagerState) (parcelable)).mBackStack.length)
            {
                break;
            }
            arraylist = ((FragmentManagerState) (parcelable)).mBackStack[i].instantiate(this);
            if (DEBUG)
            {
                Log.v(z[53], (new StringBuilder()).append(z[35]).append(i).append(z[36]).append(((BackStackRecord) (arraylist)).mIndex).append(z[41]).append(arraylist).toString());
                printwriter = new PrintWriter(new LogWriter(z[45]));
                arraylist.dump(z[39], printwriter, false);
            }
            try
            {
                mBackStack.add(arraylist);
                if (((BackStackRecord) (arraylist)).mIndex >= 0)
                {
                    setBackStackIndex(((BackStackRecord) (arraylist)).mIndex, arraylist);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Parcelable parcelable)
            {
                throw parcelable;
            }
            i++;
        } while (j == 0);
        if (j == 0) goto _L1; else goto _L11
_L11:
        try
        {
            mBackStack = null;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
        i++;
          goto _L12
        i++;
          goto _L13
    }

    ArrayList retainNonConfig()
    {
        int k = FragmentActivity.a;
        if (mActive == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        obj = null;
        i = 0;
_L10:
        Object obj2 = obj;
        if (i >= mActive.size()) goto _L4; else goto _L3
_L3:
        Fragment fragment;
        fragment = (Fragment)mActive.get(i);
        obj2 = obj;
        if (fragment == null) goto _L6; else goto _L5
_L5:
        int j;
        Object obj1;
        boolean flag;
        try
        {
            flag = fragment.mRetainInstance;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj2 = obj;
        if (!flag) goto _L6; else goto _L7
_L7:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new ArrayList();
        }
        try
        {
            ((ArrayList) (obj1)).add(fragment);
            fragment.mRetaining = true;
            if (fragment.mTarget == null)
            {
                break MISSING_BLOCK_LABEL_177;
            }
            j = fragment.mTarget.mIndex;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
_L9:
        try
        {
            fragment.mTargetIndex = j;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj2 = obj1;
        if (!DEBUG) goto _L6; else goto _L8
_L8:
        Log.v(z[172], (new StringBuilder()).append(z[173]).append(fragment).toString());
        obj2 = obj1;
_L6:
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_186;
        }
_L4:
        return ((ArrayList) (obj2));
        j = -1;
          goto _L9
        i++;
        obj = obj2;
        if (true) goto _L10; else goto _L2
_L2:
        return null;
    }

    Parcelable saveAllState()
    {
        BackStackState abackstackstate[];
        boolean flag;
        int l;
        abackstackstate = null;
        flag = false;
        l = FragmentActivity.a;
        ArrayList arraylist;
        int i;
        try
        {
            execPendingActions();
            if (HONEYCOMB)
            {
                mStateSaved = true;
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        arraylist = mActive;
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        IllegalArgumentException illegalargumentexception1;
        try
        {
            i = mActive.size();
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (i > 0) goto _L3; else goto _L2
_L2:
        return null;
        illegalargumentexception1;
        throw illegalargumentexception1;
_L3:
        FragmentState afragmentstate[];
        int j;
        int k;
        int i1;
        i1 = mActive.size();
        afragmentstate = new FragmentState[i1];
        k = 0;
        j = 0;
_L20:
        if (k >= i1) goto _L5; else goto _L4
_L4:
        Fragment fragment = (Fragment)mActive.get(k);
        if (fragment == null)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        IllegalArgumentException illegalargumentexception3;
        FragmentState fragmentstate;
        Object obj1;
        try
        {
            if (fragment.mIndex < 0)
            {
                throwException(new IllegalStateException((new StringBuilder()).append(z[106]).append(fragment).append(z[113]).append(fragment.mIndex).toString()));
            }
        }
        catch (IllegalArgumentException illegalargumentexception4)
        {
            throw illegalargumentexception4;
        }
        fragmentstate = new FragmentState(fragment);
        afragmentstate[k] = fragmentstate;
        j = fragment.mState;
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        obj1 = fragmentstate.mSavedFragmentState;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        fragmentstate.mSavedFragmentState = saveFragmentBasicState(fragment);
        obj1 = fragment.mTarget;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        IllegalArgumentException illegalargumentexception5;
        try
        {
            if (fragment.mTarget.mIndex < 0)
            {
                throwException(new IllegalStateException((new StringBuilder()).append(z[112]).append(fragment).append(z[100]).append(fragment.mTarget).toString()));
            }
        }
        catch (IllegalArgumentException illegalargumentexception6)
        {
            throw illegalargumentexception6;
        }
        try
        {
            if (fragmentstate.mSavedFragmentState == null)
            {
                fragmentstate.mSavedFragmentState = new Bundle();
            }
        }
        catch (IllegalArgumentException illegalargumentexception7)
        {
            throw illegalargumentexception7;
        }
        putFragment(fragmentstate.mSavedFragmentState, z[116], fragment.mTarget);
        j = fragment.mTargetRequestCode;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        IllegalArgumentException illegalargumentexception8;
        try
        {
            fragmentstate.mSavedFragmentState.putInt(z[103], fragment.mTargetRequestCode);
        }
        catch (IllegalArgumentException illegalargumentexception9)
        {
            throw illegalargumentexception9;
        }
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        fragmentstate.mSavedFragmentState = fragment.mSavedFragmentState;
        try
        {
            if (!DEBUG)
            {
                break MISSING_BLOCK_LABEL_872;
            }
            Log.v(z[109], (new StringBuilder()).append(z[105]).append(fragment).append(z[107]).append(fragmentstate.mSavedFragmentState).toString());
        }
        catch (IllegalArgumentException illegalargumentexception10)
        {
            throw illegalargumentexception10;
        }
        j = 1;
_L21:
        if (l == 0) goto _L6; else goto _L5
_L5:
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        if (!DEBUG) goto _L2; else goto _L7
_L7:
        Log.v(z[111], z[99]);
        return null;
        illegalargumentexception3;
        throw illegalargumentexception3;
        illegalargumentexception5;
        throw illegalargumentexception5;
        illegalargumentexception5;
        throw illegalargumentexception5;
        illegalargumentexception5;
        throw illegalargumentexception5;
        illegalargumentexception8;
        throw illegalargumentexception8;
        Object aobj[];
        if (mAdded == null)
        {
            break MISSING_BLOCK_LABEL_858;
        }
        k = mAdded.size();
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_858;
        }
        aobj = new int[k];
        j = 0;
_L19:
        Object obj = ((Object) (aobj));
        if (j >= k) goto _L9; else goto _L8
_L8:
        FragmentManagerState fragmentmanagerstate;
        try
        {
            aobj[j] = ((Fragment)mAdded.get(j)).mIndex;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (aobj[j] >= 0)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        throwException(new IllegalStateException((new StringBuilder()).append(z[114]).append(mAdded.get(j)).append(z[102]).append(aobj[j]).toString()));
        try
        {
            if (DEBUG)
            {
                Log.v(z[108], (new StringBuilder()).append(z[104]).append(j).append(z[98]).append(mAdded.get(j)).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (l == 0) goto _L11; else goto _L10
_L10:
        obj = ((Object) (aobj));
_L9:
        aobj = abackstackstate;
        if (mBackStack == null) goto _L13; else goto _L12
_L12:
        k = mBackStack.size();
        aobj = abackstackstate;
        if (k <= 0) goto _L13; else goto _L14
_L14:
        abackstackstate = new BackStackState[k];
        j = ((flag) ? 1 : 0);
_L18:
        aobj = abackstackstate;
        if (j >= k) goto _L13; else goto _L15
_L15:
        try
        {
            abackstackstate[j] = new BackStackState(this, (BackStackRecord)mBackStack.get(j));
            if (DEBUG)
            {
                Log.v(z[110], (new StringBuilder()).append(z[115]).append(j).append(z[101]).append(mBackStack.get(j)).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (l == 0) goto _L17; else goto _L16
_L16:
        aobj = abackstackstate;
_L13:
        fragmentmanagerstate = new FragmentManagerState();
        fragmentmanagerstate.mActive = afragmentstate;
        fragmentmanagerstate.mAdded = ((int []) (obj));
        fragmentmanagerstate.mBackStack = ((BackStackState []) (aobj));
        return fragmentmanagerstate;
_L17:
        j++;
        if (true) goto _L18; else goto _L11
_L11:
        j++;
          goto _L19
        obj = null;
          goto _L9
_L6:
        k++;
          goto _L20
        j = 1;
          goto _L21
    }

    Bundle saveFragmentBasicState(Fragment fragment)
    {
        Bundle bundle;
        Bundle bundle1;
        SparseArray sparsearray;
        boolean flag;
        try
        {
            if (mStateBundle == null)
            {
                mStateBundle = new Bundle();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        fragment.performSaveInstanceState(mStateBundle);
        if (!mStateBundle.isEmpty())
        {
            bundle1 = mStateBundle;
            mStateBundle = null;
        } else
        {
            bundle1 = null;
        }
        try
        {
            if (fragment.mView != null)
            {
                saveFragmentViewState(fragment);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            sparsearray = fragment.mSavedViewState;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        bundle = bundle1;
        if (sparsearray != null)
        {
            bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(z[67], fragment.mSavedViewState);
        }
        try
        {
            flag = fragment.mUserVisibleHint;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        bundle1 = bundle;
        if (!flag)
        {
            bundle1 = bundle;
            if (bundle == null)
            {
                bundle1 = new Bundle();
            }
            bundle1.putBoolean(z[68], fragment.mUserVisibleHint);
        }
        return bundle1;
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
    {
        Object obj = null;
        Fragment.SavedState savedstate;
        try
        {
            if (fragment.mIndex < 0)
            {
                throwException(new IllegalStateException((new StringBuilder()).append(z[32]).append(fragment).append(z[33]).toString()));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        savedstate = obj;
        if (fragment.mState > 0)
        {
            fragment = saveFragmentBasicState(fragment);
            savedstate = obj;
            if (fragment != null)
            {
                try
                {
                    savedstate = new Fragment.SavedState(fragment);
                }
                // Misplaced declaration of an exception variable
                catch (Fragment fragment)
                {
                    throw fragment;
                }
            }
        }
        return savedstate;
    }

    void saveFragmentViewState(Fragment fragment)
    {
        View view;
        try
        {
            view = fragment.mInnerView;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        if (view != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SparseArray sparsearray;
        try
        {
            sparsearray = mStateArray;
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
        if (sparsearray != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        mStateArray = new SparseArray();
        if (FragmentActivity.a == 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        mStateArray.clear();
        try
        {
            fragment.mInnerView.saveHierarchyState(mStateArray);
            if (mStateArray.size() > 0)
            {
                fragment.mSavedViewState = mStateArray;
                mStateArray = null;
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void setBackStackIndex(int i, BackStackRecord backstackrecord)
    {
        int l = FragmentActivity.a;
        this;
        JVM INSTR monitorenter ;
        int j;
        if (mBackStackIndices == null)
        {
            mBackStackIndices = new ArrayList();
        }
        j = mBackStackIndices.size();
        int k;
        k = j;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        boolean flag = DEBUG;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        Log.v(z[175], (new StringBuilder()).append(z[181]).append(i).append(z[174]).append(backstackrecord).toString());
        mBackStackIndices.set(i, backstackrecord);
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        k = j;
_L2:
        if (k >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        mBackStackIndices.add(null);
        if (mAvailBackStackIndices == null)
        {
            mAvailBackStackIndices = new ArrayList();
        }
        if (DEBUG)
        {
            Log.v(z[178], (new StringBuilder()).append(z[179]).append(k).toString());
        }
        mAvailBackStackIndices.add(Integer.valueOf(k));
        k++;
        if (l == 0) goto _L2; else goto _L1
_L1:
        if (DEBUG)
        {
            Log.v(z[176], (new StringBuilder()).append(z[177]).append(i).append(z[180]).append(backstackrecord).toString());
        }
        mBackStackIndices.add(backstackrecord);
        this;
        JVM INSTR monitorexit ;
        return;
        backstackrecord;
        try
        {
            throw backstackrecord;
        }
        // Misplaced declaration of an exception variable
        catch (BackStackRecord backstackrecord) { }
        finally { }
        throw backstackrecord;
        this;
        JVM INSTR monitorexit ;
        throw backstackrecord;
        backstackrecord;
        throw backstackrecord;
        backstackrecord;
        throw backstackrecord;
        backstackrecord;
        throw backstackrecord;
        backstackrecord;
        throw backstackrecord;
    }

    public void showFragment(Fragment fragment, int i, int j)
    {
        View view;
        try
        {
            if (DEBUG)
            {
                Log.v(z[2], (new StringBuilder()).append(z[1]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        try
        {
            if (!fragment.mHidden)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            fragment.mHidden = false;
            view = fragment.mView;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw fragment;
        }
        if (view != null)
        {
            Animation animation = loadAnimation(fragment, i, true, j);
            boolean flag;
            if (animation != null)
            {
                try
                {
                    fragment.mView.startAnimation(animation);
                }
                // Misplaced declaration of an exception variable
                catch (Fragment fragment)
                {
                    throw fragment;
                }
            }
            fragment.mView.setVisibility(0);
        }
        flag = fragment.mAdded;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = fragment.mHasMenu;
        if (flag)
        {
            try
            {
                if (fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        fragment.onHiddenChanged(false);
        return;
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment) { }
        throw fragment;
    }

    void startPendingDeferredFragments()
    {
        int j;
        j = FragmentActivity.a;
        ArrayList arraylist;
        try
        {
            arraylist = mActive;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
_L5:
        if (i >= mActive.size()) goto _L1; else goto _L3
_L3:
        Fragment fragment = (Fragment)mActive.get(i);
        if (fragment != null)
        {
            try
            {
                performPendingDeferredStart(fragment);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (j != 0) goto _L1; else goto _L4
_L4:
        i++;
          goto _L5
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        Fragment fragment;
        try
        {
            stringbuilder.append(z[31]);
            stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringbuilder.append(z[29]);
            fragment = mParent;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (fragment == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        DebugUtils.buildShortClassTag(mParent, stringbuilder);
        if (FragmentActivity.a == 0)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        DebugUtils.buildShortClassTag(mActivity, stringbuilder);
        stringbuilder.append(z[30]);
        return stringbuilder.toString();
    }

    static 
    {
        Object obj;
        String as[];
        char c;
        int j;
        boolean flag;
        flag = true;
        as = new String[187];
        obj = "I\001\005\027is\007S\037~~";
        c = '\uFFFF';
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (c)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "t\006J\0010'";
                j = 1;
                c = '\0';
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                j = 2;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\001';
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                j = 3;
                obj = "A\034D\021gb\000QVkk\034@\027n~ND\022nb\n\037V";
                c = '\002';
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                j = 4;
                obj = "f\nAL*";
                c = '\003';
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\004';
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "o\007A\0230'";
                c = '\005';
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\006';
                j = 7;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "'\031L\002b'";
                c = '\007';
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\b';
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                obj = "T\013Q\002ci\t\005\024kd\005\005\005~f\rNVci\n@\016*";
                c = '\t';
                j = 10;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                obj = "'\032JV";
                j = 11;
                c = '\n';
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 12;
                obj = "F\nA\037d`NG\027ilNV\002kd\005\005\037dc\013]V";
                c = '\013';
                break;

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\f';
                break;

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 14;
                obj = "A\034D\021gb\000QV";
                c = '\r';
                break;

            case 13: // '\r'
                as1[j] = ((String) (obj));
                j = 15;
                obj = "'\007VVdh\032\005\025\177u\034@\030~k\027\005\037d'\032M\023*A\034D\021gb\000Q;ki\017B\023x";
                c = '\016';
                break;

            case 14: // '\016'
                as1[j] = ((String) (obj));
                j = 16;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\017';
                break;

            case 15: // '\017'
                as1[j] = ((String) (obj));
                j = 17;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\020';
                break;

            case 16: // '\020'
                as1[j] = ((String) (obj));
                j = 18;
                obj = "F\rQ\037|n\032\\Vys\017Q\0230";
                c = '\021';
                break;

            case 17: // '\021'
                as1[j] = ((String) (obj));
                j = 19;
                obj = "'N";
                c = '\022';
                break;

            case 18: // '\022'
                as1[j] = ((String) (obj));
                j = 20;
                obj = "A\017L\032ocNA\003gw\007K\021*t\032D\002o";
                c = '\023';
                break;

            case 19: // '\023'
                as1[j] = ((String) (obj));
                j = 21;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\024';
                break;

            case 20: // '\024'
                as1[j] = ((String) (obj));
                j = 22;
                obj = "'N";
                c = '\025';
                break;

            case 21: // '\025'
                as1[j] = ((String) (obj));
                j = 23;
                obj = "A\017L\032ocNA\003gw\007K\021*t\032D\002o";
                c = '\026';
                break;

            case 22: // '\026'
                as1[j] = ((String) (obj));
                j = 24;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\027';
                break;

            case 23: // '\027'
                as1[j] = ((String) (obj));
                j = 25;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\030';
                break;

            case 24: // '\030'
                as1[j] = ((String) (obj));
                j = 26;
                obj = "'\000@\005~n\000BK";
                c = '\031';
                break;

            case 25: // '\031'
                as1[j] = ((String) (obj));
                j = 27;
                obj = "u\013H\031|bT\005";
                c = '\032';
                break;

            case 26: // '\032'
                as1[j] = ((String) (obj));
                j = 28;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\033';
                break;

            case 27: // '\033'
                as1[j] = ((String) (obj));
                j = 29;
                obj = "'\007KV";
                c = '\034';
                break;

            case 28: // '\034'
                as1[j] = ((String) (obj));
                j = 30;
                obj = "z\023";
                c = '\035';
                break;

            case 29: // '\035'
                as1[j] = ((String) (obj));
                j = 31;
                obj = "A\034D\021gb\000Q;ki\017B\023x|";
                c = '\036';
                break;

            case 30: // '\036'
                as1[j] = ((String) (obj));
                j = 32;
                obj = "A\034D\021gb\000QV";
                c = '\037';
                break;

            case 31: // '\037'
                as1[j] = ((String) (obj));
                j = 33;
                obj = "'\007VVdh\032\005\025\177u\034@\030~k\027\005\037d'\032M\023*A\034D\021gb\000Q;ki\017B\023x";
                c = ' ';
                break;

            case 32: // ' '
                as1[j] = ((String) (obj));
                j = 34;
                obj = "E\017AVccT\005";
                c = '!';
                break;

            case 33: // '!'
                as1[j] = ((String) (obj));
                j = 35;
                obj = "u\013V\002eu\013d\032fT\032D\002o=NG\027ilNV\002kd\005\005U";
                c = '"';
                break;

            case 34: // '"'
                as1[j] = ((String) (obj));
                j = 36;
                obj = "'FL\030nb\026\005";
                c = '#';
                break;

            case 35: // '#'
                as1[j] = ((String) (obj));
                j = 37;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '$';
                break;

            case 36: // '$'
                as1[j] = ((String) (obj));
                j = 38;
                obj = "=N";
                c = '%';
                break;

            case 37: // '%'
                as1[j] = ((String) (obj));
                j = 39;
                obj = "'N";
                c = '&';
                break;

            case 38: // '&'
                as1[j] = ((String) (obj));
                j = 40;
                obj = "u\013V\002eu\013d\032fT\032D\002o=ND\000kn\002\005U";
                c = '\'';
                break;

            case 39: // '\''
                as1[j] = ((String) (obj));
                j = 41;
                obj = ".T\005";
                c = '(';
                break;

            case 40: // '('
                as1[j] = ((String) (obj));
                j = 42;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = ')';
                break;

            case 41: // ')'
                as1[j] = ((String) (obj));
                j = 43;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '*';
                break;

            case 42: // '*'
                as1[j] = ((String) (obj));
                j = 44;
                obj = "I\001\005\037dt\032D\030~n\017Q\023n'\bW\027mj\013K\002*a\001WVci\n@\016*$";
                c = '+';
                break;

            case 43: // '+'
                as1[j] = ((String) (obj));
                j = 45;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = ',';
                break;

            case 44: // ','
                as1[j] = ((String) (obj));
                j = 46;
                obj = "'\032D\004mb\032\005\030e'\002J\030mb\034\005\023rn\035Q\0050'";
                c = '-';
                break;

            case 45: // '-'
                as1[j] = ((String) (obj));
                j = 47;
                obj = "=N";
                c = '.';
                break;

            case 46: // '.'
                as1[j] = ((String) (obj));
                j = 48;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '/';
                break;

            case 47: // '/'
                as1[j] = ((String) (obj));
                j = 49;
                obj = "U\013\b\027~s\017F\036ci\t\005\004os\017L\030ocNC\004k`\003@\030~'";
                c = '0';
                break;

            case 48: // '0'
                as1[j] = ((String) (obj));
                j = 50;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '1';
                break;

            case 49: // '1'
                as1[j] = ((String) (obj));
                j = 51;
                obj = "F\002W\023kc\027\005\027nc\013AW";
                c = '2';
                break;

            case 50: // '2'
                as1[j] = ((String) (obj));
                j = 52;
                obj = "u\013V\002eu\013d\032fT\032D\002o=NW\023'f\032Q\027io\007K\021*u\013Q\027ci\013AV";
                c = '3';
                break;

            case 51: // '3'
                as1[j] = ((String) (obj));
                j = 53;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '4';
                break;

            case 52: // '4'
                as1[j] = ((String) (obj));
                j = 54;
                obj = "u\013V\002eu\013d\032fT\032D\002o=ND\025~n\030@V)";
                c = '5';
                break;

            case 53: // '5'
                as1[j] = ((String) (obj));
                j = 55;
                obj = "u\013V\002eu\013d\032fT\032D\002o=ND\022nb\n\005U";
                c = '6';
                break;

            case 54: // '6'
                as1[j] = ((String) (obj));
                j = 56;
                obj = "f\000A\004en\n\037\000cb\031z\005~f\032@";
                c = '7';
                break;

            case 55: // '7'
                as1[j] = ((String) (obj));
                j = 57;
                obj = "F\002W\023kc\027\005\027~s\017F\036oc";
                c = '8';
                break;

            case 56: // '8'
                as1[j] = ((String) (obj));
                j = 58;
                obj = "A\034D\021gb\000QVdhNI\031d`\013WVo\177\007V\002y'\bJ\004*l\013\\V";
                c = '9';
                break;

            case 57: // '9'
                as1[j] = ((String) (obj));
                j = 59;
                obj = "A\034D\021gb\000QVdhNI\031d`\013WVo\177\007V\002y'\bJ\004*l\013\\V";
                c = ':';
                break;

            case 58: // ':'
                as1[j] = ((String) (obj));
                j = 60;
                obj = "=NL\030nb\026\005";
                c = ';';
                break;

            case 59: // ';'
                as1[j] = ((String) (obj));
                j = 61;
                obj = "=NL\030nb\026\005";
                c = '<';
                break;

            case 60: // '<'
                as1[j] = ((String) (obj));
                j = 62;
                obj = "A\034D\021gb\000QVkk\034@\027n~ND\022nb\n\037V";
                c = '=';
                break;

            case 61: // '='
                as1[j] = ((String) (obj));
                j = 63;
                obj = "f\nAVlu\001HVks\032D\025b=N";
                c = '>';
                break;

            case 62: // '>'
                as1[j] = ((String) (obj));
                j = 64;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '?';
                break;

            case 63: // '?'
                as1[j] = ((String) (obj));
                j = 65;
                obj = "f\032Q\027ioT\005";
                c = '@';
                break;

            case 64: // '@'
                as1[j] = ((String) (obj));
                j = 66;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'A';
                break;

            case 65: // 'A'
                as1[j] = ((String) (obj));
                j = 67;
                obj = "f\000A\004en\n\037\000cb\031z\005~f\032@";
                c = 'B';
                break;

            case 66: // 'B'
                as1[j] = ((String) (obj));
                j = 68;
                obj = "f\000A\004en\n\037\003yb\034z\000ct\007G\032oX\006L\030~";
                c = 'C';
                break;

            case 67: // 'C'
                as1[j] = ((String) (obj));
                j = 69;
                obj = "A\034D\021gb\000QV";
                c = 'D';
                break;

            case 68: // 'D'
                as1[j] = ((String) (obj));
                j = 70;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'E';
                break;

            case 69: // 'E'
                as1[j] = ((String) (obj));
                j = 71;
                obj = "'\nL\022*i\001QVif\002IV~o\034J\003moNQ\031*t\033U\023x)\001K2os\017F\036\".";
                c = 'F';
                break;

            case 70: // 'F'
                as1[j] = ((String) (obj));
                j = 72;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'G';
                break;

            case 71: // 'G'
                as1[j] = ((String) (obj));
                j = 73;
                obj = "A\034D\021gb\000QV";
                c = 'H';
                break;

            case 72: // 'H'
                as1[j] = ((String) (obj));
                j = 74;
                obj = "'F";
                c = 'I';
                break;

            case 73: // 'I'
                as1[j] = ((String) (obj));
                j = 75;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'J';
                break;

            case 74: // 'J'
                as1[j] = ((String) (obj));
                j = 76;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'K';
                break;

            case 75: // 'K'
                as1[j] = ((String) (obj));
                j = 77;
                obj = "'\nL\022*i\001QVif\002IV~o\034J\003moNQ\031*t\033U\023x)\001K7~s\017F\036\".";
                c = 'L';
                break;

            case 76: // 'L'
                as1[j] = ((String) (obj));
                j = 78;
                obj = "j\001S\023lu\001HVYS!u&OCT\005";
                c = 'M';
                break;

            case 77: // 'M'
                as1[j] = ((String) (obj));
                j = 79;
                obj = "j\001S\023lu\001HVIU+d\"OCT\005";
                c = 'N';
                break;

            case 78: // 'N'
                as1[j] = ((String) (obj));
                j = 80;
                obj = "j\001S\023~hNw3YR#`20'";
                c = 'O';
                break;

            case 79: // 'O'
                as1[j] = ((String) (obj));
                j = 81;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'P';
                break;

            case 80: // 'P'
                as1[j] = ((String) (obj));
                j = 82;
                obj = "f\000A\004en\n\037\003yb\034z\000ct\007G\032oX\006L\030~";
                c = 'Q';
                break;

            case 81: // 'Q'
                as1[j] = ((String) (obj));
                j = 83;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'R';
                break;

            case 82: // 'R'
                as1[j] = ((String) (obj));
                j = 84;
                obj = "j\001S\023lu\001HVKD:l CS7z5XB/q3N=N";
                c = 'S';
                break;

            case 83: // 'S'
                as1[j] = ((String) (obj));
                j = 85;
                obj = "j\001S\023~hNf$OF:`20'";
                c = 'T';
                break;

            case 84: // 'T'
                as1[j] = ((String) (obj));
                j = 86;
                obj = "j\001S\023~hNd5^N8l\"SX-w3KS+aL*";
                c = 'U';
                break;

            case 85: // 'U'
                as1[j] = ((String) (obj));
                j = 87;
                obj = "I\001\005\000cb\031\005\020er\000AVlh\034\005\037n'^]";
                c = 'V';
                break;

            case 86: // 'V'
                as1[j] = ((String) (obj));
                j = 88;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'W';
                break;

            case 87: // 'W'
                as1[j] = ((String) (obj));
                j = 89;
                obj = "j\001S\023~hNv\"KU:`20'";
                c = 'X';
                break;

            case 88: // 'X'
                as1[j] = ((String) (obj));
                j = 90;
                obj = ".NC\031x'\bW\027mj\013K\002*";
                c = 'Y';
                break;

            case 89: // 'Y'
                as1[j] = ((String) (obj));
                j = 91;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'Z';
                break;

            case 90: // 'Z'
                as1[j] = ((String) (obj));
                j = 92;
                obj = "f\000A\004en\n\037\002ku\t@\002Ut\032D\002o";
                c = '[';
                break;

            case 91: // '['
                as1[j] = ((String) (obj));
                j = 93;
                obj = "f\000A\004en\n\037\002ku\t@\002Uu\013T)ys\017Q\023";
                c = '\\';
                break;

            case 92: // '\\'
                as1[j] = ((String) (obj));
                j = 94;
                obj = "f\000A\004en\n\037\000cb\031z\005~f\032@";
                c = ']';
                break;

            case 93: // ']'
                as1[j] = ((String) (obj));
                j = 95;
                obj = "j\001S\023lu\001HVXB=p;OCT\005";
                c = '^';
                break;

            case 94: // '^'
                as1[j] = ((String) (obj));
                j = 96;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '_';
                break;

            case 95: // '_'
                as1[j] = ((String) (obj));
                j = 97;
                obj = "j\001S\023lu\001HVYS/w\"OCT\005";
                c = '`';
                break;

            case 96: // '`'
                as1[j] = ((String) (obj));
                j = 98;
                obj = "=N";
                c = 'a';
                break;

            case 97: // 'a'
                as1[j] = ((String) (obj));
                j = 99;
                obj = "t\017S\023Kk\002v\002ks\013\037VdhNC\004k`\003@\030~tO";
                c = 'b';
                break;

            case 98: // 'b'
                as1[j] = ((String) (obj));
                j = 100;
                obj = "'\006D\005*s\017W\021osNK\031~'\007KVlu\017B\033oi\032\005\033ki\017B\023x=N";
                c = 'c';
                break;

            case 99: // 'c'
                as1[j] = ((String) (obj));
                j = 101;
                obj = "=N";
                c = 'd';
                break;

            case 100: // 'd'
                as1[j] = ((String) (obj));
                j = 102;
                obj = "'\006D\005*d\002@\027xb\n\005\037dc\013]L*";
                c = 'e';
                break;

            case 101: // 'e'
                as1[j] = ((String) (obj));
                j = 103;
                obj = "f\000A\004en\n\037\002ku\t@\002Uu\013T)ys\017Q\023";
                c = 'f';
                break;

            case 102: // 'f'
                as1[j] = ((String) (obj));
                j = 104;
                obj = "t\017S\023Kk\002v\002ks\013\037Vkc\nL\030m'\bW\027mj\013K\002*$";
                c = 'g';
                break;

            case 103: // 'g'
                as1[j] = ((String) (obj));
                j = 105;
                obj = "T\017S\023n'\035Q\027~bNJ\020*";
                c = 'h';
                break;

            case 104: // 'h'
                as1[j] = ((String) (obj));
                j = 106;
                obj = "A\017L\032\177u\013\005\005kq\007K\021*t\032D\002o=ND\025~n\030@V";
                c = 'i';
                break;

            case 105: // 'i'
                as1[j] = ((String) (obj));
                j = 107;
                obj = "=N";
                c = 'j';
                break;

            case 106: // 'j'
                as1[j] = ((String) (obj));
                j = 108;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'k';
                break;

            case 107: // 'k'
                as1[j] = ((String) (obj));
                j = 109;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'l';
                break;

            case 108: // 'l'
                as1[j] = ((String) (obj));
                j = 110;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'm';
                break;

            case 109: // 'm'
                as1[j] = ((String) (obj));
                j = 111;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'n';
                break;

            case 110: // 'n'
                as1[j] = ((String) (obj));
                j = 112;
                obj = "A\017L\032\177u\013\005\005kq\007K\021*t\032D\002o=N";
                c = 'o';
                break;

            case 111: // 'o'
                as1[j] = ((String) (obj));
                j = 113;
                obj = "'\006D\005*d\002@\027xb\n\005\037dc\013]L*";
                c = 'p';
                break;

            case 112: // 'p'
                as1[j] = ((String) (obj));
                j = 114;
                obj = "A\017L\032\177u\013\005\005kq\007K\021*t\032D\002o=ND\025~n\030@V";
                c = 'q';
                break;

            case 113: // 'q'
                as1[j] = ((String) (obj));
                j = 115;
                obj = "t\017S\023Kk\002v\002ks\013\037Vkc\nL\030m'\fD\025a'\035Q\027ilN\006";
                c = 'r';
                break;

            case 114: // 'r'
                as1[j] = ((String) (obj));
                j = 116;
                obj = "f\000A\004en\n\037\002ku\t@\002Ut\032D\002o";
                c = 's';
                break;

            case 115: // 's'
                as1[j] = ((String) (obj));
                j = 117;
                obj = "c\013Q\027ioT\005";
                c = 't';
                break;

            case 116: // 't'
                as1[j] = ((String) (obj));
                j = 118;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'u';
                break;

            case 117: // 'u'
                as1[j] = ((String) (obj));
                j = 119;
                obj = "u\013H\031|bNC\004ejNA\023~f\rML*";
                c = 'v';
                break;

            case 118: // 'v'
                as1[j] = ((String) (obj));
                j = 120;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = 'w';
                break;

            case 119: // 'w'
                as1[j] = ((String) (obj));
                j = 121;
                obj = "D\017KVdh\032\005\006ou\bJ\004g'\032M\037y'\017F\002ch\000\005\037dt\007A\023*h\b\005";
                c = 'x';
                break;

            case 120: // 'x'
                as1[j] = ((String) (obj));
                j = 122;
                obj = "D\017KVdh\032\005\006ou\bJ\004g'\032M\037y'\017F\002ch\000\005\027ls\013WVei=D\000oN\000V\002ki\r@%~f\032@";
                c = 'y';
                break;

            case 121: // 'y'
                as1[j] = ((String) (obj));
                j = 123;
                obj = "'NH7is\007S\037~~S";
                c = 'z';
                break;

            case 122: // 'z'
                as1[j] = ((String) (obj));
                j = 124;
                obj = "F\rQ\037|bNc\004k`\003@\030~tNL\030*";
                c = '{';
                break;

            case 123: // '{'
                as1[j] = ((String) (obj));
                j = 125;
                obj = "'N\006";
                c = '|';
                break;

            case 124: // '|'
                as1[j] = ((String) (obj));
                j = 126;
                obj = "'\003a\023ys\034J\017ocS";
                c = '}';
                break;

            case 125: // '}'
                as1[j] = ((String) (obj));
                j = 127;
                obj = "'N\006";
                c = '~';
                break;

            case 126: // '~'
                as1[j] = ((String) (obj));
                j = 128;
                obj = "F\nA\023n'(W\027mj\013K\002y=";
                c = '\177';
                break;

            case 127: // '\177'
                as1[j] = ((String) (obj));
                j = 129;
                obj = "=N";
                c = '\200';
                break;

            case 128: 
                as1[j] = ((String) (obj));
                j = 130;
                obj = "'NH8eS\034D\030yf\rQ\037ei\035g\023if\033V\0237";
                c = '\201';
                break;

            case 129: 
                as1[j] = ((String) (obj));
                j = 131;
                obj = "'\003v\002ks\013v\027|b\n\030";
                c = '\202';
                break;

            case 130: 
                as1[j] = ((String) (obj));
                j = 132;
                obj = "=N";
                c = '\203';
                break;

            case 131: 
                as1[j] = ((String) (obj));
                j = 133;
                obj = "'NH8ob\nh\023dr'K\000kk\007A\027~bS";
                c = '\204';
                break;

            case 132: 
                as1[j] = ((String) (obj));
                j = 134;
                obj = "'N\006";
                c = '\205';
                break;

            case 133: 
                as1[j] = ((String) (obj));
                j = 135;
                obj = "'NH5ei\032D\037db\034\030";
                c = '\206';
                break;

            case 134: 
                as1[j] = ((String) (obj));
                j = 136;
                obj = "=N";
                c = '\207';
                break;

            case 135: 
                as1[j] = ((String) (obj));
                j = 137;
                obj = "'N\005V";
                c = '\210';
                break;

            case 136: 
                as1[j] = ((String) (obj));
                j = 138;
                obj = "E\017F\035*T\032D\025a''K\022cd\013VL";
                c = '\211';
                break;

            case 137: 
                as1[j] = ((String) (obj));
                j = 139;
                obj = "j/S\027ck,D\025aT\032D\025aN\000A\037ib\035\037V";
                c = '\212';
                break;

            case 138: 
                as1[j] = ((String) (obj));
                j = 140;
                obj = "=N";
                c = '\213';
                break;

            case 139: 
                as1[j] = ((String) (obj));
                j = 141;
                obj = "'N\006";
                c = '\214';
                break;

            case 140: 
                as1[j] = ((String) (obj));
                j = 142;
                obj = "E\017F\035*T\032D\025a=";
                c = '\215';
                break;

            case 141: 
                as1[j] = ((String) (obj));
                j = 143;
                obj = "A\034D\021gb\000Q\005*D\034@\027~b\n\005;oi\033VL";
                c = '\216';
                break;

            case 142: 
                as1[j] = ((String) (obj));
                j = 144;
                obj = "A\034D\021gb\000Q;ki\017B\023x'\003L\005i'\035Q\027~bT";
                c = '\217';
                break;

            case 143: 
                as1[j] = ((String) (obj));
                j = 145;
                obj = "'NH&ku\013K\0027";
                c = '\220';
                break;

            case 144: 
                as1[j] = ((String) (obj));
                j = 146;
                obj = "'NH5\177u=Q\027~bS";
                c = '\221';
                break;

            case 145: 
                as1[j] = ((String) (obj));
                j = 147;
                obj = "'N\006";
                c = '\222';
                break;

            case 146: 
                as1[j] = ((String) (obj));
                j = 148;
                obj = "'NH7|f\007I?dc\007F\023y=N";
                c = '\223';
                break;

            case 147: 
                as1[j] = ((String) (obj));
                j = 149;
                obj = "'N\006";
                c = '\224';
                break;

            case 148: 
                as1[j] = ((String) (obj));
                j = 150;
                obj = "=N";
                c = '\225';
                break;

            case 149: 
                as1[j] = ((String) (obj));
                j = 151;
                obj = "W\013K\022ci\t\0057is\007J\030y=";
                c = '\226';
                break;

            case 150: 
                as1[j] = ((String) (obj));
                j = 152;
                obj = "=N";
                c = '\227';
                break;

            case 151: 
                as1[j] = ((String) (obj));
                j = 153;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\230';
                break;

            case 152: 
                as1[j] = ((String) (obj));
                j = 154;
                obj = "A\034@\023ci\t\005\024kd\005\005\005~f\rNVci\n@\016*";
                c = '\231';
                break;

            case 153: 
                as1[j] = ((String) (obj));
                j = 155;
                obj = "J\033V\002*e\013\005\025kk\002@\022*a\034J\033*j\017L\030*s\006W\023kcNJ\020*w\034J\025ot\035";
                c = '\232';
                break;

            case 154: 
                as1[j] = ((String) (obj));
                j = 156;
                obj = "U\013F\003xt\007S\023*b\000Q\004s'\032JVo\177\013F\003~b>@\030nn\000B\"xf\000V\027is\007J\030y";
                c = '\233';
                break;

            case 155: 
                as1[j] = ((String) (obj));
                j = 157;
                obj = "'\bK\027gbS";
                c = '\234';
                break;

            case 156: 
                as1[j] = ((String) (obj));
                j = 158;
                obj = "a\034D\021gb\000Q";
                c = '\235';
                break;

            case 157: 
                as1[j] = ((String) (obj));
                j = 159;
                obj = "'\031L\002b'\017K\031~o\013WVlu\017B\033oi\032\005\020euN";
                c = '\236';
                break;

            case 158: 
                as1[j] = ((String) (obj));
                j = 160;
                obj = "=Nh\003ysNV\006od\007C\017*r\000L\007\177bND\030nu\001L\0220n\n\tVki\nW\031ccTQ\027m+NJ\004*o\017S\023*fNU\027xb\000QV}n\032MVkiNL\022*a\001WV";
                c = '\237';
                break;

            case 159: 
                as1[j] = ((String) (obj));
                j = 161;
                obj = "=Na\003zk\007F\027~bNL\022*7\026";
                c = '\240';
                break;

            case 160: 
                as1[j] = ((String) (obj));
                j = 162;
                obj = "+NQ\027m'";
                c = '\241';
                break;

            case 161: 
                as1[j] = ((String) (obj));
                j = 163;
                obj = "'\nL\022*i\001QViu\013D\002o'\017\005\000cb\031\013";
                c = '\242';
                break;

            case 162: 
                as1[j] = ((String) (obj));
                j = 164;
                obj = "'\013]\037ys\007K\0217";
                c = '\243';
                break;

            case 163: 
                as1[j] = ((String) (obj));
                j = 165;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\244';
                break;

            case 164: 
                as1[j] = ((String) (obj));
                j = 166;
                obj = "h\000f\004of\032@ cb\031\037VccS\025\016";
                c = '\245';
                break;

            case 165: 
                as1[j] = ((String) (obj));
                j = 167;
                obj = "A\034D\021gb\000QV";
                c = '\246';
                break;

            case 166: 
                as1[j] = ((String) (obj));
                j = 168;
                obj = "d\002D\005y";
                c = '\247';
                break;

            case 167: 
                as1[j] = ((String) (obj));
                j = 169;
                obj = "+NJ\004*w\017W\023dsNL\022*7\026";
                c = '\250';
                break;

            case 168: 
                as1[j] = ((String) (obj));
                j = 170;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\251';
                break;

            case 169: 
                as1[j] = ((String) (obj));
                j = 171;
                obj = "W\001U\006ci\t\005\024kd\005\005\005~f\rNVys\017Q\0230'";
                c = '\252';
                break;

            case 170: 
                as1[j] = ((String) (obj));
                j = 172;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\253';
                break;

            case 171: 
                as1[j] = ((String) (obj));
                j = 173;
                obj = "u\013Q\027ci J\030Ih\000C\037m=NN\023ow\007K\021*u\013Q\027ci\013AV";
                c = '\254';
                break;

            case 172: 
                as1[j] = ((String) (obj));
                j = 174;
                obj = "'\032JV";
                c = '\255';
                break;

            case 173: 
                as1[j] = ((String) (obj));
                j = 175;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\256';
                break;

            case 174: 
                as1[j] = ((String) (obj));
                j = 176;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\257';
                break;

            case 175: 
                as1[j] = ((String) (obj));
                j = 177;
                obj = "F\nA\037d`NG\027ilNV\002kd\005\005\037dc\013]V";
                c = '\260';
                break;

            case 176: 
                as1[j] = ((String) (obj));
                j = 178;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\261';
                break;

            case 177: 
                as1[j] = ((String) (obj));
                j = 179;
                obj = "F\nA\037d`ND\000kn\002D\024fbNG\027ilNV\002kd\005\005\037dc\013]V";
                c = '\262';
                break;

            case 178: 
                as1[j] = ((String) (obj));
                j = 180;
                obj = "'\031L\002b'";
                c = '\263';
                break;

            case 179: 
                as1[j] = ((String) (obj));
                j = 181;
                obj = "T\013Q\002ci\t\005\024kd\005\005\005~f\rNVci\n@\016*";
                c = '\264';
                break;

            case 180: 
                as1[j] = ((String) (obj));
                j = 182;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\265';
                break;

            case 181: 
                as1[j] = ((String) (obj));
                j = 183;
                obj = "F\002I\031if\032@\022*a\034D\021gb\000QVci\n@\016*";
                c = '\266';
                break;

            case 182: 
                as1[j] = ((String) (obj));
                j = 184;
                obj = "F\rQ\037|n\032\\Vbf\035\005\024ob\000\005\022ot\032W\031sb\n";
                c = '\267';
                break;

            case 183: 
                as1[j] = ((String) (obj));
                j = 185;
                obj = "A\034@\023ci\t\005\020xf\tH\023dsNL\030nb\026\005";
                c = '\270';
                break;

            case 184: 
                as1[j] = ((String) (obj));
                j = 186;
                obj = "A\034D\021gb\000Q;ki\017B\023x";
                c = '\271';
                break;

            case 185: 
                as1[j] = ((String) (obj));
                z = as;
                int i;
                byte byte0;
                char c1;
                try
                {
                    DEBUG = false;
                    i = android.os.Build.VERSION.SDK_INT;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                if (i < 11)
                {
                    flag = false;
                }
                HONEYCOMB = flag;
                DECELERATE_QUINT = new DecelerateInterpolator(2.5F);
                DECELERATE_CUBIC = new DecelerateInterpolator(1.5F);
                ACCELERATE_QUINT = new AccelerateInterpolator(2.5F);
                ACCELERATE_CUBIC = new AccelerateInterpolator(1.5F);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 4400
    //                   0 4423
    //                   1 4430
    //                   2 4437
    //                   3 4444;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_4444;
_L3:
        byte0 = 10;
_L9:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L8
_L4:
        byte0 = 7;
          goto _L9
_L5:
        byte0 = 110;
          goto _L9
_L6:
        byte0 = 37;
          goto _L9
        byte0 = 118;
          goto _L9
    }

    private class _cls1
        implements Runnable
    {

        final FragmentManagerImpl this$0;

        public void run()
        {
            execPendingActions();
        }

        _cls1()
        {
            this$0 = FragmentManagerImpl.this;
            super();
        }
    }


    private class _cls5
        implements android.view.animation.Animation.AnimationListener
    {

        final FragmentManagerImpl this$0;
        final Fragment val$fragment;

        public void onAnimationEnd(Animation animation)
        {
            if (fragment.mAnimatingAway != null)
            {
                fragment.mAnimatingAway = null;
                moveToState(fragment, fragment.mStateAfterAnimating, 0, 0, false);
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls5()
        {
            this$0 = FragmentManagerImpl.this;
            fragment = fragment1;
            super();
        }
    }


    private class FragmentTag
    {

        public static final int Fragment[] = {
            0x1010003, 0x10100d0, 0x10100d1
        };

    }


    private class _cls4
        implements Runnable
    {

        final FragmentManagerImpl this$0;
        final int val$flags;
        final int val$id;

        public void run()
        {
            popBackStackState(mActivity.mHandler, null, id, flags);
        }

        _cls4()
        {
            this$0 = FragmentManagerImpl.this;
            id = i;
            flags = j;
            super();
        }
    }

}
