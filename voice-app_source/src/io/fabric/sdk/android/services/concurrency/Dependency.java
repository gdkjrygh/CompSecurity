// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;

public interface Dependency
{

    public abstract void addDependency(Object obj);

    public abstract boolean areDependenciesMet();

    public abstract Collection getDependencies();
}
