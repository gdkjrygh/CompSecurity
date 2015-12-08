// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.settings;

import com.google.android.maps.GeoPoint;
import com.wsi.android.framework.settings.helpers.SpeedUnit;
import com.wsi.android.framework.settings.helpers.TemperatureUnit;
import com.wsi.android.framework.ui.settings.MapUISettings;
import com.wsi.android.framework.ui.utils.ResourceUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package com.wsi.android.framework.settings:
//            Polling, SweepArmLength, SweepArmSpeed, LayerTransparency, 
//            GeoOverlays

public class Layer
{

    public static final String LEGEND_IMAGE_SPEED_SUFFIXES[];
    public static final String LEGEND_IMAGE_TEMP_SUFFIXES[];
    public static final String TYPE_NONE = "NONE";
    private GeoOverlays additionalOverlays;
    private boolean bumpMapping;
    private String futureID;
    private boolean isUnitDependentImage;
    private HashMap legendImageName;
    private HashMap localizedNames;
    private int logoNameResource;
    private Polling polling;
    private boolean showLegend;
    private boolean showLoop;
    private SweepArmLength sweepArmLength;
    private float sweepArmOpaqueness;
    private GeoPoint sweepArmPosition;
    private SweepArmSpeed sweepArmSpeed;
    private String tesseraID;
    private LayerTransparency transparency;
    private String url;
    private String warningText;

    public Layer()
    {
        localizedNames = new HashMap(2);
        legendImageName = new HashMap();
        logoNameResource = -1;
        sweepArmOpaqueness = -1F;
        additionalOverlays = null;
    }

    private boolean checkAndPutLegendImagesBySuffixes(String s, String as[])
    {
        boolean flag = false;
        int i = 0;
        String s1 = ResourceUtils.removeSuffix(s, "_", as);
        if (!s1.equals(s))
        {
            for (int j = as.length; i < j; i++)
            {
                s = as[i];
                legendImageName.put(s, (new StringBuilder()).append(s1).append("_").append(s).toString());
            }

            flag = true;
        }
        return flag;
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
        obj = (Layer)obj;
        if (bumpMapping != ((Layer) (obj)).bumpMapping)
        {
            return false;
        }
        if (futureID == null)
        {
            if (((Layer) (obj)).futureID != null)
            {
                return false;
            }
        } else
        if (!futureID.equals(((Layer) (obj)).futureID))
        {
            return false;
        }
        if (isUnitDependentImage != ((Layer) (obj)).isUnitDependentImage)
        {
            return false;
        }
        if (legendImageName == null)
        {
            if (((Layer) (obj)).legendImageName != null)
            {
                return false;
            }
        } else
        if (!legendImageName.equals(((Layer) (obj)).legendImageName))
        {
            return false;
        }
        if (localizedNames == null)
        {
            if (((Layer) (obj)).localizedNames != null)
            {
                return false;
            }
        } else
        if (!localizedNames.equals(((Layer) (obj)).localizedNames))
        {
            return false;
        }
        if (logoNameResource != ((Layer) (obj)).logoNameResource)
        {
            return false;
        }
        if (polling == null)
        {
            if (((Layer) (obj)).polling != null)
            {
                return false;
            }
        } else
        if (!polling.equals(((Layer) (obj)).polling))
        {
            return false;
        }
        if (showLegend != ((Layer) (obj)).showLegend)
        {
            return false;
        }
        if (showLoop != ((Layer) (obj)).showLoop)
        {
            return false;
        }
        if (sweepArmLength == null)
        {
            if (((Layer) (obj)).sweepArmLength != null)
            {
                return false;
            }
        } else
        if (!sweepArmLength.equals(((Layer) (obj)).sweepArmLength))
        {
            return false;
        }
        if (Float.floatToIntBits(sweepArmOpaqueness) != Float.floatToIntBits(((Layer) (obj)).sweepArmOpaqueness))
        {
            return false;
        }
        if (sweepArmPosition == null)
        {
            if (((Layer) (obj)).sweepArmPosition != null)
            {
                return false;
            }
        } else
        if (!sweepArmPosition.equals(((Layer) (obj)).sweepArmPosition))
        {
            return false;
        }
        if (sweepArmSpeed == null)
        {
            if (((Layer) (obj)).sweepArmSpeed != null)
            {
                return false;
            }
        } else
        if (!sweepArmSpeed.equals(((Layer) (obj)).sweepArmSpeed))
        {
            return false;
        }
        if (tesseraID == null)
        {
            if (((Layer) (obj)).tesseraID != null)
            {
                return false;
            }
        } else
        if (!tesseraID.equals(((Layer) (obj)).tesseraID))
        {
            return false;
        }
        if (transparency == null)
        {
            if (((Layer) (obj)).transparency != null)
            {
                return false;
            }
        } else
        if (!transparency.equals(((Layer) (obj)).transparency))
        {
            return false;
        }
        if (url == null)
        {
            if (((Layer) (obj)).url != null)
            {
                return false;
            }
        } else
        if (!url.equals(((Layer) (obj)).url))
        {
            return false;
        }
        if (warningText != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Layer) (obj)).warningText == null) goto _L1; else goto _L3
_L3:
        return false;
        if (warningText.equals(((Layer) (obj)).warningText)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Collection getAdditionalOverlays()
    {
        return additionalOverlays.getAsCollection();
    }

    public String getEnglishName()
    {
        return (String)localizedNames.get("en");
    }

    public String getFutureID()
    {
        return futureID;
    }

    public String getLegendImageName(MapUISettings mapuisettings)
        throws android.content.res.Resources.NotFoundException
    {
        if (legendImageName.isEmpty())
        {
            return null;
        }
        if (!isUnitDependentImage)
        {
            return (String)legendImageName.get("");
        }
        Object obj = mapuisettings.getCurrentSpeedUnits();
        if (obj != null)
        {
            obj = (String)legendImageName.get(((SpeedUnit) (obj)).toString().toLowerCase());
            if (obj != null)
            {
                return ((String) (obj));
            }
        }
        mapuisettings = mapuisettings.getCurrentTemperatureUnits();
        if (mapuisettings != null)
        {
            mapuisettings = (String)legendImageName.get(mapuisettings.toString().toLowerCase());
            if (mapuisettings != null)
            {
                return mapuisettings;
            }
        }
        return (String)legendImageName.get("");
    }

    public int getLogoNameResource()
    {
        return logoNameResource;
    }

    public String getName()
    {
        String s;
label0:
        {
            Locale locale = Locale.getDefault();
            String s1 = (String)localizedNames.get((new StringBuilder()).append(locale.getLanguage()).append("-r").append(locale.getCountry()).toString());
            if (s1 != null)
            {
                s = s1;
                if (!"".equals(s1))
                {
                    break label0;
                }
            }
            s = (String)localizedNames.get(locale.getLanguage());
        }
        String s2;
label1:
        {
            if (s != null)
            {
                s2 = s;
                if (!"".equals(s))
                {
                    break label1;
                }
            }
            s2 = (String)localizedNames.get(null);
        }
label2:
        {
            if (s2 != null)
            {
                s = s2;
                if (!"".equals(s2))
                {
                    break label2;
                }
            }
            s = (String)localizedNames.get(Locale.US.getLanguage());
        }
label3:
        {
            if (s != null)
            {
                s2 = s;
                if (!"".equals(s))
                {
                    break label3;
                }
            }
            s2 = (String)localizedNames.values().iterator().next();
        }
        return s2;
    }

    public Polling getPolling()
    {
        return polling;
    }

    public SweepArmLength getSweepArmLength()
    {
        return sweepArmLength;
    }

    public float getSweepArmOpaqueness()
    {
        return sweepArmOpaqueness;
    }

    public GeoPoint getSweepArmPosition()
    {
        return sweepArmPosition;
    }

    public SweepArmSpeed getSweepArmSpeed()
    {
        return sweepArmSpeed;
    }

    public String getTesseraID()
    {
        return tesseraID;
    }

    public LayerTransparency getTransparency()
    {
        return transparency;
    }

    public String getUrl()
    {
        return url;
    }

    public String getWarningText()
    {
        return warningText;
    }

    public boolean hasAdditionalOverlays()
    {
        return additionalOverlays != null && !additionalOverlays.isEmpty();
    }

    public int hashCode()
    {
        char c3 = '\u04CF';
        int k2 = 0;
        char c;
        int i;
        char c1;
        int j;
        int k;
        int l;
        char c2;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int l2;
        int i3;
        if (bumpMapping)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (futureID == null)
        {
            i = 0;
        } else
        {
            i = futureID.hashCode();
        }
        if (isUnitDependentImage)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (legendImageName == null)
        {
            j = 0;
        } else
        {
            j = legendImageName.hashCode();
        }
        if (localizedNames == null)
        {
            k = 0;
        } else
        {
            k = localizedNames.hashCode();
        }
        l2 = logoNameResource;
        if (polling == null)
        {
            l = 0;
        } else
        {
            l = polling.hashCode();
        }
        if (showLegend)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (!showLoop)
        {
            c3 = '\u04D5';
        }
        if (sweepArmLength == null)
        {
            i1 = 0;
        } else
        {
            i1 = sweepArmLength.hashCode();
        }
        i3 = Float.floatToIntBits(sweepArmOpaqueness);
        if (sweepArmPosition == null)
        {
            j1 = 0;
        } else
        {
            j1 = sweepArmPosition.hashCode();
        }
        if (sweepArmSpeed == null)
        {
            k1 = 0;
        } else
        {
            k1 = sweepArmSpeed.hashCode();
        }
        if (tesseraID == null)
        {
            l1 = 0;
        } else
        {
            l1 = tesseraID.hashCode();
        }
        if (transparency == null)
        {
            i2 = 0;
        } else
        {
            i2 = transparency.hashCode();
        }
        if (url == null)
        {
            j2 = 0;
        } else
        {
            j2 = url.hashCode();
        }
        if (warningText != null)
        {
            k2 = warningText.hashCode();
        }
        return ((((((((((((((((c + 31) * 31 + i) * 31 + c1) * 31 + j) * 31 + k) * 31 + l2) * 31 + l) * 31 + c2) * 31 + c3) * 31 + i1) * 31 + i3) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2;
    }

    public boolean isBumpMapping()
    {
        return bumpMapping;
    }

    public boolean isFutureLayerSupported()
    {
        return futureID != null;
    }

    public boolean isShowLegend()
    {
        return showLegend;
    }

    public boolean isShowLoop()
    {
        return showLoop;
    }

    public boolean isSweepingRadarEnabled()
    {
        return sweepArmPosition != null && sweepArmLength != null && sweepArmSpeed != null && sweepArmOpaqueness != -1F;
    }

    public boolean isUnitDependentImage()
    {
        return isUnitDependentImage;
    }

    public void putLocalizedName(String s, String s1)
    {
        localizedNames.put(s, s1);
    }

    public void setAdditionalOverlays(GeoOverlays geooverlays)
    {
        additionalOverlays = geooverlays;
    }

    public void setBumpMapping(boolean flag)
    {
        bumpMapping = flag;
    }

    public void setFutureID(String s)
    {
        futureID = s;
    }

    public void setLegendImageName(String s, String s1)
    {
        s1 = ResourceUtils.getResourceBaseName(s1);
        if (s != null && !"".equals(s))
        {
            legendImageName.put(s.toLowerCase(), s1);
        } else
        if (!checkAndPutLegendImagesBySuffixes(s1, LEGEND_IMAGE_SPEED_SUFFIXES) && !checkAndPutLegendImagesBySuffixes(s1, LEGEND_IMAGE_TEMP_SUFFIXES))
        {
            legendImageName.put("", s1);
            setUnitDependentImage(false);
            return;
        }
    }

    public void setLogoNameResource(int i)
    {
        logoNameResource = i;
    }

    public void setPolling(Polling polling1)
    {
        polling = polling1;
    }

    public void setShowLegend(boolean flag)
    {
        showLegend = flag;
    }

    public void setShowLoop(boolean flag)
    {
        showLoop = flag;
    }

    public void setSweepArmLength(SweepArmLength sweeparmlength)
    {
        sweepArmLength = sweeparmlength;
    }

    public void setSweepArmOpaqueness(float f)
    {
        sweepArmOpaqueness = f;
    }

    public void setSweepArmPosition(GeoPoint geopoint)
    {
        sweepArmPosition = geopoint;
    }

    public void setSweepArmSpeed(SweepArmSpeed sweeparmspeed)
    {
        sweepArmSpeed = sweeparmspeed;
    }

    public void setTesseraID(String s)
    {
        tesseraID = s;
    }

    public void setTransparency(LayerTransparency layertransparency)
    {
        transparency = layertransparency;
    }

    public void setUnitDependentImage(boolean flag)
    {
        isUnitDependentImage = flag;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setWarningText(String s)
    {
        warningText = s;
    }

    public String toString()
    {
        return getName();
    }

    static 
    {
        LEGEND_IMAGE_SPEED_SUFFIXES = (new String[] {
            SpeedUnit.MPH.toString().toLowerCase(), SpeedUnit.KPH.toString().toLowerCase()
        });
        LEGEND_IMAGE_TEMP_SUFFIXES = (new String[] {
            TemperatureUnit.F.toString().toLowerCase(), TemperatureUnit.C.toString().toLowerCase()
        });
    }
}
