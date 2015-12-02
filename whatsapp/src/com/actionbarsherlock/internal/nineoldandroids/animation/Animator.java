// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import java.util.ArrayList;

public abstract class Animator
    implements Cloneable
{

    public static boolean a;
    ArrayList mListeners;

    public Animator()
    {
        mListeners = null;
    }

    public void addListener(AnimatorListener animatorlistener)
    {
        if (mListeners == null)
        {
            mListeners = new ArrayList();
        }
        mListeners.add(animatorlistener);
    }

    public void cancel()
    {
    }

    public Animator clone()
    {
        boolean flag = a;
        Animator animator;
        ArrayList arraylist;
        int j;
        animator = (Animator)super.clone();
        if (mListeners == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        arraylist = mListeners;
        animator.mListeners = new ArrayList();
        j = arraylist.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            try
            {
                animator.mListeners.add(arraylist.get(i));
            }
            catch (CloneNotSupportedException clonenotsupportedexception)
            {
                throw new AssertionError();
            }
            i++;
        } while (!flag);
        return animator;
    }

    public Object clone()
    {
        return clone();
    }

    public void end()
    {
    }

    public ArrayList getListeners()
    {
        return mListeners;
    }

    public void removeListener(AnimatorListener animatorlistener)
    {
        if (mListeners != null)
        {
            mListeners.remove(animatorlistener);
            if (mListeners.size() == 0)
            {
                mListeners = null;
                return;
            }
        }
    }

    public void start()
    {
    }
}
