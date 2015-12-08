// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import java.io.Serializable;

public interface IMergeable
    extends Serializable
{

    public abstract boolean isEmpty();

    public abstract IMergeable merge(IMergeable imergeable);
}
