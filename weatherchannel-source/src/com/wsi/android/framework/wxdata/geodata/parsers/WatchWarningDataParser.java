// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.geodata.parsers;

import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.ui.map.TwcGeoPoint;
import com.wsi.android.framework.ui.utils.MapRect;
import com.wsi.android.framework.wxdata.geodata.items.GeoPolygonArea;
import com.wsi.android.framework.wxdata.geodata.items.ww.WatchWarningBox;
import com.wsi.android.framework.wxdata.geodata.items.ww.WatchWarningBoxCollection;
import com.wsi.android.framework.wxdata.utils.ServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

// Referenced classes of package com.wsi.android.framework.wxdata.geodata.parsers:
//            GeoObjectDataParser

public class WatchWarningDataParser extends GeoObjectDataParser
{

    static final int ADJACENT_TO_DELETE = 3;
    static final int ADJACENT_TO_RETAIN = 2;
    static final int ADJACENT_UNPROCESSED = 1;
    public static final String A_COORDINATES_CS = "cs";
    public static final String A_COORDINATES_TS = "ts";
    private static final double DP_TOLERANCE = 5000D;
    private static final double DP_TOLERANCE_SQ = 25000000D;
    public static final String E_ACTION = "Action";
    public static final String E_ACTIVE_AT = "ActiveAt";
    public static final String E_COORDINATES = "coordinates";
    public static final String E_DESC = "DESC";
    public static final String E_LINEAR_RING = "LinearRing";
    public static final String E_POLYGON = "Polygon";
    public static final String E_SUB_TYPE = "SUB_TYPE";
    public static final String E_TYPE = "TYPE";
    public static final String E_WAYS = "WAYS";
    static final int NOT_ADJACENT = 0;
    private static final String TAG = com/wsi/android/framework/wxdata/geodata/parsers/WatchWarningDataParser.getSimpleName();
    private String curActiveAt;
    private String curCsSeparator;
    private String curDesc;
    private GeoPolygonArea curPolygonArea;
    private String curSubType;
    private String curTsSeparator;
    private String curType;
    private GeoPointLab geoPointLab;
    private boolean isInLinearRing;
    private long processingStartTime;
    private int reducedPoints;
    private long simplificationStartTime;

    public WatchWarningDataParser()
    {
        reducedPoints = 0;
    }

    private void addGeoPoints(String s)
    {
        StringTokenizer stringtokenizer = new StringTokenizer(s, curTsSeparator);
        TwcGeoPoint twcgeopoint = null;
        s = null;
        MapRect maprect = new MapRect();
        if (stringtokenizer.countTokens() < 3)
        {
            return;
        }
        int i = 0x55d4a80;
        int j = 0xaba9500;
        do
        {
            Object obj;
label0:
            {
    /* block-local class not found */
    class GeoPointLab {}

                if (stringtokenizer.hasMoreTokens())
                {
                    obj = new StringTokenizer(stringtokenizer.nextToken(), curCsSeparator);
                    if (((StringTokenizer) (obj)).countTokens() < 2)
                    {
                        continue;
                    }
                    int k = (int)((double)ServiceUtils.getFloatValue(((StringTokenizer) (obj)).nextToken()) * 1000000D);
                    int l = (int)((double)ServiceUtils.getFloatValue(((StringTokenizer) (obj)).nextToken()) * 1000000D);
                    if (twcgeopoint != null && k == j && l == i)
                    {
                        continue;
                    }
                    i = l;
                    j = k;
                    obj = GeoPointLab.access._mth100(geoPointLab, l, k);
                    maprect.correctBounds(l, k);
                    curPolygonArea.addGeoPoint(((TwcGeoPoint) (obj)));
                    if (twcgeopoint == null)
                    {
                        twcgeopoint = ((TwcGeoPoint) (obj));
                        geoPointLab.setAdjacentToRetain(((TwcGeoPoint) (obj)));
                        continue;
                    }
                    if (!obj.equals(twcgeopoint))
                    {
                        break label0;
                    }
                }
                if (s != null)
                {
                    geoPointLab.setAdjacentToRetain(s);
                }
                curPolygonArea.setBounds(maprect);
                return;
            }
            s = ((String) (obj));
        } while (true);
    }

    private String correctSeparator(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (!"".equals(s))
                {
                    break label0;
                }
            }
            s1 = " ";
        }
        return s1;
    }

    private void simplifyPolygon(GeoPolygonArea geopolygonarea)
    {
        if (geopolygonarea == null)
        {
            return;
        }
        Object obj = geopolygonarea.getGeoPoints();
        simplifyPolygon(((ArrayList) (obj)));
        ArrayList arraylist = new ArrayList(((ArrayList) (obj)).size() / 10);
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            TwcGeoPoint twcgeopoint = (TwcGeoPoint)((Iterator) (obj)).next();
            if (twcgeopoint != null)
            {
                arraylist.add(twcgeopoint);
            }
        } while (true);
        geopolygonarea.setGeoPoints(arraylist);
        reducedPoints = reducedPoints + arraylist.size();
    }

    private void simplifyPolygon(ArrayList arraylist)
    {
    /* block-local class not found */
    class StackRecord {}

        Stack stack;
        stack = new Stack();
        stack.push(new StackRecord(0, arraylist.size() - 2));
_L2:
        int j;
        int i1;
label0:
        do
        {
            if (stack.isEmpty())
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj = (StackRecord)stack.pop();
            int j1 = ((StackRecord) (obj)).first;
            int k1 = ((StackRecord) (obj)).last;
            obj = (TwcGeoPoint)arraylist.get(j1);
            TwcGeoPoint twcgeopoint1 = (TwcGeoPoint)arraylist.get(k1);
            double d3 = ((TwcGeoPoint) (obj)).getLongitudeE6();
            double d4 = ((TwcGeoPoint) (obj)).getLatitudeE6();
            double d5 = (double)twcgeopoint1.getLongitudeE6() - d3;
            double d6 = (double)twcgeopoint1.getLatitudeE6() - d4;
            j = j1 + 1;
            i1 = k1 - 1;
            double d = 0.0D;
            int k = 0;
            int i = j;
            do
            {
                if (i > i1)
                {
                    break;
                }
                obj = (TwcGeoPoint)arraylist.get(i);
                int l = k;
                double d1 = d;
                switch (geoPointLab.isAdjacent(((TwcGeoPoint) (obj))))
                {
                default:
                    double d2 = Math.abs((d4 - (double)((TwcGeoPoint) (obj)).getLatitudeE6()) * d5 - (d3 - (double)((TwcGeoPoint) (obj)).getLongitudeE6()) * d6);
                    l = k;
                    d1 = d;
                    if (d2 > d)
                    {
                        l = i;
                        d1 = d2;
                    }
                    // fall through

                case 3: // '\003'
                    i++;
                    k = l;
                    d = d1;
                    break;

                case 2: // '\002'
                    if (i - j1 > 1)
                    {
                        stack.push(new StackRecord(j1, i));
                    }
                    if (k1 - i > 1)
                    {
                        stack.push(new StackRecord(i, k1));
                    }
                    continue label0;
                }
            } while (true);
            if (d > 0.0D)
            {
                d = (d * d) / (d5 * d5 + d6 * d6);
            } else
            {
                d = 0.0D;
            }
            if (d <= 25000000D)
            {
                break;
            }
            obj = (TwcGeoPoint)arraylist.get(k);
            if (geoPointLab.isAdjacent(((TwcGeoPoint) (obj))) == 1)
            {
                geoPointLab.setAdjacentToRetain(((TwcGeoPoint) (obj)));
            }
            if (k - j1 > 1)
            {
                stack.push(new StackRecord(j1, k));
            }
            if (k1 - k > 1)
            {
                stack.push(new StackRecord(k, k1));
            }
        } while (true);
_L8:
        if (j > i1) goto _L2; else goto _L1
_L1:
        TwcGeoPoint twcgeopoint = (TwcGeoPoint)arraylist.get(j);
        geoPointLab.isAdjacent(twcgeopoint);
        JVM INSTR tableswitch 0 3: default 504
    //                   0 522
    //                   1 513
    //                   2 504
    //                   3 522;
           goto _L3 _L4 _L5 _L3 _L4
_L3:
        j++;
        break; /* Loop/switch isn't completed */
_L5:
        geoPointLab.setAdjacentToDelete(twcgeopoint);
_L4:
        arraylist.set(j, null);
        if (true) goto _L3; else goto _L6
_L6:
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void simplifyPolygons()
    {
        reducedPoints = 0;
        for (Iterator iterator = ((WatchWarningBoxCollection)getGeoDataCollection()).getData().iterator(); iterator.hasNext(); simplifyPolygon(((WatchWarningBox)iterator.next()).getPolygon())) { }
    }

    public void endElement(String s, String s1, String s2)
        throws SAXException
    {
        if (!"TYPE".equals(s1)) goto _L2; else goto _L1
_L1:
        curType = getElementText();
_L4:
        super.endElement(s, s1, s2);
        return;
_L2:
        if ("SUB_TYPE".equals(s1))
        {
            curSubType = getElementText();
        } else
        if ("DESC".equals(s1))
        {
            curDesc = getElementText();
        } else
        if ("Polygon".equals(s1))
        {
            ((WatchWarningBox)curGeoObject).setActiveTime(curActiveAt);
            ((WatchWarningBox)curGeoObject).setType(curType);
            ((WatchWarningBox)curGeoObject).setSubType(curSubType);
            ((WatchWarningBox)curGeoObject).setDesc(curDesc);
            ((WatchWarningBox)curGeoObject).setPolygon(curPolygonArea);
            moveCurrentGeoObjectToCollection();
            curPolygonArea = null;
        } else
        if ("coordinates".equals(s1))
        {
            if (curPolygonArea != null)
            {
                addGeoPoints(getElementText());
            }
        } else
        if ("LinearRing".equals(s1))
        {
            isInLinearRing = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void moveCurrentGeoObjectToCollection()
    {
        if (((WatchWarningBox)curGeoObject).getPolygon().getGeoPoints() != null)
        {
            super.moveCurrentGeoObjectToCollection();
        }
    }

    public void onCollectionEndTag()
    {
        if (ConfigInfo.DEBUG)
        {
            simplificationStartTime = ServiceUtils.getCurrentTimeMs();
        }
        if (ConfigInfo.DEBUG)
        {
            long l = ServiceUtils.getCurrentTimeMs();
            Log.i(TAG, (new StringBuilder()).append("The Watch/Warning data have been parsed and loaded in ").append((float)(l - processingStartTime) / 1000F).append(" sec.").toString());
            Log.i(TAG, (new StringBuilder()).append("The polygon simplification took ").append((float)(l - simplificationStartTime) / 1000F).append(" sec.").toString());
            Log.i(TAG, (new StringBuilder()).append("The number of obtained points ").append(geoPointLab.getSourcePoints()).append(" was reduced to ").append(reducedPoints).toString());
        }
        geoPointLab = null;
    }

    protected void onCollectionStartTag()
    {
        if (ConfigInfo.DEBUG)
        {
            processingStartTime = ServiceUtils.getCurrentTimeMs();
        }
        setCollection(new WatchWarningBoxCollection());
        geoPointLab = new GeoPointLab(null);
    }

    protected void onFeatureMemberEndTag()
    {
        curType = null;
        curSubType = null;
    }

    protected void onFeatureMemberStartTag()
    {
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
        throws SAXException
    {
        super.startElement(s, s1, s2, attributes);
        if ("TYPE".equals(s1))
        {
            curType = null;
        } else
        {
            if ("SUB_TYPE".equals(s1))
            {
                curSubType = null;
                return;
            }
            if ("DESC".equals(s1))
            {
                curDesc = null;
                return;
            }
            if ("Polygon".equals(s1))
            {
                setCurrentGeoObject(new WatchWarningBox());
                curPolygonArea = new GeoPolygonArea();
                return;
            }
            if ("LinearRing".equals(s1))
            {
                isInLinearRing = true;
                return;
            }
            if ("coordinates".equals(s1) && isInLinearRing)
            {
                curCsSeparator = correctSeparator(getAttributeValue("cs", attributes));
                curTsSeparator = correctSeparator(getAttributeValue("ts", attributes));
                return;
            }
        }
    }

}
