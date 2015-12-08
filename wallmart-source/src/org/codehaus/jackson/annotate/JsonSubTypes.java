// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.annotate;

import java.lang.annotation.Annotation;

public interface JsonSubTypes
    extends Annotation
{
    public static interface Type
        extends Annotation
    {

        public abstract String name();

        public abstract Class value();
    }


    public abstract Type[] value();
}
