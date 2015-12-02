// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            Box, MediaBox, MediaInformationBox, TrackHeaderBox, 
//            SampleTableBox

public class TrackBox extends AbstractContainerBox
{

    public static final String TYPE = "trak";

    public TrackBox()
    {
        super("trak");
    }

    public MediaBox getMediaBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof MediaBox));
        return (MediaBox)box;
    }

    public SampleTableBox getSampleTableBox()
    {
        Object obj = getMediaBox();
        if (obj != null)
        {
            obj = ((MediaBox) (obj)).getMediaInformationBox();
            if (obj != null)
            {
                return ((MediaInformationBox) (obj)).getSampleTableBox();
            }
        }
        return null;
    }

    public TrackHeaderBox getTrackHeaderBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof TrackHeaderBox));
        return (TrackHeaderBox)box;
    }
}
