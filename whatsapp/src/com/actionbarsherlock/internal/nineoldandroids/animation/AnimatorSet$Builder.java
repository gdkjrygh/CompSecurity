// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            AnimatorSet, Animator

public class mCurrentNode
{

    private mCurrentNode mCurrentNode;
    final AnimatorSet this$0;

    public mCurrentNode with(Animator animator)
    {
        cy cy1 = (cy)AnimatorSet.access$100(AnimatorSet.this).get(animator);
        cy cy = cy1;
        if (cy1 == null)
        {
            cy = new it>(animator);
            AnimatorSet.access$100(AnimatorSet.this).put(animator, cy);
            AnimatorSet.access$400(AnimatorSet.this).add(cy);
        }
        cy.Dependency(new cy(mCurrentNode, 0));
        return this;
    }

    cy(Animator animator)
    {
        this$0 = AnimatorSet.this;
        super();
        mCurrentNode = (mCurrentNode)AnimatorSet.access$100(AnimatorSet.this).get(animator);
        if (mCurrentNode == null)
        {
            mCurrentNode = new it>(animator);
            AnimatorSet.access$100(AnimatorSet.this).put(animator, mCurrentNode);
            AnimatorSet.access$400(AnimatorSet.this).add(mCurrentNode);
        }
    }
}
