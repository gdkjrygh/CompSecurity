// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.io.Serializable;

public class WishImage
    implements Serializable
{
    public static final class ImageSize extends Enum
    {

        private static final ImageSize $VALUES[];
        public static final ImageSize Large;
        public static final ImageSize Medium;
        public static final ImageSize Small;
        public static final ImageSize Tiny;

        public static ImageSize valueOf(String s)
        {
            return (ImageSize)Enum.valueOf(com/contextlogic/wish/api/data/WishImage$ImageSize, s);
        }

        public static ImageSize[] values()
        {
            return (ImageSize[])$VALUES.clone();
        }

        static 
        {
            Tiny = new ImageSize("Tiny", 0);
            Small = new ImageSize("Small", 1);
            Medium = new ImageSize("Medium", 2);
            Large = new ImageSize("Large", 3);
            $VALUES = (new ImageSize[] {
                Tiny, Small, Medium, Large
            });
        }

        private ImageSize(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x41cbf067a70f35c6L;
    private String baseUrlString;
    private boolean canResize;
    private String largeImageUrlString;
    private String mediumImageUrlString;
    private String smallImageUrlString;
    private String tinyImageUrlString;

    public WishImage(String s)
    {
        baseUrlString = s;
        canResize = true;
    }

    private String resizeImageUrlString(String s, ImageSize imagesize)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$api$data$WishImage$ImageSize[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$api$data$WishImage$ImageSize = new int[ImageSize.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishImage$ImageSize[ImageSize.Tiny.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishImage$ImageSize[ImageSize.Small.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishImage$ImageSize[ImageSize.Medium.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.contextlogic.wish.api.data.WishImage.ImageSize[imagesize.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 60
    //                   2 66
    //                   3 72;
           goto _L1 _L2 _L3 _L4
_L1:
        imagesize = "-large.";
_L10:
        String s1 = s;
        if (!s.contains("-tiny.")) goto _L6; else goto _L5
_L5:
        s1 = s.replace("-tiny.", imagesize);
_L8:
        return s1;
_L2:
        imagesize = "-tiny.";
        continue; /* Loop/switch isn't completed */
_L3:
        imagesize = "-small.";
        continue; /* Loop/switch isn't completed */
_L4:
        imagesize = "-medium.";
        continue; /* Loop/switch isn't completed */
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
        if (!s.contains("-original.")) goto _L8; else goto _L7
_L7:
        return s.replace("-original.", imagesize);
        if (true) goto _L10; else goto _L9
_L9:
    }

    public String getUrlString(ImageSize imagesize)
    {
        if (!canResize)
        {
            return baseUrlString;
        }
        switch (_cls1..SwitchMap.com.contextlogic.wish.api.data.WishImage.ImageSize[imagesize.ordinal()])
        {
        default:
            if (largeImageUrlString == null)
            {
                largeImageUrlString = resizeImageUrlString(baseUrlString, imagesize);
            }
            return largeImageUrlString;

        case 1: // '\001'
            if (tinyImageUrlString == null)
            {
                tinyImageUrlString = resizeImageUrlString(baseUrlString, imagesize);
            }
            return tinyImageUrlString;

        case 2: // '\002'
            if (smallImageUrlString == null)
            {
                smallImageUrlString = resizeImageUrlString(baseUrlString, imagesize);
            }
            return smallImageUrlString;

        case 3: // '\003'
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
        switch (_cls1..SwitchMap.com.contextlogic.wish.api.data.WishImage.ImageSize[imagesize.ordinal()])
        {
        default:
            largeImageUrlString = s;
            return;

        case 1: // '\001'
            tinyImageUrlString = s;
            return;

        case 2: // '\002'
            smallImageUrlString = s;
            return;

        case 3: // '\003'
            mediumImageUrlString = s;
            break;
        }
    }
}
