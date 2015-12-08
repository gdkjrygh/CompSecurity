// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.text.TextUtils;
import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.weather.commons.video:
//            VideoMessage

public final class AdaptiveVideoFeedParser
{

    private static final String ADAPTIVE_COUNTRY_ELEMENT = "country";
    private static final String ADAPTIVE_DMA_ELEMENT = "dma";
    private static final String ADAPTIVE_REGION_ELEMENT = "region";
    private static final String ADAPTIVE_ROOT_ELEMENT = "feed";
    private static final String ADAPTIVE_STATE_ELEMENT = "state";
    private static final String ADAPTIVE_THUMBNAIL_ELEMENT = "thumbnailurl";
    private static final String ADAPTIVE_VIDEO_ELEMENT = "video";
    private static final String ADAPTIVE_VIDEO_LINK_ELEMENT = "androidurl";
    private static final String CLIPID = "clipid";
    private static final String DESCRIPTION = "description";
    private static final String KEYWORDS = "keywords";
    private static final String LINK = "link";
    private static final String THUMBNAIL = "thumbnailURL";
    private static final String TITLE = "title";
    private final VideoMessage.VideoType videoType;
    private final String xml;

    public AdaptiveVideoFeedParser(String s, VideoMessage.VideoType videotype)
    {
        xml = s;
        videoType = videotype;
    }

    public List parseList()
        throws XmlPullParserException, IOException
    {
        VideoMessage videomessage;
        ArrayList arraylist;
        XmlPullParser xmlpullparser;
        boolean flag;
        int i;
        arraylist = new ArrayList();
        xmlpullparser = Xml.newPullParser();
        xmlpullparser.setInput(new StringReader(xml));
        i = xmlpullparser.getEventType();
        videomessage = null;
        flag = false;
_L2:
        Object obj;
        int j;
        if (i == 1 || flag)
        {
            break MISSING_BLOCK_LABEL_818;
        }
        obj = videomessage;
        j = ((flag) ? 1 : 0);
        switch (i)
        {
        default:
            j = ((flag) ? 1 : 0);
            obj = videomessage;
            break;

        case 0: // '\0'
        case 1: // '\001'
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_747;
        }
_L3:
        i = xmlpullparser.next();
        videomessage = ((VideoMessage) (obj));
        flag = j;
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = xmlpullparser.getName().toLowerCase(Locale.US);
        if (((String) (obj1)).equals("video"))
        {
            obj = new VideoMessage();
            ((VideoMessage) (obj)).setType(videoType);
            j = ((flag) ? 1 : 0);
        } else
        {
            obj = videomessage;
            j = ((flag) ? 1 : 0);
            if (videomessage != null)
            {
                if (((String) (obj1)).equals("description"))
                {
                    videomessage.setDescription(xmlpullparser.nextText());
                    obj = videomessage;
                    j = ((flag) ? 1 : 0);
                } else
                if (((String) (obj1)).equals("clipid"))
                {
                    videomessage.setClipid(xmlpullparser.nextText());
                    obj = videomessage;
                    j = ((flag) ? 1 : 0);
                } else
                if (((String) (obj1)).equals("title"))
                {
                    videomessage.setTitle(xmlpullparser.nextText());
                    obj = videomessage;
                    j = ((flag) ? 1 : 0);
                } else
                if (((String) (obj1)).equals("thumbnailURL"))
                {
                    videomessage.setThumbnailLink(xmlpullparser.nextText());
                    obj = videomessage;
                    j = ((flag) ? 1 : 0);
                } else
                if (((String) (obj1)).equals("dma"))
                {
                    videomessage.setDMA(xmlpullparser.nextText());
                    obj = videomessage;
                    j = ((flag) ? 1 : 0);
                } else
                if (((String) (obj1)).equals("region"))
                {
                    videomessage.setRegion(xmlpullparser.nextText());
                    obj = videomessage;
                    j = ((flag) ? 1 : 0);
                } else
                if (((String) (obj1)).equals("state"))
                {
                    videomessage.setState(xmlpullparser.nextText());
                    obj = videomessage;
                    j = ((flag) ? 1 : 0);
                } else
                {
label0:
                    {
                        if (!((String) (obj1)).equals("country"))
                        {
                            break label0;
                        }
                        videomessage.setCountry(xmlpullparser.nextText());
                        obj = videomessage;
                        j = ((flag) ? 1 : 0);
                    }
                }
            }
        }
          goto _L3
        if (!((String) (obj1)).equals("keywords"))
        {
            break MISSING_BLOCK_LABEL_651;
        }
        obj1 = xmlpullparser.nextText();
        if (!TextUtils.isEmpty(videomessage.getDMA())) goto _L5; else goto _L4
_L4:
        char ac[];
        obj = new StringBuilder();
        ac = ((String) (obj1)).toCharArray();
        j = ac.length;
        i = 0;
_L11:
        if (i >= j) goto _L7; else goto _L6
_L6:
        char c = ac[i];
        if (!Character.isDigit(c)) goto _L9; else goto _L8
_L8:
        ((StringBuilder) (obj)).append(c);
        if (((StringBuilder) (obj)).length() != 3) goto _L9; else goto _L7
_L7:
        videomessage.setDMA(((StringBuilder) (obj)).toString());
_L5:
        obj = videomessage;
        j = ((flag) ? 1 : 0);
        if (videomessage.getVideoType() != VideoMessage.VideoType.MUST_SEE) goto _L3; else goto _L10
_L10:
        obj1 = new StringTokenizer(((String) (obj1)), ",");
_L13:
        obj = videomessage;
        j = ((flag) ? 1 : 0);
        if (((StringTokenizer) (obj1)).hasMoreTokens())
        {
            obj = ((StringTokenizer) (obj1)).nextToken().toLowerCase(Locale.US);
            if (((String) (obj)).contains("cantore"))
            {
                videomessage.setType(VideoMessage.VideoType.CANTORE);
                obj = videomessage;
                j = ((flag) ? 1 : 0);
            } else
            {
                if (!((String) (obj)).contains("tornado"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                videomessage.setType(VideoMessage.VideoType.TORNADO);
                obj = videomessage;
                j = ((flag) ? 1 : 0);
            }
        }
          goto _L3
_L9:
        i++;
          goto _L11
        if (!((String) (obj)).contains("tropical")) goto _L13; else goto _L12
_L12:
        videomessage.setType(VideoMessage.VideoType.TROPICAL);
        obj = videomessage;
        j = ((flag) ? 1 : 0);
          goto _L3
        if (((String) (obj1)).equals("thumbnailurl"))
        {
            videomessage.setThumbnailLink(xmlpullparser.nextText());
            obj = videomessage;
            j = ((flag) ? 1 : 0);
        } else
        if (((String) (obj1)).equals("link"))
        {
            videomessage.setVideoLink(xmlpullparser.nextText());
            obj = videomessage;
            j = ((flag) ? 1 : 0);
        } else
        {
            obj = videomessage;
            j = ((flag) ? 1 : 0);
            if (((String) (obj1)).equals("androidurl"))
            {
                videomessage.setUnicornVideoLink(xmlpullparser.nextText());
                obj = videomessage;
                j = ((flag) ? 1 : 0);
            }
        }
          goto _L3
        String s = xmlpullparser.getName().toLowerCase(Locale.US);
        if (videomessage != null && s.equals("video"))
        {
            arraylist.add(videomessage);
            obj = videomessage;
            j = ((flag) ? 1 : 0);
        } else
        {
            obj = videomessage;
            j = ((flag) ? 1 : 0);
            if (s.equals("feed"))
            {
                j = 1;
                obj = videomessage;
            }
        }
          goto _L3
        return arraylist;
    }
}
