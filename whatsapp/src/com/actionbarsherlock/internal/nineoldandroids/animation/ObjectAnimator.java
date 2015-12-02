// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import java.util.HashMap;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            ValueAnimator, Animator, PropertyValuesHolder

public final class ObjectAnimator extends ValueAnimator
{

    private static final String z[];
    private String mPropertyName;
    private Object mTarget;

    public ObjectAnimator()
    {
    }

    private ObjectAnimator(Object obj, String s)
    {
        mTarget = obj;
        setPropertyName(s);
    }

    public static ObjectAnimator ofFloat(Object obj, String s, float af[])
    {
        obj = new ObjectAnimator(obj, s);
        ((ObjectAnimator) (obj)).setFloatValues(af);
        return ((ObjectAnimator) (obj));
    }

    void animateValue(float f)
    {
        boolean flag = Animator.a;
        super.animateValue(f);
        int j = mValues.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            mValues[i].setAnimatedValue(mTarget);
            i++;
        } while (!flag);
    }

    public Animator clone()
    {
        return clone();
    }

    public ObjectAnimator clone()
    {
        return (ObjectAnimator)super.clone();
    }

    public ValueAnimator clone()
    {
        return clone();
    }

    public Object clone()
    {
        return clone();
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
                mValues[i].setupSetterAndGetter(mTarget);
                i++;
            } while (!flag);
            super.initAnimation();
        }
    }

    public ObjectAnimator setDuration(long l)
    {
        super.setDuration(l);
        return this;
    }

    public ValueAnimator setDuration(long l)
    {
        return setDuration(l);
    }

    public void setFloatValues(float af[])
    {
label0:
        {
            if (mValues == null || mValues.length == 0)
            {
                setValues(new PropertyValuesHolder[] {
                    PropertyValuesHolder.ofFloat(mPropertyName, af)
                });
                if (!Animator.a)
                {
                    break label0;
                }
            }
            super.setFloatValues(af);
        }
    }

    public void setPropertyName(String s)
    {
        if (mValues != null)
        {
            PropertyValuesHolder propertyvaluesholder = mValues[0];
            String s1 = propertyvaluesholder.getPropertyName();
            propertyvaluesholder.setPropertyName(s);
            mValuesMap.remove(s1);
            mValuesMap.put(s, propertyvaluesholder);
        }
        mPropertyName = s;
        mInitialized = false;
    }

    public void start()
    {
        super.start();
    }

    public String toString()
    {
        boolean flag = Animator.a;
        String s = (new StringBuilder()).append(z[1]).append(Integer.toHexString(hashCode())).append(z[2]).append(mTarget).toString();
        if (mValues != null)
        {
            int i = 0;
            String s1;
            do
            {
                s1 = s;
                if (i >= mValues.length)
                {
                    break;
                }
                s1 = (new StringBuilder()).append(s).append(z[0]).append(mValues[i].toString()).toString();
                i++;
                s = s1;
            } while (!flag);
            return s1;
        } else
        {
            return s;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "]\bc\0003";
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
                obj = "\030J)Ep#i-I~6\\,RS";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "{\b7Aa0M7\0";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 19;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 87;
          goto _L9
_L5:
        byte0 = 40;
          goto _L9
_L6:
        byte0 = 67;
          goto _L9
        byte0 = 32;
          goto _L9
    }
}
