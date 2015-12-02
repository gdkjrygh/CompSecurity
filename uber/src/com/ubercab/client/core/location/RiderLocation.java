// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.location;

import android.os.Parcelable;
import android.text.TextUtils;
import cir;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLocation;
import com.ubercab.client.core.model.CnLocation;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.rider.realtime.model.AddressComponent;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.ReverseGeocode;
import gjx;
import gjy;
import gka;
import gki;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.location:
//            Shape_RiderLocation, RiderAddressComponent

public abstract class RiderLocation
    implements Parcelable
{

    public static final String TYPE_BACKFILL = "backfill";
    public static final String TYPE_CACHE = "cache";
    public static final String TYPE_DEVICE = "device";
    public static final String TYPE_EXTERNAL = "external";
    public static final String TYPE_GEOCOD_MANUAL = "geocodmanual";
    public static final String TYPE_GOOGLE = "google";
    public static final String TYPE_HOTSPOT = "hotspot";
    public static final String TYPE_MANUAL = "manual";
    public static final String TYPE_VENUE = "venue";

    public RiderLocation()
    {
    }

    public static RiderLocation create()
    {
        return new Shape_RiderLocation();
    }

    public static RiderLocation create(UberLatLng uberlatlng)
    {
        return create("manual", uberlatlng.a(), uberlatlng.b());
    }

    public static RiderLocation create(UberLocation uberlocation)
    {
        return create("device", uberlocation);
    }

    public static RiderLocation create(LocationSearchResult locationsearchresult)
    {
        double d1 = 0.0D;
        double d;
        RiderLocation riderlocation;
        if (locationsearchresult.getLatitude() == null)
        {
            d = 0.0D;
        } else
        {
            d = locationsearchresult.getLatitude().doubleValue();
        }
        if (locationsearchresult.getLongitude() != null)
        {
            d1 = locationsearchresult.getLongitude().doubleValue();
        }
        riderlocation = create(locationsearchresult.getServiceType(), d, d1);
        riderlocation.update(locationsearchresult);
        return riderlocation;
    }

    public static RiderLocation create(Location location)
    {
        RiderLocation riderlocation = create(location.getType(), location.getLatitude(), location.getLongitude()).setId(location.getId()).setNickname(location.getNickname()).setAddress(location.getAddress()).setFormattedAddress(location.getFormattedAddress());
        Object obj = location.getAddressComponents();
        if (obj != null)
        {
            location = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); location.add(RiderAddressComponent.a((AddressComponent)((Iterator) (obj)).next()))) { }
            riderlocation.setListAddressComponents(location);
        }
        return riderlocation;
    }

    public static RiderLocation create(ReverseGeocode reversegeocode)
    {
        return create("geocodmanual", reversegeocode.getLatitude(), reversegeocode.getLongitude()).setId(reversegeocode.getId()).setNickname(reversegeocode.getNickname()).setShortAddress(reversegeocode.getShortAddress()).setLongAddress(reversegeocode.getLongAddress());
    }

    private static RiderLocation create(String s, double d, double d1)
    {
        return create(s, UberLocation.h().a(new UberLatLng(d, d1)).h());
    }

    public static RiderLocation create(String s, UberLatLng uberlatlng)
    {
        return create(s, uberlatlng.a(), uberlatlng.b());
    }

    public static RiderLocation create(String s, UberLatLng uberlatlng, List list, String s1, String s2)
    {
        return create(s, uberlatlng.a(), uberlatlng.b()).setListAddressComponents(list).setFormattedAddress(s1).setNickname(s2);
    }

    private static RiderLocation create(String s, UberLocation uberlocation)
    {
        return create().setLocation(uberlocation).setType(s);
    }

    private static RiderLocation create(String s, RiderLocation riderlocation)
    {
        return create().setType(s).setLocation(riderlocation.getLocation()).setAddress(riderlocation.getAddress()).setFormattedAddress(riderlocation.getFormattedAddress()).setId(riderlocation.getId()).setLongAddress(riderlocation.getLongAddress()).setNickname(riderlocation.getNickname()).setReference(riderlocation.getReference()).setReferenceType(riderlocation.getReferenceType()).setShortAddress(riderlocation.getShortAddress()).setTitle(riderlocation.getTitle()).setRelevance(riderlocation.getRelevance()).setSubtitle(riderlocation.getSubtitle()).setTag(riderlocation.getTag()).setListAddressComponents(riderlocation.getListAddressComponents());
    }

    public static RiderLocation updateWithReverseGeocode(RiderLocation riderlocation, ReverseGeocode reversegeocode)
    {
        riderlocation = create("geocodmanual", riderlocation);
        riderlocation.setId(reversegeocode.getId()).setNickname(reversegeocode.getNickname()).setShortAddress(reversegeocode.getShortAddress()).setLongAddress(reversegeocode.getLongAddress());
        return riderlocation;
    }

    public RiderAddressComponent findAddressComponent(String s)
    {
        if (getListAddressComponents() == null)
        {
            return null;
        } else
        {
            return (RiderAddressComponent)gki.d(getListAddressComponents(), new gka(s) {

                final String a;
                final RiderLocation b;

                private boolean a(RiderAddressComponent rideraddresscomponent)
                {
                    return rideraddresscomponent.getTypes() != null && rideraddresscomponent.getTypes().contains(a);
                }

                public final boolean apply(Object obj)
                {
                    return a((RiderAddressComponent)obj);
                }

            
            {
                b = RiderLocation.this;
                a = s;
                super();
            }
            }).d();
        }
    }

    public float getAccuracy()
    {
        if (getLocation() != null)
        {
            return getLocation().a();
        } else
        {
            return 0.0F;
        }
    }

    public abstract String getAddress();

    public double getAltitude()
    {
        if (getLocation() != null)
        {
            return getLocation().b();
        } else
        {
            return 0.0D;
        }
    }

    public float getBearing()
    {
        if (getLocation() != null)
        {
            return getLocation().c();
        } else
        {
            return 0.0F;
        }
    }

    public CnLocation getCnLocation()
    {
        CnLocation cnlocation = new CnLocation();
        UberLatLng uberlatlng = getUberLatLng();
        cnlocation.setLatitude(uberlatlng.a());
        cnlocation.setLongitude(uberlatlng.b());
        cnlocation.setId(getId());
        cnlocation.setType(getType());
        cnlocation.setNickname(getNickname());
        cnlocation.setAddress(getAddress());
        cnlocation.setFormattedAddress(getFormattedAddress());
        cnlocation.setRelevance(getRelevance());
        cnlocation.setReference(getReference());
        cnlocation.setReferenceType(getReferenceType());
        if (getListAddressComponents() != null)
        {
            cnlocation.setAddressComponents(new ArrayList(getListAddressComponents()));
        }
        return cnlocation;
    }

    public String getDisplayAddressDescription()
    {
        String s;
        String s1;
        StringBuilder stringbuilder;
        if (getShortFormatted() != null)
        {
            s = getShortFormatted();
        } else
        {
            s = "";
        }
        if (getFormattedAddress() != null)
        {
            s1 = getFormattedAddress();
        } else
        {
            s1 = "";
        }
        stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(getTitle()))
        {
            stringbuilder.append(getTitle());
            stringbuilder.append(" ");
        }
        if (TextUtils.isEmpty(getTitle()) || !s.startsWith(getTitle()))
        {
            stringbuilder.append(s);
        }
        if (stringbuilder.length() == 0 && !TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s1);
        }
        return stringbuilder.toString();
    }

    public String getDisplayAddressWithNickname()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = getNickname();
        String s1 = getDisplayAddressDescription();
        if (!TextUtils.isEmpty(s))
        {
            stringbuilder.append(s);
            stringbuilder.append(" ");
        }
        if (TextUtils.isEmpty(s) || !s1.startsWith(s))
        {
            stringbuilder.append(s1);
        }
        return stringbuilder.toString();
    }

    public abstract String getFormattedAddress();

    public String getFormattedCityAddress()
    {
        StringBuilder stringbuilder;
        RiderAddressComponent rideraddresscomponent1;
        RiderAddressComponent rideraddresscomponent2;
        stringbuilder = new StringBuilder();
        RiderAddressComponent rideraddresscomponent = findAddressComponent("locality");
        rideraddresscomponent1 = findAddressComponent("administrative_area_level_1");
        rideraddresscomponent2 = findAddressComponent("postal_code");
        if (rideraddresscomponent != null && !TextUtils.isEmpty(rideraddresscomponent.getLongName()))
        {
            stringbuilder.append(rideraddresscomponent.getLongName());
        }
        if (rideraddresscomponent1 == null || TextUtils.isEmpty(rideraddresscomponent1.getShortName())) goto _L2; else goto _L1
_L1:
        if (stringbuilder.length() > 0)
        {
            stringbuilder.append(", ");
        }
        stringbuilder.append(rideraddresscomponent1.getShortName());
_L4:
        if (rideraddresscomponent2 != null && !TextUtils.isEmpty(rideraddresscomponent2.getLongName()))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(rideraddresscomponent2.getLongName());
        }
        return stringbuilder.toString();
_L2:
        if (rideraddresscomponent1 != null && !TextUtils.isEmpty(rideraddresscomponent1.getLongName()))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(rideraddresscomponent1.getLongName());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getFormattedStreetAddress()
    {
        StringBuilder stringbuilder = new StringBuilder();
        RiderAddressComponent rideraddresscomponent = findAddressComponent("street_number");
        RiderAddressComponent rideraddresscomponent1 = findAddressComponent("route");
        if (rideraddresscomponent != null && !TextUtils.isEmpty(rideraddresscomponent.getLongName()))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" ");
            }
            stringbuilder.append(rideraddresscomponent.getLongName());
        }
        if (rideraddresscomponent1 != null && !TextUtils.isEmpty(rideraddresscomponent1.getLongName()))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" ");
            }
            stringbuilder.append(rideraddresscomponent1.getLongName());
        }
        return stringbuilder.toString();
    }

    public abstract String getId();

    public abstract List getListAddressComponents();

    public abstract UberLocation getLocation();

    public abstract String getLongAddress();

    public abstract String getNickname();

    public abstract String getReference();

    public abstract String getReferenceType();

    public abstract String getRelevance();

    public abstract String getShortAddress();

    public String getShortFormatted()
    {
        String s;
        if (!TextUtils.isEmpty(getShortAddress()))
        {
            s = getShortAddress();
        } else
        {
            if (!TextUtils.isEmpty(getLongAddress()))
            {
                return getLongAddress();
            }
            if (!TextUtils.isEmpty(getFormattedAddress()))
            {
                return getFormattedAddress();
            }
            if (!TextUtils.isEmpty(getAddress()))
            {
                return getAddress();
            }
            String s1 = getFormattedStreetAddress();
            s = s1;
            if (TextUtils.isEmpty(s1))
            {
                return getFormattedCityAddress();
            }
        }
        return s;
    }

    public float getSpeed()
    {
        if (getLocation() != null)
        {
            return getLocation().d();
        } else
        {
            return 0.0F;
        }
    }

    public abstract String getSubtitle();

    public abstract String getTag();

    public long getTime()
    {
        if (getLocation() != null)
        {
            return getLocation().e();
        } else
        {
            return 0L;
        }
    }

    public abstract String getTitle();

    public abstract String getType();

    public UberLatLng getUberLatLng()
    {
        if (getLocation() != null)
        {
            return getLocation().g();
        } else
        {
            return null;
        }
    }

    public boolean hasReverseGeocodeData()
    {
        return !TextUtils.isEmpty(getId()) || !TextUtils.isEmpty(getTitle()) || !TextUtils.isEmpty(getSubtitle()) || !TextUtils.isEmpty(getNickname()) || !TextUtils.isEmpty(getAddress()) || !TextUtils.isEmpty(getFormattedAddress()) || !TextUtils.isEmpty(getShortAddress()) || !TextUtils.isEmpty(getLongAddress()) || getListAddressComponents() != null && !getListAddressComponents().isEmpty();
    }

    public boolean isDeviceLocation()
    {
        return getType() != null && getType().equals("device");
    }

    public boolean isEqualToLocationSearchResult(LocationSearchResult locationsearchresult)
    {
        if (locationsearchresult != null)
        {
            if (getUberLatLng() != null && getUberLatLng().b(locationsearchresult.getUberLatLng()))
            {
                return true;
            }
            if (getId() != null && gjx.a(getId(), locationsearchresult.getId()))
            {
                return true;
            }
            if (getReference() != null && gjx.a(getReference(), locationsearchresult.getReference()))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isExternalLocation()
    {
        return getType() != null && getType().equals("external");
    }

    public boolean isHotspotLocation()
    {
        return "hotspot".equals(getType());
    }

    public boolean isLocationSearchResult()
    {
        return getType() != null && (getType().equals("backfill") || getType().equals("cache"));
    }

    public abstract RiderLocation setAddress(String s);

    public abstract RiderLocation setFormattedAddress(String s);

    public abstract RiderLocation setId(String s);

    public abstract RiderLocation setListAddressComponents(List list);

    public abstract RiderLocation setLocation(UberLocation uberlocation);

    public abstract RiderLocation setLongAddress(String s);

    public abstract RiderLocation setNickname(String s);

    public abstract RiderLocation setReference(String s);

    public void setReference(String s, String s1)
    {
        setReference(s);
        setReferenceType(s1);
    }

    public abstract RiderLocation setReferenceType(String s);

    public abstract RiderLocation setRelevance(String s);

    public abstract RiderLocation setShortAddress(String s);

    public abstract RiderLocation setSubtitle(String s);

    public abstract RiderLocation setTag(String s);

    public abstract RiderLocation setTitle(String s);

    public abstract RiderLocation setType(String s);

    public void update(LocationSearchResult locationsearchresult)
    {
        setId(locationsearchresult.getId());
        setTag(locationsearchresult.getTag());
        setNickname(locationsearchresult.getNickname());
        setShortAddress(locationsearchresult.getShortAddress());
        setLongAddress(locationsearchresult.getLongAddress());
        setFormattedAddress(locationsearchresult.getFormattedAddress());
        setRelevance(locationsearchresult.getRelevance());
        setReference(locationsearchresult.getReference());
        setReferenceType(locationsearchresult.getType());
        setSubtitle(locationsearchresult.getSubtitle());
        setTitle(locationsearchresult.getTitle());
    }
}
