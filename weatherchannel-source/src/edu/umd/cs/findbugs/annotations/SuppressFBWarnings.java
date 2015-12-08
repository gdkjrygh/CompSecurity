// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package edu.umd.cs.findbugs.annotations;

import java.lang.annotation.Annotation;

public interface SuppressFBWarnings
    extends Annotation
{

    public abstract String justification();

    public abstract String[] value();
}
