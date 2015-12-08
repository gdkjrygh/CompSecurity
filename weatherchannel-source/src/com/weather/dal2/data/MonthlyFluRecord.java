// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.Date;

// Referenced classes of package com.weather.dal2.data:
//            Record

public interface MonthlyFluRecord
    extends Record
{

    public abstract String getColor(int i);

    public abstract String getCondition(int i);

    public abstract Date getDate(int i);

    public abstract int getSize();

    public abstract String getState(int i);
}
