// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;

import java.lang.annotation.Annotation;

// Referenced classes of package org.aspectj.lang.reflect:
//            AjType, SignaturePattern, TypePattern

public interface DeclareAnnotation
{
    public static final class Kind extends Enum
    {

        private static final Kind $VALUES[];
        public static final Kind Constructor;
        public static final Kind Field;
        public static final Kind Method;
        public static final Kind Type;

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(org/aspectj/lang/reflect/DeclareAnnotation$Kind, s);
        }

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        static 
        {
            Field = new Kind("Field", 0);
            Method = new Kind("Method", 1);
            Constructor = new Kind("Constructor", 2);
            Type = new Kind("Type", 3);
            $VALUES = (new Kind[] {
                Field, Method, Constructor, Type
            });
        }

        private Kind(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Annotation getAnnotation();

    public abstract String getAnnotationAsText();

    public abstract AjType getDeclaringType();

    public abstract Kind getKind();

    public abstract SignaturePattern getSignaturePattern();

    public abstract TypePattern getTypePattern();
}
