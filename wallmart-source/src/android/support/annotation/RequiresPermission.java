// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.annotation;

import java.lang.annotation.Annotation;

public interface RequiresPermission
    extends Annotation
{
    public static interface Read
        extends Annotation
    {

        public abstract RequiresPermission value();
    }

    public static interface Write
        extends Annotation
    {

        public abstract RequiresPermission value();
    }


    public abstract String[] allOf();

    public abstract String[] anyOf();

    public abstract boolean conditional();

    public abstract String value();
}
