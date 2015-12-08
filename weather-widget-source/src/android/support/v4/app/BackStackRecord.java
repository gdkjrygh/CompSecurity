// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.util.LogWriter;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentTransaction, Fragment, FragmentManagerImpl, FragmentActivity

final class BackStackRecord extends FragmentTransaction
    implements FragmentManager.BackStackEntry, Runnable
{
    static final class Op
    {

        int cmd;
        int enterAnim;
        int exitAnim;
        Fragment fragment;
        Op next;
        int popEnterAnim;
        int popExitAnim;
        Op prev;
        ArrayList removed;

        Op()
        {
        }
    }


    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SHOW = 5;
    static final String TAG = "FragmentManager";
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    int mEnterAnim;
    int mExitAnim;
    Op mHead;
    int mIndex;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    int mPopEnterAnim;
    int mPopExitAnim;
    Op mTail;
    int mTransition;
    int mTransitionStyle;

    public BackStackRecord(FragmentManagerImpl fragmentmanagerimpl)
    {
        mAllowAddToBackStack = true;
        mIndex = -1;
        mManager = fragmentmanagerimpl;
    }

    private void doAddOp(int i, Fragment fragment, String s, int j)
    {
        fragment.mFragmentManager = mManager;
        if (s != null)
        {
            if (fragment.mTag != null && !s.equals(fragment.mTag))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(fragment).append(": was ").append(fragment.mTag).append(" now ").append(s).toString());
            }
            fragment.mTag = s;
        }
        if (i != 0)
        {
            if (fragment.mFragmentId != 0 && fragment.mFragmentId != i)
            {
                throw new IllegalStateException((new StringBuilder("Can't change container ID of fragment ")).append(fragment).append(": was ").append(fragment.mFragmentId).append(" now ").append(i).toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        s = new Op();
        s.cmd = j;
        s.fragment = fragment;
        addOp(s);
    }

    public FragmentTransaction add(int i, Fragment fragment)
    {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    public FragmentTransaction add(int i, Fragment fragment, String s)
    {
        doAddOp(i, fragment, s, 1);
        return this;
    }

    public FragmentTransaction add(Fragment fragment, String s)
    {
        doAddOp(0, fragment, s, 1);
        return this;
    }

    void addOp(Op op)
    {
        if (mHead == null)
        {
            mTail = op;
            mHead = op;
        } else
        {
            op.prev = mTail;
            mTail.next = op;
            mTail = op;
        }
        op.enterAnim = mEnterAnim;
        op.exitAnim = mExitAnim;
        op.popEnterAnim = mPopEnterAnim;
        op.popExitAnim = mPopExitAnim;
        mNumOp = mNumOp + 1;
    }

    public FragmentTransaction addToBackStack(String s)
    {
        if (!mAllowAddToBackStack)
        {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        } else
        {
            mAddToBackStack = true;
            mName = s;
            return this;
        }
    }

    public FragmentTransaction attach(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 7;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    void bumpBackStackNesting(int i)
    {
        if (mAddToBackStack) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Op op;
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Bump nesting in ")).append(this).append(" by ").append(i).toString());
        }
        op = mHead;
_L6:
        if (op == null) goto _L1; else goto _L3
_L3:
        if (op.fragment != null)
        {
            Fragment fragment = op.fragment;
            fragment.mBackStackNesting = fragment.mBackStackNesting + i;
            if (FragmentManagerImpl.DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(op.fragment).append(" to ").append(op.fragment.mBackStackNesting).toString());
            }
        }
        if (op.removed == null) goto _L5; else goto _L4
_L4:
        int j = op.removed.size() - 1;
_L7:
        if (j >= 0)
        {
            break MISSING_BLOCK_LABEL_153;
        }
_L5:
        op = op.next;
          goto _L6
        Fragment fragment1 = (Fragment)op.removed.get(j);
        fragment1.mBackStackNesting = fragment1.mBackStackNesting + i;
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.mBackStackNesting).toString());
        }
        j--;
          goto _L7
    }

    public int commit()
    {
        return commitInternal(false);
    }

    public int commitAllowingStateLoss()
    {
        return commitInternal(true);
    }

    int commitInternal(boolean flag)
    {
        if (mCommitted)
        {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Commit: ")).append(this).toString());
            dump("  ", null, new PrintWriter(new LogWriter("FragmentManager")), null);
        }
        mCommitted = true;
        if (mAddToBackStack)
        {
            mIndex = mManager.allocBackStackIndex(this);
        } else
        {
            mIndex = -1;
        }
        mManager.enqueueAction(this, flag);
        return mIndex;
    }

    public FragmentTransaction detach(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 6;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public FragmentTransaction disallowAddToBackStack()
    {
        if (mAddToBackStack)
        {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        } else
        {
            mAllowAddToBackStack = false;
            return this;
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        dump(s, printwriter, true);
    }

    public void dump(String s, PrintWriter printwriter, boolean flag)
    {
        if (flag)
        {
            printwriter.print(s);
            printwriter.print("mName=");
            printwriter.print(mName);
            printwriter.print(" mIndex=");
            printwriter.print(mIndex);
            printwriter.print(" mCommitted=");
            printwriter.println(mCommitted);
            if (mTransition != 0)
            {
                printwriter.print(s);
                printwriter.print("mTransition=#");
                printwriter.print(Integer.toHexString(mTransition));
                printwriter.print(" mTransitionStyle=#");
                printwriter.println(Integer.toHexString(mTransitionStyle));
            }
            if (mEnterAnim != 0 || mExitAnim != 0)
            {
                printwriter.print(s);
                printwriter.print("mEnterAnim=#");
                printwriter.print(Integer.toHexString(mEnterAnim));
                printwriter.print(" mExitAnim=#");
                printwriter.println(Integer.toHexString(mExitAnim));
            }
            if (mPopEnterAnim != 0 || mPopExitAnim != 0)
            {
                printwriter.print(s);
                printwriter.print("mPopEnterAnim=#");
                printwriter.print(Integer.toHexString(mPopEnterAnim));
                printwriter.print(" mPopExitAnim=#");
                printwriter.println(Integer.toHexString(mPopExitAnim));
            }
            if (mBreadCrumbTitleRes != 0 || mBreadCrumbTitleText != null)
            {
                printwriter.print(s);
                printwriter.print("mBreadCrumbTitleRes=#");
                printwriter.print(Integer.toHexString(mBreadCrumbTitleRes));
                printwriter.print(" mBreadCrumbTitleText=");
                printwriter.println(mBreadCrumbTitleText);
            }
            if (mBreadCrumbShortTitleRes != 0 || mBreadCrumbShortTitleText != null)
            {
                printwriter.print(s);
                printwriter.print("mBreadCrumbShortTitleRes=#");
                printwriter.print(Integer.toHexString(mBreadCrumbShortTitleRes));
                printwriter.print(" mBreadCrumbShortTitleText=");
                printwriter.println(mBreadCrumbShortTitleText);
            }
        }
        if (mHead == null) goto _L2; else goto _L1
_L1:
        Op op;
        String s2;
        int i;
        printwriter.print(s);
        printwriter.println("Operations:");
        s2 = (new StringBuilder(String.valueOf(s))).append("    ").toString();
        op = mHead;
        i = 0;
_L15:
        if (op != null) goto _L3; else goto _L2
_L2:
        return;
_L3:
        op.cmd;
        JVM INSTR tableswitch 0 7: default 424
    //                   0 667
    //                   1 675
    //                   2 683
    //                   3 691
    //                   4 699
    //                   5 707
    //                   6 715
    //                   7 723;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L4:
        String s1 = (new StringBuilder("cmd=")).append(op.cmd).toString();
_L16:
        printwriter.print(s);
        printwriter.print("  Op #");
        printwriter.print(i);
        printwriter.print(": ");
        printwriter.print(s1);
        printwriter.print(" ");
        printwriter.println(op.fragment);
        if (flag)
        {
            if (op.enterAnim != 0 || op.exitAnim != 0)
            {
                printwriter.print(s);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(op.enterAnim));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(op.exitAnim));
            }
            if (op.popEnterAnim != 0 || op.popExitAnim != 0)
            {
                printwriter.print(s);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(op.popEnterAnim));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(op.popExitAnim));
            }
        }
        if (op.removed == null || op.removed.size() <= 0) goto _L14; else goto _L13
_L13:
        int j = 0;
_L17:
        if (j < op.removed.size())
        {
            break MISSING_BLOCK_LABEL_731;
        }
_L14:
        op = op.next;
        i++;
          goto _L15
_L5:
        s1 = "NULL";
          goto _L16
_L6:
        s1 = "ADD";
          goto _L16
_L7:
        s1 = "REPLACE";
          goto _L16
_L8:
        s1 = "REMOVE";
          goto _L16
_L9:
        s1 = "HIDE";
          goto _L16
_L10:
        s1 = "SHOW";
          goto _L16
_L11:
        s1 = "DETACH";
          goto _L16
_L12:
        s1 = "ATTACH";
          goto _L16
        printwriter.print(s2);
        if (op.removed.size() == 1)
        {
            printwriter.print("Removed: ");
        } else
        {
            if (j == 0)
            {
                printwriter.println("Removed:");
            }
            printwriter.print(s2);
            printwriter.print("  #");
            printwriter.print(j);
            printwriter.print(": ");
        }
        printwriter.println(op.removed.get(j));
        j++;
          goto _L17
    }

    public CharSequence getBreadCrumbShortTitle()
    {
        if (mBreadCrumbShortTitleRes != 0)
        {
            return mManager.mActivity.getText(mBreadCrumbShortTitleRes);
        } else
        {
            return mBreadCrumbShortTitleText;
        }
    }

    public int getBreadCrumbShortTitleRes()
    {
        return mBreadCrumbShortTitleRes;
    }

    public CharSequence getBreadCrumbTitle()
    {
        if (mBreadCrumbTitleRes != 0)
        {
            return mManager.mActivity.getText(mBreadCrumbTitleRes);
        } else
        {
            return mBreadCrumbTitleText;
        }
    }

    public int getBreadCrumbTitleRes()
    {
        return mBreadCrumbTitleRes;
    }

    public int getId()
    {
        return mIndex;
    }

    public String getName()
    {
        return mName;
    }

    public int getTransition()
    {
        return mTransition;
    }

    public int getTransitionStyle()
    {
        return mTransitionStyle;
    }

    public FragmentTransaction hide(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 4;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public boolean isAddToBackStackAllowed()
    {
        return mAllowAddToBackStack;
    }

    public boolean isEmpty()
    {
        return mNumOp == 0;
    }

    public void popFromBackStack(boolean flag)
    {
        Op op;
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("popFromBackStack: ")).append(this).toString());
            dump("  ", null, new PrintWriter(new LogWriter("FragmentManager")), null);
        }
        bumpBackStackNesting(-1);
        op = mTail;
_L10:
        if (op == null)
        {
            if (flag)
            {
                mManager.moveToState(mManager.mCurState, FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle, true);
            }
            if (mIndex >= 0)
            {
                mManager.freeBackStackIndex(mIndex);
                mIndex = -1;
            }
            return;
        }
        op.cmd;
        JVM INSTR tableswitch 1 7: default 168
    //                   1 196
    //                   2 236
    //                   3 333
    //                   4 358
    //                   5 393
    //                   6 428
    //                   7 463;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_463;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(op.cmd).toString());
_L2:
        Fragment fragment = op.fragment;
        fragment.mNextAnim = op.popExitAnim;
        mManager.removeFragment(fragment, FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle);
_L11:
        op = op.prev;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1 = op.fragment;
        if (fragment1 != null)
        {
            fragment1.mNextAnim = op.popExitAnim;
            mManager.removeFragment(fragment1, FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle);
        }
        if (op.removed != null)
        {
            int i = 0;
            while (i < op.removed.size()) 
            {
                Fragment fragment2 = (Fragment)op.removed.get(i);
                fragment2.mNextAnim = op.popEnterAnim;
                mManager.addFragment(fragment2, false);
                i++;
            }
        }
          goto _L11
_L4:
        Fragment fragment3 = op.fragment;
        fragment3.mNextAnim = op.popEnterAnim;
        mManager.addFragment(fragment3, false);
          goto _L11
_L5:
        Fragment fragment4 = op.fragment;
        fragment4.mNextAnim = op.popEnterAnim;
        mManager.showFragment(fragment4, FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle);
          goto _L11
_L6:
        Fragment fragment5 = op.fragment;
        fragment5.mNextAnim = op.popExitAnim;
        mManager.hideFragment(fragment5, FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle);
          goto _L11
_L7:
        Fragment fragment6 = op.fragment;
        fragment6.mNextAnim = op.popEnterAnim;
        mManager.attachFragment(fragment6, FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle);
          goto _L11
        Fragment fragment7 = op.fragment;
        fragment7.mNextAnim = op.popEnterAnim;
        mManager.detachFragment(fragment7, FragmentManagerImpl.reverseTransit(mTransition), mTransitionStyle);
          goto _L11
    }

    public FragmentTransaction remove(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 3;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment)
    {
        return replace(i, fragment, null);
    }

    public FragmentTransaction replace(int i, Fragment fragment, String s)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            doAddOp(i, fragment, s, 2);
            return this;
        }
    }

    public void run()
    {
        Op op;
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Run: ")).append(this).toString());
        }
        if (mAddToBackStack && mIndex < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        bumpBackStackNesting(1);
        op = mHead;
_L10:
        if (op == null)
        {
            mManager.moveToState(mManager.mCurState, mTransition, mTransitionStyle, true);
            if (mAddToBackStack)
            {
                mManager.addBackStackState(this);
            }
            return;
        }
        op.cmd;
        JVM INSTR tableswitch 1 7: default 152
    //                   1 180
    //                   2 210
    //                   3 490
    //                   4 522
    //                   5 554
    //                   6 586
    //                   7 618;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_618;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(op.cmd).toString());
_L2:
        Fragment fragment = op.fragment;
        fragment.mNextAnim = op.enterAnim;
        mManager.addFragment(fragment, false);
_L13:
        op = op.next;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1;
        Fragment fragment7;
        fragment1 = op.fragment;
        fragment7 = fragment1;
        if (mManager.mAdded == null) goto _L12; else goto _L11
_L11:
        int i = 0;
_L14:
        if (i < mManager.mAdded.size())
        {
            break MISSING_BLOCK_LABEL_271;
        }
        fragment7 = fragment1;
_L12:
        if (fragment7 != null)
        {
            fragment7.mNextAnim = op.enterAnim;
            mManager.addFragment(fragment7, false);
        }
          goto _L13
label0:
        {
            Fragment fragment9 = (Fragment)mManager.mAdded.get(i);
            if (FragmentManagerImpl.DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder("OP_REPLACE: adding=")).append(fragment1).append(" old=").append(fragment9).toString());
            }
            Fragment fragment8;
            if (fragment1 != null)
            {
                fragment8 = fragment1;
                if (fragment9.mContainerId != fragment1.mContainerId)
                {
                    break label0;
                }
            }
            if (fragment9 == fragment1)
            {
                fragment8 = null;
                op.fragment = null;
            } else
            {
                if (op.removed == null)
                {
                    op.removed = new ArrayList();
                }
                op.removed.add(fragment9);
                fragment9.mNextAnim = op.exitAnim;
                if (mAddToBackStack)
                {
                    fragment9.mBackStackNesting = fragment9.mBackStackNesting + 1;
                    if (FragmentManagerImpl.DEBUG)
                    {
                        Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment9).append(" to ").append(fragment9.mBackStackNesting).toString());
                    }
                }
                mManager.removeFragment(fragment9, mTransition, mTransitionStyle);
                fragment8 = fragment1;
            }
        }
        i++;
        fragment1 = fragment8;
          goto _L14
_L4:
        Fragment fragment2 = op.fragment;
        fragment2.mNextAnim = op.exitAnim;
        mManager.removeFragment(fragment2, mTransition, mTransitionStyle);
          goto _L13
_L5:
        Fragment fragment3 = op.fragment;
        fragment3.mNextAnim = op.exitAnim;
        mManager.hideFragment(fragment3, mTransition, mTransitionStyle);
          goto _L13
_L6:
        Fragment fragment4 = op.fragment;
        fragment4.mNextAnim = op.enterAnim;
        mManager.showFragment(fragment4, mTransition, mTransitionStyle);
          goto _L13
_L7:
        Fragment fragment5 = op.fragment;
        fragment5.mNextAnim = op.exitAnim;
        mManager.detachFragment(fragment5, mTransition, mTransitionStyle);
          goto _L13
        Fragment fragment6 = op.fragment;
        fragment6.mNextAnim = op.enterAnim;
        mManager.attachFragment(fragment6, mTransition, mTransitionStyle);
          goto _L13
    }

    public FragmentTransaction setBreadCrumbShortTitle(int i)
    {
        mBreadCrumbShortTitleRes = i;
        mBreadCrumbShortTitleText = null;
        return this;
    }

    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charsequence)
    {
        mBreadCrumbShortTitleRes = 0;
        mBreadCrumbShortTitleText = charsequence;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(int i)
    {
        mBreadCrumbTitleRes = i;
        mBreadCrumbTitleText = null;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(CharSequence charsequence)
    {
        mBreadCrumbTitleRes = 0;
        mBreadCrumbTitleText = charsequence;
        return this;
    }

    public FragmentTransaction setCustomAnimations(int i, int j)
    {
        return setCustomAnimations(i, j, 0, 0);
    }

    public FragmentTransaction setCustomAnimations(int i, int j, int k, int l)
    {
        mEnterAnim = i;
        mExitAnim = j;
        mPopEnterAnim = k;
        mPopExitAnim = l;
        return this;
    }

    public FragmentTransaction setTransition(int i)
    {
        mTransition = i;
        return this;
    }

    public FragmentTransaction setTransitionStyle(int i)
    {
        mTransitionStyle = i;
        return this;
    }

    public FragmentTransaction show(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 5;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("BackStackEntry{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (mIndex >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(mIndex);
        }
        if (mName != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(mName);
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
