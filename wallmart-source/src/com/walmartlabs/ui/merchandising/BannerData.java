// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.merchandising;


public class BannerData
{

    public String action;
    public Object data;
    public String image;
    public String text;
    public String type;

    public BannerData()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (BannerData)obj;
        if (action == null)
        {
            if (((BannerData) (obj)).action != null)
            {
                return false;
            }
        } else
        if (!action.equals(((BannerData) (obj)).action))
        {
            return false;
        }
        if (image == null)
        {
            if (((BannerData) (obj)).image != null)
            {
                return false;
            }
        } else
        if (!image.equals(((BannerData) (obj)).image))
        {
            return false;
        }
        if (text == null)
        {
            if (((BannerData) (obj)).text != null)
            {
                return false;
            }
        } else
        if (!text.equals(((BannerData) (obj)).text))
        {
            return false;
        }
        if (type != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((BannerData) (obj)).type == null) goto _L1; else goto _L3
_L3:
        return false;
        if (type.equals(((BannerData) (obj)).type)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (action == null)
        {
            i = 0;
        } else
        {
            i = action.hashCode();
        }
        if (image == null)
        {
            j = 0;
        } else
        {
            j = image.hashCode();
        }
        if (text == null)
        {
            k = 0;
        } else
        {
            k = text.hashCode();
        }
        if (type != null)
        {
            l = type.hashCode();
        }
        return (((i + 31) * 31 + j) * 31 + k) * 31 + l;
    }

    public String toString()
    {
        return (new StringBuilder()).append("BannerData[image=").append(image).append(", text=").append(text).append(", action=").append(action).append(", type=").append(type).append("]").toString();
    }
}
