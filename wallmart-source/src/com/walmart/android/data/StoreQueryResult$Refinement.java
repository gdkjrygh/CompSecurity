// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            StoreQueryResult

public static class 
{

    private String browseToken;
    private stats children[];
    private String id;
    private String name;
    private String parent;
    private String stats;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = ()obj;
            if (id == null ? ((id) (obj)).id != null : !id.equals(((id) (obj)).id))
            {
                return false;
            }
        }
        return true;
    }

    public String getBrowseToken()
    {
        return browseToken;
    }

    public browseToken[] getChildren()
    {
        return children;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getParent()
    {
        return parent;
    }

    public String getStats()
    {
        return stats;
    }

    public int hashCode()
    {
        if (id != null)
        {
            return id.hashCode();
        } else
        {
            return 0;
        }
    }

    public void setBrowseToken(String s)
    {
        browseToken = s;
    }

    public void setChildren(browseToken abrowsetoken[])
    {
        children = abrowsetoken;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setParent(String s)
    {
        parent = s;
    }

    public void setStats(String s)
    {
        stats = s;
    }

    public ()
    {
    }
}
