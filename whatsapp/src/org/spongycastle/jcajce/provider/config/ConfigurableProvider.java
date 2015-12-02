// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.config;


public interface ConfigurableProvider
{

    public abstract void addAlgorithm(String s, String s1);

    public abstract boolean hasAlgorithm(String s, String s1);
}
