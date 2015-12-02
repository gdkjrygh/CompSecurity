// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import com.actionbarsherlock.app.SherlockActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            Animator, ValueAnimator

public final class AnimatorSet extends Animator
{

    private static final String z;
    private ValueAnimator mDelayAnim;
    private long mDuration;
    private boolean mNeedsSort;
    private HashMap mNodeMap;
    private ArrayList mNodes;
    private ArrayList mPlayingSet;
    private AnimatorSetListener mSetListener;
    private ArrayList mSortedNodes;
    private long mStartDelay;
    private boolean mStarted;
    boolean mTerminated;

    public AnimatorSet()
    {
        mPlayingSet = new ArrayList();
        mNodeMap = new HashMap();
        mNodes = new ArrayList();
        mSortedNodes = new ArrayList();
        mNeedsSort = true;
        mSetListener = null;
        mTerminated = false;
        mStarted = false;
        mStartDelay = 0L;
        mDelayAnim = null;
        mDuration = -1L;
    }

    private void sortNodes()
    {
        boolean flag = Animator.a;
        if (!mNeedsSort) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        int j;
        mSortedNodes.clear();
        obj = new ArrayList();
        j = mNodes.size();
        i = 0;
_L28:
        if (i >= j) goto _L4; else goto _L3
_L3:
        Object obj1 = (Node)mNodes.get(i);
        IllegalStateException illegalstateexception;
        Object obj2;
        Node node;
        int k;
        int i1;
        try
        {
            obj2 = ((Node) (obj1)).dependencies;
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
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (((Node) (obj1)).dependencies.size() != 0)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        ((ArrayList) (obj)).add(obj1);
        if (!flag) goto _L5; else goto _L4
_L4:
        obj1 = new ArrayList();
_L14:
        if (((ArrayList) (obj)).size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((ArrayList) (obj)).size();
        i = 0;
_L25:
        if (i >= k) goto _L7; else goto _L6
_L6:
        obj2 = (Node)((ArrayList) (obj)).get(i);
        mSortedNodes.add(obj2);
        if (((Node) (obj2)).nodeDependents == null) goto _L9; else goto _L8
_L8:
        i1 = ((Node) (obj2)).nodeDependents.size();
        j = 0;
_L26:
        if (j >= i1) goto _L9; else goto _L10
_L10:
        node = (Node)((Node) (obj2)).nodeDependents.get(j);
        try
        {
            node.nodeDependencies.remove(obj2);
            if (node.nodeDependencies.size() == 0)
            {
                ((ArrayList) (obj1)).add(node);
            }
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        if (!flag) goto _L11; else goto _L9
_L9:
        if (!flag) goto _L12; else goto _L7
_L7:
        ((ArrayList) (obj)).clear();
        ((ArrayList) (obj)).addAll(((java.util.Collection) (obj1)));
        ((ArrayList) (obj1)).clear();
        if (!flag) goto _L14; else goto _L13
_L13:
        try
        {
            mNeedsSort = false;
            if (mSortedNodes.size() != mNodes.size())
            {
                throw new IllegalStateException(z);
            }
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (!flag) goto _L15; else goto _L2
_L2:
        int l;
        l = mNodes.size();
        i = 0;
_L23:
        if (i >= l) goto _L15; else goto _L16
_L16:
        illegalstateexception3 = (Node)mNodes.get(i);
        if (((Node) (illegalstateexception3)).dependencies == null) goto _L18; else goto _L17
_L17:
        j = ((Node) (illegalstateexception3)).dependencies.size();
        if (j <= 0) goto _L18; else goto _L19
_L19:
        int j1;
        j1 = ((Node) (illegalstateexception3)).dependencies.size();
        j = 0;
_L24:
        if (j >= j1) goto _L18; else goto _L20
_L20:
        Dependency dependency = (Dependency)((Node) (illegalstateexception3)).dependencies.get(j);
        IllegalStateException illegalstateexception4;
        try
        {
            if (((Node) (illegalstateexception3)).nodeDependencies == null)
            {
                illegalstateexception3.nodeDependencies = new ArrayList();
            }
        }
        catch (IllegalStateException illegalstateexception5)
        {
            throw illegalstateexception5;
        }
        try
        {
            if (!((Node) (illegalstateexception3)).nodeDependencies.contains(dependency.node))
            {
                ((Node) (illegalstateexception3)).nodeDependencies.add(dependency.node);
            }
        }
        catch (IllegalStateException illegalstateexception6)
        {
            throw illegalstateexception6;
        }
        if (!flag) goto _L21; else goto _L18
_L18:
        illegalstateexception3.done = false;
        if (!flag) goto _L22; else goto _L15
_L15:
        return;
        illegalstateexception4;
        throw illegalstateexception4;
_L22:
        i++;
          goto _L23
_L21:
        j++;
          goto _L24
_L12:
        i++;
          goto _L25
_L11:
        j++;
          goto _L26
_L5:
        i++;
        if (true) goto _L28; else goto _L27
_L27:
    }

    public void cancel()
    {
        boolean flag = Animator.a;
        mTerminated = true;
        if (!isStarted())
        {
            break MISSING_BLOCK_LABEL_196;
        }
        Object obj;
        Object obj1;
        int i;
        boolean flag1;
        if (mListeners != null)
        {
            obj = (ArrayList)mListeners.clone();
            Iterator iterator = ((ArrayList) (obj)).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ((Animator.AnimatorListener)iterator.next()).onAnimationCancel(this);
            } while (!flag);
        } else
        {
            obj = null;
        }
        obj1 = mDelayAnim;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        flag1 = mDelayAnim.isRunning();
        if (flag1)
        {
            try
            {
                mDelayAnim.cancel();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_153;
            }
        }
        i = mSortedNodes.size();
        if (i > 0)
        {
            obj1 = mSortedNodes.iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                ((Node)((Iterator) (obj1)).next()).animation.cancel();
            } while (!flag);
        }
        if (obj != null)
        {
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ((Animator.AnimatorListener)((Iterator) (obj)).next()).onAnimationEnd(this);
            } while (!flag);
        }
        mStarted = false;
        return;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
    }

    public Animator clone()
    {
        return clone();
    }

    public AnimatorSet clone()
    {
        boolean flag1 = Animator.a;
        AnimatorSet animatorset = (AnimatorSet)super.clone();
        animatorset.mNeedsSort = true;
        animatorset.mTerminated = false;
        animatorset.mStarted = false;
        animatorset.mPlayingSet = new ArrayList();
        animatorset.mNodeMap = new HashMap();
        animatorset.mNodes = new ArrayList();
        animatorset.mSortedNodes = new ArrayList();
        HashMap hashmap = new HashMap();
        Iterator iterator = mNodes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Node)iterator.next();
            Node node = ((Node) (obj)).clone();
            hashmap.put(obj, node);
            animatorset.mNodes.add(node);
            animatorset.mNodeMap.put(node.animation, node);
            node.dependencies = null;
            node.tmpDependencies = null;
            node.nodeDependents = null;
            node.nodeDependencies = null;
            Object obj3 = node.animation.getListeners();
            if (obj3 == null)
            {
                continue;
            }
            Iterator iterator1 = ((ArrayList) (obj3)).iterator();
            obj = null;
            do
            {
                Object obj1 = obj;
                if (!iterator1.hasNext())
                {
                    break;
                }
                Animator.AnimatorListener animatorlistener = (Animator.AnimatorListener)iterator1.next();
                Object obj2;
                boolean flag;
                try
                {
                    flag = animatorlistener instanceof AnimatorSetListener;
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                obj1 = obj;
                if (flag)
                {
                    obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = new ArrayList();
                    }
                    ((ArrayList) (obj1)).add(animatorlistener);
                }
                obj = obj1;
                if (!flag1)
                {
                    continue;
                }
                try
                {
                    flag = SherlockActivity.a;
                }
                catch (IllegalStateException illegalstateexception1)
                {
                    throw illegalstateexception1;
                }
                if (flag)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                SherlockActivity.a = flag;
                break;
            } while (true);
            if (obj1 != null)
            {
                obj = ((ArrayList) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    ((ArrayList) (obj3)).remove((Animator.AnimatorListener)((Iterator) (obj)).next());
                } while (!flag1);
            }
        } while (!flag1);
        obj = mNodes.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj2 = (Node)((Iterator) (obj)).next();
            obj1 = (Node)hashmap.get(obj2);
            if (((Node) (obj2)).dependencies != null)
            {
                obj2 = ((Node) (obj2)).dependencies.iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    obj3 = (Dependency)((Iterator) (obj2)).next();
                    ((Node) (obj1)).addDependency(new Dependency((Node)hashmap.get(((Dependency) (obj3)).node), ((Dependency) (obj3)).rule));
                } while (!flag1);
            }
        } while (!flag1);
        return animatorset;
    }

    public Object clone()
    {
        return clone();
    }

    public void end()
    {
label0:
        {
            boolean flag = Animator.a;
            int i;
            int j;
            try
            {
                mTerminated = true;
                if (!isStarted())
                {
                    break label0;
                }
                i = mSortedNodes.size();
                j = mNodes.size();
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            if (i != j)
            {
                sortNodes();
                Iterator iterator = mSortedNodes.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Node node = (Node)iterator.next();
                    try
                    {
                        if (mSetListener == null)
                        {
                            mSetListener = new AnimatorSetListener(this);
                        }
                    }
                    catch (IllegalStateException illegalstateexception1)
                    {
                        throw illegalstateexception1;
                    }
                    node.animation.addListener(mSetListener);
                } while (!flag);
            }
            try
            {
                if (mDelayAnim != null)
                {
                    mDelayAnim.cancel();
                }
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
            if (mSortedNodes.size() > 0)
            {
                iterator = mSortedNodes.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    ((Node)iterator.next()).animation.end();
                } while (!flag);
            }
            if (mListeners != null)
            {
                iterator = ((ArrayList)mListeners.clone()).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    ((Animator.AnimatorListener)iterator.next()).onAnimationEnd(this);
                } while (!flag);
            }
            mStarted = false;
        }
    }

    public boolean isStarted()
    {
        return mStarted;
    }

    public Builder play(Animator animator)
    {
        if (animator != null)
        {
            try
            {
                mNeedsSort = true;
                animator = new Builder(animator);
            }
            // Misplaced declaration of an exception variable
            catch (Animator animator)
            {
                throw animator;
            }
            return animator;
        } else
        {
            return null;
        }
    }

    public void start()
    {
        int i;
        boolean flag;
        int k;
        boolean flag1;
        flag = false;
        flag1 = Animator.a;
        mTerminated = false;
        mStarted = true;
        sortNodes();
        k = mSortedNodes.size();
        i = 0;
_L27:
        final Object nodesToStart;
        Object obj;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        nodesToStart = (Node)mSortedNodes.get(i);
        obj = ((Node) (nodesToStart)).animation.getListeners();
        if (obj == null) goto _L2; else goto _L1
_L1:
        int j;
        try
        {
            j = ((ArrayList) (obj)).size();
        }
        // Misplaced declaration of an exception variable
        catch (final Object nodesToStart)
        {
            throw nodesToStart;
        }
        if (j <= 0) goto _L2; else goto _L3
_L3:
        obj = (new ArrayList(((java.util.Collection) (obj)))).iterator();
_L4:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = (Animator.AnimatorListener)((Iterator) (obj)).next();
        int l;
        boolean flag2;
        try
        {
            flag2 = obj1 instanceof DependencyListener;
        }
        // Misplaced declaration of an exception variable
        catch (final Object nodesToStart)
        {
            try
            {
                throw nodesToStart;
            }
            // Misplaced declaration of an exception variable
            catch (final Object nodesToStart)
            {
                throw nodesToStart;
            }
        }
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        if (!(obj1 instanceof AnimatorSetListener))
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Node) (nodesToStart)).animation.removeListener(((Animator.AnimatorListener) (obj1)));
        if (!flag1) goto _L4; else goto _L2
_L2:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_628;
        }
        nodesToStart = new ArrayList();
        i = 0;
_L24:
        if (i >= k) goto _L6; else goto _L5
_L5:
        obj = (Node)mSortedNodes.get(i);
        try
        {
            if (mSetListener == null)
            {
                mSetListener = new AnimatorSetListener(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (final Object nodesToStart)
        {
            throw nodesToStart;
        }
        try
        {
            obj1 = ((Node) (obj)).dependencies;
        }
        // Misplaced declaration of an exception variable
        catch (final Object nodesToStart)
        {
            try
            {
                throw nodesToStart;
            }
            // Misplaced declaration of an exception variable
            catch (final Object nodesToStart)
            {
                throw nodesToStart;
            }
        }
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        if (((Node) (obj)).dependencies.size() != 0) goto _L9; else goto _L8
_L8:
        ((ArrayList) (nodesToStart)).add(obj);
        if (!flag1) goto _L10; else goto _L9
_L9:
        l = ((Node) (obj)).dependencies.size();
        j = 0;
_L25:
        if (j < l)
        {
            obj1 = (Dependency)((Node) (obj)).dependencies.get(j);
            ((Dependency) (obj1)).node.animation.addListener(new DependencyListener(((Node) (obj)), ((Dependency) (obj1)).rule));
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_619;
            }
        }
        obj.tmpDependencies = (ArrayList)((Node) (obj)).dependencies.clone();
_L10:
        ((Node) (obj)).animation.addListener(mSetListener);
        if (!flag1) goto _L11; else goto _L6
_L6:
        if (mStartDelay <= 0L)
        {
            nodesToStart = ((ArrayList) (nodesToStart)).iterator();
            do
            {
                if (!((Iterator) (nodesToStart)).hasNext())
                {
                    break;
                }
                obj = (Node)((Iterator) (nodesToStart)).next();
                ((Node) (obj)).animation.start();
                mPlayingSet.add(((Node) (obj)).animation);
            } while (!flag1);
        } else
        {
            mDelayAnim = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            mDelayAnim.setDuration(mStartDelay);
            mDelayAnim.addListener(new _cls1());
            mDelayAnim.start();
        }
        if (mListeners == null) goto _L13; else goto _L12
_L12:
        nodesToStart = (ArrayList)mListeners.clone();
        j = ((ArrayList) (nodesToStart)).size();
        i = 0;
_L23:
        if (i >= j) goto _L13; else goto _L14
_L14:
        ((Animator.AnimatorListener)((ArrayList) (nodesToStart)).get(i)).onAnimationStart(this);
        if (!flag1) goto _L15; else goto _L13
_L13:
        try
        {
            i = mNodes.size();
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (i != 0) goto _L17; else goto _L16
_L16:
        if (mStartDelay != 0L) goto _L17; else goto _L18
_L18:
        mStarted = false;
        nodesToStart = mListeners;
        if (nodesToStart == null) goto _L17; else goto _L19
_L19:
        nodesToStart = (ArrayList)mListeners.clone();
        j = ((ArrayList) (nodesToStart)).size();
        i = ((flag) ? 1 : 0);
_L22:
        if (i >= j) goto _L17; else goto _L20
_L20:
        ((Animator.AnimatorListener)((ArrayList) (nodesToStart)).get(i)).onAnimationEnd(this);
        if (!flag1) goto _L21; else goto _L17
_L17:
        return;
_L21:
        i++;
        if (true) goto _L22; else goto _L15
_L15:
        i++;
        if (true) goto _L23; else goto _L11
_L11:
        i++;
          goto _L24
        j++;
          goto _L25
        i++;
        if (true) goto _L27; else goto _L26
_L26:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "Y*nw9v\"n4(\1773yz(\177-\177})ic\177u\"t,h4)b*o`ls-<U\"s.}`#h\020y`".toCharArray();
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
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 76;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 26;
          goto _L8
_L3:
        byte0 = 67;
          goto _L8
_L4:
        byte0 = 28;
          goto _L8
        byte0 = 20;
          goto _L8
    }





/*
    static boolean access$302(AnimatorSet animatorset, boolean flag)
    {
        animatorset.mStarted = flag;
        return flag;
    }

*/


    private class Node
        implements Cloneable
    {

        public Animator animation;
        public ArrayList dependencies;
        public boolean done;
        public ArrayList nodeDependencies;
        public ArrayList nodeDependents;
        public ArrayList tmpDependencies;

        public void addDependency(Dependency dependency)
        {
            if (dependencies == null)
            {
                dependencies = new ArrayList();
                nodeDependencies = new ArrayList();
            }
            dependencies.add(dependency);
            if (!nodeDependencies.contains(dependency.node))
            {
                nodeDependencies.add(dependency.node);
            }
            dependency = dependency.node;
            if (((Node) (dependency)).nodeDependents == null)
            {
                dependency.nodeDependents = new ArrayList();
            }
            ((Node) (dependency)).nodeDependents.add(this);
        }

        public Node clone()
        {
            Node node;
            try
            {
                node = (Node)super.clone();
                node.animation = animation.clone();
            }
            catch (CloneNotSupportedException clonenotsupportedexception)
            {
                throw new AssertionError();
            }
            return node;
        }

        public Object clone()
        {
            return clone();
        }

        public Node(Animator animator)
        {
            dependencies = null;
            tmpDependencies = null;
            nodeDependencies = null;
            nodeDependents = null;
            done = false;
            animation = animator;
        }
    }


    private class Dependency
    {

        public Node node;
        public int rule;

        public Dependency(Node node1, int i)
        {
            node = node1;
            rule = i;
        }
    }


    private class AnimatorSetListener
        implements Animator.AnimatorListener
    {

        private AnimatorSet mAnimatorSet;
        final AnimatorSet this$0;

        public void onAnimationCancel(Animator animator)
        {
            boolean flag = Animator.a;
            if (mTerminated || mPlayingSet.size() != 0 || mListeners == null) goto _L2; else goto _L1
_L1:
            int i;
            int j;
            j = mListeners.size();
            i = 0;
_L6:
            if (i >= j) goto _L2; else goto _L3
_L3:
            ((Animator.AnimatorListener)mListeners.get(i)).onAnimationCancel(mAnimatorSet);
            if (!flag) goto _L4; else goto _L2
_L2:
            return;
_L4:
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public void onAnimationEnd(Animator animator)
        {
            int i;
            boolean flag;
            i = 1;
            flag = Animator.a;
            animator.removeListener(this);
            mPlayingSet.remove(animator);
            ((Node)mAnimatorSet.mNodeMap.get(animator)).done = true;
            if (mTerminated) goto _L2; else goto _L1
_L1:
            int j;
            int k;
            animator = mAnimatorSet.mSortedNodes;
            k = animator.size();
            j = 0;
_L12:
            if (j >= k) goto _L4; else goto _L3
_L3:
            if (!((Node)animator.get(j)).done)
            {
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_186;
                }
                i = 0;
            }
            if (!flag) goto _L5; else goto _L4
_L4:
            if (i == 0) goto _L2; else goto _L6
_L6:
            if (mListeners == null) goto _L8; else goto _L7
_L7:
            animator = (ArrayList)mListeners.clone();
            j = animator.size();
            i = 0;
_L11:
            if (i >= j) goto _L8; else goto _L9
_L9:
            ((Animator.AnimatorListener)animator.get(i)).onAnimationEnd(mAnimatorSet);
            if (!flag) goto _L10; else goto _L8
_L8:
            mAnimatorSet.mStarted = false;
_L2:
            return;
_L10:
            i++;
            if (true) goto _L11; else goto _L5
_L5:
            j++;
              goto _L12
            i = 0;
              goto _L4
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
        }

        AnimatorSetListener(AnimatorSet animatorset1)
        {
            this$0 = AnimatorSet.this;
            super();
            mAnimatorSet = animatorset1;
        }
    }


    private class Builder
    {

        private Node mCurrentNode;
        final AnimatorSet this$0;

        public Builder with(Animator animator)
        {
            Node node1 = (Node)mNodeMap.get(animator);
            Node node = node1;
            if (node1 == null)
            {
                node = new Node(animator);
                mNodeMap.put(animator, node);
                mNodes.add(node);
            }
            node.addDependency(new Dependency(mCurrentNode, 0));
            return this;
        }

        Builder(Animator animator)
        {
            this$0 = AnimatorSet.this;
            super();
            mCurrentNode = (Node)mNodeMap.get(animator);
            if (mCurrentNode == null)
            {
                mCurrentNode = new Node(animator);
                mNodeMap.put(animator, mCurrentNode);
                mNodes.add(mCurrentNode);
            }
        }
    }


    private class DependencyListener
        implements Animator.AnimatorListener
    {

        private AnimatorSet mAnimatorSet;
        private Node mNode;
        private int mRule;

        private void startIfReady(Animator animator)
        {
            if (!mAnimatorSet.mTerminated) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int i;
            int j;
            j = mNode.tmpDependencies.size();
            i = 0;
_L5:
            Dependency dependency;
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            dependency = (Dependency)mNode.tmpDependencies.get(i);
            if (dependency.rule != mRule || dependency.node.animation != animator) goto _L4; else goto _L3
_L3:
            animator.removeListener(this);
            animator = dependency;
_L6:
            mNode.tmpDependencies.remove(animator);
            if (mNode.tmpDependencies.size() == 0)
            {
                mNode.animation.start();
                mAnimatorSet.mPlayingSet.add(mNode.animation);
                return;
            }
              goto _L1
_L4:
            i++;
              goto _L5
            animator = null;
              goto _L6
        }

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
            if (mRule == 1)
            {
                startIfReady(animator);
            }
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
            if (mRule == 0)
            {
                startIfReady(animator);
            }
        }

        public DependencyListener(Node node, int i)
        {
            mAnimatorSet = AnimatorSet.this;
            mNode = node;
            mRule = i;
        }
    }


    private class _cls1 extends AnimatorListenerAdapter
    {

        boolean canceled;
        final AnimatorSet this$0;
        final ArrayList val$nodesToStart;

        public void onAnimationCancel(Animator animator)
        {
            canceled = true;
        }

        public void onAnimationEnd(Animator animator)
        {
            boolean flag = Animator.a;
            if (canceled) goto _L2; else goto _L1
_L1:
            int i;
            int j;
            j = nodesToStart.size();
            i = 0;
_L6:
            if (i >= j) goto _L2; else goto _L3
_L3:
            animator = (Node)nodesToStart.get(i);
            ((Node) (animator)).animation.start();
            mPlayingSet.add(((Node) (animator)).animation);
            if (!flag) goto _L4; else goto _L2
_L2:
            return;
_L4:
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }

        _cls1()
        {
            this$0 = AnimatorSet.this;
            nodesToStart = arraylist;
            super();
            canceled = false;
        }
    }

}
