// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Predicate;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

private static abstract class <init> extends Enum
    implements Predicate
{

    private static final INTERFACE_ONLY $VALUES[];
    public static final INTERFACE_ONLY IGNORE_TYPE_VARIABLE_OR_WILDCARD;
    public static final INTERFACE_ONLY INTERFACE_ONLY;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/reflect/TypeToken$TypeFilter, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD = new TypeToken.TypeFilter("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0) {

            public boolean apply(TypeToken typetoken)
            {
                return !(TypeToken.access$400(typetoken) instanceof TypeVariable) && !(TypeToken.access$400(typetoken) instanceof WildcardType);
            }

            public volatile boolean apply(Object obj)
            {
                return apply((TypeToken)obj);
            }

        };
        INTERFACE_ONLY = new TypeToken.TypeFilter("INTERFACE_ONLY", 1) {

            public boolean apply(TypeToken typetoken)
            {
                return typetoken.getRawType().isInterface();
            }

            public volatile boolean apply(Object obj)
            {
                return apply((TypeToken)obj);
            }

        };
        $VALUES = (new .VALUES[] {
            IGNORE_TYPE_VARIABLE_OR_WILDCARD, INTERFACE_ONLY
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
