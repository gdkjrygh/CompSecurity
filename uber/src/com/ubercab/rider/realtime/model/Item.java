// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;

public interface Item
{

    public abstract String getImageUrl();

    public abstract String getName();

    public abstract String getQuestion();

    public abstract List getTags();

    public abstract String getUuid();
}
