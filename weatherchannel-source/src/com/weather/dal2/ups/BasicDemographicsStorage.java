// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.ups;

import com.weather.dal2.DalPrefs;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.TwcBus;
import com.weather.util.prefs.Prefs;

// Referenced classes of package com.weather.dal2.ups:
//            DemographicsStorage, Demographics

public class BasicDemographicsStorage
    implements DemographicsStorage
{

    private static final BasicDemographicsStorage INSTANCE = new BasicDemographicsStorage();
    private final Prefs prefs = DalPrefs.getInstance();

    private BasicDemographicsStorage()
    {
    }

    public static BasicDemographicsStorage getInstance()
    {
        return INSTANCE;
    }

    private String getString(com.weather.dal2.DalPrefs.Keys keys)
    {
        if (prefs.contains(keys))
        {
            return prefs.getString(keys, "");
        } else
        {
            return null;
        }
    }

    private void post(Demographics demographics)
    {
        DataAccessLayer.BUS.post(demographics);
    }

    public Demographics getDemographics()
    {
        String s = getString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_USERNAME);
        String s1 = getString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_AGE_RANGE);
        return new Demographics(s, getString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_DOB), s1, getString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_GENDER), getString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_EMAIL), getString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_CABLE_PROVIDER));
    }

    public void post()
    {
        post(getDemographics());
    }

    public void write(Demographics demographics)
    {
        prefs.putString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_USERNAME, demographics.getUserName());
        prefs.putString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_AGE_RANGE, demographics.getAgeRange());
        prefs.putString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_DOB, demographics.getDateOfBirth());
        prefs.putString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_GENDER, demographics.getGender());
        prefs.putString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_EMAIL, demographics.getTwcAccountEmail());
        prefs.putString(com.weather.dal2.DalPrefs.Keys.DEMOGRAPHICS_CABLE_PROVIDER, demographics.getCableProvider());
        post(demographics);
    }

}
