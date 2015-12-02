// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.LogWriter;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentTransaction, FragmentActivity, FragmentManagerImpl, FragmentContainer, 
//            Fragment, SharedElementCallback, FragmentTransitionCompat21

final class BackStackRecord extends FragmentTransaction
    implements FragmentManager.BackStackEntry, Runnable
{

    private static final String z[];
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
    ArrayList mSharedElementSourceNames;
    ArrayList mSharedElementTargetNames;
    Op mTail;
    int mTransition;
    int mTransitionStyle;

    public BackStackRecord(FragmentManagerImpl fragmentmanagerimpl)
    {
        mAllowAddToBackStack = true;
        mIndex = -1;
        mManager = fragmentmanagerimpl;
    }

    private TransitionState beginTransition(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        TransitionState transitionstate;
        boolean flag1;
        int i;
        boolean flag2;
        int k;
        flag2 = false;
        k = FragmentActivity.a;
        transitionstate = new TransitionState();
        transitionstate.nonExistentView = new View(mManager.mActivity);
        i = 0;
        flag1 = false;
_L2:
        if (i < sparsearray.size())
        {
            if (configureTransitions(sparsearray.keyAt(i), transitionstate, flag, sparsearray, sparsearray1))
            {
                flag1 = true;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_164;
            }
        }
        i = ((flag2) ? 1 : 0);
label0:
        do
        {
label1:
            {
                if (i >= sparsearray1.size())
                {
                    break label0;
                }
                int j = sparsearray1.keyAt(i);
                boolean flag3;
                try
                {
                    if (sparsearray.get(j) != null)
                    {
                        break label1;
                    }
                    flag3 = configureTransitions(j, transitionstate, flag, sparsearray, sparsearray1);
                }
                // Misplaced declaration of an exception variable
                catch (SparseArray sparsearray)
                {
                    throw sparsearray;
                }
                if (flag3)
                {
                    flag1 = true;
                }
            }
            i++;
        } while (k == 0);
        sparsearray = transitionstate;
        if (!flag1)
        {
            sparsearray = null;
        }
        return sparsearray;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void calculateFragments(SparseArray sparsearray, SparseArray sparsearray1)
    {
        int j;
        j = FragmentActivity.a;
        boolean flag;
        try
        {
            flag = mManager.mContainer.hasView();
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray)
        {
            throw sparsearray;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Op op = mHead;
_L11:
        Fragment fragment;
        Fragment fragment1;
        Fragment fragment2;
        int i;
        if (op == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int k;
        int l;
        try
        {
            i = op.cmd;
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray)
        {
            throw sparsearray;
        }
        i;
        JVM INSTR tableswitch 1 7: default 92
    //                   1 107
    //                   2 122
    //                   3 229
    //                   4 243
    //                   5 257
    //                   6 272
    //                   7 286;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
        op = op.next;
        if (j != 0) goto _L1; else goto _L11
_L4:
        setLastIn(sparsearray1, op.fragment);
        if (j == 0) goto _L3; else goto _L5
_L5:
        fragment = op.fragment;
        if (mManager.mAdded == null) goto _L13; else goto _L12
_L12:
        i = 0;
_L20:
        fragment1 = fragment;
        if (i >= mManager.mAdded.size()) goto _L15; else goto _L14
_L14:
        fragment2 = (Fragment)mManager.mAdded.get(i);
        if (fragment == null) goto _L17; else goto _L16
_L16:
        try
        {
            k = fragment2.mContainerId;
            l = fragment.mContainerId;
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray)
        {
            throw sparsearray;
        }
        fragment1 = fragment;
        if (k != l) goto _L18; else goto _L17
_L17:
        if (fragment2 == fragment)
        {
            fragment1 = null;
        } else
        {
            setFirstOut(sparsearray, fragment2);
            fragment1 = fragment;
        }
_L18:
        if (j == 0) goto _L19; else goto _L15
_L15:
        setLastIn(sparsearray1, fragment1);
        if (j == 0) goto _L3; else goto _L6
_L6:
        setFirstOut(sparsearray, op.fragment);
        if (j == 0) goto _L3; else goto _L7
_L7:
        setFirstOut(sparsearray, op.fragment);
        if (j == 0) goto _L3; else goto _L8
_L8:
        setLastIn(sparsearray1, op.fragment);
        if (j == 0) goto _L3; else goto _L9
_L9:
        try
        {
            setFirstOut(sparsearray, op.fragment);
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray)
        {
            throw sparsearray;
        }
        if (j == 0) goto _L3; else goto _L10
_L10:
        setLastIn(sparsearray1, op.fragment);
          goto _L3
        sparsearray;
        try
        {
            throw sparsearray;
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray) { }
        try
        {
            throw sparsearray;
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray) { }
        try
        {
            throw sparsearray;
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray) { }
        throw sparsearray;
_L19:
        i++;
        fragment = fragment1;
          goto _L20
_L13:
        fragment1 = fragment;
          goto _L15
    }

    private void callSharedElementEnd(TransitionState transitionstate, Fragment fragment, Fragment fragment1, boolean flag, ArrayMap arraymap)
    {
        if (flag)
        {
            try
            {
                transitionstate = fragment1.mEnterTransitionCallback;
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
        } else
        {
            transitionstate = fragment.mEnterTransitionCallback;
        }
        if (transitionstate != null)
        {
            transitionstate.onSharedElementEnd(new ArrayList(arraymap.keySet()), new ArrayList(arraymap.values()), null);
        }
    }

    private static Object captureExitingViews(Object obj, Fragment fragment, ArrayList arraylist, ArrayMap arraymap)
    {
        Object obj1 = obj;
        if (obj != null)
        {
            obj1 = FragmentTransitionCompat21.captureExitingViews(obj, fragment.getView(), arraylist, arraymap);
        }
        return obj1;
    }

    private boolean configureTransitions(int i, TransitionState transitionstate, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        final Object inFragment;
        ViewGroup viewgroup = (ViewGroup)mManager.mContainer.findViewById(i);
        if (viewgroup == null)
        {
            return false;
        }
        inFragment = (Fragment)sparsearray1.get(i);
        Object obj3 = (Fragment)sparsearray.get(i);
        Object obj1 = getEnterTransition(((Fragment) (inFragment)), flag);
        Object obj2 = getSharedElementTransition(((Fragment) (inFragment)), ((Fragment) (obj3)), flag);
        Object obj4 = getExitTransition(((Fragment) (obj3)), flag);
        if (obj1 == null && obj2 == null && obj4 == null)
        {
            return false;
        }
        sparsearray = null;
        ArrayList arraylist = new ArrayList();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        Object obj = remapSharedElements(transitionstate, ((Fragment) (obj3)), flag);
        boolean flag1;
        try
        {
            flag1 = ((ArrayMap) (obj)).isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            try
            {
                throw transitionstate;
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        arraylist.add(transitionstate.nonExistentView);
        if (FragmentActivity.a == 0)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        arraylist.addAll(((ArrayMap) (obj)).values());
        if (flag)
        {
            try
            {
                sparsearray1 = ((Fragment) (obj3)).mEnterTransitionCallback;
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
        } else
        {
            sparsearray1 = ((Fragment) (inFragment)).mEnterTransitionCallback;
        }
        sparsearray = ((SparseArray) (obj));
        if (sparsearray1 != null)
        {
            sparsearray1.onSharedElementStart(new ArrayList(((ArrayMap) (obj)).keySet()), new ArrayList(((ArrayMap) (obj)).values()), null);
            sparsearray = ((SparseArray) (obj));
        }
        sparsearray1 = new ArrayList();
        obj = captureExitingViews(obj4, ((Fragment) (obj3)), sparsearray1, sparsearray);
        try
        {
            obj4 = mSharedElementTargetNames;
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        if (obj4 != null && sparsearray != null)
        {
            sparsearray = (View)sparsearray.get(mSharedElementTargetNames.get(0));
            if (sparsearray != null)
            {
                if (obj != null)
                {
                    try
                    {
                        FragmentTransitionCompat21.setEpicenter(obj, sparsearray);
                    }
                    // Misplaced declaration of an exception variable
                    catch (TransitionState transitionstate)
                    {
                        throw transitionstate;
                    }
                }
                if (obj2 != null)
                {
                    try
                    {
                        FragmentTransitionCompat21.setEpicenter(obj2, sparsearray);
                    }
                    // Misplaced declaration of an exception variable
                    catch (TransitionState transitionstate)
                    {
                        throw transitionstate;
                    }
                }
            }
        }
        sparsearray = new _cls1();
        if (obj2 != null)
        {
            try
            {
                prepareSharedElementTransition(transitionstate, viewgroup, obj2, ((Fragment) (inFragment)), ((Fragment) (obj3)), flag, arraylist);
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
        }
        obj3 = new ArrayList();
        obj4 = new ArrayMap();
        if (flag)
        {
            try
            {
                flag = ((Fragment) (inFragment)).getAllowReturnTransitionOverlap();
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
        } else
        {
            flag = ((Fragment) (inFragment)).getAllowEnterTransitionOverlap();
        }
        inFragment = FragmentTransitionCompat21.mergeTransitions(obj1, obj, obj2, flag);
        if (inFragment != null)
        {
            try
            {
                FragmentTransitionCompat21.addTransitionTargets(obj1, obj2, viewgroup, sparsearray, transitionstate.nonExistentView, transitionstate.enteringEpicenterView, transitionstate.nameOverrides, ((ArrayList) (obj3)), ((java.util.Map) (obj4)), arraylist);
                excludeHiddenFragmentsAfterEnter(viewgroup, transitionstate, i, inFragment);
                FragmentTransitionCompat21.excludeTarget(inFragment, transitionstate.nonExistentView, true);
                excludeHiddenFragments(transitionstate, i, inFragment);
                FragmentTransitionCompat21.beginDelayedTransition(viewgroup, inFragment);
                FragmentTransitionCompat21.cleanupTransitions(viewgroup, transitionstate.nonExistentView, obj1, ((ArrayList) (obj3)), obj, sparsearray1, obj2, arraylist, inFragment, transitionstate.hiddenFragmentViews, ((java.util.Map) (obj4)));
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
        }
        return inFragment != null;
    }

    private void doAddOp(int i, Fragment fragment, String s, int j)
    {
        fragment.mFragmentManager = mManager;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        String s1 = fragment.mTag;
        if (s1 != null)
        {
            try
            {
                if (!s.equals(fragment.mTag))
                {
                    throw new IllegalStateException((new StringBuilder()).append(z[59]).append(fragment).append(z[58]).append(fragment.mTag).append(z[63]).append(s).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        break MISSING_BLOCK_LABEL_103;
        fragment;
        try
        {
            throw fragment;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment) { }
        throw fragment;
        fragment.mTag = s;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        int k = fragment.mFragmentId;
        if (k != 0)
        {
            try
            {
                if (fragment.mFragmentId != i)
                {
                    throw new IllegalStateException((new StringBuilder()).append(z[62]).append(fragment).append(z[60]).append(fragment.mFragmentId).append(z[61]).append(i).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        break MISSING_BLOCK_LABEL_197;
        fragment;
        throw fragment;
        fragment.mFragmentId = i;
        fragment.mContainerId = i;
        s = new Op();
        s.cmd = j;
        s.fragment = fragment;
        addOp(s);
        return;
    }

    private void excludeHiddenFragments(TransitionState transitionstate, int i, Object obj)
    {
        int k = FragmentActivity.a;
        if (mManager.mAdded == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L6:
        if (j >= mManager.mAdded.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mManager.mAdded.get(j);
        Object obj1 = fragment.mView;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        obj1 = fragment.mContainer;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        int l = fragment.mContainerId;
        if (l != i)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        boolean flag = fragment.mHidden;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        flag = transitionstate.hiddenFragmentViews.contains(fragment.mView);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        try
        {
            FragmentTransitionCompat21.excludeTarget(obj, fragment.mView, true);
            transitionstate.hiddenFragmentViews.add(fragment.mView);
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        FragmentTransitionCompat21.excludeTarget(obj, fragment.mView, false);
        transitionstate.hiddenFragmentViews.remove(fragment.mView);
        if (k == 0) goto _L4; else goto _L2
_L2:
        return;
        transitionstate;
        try
        {
            throw transitionstate;
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate) { }
        try
        {
            throw transitionstate;
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate) { }
        try
        {
            throw transitionstate;
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate) { }
        try
        {
            throw transitionstate;
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate) { }
        throw transitionstate;
_L4:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void excludeHiddenFragmentsAfterEnter(final View sceneRoot, final TransitionState state, final int containerId, final Object transition)
    {
        sceneRoot.getViewTreeObserver().addOnPreDrawListener(new _cls3());
    }

    private static Object getEnterTransition(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            try
            {
                fragment = ((Fragment) (fragment.getReenterTransition()));
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        } else
        {
            fragment = ((Fragment) (fragment.getEnterTransition()));
        }
        return FragmentTransitionCompat21.cloneTransition(fragment);
    }

    private static Object getExitTransition(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            try
            {
                fragment = ((Fragment) (fragment.getReturnTransition()));
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        } else
        {
            fragment = ((Fragment) (fragment.getExitTransition()));
        }
        return FragmentTransitionCompat21.cloneTransition(fragment);
    }

    private static Object getSharedElementTransition(Fragment fragment, Fragment fragment1, boolean flag)
    {
        if (fragment == null || fragment1 == null)
        {
            return null;
        }
        if (flag)
        {
            try
            {
                fragment = ((Fragment) (fragment1.getSharedElementReturnTransition()));
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        } else
        {
            fragment = ((Fragment) (fragment.getSharedElementEnterTransition()));
        }
        return FragmentTransitionCompat21.cloneTransition(fragment);
    }

    private ArrayMap mapEnteringSharedElements(TransitionState transitionstate, Fragment fragment, boolean flag)
    {
        ArrayMap arraymap = new ArrayMap();
        fragment = fragment.getView();
        transitionstate = arraymap;
        if (fragment == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        transitionstate = arraymap;
        try
        {
            if (mSharedElementSourceNames == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            FragmentTransitionCompat21.findNamedViews(arraymap, fragment);
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        transitionstate = arraymap;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        fragment = remapNames(mSharedElementSourceNames, mSharedElementTargetNames, arraymap);
        transitionstate = fragment;
        if (FragmentActivity.a == 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        transitionstate = fragment;
        try
        {
            transitionstate.retainAll(mSharedElementTargetNames);
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        return transitionstate;
    }

    private ArrayMap mapSharedElementsIn(TransitionState transitionstate, boolean flag, Fragment fragment)
    {
        ArrayMap arraymap = mapEnteringSharedElements(transitionstate, fragment, flag);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        int i;
        try
        {
            if (fragment.mExitTransitionCallback != null)
            {
                fragment.mExitTransitionCallback.onMapSharedElements(mSharedElementTargetNames, arraymap);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        setBackNameOverrides(transitionstate, arraymap, true);
        i = FragmentActivity.a;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        try
        {
            if (fragment.mEnterTransitionCallback != null)
            {
                fragment.mEnterTransitionCallback.onMapSharedElements(mSharedElementTargetNames, arraymap);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        setNameOverrides(transitionstate, arraymap, true);
        return arraymap;
        transitionstate;
        throw transitionstate;
    }

    private void prepareSharedElementTransition(final TransitionState state, final View sceneRoot, final Object sharedElementTransition, final Fragment inFragment, final Fragment outFragment, final boolean isBack, final ArrayList sharedElementTargets)
    {
        sceneRoot.getViewTreeObserver().addOnPreDrawListener(new _cls2());
    }

    private static ArrayMap remapNames(ArrayList arraylist, ArrayList arraylist1, ArrayMap arraymap)
    {
        int j = FragmentActivity.a;
        boolean flag;
        try
        {
            flag = arraymap.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
        if (flag)
        {
            return arraymap;
        }
        ArrayMap arraymap1 = new ArrayMap();
        int k = arraylist.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    View view = (View)arraymap.get(arraylist.get(i));
                    if (view != null)
                    {
                        try
                        {
                            arraymap1.put(arraylist1.get(i), view);
                        }
                        // Misplaced declaration of an exception variable
                        catch (ArrayList arraylist)
                        {
                            throw arraylist;
                        }
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return arraymap1;
            }
            i++;
        } while (true);
    }

    private ArrayMap remapSharedElements(TransitionState transitionstate, Fragment fragment, boolean flag)
    {
        ArrayMap arraymap1;
        int i;
        i = FragmentActivity.a;
        arraymap1 = new ArrayMap();
        ArrayList arraylist = mSharedElementSourceNames;
        ArrayMap arraymap = arraymap1;
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        try
        {
            FragmentTransitionCompat21.findNamedViews(arraymap1, fragment.getView());
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        arraymap1.retainAll(mSharedElementTargetNames);
        arraymap = arraymap1;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        arraymap = remapNames(mSharedElementSourceNames, mSharedElementTargetNames, arraymap1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        try
        {
            if (fragment.mEnterTransitionCallback != null)
            {
                fragment.mEnterTransitionCallback.onMapSharedElements(mSharedElementTargetNames, arraymap);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        setBackNameOverrides(transitionstate, arraymap, false);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        try
        {
            if (fragment.mExitTransitionCallback != null)
            {
                fragment.mExitTransitionCallback.onMapSharedElements(mSharedElementTargetNames, arraymap);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        setNameOverrides(transitionstate, arraymap, false);
        return arraymap;
        transitionstate;
        throw transitionstate;
        transitionstate;
        throw transitionstate;
    }

    private void setBackNameOverrides(TransitionState transitionstate, ArrayMap arraymap, boolean flag)
    {
        int j;
        int k = FragmentActivity.a;
        Object obj;
        Object obj1;
        int i;
        try
        {
            obj = mSharedElementTargetNames;
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = mSharedElementTargetNames.size();
        }
        j = 0;
_L2:
        if (j >= i)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        obj = (String)mSharedElementSourceNames.get(j);
        obj1 = (View)arraymap.get((String)mSharedElementTargetNames.get(j));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj1 = FragmentTransitionCompat21.getTransitionName(((View) (obj1)));
        if (flag)
        {
            try
            {
                setNameOverride(transitionstate.nameOverrides, ((String) (obj)), ((String) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_107;
            }
        }
        setNameOverride(transitionstate.nameOverrides, ((String) (obj1)), ((String) (obj)));
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        return;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void setEpicenterIn(ArrayMap arraymap, TransitionState transitionstate)
    {
        boolean flag;
        try
        {
            if (mSharedElementTargetNames == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            flag = arraymap.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (ArrayMap arraymap)
        {
            throw arraymap;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        arraymap = (View)arraymap.get(mSharedElementTargetNames.get(0));
        if (arraymap == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        transitionstate.enteringEpicenterView.epicenter = arraymap;
        return;
        arraymap;
        throw arraymap;
    }

    private static void setFirstOut(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        int i = fragment.mContainerId;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        View view;
        boolean flag;
        try
        {
            flag = fragment.isHidden();
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray)
        {
            try
            {
                throw sparsearray;
            }
            // Misplaced declaration of an exception variable
            catch (SparseArray sparsearray) { }
            try
            {
                throw sparsearray;
            }
            // Misplaced declaration of an exception variable
            catch (SparseArray sparsearray) { }
            try
            {
                throw sparsearray;
            }
            // Misplaced declaration of an exception variable
            catch (SparseArray sparsearray)
            {
                throw sparsearray;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flag = fragment.isAdded();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        view = fragment.getView();
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (sparsearray.get(i) == null)
        {
            sparsearray.put(i, fragment);
        }
    }

    private void setLastIn(SparseArray sparsearray, Fragment fragment)
    {
        int i;
        if (fragment == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        i = fragment.mContainerId;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        sparsearray.put(i, fragment);
        return;
        sparsearray;
        throw sparsearray;
    }

    private static void setNameOverride(ArrayMap arraymap, String s, String s1)
    {
        int j = FragmentActivity.a;
        if (s == null || s1 == null) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag;
        try
        {
            flag = s.equals(s1);
        }
        // Misplaced declaration of an exception variable
        catch (ArrayMap arraymap)
        {
            throw arraymap;
        }
        if (flag) goto _L2; else goto _L3
_L3:
        i = 0;
_L7:
        if (i >= arraymap.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s.equals(arraymap.valueAt(i))) goto _L5; else goto _L4
_L4:
        arraymap.setValueAt(i, s1);
_L2:
        return;
        arraymap;
        throw arraymap;
_L5:
        i++;
        if (j == 0) goto _L7; else goto _L6
_L6:
        arraymap.put(s, s1);
        return;
    }

    private void setNameOverrides(TransitionState transitionstate, ArrayMap arraymap, boolean flag)
    {
        int i;
        int j;
        int k;
        j = FragmentActivity.a;
        k = arraymap.size();
        i = 0;
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        String s = (String)arraymap.keyAt(i);
        String s1 = FragmentTransitionCompat21.getTransitionName((View)arraymap.valueAt(i));
        if (flag)
        {
            try
            {
                setNameOverride(transitionstate.nameOverrides, s, s1);
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_77;
            }
        }
        setNameOverride(transitionstate.nameOverrides, s1, s);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void setNameOverrides(TransitionState transitionstate, ArrayList arraylist, ArrayList arraylist1)
    {
        int j = FragmentActivity.a;
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i >= arraylist.size()) goto _L2; else goto _L3
_L3:
        String s = (String)arraylist.get(i);
        String s1 = (String)arraylist1.get(i);
        setNameOverride(transitionstate.nameOverrides, s, s1);
        if (j == 0) goto _L4; else goto _L2
_L2:
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
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
        Op op1;
        try
        {
            op1 = mHead;
        }
        // Misplaced declaration of an exception variable
        catch (Op op)
        {
            try
            {
                throw op;
            }
            // Misplaced declaration of an exception variable
            catch (Op op)
            {
                throw op;
            }
        }
        if (op1 != null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        mTail = op;
        mHead = op;
        if (FragmentActivity.a == 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        op.prev = mTail;
        mTail.next = op;
        mTail = op;
        op.enterAnim = mEnterAnim;
        op.exitAnim = mExitAnim;
        op.popEnterAnim = mPopEnterAnim;
        op.popExitAnim = mPopExitAnim;
        mNumOp = mNumOp + 1;
        return;
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
        int k;
        k = FragmentActivity.a;
        boolean flag;
        try
        {
            flag = mAddToBackStack;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        Op op;
        Fragment fragment;
        try
        {
            if (FragmentManagerImpl.DEBUG)
            {
                Log.v(z[55], (new StringBuilder()).append(z[53]).append(this).append(z[56]).append(i).toString());
            }
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        op = mHead;
        if (op == null)
        {
            break; /* Loop/switch isn't completed */
        }
        fragment = op.fragment;
        if (fragment != null)
        {
            try
            {
                fragment = op.fragment;
                fragment.mBackStackNesting = fragment.mBackStackNesting + i;
                if (FragmentManagerImpl.DEBUG)
                {
                    Log.v(z[51], (new StringBuilder()).append(z[49]).append(op.fragment).append(z[50]).append(op.fragment.mBackStackNesting).toString());
                }
            }
            catch (IllegalStateException illegalstateexception3)
            {
                throw illegalstateexception3;
            }
        }
        if (op.removed == null) goto _L4; else goto _L3
_L3:
        j = op.removed.size() - 1;
_L6:
        if (j >= 0)
        {
            fragment = (Fragment)op.removed.get(j);
            IllegalStateException illegalstateexception2;
            try
            {
                fragment.mBackStackNesting = fragment.mBackStackNesting + i;
                if (FragmentManagerImpl.DEBUG)
                {
                    Log.v(z[52], (new StringBuilder()).append(z[57]).append(fragment).append(z[54]).append(fragment.mBackStackNesting).toString());
                }
            }
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_297;
            }
        }
_L4:
        op = op.next;
        if (k != 0) goto _L1; else goto _L5
_L5:
        break MISSING_BLOCK_LABEL_77;
        illegalstateexception2;
        throw illegalstateexception2;
        j--;
          goto _L6
    }

    public void calculateBackFragments(SparseArray sparsearray, SparseArray sparsearray1)
    {
        int j;
        j = FragmentActivity.a;
        boolean flag;
        try
        {
            flag = mManager.mContainer.hasView();
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray)
        {
            throw sparsearray;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Op op = mHead;
_L11:
        if (op == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = op.cmd;
        i;
        JVM INSTR tableswitch 1 7: default 88
    //                   1 101
    //                   2 114
    //                   3 176
    //                   4 190
    //                   5 204
    //                   6 217
    //                   7 231;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
        op = op.next;
        if (j != 0) goto _L1; else goto _L11
_L4:
        ArrayList arraylist;
        try
        {
            setFirstOut(sparsearray, op.fragment);
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray)
        {
            throw sparsearray;
        }
        if (j == 0) goto _L3; else goto _L5
_L5:
        arraylist = op.removed;
        if (arraylist == null) goto _L13; else goto _L12
_L12:
        i = op.removed.size() - 1;
_L16:
        if (i < 0) goto _L13; else goto _L14
_L14:
        setLastIn(sparsearray1, (Fragment)op.removed.get(i));
        if (j == 0) goto _L15; else goto _L13
_L13:
        setFirstOut(sparsearray, op.fragment);
        if (j == 0) goto _L3; else goto _L6
_L6:
        setLastIn(sparsearray1, op.fragment);
        if (j == 0) goto _L3; else goto _L7
_L7:
        setLastIn(sparsearray1, op.fragment);
        if (j == 0) goto _L3; else goto _L8
_L8:
        setFirstOut(sparsearray, op.fragment);
        if (j == 0) goto _L3; else goto _L9
_L9:
        try
        {
            setLastIn(sparsearray1, op.fragment);
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray)
        {
            throw sparsearray;
        }
        if (j == 0) goto _L3; else goto _L10
_L10:
        setFirstOut(sparsearray, op.fragment);
          goto _L3
        sparsearray;
        throw sparsearray;
        sparsearray;
        try
        {
            throw sparsearray;
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray) { }
        try
        {
            throw sparsearray;
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray) { }
        try
        {
            throw sparsearray;
        }
        // Misplaced declaration of an exception variable
        catch (SparseArray sparsearray) { }
        throw sparsearray;
_L15:
        i--;
          goto _L16
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
        try
        {
            if (mCommitted)
            {
                throw new IllegalStateException(z[14]);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v(z[12], (new StringBuilder()).append(z[13]).append(this).toString());
            PrintWriter printwriter = new PrintWriter(new LogWriter(z[11]));
            dump(z[10], null, printwriter, null);
        }
        boolean flag1;
        try
        {
            mCommitted = true;
            flag1 = mAddToBackStack;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            try
            {
                throw illegalstateexception1;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        mIndex = mManager.allocBackStackIndex(this);
        if (FragmentActivity.a == 0)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        mIndex = -1;
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
        try
        {
            if (mAddToBackStack)
            {
                throw new IllegalStateException(z[69]);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        mAllowAddToBackStack = false;
        return this;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        dump(s, printwriter, true);
    }

    public void dump(String s, PrintWriter printwriter, boolean flag)
    {
        String s1;
        int i;
        int k;
        k = FragmentActivity.a;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        Op op;
        String s2;
        int j;
        int l;
        try
        {
            printwriter.print(s);
            printwriter.print(z[16]);
            printwriter.print(mName);
            printwriter.print(z[25]);
            printwriter.print(mIndex);
            printwriter.print(z[27]);
            printwriter.println(mCommitted);
            if (mTransition != 0)
            {
                printwriter.print(s);
                printwriter.print(z[32]);
                printwriter.print(Integer.toHexString(mTransition));
                printwriter.print(z[48]);
                printwriter.println(Integer.toHexString(mTransitionStyle));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            i = mEnterAnim;
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
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (mExitAnim == 0)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        printwriter.print(s);
        printwriter.print(z[26]);
        printwriter.print(Integer.toHexString(mEnterAnim));
        printwriter.print(z[19]);
        printwriter.println(Integer.toHexString(mExitAnim));
        try
        {
            i = mPopEnterAnim;
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
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        if (mPopExitAnim == 0)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        printwriter.print(s);
        printwriter.print(z[28]);
        printwriter.print(Integer.toHexString(mPopEnterAnim));
        printwriter.print(z[35]);
        printwriter.println(Integer.toHexString(mPopExitAnim));
        try
        {
            i = mBreadCrumbTitleRes;
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
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        if (mBreadCrumbTitleText == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        printwriter.print(s);
        printwriter.print(z[40]);
        printwriter.print(Integer.toHexString(mBreadCrumbTitleRes));
        printwriter.print(z[41]);
        printwriter.println(mBreadCrumbTitleText);
        try
        {
            i = mBreadCrumbShortTitleRes;
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
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        if (mBreadCrumbShortTitleText == null)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        printwriter.print(s);
        printwriter.print(z[44]);
        printwriter.print(Integer.toHexString(mBreadCrumbShortTitleRes));
        printwriter.print(z[29]);
        printwriter.println(mBreadCrumbShortTitleText);
        if (mHead == null) goto _L2; else goto _L1
_L1:
        printwriter.print(s);
        printwriter.println(z[15]);
        s2 = (new StringBuilder()).append(s).append(z[43]).toString();
        op = mHead;
        i = 0;
_L28:
        if (op == null) goto _L2; else goto _L3
_L3:
        op.cmd;
        JVM INSTR tableswitch 0 7: default 488
    //                   0 900
    //                   1 913
    //                   2 926
    //                   3 939
    //                   4 952
    //                   5 965
    //                   6 978
    //                   7 991;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L4:
        s1 = (new StringBuilder()).append(z[46]).append(op.cmd).toString();
_L26:
        try
        {
            printwriter.print(s);
            printwriter.print(z[17]);
            printwriter.print(i);
            printwriter.print(z[47]);
            printwriter.print(s1);
            printwriter.print(" ");
            printwriter.println(op.fragment);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
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
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        j = op.enterAnim;
        if (j != 0) goto _L14; else goto _L13
_L13:
        if (op.exitAnim == 0) goto _L15; else goto _L14
_L14:
        printwriter.print(s);
        printwriter.print(z[30]);
        printwriter.print(Integer.toHexString(op.enterAnim));
        printwriter.print(z[22]);
        printwriter.println(Integer.toHexString(op.exitAnim));
_L15:
        try
        {
            j = op.popEnterAnim;
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
        if (j != 0) goto _L17; else goto _L16
_L16:
        if (op.popExitAnim == 0)
        {
            break MISSING_BLOCK_LABEL_712;
        }
_L17:
        printwriter.print(s);
        printwriter.print(z[39]);
        printwriter.print(Integer.toHexString(op.popEnterAnim));
        printwriter.print(z[34]);
        printwriter.println(Integer.toHexString(op.popExitAnim));
        if (op.removed == null) goto _L19; else goto _L18
_L18:
        j = op.removed.size();
        if (j <= 0) goto _L19; else goto _L20
_L20:
        j = 0;
_L24:
        if (j >= op.removed.size())
        {
            break; /* Loop/switch isn't completed */
        }
        printwriter.print(s2);
        l = op.removed.size();
        if (l != 1) goto _L22; else goto _L21
_L21:
        printwriter.print(z[20]);
        if (k == 0) goto _L23; else goto _L22
_L22:
        if (j == 0)
        {
            try
            {
                printwriter.println(z[31]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        printwriter.print(s2);
        printwriter.print(z[24]);
        printwriter.print(j);
        printwriter.print(z[37]);
_L23:
        printwriter.println(op.removed.get(j));
        j++;
        if (k == 0) goto _L24; else goto _L19
_L19:
        op = op.next;
        if (k == 0) goto _L25; else goto _L2
_L2:
        return;
_L5:
        s1 = z[42];
        if (k == 0) goto _L26; else goto _L6
_L6:
        s1 = z[21];
        if (k == 0) goto _L26; else goto _L7
_L7:
        s1 = z[36];
        if (k == 0) goto _L26; else goto _L8
_L8:
        s1 = z[23];
        if (k == 0) goto _L26; else goto _L9
_L9:
        s1 = z[45];
        if (k == 0) goto _L26; else goto _L10
_L10:
        s1 = z[33];
        if (k == 0) goto _L26; else goto _L11
_L11:
        s1 = z[38];
        if (k == 0) goto _L26; else goto _L12
_L12:
        s1 = z[18];
        if (k == 0) goto _L26; else goto _L4
        s;
        throw s;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
_L25:
        i++;
        if (true) goto _L28; else goto _L27
_L27:
    }

    public String getName()
    {
        return mName;
    }

    public boolean isEmpty()
    {
        int i;
        try
        {
            i = mNumOp;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return i == 0;
    }

    public TransitionState popFromBackStack(boolean flag, TransitionState transitionstate, SparseArray sparsearray, SparseArray sparsearray1)
    {
        int j1;
        j1 = FragmentActivity.a;
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v(z[68], (new StringBuilder()).append(z[66]).append(this).toString());
            PrintWriter printwriter = new PrintWriter(new LogWriter(z[65]));
            dump(z[64], null, printwriter, null);
        }
        if (transitionstate != null) goto _L2; else goto _L1
_L1:
        if (sparsearray.size() != 0) goto _L4; else goto _L3
_L3:
        int i = sparsearray1.size();
        if (i == 0) goto _L5; else goto _L4
_L4:
        sparsearray = beginTransition(sparsearray, sparsearray1, true);
        transitionstate = sparsearray;
        if (j1 == 0) goto _L5; else goto _L6
_L6:
        int j;
        int k;
        int l;
        transitionstate = sparsearray;
        if (!flag)
        {
            try
            {
                setNameOverrides(sparsearray, mSharedElementTargetNames, mSharedElementSourceNames);
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
            transitionstate = sparsearray;
        }
_L5:
        try
        {
            bumpBackStackNesting(-1);
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        if (transitionstate != null)
        {
            i = 0;
        } else
        {
            i = mTransitionStyle;
        }
        if (transitionstate != null)
        {
            j = 0;
        } else
        {
            j = mTransition;
        }
        sparsearray = mTail;
_L21:
        if (sparsearray == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (transitionstate != null)
        {
            k = 0;
        } else
        {
            k = ((Op) (sparsearray)).popEnterAnim;
        }
        if (transitionstate != null)
        {
            l = 0;
        } else
        {
            l = ((Op) (sparsearray)).popExitAnim;
        }
        ((Op) (sparsearray)).cmd;
        JVM INSTR tableswitch 1 7: default 228
    //                   1 310
    //                   2 344
    //                   3 441
    //                   4 469
    //                   5 503
    //                   6 537
    //                   7 571;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L7:
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[67]).append(((Op) (sparsearray)).cmd).toString());
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        transitionstate;
        throw transitionstate;
_L8:
        sparsearray1 = ((Op) (sparsearray)).fragment;
        sparsearray1.mNextAnim = l;
        mManager.removeFragment(sparsearray1, FragmentManagerImpl.reverseTransit(j), i);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L9:
        int i1;
        sparsearray1 = ((Op) (sparsearray)).fragment;
        if (sparsearray1 != null)
        {
            try
            {
                sparsearray1.mNextAnim = l;
                mManager.removeFragment(sparsearray1, FragmentManagerImpl.reverseTransit(j), i);
            }
            // Misplaced declaration of an exception variable
            catch (TransitionState transitionstate)
            {
                throw transitionstate;
            }
        }
        if (((Op) (sparsearray)).removed == null) goto _L16; else goto _L15
_L15:
        i1 = 0;
_L22:
        if (i1 >= ((Op) (sparsearray)).removed.size()) goto _L16; else goto _L17
_L17:
        sparsearray1 = (Fragment)((Op) (sparsearray)).removed.get(i1);
        sparsearray1.mNextAnim = k;
        mManager.addFragment(sparsearray1, false);
        if (j1 == 0) goto _L18; else goto _L16
_L16:
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L10:
        sparsearray1 = ((Op) (sparsearray)).fragment;
        sparsearray1.mNextAnim = k;
        mManager.addFragment(sparsearray1, false);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L11:
        sparsearray1 = ((Op) (sparsearray)).fragment;
        sparsearray1.mNextAnim = k;
        mManager.showFragment(sparsearray1, FragmentManagerImpl.reverseTransit(j), i);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L12:
        sparsearray1 = ((Op) (sparsearray)).fragment;
        sparsearray1.mNextAnim = l;
        mManager.hideFragment(sparsearray1, FragmentManagerImpl.reverseTransit(j), i);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L13:
        sparsearray1 = ((Op) (sparsearray)).fragment;
        sparsearray1.mNextAnim = k;
        mManager.attachFragment(sparsearray1, FragmentManagerImpl.reverseTransit(j), i);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L14:
        sparsearray1 = ((Op) (sparsearray)).fragment;
        sparsearray1.mNextAnim = k;
        mManager.detachFragment(sparsearray1, FragmentManagerImpl.reverseTransit(j), i);
        if (j1 != 0) goto _L7; else goto _L19
_L19:
        sparsearray = ((Op) (sparsearray)).prev;
        if (j1 == 0) goto _L21; else goto _L20
_L20:
        if (flag)
        {
            mManager.moveToState(mManager.mCurState, FragmentManagerImpl.reverseTransit(j), i, true);
            transitionstate = null;
        }
        try
        {
            if (mIndex >= 0)
            {
                mManager.freeBackStackIndex(mIndex);
                mIndex = -1;
            }
        }
        // Misplaced declaration of an exception variable
        catch (TransitionState transitionstate)
        {
            throw transitionstate;
        }
        return transitionstate;
_L18:
        i1++;
          goto _L22
_L2:
        sparsearray = transitionstate;
        if (true) goto _L6; else goto _L23
_L23:
    }

    public FragmentTransaction remove(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 3;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public void run()
    {
        int j1;
        j1 = FragmentActivity.a;
        IllegalStateException illegalstateexception;
        boolean flag;
        try
        {
            if (FragmentManagerImpl.DEBUG)
            {
                Log.v(z[8], (new StringBuilder()).append(z[2]).append(this).toString());
            }
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        flag = mAddToBackStack;
        if (flag)
        {
            try
            {
                if (mIndex < 0)
                {
                    throw new IllegalStateException(z[4]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        break MISSING_BLOCK_LABEL_83;
        IllegalStateException illegalstateexception2;
        illegalstateexception2;
        throw illegalstateexception2;
        bumpBackStackNesting(1);
        IllegalStateException illegalstateexception3;
        Object obj;
        Object obj1;
        TransitionState transitionstate;
        Op op;
        Fragment fragment;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            SparseArray sparsearray = new SparseArray();
            SparseArray sparsearray1 = new SparseArray();
            calculateFragments(sparsearray, sparsearray1);
            transitionstate = beginTransition(sparsearray, sparsearray1, false);
        } else
        {
            transitionstate = null;
        }
        if (transitionstate != null)
        {
            i = 0;
        } else
        {
            i = mTransitionStyle;
        }
        if (transitionstate != null)
        {
            j = 0;
        } else
        {
            j = mTransition;
        }
        op = mHead;
        if (op == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (transitionstate != null)
        {
            k = 0;
        } else
        {
            k = op.enterAnim;
        }
        if (transitionstate != null)
        {
            l = 0;
        } else
        {
            l = op.exitAnim;
        }
        op.cmd;
        JVM INSTR tableswitch 1 7: default 212
    //                   1 287
    //                   2 313
    //                   3 487
    //                   4 516
    //                   5 545
    //                   6 574
    //                   7 603;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[0]).append(op.cmd).toString());
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
_L2:
        obj = op.fragment;
        obj.mNextAnim = k;
        mManager.addFragment(((Fragment) (obj)), false);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        obj = op.fragment;
        if (mManager.mAdded == null) goto _L10; else goto _L9
_L9:
        i1 = 0;
_L22:
        obj1 = obj;
        if (i1 >= mManager.mAdded.size()) goto _L12; else goto _L11
_L11:
        fragment = (Fragment)mManager.mAdded.get(i1);
        try
        {
            if (FragmentManagerImpl.DEBUG)
            {
                Log.v(z[6], (new StringBuilder()).append(z[9]).append(obj).append(z[3]).append(fragment).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj == null) goto _L14; else goto _L13
_L13:
        try
        {
            k1 = fragment.mContainerId;
            l1 = ((Fragment) (obj)).mContainerId;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj1 = obj;
        if (k1 != l1) goto _L15; else goto _L14
_L14:
        if (fragment != obj) goto _L17; else goto _L16
_L16:
        obj1 = null;
        op.fragment = null;
_L15:
        if (j1 == 0) goto _L18; else goto _L12
_L12:
        if (obj1 != null)
        {
            try
            {
                obj1.mNextAnim = k;
                mManager.addFragment(((Fragment) (obj1)), false);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        obj = op.fragment;
        obj.mNextAnim = l;
        mManager.removeFragment(((Fragment) (obj)), j, i);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        obj = op.fragment;
        obj.mNextAnim = l;
        mManager.hideFragment(((Fragment) (obj)), j, i);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        obj = op.fragment;
        obj.mNextAnim = k;
        mManager.showFragment(((Fragment) (obj)), j, i);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        obj = op.fragment;
        obj.mNextAnim = l;
        mManager.detachFragment(((Fragment) (obj)), j, i);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L8:
        obj = op.fragment;
        obj.mNextAnim = k;
        mManager.attachFragment(((Fragment) (obj)), j, i);
        if (j1 != 0) goto _L1; else goto _L19
_L19:
        op = op.next;
        if (j1 == 0) goto _L21; else goto _L20
_L21:
        break MISSING_BLOCK_LABEL_146;
_L20:
        try
        {
            mManager.moveToState(mManager.mCurState, j, i, true);
            if (mAddToBackStack)
            {
                mManager.addBackStackState(this);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
_L17:
        try
        {
            if (op.removed == null)
            {
                op.removed = new ArrayList();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        op.removed.add(fragment);
        fragment.mNextAnim = l;
        flag1 = mAddToBackStack;
        if (flag1)
        {
            try
            {
                fragment.mBackStackNesting = fragment.mBackStackNesting + 1;
                if (FragmentManagerImpl.DEBUG)
                {
                    Log.v(z[7], (new StringBuilder()).append(z[1]).append(fragment).append(z[5]).append(fragment.mBackStackNesting).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        mManager.removeFragment(fragment, j, i);
        obj1 = obj;
          goto _L15
        obj;
        throw obj;
_L18:
        i1++;
        obj = obj1;
          goto _L22
_L10:
        obj1 = obj;
          goto _L12
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        try
        {
            stringbuilder.append(z[70]);
            stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
            if (mIndex >= 0)
            {
                stringbuilder.append(z[71]);
                stringbuilder.append(mIndex);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        try
        {
            if (mName != null)
            {
                stringbuilder.append(" ");
                stringbuilder.append(mName);
            }
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[72];
        obj = "|]pp\034^];}\036M\t;";
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
                i = 1;
                obj = "kFvnSGVhj\032GT;q\025\t";
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "{Fu$S";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\t\\wzN";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "HW\177J\034kRxu ]Rxu[\000\023x\177\037EV\177>\022OG~lSJ\\vs\032]\0332";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\tGt>";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "fcDL6y\177Z]6\023\023zz\027@]|#";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\t\023";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "j\\vs\032]\t;";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "J\\vs\032]\023zr\001LR\177gSJRwr\026M";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "fC~l\022]Ztp\000\023";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "D}zs\026\024";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\t\023TnS\n";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "hgO_0a";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\t^^f\032]ruw\036\024\020";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "{Vvq\005LW!>";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "hw_";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\tVcw\007h]rsN\n";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "{vVQ%l";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\t\0238";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\t^Rp\027LK&";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "Dvuj\026[ruw\036\024\020";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                obj = "\t^Xq\036DZoj\026M\016";
                byte0 = 26;
                i = 27;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "Dctn6GG~l2GZv#P";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\t^Yl\026HWXl\006DQHv\034[GOw\007EVO{\013]\016";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                obj = "L]o{\001h]rsN\n";
                byte0 = 29;
                i = 30;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "{Vvq\005LW!";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "Dgi\177\035ZZow\034G\0168";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "z{TI";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "\tCtn6QZo_\035@^&=";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "\t^Kq\003lKrj2GZv#P";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "{vKR2jv";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "\023\023";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "mvO_0a";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "Y\\k[\035]Vi_\035@^&=";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "Dqi{\022Mpik\036Kgrj\037La~mN\n";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                obj = "\t^Yl\026HWXl\006DQOw\007EVO{\013]\016";
                byte0 = 40;
                i = 41;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "gfWR";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "\t\023;>";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "Dqi{\022Mpik\036K`sq\001]grj\037La~mN\n";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "az_[";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "J^\177#";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "\023\023";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "\t^Ol\022G@rj\032F]Hj\nEV&=";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 49;
                obj = "kFvnSGVhj\032GT;q\025\t";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "\tGt>";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i] = ((String) (obj));
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 50;
                i = 51;
                break;

            case 50: // '2'
                as1[i] = ((String) (obj));
                i = 52;
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i] = ((String) (obj));
                i = 53;
                obj = "kFvnSGVhj\032GT;w\035\t";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i] = ((String) (obj));
                i = 54;
                obj = "\tGt>";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i] = ((String) (obj));
                i = 55;
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i] = ((String) (obj));
                i = 56;
                obj = "\tQb>";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[i] = ((String) (obj));
                i = 57;
                obj = "kFvnSGVhj\032GT;q\025\t";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[i] = ((String) (obj));
                i = 58;
                obj = "\023\023l\177\000\t";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[i] = ((String) (obj));
                i = 59;
                obj = "jRu9\007\tPs\177\035NV;j\022N\023txSOAzy\036L]o>";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[i] = ((String) (obj));
                i = 60;
                obj = "\023\023l\177\000\t";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[i] = ((String) (obj));
                i = 61;
                obj = "\t]tiS";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[i] = ((String) (obj));
                i = 62;
                obj = "jRu9\007\tPs\177\035NV;}\034GGzw\035LA;W7\t\\}>\025[R|s\026GG;";
                byte0 = 61;
                break;

            case 61: // '='
                as1[i] = ((String) (obj));
                i = 63;
                obj = "\t]tiS";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[i] = ((String) (obj));
                i = 64;
                obj = "\t\023";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[i] = ((String) (obj));
                i = 65;
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[i] = ((String) (obj));
                i = 66;
                obj = "Y\\kX\001F^Y\177\020B`o\177\020B\t;";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[i] = ((String) (obj));
                i = 67;
                obj = "|]pp\034^];}\036M\t;";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[i] = ((String) (obj));
                i = 68;
                obj = "oAzy\036L]oS\022GR|{\001";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[i] = ((String) (obj));
                i = 69;
                obj = "}[rmS]Azp\000HPow\034G\023rmSH_i{\022MJ;|\026@]|>\022MW~zS]\\;j\033L\023y\177\020B\023hj\022JX";
                byte0 = 68;
                break;

            case 68: // 'D'
                as1[i] = ((String) (obj));
                i = 70;
                obj = "kRxu ]Rxu6GGig\b";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[i] = ((String) (obj));
                i = 71;
                obj = "\t\020";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1664
    //                   0 1687
    //                   1 1694
    //                   2 1701
    //                   3 1708;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1708;
_L3:
        byte byte1 = 115;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 41;
          goto _L9
_L5:
        byte1 = 51;
          goto _L9
_L6:
        byte1 = 27;
          goto _L9
        byte1 = 30;
          goto _L9
    }





    private class TransitionState
    {

        public FragmentTransitionCompat21.EpicenterView enteringEpicenterView;
        public ArrayList hiddenFragmentViews;
        public ArrayMap nameOverrides;
        public View nonExistentView;
        final BackStackRecord this$0;

        public TransitionState()
        {
            this$0 = BackStackRecord.this;
            super();
            nameOverrides = new ArrayMap();
            hiddenFragmentViews = new ArrayList();
            enteringEpicenterView = new FragmentTransitionCompat21.EpicenterView();
        }
    }


    private class Op
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


    private class _cls1
        implements FragmentTransitionCompat21.ViewRetriever
    {

        final BackStackRecord this$0;
        final Fragment val$inFragment;

        public View getView()
        {
            return inFragment.getView();
        }

        _cls1()
        {
            this$0 = BackStackRecord.this;
            inFragment = fragment;
            super();
        }
    }


    private class _cls3
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final BackStackRecord this$0;
        final int val$containerId;
        final View val$sceneRoot;
        final TransitionState val$state;
        final Object val$transition;

        public boolean onPreDraw()
        {
            sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            excludeHiddenFragments(state, containerId, transition);
            return true;
        }

        _cls3()
        {
            this$0 = BackStackRecord.this;
            sceneRoot = view;
            state = transitionstate;
            containerId = i;
            transition = obj;
            super();
        }
    }


    private class _cls2
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final BackStackRecord this$0;
        final Fragment val$inFragment;
        final boolean val$isBack;
        final Fragment val$outFragment;
        final View val$sceneRoot;
        final ArrayList val$sharedElementTargets;
        final Object val$sharedElementTransition;
        final TransitionState val$state;

        public boolean onPreDraw()
        {
label0:
            {
                ArrayMap arraymap;
label1:
                {
                    sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (sharedElementTransition == null)
                    {
                        break label0;
                    }
                    FragmentTransitionCompat21.removeTargets(sharedElementTransition, sharedElementTargets);
                    sharedElementTargets.clear();
                    arraymap = mapSharedElementsIn(state, isBack, inFragment);
                    if (arraymap.isEmpty())
                    {
                        sharedElementTargets.add(state.nonExistentView);
                        if (FragmentActivity.a == 0)
                        {
                            break label1;
                        }
                    }
                    sharedElementTargets.addAll(arraymap.values());
                }
                FragmentTransitionCompat21.addTargets(sharedElementTransition, sharedElementTargets);
                setEpicenterIn(arraymap, state);
                callSharedElementEnd(state, inFragment, outFragment, isBack, arraymap);
            }
            return true;
        }

        _cls2()
        {
            this$0 = BackStackRecord.this;
            sceneRoot = view;
            sharedElementTransition = obj;
            sharedElementTargets = arraylist;
            state = transitionstate;
            isBack = flag;
            inFragment = fragment;
            outFragment = fragment1;
            super();
        }
    }

}
