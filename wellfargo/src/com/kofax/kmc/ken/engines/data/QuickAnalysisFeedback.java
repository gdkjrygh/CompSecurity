// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.Log;
import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.kofax.kmc.ken.engines.data:
//            BoundingTetragon

public class QuickAnalysisFeedback
    implements Serializable, Cloneable
{

    private static final long serialVersionUID = 0xb7d2937906c1459cL;
    private String TAG;
    private transient String dataToProcess;
    private transient Boolean isBlurry;
    private transient Boolean isOversaturated;
    private transient Boolean isUndersaturated;
    private transient Point p1;
    private transient Point p2;
    private transient Point p3;
    private transient Point p4;
    private transient Map resultMap;
    private transient BoundingTetragon tetragonCorners;
    private transient Bitmap viewBoundariesImage;

    public QuickAnalysisFeedback()
    {
        TAG = "QuickAnalysisFeedback";
        tetragonCorners = null;
        dataToProcess = new String();
        viewBoundariesImage = null;
        resultMap = null;
        p1 = null;
        p2 = null;
        p3 = null;
        p4 = null;
        if (tetragonCorners == null)
        {
            tetragonCorners = new BoundingTetragon();
            p1 = new Point();
            p2 = new Point();
            p3 = new Point();
            p4 = new Point();
        }
        reset_paramters();
    }

    private Map parse(JSONObject jsonobject, Map map)
    {
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            String s = null;
            try
            {
                Log.d(TAG, (new StringBuilder()).append("Key in recursion :: ").append(s1).toString());
                parse(jsonobject.getJSONObject(s1), map);
            }
            catch (Exception exception)
            {
                exception = jsonobject.getString(s1);
            }
            if (s != null)
            {
                map.put(s1, s);
            }
        } while (true);
        return map;
    }

    private void populateBoundingTetragon(Map map)
    {
        p1.set((int)Float.parseFloat((String)map.get("TLx")), (int)Float.parseFloat((String)map.get("TLy")));
        tetragonCorners.setTopLeft(p1);
        p2.set((int)Float.parseFloat((String)map.get("TRx")), (int)Float.parseFloat((String)map.get("TRy")));
        tetragonCorners.setTopRight(p2);
        p3.set((int)Float.parseFloat((String)map.get("BLx")), (int)Float.parseFloat((String)map.get("BLy")));
        tetragonCorners.setBottomLeft(p3);
        p4.set((int)Float.parseFloat((String)map.get("BRx")), (int)Float.parseFloat((String)map.get("BRy")));
        tetragonCorners.setBottomRight(p4);
    }

    private void populateQuickAnalysisParameters(Map map)
    {
        if (map != null)
        {
            populateBoundingTetragon(map);
            String s = (String)map.get("Blurry");
            if (s != null && s.equals("true"))
            {
                isBlurry = Boolean.valueOf(true);
            }
            String s1 = (String)map.get("Oversaturated");
            if (s1 != null && s1.equals("true"))
            {
                isOversaturated = Boolean.valueOf(true);
            }
            map = (String)map.get("Undersaturated");
            if (map != null && map.equals("true"))
            {
                isUndersaturated = Boolean.valueOf(true);
            }
            Log.d(TAG, (new StringBuilder()).append("Blurry Val ==> ").append(s).toString());
            Log.d(TAG, (new StringBuilder()).append("Oversaturated Val ==> ").append(s1).toString());
            Log.d(TAG, (new StringBuilder()).append("Undersaturated Val ==> ").append(map).toString());
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        if (com/kofax/kmc/ken/engines/data/QuickAnalysisFeedback.getName().compareToIgnoreCase((String)objectinputstream.readObject()) == 0)
        {
            String s = (String)objectinputstream.readObject();
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), s).booleanValue())
            {
                isBlurry = (Boolean)objectinputstream.readObject();
                isOversaturated = (Boolean)objectinputstream.readObject();
                isUndersaturated = (Boolean)objectinputstream.readObject();
                tetragonCorners = (BoundingTetragon)objectinputstream.readObject();
                dataToProcess = (String)objectinputstream.readObject();
                resultMap = (Map)objectinputstream.readObject();
                p1 = new Point(((Integer)objectinputstream.readObject()).intValue(), ((Integer)objectinputstream.readObject()).intValue());
                p2 = new Point(((Integer)objectinputstream.readObject()).intValue(), ((Integer)objectinputstream.readObject()).intValue());
                p3 = new Point(((Integer)objectinputstream.readObject()).intValue(), ((Integer)objectinputstream.readObject()).intValue());
                p4 = new Point(((Integer)objectinputstream.readObject()).intValue(), ((Integer)objectinputstream.readObject()).intValue());
                return;
            } else
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
            }
        } else
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
        }
    }

    private void reset_paramters()
    {
        isBlurry = Boolean.valueOf(false);
        isOversaturated = Boolean.valueOf(false);
        isUndersaturated = Boolean.valueOf(false);
        dataToProcess = "";
        if (viewBoundariesImage != null)
        {
            viewBoundariesImage.recycle();
            viewBoundariesImage = null;
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(com/kofax/kmc/ken/engines/data/QuickAnalysisFeedback.getName());
        objectoutputstream.writeObject(KenVersion.getPackageVersion());
        objectoutputstream.writeObject(isBlurry);
        objectoutputstream.writeObject(isOversaturated);
        objectoutputstream.writeObject(isUndersaturated);
        objectoutputstream.writeObject(tetragonCorners);
        objectoutputstream.writeObject(dataToProcess);
        objectoutputstream.writeObject(resultMap);
        objectoutputstream.writeObject(Integer.valueOf(p1.x));
        objectoutputstream.writeObject(Integer.valueOf(p1.y));
        objectoutputstream.writeObject(Integer.valueOf(p2.x));
        objectoutputstream.writeObject(Integer.valueOf(p2.y));
        objectoutputstream.writeObject(Integer.valueOf(p3.x));
        objectoutputstream.writeObject(Integer.valueOf(p3.y));
        objectoutputstream.writeObject(Integer.valueOf(p4.x));
        objectoutputstream.writeObject(Integer.valueOf(p4.y));
    }

    public QuickAnalysisFeedback clone()
    {
        Log.i(TAG, "Enter:: QuickAnalysisFeedback clone");
        QuickAnalysisFeedback quickanalysisfeedback;
        try
        {
            quickanalysisfeedback = (QuickAnalysisFeedback)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            clonenotsupportedexception.printStackTrace();
            throw new InternalError("QuickAnalysisFeedback: unexpected clone not supported exception");
        }
        return quickanalysisfeedback;
    }

    public volatile Object clone()
    {
        return clone();
    }

    public BoundingTetragon getTetragonCorners()
    {
        if (tetragonCorners != null)
        {
            return tetragonCorners.clone();
        } else
        {
            return null;
        }
    }

    public Bitmap getViewBoundariesImage()
    {
        return viewBoundariesImage;
    }

    public boolean isBlurry()
    {
        return isBlurry.booleanValue();
    }

    public boolean isOversaturated()
    {
        return isOversaturated.booleanValue();
    }

    public boolean isUndersaturated()
    {
        return isUndersaturated.booleanValue();
    }





/*
    static String access$202(QuickAnalysisFeedback quickanalysisfeedback, String s)
    {
        quickanalysisfeedback.dataToProcess = s;
        return s;
    }

*/



/*
    static Map access$302(QuickAnalysisFeedback quickanalysisfeedback, Map map)
    {
        quickanalysisfeedback.resultMap = map;
        return map;
    }

*/




/*
    static Bitmap access$602(QuickAnalysisFeedback quickanalysisfeedback, Bitmap bitmap)
    {
        quickanalysisfeedback.viewBoundariesImage = bitmap;
        return bitmap;
    }

*/
}
