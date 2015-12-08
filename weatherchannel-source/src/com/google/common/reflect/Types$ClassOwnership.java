// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.lang.reflect.ParameterizedType;

// Referenced classes of package com.google.common.reflect:
//            Types

private static abstract class <init> extends Enum
{
    class _cls1LocalClass
    {

        _cls1LocalClass()
        {
        }
    }


    private static final LOCAL_CLASS_HAS_NO_OWNER $VALUES[];
    static final LOCAL_CLASS_HAS_NO_OWNER JVM_BEHAVIOR = detectJvmBehavior();
    public static final detectJvmBehavior LOCAL_CLASS_HAS_NO_OWNER;
    public static final detectJvmBehavior OWNED_BY_ENCLOSING_CLASS;

    private static _cls1LocalClass detectJvmBehavior()
    {
        ParameterizedType parameterizedtype = (ParameterizedType)(new _cls1LocalClass() {

        }).getClass().getGenericSuperclass();
        _cls1LocalClass a_lcls1localclass[] = values();
        int j = a_lcls1localclass.length;
        for (int i = 0; i < j; i++)
        {
            _cls1LocalClass _lcls1localclass = a_lcls1localclass[i];
            if (_lcls1localclass.getOwnerType(com/google/common/reflect/Types$ClassOwnership$1LocalClass) == parameterizedtype.getOwnerType())
            {
                return _lcls1localclass;
            }
        }

        throw new AssertionError();
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/google/common/reflect/Types$ClassOwnership, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    abstract Class getOwnerType(Class class1);

    static 
    {
        OWNED_BY_ENCLOSING_CLASS = new Types.ClassOwnership("OWNED_BY_ENCLOSING_CLASS", 0) {

            Class getOwnerType(Class class1)
            {
                return class1.getEnclosingClass();
            }

        };
        LOCAL_CLASS_HAS_NO_OWNER = new Types.ClassOwnership("LOCAL_CLASS_HAS_NO_OWNER", 1) {

            Class getOwnerType(Class class1)
            {
                if (class1.isLocalClass())
                {
                    return null;
                } else
                {
                    return class1.getEnclosingClass();
                }
            }

        };
        $VALUES = (new .VALUES[] {
            OWNED_BY_ENCLOSING_CLASS, LOCAL_CLASS_HAS_NO_OWNER
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
