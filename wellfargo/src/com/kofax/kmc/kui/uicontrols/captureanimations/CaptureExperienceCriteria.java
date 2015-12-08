// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            a

public class CaptureExperienceCriteria
{

    private boolean a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private int f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;

    public CaptureExperienceCriteria()
    {
        a = true;
        b = 95;
        c = true;
        d = 15;
        e = true;
        f = 15;
        g = true;
        h = true;
        i = 40;
        j = true;
        k = 85;
        l = true;
        m = 85;
        n = true;
        o = true;
    }

    boolean a(a a1)
    {
_L2:
        return false;
        if (n && !a1.d() || a && b > a1.a() || c && d < a1.b() || e && f < a1.c()) goto _L2; else goto _L1
_L1:
        if (!g)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a1.e() || isDetectPageOrientationEnabled() && !a1.o() || h && i >= a1.k()) goto _L2; else goto _L3
_L3:
        if (!j || !l) goto _L5; else goto _L4
_L4:
        if (k >= a1.l() && m >= a1.m()) goto _L2; else goto _L6
_L6:
        return true;
_L5:
        if (!j)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k < a1.l()) goto _L6; else goto _L7
_L7:
        return false;
        if (!l || m < a1.m()) goto _L6; else goto _L8
_L8:
        return false;
    }

    public int getPageAreaThreshold()
    {
        return i;
    }

    public int getPageLongEdgeThreshold()
    {
        return k;
    }

    public int getPageShortEdgeThreshold()
    {
        return m;
    }

    public int getPitchThreshold()
    {
        return d;
    }

    public int getRollThreshold()
    {
        return f;
    }

    public int getStabilityThreshold()
    {
        return b;
    }

    public boolean isDetectPageOrientationEnabled()
    {
        return o;
    }

    public boolean isFocusEnabled()
    {
        return n;
    }

    public boolean isPageAreaThresholdEnabled()
    {
        return h;
    }

    public boolean isPageDetectionEnabled()
    {
        return g;
    }

    public boolean isPageLongEdgeThresholdEnabled()
    {
        return j;
    }

    public boolean isPageShortEdgeThresholdEnabled()
    {
        return l;
    }

    public boolean isPitchThresholdEnabled()
    {
        return c;
    }

    public boolean isRollThresholdEnabled()
    {
        return e;
    }

    public boolean isStabilityThresholdEnabled()
    {
        return a;
    }

    public void setDetectPageOrientationEnabled(boolean flag)
    {
        o = flag;
    }

    public void setFocusEnabled(boolean flag)
    {
        n = flag;
    }

    public void setPageAreaThreshold(int i1)
    {
        if (i1 < 0 || i1 > 100)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_PAGE_THRESHOLD_ARGUMENT);
        } else
        {
            i = i1;
            return;
        }
    }

    public void setPageAreaThresholdEnabled(boolean flag)
    {
        h = flag;
    }

    public void setPageDetectionEnabled(boolean flag)
    {
        g = flag;
    }

    public void setPageLongEdgeThreshold(int i1)
    {
        if (i1 < 0 || i1 > 100)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_AXIS_THRESHOLD_ARGUMENT);
        } else
        {
            k = i1;
            return;
        }
    }

    public void setPageLongEdgeThresholdEnabled(boolean flag)
    {
        j = flag;
    }

    public void setPageShortEdgeThreshold(int i1)
    {
        if (i1 < 0 || i1 > 100)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_AXIS_THRESHOLD_ARGUMENT);
        } else
        {
            m = i1;
            return;
        }
    }

    public void setPageShortEdgeThresholdEnabled(boolean flag)
    {
        l = flag;
    }

    public void setPitchThreshold(int i1)
    {
        if (i1 < 0 || i1 > 45)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_THRESHOLD_ARGUMENT);
        }
        if (i1 == 45)
        {
            d = 1000;
            return;
        } else
        {
            d = i1;
            return;
        }
    }

    public void setPitchThresholdEnabled(boolean flag)
    {
        c = flag;
    }

    public void setRollThreshold(int i1)
    {
        if (i1 < 0 || i1 > 45)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_THRESHOLD_ARGUMENT);
        }
        if (i1 == 45)
        {
            f = 1000;
            return;
        } else
        {
            f = i1;
            return;
        }
    }

    public void setRollThresholdEnabled(boolean flag)
    {
        e = flag;
    }

    public void setStabilityThreshold(int i1)
    {
        if (i1 < 0 || i1 > 100)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_STABILITY_DELAY_ARGUMENT);
        } else
        {
            b = i1;
            return;
        }
    }

    public void setStabilityThresholdEnabled(boolean flag)
    {
        a = flag;
    }
}
