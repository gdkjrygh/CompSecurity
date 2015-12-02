// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.esotericsoftware.kryo.serializers;

import java.lang.annotation.Annotation;

public interface A
    extends Annotation
{

    public abstract Class keyClass();

    public abstract Class keySerializer();

    public abstract boolean keysCanBeNull();

    public abstract Class valueClass();

    public abstract Class valueSerializer();

    public abstract boolean valuesCanBeNull();
}
