// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.util.Log;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            Tweak

public class Tweaks
{
    public static interface OnTweakDeclaredListener
    {

        public abstract void onTweakDeclared();
    }

    private static interface TweakType
        extends Annotation
    {
    }

    public static class TweakValue
    {

        private final Object defaultValue;
        private final Number maximum;
        private final Number minimum;
        public final int type;
        private final Object value;

        public Boolean getBooleanValue()
        {
            Object obj1 = Boolean.valueOf(false);
            Object obj = obj1;
            if (defaultValue != null)
            {
                try
                {
                    obj = (Boolean)defaultValue;
                }
                catch (ClassCastException classcastexception)
                {
                    classcastexception = ((ClassCastException) (obj1));
                }
            }
            obj1 = obj;
            if (value != null)
            {
                try
                {
                    obj1 = (Boolean)value;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    return ((Boolean) (obj));
                }
            }
            return ((Boolean) (obj1));
        }

        public Number getNumberValue()
        {
            Object obj1 = Integer.valueOf(0);
            Object obj = obj1;
            if (defaultValue != null)
            {
                try
                {
                    obj = (Number)defaultValue;
                }
                catch (ClassCastException classcastexception)
                {
                    classcastexception = ((ClassCastException) (obj1));
                }
            }
            obj1 = obj;
            if (value != null)
            {
                try
                {
                    obj1 = (Number)value;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    return ((Number) (obj));
                }
            }
            return ((Number) (obj1));
        }

        public String getStringValue()
        {
            String s = null;
            String s1 = (String)defaultValue;
            s = s1;
_L2:
            String s2;
            try
            {
                s2 = (String)value;
            }
            catch (ClassCastException classcastexception)
            {
                return s;
            }
            return s2;
            ClassCastException classcastexception1;
            classcastexception1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public TweakValue updateValue(Object obj)
        {
            return new TweakValue(type, defaultValue, minimum, maximum, obj);
        }

        private TweakValue(int i, Object obj, Number number, Number number1, Object obj1)
        {
            type = i;
            defaultValue = obj;
            minimum = number;
            maximum = number1;
            value = obj1;
        }

        TweakValue(int i, Object obj, Number number, Number number1, Object obj1, TweakValue tweakvalue)
        {
            this(i, obj, number, number1, obj1);
        }
    }


    public static final int BOOLEAN_TYPE = 1;
    public static final int DOUBLE_TYPE = 2;
    private static final String LOGTAG = "MixpanelAPI.Tweaks";
    public static final int LONG_TYPE = 3;
    public static final int STRING_TYPE = 4;
    private final List mTweakDeclaredListeners = new ArrayList();
    private final Map mTweakValues = new HashMap();

    Tweaks()
    {
    }

    private void declareTweak(String s, Object obj, int i)
    {
        if (mTweakValues.containsKey(s))
        {
            Log.w("MixpanelAPI.Tweaks", (new StringBuilder("Attempt to define a tweak \"")).append(s).append("\" twice with the same name").toString());
        } else
        {
            obj = new TweakValue(i, obj, null, null, obj, null);
            mTweakValues.put(s, obj);
            int j = mTweakDeclaredListeners.size();
            i = 0;
            while (i < j) 
            {
                ((OnTweakDeclaredListener)mTweakDeclaredListeners.get(i)).onTweakDeclared();
                i++;
            }
        }
    }

    private TweakValue getValue(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (TweakValue)mTweakValues.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void addOnTweakDeclaredListener(OnTweakDeclaredListener ontweakdeclaredlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (ontweakdeclaredlistener != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("listener cannot be null");
        ontweakdeclaredlistener;
        this;
        JVM INSTR monitorexit ;
        throw ontweakdeclaredlistener;
        mTweakDeclaredListeners.add(ontweakdeclaredlistener);
        this;
        JVM INSTR monitorexit ;
    }

    Tweak booleanTweak(final String tweakName, boolean flag)
    {
        declareTweak(tweakName, Boolean.valueOf(flag), 1);
        return new Tweak() {

            final Tweaks this$0;
            private final String val$tweakName;

            public Boolean get()
            {
                return getValue(tweakName).getBooleanValue();
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = Tweaks.this;
                tweakName = s;
                super();
            }
        };
    }

    Tweak byteTweak(final String tweakName, byte byte0)
    {
        declareTweak(tweakName, Byte.valueOf(byte0), 3);
        return new Tweak() {

            final Tweaks this$0;
            private final String val$tweakName;

            public Byte get()
            {
                return Byte.valueOf(getValue(tweakName).getNumberValue().byteValue());
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = Tweaks.this;
                tweakName = s;
                super();
            }
        };
    }

    Tweak doubleTweak(final String tweakName, double d)
    {
        declareTweak(tweakName, Double.valueOf(d), 2);
        return new Tweak() {

            final Tweaks this$0;
            private final String val$tweakName;

            public Double get()
            {
                return Double.valueOf(getValue(tweakName).getNumberValue().doubleValue());
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = Tweaks.this;
                tweakName = s;
                super();
            }
        };
    }

    Tweak floatTweak(final String tweakName, float f)
    {
        declareTweak(tweakName, Float.valueOf(f), 2);
        return new Tweak() {

            final Tweaks this$0;
            private final String val$tweakName;

            public Float get()
            {
                return Float.valueOf(getValue(tweakName).getNumberValue().floatValue());
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = Tweaks.this;
                tweakName = s;
                super();
            }
        };
    }

    public Map getAllValues()
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap = new HashMap(mTweakValues);
        this;
        JVM INSTR monitorexit ;
        return hashmap;
        Exception exception;
        exception;
        throw exception;
    }

    Tweak intTweak(final String tweakName, int i)
    {
        declareTweak(tweakName, Integer.valueOf(i), 3);
        return new Tweak() {

            final Tweaks this$0;
            private final String val$tweakName;

            public Integer get()
            {
                return Integer.valueOf(getValue(tweakName).getNumberValue().intValue());
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = Tweaks.this;
                tweakName = s;
                super();
            }
        };
    }

    Tweak longTweak(final String tweakName, long l)
    {
        declareTweak(tweakName, Long.valueOf(l), 3);
        return new Tweak() {

            final Tweaks this$0;
            private final String val$tweakName;

            public Long get()
            {
                return Long.valueOf(getValue(tweakName).getNumberValue().longValue());
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = Tweaks.this;
                tweakName = s;
                super();
            }
        };
    }

    public void set(String s, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (mTweakValues.containsKey(s)) goto _L2; else goto _L1
_L1:
        Log.w("MixpanelAPI.Tweaks", (new StringBuilder("Attempt to set a tweak \"")).append(s).append("\" which has never been defined.").toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = ((TweakValue)mTweakValues.get(s)).updateValue(obj);
        mTweakValues.put(s, obj);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    Tweak shortTweak(final String tweakName, short word0)
    {
        declareTweak(tweakName, Short.valueOf(word0), 3);
        return new Tweak() {

            final Tweaks this$0;
            private final String val$tweakName;

            public volatile Object get()
            {
                return get();
            }

            public Short get()
            {
                return Short.valueOf(getValue(tweakName).getNumberValue().shortValue());
            }

            
            {
                this$0 = Tweaks.this;
                tweakName = s;
                super();
            }
        };
    }

    Tweak stringTweak(final String tweakName, String s)
    {
        declareTweak(tweakName, s, 4);
        return new Tweak() {

            final Tweaks this$0;
            private final String val$tweakName;

            public volatile Object get()
            {
                return get();
            }

            public String get()
            {
                return getValue(tweakName).getStringValue();
            }

            
            {
                this$0 = Tweaks.this;
                tweakName = s;
                super();
            }
        };
    }

}
