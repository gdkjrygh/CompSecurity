// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.android.abc.machine_vision;

import java.util.Vector;

// Referenced classes of package com.kofax.android.abc.machine_vision:
//            TrackedCheckInformation

public class TrackedDocument
{

    protected double m_area;
    protected String m_category;
    protected TrackedCheckInformation m_checkInformation;
    protected int m_classificationStableForNFrames;
    protected Vector m_effectiveCorners;
    protected long m_impl;
    protected boolean m_isActive;
    protected boolean m_isComplete;
    protected int m_stableForNFrames;
    protected int m_unclassifiedForNFrames;

    public TrackedDocument()
    {
    }

    public double area()
    {
        return m_area;
    }

    public String category()
    {
        return m_category;
    }

    public TrackedCheckInformation checkInformation()
    {
        return m_checkInformation;
    }

    public int classificationStableForNFrames()
    {
        return m_classificationStableForNFrames;
    }

    public Vector effectiveCorners()
    {
        return m_effectiveCorners;
    }

    public boolean isActive()
    {
        return m_isActive;
    }

    public boolean isComplete()
    {
        return m_isComplete;
    }

    public int stableForNFrames()
    {
        return m_stableForNFrames;
    }

    public int unclassifiedForNFrames()
    {
        return m_unclassifiedForNFrames;
    }
}
