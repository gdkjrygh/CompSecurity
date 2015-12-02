// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang;

import org.aspectj.lang.reflect.SourceLocation;

// Referenced classes of package org.aspectj.lang:
//            Signature

public interface JoinPoint
{
    public static interface EnclosingStaticPart
        extends StaticPart
    {
    }

    public static interface StaticPart
    {

        public abstract int getId();

        public abstract String getKind();

        public abstract Signature getSignature();

        public abstract SourceLocation getSourceLocation();

        public abstract String toLongString();

        public abstract String toShortString();

        public abstract String toString();
    }


    public static final String ADVICE_EXECUTION = "adviceexecution";
    public static final String CONSTRUCTOR_CALL = "constructor-call";
    public static final String CONSTRUCTOR_EXECUTION = "constructor-execution";
    public static final String EXCEPTION_HANDLER = "exception-handler";
    public static final String FIELD_GET = "field-get";
    public static final String FIELD_SET = "field-set";
    public static final String INITIALIZATION = "initialization";
    public static final String METHOD_CALL = "method-call";
    public static final String METHOD_EXECUTION = "method-execution";
    public static final String PREINITIALIZATION = "preinitialization";
    public static final String STATICINITIALIZATION = "staticinitialization";
    public static final String SYNCHRONIZATION_LOCK = "lock";
    public static final String SYNCHRONIZATION_UNLOCK = "unlock";

    public abstract Object[] getArgs();

    public abstract String getKind();

    public abstract Signature getSignature();

    public abstract SourceLocation getSourceLocation();

    public abstract StaticPart getStaticPart();

    public abstract Object getTarget();

    public abstract Object getThis();

    public abstract String toLongString();

    public abstract String toShortString();

    public abstract String toString();
}
