// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripVehicle;
import com.ubercab.rider.realtime.model.VehicleView;
import gqj;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.client.core.model:
//            City, Client, FareSplit, AppConfig, 
//            Trip, Session, SignupRequired, ApiResponse, 
//            FareInfo, HijackVehicleViewInfo, LinkedVehicleViewInfo, SuggestedVehicleView

public class Ping extends gqj
{

    public static final int ERROR_CODE_ARREARS = 430;
    public static final int ERROR_CODE_INSUFFICIENT_BALANCE = 402;
    public static final int ERROR_CODE_INVALID_TOKEN = 403;
    public static final int ERROR_CODE_INVALID_UPFRONT_FARE = 3013;
    public static final int ERROR_CODE_SURGE_WITHOUT_CONFIRM = 5006;
    public static final int ERROR_CODE_TRIP_OUT_OF_POLICY = 460;
    public static final int STATUS_CODE_NOT_ACCEPTABLE = 406;
    ApiResponse apiResponse;
    AppConfig appConfig;
    City city;
    Client client;
    String errorKey;
    List errorObj;
    FareInfo fareInfo;
    FareSplit fareSplit;
    boolean forceUpgrade;
    String forceUpgradeUrl;
    HijackVehicleViewInfo hijackVehicleViewInfo;
    LinkedVehicleViewInfo linkedVehicleViewInfo;
    int mapFittingMobileAppDelayWindowMs;
    Map nearbyVehicles;
    Session session;
    SignupRequired signupRequired;
    SuggestedVehicleView suggestedVehicleView;
    boolean thirdPartyConnected;
    com.ubercab.client.core.model.Trip trip;
    String upfrontFareMessage;

    public Ping()
    {
        city = City.create();
        client = new Client();
        fareSplit = new FareSplit();
        appConfig = AppConfig.create();
        nearbyVehicles = new HashMap();
    }

    private VehicleView getTripVehicleView()
    {
        if (trip == null || city == null)
        {
            return null;
        }
        String s1 = trip.getVehicle().getVehicleViewId();
        String s = s1;
        if (city.findVehicleViewById(s1) == null)
        {
            s = city.getDefaultVehicleViewId();
        }
        return city.findVehicleViewById(s);
    }

    private Ping setHijackVehicleViewInfo(HijackVehicleViewInfo hijackvehicleviewinfo)
    {
        hijackVehicleViewInfo = hijackvehicleviewinfo;
        return this;
    }

    private Ping setSuggestedVehicleView(SuggestedVehicleView suggestedvehicleview)
    {
        suggestedVehicleView = suggestedvehicleview;
        return this;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Ping)obj;
            if (mapFittingMobileAppDelayWindowMs != ((Ping) (obj)).mapFittingMobileAppDelayWindowMs)
            {
                return false;
            }
            if (forceUpgrade != ((Ping) (obj)).forceUpgrade)
            {
                return false;
            }
            if (thirdPartyConnected != ((Ping) (obj)).thirdPartyConnected)
            {
                return false;
            }
            if (forceUpgradeUrl == null ? ((Ping) (obj)).forceUpgradeUrl != null : !forceUpgradeUrl.equals(((Ping) (obj)).forceUpgradeUrl))
            {
                return false;
            }
            if (city == null ? ((Ping) (obj)).city != null : !city.equals(((Ping) (obj)).city))
            {
                return false;
            }
            if (trip == null ? ((Ping) (obj)).trip != null : !trip.equals(((Ping) (obj)).trip))
            {
                return false;
            }
            if (client == null ? ((Ping) (obj)).client != null : !client.equals(((Ping) (obj)).client))
            {
                return false;
            }
            if (fareInfo == null ? ((Ping) (obj)).fareInfo != null : !fareInfo.equals(((Ping) (obj)).fareInfo))
            {
                return false;
            }
            if (upfrontFareMessage == null ? ((Ping) (obj)).upfrontFareMessage != null : !upfrontFareMessage.equals(((Ping) (obj)).upfrontFareMessage))
            {
                return false;
            }
            if (fareSplit == null ? ((Ping) (obj)).fareSplit != null : !fareSplit.equals(((Ping) (obj)).fareSplit))
            {
                return false;
            }
            if (appConfig == null ? ((Ping) (obj)).appConfig != null : !appConfig.equals(((Ping) (obj)).appConfig))
            {
                return false;
            }
            if (nearbyVehicles == null ? ((Ping) (obj)).nearbyVehicles != null : !nearbyVehicles.equals(((Ping) (obj)).nearbyVehicles))
            {
                return false;
            }
            if (session == null ? ((Ping) (obj)).session != null : !session.equals(((Ping) (obj)).session))
            {
                return false;
            }
            if (signupRequired == null ? ((Ping) (obj)).signupRequired != null : !signupRequired.equals(((Ping) (obj)).signupRequired))
            {
                return false;
            }
            if (suggestedVehicleView == null ? ((Ping) (obj)).suggestedVehicleView != null : !suggestedVehicleView.equals(((Ping) (obj)).suggestedVehicleView))
            {
                return false;
            }
            if (apiResponse == null ? ((Ping) (obj)).apiResponse != null : !apiResponse.equals(((Ping) (obj)).apiResponse))
            {
                return false;
            }
            if (errorKey == null ? ((Ping) (obj)).errorKey != null : !errorKey.equals(((Ping) (obj)).errorKey))
            {
                return false;
            }
            if (errorObj == null ? ((Ping) (obj)).errorObj != null : !errorObj.equals(((Ping) (obj)).errorObj))
            {
                return false;
            }
            if (linkedVehicleViewInfo == null ? ((Ping) (obj)).linkedVehicleViewInfo != null : !linkedVehicleViewInfo.equals(((Ping) (obj)).linkedVehicleViewInfo))
            {
                return false;
            }
            if (hijackVehicleViewInfo == null ? ((Ping) (obj)).hijackVehicleViewInfo != null : !hijackVehicleViewInfo.equals(((Ping) (obj)).hijackVehicleViewInfo))
            {
                return false;
            }
            if (suggestedVehicleView == null ? ((Ping) (obj)).suggestedVehicleView != null : !suggestedVehicleView.equals(((Ping) (obj)).suggestedVehicleView))
            {
                return false;
            }
        }
        return true;
    }

    public ApiResponse getApiResponse()
    {
        return apiResponse;
    }

    public AppConfig getAppConfig()
    {
        return appConfig;
    }

    public City getCity()
    {
        return city;
    }

    public Client getClient()
    {
        return client;
    }

    public String getErrorKey()
    {
        return errorKey;
    }

    public List getErrorObj()
    {
        return errorObj;
    }

    public FareInfo getFareInfo()
    {
        return fareInfo;
    }

    public FareSplit getFareSplit()
    {
        return fareSplit;
    }

    public String getForceUpgradeUrl()
    {
        return forceUpgradeUrl;
    }

    public HijackVehicleViewInfo getHijackVehicleViewInfo()
    {
        return hijackVehicleViewInfo;
    }

    public LinkedVehicleViewInfo getLinkedVehicleViewInfo()
    {
        return linkedVehicleViewInfo;
    }

    public int getMapFittingMobileAppDelayWindowMs()
    {
        return mapFittingMobileAppDelayWindowMs;
    }

    public Map getNearbyVehicles()
    {
        if (nearbyVehicles != null)
        {
            return new HashMap(nearbyVehicles);
        } else
        {
            return null;
        }
    }

    public Session getSession()
    {
        return session;
    }

    public Map getSignupFieldsRequired()
    {
        if (signupRequired == null)
        {
            return null;
        } else
        {
            return signupRequired.getFields();
        }
    }

    public SuggestedVehicleView getSuggestedVehicleView()
    {
        return suggestedVehicleView;
    }

    public boolean getThirdPartyConnected()
    {
        return thirdPartyConnected;
    }

    public Trip getTrip()
    {
        return trip;
    }

    public String getUpfrontFareMessage()
    {
        return upfrontFareMessage;
    }

    public int hashCode()
    {
        int j3 = 1;
        int k4 = 0;
        int l4 = mapFittingMobileAppDelayWindowMs;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int k3;
        int l3;
        int i4;
        int j4;
        if (forceUpgrade)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (forceUpgradeUrl != null)
        {
            j = forceUpgradeUrl.hashCode();
        } else
        {
            j = 0;
        }
        if (city != null)
        {
            k = city.hashCode();
        } else
        {
            k = 0;
        }
        if (trip != null)
        {
            l = trip.hashCode();
        } else
        {
            l = 0;
        }
        if (client != null)
        {
            i1 = client.hashCode();
        } else
        {
            i1 = 0;
        }
        if (fareInfo != null)
        {
            j1 = fareInfo.hashCode();
        } else
        {
            j1 = 0;
        }
        if (upfrontFareMessage != null)
        {
            k1 = upfrontFareMessage.hashCode();
        } else
        {
            k1 = 0;
        }
        if (fareSplit != null)
        {
            l1 = fareSplit.hashCode();
        } else
        {
            l1 = 0;
        }
        if (appConfig != null)
        {
            i2 = appConfig.hashCode();
        } else
        {
            i2 = 0;
        }
        if (nearbyVehicles != null)
        {
            j2 = nearbyVehicles.hashCode();
        } else
        {
            j2 = 0;
        }
        if (session != null)
        {
            k2 = session.hashCode();
        } else
        {
            k2 = 0;
        }
        if (signupRequired != null)
        {
            l2 = signupRequired.hashCode();
        } else
        {
            l2 = 0;
        }
        if (suggestedVehicleView != null)
        {
            i3 = suggestedVehicleView.hashCode();
        } else
        {
            i3 = 0;
        }
        if (!thirdPartyConnected)
        {
            j3 = 0;
        }
        if (apiResponse != null)
        {
            k3 = apiResponse.hashCode();
        } else
        {
            k3 = 0;
        }
        if (errorKey != null)
        {
            l3 = errorKey.hashCode();
        } else
        {
            l3 = 0;
        }
        if (errorObj != null)
        {
            i4 = errorObj.hashCode();
        } else
        {
            i4 = 0;
        }
        if (linkedVehicleViewInfo != null)
        {
            j4 = linkedVehicleViewInfo.hashCode();
        } else
        {
            j4 = 0;
        }
        if (hijackVehicleViewInfo != null)
        {
            k4 = hijackVehicleViewInfo.hashCode();
        }
        return (j4 + (i4 + (l3 + (k3 + ((i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + l4 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j3) * 31) * 31) * 31) * 31) * 31 + k4;
    }

    public boolean isForceUpgrade()
    {
        return forceUpgrade;
    }
}
