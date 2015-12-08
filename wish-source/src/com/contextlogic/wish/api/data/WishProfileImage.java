// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.facebook.FacebookManager;
import java.io.Serializable;

public class WishProfileImage
    implements Serializable
{
    public static final class ImageSize extends Enum
    {

        private static final ImageSize $VALUES[];
        public static final ImageSize Large;
        public static final ImageSize Medium;
        public static final ImageSize Small;

        public static ImageSize valueOf(String s)
        {
            return (ImageSize)Enum.valueOf(com/contextlogic/wish/api/data/WishProfileImage$ImageSize, s);
        }

        public static ImageSize[] values()
        {
            return (ImageSize[])$VALUES.clone();
        }

        static 
        {
            Small = new ImageSize("Small", 0);
            Medium = new ImageSize("Medium", 1);
            Large = new ImageSize("Large", 2);
            $VALUES = (new ImageSize[] {
                Small, Medium, Large
            });
        }

        private ImageSize(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0xa57b8414f83a655eL;
    private String baseUrlString;
    private boolean canResize;
    private String largeImageUrlString;
    private String mediumImageUrlString;
    private String smallImageUrlString;

    public WishProfileImage(String s)
    {
        this(s, false);
    }

    public WishProfileImage(String s, boolean flag)
    {
        if (flag)
        {
            smallImageUrlString = FacebookManager.getProfileImageUrlString(s, com.contextlogic.wish.facebook.FacebookManager.FacebookProfileImageSize.Small);
            mediumImageUrlString = FacebookManager.getProfileImageUrlString(s, com.contextlogic.wish.facebook.FacebookManager.FacebookProfileImageSize.Normal);
            largeImageUrlString = FacebookManager.getProfileImageUrlString(s, com.contextlogic.wish.facebook.FacebookManager.FacebookProfileImageSize.Large);
            baseUrlString = smallImageUrlString;
            canResize = true;
            return;
        } else
        {
            baseUrlString = s;
            canResize = false;
            return;
        }
    }

    private String resizeImageUrlString(String s, ImageSize imagesize)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L9:
        return s1;
_L2:
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$api$data$WishProfileImage$ImageSize[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$api$data$WishProfileImage$ImageSize = new int[ImageSize.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishProfileImage$ImageSize[ImageSize.Small.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishProfileImage$ImageSize[ImageSize.Medium.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.contextlogic.wish.api.data.WishProfileImage.ImageSize[imagesize.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 62
    //                   2 68;
           goto _L3 _L4 _L5
_L3:
        imagesize = "-large.";
_L7:
        s1 = s;
        if (s.contains("-tiny."))
        {
            return s.replace("-tiny.", imagesize);
        }
        break; /* Loop/switch isn't completed */
_L4:
        imagesize = "-small.";
        continue; /* Loop/switch isn't completed */
_L5:
        imagesize = "-medium.";
        if (true) goto _L7; else goto _L6
_L6:
        if (s.contains("-small."))
        {
            return s.replace("-small.", imagesize);
        }
        if (s.contains("-medium."))
        {
            return s.replace("-medium.", imagesize);
        }
        if (s.contains("-large."))
        {
            return s.replace("-large.", imagesize);
        }
        if (s.contains("-original."))
        {
            return s.replace("-original.", imagesize);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public String getUrlString(ImageSize imagesize)
    {
        if (!canResize)
        {
            return baseUrlString;
        }
        switch (_cls1..SwitchMap.com.contextlogic.wish.api.data.WishProfileImage.ImageSize[imagesize.ordinal()])
        {
        default:
            if (largeImageUrlString == null)
            {
                largeImageUrlString = resizeImageUrlString(baseUrlString, imagesize);
            }
            return largeImageUrlString;

        case 1: // '\001'
            if (smallImageUrlString == null)
            {
                smallImageUrlString = resizeImageUrlString(baseUrlString, imagesize);
            }
            return smallImageUrlString;

        case 2: // '\002'
            break;
        }
        if (mediumImageUrlString == null)
        {
            mediumImageUrlString = resizeImageUrlString(baseUrlString, imagesize);
        }
        return mediumImageUrlString;
    }

    public void setCanResize(boolean flag)
    {
        canResize = flag;
    }

    public void setUrlString(String s, ImageSize imagesize)
    {
        switch (_cls1..SwitchMap.com.contextlogic.wish.api.data.WishProfileImage.ImageSize[imagesize.ordinal()])
        {
        default:
            largeImageUrlString = s;
            return;

        case 1: // '\001'
            smallImageUrlString = s;
            return;

        case 2: // '\002'
            mediumImageUrlString = s;
            break;
        }
    }
}
