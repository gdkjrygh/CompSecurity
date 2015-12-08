// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import java.lang.annotation.Annotation;

public interface Module
    extends Annotation
{

    public abstract Class addsTo();

    public abstract boolean complete();

    public abstract Class[] includes();

    public abstract Class[] injects();

    public abstract boolean library();

    public abstract boolean overrides();

    public abstract Class[] staticInjections();
}
