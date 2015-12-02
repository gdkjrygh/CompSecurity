// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            PropertyValuesHolder, FloatKeyframeSet

class setFloatValues extends PropertyValuesHolder
{

    private static final String z[];
    float mFloatAnimatedValue;
    FloatKeyframeSet mFloatKeyframeSet;

    void calculateValue(float f)
    {
        mFloatAnimatedValue = mFloatKeyframeSet.getFloatValue(f);
    }

    public mFloatKeyframeSet clone()
    {
        mFloatKeyframeSet mfloatkeyframeset = (mFloatKeyframeSet)super.clone();
        mfloatkeyframeset.mFloatKeyframeSet = (FloatKeyframeSet)mfloatkeyframeset.mKeyframeSet;
        return mfloatkeyframeset;
    }

    public PropertyValuesHolder clone()
    {
        return clone();
    }

    public Object clone()
    {
        return clone();
    }

    Object getAnimatedValue()
    {
        return Float.valueOf(mFloatAnimatedValue);
    }

    void setAnimatedValue(Object obj)
    {
        if (mSetter == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        mTmpValueArray[0] = Float.valueOf(mFloatAnimatedValue);
        mSetter.invoke(obj, mTmpValueArray);
        return;
        obj;
        Log.e(z[1], ((InvocationTargetException) (obj)).toString());
        return;
        obj;
        Log.e(z[0], ((IllegalAccessException) (obj)).toString());
        return;
    }

    public void setFloatValues(float af[])
    {
        super.setFloatValues(af);
        mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
    }

    void setupSetter(Class class1)
    {
        super.setupSetter(class1);
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "KHJ:piN\\\034twO@9]tVA/g".toCharArray();
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
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 21;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 27;
          goto _L9
_L5:
        byte0 = 58;
          goto _L9
_L6:
        byte0 = 37;
          goto _L9
        byte0 = 74;
          goto _L9
    }

    public (String s, float af[])
    {
        super(s, null);
        setFloatValues(af);
    }
}
