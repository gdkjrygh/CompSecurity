// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.text.TextUtils;
import com.ubercab.rider.realtime.model.TripVehicleType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.ubercab.client.core.model:
//            TripVehicleType

public class TripVehicle
    implements com.ubercab.rider.realtime.model.TripVehicle
{

    String exteriorColor;
    String interiorColor;
    String licensePlate;
    Integer licensePlateCountryId;
    String licensePlateState;
    List pictureImages;
    String uuid;
    List vehiclePath;
    com.ubercab.client.core.model.TripVehicleType vehicleType;
    String vehicleViewId;
    Integer year;

    public TripVehicle()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TripVehicle)obj;
            if (exteriorColor == null ? ((TripVehicle) (obj)).exteriorColor != null : !exteriorColor.equals(((TripVehicle) (obj)).exteriorColor))
            {
                return false;
            }
            if (interiorColor == null ? ((TripVehicle) (obj)).interiorColor != null : !interiorColor.equals(((TripVehicle) (obj)).interiorColor))
            {
                return false;
            }
            if (licensePlate == null ? ((TripVehicle) (obj)).licensePlate != null : !licensePlate.equals(((TripVehicle) (obj)).licensePlate))
            {
                return false;
            }
            if (licensePlateCountryId == null ? ((TripVehicle) (obj)).licensePlateCountryId != null : !licensePlateCountryId.equals(((TripVehicle) (obj)).licensePlateCountryId))
            {
                return false;
            }
            if (licensePlateState == null ? ((TripVehicle) (obj)).licensePlateState != null : !licensePlateState.equals(((TripVehicle) (obj)).licensePlateState))
            {
                return false;
            }
            if (pictureImages == null ? ((TripVehicle) (obj)).pictureImages != null : !pictureImages.equals(((TripVehicle) (obj)).pictureImages))
            {
                return false;
            }
            if (uuid == null ? ((TripVehicle) (obj)).uuid != null : !uuid.equals(((TripVehicle) (obj)).uuid))
            {
                return false;
            }
            if (vehiclePath == null ? ((TripVehicle) (obj)).vehiclePath != null : !vehiclePath.equals(((TripVehicle) (obj)).vehiclePath))
            {
                return false;
            }
            if (vehicleType == null ? ((TripVehicle) (obj)).vehicleType != null : !vehicleType.equals(((TripVehicle) (obj)).vehicleType))
            {
                return false;
            }
            if (vehicleViewId == null ? ((TripVehicle) (obj)).vehicleViewId != null : !vehicleViewId.equals(((TripVehicle) (obj)).vehicleViewId))
            {
                return false;
            }
            if (year == null ? ((TripVehicle) (obj)).year != null : !year.equals(((TripVehicle) (obj)).year))
            {
                return false;
            }
        }
        return true;
    }

    public String getExteriorColor()
    {
        return exteriorColor;
    }

    public String getFormattedMake()
    {
        if (vehicleType == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(vehicleType.getMake()))
        {
            stringbuilder.append(vehicleType.getMake());
            stringbuilder.append(" ");
        }
        if (!TextUtils.isEmpty(vehicleType.getMake()) && !TextUtils.isEmpty(vehicleType.getModel()) && !vehicleType.getModel().equals(vehicleType.getMake()))
        {
            stringbuilder.append(vehicleType.getModel());
        }
        return stringbuilder.toString();
    }

    public String getInteriorColor()
    {
        return interiorColor;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public int getLicensePlateCountryId()
    {
        if (licensePlateCountryId == null)
        {
            return 0;
        } else
        {
            return licensePlateCountryId.intValue();
        }
    }

    public String getLicensePlateFormatted()
    {
        if (TextUtils.isEmpty(licensePlate))
        {
            return "";
        } else
        {
            return licensePlate.toUpperCase(Locale.getDefault());
        }
    }

    public String getLicensePlateState()
    {
        return licensePlateState;
    }

    public List getPictureImages()
    {
        if (pictureImages == null)
        {
            return null;
        } else
        {
            return new ArrayList(pictureImages);
        }
    }

    public String getUuid()
    {
        return uuid;
    }

    public List getVehiclePath()
    {
        if (vehiclePath == null)
        {
            return null;
        } else
        {
            return new ArrayList(vehiclePath);
        }
    }

    public TripVehicleType getVehicleType()
    {
        return vehicleType;
    }

    public String getVehicleViewId()
    {
        return vehicleViewId;
    }

    public int getYear()
    {
        if (year == null)
        {
            return 0;
        } else
        {
            return year.intValue();
        }
    }

    public int hashCode()
    {
        int k2 = 0;
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
        if (year != null)
        {
            i = year.hashCode();
        } else
        {
            i = 0;
        }
        if (licensePlateCountryId != null)
        {
            j = licensePlateCountryId.hashCode();
        } else
        {
            j = 0;
        }
        if (uuid != null)
        {
            k = uuid.hashCode();
        } else
        {
            k = 0;
        }
        if (licensePlate != null)
        {
            l = licensePlate.hashCode();
        } else
        {
            l = 0;
        }
        if (vehicleViewId != null)
        {
            i1 = vehicleViewId.hashCode();
        } else
        {
            i1 = 0;
        }
        if (exteriorColor != null)
        {
            j1 = exteriorColor.hashCode();
        } else
        {
            j1 = 0;
        }
        if (interiorColor != null)
        {
            k1 = interiorColor.hashCode();
        } else
        {
            k1 = 0;
        }
        if (licensePlateState != null)
        {
            l1 = licensePlateState.hashCode();
        } else
        {
            l1 = 0;
        }
        if (pictureImages != null)
        {
            i2 = pictureImages.hashCode();
        } else
        {
            i2 = 0;
        }
        if (vehiclePath != null)
        {
            j2 = vehiclePath.hashCode();
        } else
        {
            j2 = 0;
        }
        if (vehicleType != null)
        {
            k2 = vehicleType.hashCode();
        }
        return (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k2;
    }
}
