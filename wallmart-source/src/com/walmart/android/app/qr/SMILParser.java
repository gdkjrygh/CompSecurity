// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.walmart.android.utils.ViewUtil;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class SMILParser
{
    private static class VideoURL
        implements Comparable
    {

        private Integer bitRate;
        private String url;

        public int compareTo(VideoURL videourl)
        {
            return bitRate.compareTo(videourl.bitRate);
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((VideoURL)obj);
        }

        public String toString()
        {
            return (new StringBuilder()).append(bitRate).append(", ").append(url).toString();
        }



        private VideoURL(int i, String s)
        {
            bitRate = Integer.valueOf(i);
            url = s;
        }

    }


    public static final String TAG = com/walmart/android/app/qr/SMILParser.getSimpleName();
    private String baseURL;
    private ArrayList videoURLS;

    public SMILParser(String s)
    {
        Object obj;
        videoURLS = new ArrayList();
        obj = DocumentBuilderFactory.newInstance();
        obj = ((DocumentBuilderFactory) (obj)).newDocumentBuilder();
        InputSource inputsource;
        inputsource = new InputSource(new StringReader(s));
        s = null;
        obj = ((DocumentBuilder) (obj)).parse(inputsource);
        s = ((String) (obj));
        break MISSING_BLOCK_LABEL_50;
        s;
        Log.e(TAG, "", s);
_L2:
        return;
        obj2;
        Log.e(TAG, "", ((Throwable) (obj2)));
          goto _L1
        obj2;
        Log.e(TAG, "", ((Throwable) (obj2)));
_L1:
label0:
        {
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_358;
            }
            Object obj1 = s.getDocumentElement();
            if (obj1 != null)
            {
                ((Element) (obj1)).normalize();
                obj1 = s.getElementsByTagName("video");
                int k = ((NodeList) (obj1)).getLength();
                int i = 0;
                while (i < k) 
                {
                    Object obj4 = ((NodeList) (obj1)).item(i);
                    Object obj3 = getAttributeValue(((Node) (obj4)), "src");
                    obj4 = getAttributeValue(((Node) (obj4)), "systembitrate");
                    Object obj2;
                    if (obj3 != null && obj4 != null)
                    {
                        try
                        {
                            obj3 = new VideoURL(Integer.parseInt(((String) (obj4))), ((String) (obj3)));
                            videoURLS.add(obj3);
                        }
                        catch (NumberFormatException numberformatexception)
                        {
                            Log.e(TAG, "unable to parse bitrate", numberformatexception);
                        }
                    }
                    i++;
                }
                s = s.getElementsByTagName("meta");
                k = s.getLength();
                for (int j = 0; j < k; j++)
                {
                    Node node = s.item(j);
                    if (getAttributeValue(node, "name").equals("httpBase"))
                    {
                        baseURL = getAttributeValue(node, "content");
                        if (baseURL == null)
                        {
                            baseURL = getAttributeValue(node, "nt");
                        }
                    }
                }

                break label0;
            }
            Log.e(TAG, "documentElement == null");
        }
_L3:
        Collections.sort(videoURLS);
        s = videoURLS.iterator();
        VideoURL videourl;
        while (s.hasNext()) 
        {
            videourl = (VideoURL)s.next();
        }
          goto _L2
        Log.e(TAG, "documen == null");
          goto _L3
    }

    private String getAttributeValue(Node node, String s)
    {
        node = node.getAttributes();
        if (node != null)
        {
            if ((node = node.getNamedItem(s)) != null)
            {
                return node.getNodeValue();
            }
        }
        return null;
    }

    public String getAppropriateMediaURL(Activity activity)
    {
        boolean flag = false;
        int i = ViewUtil.getScreenMaxDimension(activity);
        if (((ConnectivityManager)activity.getSystemService("connectivity")).getNetworkInfo(1).isConnected())
        {
            flag = true;
        }
        if (flag)
        {
            if (i >= 800)
            {
                return getMediaURL(800);
            } else
            {
                return getMediaURL(400);
            }
        }
        if (i >= 800)
        {
            return getMediaURL(400);
        } else
        {
            return getMediaURL(200);
        }
    }

    public String getMediaURL(int i)
    {
        int k = videoURLS.size();
        VideoURL videourl1 = null;
        int j = k - 1;
        do
        {
label0:
            {
                VideoURL videourl = videourl1;
                if (j >= 0)
                {
                    videourl = (VideoURL)videoURLS.get(j);
                    if (videourl.bitRate.intValue() > i)
                    {
                        break label0;
                    }
                }
                videourl1 = videourl;
                if (videourl == null)
                {
                    videourl1 = videourl;
                    if (k > 0)
                    {
                        videourl1 = (VideoURL)videoURLS.get(0);
                    }
                }
                if (videourl1 != null)
                {
                    return (new StringBuilder()).append(baseURL).append(videourl1.url).toString();
                } else
                {
                    return null;
                }
            }
            j--;
        } while (true);
    }

}
