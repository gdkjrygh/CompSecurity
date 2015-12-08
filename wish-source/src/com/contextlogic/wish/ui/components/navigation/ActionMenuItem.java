// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;


// Referenced classes of package com.contextlogic.wish.ui.components.navigation:
//            NavigationBarButtonCallback

public class ActionMenuItem
{

    private NavigationBarButtonCallback callback;
    private Integer id;
    private boolean isOverflow;
    private int resourceId;
    private String title;

    public ActionMenuItem(String s, int i, NavigationBarButtonCallback navigationbarbuttoncallback, boolean flag)
    {
        title = s;
        resourceId = i;
        callback = navigationbarbuttoncallback;
        isOverflow = flag;
        int j = i;
        if (s != null)
        {
            j = i + s.hashCode();
        }
        id = Integer.valueOf(j);
    }

    public NavigationBarButtonCallback getCallback()
    {
        return callback;
    }

    public Integer getId()
    {
        return id;
    }

    public int getResourceId()
    {
        return resourceId;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isOverflow()
    {
        return isOverflow;
    }

    public void setCallback(NavigationBarButtonCallback navigationbarbuttoncallback)
    {
        callback = navigationbarbuttoncallback;
    }

    public void setOverflow(boolean flag)
    {
        isOverflow = flag;
    }

    public void setResourceId(int i)
    {
        resourceId = i;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
