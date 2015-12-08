// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.android.abc.machine_vision;

import java.util.Vector;

public class TrackedCheckInformation
{

    protected boolean m_boundingBoxEdgeIndicators[];
    protected int m_dpi;
    protected boolean m_internalContrastIndicator;
    protected boolean m_isPersonalCheck;
    protected int m_micrDirection;
    protected String m_micrLine;
    public Vector m_rectangle;
    protected boolean m_totalEdgeSuportIndicator;

    public TrackedCheckInformation()
    {
    }

    public boolean[] boundingBoxEdgeIndicators()
    {
        return m_boundingBoxEdgeIndicators;
    }

    public int dpi()
    {
        return m_dpi;
    }

    public boolean internalContrastIndicator()
    {
        return m_internalContrastIndicator;
    }

    public boolean isPersonalCheck()
    {
        return m_isPersonalCheck;
    }

    public int micrDirection()
    {
        return m_micrDirection;
    }

    public String micrLine()
    {
        return m_micrLine;
    }

    public Vector rectangle()
    {
        return m_rectangle;
    }

    public boolean totalEdgeSuportIndicator()
    {
        return m_totalEdgeSuportIndicator;
    }
}
