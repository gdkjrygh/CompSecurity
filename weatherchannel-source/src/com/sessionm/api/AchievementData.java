// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;


public interface AchievementData
{

    public abstract String getAchievementIconURL();

    public abstract String getAchievementId();

    public abstract String getAction();

    public abstract int getDistance();

    public abstract String getImportId();

    public abstract String getInstructions();

    public abstract String getLimitTimes();

    public abstract String getMessage();

    public abstract int getMpointValue();

    public abstract String getName();

    public abstract int getTimesEarned();

    public abstract int getUnclaimedCount();

    public abstract boolean isCustom();

    public abstract String lastEarnedDate();
}
