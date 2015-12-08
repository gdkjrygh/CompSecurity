// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EventObject;

public class AppStatsWritetoFileEvent extends EventObject
{

    private static final long serialVersionUID = 0x6b5e08628f559c45L;
    private AppStatsWriteFileListener.WriteFileStatus a;
    private float b;
    private ErrorInfo c;

    public AppStatsWritetoFileEvent(Object obj, AppStatsWriteFileListener.WriteFileStatus writefilestatus, float f, ErrorInfo errorinfo)
    {
        super(obj);
        a = writefilestatus;
        b = f;
        c = errorinfo;
    }

    void a(float f)
    {
        b = f;
    }

    void a(AppStatsWriteFileListener.WriteFileStatus writefilestatus)
    {
        a = writefilestatus;
    }

    public ErrorInfo getErrorInfo()
    {
        return c;
    }

    public float getPercentComplete()
    {
        return b;
    }

    public AppStatsWriteFileListener.WriteFileStatus getWritetoFileStatus()
    {
        return a;
    }
}
