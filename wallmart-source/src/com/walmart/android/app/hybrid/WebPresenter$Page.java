// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;


// Referenced classes of package com.walmart.android.app.hybrid:
//            WebPresenter

public static class ate.title
{

    public boolean isFullPageRefresh;
    private ate state;

    public void setState(ate ate)
    {
        state = new ate(ate);
    }

    public String toString()
    {
        return (new StringBuilder()).append("[t:").append(state.title).append(", fp: ").append(isFullPageRefresh).append(", url:").append("").append(state.pageLoadUrl).append("]").toString();
    }


    public ate()
    {
        state = new ate();
    }

    public ate(ate ate)
    {
        state = new ate(ate);
    }

    public ate(ate ate)
    {
        if (ate.state != null)
        {
            state = new ate(ate.state);
            return;
        } else
        {
            state = new ate();
            return;
        }
    }

    public ate(String s)
    {
        this();
        state.title = s;
    }
}
