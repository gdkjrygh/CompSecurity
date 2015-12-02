// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.actionbarsherlock.app.SherlockActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            Animator, PropertyValuesHolder

public class ValueAnimator extends Animator
{

    private static ThreadLocal sAnimationHandler;
    private static final ThreadLocal sAnimations;
    private static final Interpolator sDefaultInterpolator;
    private static final ThreadLocal sDelayedAnims;
    private static final ThreadLocal sEndingAnims;
    private static long sFrameDelay;
    private static final ThreadLocal sPendingAnimations;
    private static final ThreadLocal sReadyAnims;
    private static final String z[];
    private float mCurrentFraction;
    private int mCurrentIteration;
    private long mDelayStartTime;
    private long mDuration;
    boolean mInitialized;
    private Interpolator mInterpolator;
    private boolean mPlayingBackwards;
    int mPlayingState;
    private int mRepeatCount;
    private int mRepeatMode;
    private boolean mRunning;
    long mSeekTime;
    private long mStartDelay;
    long mStartTime;
    private boolean mStarted;
    private boolean mStartedDelay;
    private ArrayList mUpdateListeners;
    PropertyValuesHolder mValues[];
    HashMap mValuesMap;

    public ValueAnimator()
    {
        boolean flag = false;
        boolean flag1 = Animator.a;
        super();
        mSeekTime = -1L;
        mPlayingBackwards = false;
        mCurrentIteration = 0;
        mCurrentFraction = 0.0F;
        mStartedDelay = false;
        mPlayingState = 0;
        mRunning = false;
        mStarted = false;
        mInitialized = false;
        mDuration = 300L;
        mStartDelay = 0L;
        mRepeatCount = 0;
        mRepeatMode = 1;
        mInterpolator = sDefaultInterpolator;
        mUpdateListeners = null;
        if (SherlockActivity.a)
        {
            if (!flag1)
            {
                flag = true;
            }
            Animator.a = flag;
        }
    }

    private boolean delayedAnimationFrame(long l)
    {
label0:
        {
label1:
            {
                long l1;
                boolean flag;
                try
                {
                    if (mStartedDelay)
                    {
                        break label1;
                    }
                    mStartedDelay = true;
                    mDelayStartTime = l;
                    flag = Animator.a;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            l1 = l - mDelayStartTime;
            try
            {
                if (l1 <= mStartDelay)
                {
                    break label0;
                }
                mStartTime = l - (l1 - mStartDelay);
                mPlayingState = 1;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            return true;
        }
        return false;
    }

    private void endAnimation()
    {
        boolean flag = Animator.a;
        ((ArrayList)sAnimations.get()).remove(this);
        ((ArrayList)sPendingAnimations.get()).remove(this);
        ((ArrayList)sDelayedAnims.get()).remove(this);
        mPlayingState = 0;
        if (!mRunning) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = mListeners;
        if (arraylist == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        arraylist = (ArrayList)mListeners.clone();
        j = arraylist.size();
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L4
_L4:
        ((Animator.AnimatorListener)arraylist.get(i)).onAnimationEnd(this);
        if (!flag) goto _L5; else goto _L2
_L2:
        mRunning = false;
        mStarted = false;
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static ValueAnimator ofFloat(float af[])
    {
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setFloatValues(af);
        return valueanimator;
    }

    private void start(boolean flag)
    {
        boolean flag1;
        flag1 = Animator.a;
        try
        {
            if (Looper.myLooper() == null)
            {
                throw new AndroidRuntimeException(z[0]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        mPlayingBackwards = flag;
        mCurrentIteration = 0;
        mPlayingState = 0;
        mStarted = true;
        mStartedDelay = false;
        ((ArrayList)sPendingAnimations.get()).add(this);
        if (mStartDelay != 0L) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        setCurrentPlayTime(getCurrentPlayTime());
        mPlayingState = 0;
        mRunning = true;
        arraylist = mListeners;
        if (arraylist == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        arraylist = (ArrayList)mListeners.clone();
        j = arraylist.size();
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L4
_L4:
        ((Animator.AnimatorListener)arraylist.get(i)).onAnimationStart(this);
        if (!flag1) goto _L5; else goto _L2
_L2:
        AnimationHandler animationhandler1 = (AnimationHandler)sAnimationHandler.get();
        AnimationHandler animationhandler = animationhandler1;
        if (animationhandler1 == null)
        {
            animationhandler = new AnimationHandler(null);
            sAnimationHandler.set(animationhandler);
        }
        animationhandler.sendEmptyMessage(0);
        return;
        IllegalArgumentException illegalargumentexception1;
        illegalargumentexception1;
        throw illegalargumentexception1;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void startAnimation()
    {
        boolean flag = Animator.a;
        initAnimation();
        ((ArrayList)sAnimations.get()).add(this);
        if (mStartDelay <= 0L) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = mListeners;
        if (arraylist == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        arraylist = (ArrayList)mListeners.clone();
        j = arraylist.size();
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L4
_L4:
        ((Animator.AnimatorListener)arraylist.get(i)).onAnimationStart(this);
        if (!flag) goto _L5; else goto _L2
_L2:
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    void animateValue(float f)
    {
        boolean flag;
        flag = Animator.a;
        f = mInterpolator.getInterpolation(f);
        mCurrentFraction = f;
        int k = mValues.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            mValues[i].calculateValue(f);
            i++;
        } while (!flag);
        if (mUpdateListeners == null) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        l = mUpdateListeners.size();
        j = 0;
_L6:
        if (j >= l) goto _L2; else goto _L3
_L3:
        ((AnimatorUpdateListener)mUpdateListeners.get(j)).onAnimationUpdate(this);
        if (!flag) goto _L4; else goto _L2
_L2:
        return;
_L4:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    boolean animationFrame(long l)
    {
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = Animator.a;
        int i = mPlayingState;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        long l1;
        mPlayingState = 1;
        l1 = mSeekTime;
        if (l1 < 0L)
        {
            IllegalArgumentException illegalargumentexception;
            try
            {
                mStartTime = l;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_64;
            }
        }
        mStartTime = l - mSeekTime;
        mSeekTime = -1L;
        float f1;
        boolean flag;
        float f;
        ArrayList arraylist;
        int j;
        try
        {
            i = mPlayingState;
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            try
            {
                throw illegalargumentexception2;
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
        }
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_113;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        if (mDuration <= 0L) goto _L2; else goto _L1
_L1:
        f = l - mStartTime;
        l = mDuration;
        f1 = f / (float)l;
_L11:
        f = f1;
        flag = flag1;
        if (f1 < 1.0F) goto _L4; else goto _L3
_L3:
        try
        {
            i = mCurrentIteration;
            j = mRepeatCount;
        }
        catch (IllegalArgumentException illegalargumentexception4)
        {
            try
            {
                throw illegalargumentexception4;
            }
            catch (IllegalArgumentException illegalargumentexception5)
            {
                throw illegalargumentexception5;
            }
        }
        if (i < j) goto _L6; else goto _L5
_L5:
        f = f1;
        if (mRepeatCount != -1) goto _L7; else goto _L6
_L6:
        arraylist = mListeners;
        if (arraylist == null) goto _L9; else goto _L8
_L8:
        j = mListeners.size();
        i = 0;
_L12:
        if (i < j)
        {
            ((Animator.AnimatorListener)mListeners.get(i)).onAnimationRepeat(this);
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_391;
            }
        }
_L9:
        i = mRepeatMode;
        if (i == 2)
        {
            IllegalArgumentException illegalargumentexception6;
            try
            {
                flag = mPlayingBackwards;
            }
            catch (IllegalArgumentException illegalargumentexception7)
            {
                throw illegalargumentexception7;
            }
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            mPlayingBackwards = flag;
        }
        mCurrentIteration = mCurrentIteration + (int)f1;
        f1 %= 1.0F;
        mStartTime = mStartTime + mDuration;
        f = f1;
        flag = flag1;
        if (!flag2) goto _L4; else goto _L10
_L10:
        f = f1;
_L7:
        f = Math.min(f, 1.0F);
        flag = true;
_L4:
        f1 = f;
        if (mPlayingBackwards)
        {
            f1 = 1.0F - f;
        }
        animateValue(f1);
        return flag;
_L2:
        f1 = 1.0F;
          goto _L11
        illegalargumentexception6;
        throw illegalargumentexception6;
        i++;
          goto _L12
    }

    public void cancel()
    {
        boolean flag = Animator.a;
        int i = mPlayingState;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        boolean flag1 = ((ArrayList)sPendingAnimations.get()).contains(this);
        if (!flag1)
        {
            Object obj;
            IllegalArgumentException illegalargumentexception;
            boolean flag2;
            try
            {
                flag2 = ((ArrayList)sDelayedAnims.get()).contains(this);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                try
                {
                    throw illegalargumentexception1;
                }
                catch (IllegalArgumentException illegalargumentexception2)
                {
                    throw illegalargumentexception2;
                }
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_115;
            }
        }
        if (!mRunning)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        obj = mListeners;
        if (obj != null)
        {
            obj = ((ArrayList)mListeners.clone()).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ((Animator.AnimatorListener)((Iterator) (obj)).next()).onAnimationCancel(this);
            } while (!flag);
        }
        endAnimation();
        return;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public Animator clone()
    {
        return clone();
    }

    public ValueAnimator clone()
    {
        boolean flag = false;
        boolean flag1 = Animator.a;
        ValueAnimator valueanimator = (ValueAnimator)super.clone();
        if (mUpdateListeners != null)
        {
            ArrayList arraylist = mUpdateListeners;
            valueanimator.mUpdateListeners = new ArrayList();
            int k = arraylist.size();
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                valueanimator.mUpdateListeners.add(arraylist.get(i));
                i++;
            } while (!flag1);
        }
        valueanimator.mSeekTime = -1L;
        valueanimator.mPlayingBackwards = false;
        valueanimator.mCurrentIteration = 0;
        valueanimator.mInitialized = false;
        valueanimator.mPlayingState = 0;
        valueanimator.mStartedDelay = false;
        PropertyValuesHolder apropertyvaluesholder[] = mValues;
        if (apropertyvaluesholder != null)
        {
            int l = apropertyvaluesholder.length;
            valueanimator.mValues = new PropertyValuesHolder[l];
            valueanimator.mValuesMap = new HashMap(l);
            int j = ((flag) ? 1 : 0);
            do
            {
                if (j >= l)
                {
                    break;
                }
                PropertyValuesHolder propertyvaluesholder = apropertyvaluesholder[j].clone();
                valueanimator.mValues[j] = propertyvaluesholder;
                valueanimator.mValuesMap.put(propertyvaluesholder.getPropertyName(), propertyvaluesholder);
                j++;
            } while (!flag1);
        }
        return valueanimator;
    }

    public Object clone()
    {
        return clone();
    }

    public void end()
    {
        boolean flag = Animator.a;
        boolean flag1 = ((ArrayList)sAnimations.get()).contains(this);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        flag1 = ((ArrayList)sPendingAnimations.get()).contains(this);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        mStartedDelay = false;
        startAnimation();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        int i;
        try
        {
            if (!mInitialized)
            {
                initAnimation();
            }
        }
        // Misplaced declaration of an exception variable
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        i = mRepeatCount;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        i = mRepeatCount;
        if ((i & 1) == 1)
        {
            IllegalArgumentException illegalargumentexception;
            try
            {
                animateValue(0.0F);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_103;
            }
        }
        animateValue(1.0F);
        endAnimation();
        return;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public long getCurrentPlayTime()
    {
        boolean flag;
        try
        {
            flag = mInitialized;
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
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (mPlayingState != 0)
        {
            return AnimationUtils.currentAnimationTimeMillis() - mStartTime;
        }
        return 0L;
    }

    void initAnimation()
    {
        boolean flag = Animator.a;
        if (!mInitialized)
        {
            int j = mValues.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                mValues[i].init();
                i++;
            } while (!flag);
            mInitialized = true;
        }
    }

    public boolean isRunning()
    {
        boolean flag;
        flag = true;
        int i;
        try
        {
            i = mPlayingState;
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
        if (i == 1)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (mRunning)
        {
            return true;
        }
        flag = false;
        return flag;
    }

    public void setCurrentPlayTime(long l)
    {
        initAnimation();
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        try
        {
            if (mPlayingState != 1)
            {
                mSeekTime = l;
                mPlayingState = 2;
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        mStartTime = l1 - l;
        animationFrame(l1);
    }

    public ValueAnimator setDuration(long l)
    {
        if (l < 0L)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[1]).append(l).toString());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            mDuration = l;
            return this;
        }
    }

    public void setFloatValues(float af[])
    {
label0:
        {
            if (af != null)
            {
                int i;
                try
                {
                    i = af.length;
                }
                // Misplaced declaration of an exception variable
                catch (float af[])
                {
                    throw af;
                }
                if (i != 0)
                {
                    break label0;
                }
            }
            return;
        }
        PropertyValuesHolder apropertyvaluesholder[];
        boolean flag;
        try
        {
            apropertyvaluesholder = mValues;
        }
        // Misplaced declaration of an exception variable
        catch (float af[])
        {
            try
            {
                throw af;
            }
            // Misplaced declaration of an exception variable
            catch (float af[])
            {
                throw af;
            }
        }
        if (apropertyvaluesholder == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (mValues.length != 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        setValues(new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("", af)
        });
        flag = Animator.a;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        mValues[0].setFloatValues(af);
        mInitialized = false;
        return;
    }

    public void setInterpolator(Interpolator interpolator)
    {
        if (interpolator == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        mInterpolator = interpolator;
        if (!Animator.a)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        mInterpolator = new LinearInterpolator();
        return;
        interpolator;
        throw interpolator;
    }

    public void setStartDelay(long l)
    {
        mStartDelay = l;
    }

    public void setValues(PropertyValuesHolder apropertyvaluesholder[])
    {
        boolean flag = Animator.a;
        int j = apropertyvaluesholder.length;
        mValues = apropertyvaluesholder;
        mValuesMap = new HashMap(j);
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            PropertyValuesHolder propertyvaluesholder = apropertyvaluesholder[i];
            mValuesMap.put(propertyvaluesholder.getPropertyName(), propertyvaluesholder);
            i++;
        } while (!flag);
        mInitialized = false;
    }

    public void start()
    {
        start(false);
    }

    public String toString()
    {
        boolean flag = Animator.a;
        String s = (new StringBuilder()).append(z[3]).append(Integer.toHexString(hashCode())).toString();
        String s1 = s;
        if (mValues != null)
        {
            int i = 0;
            do
            {
                s1 = s;
                if (i >= mValues.length)
                {
                    break;
                }
                s1 = (new StringBuilder()).append(s).append(z[2]).append(mValues[i].toString()).toString();
                i++;
                s = s1;
            } while (!flag);
        }
        return s1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "X!:2;m !,zt.*\1775w#*\1778|o!*49 =\177\026v #:(9;;-?x+ ";
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
                obj = "X!:2;m !,zz.=15mo;>,|o=:=x;:)?9+&-;m&<1`9";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\023os\177z";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "O.?*?X!:2;m !\037";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                sAnimationHandler = new ThreadLocal();
                sAnimations = new _cls1();
                sPendingAnimations = new _cls2();
                sDelayedAnims = new _cls3();
                sEndingAnims = new _cls4();
                sReadyAnims = new _cls5();
                sDefaultInterpolator = new AccelerateDecelerateInterpolator();
                sFrameDelay = 10L;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 252
    //                   0 273
    //                   1 279
    //                   2 285
    //                   3 291;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_291;
_L3:
        byte byte0 = 90;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 25;
          goto _L9
_L5:
        byte0 = 79;
          goto _L9
_L6:
        byte0 = 83;
          goto _L9
        byte0 = 95;
          goto _L9
    }











/*
    static boolean access$802(ValueAnimator valueanimator, boolean flag)
    {
        valueanimator.mRunning = flag;
        return flag;
    }

*/


    private class AnimationHandler extends Handler
    {

        public void handleMessage(Message message)
        {
            ArrayList arraylist;
            ArrayList arraylist1;
            boolean flag1;
            flag1 = Animator.a;
            arraylist = (ArrayList)ValueAnimator.sAnimations.get();
            arraylist1 = (ArrayList)ValueAnimator.sDelayedAnims.get();
            message.what;
            JVM INSTR tableswitch 0 1: default 52
        //                       0 53
        //                       1 544;
               goto _L1 _L2 _L3
_L1:
            return;
_L2:
            boolean flag;
            message = (ArrayList)ValueAnimator.sPendingAnimations.get();
            Object obj;
            ValueAnimator valueanimator;
            int i;
            int j;
            int k;
            int l;
            long l1;
            if (arraylist.size() > 0 || arraylist1.size() > 0)
            {
                i = 0;
            } else
            {
                i = 1;
            }
_L12:
            flag = i;
            if (message.size() <= 0) goto _L5; else goto _L4
_L4:
            obj = (ArrayList)message.clone();
            message.clear();
            k = ((ArrayList) (obj)).size();
            j = 0;
_L36:
            if (j >= k)
            {
                continue; /* Loop/switch isn't completed */
            }
            valueanimator = (ValueAnimator)((ArrayList) (obj)).get(j);
            if (valueanimator.mStartDelay != 0L) goto _L7; else goto _L6
_L6:
            valueanimator.startAnimation();
            if (!flag1) goto _L8; else goto _L7
_L7:
            arraylist1.add(valueanimator);
_L8:
            if (!flag1) goto _L10; else goto _L9
_L9:
            if (!flag1) goto _L12; else goto _L11
_L11:
            flag = i;
_L5:
            l1 = AnimationUtils.currentAnimationTimeMillis();
            obj = (ArrayList)ValueAnimator.sReadyAnims.get();
            message = (ArrayList)ValueAnimator.sEndingAnims.get();
            j = arraylist1.size();
            i = 0;
_L35:
            if (i >= j) goto _L14; else goto _L13
_L13:
            valueanimator = (ValueAnimator)arraylist1.get(i);
            if (valueanimator.delayedAnimationFrame(l1))
            {
                ((ArrayList) (obj)).add(valueanimator);
            }
            if (!flag1) goto _L15; else goto _L14
_L14:
            j = ((ArrayList) (obj)).size();
            if (j <= 0) goto _L17; else goto _L16
_L16:
            i = 0;
_L34:
            if (i >= j) goto _L19; else goto _L18
_L18:
            valueanimator = (ValueAnimator)((ArrayList) (obj)).get(i);
            valueanimator.startAnimation();
            valueanimator.mRunning = true;
            arraylist1.remove(valueanimator);
            if (!flag1) goto _L20; else goto _L19
_L19:
            ((ArrayList) (obj)).clear();
_L17:
            i = arraylist.size();
            k = 0;
_L33:
            if (k >= i) goto _L22; else goto _L21
_L21:
            obj = (ValueAnimator)arraylist.get(k);
            if (((ValueAnimator) (obj)).animationFrame(l1))
            {
                message.add(obj);
            }
            j = k;
            if (arraylist.size() != i) goto _L24; else goto _L23
_L23:
            l = k + 1;
            j = l;
            k = i;
            if (!flag1) goto _L26; else goto _L25
_L25:
            j = l;
_L24:
            k = i - 1;
            message.remove(obj);
_L26:
            if (!flag1) goto _L27; else goto _L22
_L22:
            if (message.size() <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = 0;
_L32:
            if (i >= message.size()) goto _L29; else goto _L28
_L28:
            ((ValueAnimator)message.get(i)).endAnimation();
            if (!flag1) goto _L30; else goto _L29
_L29:
            message.clear();
            if (!flag || arraylist.isEmpty() && arraylist1.isEmpty()) goto _L1; else goto _L31
_L31:
            sendEmptyMessageDelayed(1, Math.max(0L, ValueAnimator.sFrameDelay - (AnimationUtils.currentAnimationTimeMillis() - l1)));
            return;
_L30:
            i++;
              goto _L32
_L27:
            i = k;
            k = j;
              goto _L33
_L20:
            i++;
              goto _L34
_L15:
            i++;
              goto _L35
_L10:
            j++;
              goto _L36
_L3:
            flag = true;
              goto _L5
        }

        private AnimationHandler()
        {
        }

        AnimationHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class AnimatorUpdateListener
    {

        public abstract void onAnimationUpdate(ValueAnimator valueanimator);
    }


    private class _cls1 extends ThreadLocal
    {

        protected Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

        _cls1()
        {
        }
    }


    private class _cls2 extends ThreadLocal
    {

        protected Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

        _cls2()
        {
        }
    }


    private class _cls3 extends ThreadLocal
    {

        protected Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

        _cls3()
        {
        }
    }


    private class _cls4 extends ThreadLocal
    {

        protected Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

        _cls4()
        {
        }
    }


    private class _cls5 extends ThreadLocal
    {

        protected Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

        _cls5()
        {
        }
    }

}
