// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.esotericsoftware.kryo.serializers;

import java.lang.annotation.Annotation;

public interface 
    extends Annotation
{

    public abstract Class elementClass();

    public abstract Class elementSerializer();

    public abstract boolean elementsCanBeNull();
}
