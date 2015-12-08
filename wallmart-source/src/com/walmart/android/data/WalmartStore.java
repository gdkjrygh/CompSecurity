// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import com.walmart.android.service.cart.Location;
import com.walmartlabs.storelocator.StoreData;

public class WalmartStore extends StoreData
{
    public static class Address
    {

        private String city;
        private String country;
        private String state;
        private String street1;
        private String zip;

        public String getCity()
        {
            return city;
        }

        public String getCountry()
        {
            return country;
        }

        public String getState()
        {
            return state;
        }

        public String getStreet1()
        {
            return street1;
        }

        public String getZip()
        {
            return zip;
        }

        public void setCity(String s)
        {
            city = s;
        }

        public void setCountry(String s)
        {
            country = s;
        }

        public void setState(String s)
        {
            state = s;
        }

        public void setStreet1(String s)
        {
            street1 = s;
        }

        public void setZip(String s)
        {
            zip = s;
        }

        public Address()
        {
        }
    }

    public static class HoursOfOperation
    {

        private String day;
        private String time;

        public String getDay()
        {
            return day;
        }

        public String getTime()
        {
            return time;
        }

        public void setDay(String s)
        {
            day = s;
        }

        public void setTime(String s)
        {
            time = s;
        }

        public HoursOfOperation()
        {
        }
    }

    public static class StoreService
    {

        private HoursOfOperation hoursOfOperation[];
        private String name;
        private String phone;

        public HoursOfOperation[] getHoursOfOperation()
        {
            return hoursOfOperation;
        }

        public String getName()
        {
            return name;
        }

        public String getPhone()
        {
            return phone;
        }

        public boolean matches(String s)
        {
            boolean flag = false;
            String s1 = getName();
            s = s.substring(0, 5);
            if (s1.substring(0, 5).equalsIgnoreCase(s))
            {
                flag = true;
            }
            return flag;
        }

        public void setHoursOfOperation(HoursOfOperation ahoursofoperation[])
        {
            hoursOfOperation = ahoursofoperation;
        }

        public void setName(String s)
        {
            name = s;
        }

        public void setPhone(String s)
        {
            phone = s;
        }

        public StoreService()
        {
        }
    }


    private Address address;
    private boolean availableForS2S;
    private String description;
    private HoursOfOperation hoursOfOperation[];
    private String iD;
    private double latitude;
    private double longitude;
    private String openDate;
    private String phone;
    private String reOpenDate;
    private String stockStatus;
    private boolean storeClosedTemporarily;
    private String storeNumber;
    private boolean storeOpeningSoon;
    private StoreService storeServices[];
    private String storeType;

    public WalmartStore()
    {
    }

    public static String[] getAddressLines(Address address1)
    {
        return (new String[] {
            address1.getStreet1(), String.format("%s, %s %s", new Object[] {
                address1.getCity(), address1.getState(), address1.getZip()
            })
        });
    }

    public static Location getLocation(WalmartStore walmartstore)
    {
        walmartstore = walmartstore.getAddress();
        if (walmartstore != null)
        {
            return new Location(walmartstore.getZip(), walmartstore.getState(), walmartstore.getCountry());
        } else
        {
            return null;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof WalmartStore)
        {
            obj = (WalmartStore)obj;
            return iD.equals(((WalmartStore) (obj)).iD);
        } else
        {
            return false;
        }
    }

    public Address getAddress()
    {
        return address;
    }

    public String getAddressStreetLine()
    {
        if (address != null)
        {
            return address.getStreet1();
        } else
        {
            return null;
        }
    }

    public String getCity()
    {
        if (address != null)
        {
            return address.getCity();
        } else
        {
            return "";
        }
    }

    public String getCityStateZip()
    {
        if (address != null)
        {
            return String.format("%s, %s %s", new Object[] {
                address.getCity(), address.getState(), address.getZip()
            });
        } else
        {
            return null;
        }
    }

    public String getDescription()
    {
        return description;
    }

    public HoursOfOperation[] getHoursOfOperation()
    {
        return hoursOfOperation;
    }

    public String getId()
    {
        return iD;
    }

    public int getIntegerStoreId()
    {
        int i;
        try
        {
            i = Integer.parseInt(iD);
        }
        catch (NumberFormatException numberformatexception)
        {
            return 0;
        }
        return i;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public String getOpenDate()
    {
        return openDate;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getReOpenDate()
    {
        return reOpenDate;
    }

    public String getState()
    {
        if (address != null)
        {
            return address.getState();
        } else
        {
            return "";
        }
    }

    public String getStockStatus()
    {
        return stockStatus;
    }

    public String getStoreNumber()
    {
        return storeNumber;
    }

    public StoreService getStoreService(String s)
    {
        StoreService astoreservice[] = storeServices;
        int j = astoreservice.length;
        for (int i = 0; i < j; i++)
        {
            StoreService storeservice = astoreservice[i];
            if (storeservice.matches(s))
            {
                return storeservice;
            }
        }

        return null;
    }

    public StoreService[] getStoreServices()
    {
        return storeServices;
    }

    public String getStoreType()
    {
        return storeType;
    }

    public boolean hasService(String s)
    {
        return getStoreService(s) != null;
    }

    public int hashCode()
    {
        return Integer.valueOf(iD).intValue();
    }

    public boolean isAvailableForS2S()
    {
        return availableForS2S;
    }

    public boolean isStoreClosedTemporarily()
    {
        return storeClosedTemporarily;
    }

    public boolean isStoreOpeningSoon()
    {
        return storeOpeningSoon;
    }

    public void setAddress(Address address1)
    {
        address = address1;
    }

    public void setAvailableForS2S(boolean flag)
    {
        availableForS2S = flag;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setHoursOfOperation(HoursOfOperation ahoursofoperation[])
    {
        hoursOfOperation = ahoursofoperation;
    }

    public void setLatitude(double d)
    {
        latitude = d;
    }

    public void setLongitude(double d)
    {
        longitude = d;
    }

    public void setOpenDate(String s)
    {
        openDate = s;
    }

    public void setPhone(String s)
    {
        phone = s;
    }

    public void setReOpenDate(String s)
    {
        reOpenDate = s;
    }

    public void setStockStatus(String s)
    {
        stockStatus = s;
    }

    public void setStoreClosedTemporarily(boolean flag)
    {
        storeClosedTemporarily = flag;
    }

    public void setStoreNumber(String s)
    {
        storeNumber = s;
    }

    public void setStoreOpeningSoon(boolean flag)
    {
        storeOpeningSoon = flag;
    }

    public void setStoreServices(StoreService astoreservice[])
    {
        storeServices = astoreservice;
    }

    public void setStoreType(String s)
    {
        storeType = s;
    }

    public void setiD(String s)
    {
        iD = s;
    }
}
