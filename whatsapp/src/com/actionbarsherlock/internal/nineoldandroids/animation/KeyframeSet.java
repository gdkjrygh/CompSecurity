// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            Keyframe, Animator, FloatKeyframeSet, TypeEvaluator

class KeyframeSet
{

    private static final String z;
    TypeEvaluator mEvaluator;
    Keyframe mFirstKeyframe;
    Interpolator mInterpolator;
    ArrayList mKeyframes;
    Keyframe mLastKeyframe;
    int mNumKeyframes;

    public KeyframeSet(Keyframe akeyframe[])
    {
        mNumKeyframes = akeyframe.length;
        mKeyframes = new ArrayList();
        mKeyframes.addAll(Arrays.asList(akeyframe));
        mFirstKeyframe = (Keyframe)mKeyframes.get(0);
        mLastKeyframe = (Keyframe)mKeyframes.get(mNumKeyframes - 1);
        mInterpolator = mLastKeyframe.getInterpolator();
    }

    public static KeyframeSet ofFloat(float af[])
    {
        Keyframe.FloatKeyframe afloatkeyframe[];
        int i;
        int j;
        boolean flag;
        i = 1;
        flag = Animator.a;
        j = af.length;
        afloatkeyframe = new Keyframe.FloatKeyframe[Math.max(j, 2)];
        if (j != 1) goto _L2; else goto _L1
_L1:
        afloatkeyframe[0] = (Keyframe.FloatKeyframe)Keyframe.ofFloat(0.0F);
        afloatkeyframe[1] = (Keyframe.FloatKeyframe)Keyframe.ofFloat(1.0F, af[0]);
        if (!flag) goto _L3; else goto _L2
_L2:
        afloatkeyframe[0] = (Keyframe.FloatKeyframe)Keyframe.ofFloat(0.0F, af[0]);
_L7:
        if (i >= j) goto _L3; else goto _L4
_L4:
        afloatkeyframe[i] = (Keyframe.FloatKeyframe)Keyframe.ofFloat((float)i / (float)(j - 1), af[i]);
        if (!flag) goto _L5; else goto _L3
_L3:
        return new FloatKeyframeSet(afloatkeyframe);
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public KeyframeSet clone()
    {
        boolean flag = Animator.a;
        ArrayList arraylist = mKeyframes;
        int j = mKeyframes.size();
        Keyframe akeyframe[] = new Keyframe[j];
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    akeyframe[i] = ((Keyframe)arraylist.get(i)).clone();
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return new KeyframeSet(akeyframe);
            }
            i++;
        } while (true);
    }

    public Object clone()
    {
        return clone();
    }

    public Object getValue(float f)
    {
        boolean flag = Animator.a;
        if (mNumKeyframes == 2)
        {
            float f1 = f;
            if (mInterpolator != null)
            {
                f1 = mInterpolator.getInterpolation(f);
            }
            return mEvaluator.evaluate(f1, mFirstKeyframe.getValue(), mLastKeyframe.getValue());
        }
        if (f <= 0.0F)
        {
            Keyframe keyframe = (Keyframe)mKeyframes.get(1);
            Interpolator interpolator = keyframe.getInterpolator();
            float f2 = f;
            if (interpolator != null)
            {
                f2 = interpolator.getInterpolation(f);
            }
            f = mFirstKeyframe.getFraction();
            f = (f2 - f) / (keyframe.getFraction() - f);
            return mEvaluator.evaluate(f, mFirstKeyframe.getValue(), keyframe.getValue());
        }
        if (f >= 1.0F)
        {
            Keyframe keyframe1 = (Keyframe)mKeyframes.get(mNumKeyframes - 2);
            Interpolator interpolator1 = mLastKeyframe.getInterpolator();
            float f3 = f;
            if (interpolator1 != null)
            {
                f3 = interpolator1.getInterpolation(f);
            }
            f = keyframe1.getFraction();
            f = (f3 - f) / (mLastKeyframe.getFraction() - f);
            return mEvaluator.evaluate(f, keyframe1.getValue(), mLastKeyframe.getValue());
        }
        Keyframe keyframe2 = mFirstKeyframe;
        int i = 1;
        do
        {
            Keyframe keyframe3;
label0:
            {
                if (i < mNumKeyframes)
                {
                    keyframe3 = (Keyframe)mKeyframes.get(i);
                    if (f < keyframe3.getFraction())
                    {
                        Interpolator interpolator2 = keyframe3.getInterpolator();
                        float f4 = f;
                        if (interpolator2 != null)
                        {
                            f4 = interpolator2.getInterpolation(f);
                        }
                        f = keyframe2.getFraction();
                        f = (f4 - f) / (keyframe3.getFraction() - f);
                        return mEvaluator.evaluate(f, keyframe2.getValue(), keyframe3.getValue());
                    }
                    i++;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return mLastKeyframe.getValue();
            }
            keyframe2 = keyframe3;
        } while (true);
    }

    public void setEvaluator(TypeEvaluator typeevaluator)
    {
        mEvaluator = typeevaluator;
    }

    public String toString()
    {
        boolean flag = Animator.a;
        String s = " ";
        for (int i = 0; i < mNumKeyframes; i++)
        {
            s = (new StringBuilder()).append(s).append(((Keyframe)mKeyframes.get(i)).getValue()).append(z).toString();
            if (flag)
            {
                return s;
            }
        }

        return s;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\001p".toCharArray();
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
        byte byte0 = 88;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 33;
          goto _L8
_L3:
        byte0 = 80;
          goto _L8
_L4:
        byte0 = 60;
          goto _L8
        byte0 = 111;
          goto _L8
    }
}
