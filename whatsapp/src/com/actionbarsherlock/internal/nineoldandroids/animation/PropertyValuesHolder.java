// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            IntEvaluator, FloatEvaluator, Animator, KeyframeSet, 
//            Keyframe, TypeEvaluator

public class PropertyValuesHolder
    implements Cloneable
{

    private static Class DOUBLE_VARIANTS[];
    private static Class FLOAT_VARIANTS[];
    private static Class INTEGER_VARIANTS[];
    private static final TypeEvaluator sFloatEvaluator;
    private static final HashMap sGetterPropertyMap;
    private static final TypeEvaluator sIntEvaluator;
    private static final HashMap sSetterPropertyMap;
    private static final String z[];
    private Object mAnimatedValue;
    private TypeEvaluator mEvaluator;
    private Method mGetter;
    KeyframeSet mKeyframeSet;
    final ReentrantReadWriteLock mPropertyMapLock;
    String mPropertyName;
    Method mSetter;
    final Object mTmpValueArray[];
    Class mValueType;

    private PropertyValuesHolder(String s)
    {
        mSetter = null;
        mGetter = null;
        mKeyframeSet = null;
        mPropertyMapLock = new ReentrantReadWriteLock();
        mTmpValueArray = new Object[1];
        mPropertyName = s;
    }

    PropertyValuesHolder(String s, _cls1 _pcls1)
    {
        this(s);
    }

    static String getMethodName(String s, String s1)
    {
        if (s1 == null || s1.length() == 0)
        {
            return s;
        } else
        {
            char c = Character.toUpperCase(s1.charAt(0));
            s1 = s1.substring(1);
            return (new StringBuilder()).append(s).append(c).append(s1).toString();
        }
    }

    private Method getPropertyFunction(Class class1, String s, Class class2)
    {
        Method method;
        Object obj;
        int i;
        boolean flag;
label0:
        {
            obj = null;
            flag = Animator.a;
            String s1 = getMethodName(s, mPropertyName);
            if (class2 == null)
            {
                try
                {
                    s = class1.getMethod(s1, null);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    Log.e(z[12], (new StringBuilder()).append(class1.getSimpleName()).append(z[11]).append(z[4]).append(mPropertyName).append(z[8]).append(s).toString());
                    return null;
                }
                return s;
            }
            Class aclass[] = new Class[1];
            if (mValueType.equals(java/lang/Float))
            {
                class2 = FLOAT_VARIANTS;
                if (!flag)
                {
                    break label0;
                }
            }
            Class class3;
            int j;
            boolean flag1;
            try
            {
                flag1 = mValueType.equals(java/lang/Integer);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw class1;
            }
            if (flag1)
            {
                class2 = INTEGER_VARIANTS;
                if (!flag)
                {
                    break label0;
                }
            }
            try
            {
                flag1 = mValueType.equals(java/lang/Double);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw class1;
            }
            if (flag1)
            {
                class2 = DOUBLE_VARIANTS;
                if (!flag)
                {
                    break label0;
                }
            }
            class2 = new Class[1];
            class2[0] = mValueType;
        }
        j = class2.length;
        i = 0;
_L2:
        method = ((Method) (obj));
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        class3 = class2[i];
        aclass[0] = class3;
        method = ((Method) (obj));
        obj = class1.getMethod(s1, aclass);
        method = ((Method) (obj));
        mValueType = class3;
        return ((Method) (obj));
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        i++;
        nosuchmethodexception = method;
        if (!flag) goto _L2; else goto _L1
_L1:
        Log.e(z[7], (new StringBuilder()).append(z[10]).append(s).append(z[5]).append(mPropertyName).append(z[6]).append(class1.getSimpleName()).append(z[9]).append(mValueType).toString());
        return method;
    }

    public static PropertyValuesHolder ofFloat(String s, float af[])
    {
        return new FloatPropertyValuesHolder(s, af);
    }

    private void setupGetter(Class class1)
    {
        mGetter = setupSetterOrGetter(class1, sGetterPropertyMap, z[0], null);
    }

    private Method setupSetterOrGetter(Class class1, HashMap hashmap, String s, Class class2)
    {
        Method method = null;
        HashMap hashmap1;
        mPropertyMapLock.writeLock().lock();
        hashmap1 = (HashMap)hashmap.get(class1);
        if (hashmap1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        method = (Method)hashmap1.get(mPropertyName);
        Method method1;
        method1 = method;
        if (method != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        method1 = getPropertyFunction(class1, s, class2);
        s = hashmap1;
        if (hashmap1 != null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        s = new HashMap();
        hashmap.put(class1, s);
        s.put(mPropertyName, method1);
        mPropertyMapLock.writeLock().unlock();
        return method1;
        class1;
        mPropertyMapLock.writeLock().unlock();
        throw class1;
    }

    void calculateValue(float f)
    {
        mAnimatedValue = mKeyframeSet.getValue(f);
    }

    public PropertyValuesHolder clone()
    {
        PropertyValuesHolder propertyvaluesholder;
        try
        {
            propertyvaluesholder = (PropertyValuesHolder)super.clone();
            propertyvaluesholder.mPropertyName = mPropertyName;
            propertyvaluesholder.mKeyframeSet = mKeyframeSet.clone();
            propertyvaluesholder.mEvaluator = mEvaluator;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return propertyvaluesholder;
    }

    public Object clone()
    {
        return clone();
    }

    Object getAnimatedValue()
    {
        return mAnimatedValue;
    }

    public String getPropertyName()
    {
        return mPropertyName;
    }

    void init()
    {
        if (mEvaluator == null)
        {
            TypeEvaluator typeevaluator;
            if (mValueType == java/lang/Integer)
            {
                typeevaluator = sIntEvaluator;
            } else
            if (mValueType == java/lang/Float)
            {
                typeevaluator = sFloatEvaluator;
            } else
            {
                typeevaluator = null;
            }
            mEvaluator = typeevaluator;
        }
        if (mEvaluator != null)
        {
            mKeyframeSet.setEvaluator(mEvaluator);
        }
    }

    void setAnimatedValue(Object obj)
    {
        if (mSetter == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        mTmpValueArray[0] = getAnimatedValue();
        mSetter.invoke(obj, mTmpValueArray);
        return;
        obj;
        Log.e(z[14], ((InvocationTargetException) (obj)).toString());
        return;
        obj;
        Log.e(z[15], ((IllegalAccessException) (obj)).toString());
        return;
    }

    public void setFloatValues(float af[])
    {
        mValueType = Float.TYPE;
        mKeyframeSet = KeyframeSet.ofFloat(af);
    }

    public void setPropertyName(String s)
    {
        mPropertyName = s;
    }

    void setupSetter(Class class1)
    {
        mSetter = setupSetterOrGetter(class1, sSetterPropertyMap, z[1], mValueType);
    }

    void setupSetterAndGetter(Object obj)
    {
        boolean flag = Animator.a;
        Class class1 = obj.getClass();
        Iterator iterator;
        Keyframe keyframe;
        Method method;
        try
        {
            if (mSetter == null)
            {
                setupSetter(class1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        iterator = mKeyframeSet.mKeyframes.iterator();
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        keyframe = (Keyframe)iterator.next();
        if (keyframe.hasValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        method = mGetter;
        if (method == null)
        {
            try
            {
                setupGetter(class1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        try
        {
            keyframe.setValue(mGetter.invoke(obj, new Object[0]));
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            Log.e(z[2], invocationtargetexception.toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            Log.e(z[3], illegalaccessexception.toString());
        }
        if (!flag) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_33;
_L1:
        return;
        obj;
        throw obj;
    }

    public String toString()
    {
        return (new StringBuilder()).append(mPropertyName).append(z[13]).append(mKeyframeSet.toString()).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[16];
        obj = ">>a";
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
                obj = "*>a";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\t)z;~+/l\035z5.p8S67q.i";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\t)z;~+/l\035z5.p8S67q.i";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\0324`'\1777|ak}05qku6vt9|y6p?s6?5-t+{e9t)>g?by";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "->gkk+4e.i-\"5";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "y=z9;";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\t)z;~+/l\035z5.p8S67q.i";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "c{";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "y,|?sy-t'n<{a2k<{";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\0324`'\1777|ak}05qk";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "yv5";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\t)z;~+/l\035z5.p8S67q.i";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "c{";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\t)z;~+/l\035z5.p8S67q.i";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\t)z;~+/l\035z5.p8S67q.i";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                z = as;
                sIntEvaluator = new IntEvaluator();
                sFloatEvaluator = new FloatEvaluator();
                FLOAT_VARIANTS = (new Class[] {
                    Float.TYPE, java/lang/Float, Double.TYPE, Integer.TYPE, java/lang/Double, java/lang/Integer
                });
                INTEGER_VARIANTS = (new Class[] {
                    Integer.TYPE, java/lang/Integer, Float.TYPE, Double.TYPE, java/lang/Float, java/lang/Double
                });
                DOUBLE_VARIANTS = (new Class[] {
                    Double.TYPE, java/lang/Double, Float.TYPE, Integer.TYPE, java/lang/Float, java/lang/Integer
                });
                sSetterPropertyMap = new HashMap();
                sGetterPropertyMap = new HashMap();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 596
    //                   0 619
    //                   1 626
    //                   2 633
    //                   3 640;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_640;
_L3:
        byte byte1 = 27;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 89;
          goto _L9
_L5:
        byte1 = 91;
          goto _L9
_L6:
        byte1 = 21;
          goto _L9
        byte1 = 75;
          goto _L9
    }

    private class FloatPropertyValuesHolder extends PropertyValuesHolder
    {

        private static final String z[];
        float mFloatAnimatedValue;
        FloatKeyframeSet mFloatKeyframeSet;

        void calculateValue(float f)
        {
            mFloatAnimatedValue = mFloatKeyframeSet.getFloatValue(f);
        }

        public FloatPropertyValuesHolder clone()
        {
            FloatPropertyValuesHolder floatpropertyvaluesholder = (FloatPropertyValuesHolder)clone();
            floatpropertyvaluesholder.mFloatKeyframeSet = (FloatKeyframeSet)floatpropertyvaluesholder.mKeyframeSet;
            return floatpropertyvaluesholder;
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
            setFloatValues(af);
            mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
        }

        void setupSetter(Class class1)
        {
            setupSetter(class1);
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
        //                       0 149
        //                       1 155
        //                       2 161
        //                       3 167;
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

        public FloatPropertyValuesHolder(String s, float af[])
        {
            super(s, null);
            setFloatValues(af);
        }
    }

}
