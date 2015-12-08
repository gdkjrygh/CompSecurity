// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.io.Serializable;

public abstract class WishExperimentSpec
    implements Serializable
{

    private static final long serialVersionUID = 0x7476bb8690351ad5L;

    public WishExperimentSpec()
    {
    }

    public abstract String getBucket();

    public abstract String getExperimentName();

    public abstract void setBucket(String s);
}
