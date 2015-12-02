// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            Animator, AnimatorSet

class mAnimatorSet
    implements mAnimatorSet
{

    private AnimatorSet mAnimatorSet;
    final AnimatorSet this$0;

    public void onAnimationCancel(Animator animator)
    {
        boolean flag = Animator.a;
        if (mTerminated || AnimatorSet.access$000(AnimatorSet.this).size() != 0 || mListeners == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = mListeners.size();
        i = 0;
_L6:
        if (i >= j) goto _L2; else goto _L3
_L3:
        ((this._cls0)mListeners.get(i)).ationCancel(mAnimatorSet);
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
        AnimatorSet.access$000(AnimatorSet.this).remove(animator);
        ((this._cls0)AnimatorSet.access$100(mAnimatorSet).get(animator)).mAnimatorSet = true;
        if (mTerminated) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        animator = AnimatorSet.access$200(mAnimatorSet);
        k = animator.size();
        j = 0;
_L12:
        if (j >= k) goto _L4; else goto _L3
_L3:
        if (!((mAnimatorSet)animator.get(j)).mAnimatorSet)
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
        ((mAnimatorSet)animator.get(i)).ationEnd(mAnimatorSet);
        if (!flag) goto _L10; else goto _L8
_L8:
        AnimatorSet.access$302(mAnimatorSet, false);
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

    (AnimatorSet animatorset1)
    {
        this$0 = AnimatorSet.this;
        super();
        mAnimatorSet = animatorset1;
    }
}
